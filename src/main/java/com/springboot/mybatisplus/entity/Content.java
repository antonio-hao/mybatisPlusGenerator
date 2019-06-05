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
@TableName("tb_content")
public class Content extends Model<Content> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 内容类目ID
     */
    @TableField("category_id")
    private Long categoryId;

    /**
     * 内容标题
     */
    @TableField("title")
    private String title;

    /**
     * 链接
     */
    @TableField("url")
    private String url;

    /**
     * 图片绝对路径
     */
    @TableField("pic")
    private String pic;

    /**
     * 状态
     */
    @TableField("status")
    private String status;

    /**
     * 排序
     */
    @TableField("sort_order")
    private Integer sortOrder;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
