package com.entity.vo;

import com.entity.ChengguopingguEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 成果评估
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chengguopinggu")
public class ChengguopingguVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 项目
     */

    @TableField(value = "xiangmu_id")
    private Integer xiangmuId;


    /**
     * 评审专家
     */

    @TableField(value = "pingshenzhuanjia_id")
    private Integer pingshenzhuanjiaId;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 评估意见
     */

    @TableField(value = "chengguopinggu_content")
    private String chengguopingguContent;


    /**
     * 评估得分
     */

    @TableField(value = "pinggu_defen")
    private Double pingguDefen;


    /**
     * 评估结果
     */

    @TableField(value = "chengguopinggu_types")
    private Integer chengguopingguTypes;


    /**
     * 评估时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "update_time")
    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：项目
	 */
    public Integer getXiangmuId() {
        return xiangmuId;
    }


    /**
	 * 获取：项目
	 */

    public void setXiangmuId(Integer xiangmuId) {
        this.xiangmuId = xiangmuId;
    }
    /**
	 * 设置：评审专家
	 */
    public Integer getPingshenzhuanjiaId() {
        return pingshenzhuanjiaId;
    }


    /**
	 * 获取：评审专家
	 */

    public void setPingshenzhuanjiaId(Integer pingshenzhuanjiaId) {
        this.pingshenzhuanjiaId = pingshenzhuanjiaId;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：评估意见
	 */
    public String getChengguopingguContent() {
        return chengguopingguContent;
    }


    /**
	 * 获取：评估意见
	 */

    public void setChengguopingguContent(String chengguopingguContent) {
        this.chengguopingguContent = chengguopingguContent;
    }
    /**
	 * 设置：评估得分
	 */
    public Double getPingguDefen() {
        return pingguDefen;
    }


    /**
	 * 获取：评估得分
	 */

    public void setPingguDefen(Double pingguDefen) {
        this.pingguDefen = pingguDefen;
    }
    /**
	 * 设置：评估结果
	 */
    public Integer getChengguopingguTypes() {
        return chengguopingguTypes;
    }


    /**
	 * 获取：评估结果
	 */

    public void setChengguopingguTypes(Integer chengguopingguTypes) {
        this.chengguopingguTypes = chengguopingguTypes;
    }
    /**
	 * 设置：评估时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：评估时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
