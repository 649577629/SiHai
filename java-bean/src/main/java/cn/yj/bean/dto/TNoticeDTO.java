package cn.yj.bean.dto;

import cn.yj.bean.bo.TNoticeBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_公告 */
@ApiModel("表_公告 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TNoticeDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**图片名称*/
	@ApiModelProperty(value = "图片名称", example = "String" )
	private String noticeIntroduction;

	/**展示名称*/
	@ApiModelProperty(value = "展示名称", example = "String" )
	private String noticeDetails;

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

	/** 表_公告 BO 转换 DTO */
	public static TNoticeDTO toDTO(TNoticeBO bo) {
		if (bo != null) {
			return TNoticeDTO.builder()
					.keyID(bo.getKeyID())
					.noticeIntroduction(bo.getNoticeIntroduction())
					.noticeDetails(bo.getNoticeDetails())
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

	/** 表_公告 BO 数组 转换 DTO List */
	public static List<TNoticeDTO> toDTO(TNoticeBO[] bos) {
		List<TNoticeDTO> dtos = new ArrayList<>();
		for (TNoticeBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_公告 BO List 转换 DTO List */
	public static List<TNoticeDTO> toDTO(List<TNoticeBO> bos) {
		List<TNoticeDTO> dtos = new ArrayList<>();
		for (TNoticeBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_公告 DTO 转换 BO */
	public static TNoticeBO toBO(TNoticeDTO dto) {
		if (dto != null) {
			return TNoticeBO.builder()
					.keyID(dto.getKeyID())
					.noticeIntroduction(dto.getNoticeIntroduction())
					.noticeDetails(dto.getNoticeDetails())
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

	/** 表_公告 DTO List 转换 BO List */
	public static List<TNoticeBO> toBO(List<TNoticeDTO> dtos) {
		List<TNoticeBO> bos = new ArrayList<>();
		for (TNoticeDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_公告 DTO 转换 BO */
	public TNoticeBO toBO() {
		return TNoticeBO.builder()
				.keyID(this.getKeyID())
				.noticeIntroduction(this.getNoticeIntroduction())
				.noticeDetails(this.getNoticeDetails())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
