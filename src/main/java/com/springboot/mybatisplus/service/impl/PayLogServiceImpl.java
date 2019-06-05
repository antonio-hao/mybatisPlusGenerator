package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.PayLog;
import com.springboot.mybatisplus.mapper.PayLogMapper;
import com.springboot.mybatisplus.service.IPayLogService;
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
public class PayLogServiceImpl extends ServiceImpl<PayLogMapper, PayLog> implements IPayLogService {

}
