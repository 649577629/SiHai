package cn.yj.bean.dto;

import cn.yj.bean.bo.TPictureBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_图片 */
@ApiModel("表_图片 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TPictureDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**所属分类ID*/
	@ApiModelProperty(value = "所属分类ID", example = "String" )
	private String pictureClassId;

	/**关联ID*/
	@ApiModelProperty(value = "关联ID", example = "String" )
	private String relationID;

	/**图片名称*/
	@ApiModelProperty(value = "图片名称", example = "String" )
	private String pictureName;

	/**展示名称*/
	@ApiModelProperty(value = "展示名称", example = "String" )
	private String showName;

	/**图片地址*/
	@ApiModelProperty(value = "图片地址", example = "String" )
	private String pictureUrl;

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

	/** 表_图片 BO 转换 DTO */
	public static TPictureDTO toDTO(TPictureBO bo) {
		if (bo != null) {
			return TPictureDTO.builder()
					.keyID(bo.getKeyID())
					.pictureClassId(bo.getPictureClassId())
					.relationID(bo.getRelationID())
					.pictureName(bo.getPictureName())
					.showName(bo.getShowName())
					.pictureUrl(bo.getPictureUrl())
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

	/** 表_图片 BO 数组 转换 DTO List */
	public static List<TPictureDTO> toDTO(TPictureBO[] bos) {
		List<TPictureDTO> dtos = new ArrayList<>();
		for (TPictureBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_图片 BO List 转换 DTO List */
	public static List<TPictureDTO> toDTO(List<TPictureBO> bos) {
		List<TPictureDTO> dtos = new ArrayList<>();
		for (TPictureBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_图片 DTO 转换 BO */
	public static TPictureBO toBO(TPictureDTO dto) {
		if (dto != null) {
			return TPictureBO.builder()
					.keyID(dto.getKeyID())
					.pictureClassId(dto.getPictureClassId())
					.relationID(dto.getRelationID())
					.pictureName(dto.getPictureName())
					.showName(dto.getShowName())
					.pictureUrl(dto.getPictureUrl())
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

	/** 表_图片 DTO List 转换 BO List */
	public static List<TPictureBO> toBO(List<TPictureDTO> dtos) {
		List<TPictureBO> bos = new ArrayList<>();
		for (TPictureDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_图片 DTO 转换 BO */
	public TPictureBO toBO() {
		return TPictureBO.builder()
				.keyID(this.getKeyID())
				.pictureClassId(this.getPictureClassId())
				.relationID(this.getRelationID())
				.pictureName(this.getPictureName())
				.showName(this.getShowName())
				.pictureUrl(this.getPictureUrl())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
