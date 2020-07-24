package cn.yj.bean.dto;

import cn.yj.bean.bo.TSearchLogBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_搜索记录表 */
@ApiModel("表_搜索记录表 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TSearchLogDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**用户ID*/
	@ApiModelProperty(value = "用户ID", example = "String" )
	private String userID;

	/**搜索内容*/
	@ApiModelProperty(value = "搜索内容", example = "String" )
	private String content;

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

	/** 表_搜索记录表 BO 转换 DTO */
	public static TSearchLogDTO toDTO(TSearchLogBO bo) {
		if (bo != null) {
			return TSearchLogDTO.builder()
					.keyID(bo.getKeyID())
					.userID(bo.getUserID())
					.content(bo.getContent())
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

	/** 表_搜索记录表 BO 数组 转换 DTO List */
	public static List<TSearchLogDTO> toDTO(TSearchLogBO[] bos) {
		List<TSearchLogDTO> dtos = new ArrayList<>();
		for (TSearchLogBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_搜索记录表 BO List 转换 DTO List */
	public static List<TSearchLogDTO> toDTO(List<TSearchLogBO> bos) {
		List<TSearchLogDTO> dtos = new ArrayList<>();
		for (TSearchLogBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_搜索记录表 DTO 转换 BO */
	public static TSearchLogBO toBO(TSearchLogDTO dto) {
		if (dto != null) {
			return TSearchLogBO.builder()
					.keyID(dto.getKeyID())
					.userID(dto.getUserID())
					.content(dto.getContent())
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

	/** 表_搜索记录表 DTO List 转换 BO List */
	public static List<TSearchLogBO> toBO(List<TSearchLogDTO> dtos) {
		List<TSearchLogBO> bos = new ArrayList<>();
		for (TSearchLogDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_搜索记录表 DTO 转换 BO */
	public TSearchLogBO toBO() {
		return TSearchLogBO.builder()
				.keyID(this.getKeyID())
				.userID(this.getUserID())
				.content(this.getContent())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
