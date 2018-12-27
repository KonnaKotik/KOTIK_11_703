package ru.itis.kpop.servlets;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itis.kpop.models.Merch;
import ru.itis.kpop.repositories.*;
import ru.itis.kpop.service.BacketService;
import ru.itis.kpop.service.BacketServiceImpl;
import ru.itis.kpop.service.UsersService;
import ru.itis.kpop.service.UsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/album")
public class AlbumServlet extends HttpServlet {

    private BacketService backetService;
    private UsersService usersService;


    private List<Integer> ids = new ArrayList<>();
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookies[] = request.getCookies();
        String cook = "";

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("auth")) {
                    cook = cookie.getValue();
                }
            }
        }

        Long user_id = usersService.getUserByCookie(cook);
        try{
            Long merch_id = Long.parseLong(request.getParameter("merchId"));
            System.out.println(merch_id);
            Merch merch = Merch.builder()
                    .id(merch_id)
                    .build();
            backetService.addMerchInBacketByUserId(merch, user_id);

        }catch (NumberFormatException e){


        }


        ids.add(Integer.parseInt(request.getParameter("merchId")));
        String json = objectMapper.writeValueAsString(ids);
        response.setContentType("application/json");
        response.getWriter().write(json);
    }


    @Override
    public void init() throws ServletException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/k_popm");

        MerchRepository merchRepository = new MerchRepositoryImpl(dataSource);
        BasketRepository basketRepository = new BasketRepositoryImpl(dataSource);
        UsersRepository usersRepository = new UsersRepositoryJdbcTemplateImpl(dataSource);
        backetService = new BacketServiceImpl(basketRepository, merchRepository);
        AuthRepository authRepository = new AuthRepositoryImpl(dataSource);
        usersService = new UsersServiceImpl(usersRepository, authRepository);
    }

    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        request.getRequestDispatcher("album.jsp").forward( request, response);

    }
}
