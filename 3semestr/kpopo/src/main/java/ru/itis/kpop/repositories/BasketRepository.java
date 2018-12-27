package ru.itis.kpop.repositories;

import ru.itis.kpop.forms.PopularMerch;
import ru.itis.kpop.forms.UniqMerch;
import ru.itis.kpop.models.Basket;
import ru.itis.kpop.models.Merch;

import java.util.List;


public interface BasketRepository extends CrudRepository<Basket> {

    void addMerchInBasket(Merch merch, Long userId);

    Merch findInBuscketByIn(Long id);

    List<Merch> userMerch(Long id);


    List<Merch> getMerchsByUserId(Long user_id);

    List<UniqMerch> getCoutMarch(Long user_id);

    void deleteMerchInBasket(Merch merch, Long userId);

    List<PopularMerch> getPopularMerch();

    List<Merch> getMerchById(List<PopularMerch> popularMerch);

    List<UniqMerch> getUniqMerchById(List<PopularMerch> popularMerches);
}
