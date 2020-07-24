package cn.yj.bean.dto;

import cn.yj.bean.bo.TCompanyBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_管理员 */
@ApiModel("表_管理员 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TCompanyDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**公司名称*/
	@ApiModelProperty(value = "公司名称", example = "String" )
	private String companyName;

	/**统一社会信用代码*/
	@ApiModelProperty(value = "统一社会信用代码", example = "String" )
	private String socialCode;

	/**纳税人识别号*/
	@ApiModelProperty(value = "纳税人识别号", example = "String" )
	private String taxpayerID;

	/**组织机构代码*/
	@ApiModelProperty(value = "组织机构代码", example = "String" )
	private String organizationCode;

	/**工商注册号*/
	@ApiModelProperty(value = "工商注册号", example = "String" )
	private String registCode;

	/**用户年龄*/
	@ApiModelProperty(value = "用户年龄", example = "String" )
	private String webUrl;

	/**公司地址*/
	@ApiModelProperty(value = "公司地址", example = "String" )
	private String address;

	/**法人姓名*/
	@ApiModelProperty(value = "法人姓名", example = "String" )
	private String legalPerson;

	/**联系方式*/
	@ApiModelProperty(value = "联系方式", example = "String" )
	private String mobile;

	/**公司邮箱*/
	@ApiModelProperty(value = "公司邮箱", example = "String" )
	private String email;

	/**用户账号*/
	@ApiModelProperty(value = "用户账号", example = "String" )
	private String account;

	/**用户MD5登陆密码*/
	@ApiModelProperty(value = "用户MD5登陆密码", example = "String" )
	private String loginPasswordMD5;

	/**公司简介*/
	@ApiModelProperty(value = "公司简介", example = "String" )
	private String remark;

	/**所在区域ID*/
	@ApiModelProperty(value = "所在区域ID", example = "String" )
	private String areaID;

	/**认证标识(0:未认证.1:认证.)*/
	@ApiModelProperty(value = "认证标识(0:未认证.1:认证.)", example = "0" )
	private Integer approve;

	/**修改时间*/
	@ApiModelProperty(value = "修改时间", example = "2020-07-24 11:16:02" )
	private Date setTime;

	/**创建时间*/
	@ApiModelProperty(value = "创建时间", example = "2020-07-24 11:16:02" )
	private Date createTime;

	/**创建用户ID*/
	@ApiModelProperty(value = "创建用户ID", example = "String" )
	private String createID;

	/**修改时间*/
	@ApiModelProperty(value = "修改时间", example = "2020-07-24 11:16:02" )
	private Date updateTime;

	/**修改用户ID*/
	@ApiModelProperty(value = "修改用户ID", example = "String" )
	private String updateID;

	/**状态(0.正常 1.注销 99.删除)*/
	@ApiModelProperty(value = "状态(0.正常 1.注销 99.删除)", example = "0" )
	private Integer state;

	//------------------------------------------------------------------------------------------------------------------转换

	/** 表_管理员 BO 转换 DTO */
	public static TCompanyDTO toDTO(TCompanyBO bo) {
		if (bo != null) {
			return TCompanyDTO.builder()
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

	/** 表_管理员 BO 数组 转换 DTO List */
	public static List<TCompanyDTO> toDTO(TCompanyBO[] bos) {
		List<TCompanyDTO> dtos = new ArrayList<>();
		for (TCompanyBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_管理员 BO List 转换 DTO List */
	public static List<TCompanyDTO> toDTO(List<TCompanyBO> bos) {
		List<TCompanyDTO> dtos = new ArrayList<>();
		for (TCompanyBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_管理员 DTO 转换 BO */
	public static TCompanyBO toBO(TCompanyDTO dto) {
		if (dto != null) {
			return TCompanyBO.builder()
					.keyID(dto.getKeyID())
					.companyName(dto.getCompanyName())
					.socialCode(dto.getSocialCode())
					.taxpayerID(dto.getTaxpayerID())
					.organizationCode(dto.getOrganizationCode())
					.registCode(dto.getRegistCode())
					.webUrl(dto.getWebUrl())
					.address(dto.getAddress())
					.legalPerson(dto.getLegalPerson())
					.mobile(dto.getMobile())
					.email(dto.getEmail())
					.account(dto.getAccount())
					.loginPasswordMD5(dto.getLoginPasswordMD5())
					.remark(dto.getRemark())
					.areaID(dto.getAreaID())
					.approve(dto.getApprove())
					.setTime(dto.getSetTime())
					.createTime(dto.getCreateTime())
					.createID(dto.getCreateID())
					.updateTime(dto.getUpdateTime())
					.updateID(dto.getUpdateID())
					.state(dto.getState())
					.build();
		} else {
			return null;
		}
	}

	/** 表_管理员 DTO List 转换 BO List */
	public static List<TCompanyBO> toBO(List<TCompanyDTO> dtos) {
		List<TCompanyBO> bos = new ArrayList<>();
		for (TCompanyDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_管理员 DTO 转换 BO */
	public TCompanyBO toBO() {
		return TCompanyBO.builder()
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
