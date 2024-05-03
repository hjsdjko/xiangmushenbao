package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 成果评估
 *
 * @author 
 * @email
 */
@TableName("chengguopinggu")
public class ChengguopingguEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChengguopingguEntity() {

	}

	public ChengguopingguEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 项目
     */
    @ColumnInfo(comment="项目",type="int(11)")
    @TableField(value = "xiangmu_id")

    private Integer xiangmuId;


    /**
     * 评审专家
     */
    @ColumnInfo(comment="评审专家",type="int(11)")
    @TableField(value = "pingshenzhuanjia_id")

    private Integer pingshenzhuanjiaId;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 评估意见
     */
    @ColumnInfo(comment="评估意见",type="text")
    @TableField(value = "chengguopinggu_content")

    private String chengguopingguContent;


    /**
     * 评估得分
     */
    @ColumnInfo(comment="评估得分",type="decimal(10,2)")
    @TableField(value = "pinggu_defen")

    private Double pingguDefen;


    /**
     * 评估结果
     */
    @ColumnInfo(comment="评估结果",type="int(11)")
    @TableField(value = "chengguopinggu_types")

    private Integer chengguopingguTypes;


    /**
     * 评估时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="评估时间",type="timestamp")
    @TableField(value = "update_time",fill = FieldFill.UPDATE)

    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：项目
	 */
    public Integer getXiangmuId() {
        return xiangmuId;
    }
    /**
	 * 设置：项目
	 */

    public void setXiangmuId(Integer xiangmuId) {
        this.xiangmuId = xiangmuId;
    }
    /**
	 * 获取：评审专家
	 */
    public Integer getPingshenzhuanjiaId() {
        return pingshenzhuanjiaId;
    }
    /**
	 * 设置：评审专家
	 */

    public void setPingshenzhuanjiaId(Integer pingshenzhuanjiaId) {
        this.pingshenzhuanjiaId = pingshenzhuanjiaId;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：评估意见
	 */
    public String getChengguopingguContent() {
        return chengguopingguContent;
    }
    /**
	 * 设置：评估意见
	 */

    public void setChengguopingguContent(String chengguopingguContent) {
        this.chengguopingguContent = chengguopingguContent;
    }
    /**
	 * 获取：评估得分
	 */
    public Double getPingguDefen() {
        return pingguDefen;
    }
    /**
	 * 设置：评估得分
	 */

    public void setPingguDefen(Double pingguDefen) {
        this.pingguDefen = pingguDefen;
    }
    /**
	 * 获取：评估结果
	 */
    public Integer getChengguopingguTypes() {
        return chengguopingguTypes;
    }
    /**
	 * 设置：评估结果
	 */

    public void setChengguopingguTypes(Integer chengguopingguTypes) {
        this.chengguopingguTypes = chengguopingguTypes;
    }
    /**
	 * 获取：评估时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }
    /**
	 * 设置：评估时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Chengguopinggu{" +
            ", id=" + id +
            ", xiangmuId=" + xiangmuId +
            ", pingshenzhuanjiaId=" + pingshenzhuanjiaId +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", chengguopingguContent=" + chengguopingguContent +
            ", pingguDefen=" + pingguDefen +
            ", chengguopingguTypes=" + chengguopingguTypes +
            ", updateTime=" + DateUtil.convertString(updateTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
