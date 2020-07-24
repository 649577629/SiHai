package cn.yj.bean.dto;

import cn.yj.bean.bo.TUserRoleBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_用户角色关系 */
@ApiModel("表_用户角色关系 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TUserRoleDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**用户ID*/
	@ApiModelProperty(value = "用户ID", example = "String" )
	private String userID;

	/**角色ID*/
	@ApiModelProperty(value = "角色ID", example = "String" )
	private String roleID;

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

	/**状态(0.正常 99.删除)*/
	@ApiModelProperty(value = "状态(0.正常 99.删除)", example = "0" )
	private Integer state;

	//------------------------------------------------------------------------------------------------------------------转换

	/** 表_用户角色关系 BO 转换 DTO */
	public static TUserRoleDTO toDTO(TUserRoleBO bo) {
		if (bo != null) {
			return TUserRoleDTO.builder()
					.keyID(bo.getKeyID())
					.userID(bo.getUserID())
					.roleID(bo.getRoleID())
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

	/** 表_用户角色关系 BO 数组 转换 DTO List */
	public static List<TUserRoleDTO> toDTO(TUserRoleBO[] bos) {
		List<TUserRoleDTO> dtos = new ArrayList<>();
		for (TUserRoleBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_用户角色关系 BO List 转换 DTO List */
	public static List<TUserRoleDTO> toDTO(List<TUserRoleBO> bos) {
		List<TUserRoleDTO> dtos = new ArrayList<>();
		for (TUserRoleBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_用户角色关系 DTO 转换 BO */
	public static TUserRoleBO toBO(TUserRoleDTO dto) {
		if (dto != null) {
			return TUserRoleBO.builder()
					.keyID(dto.getKeyID())
					.userID(dto.getUserID())
					.roleID(dto.getRoleID())
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

	/** 表_用户角色关系 DTO List 转换 BO List */
	public static List<TUserRoleBO> toBO(List<TUserRoleDTO> dtos) {
		List<TUserRoleBO> bos = new ArrayList<>();
		for (TUserRoleDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_用户角色关系 DTO 转换 BO */
	public TUserRoleBO toBO() {
		return TUserRoleBO.builder()
				.keyID(this.getKeyID())
				.userID(this.getUserID())
				.roleID(this.getRoleID())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
