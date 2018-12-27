package ru.itis.kpop.service;

import ru.itis.kpop.forms.SignInForm;
import ru.itis.kpop.forms.SignUpForm;
import ru.itis.kpop.models.User;


public interface UsersService {

    void signUp(SignUpForm form);

    String signIn(SignInForm form);

    boolean isExistByCookie(String cookieValue);

    Long getUserByCookie(String cookie);




}
