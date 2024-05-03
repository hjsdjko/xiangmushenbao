package com.entity.vo;

import com.entity.PingshenzhuanjiaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 评审专家
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("pingshenzhuanjia")
public class PingshenzhuanjiaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 评审专家姓名
     */

    @TableField(value = "pingshenzhuanjia_name")
    private String pingshenzhuanjiaName;


    /**
     * 评审专家手机号
     */

    @TableField(value = "pingshenzhuanjia_phone")
    private String pingshenzhuanjiaPhone;


    /**
     * 评审专家身份证号
     */

    @TableField(value = "pingshenzhuanjia_id_number")
    private String pingshenzhuanjiaIdNumber;


    /**
     * 评审专家头像
     */

    @TableField(value = "pingshenzhuanjia_photo")
    private String pingshenzhuanjiaPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 电子邮箱
     */

    @TableField(value = "pingshenzhuanjia_email")
    private String pingshenzhuanjiaEmail;


    /**
     * 研究方向
     */

    @TableField(value = "yanjiufangxiang_types")
    private Integer yanjiufangxiangTypes;


    /**
     * 专家介绍
     */

    @TableField(value = "pingshenzhuanjia_content")
    private String pingshenzhuanjiaContent;


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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：评审专家姓名
	 */
    public String getPingshenzhuanjiaName() {
        return pingshenzhuanjiaName;
    }


    /**
	 * 获取：评审专家姓名
	 */

    public void setPingshenzhuanjiaName(String pingshenzhuanjiaName) {
        this.pingshenzhuanjiaName = pingshenzhuanjiaName;
    }
    /**
	 * 设置：评审专家手机号
	 */
    public String getPingshenzhuanjiaPhone() {
        return pingshenzhuanjiaPhone;
    }


    /**
	 * 获取：评审专家手机号
	 */

    public void setPingshenzhuanjiaPhone(String pingshenzhuanjiaPhone) {
        this.pingshenzhuanjiaPhone = pingshenzhuanjiaPhone;
    }
    /**
	 * 设置：评审专家身份证号
	 */
    public String getPingshenzhuanjiaIdNumber() {
        return pingshenzhuanjiaIdNumber;
    }


    /**
	 * 获取：评审专家身份证号
	 */

    public void setPingshenzhuanjiaIdNumber(String pingshenzhuanjiaIdNumber) {
        this.pingshenzhuanjiaIdNumber = pingshenzhuanjiaIdNumber;
    }
    /**
	 * 设置：评审专家头像
	 */
    public String getPingshenzhuanjiaPhoto() {
        return pingshenzhuanjiaPhoto;
    }


    /**
	 * 获取：评审专家头像
	 */

    public void setPingshenzhuanjiaPhoto(String pingshenzhuanjiaPhoto) {
        this.pingshenzhuanjiaPhoto = pingshenzhuanjiaPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getPingshenzhuanjiaEmail() {
        return pingshenzhuanjiaEmail;
    }


    /**
	 * 获取：电子邮箱
	 */

    public void setPingshenzhuanjiaEmail(String pingshenzhuanjiaEmail) {
        this.pingshenzhuanjiaEmail = pingshenzhuanjiaEmail;
    }
    /**
	 * 设置：研究方向
	 */
    public Integer getYanjiufangxiangTypes() {
        return yanjiufangxiangTypes;
    }


    /**
	 * 获取：研究方向
	 */

    public void setYanjiufangxiangTypes(Integer yanjiufangxiangTypes) {
        this.yanjiufangxiangTypes = yanjiufangxiangTypes;
    }
    /**
	 * 设置：专家介绍
	 */
    public String getPingshenzhuanjiaContent() {
        return pingshenzhuanjiaContent;
    }


    /**
	 * 获取：专家介绍
	 */

    public void setPingshenzhuanjiaContent(String pingshenzhuanjiaContent) {
        this.pingshenzhuanjiaContent = pingshenzhuanjiaContent;
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
