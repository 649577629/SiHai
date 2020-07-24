package cn.yj.bean.dto;

import cn.yj.bean.bo.TRoleBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_角色 */
@ApiModel("表_角色 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TRoleDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**名称*/
	@ApiModelProperty(value = "名称", example = "String" )
	private String roleName;

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

	/**状态(0.正常 99.删除)*/
	@ApiModelProperty(value = "状态(0.正常 99.删除)", example = "0" )
	private Integer state;

	//------------------------------------------------------------------------------------------------------------------转换

	/** 表_角色 BO 转换 DTO */
	public static TRoleDTO toDTO(TRoleBO bo) {
		if (bo != null) {
			return TRoleDTO.builder()
					.keyID(bo.getKeyID())
					.roleName(bo.getRoleName())
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

	/** 表_角色 BO 数组 转换 DTO List */
	public static List<TRoleDTO> toDTO(TRoleBO[] bos) {
		List<TRoleDTO> dtos = new ArrayList<>();
		for (TRoleBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_角色 BO List 转换 DTO List */
	public static List<TRoleDTO> toDTO(List<TRoleBO> bos) {
		List<TRoleDTO> dtos = new ArrayList<>();
		for (TRoleBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_角色 DTO 转换 BO */
	public static TRoleBO toBO(TRoleDTO dto) {
		if (dto != null) {
			return TRoleBO.builder()
					.keyID(dto.getKeyID())
					.roleName(dto.getRoleName())
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

	/** 表_角色 DTO List 转换 BO List */
	public static List<TRoleBO> toBO(List<TRoleDTO> dtos) {
		List<TRoleBO> bos = new ArrayList<>();
		for (TRoleDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_角色 DTO 转换 BO */
	public TRoleBO toBO() {
		return TRoleBO.builder()
				.keyID(this.getKeyID())
				.roleName(this.getRoleName())
				.remark(this.getRemark())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
