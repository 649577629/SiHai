package cn.yj.bean.vo;

import cn.yj.bean.bo.TAdminBO;
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
public class TAdminVO implements Serializable {

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

	/** 表_管理员 BO 转换 VO */
	public static TAdminVO toVO(TAdminBO bo) {
		if (bo != null) {
			return TAdminVO.builder()
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

	/** 表_管理员 BO 数组 转换 VO List */
	public static List<TAdminVO> toVO(TAdminBO[] bos) {
		List<TAdminVO> vos = new ArrayList<>();
		for (TAdminBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_管理员 BO List 转换 VO List */
	public static List<TAdminVO> toVO(List<TAdminBO> bos) {
		List<TAdminVO> vos = new ArrayList<>();
		for (TAdminBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_管理员 VO 转换 BO */
	public static TAdminBO toBO(TAdminVO vo) {
		if (vo != null) {
			return TAdminBO.builder()
					.keyID(vo.getKeyID())
					.userNo(vo.getUserNo())
					.userName(vo.getUserName())
					.userAge(vo.getUserAge())
					.userSex(vo.getUserSex())
					.userAddress(vo.getUserAddress())
					.iDCard(vo.getIDCard())
					.mobile(vo.getMobile())
					.email(vo.getEmail())
					.account(vo.getAccount())
					.loginPasswordMD5(vo.getLoginPasswordMD5())
					.userType(vo.getUserType())
					.remark(vo.getRemark())
					.createTime(vo.getCreateTime())
					.createID(vo.getCreateID())
					.updateTime(vo.getUpdateTime())
					.updateID(vo.getUpdateID())
					.state(vo.getState())
					.build();
		} else {
			return null;
		}
	}

	/** 表_管理员 VO List 转换 BO List */
	public static List<TAdminBO> toBO(List<TAdminVO> vos) {
		List<TAdminBO> bos = new ArrayList<>();
		for (TAdminVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_管理员 VO 转换 BO */
	public TAdminBO toBO() {
		return TAdminBO.builder()
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
