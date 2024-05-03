package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ChengguopingguEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 成果评估
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("chengguopinggu")
public class ChengguopingguView extends ChengguopingguEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 评估结果的值
	*/
	@ColumnInfo(comment="评估结果的字典表值",type="varchar(200)")
	private String chengguopingguValue;

	//级联表 评审专家
		/**
		* 评审专家姓名
		*/

		@ColumnInfo(comment="评审专家姓名",type="varchar(200)")
		private String pingshenzhuanjiaName;
		/**
		* 评审专家手机号
		*/

		@ColumnInfo(comment="评审专家手机号",type="varchar(200)")
		private String pingshenzhuanjiaPhone;
		/**
		* 评审专家身份证号
		*/

		@ColumnInfo(comment="评审专家身份证号",type="varchar(200)")
		private String pingshenzhuanjiaIdNumber;
		/**
		* 评审专家头像
		*/

		@ColumnInfo(comment="评审专家头像",type="varchar(200)")
		private String pingshenzhuanjiaPhoto;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String pingshenzhuanjiaEmail;
		/**
		* 专家介绍
		*/

		@ColumnInfo(comment="专家介绍",type="text")
		private String pingshenzhuanjiaContent;
	//级联表 项目
					 
		/**
		* 项目 的 用户
		*/
		@ColumnInfo(comment="用户",type="int(11)")
		private Integer xiangmuYonghuId;
		/**
		* 项目编号
		*/

		@ColumnInfo(comment="项目编号",type="varchar(200)")
		private String xiangmuUuidNumber;
		/**
		* 项目名称
		*/

		@ColumnInfo(comment="项目名称",type="varchar(200)")
		private String xiangmuName;
		/**
		* 课题来源
		*/
		@ColumnInfo(comment="课题来源",type="int(11)")
		private Integer laiyuanTypes;
			/**
			* 课题来源的值
			*/
			@ColumnInfo(comment="课题来源的字典表值",type="varchar(200)")
			private String laiyuanValue;
		/**
		* 项目类型
		*/
		@ColumnInfo(comment="项目类型",type="int(11)")
		private Integer xiangmuTypes;
			/**
			* 项目类型的值
			*/
			@ColumnInfo(comment="项目类型的字典表值",type="varchar(200)")
			private String xiangmuValue;
		/**
		* 项目开始时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="项目开始时间",type="timestamp")
		private Date kaishiTime;
		/**
		* 项目结束时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="项目结束时间",type="timestamp")
		private Date jieshuTime;
		/**
		* 项目花费
		*/
		@ColumnInfo(comment="项目花费",type="decimal(10,2)")
		private Double huafeiJine;
		/**
		* 附件
		*/

		@ColumnInfo(comment="附件",type="varchar(200)")
		private String yanjiufangxiangFile;
		/**
		* 项目内容
		*/

		@ColumnInfo(comment="项目内容",type="text")
		private String xiangmuContent;
		/**
		* 项目成果
		*/

		@ColumnInfo(comment="项目成果",type="text")
		private String xiangmuChengguoContent;
		/**
		* 申请状态
		*/
		@ColumnInfo(comment="申请状态",type="int(11)")
		private Integer xiangmuYesnoTypes;
			/**
			* 申请状态的值
			*/
			@ColumnInfo(comment="申请状态的字典表值",type="varchar(200)")
			private String xiangmuYesnoValue;
		/**
		* 审核意见
		*/

		@ColumnInfo(comment="审核意见",type="text")
		private String xiangmuYesnoText;
		/**
		* 审核时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="审核时间",type="timestamp")
		private Date xiangmuShenheTime;

	//重复字段
			/**
			* 重复字段 的types
			*/
			@ColumnInfo(comment="重复字段 的types",type="Integer")
			private Integer yanjiufangxiangTypes;
				@ColumnInfo(comment="重复字段 的值",type="varchar(200)")
				private String yanjiufangxiangValue;


	public ChengguopingguView() {

	}

	public ChengguopingguView(ChengguopingguEntity chengguopingguEntity) {
		try {
			BeanUtils.copyProperties(this, chengguopingguEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 评估结果的值
	*/
	public String getChengguopingguValue() {
		return chengguopingguValue;
	}
	/**
	* 设置： 评估结果的值
	*/
	public void setChengguopingguValue(String chengguopingguValue) {
		this.chengguopingguValue = chengguopingguValue;
	}


	//级联表的get和set 评审专家

		/**
		* 获取： 评审专家姓名
		*/
		public String getPingshenzhuanjiaName() {
			return pingshenzhuanjiaName;
		}
		/**
		* 设置： 评审专家姓名
		*/
		public void setPingshenzhuanjiaName(String pingshenzhuanjiaName) {
			this.pingshenzhuanjiaName = pingshenzhuanjiaName;
		}

		/**
		* 获取： 评审专家手机号
		*/
		public String getPingshenzhuanjiaPhone() {
			return pingshenzhuanjiaPhone;
		}
		/**
		* 设置： 评审专家手机号
		*/
		public void setPingshenzhuanjiaPhone(String pingshenzhuanjiaPhone) {
			this.pingshenzhuanjiaPhone = pingshenzhuanjiaPhone;
		}

		/**
		* 获取： 评审专家身份证号
		*/
		public String getPingshenzhuanjiaIdNumber() {
			return pingshenzhuanjiaIdNumber;
		}
		/**
		* 设置： 评审专家身份证号
		*/
		public void setPingshenzhuanjiaIdNumber(String pingshenzhuanjiaIdNumber) {
			this.pingshenzhuanjiaIdNumber = pingshenzhuanjiaIdNumber;
		}

		/**
		* 获取： 评审专家头像
		*/
		public String getPingshenzhuanjiaPhoto() {
			return pingshenzhuanjiaPhoto;
		}
		/**
		* 设置： 评审专家头像
		*/
		public void setPingshenzhuanjiaPhoto(String pingshenzhuanjiaPhoto) {
			this.pingshenzhuanjiaPhoto = pingshenzhuanjiaPhoto;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getPingshenzhuanjiaEmail() {
			return pingshenzhuanjiaEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setPingshenzhuanjiaEmail(String pingshenzhuanjiaEmail) {
			this.pingshenzhuanjiaEmail = pingshenzhuanjiaEmail;
		}

		/**
		* 获取： 专家介绍
		*/
		public String getPingshenzhuanjiaContent() {
			return pingshenzhuanjiaContent;
		}
		/**
		* 设置： 专家介绍
		*/
		public void setPingshenzhuanjiaContent(String pingshenzhuanjiaContent) {
			this.pingshenzhuanjiaContent = pingshenzhuanjiaContent;
		}
	//级联表的get和set 项目
		/**
		* 获取：项目 的 用户
		*/
		public Integer getXiangmuYonghuId() {
			return xiangmuYonghuId;
		}
		/**
		* 设置：项目 的 用户
		*/
		public void setXiangmuYonghuId(Integer xiangmuYonghuId) {
			this.xiangmuYonghuId = xiangmuYonghuId;
		}

		/**
		* 获取： 项目编号
		*/
		public String getXiangmuUuidNumber() {
			return xiangmuUuidNumber;
		}
		/**
		* 设置： 项目编号
		*/
		public void setXiangmuUuidNumber(String xiangmuUuidNumber) {
			this.xiangmuUuidNumber = xiangmuUuidNumber;
		}

		/**
		* 获取： 项目名称
		*/
		public String getXiangmuName() {
			return xiangmuName;
		}
		/**
		* 设置： 项目名称
		*/
		public void setXiangmuName(String xiangmuName) {
			this.xiangmuName = xiangmuName;
		}
		/**
		* 获取： 课题来源
		*/
		public Integer getLaiyuanTypes() {
			return laiyuanTypes;
		}
		/**
		* 设置： 课题来源
		*/
		public void setLaiyuanTypes(Integer laiyuanTypes) {
			this.laiyuanTypes = laiyuanTypes;
		}


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
		/**
		* 获取： 项目类型
		*/
		public Integer getXiangmuTypes() {
			return xiangmuTypes;
		}
		/**
		* 设置： 项目类型
		*/
		public void setXiangmuTypes(Integer xiangmuTypes) {
			this.xiangmuTypes = xiangmuTypes;
		}


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

		/**
		* 获取： 项目开始时间
		*/
		public Date getKaishiTime() {
			return kaishiTime;
		}
		/**
		* 设置： 项目开始时间
		*/
		public void setKaishiTime(Date kaishiTime) {
			this.kaishiTime = kaishiTime;
		}

		/**
		* 获取： 项目结束时间
		*/
		public Date getJieshuTime() {
			return jieshuTime;
		}
		/**
		* 设置： 项目结束时间
		*/
		public void setJieshuTime(Date jieshuTime) {
			this.jieshuTime = jieshuTime;
		}

		/**
		* 获取： 项目花费
		*/
		public Double getHuafeiJine() {
			return huafeiJine;
		}
		/**
		* 设置： 项目花费
		*/
		public void setHuafeiJine(Double huafeiJine) {
			this.huafeiJine = huafeiJine;
		}

		/**
		* 获取： 附件
		*/
		public String getYanjiufangxiangFile() {
			return yanjiufangxiangFile;
		}
		/**
		* 设置： 附件
		*/
		public void setYanjiufangxiangFile(String yanjiufangxiangFile) {
			this.yanjiufangxiangFile = yanjiufangxiangFile;
		}

		/**
		* 获取： 项目内容
		*/
		public String getXiangmuContent() {
			return xiangmuContent;
		}
		/**
		* 设置： 项目内容
		*/
		public void setXiangmuContent(String xiangmuContent) {
			this.xiangmuContent = xiangmuContent;
		}

		/**
		* 获取： 项目成果
		*/
		public String getXiangmuChengguoContent() {
			return xiangmuChengguoContent;
		}
		/**
		* 设置： 项目成果
		*/
		public void setXiangmuChengguoContent(String xiangmuChengguoContent) {
			this.xiangmuChengguoContent = xiangmuChengguoContent;
		}
		/**
		* 获取： 申请状态
		*/
		public Integer getXiangmuYesnoTypes() {
			return xiangmuYesnoTypes;
		}
		/**
		* 设置： 申请状态
		*/
		public void setXiangmuYesnoTypes(Integer xiangmuYesnoTypes) {
			this.xiangmuYesnoTypes = xiangmuYesnoTypes;
		}


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

		/**
		* 获取： 审核意见
		*/
		public String getXiangmuYesnoText() {
			return xiangmuYesnoText;
		}
		/**
		* 设置： 审核意见
		*/
		public void setXiangmuYesnoText(String xiangmuYesnoText) {
			this.xiangmuYesnoText = xiangmuYesnoText;
		}

		/**
		* 获取： 审核时间
		*/
		public Date getXiangmuShenheTime() {
			return xiangmuShenheTime;
		}
		/**
		* 设置： 审核时间
		*/
		public void setXiangmuShenheTime(Date xiangmuShenheTime) {
			this.xiangmuShenheTime = xiangmuShenheTime;
		}

	//重复字段
			/**
			* 获取： 重复字段 的types
			*/
			public Integer getYanjiufangxiangTypes() {
			return yanjiufangxiangTypes;
			}
			/**
			* 设置： 重复字段 的types
			*/
			public void setYanjiufangxiangTypes(Integer yanjiufangxiangTypes) {
			this.yanjiufangxiangTypes = yanjiufangxiangTypes;
			}
				public String getYanjiufangxiangValue() {
				return yanjiufangxiangValue;
				}
				public void setYanjiufangxiangValue(String yanjiufangxiangValue) {
				this.yanjiufangxiangValue = yanjiufangxiangValue;
				}

	@Override
	public String toString() {
		return "ChengguopingguView{" +
			", chengguopingguValue=" + chengguopingguValue +
			", xiangmuUuidNumber=" + xiangmuUuidNumber +
			", xiangmuName=" + xiangmuName +
			", kaishiTime=" + DateUtil.convertString(kaishiTime,"yyyy-MM-dd") +
			", jieshuTime=" + DateUtil.convertString(jieshuTime,"yyyy-MM-dd") +
			", huafeiJine=" + huafeiJine +
			", yanjiufangxiangFile=" + yanjiufangxiangFile +
			", xiangmuContent=" + xiangmuContent +
			", xiangmuChengguoContent=" + xiangmuChengguoContent +
			", xiangmuYesnoText=" + xiangmuYesnoText +
			", xiangmuShenheTime=" + DateUtil.convertString(xiangmuShenheTime,"yyyy-MM-dd") +
			", pingshenzhuanjiaName=" + pingshenzhuanjiaName +
			", pingshenzhuanjiaPhone=" + pingshenzhuanjiaPhone +
			", pingshenzhuanjiaIdNumber=" + pingshenzhuanjiaIdNumber +
			", pingshenzhuanjiaPhoto=" + pingshenzhuanjiaPhoto +
			", pingshenzhuanjiaEmail=" + pingshenzhuanjiaEmail +
			", pingshenzhuanjiaContent=" + pingshenzhuanjiaContent +
			"} " + super.toString();
	}
}
