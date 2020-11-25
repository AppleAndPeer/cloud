package com.me.test.goods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "OWXQYH.T_AWESOME_SHOP_GOODS")
@JsonIgnoreProperties(value = { "description", "goodsParams" })
public class Order {
    private String id;

    private String goodsName;

    private Integer bill;

    private Integer store;

    private String description;

    private String sellerId;

    private String goodsParams;
}
