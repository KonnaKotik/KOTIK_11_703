package ru.itis.kpop.repositories;

import ru.itis.kpop.models.Auth;

public interface AuthRepository extends CrudRepository<Auth> {

    Auth findByCookieValue(String cookieValue);
}
