package com.maur.shopcart.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@Data
@RequiredArgsConstructor
@RedisHash("Item")
public class Item {
    private Integer productId;
    private Integer amount;
}
