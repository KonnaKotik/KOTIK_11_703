package ru.itis.kpop.servlets;

import lombok.SneakyThrows;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itis.kpop.forms.SignInForm;
import ru.itis.kpop.repositories.AuthRepository;
import ru.itis.kpop.repositories.AuthRepositoryImpl;
import ru.itis.kpop.repositories.UsersRepository;
import ru.itis.kpop.repositories.UsersRepositoryJdbcTemplateImpl;
import ru.itis.kpop.service.UsersService;
import ru.itis.kpop.service.UsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


@WebServlet("/signIn")
public class SingInServlet extends HttpServlet {
    private UsersService usersService;
    private Connection connection;
    private Statement statement;

    private static final String URL = "jdbc:postgresql://localhost:5432/k_popm";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    @Override
    @SneakyThrows
    public void init() throws ServletException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/k_popm");
        UsersRepository usersRepository = new UsersRepositoryJdbcTemplateImpl(dataSource);
        AuthRepository authRepository = new AuthRepositoryImpl(dataSource);
        usersService = new UsersServiceImpl(usersRepository, authRepository);
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
        statement = connection.createStatement();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("singIn.jsp").forward(req, resp);
    }

    @Override
    @SneakyThrows
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SignInForm form = SignInForm.builder()
                .email(req.getParameter("email"))
                .password(req.getParameter("password"))
                .build();

        String cookieValue = usersService.signIn(form);
        if (cookieValue != null) {
            Cookie auth = new Cookie("auth", cookieValue);
         //   auth.setMaxAge(50*60*24);
            int cookieId = 0;
            ResultSet set = statement.executeQuery("SELECT max(id) as id FROM auth");
            set.next();
            cookieId = set.getInt("id");
            Cookie cookie = new Cookie("auth_basket_id", "" + cookieId);
            resp.addCookie(auth);
            resp.sendRedirect("/Home");
        } else {
            resp.sendRedirect("/signIn");
        }
    }
}
