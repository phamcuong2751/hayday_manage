package com.games.hayday.manage.service.implementation;

import com.games.hayday.manage.constant.HttpStatusCode;
import com.games.hayday.manage.entity.GoodsEntity;
import com.games.hayday.manage.payload.request.goods.GoodUpdateRequest;
import com.games.hayday.manage.payload.request.goods.GoodsInsertRequest;
import com.games.hayday.manage.payload.response.BaseResponse;
import com.games.hayday.manage.payload.response.BaseResponseBuilder;
import com.games.hayday.manage.repository.GoodsRepository;
import com.games.hayday.manage.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService implements IGoodsService {
    private final GoodsRepository goodsRepository;

    public GoodsService(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    @Override
    public BaseResponse getAll() {
        List<GoodsEntity> goods = goodsRepository.findAll();
        return BaseResponseBuilder.build(HttpStatusCode.OK.code, "get ok", goods);
    }

    @Override
    public BaseResponse search(String key) {
        return null;
    }

    @Override
    public BaseResponse insert(GoodsInsertRequest goods) {
        return null;
    }

    @Override
    public BaseResponse update(GoodUpdateRequest goods) {
        return null;
    }

    @Override
    public BaseResponse delete(Long id) {
        return null;
    }
}
