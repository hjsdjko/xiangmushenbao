package com.entity.model;

import com.entity.PingshenzhuanjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 评审专家
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class PingshenzhuanjiaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 评审专家姓名
     */
    private String pingshenzhuanjiaName;


    /**
     * 评审专家手机号
     */
    private String pingshenzhuanjiaPhone;


    /**
     * 评审专家身份证号
     */
    private String pingshenzhuanjiaIdNumber;


    /**
     * 评审专家头像
     */
    private String pingshenzhuanjiaPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    private String pingshenzhuanjiaEmail;


    /**
     * 研究方向
     */
    private Integer yanjiufangxiangTypes;


    /**
     * 专家介绍
     */
    private String pingshenzhuanjiaContent;


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

    }
