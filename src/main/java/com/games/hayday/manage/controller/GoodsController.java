package com.games.hayday.manage.controller;

import com.games.hayday.manage.constant.HttpStatusCode;
import com.games.hayday.manage.payload.response.BaseResponse;
import com.games.hayday.manage.payload.response.BaseResponseBuilder;
import com.games.hayday.manage.service.implementation.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/goods")
public class GoodsController {
    private final GoodsService goodsService;

    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @GetMapping()
    public ResponseEntity<BaseResponse> getAll() {
        try {
            BaseResponse response = goodsService.getAll();
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(BaseResponseBuilder.build(HttpStatusCode.INTERNAL_SERVER_ERROR.code, e.getMessage()), HttpStatus.OK);
        }
    }
}
