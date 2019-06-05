package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.Seller;
import com.springboot.mybatisplus.mapper.SellerMapper;
import com.springboot.mybatisplus.service.ISellerService;
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
public class SellerServiceImpl extends ServiceImpl<SellerMapper, Seller> implements ISellerService {

}
