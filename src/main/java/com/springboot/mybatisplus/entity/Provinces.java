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
 * 省份信息表
 * </p>
 *
 * @author Antonio
 * @since 2019-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_provinces")
public class Provinces extends Model<Provinces> {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 省份ID
     */
    @TableField("provinceid")
    private String provinceid;

    /**
     * 省份名称
     */
    @TableField("province")
    private String province;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
