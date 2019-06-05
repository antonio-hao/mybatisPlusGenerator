package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.Cities;
import com.springboot.mybatisplus.mapper.CitiesMapper;
import com.springboot.mybatisplus.service.ICitiesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 行政区域地州市信息表 服务实现类
 * </p>
 *
 * @author Antonio
 * @since 2019-06-05
 */
@Service
public class CitiesServiceImpl extends ServiceImpl<CitiesMapper, Cities> implements ICitiesService {

}
