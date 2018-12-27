package ru.itis.kpop.repositories;

import ru.itis.kpop.models.Merch;

import java.util.List;

public interface MerchRepository extends CrudRepository<Merch> {

    List<Merch> getAll();
}
