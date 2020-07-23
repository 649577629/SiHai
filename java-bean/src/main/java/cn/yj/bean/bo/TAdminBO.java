package cn.yj.bean.bo;

import cn.yj.bean.po.TAdminPO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_管理员 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TAdminBO implements Serializable {

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

	/**用户住址*/
	private String userAddress;

	/**身份证*/
	private String iDCard;

	/**用户手机号*/
	private String mobile;

	/**用户邮箱*/
	private String email;

	/**用户账号*/
	private String account;

	/**用户MD5登陆密码*/
	private String loginPasswordMD5;

	/**用户类型(1001.管理员 2001.客服 10001.普通用户)*/
	private Integer userType;

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

	/**状态(0.正常 1.冻结 99.删除)*/
	private Integer state;

	//------------------------------------------------------------------------------------------------------------------转换

	/** 表_管理员 PO 转换 BO */
	public static TAdminBO toBO(TAdminPO po) {
		if (po != null) {
			return TAdminBO.builder()
					.keyID(po.getKeyID())
					.userNo(po.getUserNo())
					.userName(po.getUserName())
					.userAge(po.getUserAge())
					.userSex(po.getUserSex())
					.userAddress(po.getUserAddress())
					.iDCard(po.getIDCard())
					.mobile(po.getMobile())
					.email(po.getEmail())
					.account(po.getAccount())
					.loginPasswordMD5(po.getLoginPasswordMD5())
					.userType(po.getUserType())
					.remark(po.getRemark())
					.createTime(po.getCreateTime())
					.createID(po.getCreateID())
					.updateTime(po.getUpdateTime())
					.updateID(po.getUpdateID())
					.state(po.getState())
					.build();
		} else {
			return null;
		}
	}

	/** 表_管理员 PO 数组 转换 BO List */
	public static List<TAdminBO> toBO(TAdminPO[] pos) {
		List<TAdminBO> bos = new ArrayList<>();
		for (TAdminPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_管理员 PO List 转换 BO List */
	public static List<TAdminBO> toBO(List<TAdminPO> pos) {
		List<TAdminBO> bos = new ArrayList<>();
		for (TAdminPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_管理员 BO 转换 PO */
	public static TAdminPO toPO(TAdminBO bo) {
		if (bo != null) {
			return TAdminPO.builder()
					.keyID(bo.getKeyID())
					.userNo(bo.getUserNo())
					.userName(bo.getUserName())
					.userAge(bo.getUserAge())
					.userSex(bo.getUserSex())
					.userAddress(bo.getUserAddress())
					.iDCard(bo.getIDCard())
					.mobile(bo.getMobile())
					.email(bo.getEmail())
					.account(bo.getAccount())
					.loginPasswordMD5(bo.getLoginPasswordMD5())
					.userType(bo.getUserType())
					.remark(bo.getRemark())
					.createTime(bo.getCreateTime())
					.createID(bo.getCreateID())
					.updateTime(bo.getUpdateTime())
					.updateID(bo.getUpdateID())
					.state(bo.getState())
					.build();
		} else {
			return null;
		}
	}

	/** 表_管理员 BO List 转换 PO List */
	public static List<TAdminPO> toPO(List<TAdminBO> bos) {
		List<TAdminPO> pos = new ArrayList<>();
		for (TAdminBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_管理员 BO 转换 PO */
	public TAdminPO toPO() {
		return TAdminPO.builder()
				.keyID(this.getKeyID())
				.userNo(this.getUserNo())
				.userName(this.getUserName())
				.userAge(this.getUserAge())
				.userSex(this.getUserSex())
				.userAddress(this.getUserAddress())
				.iDCard(this.getIDCard())
				.mobile(this.getMobile())
				.email(this.getEmail())
				.account(this.getAccount())
				.loginPasswordMD5(this.getLoginPasswordMD5())
				.userType(this.getUserType())
				.remark(this.getRemark())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
