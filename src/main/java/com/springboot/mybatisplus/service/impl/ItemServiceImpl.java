package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.Item;
import com.springboot.mybatisplus.mapper.ItemMapper;
import com.springboot.mybatisplus.service.IItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author Antonio
 * @since 2019-06-05
 */
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements IItemService {

}
