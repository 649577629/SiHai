package cn.yj.bean.dto;

import cn.yj.bean.bo.TModuleBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_模块分类 */
@ApiModel("表_模块分类 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TModuleDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**模块名称*/
	@ApiModelProperty(value = "模块名称", example = "String" )
	private String moduleName;

	/**模块排序*/
	@ApiModelProperty(value = "模块排序", example = "0" )
	private Integer moduleOrder;

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

	/** 表_模块分类 BO 转换 DTO */
	public static TModuleDTO toDTO(TModuleBO bo) {
		if (bo != null) {
			return TModuleDTO.builder()
					.keyID(bo.getKeyID())
					.moduleName(bo.getModuleName())
					.moduleOrder(bo.getModuleOrder())
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

	/** 表_模块分类 BO 数组 转换 DTO List */
	public static List<TModuleDTO> toDTO(TModuleBO[] bos) {
		List<TModuleDTO> dtos = new ArrayList<>();
		for (TModuleBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_模块分类 BO List 转换 DTO List */
	public static List<TModuleDTO> toDTO(List<TModuleBO> bos) {
		List<TModuleDTO> dtos = new ArrayList<>();
		for (TModuleBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_模块分类 DTO 转换 BO */
	public static TModuleBO toBO(TModuleDTO dto) {
		if (dto != null) {
			return TModuleBO.builder()
					.keyID(dto.getKeyID())
					.moduleName(dto.getModuleName())
					.moduleOrder(dto.getModuleOrder())
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

	/** 表_模块分类 DTO List 转换 BO List */
	public static List<TModuleBO> toBO(List<TModuleDTO> dtos) {
		List<TModuleBO> bos = new ArrayList<>();
		for (TModuleDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_模块分类 DTO 转换 BO */
	public TModuleBO toBO() {
		return TModuleBO.builder()
				.keyID(this.getKeyID())
				.moduleName(this.getModuleName())
				.moduleOrder(this.getModuleOrder())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
