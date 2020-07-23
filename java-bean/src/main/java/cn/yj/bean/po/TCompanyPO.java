package cn.yj.bean.po;

import lombok.*;
import java.io.Serializable;
import java.util.Date;

/** 表_管理员 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TCompanyPO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**公司名称*/
	private String companyName;

	/**统一社会信用代码*/
	private String socialCode;

	/**纳税人识别号*/
	private String taxpayerID;

	/**组织机构代码*/
	private String organizationCode;

	/**工商注册号*/
	private String registCode;

	/**用户年龄*/
	private String webUrl;

	/**公司地址*/
	private String address;

	/**法人姓名*/
	private String legalPerson;

	/**联系方式*/
	private String mobile;

	/**公司邮箱*/
	private String email;

	/**用户账号*/
	private String account;

	/**用户MD5登陆密码*/
	private String loginPasswordMD5;

	/**公司简介*/
	private String remark;

	/**所在区域ID*/
	private String areaID;

	/**认证标识(0:未认证.1:认证.)*/
	private Integer approve;

	/**修改时间*/
	private Date setTime;

	/**创建时间*/
	private Date createTime;

	/**创建用户ID*/
	private String createID;

	/**修改时间*/
	private Date updateTime;

	/**修改用户ID*/
	private String updateID;

	/**状态(0.正常 1.注销 99.删除)*/
	private Integer state;

}
