package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.Specification;
import com.springboot.mybatisplus.mapper.SpecificationMapper;
import com.springboot.mybatisplus.service.ISpecificationService;
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
public class SpecificationServiceImpl extends ServiceImpl<SpecificationMapper, Specification> implements ISpecificationService {

}
