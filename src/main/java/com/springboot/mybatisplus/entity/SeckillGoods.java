package com.springboot.mybatisplus.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("tb_seckill_goods")
public class SeckillGoods extends Model<SeckillGoods> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * spu ID
     */
    @TableField("goods_id")
    private Long goodsId;

    /**
     * sku ID
     */
    @TableField("item_id")
    private Long itemId;

    /**
     * 标题
     */
    @TableField("title")
    private String title;

    /**
     * 商品图片
     */
    @TableField("small_pic")
    private String smallPic;

    /**
     * 原价格
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * 秒杀价格
     */
    @TableField("cost_price")
    private BigDecimal costPrice;

    /**
     * 商家ID
     */
    @TableField("seller_id")
    private String sellerId;

    /**
     * 添加日期
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 审核日期
     */
    @TableField("check_time")
    private LocalDateTime checkTime;

    /**
     * 审核状态
     */
    @TableField("status")
    private String status;

    /**
     * 开始时间
     */
    @TableField("start_time")
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    @TableField("end_time")
    private LocalDateTime endTime;

    /**
     * 秒杀商品数
     */
    @TableField("num")
    private Integer num;

    /**
     * 剩余库存数
     */
    @TableField("stock_count")
    private Integer stockCount;

    /**
     * 描述
     */
    @TableField("introduction")
    private String introduction;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
