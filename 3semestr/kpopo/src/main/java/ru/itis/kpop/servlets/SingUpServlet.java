package ru.itis.kpop.servlets;

import lombok.SneakyThrows;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itis.kpop.forms.SignUpForm;
import ru.itis.kpop.repositories.AuthRepository;
import ru.itis.kpop.repositories.AuthRepositoryImpl;
import ru.itis.kpop.repositories.UsersRepository;
import ru.itis.kpop.repositories.UsersRepositoryJdbcTemplateImpl;
import ru.itis.kpop.service.UsersService;
import ru.itis.kpop.service.UsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/signUp")

public class SingUpServlet extends HttpServlet {
    private UsersService usersService;

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
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("singUp.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SignUpForm form = SignUpForm.builder()
                .email(request.getParameter("email"))
                .password(request.getParameter("password"))
                .firstName(request.getParameter("firstName"))
                .lastName(request.getParameter("lastName"))
                .build();

        usersService.signUp(form);

        response.sendRedirect("/signIn");
    }
}
