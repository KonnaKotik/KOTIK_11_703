package ru.itis.kpop.repositories;

import ru.itis.kpop.models.User;

public interface UsersRepository extends CrudRepository<User> {

    User findOneByEmail (String email);

    Long finByCookie(String cookie);

    void createNewBasket(String email);
}
