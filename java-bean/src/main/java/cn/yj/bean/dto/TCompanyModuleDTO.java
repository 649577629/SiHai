package cn.yj.bean.dto;

import cn.yj.bean.bo.TCompanyModuleBO;
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
public class TCompanyModuleDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**公司ID*/
	@ApiModelProperty(value = "公司ID", example = "String" )
	private String compnayID;

	/**模块ID*/
	@ApiModelProperty(value = "模块ID", example = "String" )
	private String moduleID;

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

	/** 表_角色菜单关系 BO 转换 DTO */
	public static TCompanyModuleDTO toDTO(TCompanyModuleBO bo) {
		if (bo != null) {
			return TCompanyModuleDTO.builder()
					.keyID(bo.getKeyID())
					.compnayID(bo.getCompnayID())
					.moduleID(bo.getModuleID())
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
	public static List<TCompanyModuleDTO> toDTO(TCompanyModuleBO[] bos) {
		List<TCompanyModuleDTO> dtos = new ArrayList<>();
		for (TCompanyModuleBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_角色菜单关系 BO List 转换 DTO List */
	public static List<TCompanyModuleDTO> toDTO(List<TCompanyModuleBO> bos) {
		List<TCompanyModuleDTO> dtos = new ArrayList<>();
		for (TCompanyModuleBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_角色菜单关系 DTO 转换 BO */
	public static TCompanyModuleBO toBO(TCompanyModuleDTO dto) {
		if (dto != null) {
			return TCompanyModuleBO.builder()
					.keyID(dto.getKeyID())
					.compnayID(dto.getCompnayID())
					.moduleID(dto.getModuleID())
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
	public static List<TCompanyModuleBO> toBO(List<TCompanyModuleDTO> dtos) {
		List<TCompanyModuleBO> bos = new ArrayList<>();
		for (TCompanyModuleDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_角色菜单关系 DTO 转换 BO */
	public TCompanyModuleBO toBO() {
		return TCompanyModuleBO.builder()
				.keyID(this.getKeyID())
				.compnayID(this.getCompnayID())
				.moduleID(this.getModuleID())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
