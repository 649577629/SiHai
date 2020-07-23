package cn.yj.bean.vo;

import cn.yj.bean.bo.TUserBO;
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
public class TUserVO implements Serializable {

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

	/** 表_用户 BO 转换 VO */
	public static TUserVO toVO(TUserBO bo) {
		if (bo != null) {
			return TUserVO.builder()
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

	/** 表_用户 BO 数组 转换 VO List */
	public static List<TUserVO> toVO(TUserBO[] bos) {
		List<TUserVO> vos = new ArrayList<>();
		for (TUserBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_用户 BO List 转换 VO List */
	public static List<TUserVO> toVO(List<TUserBO> bos) {
		List<TUserVO> vos = new ArrayList<>();
		for (TUserBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_用户 VO 转换 BO */
	public static TUserBO toBO(TUserVO vo) {
		if (vo != null) {
			return TUserBO.builder()
					.keyID(vo.getKeyID())
					.userNo(vo.getUserNo())
					.userName(vo.getUserName())
					.userAge(vo.getUserAge())
					.userSex(vo.getUserSex())
					.iDCard(vo.getIDCard())
					.userAddress(vo.getUserAddress())
					.mobile(vo.getMobile())
					.email(vo.getEmail())
					.headPortraitUrl(vo.getHeadPortraitUrl())
					.account(vo.getAccount())
					.loginPasswordMD5(vo.getLoginPasswordMD5())
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

	/** 表_用户 VO List 转换 BO List */
	public static List<TUserBO> toBO(List<TUserVO> vos) {
		List<TUserBO> bos = new ArrayList<>();
		for (TUserVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_用户 VO 转换 BO */
	public TUserBO toBO() {
		return TUserBO.builder()
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
