package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.OrderItem;
import com.springboot.mybatisplus.mapper.OrderItemMapper;
import com.springboot.mybatisplus.service.IOrderItemService;
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
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

}
