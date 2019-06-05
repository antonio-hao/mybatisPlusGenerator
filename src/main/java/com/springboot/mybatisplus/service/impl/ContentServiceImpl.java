package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.Content;
import com.springboot.mybatisplus.mapper.ContentMapper;
import com.springboot.mybatisplus.service.IContentService;
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
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements IContentService {

}
