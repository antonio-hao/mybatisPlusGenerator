package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.Goods;
import com.springboot.mybatisplus.mapper.GoodsMapper;
import com.springboot.mybatisplus.service.IGoodsService;
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
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
