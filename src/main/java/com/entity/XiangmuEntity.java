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
 * 项目
 *
 * @author 
 * @email
 */
@TableName("xiangmu")
public class XiangmuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiangmuEntity() {

	}

	public XiangmuEntity(T t) {
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
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 项目编号
     */
    @ColumnInfo(comment="项目编号",type="varchar(200)")
    @TableField(value = "xiangmu_uuid_number")

    private String xiangmuUuidNumber;


    /**
     * 项目名称
     */
    @ColumnInfo(comment="项目名称",type="varchar(200)")
    @TableField(value = "xiangmu_name")

    private String xiangmuName;


    /**
     * 课题来源
     */
    @ColumnInfo(comment="课题来源",type="int(11)")
    @TableField(value = "laiyuan_types")

    private Integer laiyuanTypes;


    /**
     * 项目类型
     */
    @ColumnInfo(comment="项目类型",type="int(11)")
    @TableField(value = "xiangmu_types")

    private Integer xiangmuTypes;


    /**
     * 项目开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="项目开始时间",type="timestamp")
    @TableField(value = "kaishi_time")

    private Date kaishiTime;


    /**
     * 项目结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="项目结束时间",type="timestamp")
    @TableField(value = "jieshu_time")

    private Date jieshuTime;


    /**
     * 项目花费
     */
    @ColumnInfo(comment="项目花费",type="decimal(10,2)")
    @TableField(value = "huafei_jine")

    private Double huafeiJine;


    /**
     * 所属方向
     */
    @ColumnInfo(comment="所属方向",type="int(11)")
    @TableField(value = "yanjiufangxiang_types")

    private Integer yanjiufangxiangTypes;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "yanjiufangxiang_file")

    private String yanjiufangxiangFile;


    /**
     * 项目内容
     */
    @ColumnInfo(comment="项目内容",type="text")
    @TableField(value = "xiangmu_content")

    private String xiangmuContent;


    /**
     * 项目成果
     */
    @ColumnInfo(comment="项目成果",type="text")
    @TableField(value = "xiangmu_chengguo_content")

    private String xiangmuChengguoContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "xiangmu_yesno_types")

    private Integer xiangmuYesnoTypes;


    /**
     * 审核意见
     */
    @ColumnInfo(comment="审核意见",type="text")
    @TableField(value = "xiangmu_yesno_text")

    private String xiangmuYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "xiangmu_shenhe_time")

    private Date xiangmuShenheTime;


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

    @Override
    public String toString() {
        return "Xiangmu{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", xiangmuUuidNumber=" + xiangmuUuidNumber +
            ", xiangmuName=" + xiangmuName +
            ", laiyuanTypes=" + laiyuanTypes +
            ", xiangmuTypes=" + xiangmuTypes +
            ", kaishiTime=" + DateUtil.convertString(kaishiTime,"yyyy-MM-dd") +
            ", jieshuTime=" + DateUtil.convertString(jieshuTime,"yyyy-MM-dd") +
            ", huafeiJine=" + huafeiJine +
            ", yanjiufangxiangTypes=" + yanjiufangxiangTypes +
            ", yanjiufangxiangFile=" + yanjiufangxiangFile +
            ", xiangmuContent=" + xiangmuContent +
            ", xiangmuChengguoContent=" + xiangmuChengguoContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", xiangmuYesnoTypes=" + xiangmuYesnoTypes +
            ", xiangmuYesnoText=" + xiangmuYesnoText +
            ", xiangmuShenheTime=" + DateUtil.convertString(xiangmuShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
