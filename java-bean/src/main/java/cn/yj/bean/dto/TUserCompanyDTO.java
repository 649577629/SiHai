package cn.yj.bean.dto;

import cn.yj.bean.bo.TUserCompanyBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_用户公司关系 */
@ApiModel("表_用户公司关系 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TUserCompanyDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**用户ID*/
	@ApiModelProperty(value = "用户ID", example = "String" )
	private String userID;

	/**公司ID*/
	@ApiModelProperty(value = "公司ID", example = "String" )
	private String companyID;

	/**创建时间*/
	@ApiModelProperty(value = "创建时间", example = "2020-07-24 11:16:02" )
	private Date createTime;

	/**创建用户ID*/
	@ApiModelProperty(value = "创建用户ID", example = "String" )
	private String createID;

	/**修改时间*/
	@ApiModelProperty(value = "修改时间", example = "2020-07-24 11:16:02" )
	private Date updateTime;

	/**修改用户ID*/
	@ApiModelProperty(value = "修改用户ID", example = "String" )
	private String updateID;

	/**状态(0.正常 99.删除)*/
	@ApiModelProperty(value = "状态(0.正常 99.删除)", example = "0" )
	private Integer state;

	//------------------------------------------------------------------------------------------------------------------转换

	/** 表_用户公司关系 BO 转换 DTO */
	public static TUserCompanyDTO toDTO(TUserCompanyBO bo) {
		if (bo != null) {
			return TUserCompanyDTO.builder()
					.keyID(bo.getKeyID())
					.userID(bo.getUserID())
					.companyID(bo.getCompanyID())
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

	/** 表_用户公司关系 BO 数组 转换 DTO List */
	public static List<TUserCompanyDTO> toDTO(TUserCompanyBO[] bos) {
		List<TUserCompanyDTO> dtos = new ArrayList<>();
		for (TUserCompanyBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_用户公司关系 BO List 转换 DTO List */
	public static List<TUserCompanyDTO> toDTO(List<TUserCompanyBO> bos) {
		List<TUserCompanyDTO> dtos = new ArrayList<>();
		for (TUserCompanyBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_用户公司关系 DTO 转换 BO */
	public static TUserCompanyBO toBO(TUserCompanyDTO dto) {
		if (dto != null) {
			return TUserCompanyBO.builder()
					.keyID(dto.getKeyID())
					.userID(dto.getUserID())
					.companyID(dto.getCompanyID())
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

	/** 表_用户公司关系 DTO List 转换 BO List */
	public static List<TUserCompanyBO> toBO(List<TUserCompanyDTO> dtos) {
		List<TUserCompanyBO> bos = new ArrayList<>();
		for (TUserCompanyDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_用户公司关系 DTO 转换 BO */
	public TUserCompanyBO toBO() {
		return TUserCompanyBO.builder()
				.keyID(this.getKeyID())
				.userID(this.getUserID())
				.companyID(this.getCompanyID())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
