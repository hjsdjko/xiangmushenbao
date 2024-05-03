package com.entity.model;

import com.entity.ChengguopingguEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 成果评估
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChengguopingguModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 项目
     */
    private Integer xiangmuId;


    /**
     * 评审专家
     */
    private Integer pingshenzhuanjiaId;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 评估意见
     */
    private String chengguopingguContent;


    /**
     * 评估得分
     */
    private Double pingguDefen;


    /**
     * 评估结果
     */
    private Integer chengguopingguTypes;


    /**
     * 评估时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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

    }
