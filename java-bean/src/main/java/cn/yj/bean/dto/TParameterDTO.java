package cn.yj.bean.dto;

import cn.yj.bean.bo.TParameterBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_参数 */
@ApiModel("表_参数 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TParameterDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**参数代码*/
	@ApiModelProperty(value = "参数代码", example = "String" )
	private String parameterCode;

	/**参数名称*/
	@ApiModelProperty(value = "参数名称", example = "String" )
	private String parameterName;

	/**参数值*/
	@ApiModelProperty(value = "参数值", example = "String" )
	private String parameterValue;

	/**参数说明*/
	@ApiModelProperty(value = "参数说明", example = "String" )
	private String parameterExplain;

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

	/** 表_参数 BO 转换 DTO */
	public static TParameterDTO toDTO(TParameterBO bo) {
		if (bo != null) {
			return TParameterDTO.builder()
					.keyID(bo.getKeyID())
					.parameterCode(bo.getParameterCode())
					.parameterName(bo.getParameterName())
					.parameterValue(bo.getParameterValue())
					.parameterExplain(bo.getParameterExplain())
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

	/** 表_参数 BO 数组 转换 DTO List */
	public static List<TParameterDTO> toDTO(TParameterBO[] bos) {
		List<TParameterDTO> dtos = new ArrayList<>();
		for (TParameterBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_参数 BO List 转换 DTO List */
	public static List<TParameterDTO> toDTO(List<TParameterBO> bos) {
		List<TParameterDTO> dtos = new ArrayList<>();
		for (TParameterBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_参数 DTO 转换 BO */
	public static TParameterBO toBO(TParameterDTO dto) {
		if (dto != null) {
			return TParameterBO.builder()
					.keyID(dto.getKeyID())
					.parameterCode(dto.getParameterCode())
					.parameterName(dto.getParameterName())
					.parameterValue(dto.getParameterValue())
					.parameterExplain(dto.getParameterExplain())
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

	/** 表_参数 DTO List 转换 BO List */
	public static List<TParameterBO> toBO(List<TParameterDTO> dtos) {
		List<TParameterBO> bos = new ArrayList<>();
		for (TParameterDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_参数 DTO 转换 BO */
	public TParameterBO toBO() {
		return TParameterBO.builder()
				.keyID(this.getKeyID())
				.parameterCode(this.getParameterCode())
				.parameterName(this.getParameterName())
				.parameterValue(this.getParameterValue())
				.parameterExplain(this.getParameterExplain())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
