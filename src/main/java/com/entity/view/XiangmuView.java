package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 项目
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xiangmu")
public class XiangmuView extends XiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 课题来源的值
	*/
	@ColumnInfo(comment="课题来源的字典表值",type="varchar(200)")
	private String laiyuanValue;
	/**
	* 项目类型的值
	*/
	@ColumnInfo(comment="项目类型的字典表值",type="varchar(200)")
	private String xiangmuValue;
	/**
	* 所属方向的值
	*/
	@ColumnInfo(comment="所属方向的字典表值",type="varchar(200)")
	private String yanjiufangxiangValue;
	/**
	* 申请状态的值
	*/
	@ColumnInfo(comment="申请状态的字典表值",type="varchar(200)")
	private String xiangmuYesnoValue;

	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String yonghuEmail;



	public XiangmuView() {

	}

	public XiangmuView(XiangmuEntity xiangmuEntity) {
		try {
			BeanUtils.copyProperties(this, xiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 课题来源的值
	*/
	public String getLaiyuanValue() {
		return laiyuanValue;
	}
	/**
	* 设置： 课题来源的值
	*/
	public void setLaiyuanValue(String laiyuanValue) {
		this.laiyuanValue = laiyuanValue;
	}
	//当前表的
	/**
	* 获取： 项目类型的值
	*/
	public String getXiangmuValue() {
		return xiangmuValue;
	}
	/**
	* 设置： 项目类型的值
	*/
	public void setXiangmuValue(String xiangmuValue) {
		this.xiangmuValue = xiangmuValue;
	}
	//当前表的
	/**
	* 获取： 所属方向的值
	*/
	public String getYanjiufangxiangValue() {
		return yanjiufangxiangValue;
	}
	/**
	* 设置： 所属方向的值
	*/
	public void setYanjiufangxiangValue(String yanjiufangxiangValue) {
		this.yanjiufangxiangValue = yanjiufangxiangValue;
	}
	//当前表的
	/**
	* 获取： 申请状态的值
	*/
	public String getXiangmuYesnoValue() {
		return xiangmuYesnoValue;
	}
	/**
	* 设置： 申请状态的值
	*/
	public void setXiangmuYesnoValue(String xiangmuYesnoValue) {
		this.xiangmuYesnoValue = xiangmuYesnoValue;
	}


	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "XiangmuView{" +
			", laiyuanValue=" + laiyuanValue +
			", xiangmuValue=" + xiangmuValue +
			", yanjiufangxiangValue=" + yanjiufangxiangValue +
			", xiangmuYesnoValue=" + xiangmuYesnoValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
