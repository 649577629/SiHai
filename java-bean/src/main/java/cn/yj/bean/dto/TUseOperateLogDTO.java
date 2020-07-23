package cn.yj.bean.dto;

import cn.yj.bean.bo.TUseOperateLogBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_用户操作记录表 */
@ApiModel("表_用户操作记录表 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TUseOperateLogDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**用户ID*/
	@ApiModelProperty(value = "用户ID", example = "String" )
	private String userID;

	/**操作行为*/
	@ApiModelProperty(value = "操作行为", example = "String" )
	private String logAction;

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

	/** 表_用户操作记录表 BO 转换 DTO */
	public static TUseOperateLogDTO toDTO(TUseOperateLogBO bo) {
		if (bo != null) {
			return TUseOperateLogDTO.builder()
					.keyID(bo.getKeyID())
					.userID(bo.getUserID())
					.logAction(bo.getLogAction())
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

	/** 表_用户操作记录表 BO 数组 转换 DTO List */
	public static List<TUseOperateLogDTO> toDTO(TUseOperateLogBO[] bos) {
		List<TUseOperateLogDTO> dtos = new ArrayList<>();
		for (TUseOperateLogBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_用户操作记录表 BO List 转换 DTO List */
	public static List<TUseOperateLogDTO> toDTO(List<TUseOperateLogBO> bos) {
		List<TUseOperateLogDTO> dtos = new ArrayList<>();
		for (TUseOperateLogBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_用户操作记录表 DTO 转换 BO */
	public static TUseOperateLogBO toBO(TUseOperateLogDTO dto) {
		if (dto != null) {
			return TUseOperateLogBO.builder()
					.keyID(dto.getKeyID())
					.userID(dto.getUserID())
					.logAction(dto.getLogAction())
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

	/** 表_用户操作记录表 DTO List 转换 BO List */
	public static List<TUseOperateLogBO> toBO(List<TUseOperateLogDTO> dtos) {
		List<TUseOperateLogBO> bos = new ArrayList<>();
		for (TUseOperateLogDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_用户操作记录表 DTO 转换 BO */
	public TUseOperateLogBO toBO() {
		return TUseOperateLogBO.builder()
				.keyID(this.getKeyID())
				.userID(this.getUserID())
				.logAction(this.getLogAction())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
