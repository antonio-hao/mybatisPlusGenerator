package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.Order;
import com.springboot.mybatisplus.mapper.OrderMapper;
import com.springboot.mybatisplus.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Antonio
 * @since 2019-06-05
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
