package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.ItemCat;
import com.springboot.mybatisplus.mapper.ItemCatMapper;
import com.springboot.mybatisplus.service.IItemCatService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品类目 服务实现类
 * </p>
 *
 * @author Antonio
 * @since 2019-06-05
 */
@Service
public class ItemCatServiceImpl extends ServiceImpl<ItemCatMapper, ItemCat> implements IItemCatService {

}
