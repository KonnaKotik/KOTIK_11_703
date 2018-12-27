package ru.itis.kpop.service;

import ru.itis.kpop.forms.PopularMerch;
import ru.itis.kpop.forms.UniqMerch;
import ru.itis.kpop.models.Merch;
import ru.itis.kpop.repositories.BasketRepository;
import ru.itis.kpop.repositories.MerchRepository;

import java.util.List;

public class BacketServiceImpl implements BacketService {

    private BasketRepository basketRepository;
    private MerchRepository merchRepository;
    public BacketServiceImpl(BasketRepository basketRepository, MerchRepository merchRepository) {
        this.basketRepository = basketRepository;
        this.merchRepository = merchRepository;
    }
    @Override
    public List<Merch> getAll() {
        return merchRepository.getAll();
    }

    @Override
    public Merch getMerchById(Long id) {
        return null;
    }

    @Override
    public void addMerchInBacketByUserId(Merch merch, Long user_id) {
        basketRepository.addMerchInBasket(merch, user_id);
    }

    @Override
    public List<Merch> getMerchsByUserId(Long user_id) {
        return basketRepository.getMerchsByUserId(user_id);
    }

    @Override
    public List<UniqMerch> getUniqMerch(Long user_id) {
        return basketRepository.getCoutMarch(user_id);
    }

    @Override
    public List<PopularMerch> getPopularMerch() {
        return basketRepository.getPopularMerch();
    }

    @Override
    public List<Merch> getMerchById(List<PopularMerch> popularMerches) {
        return basketRepository.getMerchById(popularMerches);
    }

    @Override
    public List<UniqMerch> getUniqMerchById(List<PopularMerch> popularMerches) {
        return basketRepository.getUniqMerchById(popularMerches);
    }
}
