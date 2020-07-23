package cn.yj.bean.bo;

import cn.yj.bean.po.TUserPO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_用户 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TUserBO implements Serializable {

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

	//------------------------------------------------------------------------------------------------------------------转换

	/** 表_用户 PO 转换 BO */
	public static TUserBO toBO(TUserPO po) {
		if (po != null) {
			return TUserBO.builder()
					.keyID(po.getKeyID())
					.userNo(po.getUserNo())
					.userName(po.getUserName())
					.userAge(po.getUserAge())
					.userSex(po.getUserSex())
					.iDCard(po.getIDCard())
					.userAddress(po.getUserAddress())
					.mobile(po.getMobile())
					.email(po.getEmail())
					.headPortraitUrl(po.getHeadPortraitUrl())
					.account(po.getAccount())
					.loginPasswordMD5(po.getLoginPasswordMD5())
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

	/** 表_用户 PO 数组 转换 BO List */
	public static List<TUserBO> toBO(TUserPO[] pos) {
		List<TUserBO> bos = new ArrayList<>();
		for (TUserPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_用户 PO List 转换 BO List */
	public static List<TUserBO> toBO(List<TUserPO> pos) {
		List<TUserBO> bos = new ArrayList<>();
		for (TUserPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_用户 BO 转换 PO */
	public static TUserPO toPO(TUserBO bo) {
		if (bo != null) {
			return TUserPO.builder()
					.keyID(bo.getKeyID())
					.userNo(bo.getUserNo())
					.userName(bo.getUserName())
					.userAge(bo.getUserAge())
					.userSex(bo.getUserSex())
					.iDCard(bo.getIDCard())
					.userAddress(bo.getUserAddress())
					.mobile(bo.getMobile())
					.email(bo.getEmail())
					.headPortraitUrl(bo.getHeadPortraitUrl())
					.account(bo.getAccount())
					.loginPasswordMD5(bo.getLoginPasswordMD5())
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

	/** 表_用户 BO List 转换 PO List */
	public static List<TUserPO> toPO(List<TUserBO> bos) {
		List<TUserPO> pos = new ArrayList<>();
		for (TUserBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_用户 BO 转换 PO */
	public TUserPO toPO() {
		return TUserPO.builder()
				.keyID(this.getKeyID())
				.userNo(this.getUserNo())
				.userName(this.getUserName())
				.userAge(this.getUserAge())
				.userSex(this.getUserSex())
				.iDCard(this.getIDCard())
				.userAddress(this.getUserAddress())
				.mobile(this.getMobile())
				.email(this.getEmail())
				.headPortraitUrl(this.getHeadPortraitUrl())
				.account(this.getAccount())
				.loginPasswordMD5(this.getLoginPasswordMD5())
				.remark(this.getRemark())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
