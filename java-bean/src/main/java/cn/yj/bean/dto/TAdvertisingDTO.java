package cn.yj.bean.dto;

import cn.yj.bean.bo.TAdvertisingBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_广告 */
@ApiModel("表_广告 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TAdvertisingDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**关联公司ID*/
	@ApiModelProperty(value = "关联公司ID", example = "String" )
	private String companyID;

	/**广告内容*/
	@ApiModelProperty(value = "广告内容", example = "String" )
	private String adContent;

	/**上架时间*/
	@ApiModelProperty(value = "上架时间", example = "2020-07-21 23:42:44" )
	private Date setTime;

	/**下架时间*/
	@ApiModelProperty(value = "下架时间", example = "2020-07-21 23:42:44" )
	private Date downTime;

	/**创建时间*/
	@ApiModelProperty(value = "创建时间", example = "2020-07-21 23:42:44" )
	private Date createTime;

	/**创建用户ID*/
	@ApiModelProperty(value = "创建用户ID", example = "String" )
	private String createID;

	/**修改时间*/
	@ApiModelProperty(value = "修改时间", example = "2020-07-21 23:42:44" )
	private Date updateTime;

	/**修改用户ID*/
	@ApiModelProperty(value = "修改用户ID", example = "String" )
	private String updateID;

	/**状态(0.正常 99.删除)*/
	@ApiModelProperty(value = "状态(0.正常 99.删除)", example = "0" )
	private Integer state;

	//------------------------------------------------------------------------------------------------------------------转换

	/** 表_广告 BO 转换 DTO */
	public static TAdvertisingDTO toDTO(TAdvertisingBO bo) {
		if (bo != null) {
			return TAdvertisingDTO.builder()
					.keyID(bo.getKeyID())
					.companyID(bo.getCompanyID())
					.adContent(bo.getAdContent())
					.setTime(bo.getSetTime())
					.downTime(bo.getDownTime())
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

	/** 表_广告 BO 数组 转换 DTO List */
	public static List<TAdvertisingDTO> toDTO(TAdvertisingBO[] bos) {
		List<TAdvertisingDTO> dtos = new ArrayList<>();
		for (TAdvertisingBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_广告 BO List 转换 DTO List */
	public static List<TAdvertisingDTO> toDTO(List<TAdvertisingBO> bos) {
		List<TAdvertisingDTO> dtos = new ArrayList<>();
		for (TAdvertisingBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_广告 DTO 转换 BO */
	public static TAdvertisingBO toBO(TAdvertisingDTO dto) {
		if (dto != null) {
			return TAdvertisingBO.builder()
					.keyID(dto.getKeyID())
					.companyID(dto.getCompanyID())
					.adContent(dto.getAdContent())
					.setTime(dto.getSetTime())
					.downTime(dto.getDownTime())
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

	/** 表_广告 DTO List 转换 BO List */
	public static List<TAdvertisingBO> toBO(List<TAdvertisingDTO> dtos) {
		List<TAdvertisingBO> bos = new ArrayList<>();
		for (TAdvertisingDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_广告 DTO 转换 BO */
	public TAdvertisingBO toBO() {
		return TAdvertisingBO.builder()
				.keyID(this.getKeyID())
				.companyID(this.getCompanyID())
				.adContent(this.getAdContent())
				.setTime(this.getSetTime())
				.downTime(this.getDownTime())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
