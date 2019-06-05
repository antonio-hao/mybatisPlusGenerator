package com.springboot.mybatisplus.entity;

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
@TableName("tb_type_template")
public class TypeTemplate extends Model<TypeTemplate> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 模板名称
     */
    @TableField("name")
    private String name;

    /**
     * 关联规格
     */
    @TableField("spec_ids")
    private String specIds;

    /**
     * 关联品牌
     */
    @TableField("brand_ids")
    private String brandIds;

    /**
     * 自定义属性
     */
    @TableField("custom_attribute_items")
    private String customAttributeItems;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
