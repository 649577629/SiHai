package cn.yj.bean.dto;

import cn.yj.bean.bo.TAdminBO;
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
public class TAdminDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**用户编号*/
	@ApiModelProperty(value = "用户编号", example = "String" )
	private String userNo;

	/**用户姓名*/
	@ApiModelProperty(value = "用户姓名", example = "String" )
	private String userName;

	/**用户年龄*/
	@ApiModelProperty(value = "用户年龄", example = "0" )
	private Integer userAge;

	/**用户性别(0.未知 1.男 2.女)*/
	@ApiModelProperty(value = "用户性别(0.未知 1.男 2.女)", example = "0" )
	private Integer userSex;

	/**用户住址*/
	@ApiModelProperty(value = "用户住址", example = "String" )
	private String userAddress;

	/**身份证*/
	@ApiModelProperty(value = "身份证", example = "String" )
	private String iDCard;

	/**用户手机号*/
	@ApiModelProperty(value = "用户手机号", example = "String" )
	private String mobile;

	/**用户邮箱*/
	@ApiModelProperty(value = "用户邮箱", example = "String" )
	private String email;

	/**用户账号*/
	@ApiModelProperty(value = "用户账号", example = "String" )
	private String account;

	/**用户MD5登陆密码*/
	@ApiModelProperty(value = "用户MD5登陆密码", example = "String" )
	private String loginPasswordMD5;

	/**用户类型(1001.管理员 2001.客服 10001.普通用户)*/
	@ApiModelProperty(value = "用户类型(1001.管理员 2001.客服 10001.普通用户)", example = "0" )
	private Integer userType;

	/**备注*/
	@ApiModelProperty(value = "备注", example = "String" )
	private String remark;

	/**创建时间*/
	@ApiModelProperty(value = "创建时间", example = "2020-07-24 11:39:49" )
	private Date createTime;

	/**创建用户ID*/
	@ApiModelProperty(value = "创建用户ID", example = "String" )
	private String createID;

	/**修改时间*/
	@ApiModelProperty(value = "修改时间", example = "2020-07-24 11:39:49" )
	private Date updateTime;

	/**修改用户ID*/
	@ApiModelProperty(value = "修改用户ID", example = "String" )
	private String updateID;

	/**状态(0.正常 1.冻结 99.删除)*/
	@ApiModelProperty(value = "状态(0.正常 1.冻结 99.删除)", example = "0" )
	private Integer state;

	//------------------------------------------------------------------------------------------------------------------转换

	/** 表_管理员 BO 转换 DTO */
	public static TAdminDTO toDTO(TAdminBO bo) {
		if (bo != null) {
			return TAdminDTO.builder()
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

	/** 表_管理员 BO 数组 转换 DTO List */
	public static List<TAdminDTO> toDTO(TAdminBO[] bos) {
		List<TAdminDTO> dtos = new ArrayList<>();
		for (TAdminBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_管理员 BO List 转换 DTO List */
	public static List<TAdminDTO> toDTO(List<TAdminBO> bos) {
		List<TAdminDTO> dtos = new ArrayList<>();
		for (TAdminBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_管理员 DTO 转换 BO */
	public static TAdminBO toBO(TAdminDTO dto) {
		if (dto != null) {
			return TAdminBO.builder()
					.keyID(dto.getKeyID())
					.userNo(dto.getUserNo())
					.userName(dto.getUserName())
					.userAge(dto.getUserAge())
					.userSex(dto.getUserSex())
					.userAddress(dto.getUserAddress())
					.iDCard(dto.getIDCard())
					.mobile(dto.getMobile())
					.email(dto.getEmail())
					.account(dto.getAccount())
					.loginPasswordMD5(dto.getLoginPasswordMD5())
					.userType(dto.getUserType())
					.remark(dto.getRemark())
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
	public static List<TAdminBO> toBO(List<TAdminDTO> dtos) {
		List<TAdminBO> bos = new ArrayList<>();
		for (TAdminDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_管理员 DTO 转换 BO */
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
