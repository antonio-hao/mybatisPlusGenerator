package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.Areas;
import com.springboot.mybatisplus.mapper.AreasMapper;
import com.springboot.mybatisplus.service.IAreasService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 行政区域县区信息表 服务实现类
 * </p>
 *
 * @author Antonio
 * @since 2019-06-05
 */
@Service
public class AreasServiceImpl extends ServiceImpl<AreasMapper, Areas> implements IAreasService {

}
