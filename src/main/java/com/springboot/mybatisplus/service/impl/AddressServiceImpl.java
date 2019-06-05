package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.Address;
import com.springboot.mybatisplus.mapper.AddressMapper;
import com.springboot.mybatisplus.service.IAddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
