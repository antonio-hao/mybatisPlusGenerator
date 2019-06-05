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
 * 商品表
 * </p>
 *
 * @author Antonio
 * @since 2019-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_item")
public class Item extends Model<Item> {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id，同时也是商品编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品标题
     */
    @TableField("title")
    private String title;

    /**
     * 商品卖点
     */
    @TableField("sell_point")
    private String sellPoint;

    /**
     * 商品价格，单位为：元
     */
    @TableField("price")
    private BigDecimal price;

    @TableField("stock_count")
    private Integer stockCount;

    /**
     * 库存数量
     */
    @TableField("num")
    private Integer num;

    /**
     * 商品条形码
     */
    @TableField("barcode")
    private String barcode;

    /**
     * 商品图片
     */
    @TableField("image")
    private String image;

    /**
     * 所属类目，叶子类目
     */
    @TableField("categoryId")
    private Long categoryId;

    /**
     * 商品状态，1-正常，2-下架，3-删除
     */
    @TableField("status")
    private String status;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    @TableField("item_sn")
    private String itemSn;

    @TableField("cost_pirce")
    private BigDecimal costPirce;

    @TableField("market_price")
    private BigDecimal marketPrice;

    @TableField("is_default")
    private String isDefault;

    @TableField("goods_id")
    private Long goodsId;

    @TableField("seller_id")
    private String sellerId;

    @TableField("cart_thumbnail")
    private String cartThumbnail;

    @TableField("category")
    private String category;

    @TableField("brand")
    private String brand;

    @TableField("spec")
    private String spec;

    @TableField("seller")
    private String seller;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
