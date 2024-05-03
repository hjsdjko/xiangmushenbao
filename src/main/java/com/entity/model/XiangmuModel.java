package com.entity.model;

import com.entity.XiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 项目
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiangmuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 项目编号
     */
    private String xiangmuUuidNumber;


    /**
     * 项目名称
     */
    private String xiangmuName;


    /**
     * 课题来源
     */
    private Integer laiyuanTypes;


    /**
     * 项目类型
     */
    private Integer xiangmuTypes;


    /**
     * 项目开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date kaishiTime;


    /**
     * 项目结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jieshuTime;


    /**
     * 项目花费
     */
    private Double huafeiJine;


    /**
     * 所属方向
     */
    private Integer yanjiufangxiangTypes;


    /**
     * 附件
     */
    private String yanjiufangxiangFile;


    /**
     * 项目内容
     */
    private String xiangmuContent;


    /**
     * 项目成果
     */
    private String xiangmuChengguoContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 申请状态
     */
    private Integer xiangmuYesnoTypes;


    /**
     * 审核意见
     */
    private String xiangmuYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date xiangmuShenheTime;


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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：项目编号
	 */
    public String getXiangmuUuidNumber() {
        return xiangmuUuidNumber;
    }


    /**
	 * 设置：项目编号
	 */
    public void setXiangmuUuidNumber(String xiangmuUuidNumber) {
        this.xiangmuUuidNumber = xiangmuUuidNumber;
    }
    /**
	 * 获取：项目名称
	 */
    public String getXiangmuName() {
        return xiangmuName;
    }


    /**
	 * 设置：项目名称
	 */
    public void setXiangmuName(String xiangmuName) {
        this.xiangmuName = xiangmuName;
    }
    /**
	 * 获取：课题来源
	 */
    public Integer getLaiyuanTypes() {
        return laiyuanTypes;
    }


    /**
	 * 设置：课题来源
	 */
    public void setLaiyuanTypes(Integer laiyuanTypes) {
        this.laiyuanTypes = laiyuanTypes;
    }
    /**
	 * 获取：项目类型
	 */
    public Integer getXiangmuTypes() {
        return xiangmuTypes;
    }


    /**
	 * 设置：项目类型
	 */
    public void setXiangmuTypes(Integer xiangmuTypes) {
        this.xiangmuTypes = xiangmuTypes;
    }
    /**
	 * 获取：项目开始时间
	 */
    public Date getKaishiTime() {
        return kaishiTime;
    }


    /**
	 * 设置：项目开始时间
	 */
    public void setKaishiTime(Date kaishiTime) {
        this.kaishiTime = kaishiTime;
    }
    /**
	 * 获取：项目结束时间
	 */
    public Date getJieshuTime() {
        return jieshuTime;
    }


    /**
	 * 设置：项目结束时间
	 */
    public void setJieshuTime(Date jieshuTime) {
        this.jieshuTime = jieshuTime;
    }
    /**
	 * 获取：项目花费
	 */
    public Double getHuafeiJine() {
        return huafeiJine;
    }


    /**
	 * 设置：项目花费
	 */
    public void setHuafeiJine(Double huafeiJine) {
        this.huafeiJine = huafeiJine;
    }
    /**
	 * 获取：所属方向
	 */
    public Integer getYanjiufangxiangTypes() {
        return yanjiufangxiangTypes;
    }


    /**
	 * 设置：所属方向
	 */
    public void setYanjiufangxiangTypes(Integer yanjiufangxiangTypes) {
        this.yanjiufangxiangTypes = yanjiufangxiangTypes;
    }
    /**
	 * 获取：附件
	 */
    public String getYanjiufangxiangFile() {
        return yanjiufangxiangFile;
    }


    /**
	 * 设置：附件
	 */
    public void setYanjiufangxiangFile(String yanjiufangxiangFile) {
        this.yanjiufangxiangFile = yanjiufangxiangFile;
    }
    /**
	 * 获取：项目内容
	 */
    public String getXiangmuContent() {
        return xiangmuContent;
    }


    /**
	 * 设置：项目内容
	 */
    public void setXiangmuContent(String xiangmuContent) {
        this.xiangmuContent = xiangmuContent;
    }
    /**
	 * 获取：项目成果
	 */
    public String getXiangmuChengguoContent() {
        return xiangmuChengguoContent;
    }


    /**
	 * 设置：项目成果
	 */
    public void setXiangmuChengguoContent(String xiangmuChengguoContent) {
        this.xiangmuChengguoContent = xiangmuChengguoContent;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getXiangmuYesnoTypes() {
        return xiangmuYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setXiangmuYesnoTypes(Integer xiangmuYesnoTypes) {
        this.xiangmuYesnoTypes = xiangmuYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getXiangmuYesnoText() {
        return xiangmuYesnoText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setXiangmuYesnoText(String xiangmuYesnoText) {
        this.xiangmuYesnoText = xiangmuYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getXiangmuShenheTime() {
        return xiangmuShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setXiangmuShenheTime(Date xiangmuShenheTime) {
        this.xiangmuShenheTime = xiangmuShenheTime;
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
