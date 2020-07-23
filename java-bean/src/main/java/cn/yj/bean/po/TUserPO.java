package cn.yj.bean.po;

import lombok.*;
import java.io.Serializable;
import java.util.Date;

/** 表_用户 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TUserPO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**用户编号*/
	private String userNo;

	/**用户姓名*/
	private String userName;

	/**用户年龄*/
	private Integer userAge;

	/**用户性别(0.未知 1.男 2.女)*/
	private Integer userSex;

	/**身份证*/
	private String iDCard;

	/**用户住址*/
	private String userAddress;

	/**用户手机号*/
	private String mobile;

	/**用户邮箱*/
	private String email;

	/**用户年龄*/
	private String headPortraitUrl;

	/**用户账号*/
	private String account;

	/**用户MD5登陆密码*/
	private String loginPasswordMD5;

	/**备注*/
	private String remark;

	/**创建时间*/
	private Date createTime;

	/**创建用户ID*/
	private String createID;

	/**修改时间*/
	private Date updateTime;

	/**修改用户ID*/
	private String updateID;

	/**状态(0.正常 1.冻结.2:会员.3:注销 99.删除)*/
	private Integer state;

}
