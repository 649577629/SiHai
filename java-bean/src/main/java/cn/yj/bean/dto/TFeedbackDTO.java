package cn.yj.bean.dto;

import cn.yj.bean.bo.TFeedbackBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_反馈信息表 */
@ApiModel("表_反馈信息表 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TFeedbackDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**用户ID*/
	@ApiModelProperty(value = "用户ID", example = "String" )
	private String userID;

	/**反馈内容*/
	@ApiModelProperty(value = "反馈内容", example = "String" )
	private String remark;

	/**图片地址*/
	@ApiModelProperty(value = "图片地址", example = "String" )
	private String pictureUrl;

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

	/** 表_反馈信息表 BO 转换 DTO */
	public static TFeedbackDTO toDTO(TFeedbackBO bo) {
		if (bo != null) {
			return TFeedbackDTO.builder()
					.keyID(bo.getKeyID())
					.userID(bo.getUserID())
					.remark(bo.getRemark())
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

	/** 表_反馈信息表 BO 数组 转换 DTO List */
	public static List<TFeedbackDTO> toDTO(TFeedbackBO[] bos) {
		List<TFeedbackDTO> dtos = new ArrayList<>();
		for (TFeedbackBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_反馈信息表 BO List 转换 DTO List */
	public static List<TFeedbackDTO> toDTO(List<TFeedbackBO> bos) {
		List<TFeedbackDTO> dtos = new ArrayList<>();
		for (TFeedbackBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_反馈信息表 DTO 转换 BO */
	public static TFeedbackBO toBO(TFeedbackDTO dto) {
		if (dto != null) {
			return TFeedbackBO.builder()
					.keyID(dto.getKeyID())
					.userID(dto.getUserID())
					.remark(dto.getRemark())
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

	/** 表_反馈信息表 DTO List 转换 BO List */
	public static List<TFeedbackBO> toBO(List<TFeedbackDTO> dtos) {
		List<TFeedbackBO> bos = new ArrayList<>();
		for (TFeedbackDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_反馈信息表 DTO 转换 BO */
	public TFeedbackBO toBO() {
		return TFeedbackBO.builder()
				.keyID(this.getKeyID())
				.userID(this.getUserID())
				.remark(this.getRemark())
				.pictureUrl(this.getPictureUrl())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
