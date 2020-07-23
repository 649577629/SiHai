package cn.yj.bean.dto;

import cn.yj.bean.bo.TPictureClassBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_图片分类 */
@ApiModel("表_图片分类 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TPictureClassDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**图片名称*/
	@ApiModelProperty(value = "图片名称", example = "String" )
	private String className;

	/**分类描述*/
	@ApiModelProperty(value = "分类描述", example = "String" )
	private String pictureDetails;

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

	/** 表_图片分类 BO 转换 DTO */
	public static TPictureClassDTO toDTO(TPictureClassBO bo) {
		if (bo != null) {
			return TPictureClassDTO.builder()
					.keyID(bo.getKeyID())
					.className(bo.getClassName())
					.pictureDetails(bo.getPictureDetails())
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

	/** 表_图片分类 BO 数组 转换 DTO List */
	public static List<TPictureClassDTO> toDTO(TPictureClassBO[] bos) {
		List<TPictureClassDTO> dtos = new ArrayList<>();
		for (TPictureClassBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_图片分类 BO List 转换 DTO List */
	public static List<TPictureClassDTO> toDTO(List<TPictureClassBO> bos) {
		List<TPictureClassDTO> dtos = new ArrayList<>();
		for (TPictureClassBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_图片分类 DTO 转换 BO */
	public static TPictureClassBO toBO(TPictureClassDTO dto) {
		if (dto != null) {
			return TPictureClassBO.builder()
					.keyID(dto.getKeyID())
					.className(dto.getClassName())
					.pictureDetails(dto.getPictureDetails())
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

	/** 表_图片分类 DTO List 转换 BO List */
	public static List<TPictureClassBO> toBO(List<TPictureClassDTO> dtos) {
		List<TPictureClassBO> bos = new ArrayList<>();
		for (TPictureClassDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_图片分类 DTO 转换 BO */
	public TPictureClassBO toBO() {
		return TPictureClassBO.builder()
				.keyID(this.getKeyID())
				.className(this.getClassName())
				.pictureDetails(this.getPictureDetails())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
