package com.springboot.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("tb_goods_desc")
public class GoodsDesc extends Model<GoodsDesc> {

    private static final long serialVersionUID = 1L;

    /**
     * SPU_ID
     */
    @TableId("goods_id")
    private Long goodsId;

    /**
     * 描述
     */
    @TableField("introduction")
    private String introduction;

    /**
     * 规格结果集，所有规格，包含isSelected
     */
    @TableField("specification_items")
    private String specificationItems;

    /**
     * 自定义属性（参数结果）
     */
    @TableField("custom_attribute_items")
    private String customAttributeItems;

    @TableField("item_images")
    private String itemImages;

    /**
     * 包装列表
     */
    @TableField("package_list")
    private String packageList;

    /**
     * 售后服务
     */
    @TableField("sale_service")
    private String saleService;


    @Override
    protected Serializable pkVal() {
        return this.goodsId;
    }

}
