package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.Provinces;
import com.springboot.mybatisplus.mapper.ProvincesMapper;
import com.springboot.mybatisplus.service.IProvincesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 省份信息表 服务实现类
 * </p>
 *
 * @author Antonio
 * @since 2019-06-05
 */
@Service
public class ProvincesServiceImpl extends ServiceImpl<ProvincesMapper, Provinces> implements IProvincesService {

}
