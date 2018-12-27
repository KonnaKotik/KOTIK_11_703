package ru.itis.kpop.filter;


import lombok.SneakyThrows;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itis.kpop.repositories.AuthRepository;
import ru.itis.kpop.repositories.AuthRepositoryImpl;
import ru.itis.kpop.repositories.UsersRepository;
import ru.itis.kpop.repositories.UsersRepositoryJdbcTemplateImpl;
import ru.itis.kpop.service.UsersService;
import ru.itis.kpop.service.UsersServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebFilter("/basket")
public class AuthFilter implements Filter {
    private UsersService usersService;

    @SneakyThrows
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
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
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        Cookie cookies[] = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("auth")) {
                    if (usersService.isExistByCookie(cookie.getValue())) {
                        chain.doFilter(request, response);
                    }
                }
            }
            response.sendRedirect("/signIn");
            return;
        }
        response.sendRedirect("/signIn");
        return;
    }

    @Override
    public void destroy() {

    }

}
