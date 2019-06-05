package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.ContentCategory;
import com.springboot.mybatisplus.mapper.ContentCategoryMapper;
import com.springboot.mybatisplus.service.IContentCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 内容分类 服务实现类
 * </p>
 *
 * @author Antonio
 * @since 2019-06-05
 */
@Service
public class ContentCategoryServiceImpl extends ServiceImpl<ContentCategoryMapper, ContentCategory> implements IContentCategoryService {

}