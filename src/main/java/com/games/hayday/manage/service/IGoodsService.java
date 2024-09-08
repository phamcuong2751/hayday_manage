package com.games.hayday.manage.service;

import com.games.hayday.manage.payload.request.goods.*;
import com.games.hayday.manage.payload.response.BaseResponse;

public interface IGoodsService {
    BaseResponse getAll();
    BaseResponse search(String key);
    BaseResponse insert(GoodsInsertRequest goods);
    BaseResponse update(GoodUpdateRequest goods);
    BaseResponse delete(Long id);
}
