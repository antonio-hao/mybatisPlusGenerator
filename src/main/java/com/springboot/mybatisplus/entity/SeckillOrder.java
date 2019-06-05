package com.springboot.mybatisplus.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Antonio
 * @since 2019-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_seckill_order")
public class SeckillOrder extends Model<SeckillOrder> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("id")
    private Long id;

    /**
     * 秒杀商品ID
     */
    @TableField("seckill_id")
    private Long seckillId;

    /**
     * 支付金额
     */
    @TableField("money")
    private BigDecimal money;

    /**
     * 用户
     */
    @TableField("user_id")
    private String userId;

    /**
     * 商家
     */
    @TableField("seller_id")
    private String sellerId;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 支付时间
     */
    @TableField("pay_time")
    private LocalDateTime payTime;

    /**
     * 状态
     */
    @TableField("status")
    private String status;

    /**
     * 收货人地址
     */
    @TableField("receiver_address")
    private String receiverAddress;

    /**
     * 收货人电话
     */
    @TableField("receiver_mobile")
    private String receiverMobile;

    /**
     * 收货人
     */
    @TableField("receiver")
    private String receiver;

    /**
     * 交易流水
     */
    @TableField("transaction_id")
    private String transactionId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
