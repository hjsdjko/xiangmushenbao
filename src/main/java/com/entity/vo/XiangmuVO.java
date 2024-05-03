package com.entity.vo;

import com.entity.XiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 项目
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiangmu")
public class XiangmuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 项目编号
     */

    @TableField(value = "xiangmu_uuid_number")
    private String xiangmuUuidNumber;


    /**
     * 项目名称
     */

    @TableField(value = "xiangmu_name")
    private String xiangmuName;


    /**
     * 课题来源
     */

    @TableField(value = "laiyuan_types")
    private Integer laiyuanTypes;


    /**
     * 项目类型
     */

    @TableField(value = "xiangmu_types")
    private Integer xiangmuTypes;


    /**
     * 项目开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "kaishi_time")
    private Date kaishiTime;


    /**
     * 项目结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jieshu_time")
    private Date jieshuTime;


    /**
     * 项目花费
     */

    @TableField(value = "huafei_jine")
    private Double huafeiJine;


    /**
     * 所属方向
     */

    @TableField(value = "yanjiufangxiang_types")
    private Integer yanjiufangxiangTypes;


    /**
     * 附件
     */

    @TableField(value = "yanjiufangxiang_file")
    private String yanjiufangxiangFile;


    /**
     * 项目内容
     */

    @TableField(value = "xiangmu_content")
    private String xiangmuContent;


    /**
     * 项目成果
     */

    @TableField(value = "xiangmu_chengguo_content")
    private String xiangmuChengguoContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 申请状态
     */

    @TableField(value = "xiangmu_yesno_types")
    private Integer xiangmuYesnoTypes;


    /**
     * 审核意见
     */

    @TableField(value = "xiangmu_yesno_text")
    private String xiangmuYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "xiangmu_shenhe_time")
    private Date xiangmuShenheTime;


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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：项目编号
	 */
    public String getXiangmuUuidNumber() {
        return xiangmuUuidNumber;
    }


    /**
	 * 获取：项目编号
	 */

    public void setXiangmuUuidNumber(String xiangmuUuidNumber) {
        this.xiangmuUuidNumber = xiangmuUuidNumber;
    }
    /**
	 * 设置：项目名称
	 */
    public String getXiangmuName() {
        return xiangmuName;
    }


    /**
	 * 获取：项目名称
	 */

    public void setXiangmuName(String xiangmuName) {
        this.xiangmuName = xiangmuName;
    }
    /**
	 * 设置：课题来源
	 */
    public Integer getLaiyuanTypes() {
        return laiyuanTypes;
    }


    /**
	 * 获取：课题来源
	 */

    public void setLaiyuanTypes(Integer laiyuanTypes) {
        this.laiyuanTypes = laiyuanTypes;
    }
    /**
	 * 设置：项目类型
	 */
    public Integer getXiangmuTypes() {
        return xiangmuTypes;
    }


    /**
	 * 获取：项目类型
	 */

    public void setXiangmuTypes(Integer xiangmuTypes) {
        this.xiangmuTypes = xiangmuTypes;
    }
    /**
	 * 设置：项目开始时间
	 */
    public Date getKaishiTime() {
        return kaishiTime;
    }


    /**
	 * 获取：项目开始时间
	 */

    public void setKaishiTime(Date kaishiTime) {
        this.kaishiTime = kaishiTime;
    }
    /**
	 * 设置：项目结束时间
	 */
    public Date getJieshuTime() {
        return jieshuTime;
    }


    /**
	 * 获取：项目结束时间
	 */

    public void setJieshuTime(Date jieshuTime) {
        this.jieshuTime = jieshuTime;
    }
    /**
	 * 设置：项目花费
	 */
    public Double getHuafeiJine() {
        return huafeiJine;
    }


    /**
	 * 获取：项目花费
	 */

    public void setHuafeiJine(Double huafeiJine) {
        this.huafeiJine = huafeiJine;
    }
    /**
	 * 设置：所属方向
	 */
    public Integer getYanjiufangxiangTypes() {
        return yanjiufangxiangTypes;
    }


    /**
	 * 获取：所属方向
	 */

    public void setYanjiufangxiangTypes(Integer yanjiufangxiangTypes) {
        this.yanjiufangxiangTypes = yanjiufangxiangTypes;
    }
    /**
	 * 设置：附件
	 */
    public String getYanjiufangxiangFile() {
        return yanjiufangxiangFile;
    }


    /**
	 * 获取：附件
	 */

    public void setYanjiufangxiangFile(String yanjiufangxiangFile) {
        this.yanjiufangxiangFile = yanjiufangxiangFile;
    }
    /**
	 * 设置：项目内容
	 */
    public String getXiangmuContent() {
        return xiangmuContent;
    }


    /**
	 * 获取：项目内容
	 */

    public void setXiangmuContent(String xiangmuContent) {
        this.xiangmuContent = xiangmuContent;
    }
    /**
	 * 设置：项目成果
	 */
    public String getXiangmuChengguoContent() {
        return xiangmuChengguoContent;
    }


    /**
	 * 获取：项目成果
	 */

    public void setXiangmuChengguoContent(String xiangmuChengguoContent) {
        this.xiangmuChengguoContent = xiangmuChengguoContent;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getXiangmuYesnoTypes() {
        return xiangmuYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setXiangmuYesnoTypes(Integer xiangmuYesnoTypes) {
        this.xiangmuYesnoTypes = xiangmuYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getXiangmuYesnoText() {
        return xiangmuYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setXiangmuYesnoText(String xiangmuYesnoText) {
        this.xiangmuYesnoText = xiangmuYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getXiangmuShenheTime() {
        return xiangmuShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setXiangmuShenheTime(Date xiangmuShenheTime) {
        this.xiangmuShenheTime = xiangmuShenheTime;
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
