package ru.itis.kpop.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.itis.kpop.forms.SignInForm;
import ru.itis.kpop.forms.SignUpForm;
import ru.itis.kpop.models.Auth;
import ru.itis.kpop.models.Merch;
import ru.itis.kpop.models.User;
import ru.itis.kpop.repositories.AuthRepository;
import ru.itis.kpop.repositories.UsersRepository;

import java.util.UUID;


public class UsersServiceImpl implements UsersService {

    private PasswordEncoder encoder;

    private UsersRepository usersRepository;
    private AuthRepository authRepository;

    public UsersServiceImpl(UsersRepository usersRepository, AuthRepository authRepository) {
        this.usersRepository = usersRepository;
        this.authRepository = authRepository;
        this.encoder = new BCryptPasswordEncoder();
    }

    @Override
    public void signUp(SignUpForm form) {
        User user = User.builder()
                .email(form.getEmail())
                .hashPassword(encoder.encode(form.getPassword()))
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
                .build();

        usersRepository.save(user);
        usersRepository.createNewBasket(user.getEmail());
    }

    @Override
    public String signIn(SignInForm form) {
        User user = usersRepository.findOneByEmail(form.getEmail());

        if (user != null && encoder.matches(form.getPassword(), user.getHashPassword())) {
            String cookieValue = UUID.randomUUID().toString();

            Auth auth = Auth.builder()
                    .user_id(user.getId())
                    .cookieValue(cookieValue)
                    .build();

            authRepository.save(auth);

            return cookieValue;
        }
        return null;
    }

    @Override
    public boolean isExistByCookie(String cookieValue) {
        if (authRepository.findByCookieValue(cookieValue) != null) {
            return true;
        }
        return false;
    }

    @Override
    public Long getUserByCookie(String cookie) {
        return usersRepository.finByCookie(cookie);
    }



}

