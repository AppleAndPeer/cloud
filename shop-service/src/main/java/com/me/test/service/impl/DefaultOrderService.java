package com.me.test.service.impl;

import com.me.test.goods.Order;
import com.me.test.repository.OrderMapper;
import com.me.test.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.WeekendSqls;

import java.util.List;

public class DefaultOrderService implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> getOrders() {
//        return null;
//        Example example = Example.builder(WeekendSqls.<Order>custom()
//            .andEqualTo(Or)
//        )
//        return orderMapper.selectByExample();
        return orderMapper.selectAll();
    }


}
