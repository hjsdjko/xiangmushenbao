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
 * 评审专家
 *
 * @author 
 * @email
 */
@TableName("pingshenzhuanjia")
public class PingshenzhuanjiaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public PingshenzhuanjiaEntity() {

	}

	public PingshenzhuanjiaEntity(T t) {
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
     * 账户
     */
    @ColumnInfo(comment="账户",type="varchar(200)")
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @ColumnInfo(comment="密码",type="varchar(200)")
    @TableField(value = "password")

    private String password;


    /**
     * 评审专家姓名
     */
    @ColumnInfo(comment="评审专家姓名",type="varchar(200)")
    @TableField(value = "pingshenzhuanjia_name")

    private String pingshenzhuanjiaName;


    /**
     * 评审专家手机号
     */
    @ColumnInfo(comment="评审专家手机号",type="varchar(200)")
    @TableField(value = "pingshenzhuanjia_phone")

    private String pingshenzhuanjiaPhone;


    /**
     * 评审专家身份证号
     */
    @ColumnInfo(comment="评审专家身份证号",type="varchar(200)")
    @TableField(value = "pingshenzhuanjia_id_number")

    private String pingshenzhuanjiaIdNumber;


    /**
     * 评审专家头像
     */
    @ColumnInfo(comment="评审专家头像",type="varchar(200)")
    @TableField(value = "pingshenzhuanjia_photo")

    private String pingshenzhuanjiaPhoto;


    /**
     * 性别
     */
    @ColumnInfo(comment="性别",type="int(11)")
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    @ColumnInfo(comment="电子邮箱",type="varchar(200)")
    @TableField(value = "pingshenzhuanjia_email")

    private String pingshenzhuanjiaEmail;


    /**
     * 研究方向
     */
    @ColumnInfo(comment="研究方向",type="int(11)")
    @TableField(value = "yanjiufangxiang_types")

    private Integer yanjiufangxiangTypes;


    /**
     * 专家介绍
     */
    @ColumnInfo(comment="专家介绍",type="text")
    @TableField(value = "pingshenzhuanjia_content")

    private String pingshenzhuanjiaContent;


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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 设置：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 设置：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：评审专家姓名
	 */
    public String getPingshenzhuanjiaName() {
        return pingshenzhuanjiaName;
    }
    /**
	 * 设置：评审专家姓名
	 */

    public void setPingshenzhuanjiaName(String pingshenzhuanjiaName) {
        this.pingshenzhuanjiaName = pingshenzhuanjiaName;
    }
    /**
	 * 获取：评审专家手机号
	 */
    public String getPingshenzhuanjiaPhone() {
        return pingshenzhuanjiaPhone;
    }
    /**
	 * 设置：评审专家手机号
	 */

    public void setPingshenzhuanjiaPhone(String pingshenzhuanjiaPhone) {
        this.pingshenzhuanjiaPhone = pingshenzhuanjiaPhone;
    }
    /**
	 * 获取：评审专家身份证号
	 */
    public String getPingshenzhuanjiaIdNumber() {
        return pingshenzhuanjiaIdNumber;
    }
    /**
	 * 设置：评审专家身份证号
	 */

    public void setPingshenzhuanjiaIdNumber(String pingshenzhuanjiaIdNumber) {
        this.pingshenzhuanjiaIdNumber = pingshenzhuanjiaIdNumber;
    }
    /**
	 * 获取：评审专家头像
	 */
    public String getPingshenzhuanjiaPhoto() {
        return pingshenzhuanjiaPhoto;
    }
    /**
	 * 设置：评审专家头像
	 */

    public void setPingshenzhuanjiaPhoto(String pingshenzhuanjiaPhoto) {
        this.pingshenzhuanjiaPhoto = pingshenzhuanjiaPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 设置：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getPingshenzhuanjiaEmail() {
        return pingshenzhuanjiaEmail;
    }
    /**
	 * 设置：电子邮箱
	 */

    public void setPingshenzhuanjiaEmail(String pingshenzhuanjiaEmail) {
        this.pingshenzhuanjiaEmail = pingshenzhuanjiaEmail;
    }
    /**
	 * 获取：研究方向
	 */
    public Integer getYanjiufangxiangTypes() {
        return yanjiufangxiangTypes;
    }
    /**
	 * 设置：研究方向
	 */

    public void setYanjiufangxiangTypes(Integer yanjiufangxiangTypes) {
        this.yanjiufangxiangTypes = yanjiufangxiangTypes;
    }
    /**
	 * 获取：专家介绍
	 */
    public String getPingshenzhuanjiaContent() {
        return pingshenzhuanjiaContent;
    }
    /**
	 * 设置：专家介绍
	 */

    public void setPingshenzhuanjiaContent(String pingshenzhuanjiaContent) {
        this.pingshenzhuanjiaContent = pingshenzhuanjiaContent;
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
        return "Pingshenzhuanjia{" +
            ", id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", pingshenzhuanjiaName=" + pingshenzhuanjiaName +
            ", pingshenzhuanjiaPhone=" + pingshenzhuanjiaPhone +
            ", pingshenzhuanjiaIdNumber=" + pingshenzhuanjiaIdNumber +
            ", pingshenzhuanjiaPhoto=" + pingshenzhuanjiaPhoto +
            ", sexTypes=" + sexTypes +
            ", pingshenzhuanjiaEmail=" + pingshenzhuanjiaEmail +
            ", yanjiufangxiangTypes=" + yanjiufangxiangTypes +
            ", pingshenzhuanjiaContent=" + pingshenzhuanjiaContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
