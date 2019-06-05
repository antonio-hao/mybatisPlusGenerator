package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.Brand;
import com.springboot.mybatisplus.mapper.BrandMapper;
import com.springboot.mybatisplus.service.IBrandService;
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
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
