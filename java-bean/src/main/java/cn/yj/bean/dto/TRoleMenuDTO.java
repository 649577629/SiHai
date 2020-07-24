package cn.yj.bean.dto;

import cn.yj.bean.bo.TRoleMenuBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_角色菜单关系 */
@ApiModel("表_角色菜单关系 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TRoleMenuDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**角色ID*/
	@ApiModelProperty(value = "角色ID", example = "String" )
	private String roleID;

	/**菜单ID*/
	@ApiModelProperty(value = "菜单ID", example = "String" )
	private String menuID;

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

	/** 表_角色菜单关系 BO 转换 DTO */
	public static TRoleMenuDTO toDTO(TRoleMenuBO bo) {
		if (bo != null) {
			return TRoleMenuDTO.builder()
					.keyID(bo.getKeyID())
					.roleID(bo.getRoleID())
					.menuID(bo.getMenuID())
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

	/** 表_角色菜单关系 BO 数组 转换 DTO List */
	public static List<TRoleMenuDTO> toDTO(TRoleMenuBO[] bos) {
		List<TRoleMenuDTO> dtos = new ArrayList<>();
		for (TRoleMenuBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_角色菜单关系 BO List 转换 DTO List */
	public static List<TRoleMenuDTO> toDTO(List<TRoleMenuBO> bos) {
		List<TRoleMenuDTO> dtos = new ArrayList<>();
		for (TRoleMenuBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_角色菜单关系 DTO 转换 BO */
	public static TRoleMenuBO toBO(TRoleMenuDTO dto) {
		if (dto != null) {
			return TRoleMenuBO.builder()
					.keyID(dto.getKeyID())
					.roleID(dto.getRoleID())
					.menuID(dto.getMenuID())
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

	/** 表_角色菜单关系 DTO List 转换 BO List */
	public static List<TRoleMenuBO> toBO(List<TRoleMenuDTO> dtos) {
		List<TRoleMenuBO> bos = new ArrayList<>();
		for (TRoleMenuDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_角色菜单关系 DTO 转换 BO */
	public TRoleMenuBO toBO() {
		return TRoleMenuBO.builder()
				.keyID(this.getKeyID())
				.roleID(this.getRoleID())
				.menuID(this.getMenuID())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
