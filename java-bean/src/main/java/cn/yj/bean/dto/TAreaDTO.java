package cn.yj.bean.dto;

import cn.yj.bean.bo.TAreaBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_区域 */
@ApiModel("表_区域 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TAreaDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**地区名称CN*/
	@ApiModelProperty(value = "地区名称CN", example = "String" )
	private String areaNameCN;

	/**地区名称EN*/
	@ApiModelProperty(value = "地区名称EN", example = "String" )
	private String areaNameEN;

	/**父级ID*/
	@ApiModelProperty(value = "父级ID", example = "String" )
	private String upLevelID;

	/**等级*/
	@ApiModelProperty(value = "等级", example = "0" )
	private Integer areaLevel;

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

	/** 表_区域 BO 转换 DTO */
	public static TAreaDTO toDTO(TAreaBO bo) {
		if (bo != null) {
			return TAreaDTO.builder()
					.keyID(bo.getKeyID())
					.areaNameCN(bo.getAreaNameCN())
					.areaNameEN(bo.getAreaNameEN())
					.upLevelID(bo.getUpLevelID())
					.areaLevel(bo.getAreaLevel())
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

	/** 表_区域 BO 数组 转换 DTO List */
	public static List<TAreaDTO> toDTO(TAreaBO[] bos) {
		List<TAreaDTO> dtos = new ArrayList<>();
		for (TAreaBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_区域 BO List 转换 DTO List */
	public static List<TAreaDTO> toDTO(List<TAreaBO> bos) {
		List<TAreaDTO> dtos = new ArrayList<>();
		for (TAreaBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_区域 DTO 转换 BO */
	public static TAreaBO toBO(TAreaDTO dto) {
		if (dto != null) {
			return TAreaBO.builder()
					.keyID(dto.getKeyID())
					.areaNameCN(dto.getAreaNameCN())
					.areaNameEN(dto.getAreaNameEN())
					.upLevelID(dto.getUpLevelID())
					.areaLevel(dto.getAreaLevel())
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

	/** 表_区域 DTO List 转换 BO List */
	public static List<TAreaBO> toBO(List<TAreaDTO> dtos) {
		List<TAreaBO> bos = new ArrayList<>();
		for (TAreaDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_区域 DTO 转换 BO */
	public TAreaBO toBO() {
		return TAreaBO.builder()
				.keyID(this.getKeyID())
				.areaNameCN(this.getAreaNameCN())
				.areaNameEN(this.getAreaNameEN())
				.upLevelID(this.getUpLevelID())
				.areaLevel(this.getAreaLevel())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
