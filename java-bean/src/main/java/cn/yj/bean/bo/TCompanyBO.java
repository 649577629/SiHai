package cn.yj.bean.bo;

import cn.yj.bean.po.TCompanyPO;
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
public class TCompanyBO implements Serializable {

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

	//------------------------------------------------------------------------------------------------------------------转换

	/** 表_管理员 PO 转换 BO */
	public static TCompanyBO toBO(TCompanyPO po) {
		if (po != null) {
			return TCompanyBO.builder()
					.keyID(po.getKeyID())
					.companyName(po.getCompanyName())
					.socialCode(po.getSocialCode())
					.taxpayerID(po.getTaxpayerID())
					.organizationCode(po.getOrganizationCode())
					.registCode(po.getRegistCode())
					.webUrl(po.getWebUrl())
					.address(po.getAddress())
					.legalPerson(po.getLegalPerson())
					.mobile(po.getMobile())
					.email(po.getEmail())
					.account(po.getAccount())
					.loginPasswordMD5(po.getLoginPasswordMD5())
					.remark(po.getRemark())
					.areaID(po.getAreaID())
					.approve(po.getApprove())
					.setTime(po.getSetTime())
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
	public static List<TCompanyBO> toBO(TCompanyPO[] pos) {
		List<TCompanyBO> bos = new ArrayList<>();
		for (TCompanyPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_管理员 PO List 转换 BO List */
	public static List<TCompanyBO> toBO(List<TCompanyPO> pos) {
		List<TCompanyBO> bos = new ArrayList<>();
		for (TCompanyPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_管理员 BO 转换 PO */
	public static TCompanyPO toPO(TCompanyBO bo) {
		if (bo != null) {
			return TCompanyPO.builder()
					.keyID(bo.getKeyID())
					.companyName(bo.getCompanyName())
					.socialCode(bo.getSocialCode())
					.taxpayerID(bo.getTaxpayerID())
					.organizationCode(bo.getOrganizationCode())
					.registCode(bo.getRegistCode())
					.webUrl(bo.getWebUrl())
					.address(bo.getAddress())
					.legalPerson(bo.getLegalPerson())
					.mobile(bo.getMobile())
					.email(bo.getEmail())
					.account(bo.getAccount())
					.loginPasswordMD5(bo.getLoginPasswordMD5())
					.remark(bo.getRemark())
					.areaID(bo.getAreaID())
					.approve(bo.getApprove())
					.setTime(bo.getSetTime())
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
	public static List<TCompanyPO> toPO(List<TCompanyBO> bos) {
		List<TCompanyPO> pos = new ArrayList<>();
		for (TCompanyBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_管理员 BO 转换 PO */
	public TCompanyPO toPO() {
		return TCompanyPO.builder()
				.keyID(this.getKeyID())
				.companyName(this.getCompanyName())
				.socialCode(this.getSocialCode())
				.taxpayerID(this.getTaxpayerID())
				.organizationCode(this.getOrganizationCode())
				.registCode(this.getRegistCode())
				.webUrl(this.getWebUrl())
				.address(this.getAddress())
				.legalPerson(this.getLegalPerson())
				.mobile(this.getMobile())
				.email(this.getEmail())
				.account(this.getAccount())
				.loginPasswordMD5(this.getLoginPasswordMD5())
				.remark(this.getRemark())
				.areaID(this.getAreaID())
				.approve(this.getApprove())
				.setTime(this.getSetTime())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
