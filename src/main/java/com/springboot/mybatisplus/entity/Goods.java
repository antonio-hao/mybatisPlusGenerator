package com.springboot.mybatisplus.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("tb_goods")
public class Goods extends Model<Goods> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商家ID
     */
    @TableField("seller_id")
    private String sellerId;

    /**
     * SPU名
     */
    @TableField("goods_name")
    private String goodsName;

    /**
     * 默认SKU
     */
    @TableField("default_item_id")
    private Long defaultItemId;

    /**
     * 状态
     */
    @TableField("audit_status")
    private String auditStatus;

    /**
     * 是否上架
     */
    @TableField("is_marketable")
    private String isMarketable;

    /**
     * 品牌
     */
    @TableField("brand_id")
    private Long brandId;

    /**
     * 副标题
     */
    @TableField("caption")
    private String caption;

    /**
     * 一级类目
     */
    @TableField("category1_id")
    private Long category1Id;

    /**
     * 二级类目
     */
    @TableField("category2_id")
    private Long category2Id;

    /**
     * 三级类目
     */
    @TableField("category3_id")
    private Long category3Id;

    /**
     * 小图
     */
    @TableField("small_pic")
    private String smallPic;

    /**
     * 商城价
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * 分类模板ID
     */
    @TableField("type_template_id")
    private Long typeTemplateId;

    /**
     * 是否启用规格
     */
    @TableField("is_enable_spec")
    private String isEnableSpec;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private String isDelete;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
