package ru.itis.kpop.service;

import ru.itis.kpop.forms.PopularMerch;
import ru.itis.kpop.forms.UniqMerch;
import ru.itis.kpop.models.Merch;

import java.util.List;

public interface BacketService {
    List<Merch> getAll();
    Merch getMerchById(Long id);
    void addMerchInBacketByUserId(Merch merch, Long user_id);

    List<Merch> getMerchsByUserId(Long user_id);

    List<UniqMerch> getUniqMerch (Long user_id);

    List<PopularMerch> getPopularMerch();

    List<Merch> getMerchById(List<PopularMerch> popularMerches);

    List<UniqMerch> getUniqMerchById(List<PopularMerch> popularMerches);

}
