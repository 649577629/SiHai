package cn.yj.bean.dto;

import cn.yj.bean.bo.TMenuBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_菜单 */
@ApiModel("表_菜单 实体类")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TMenuDTO implements Serializable {

	/**主键ID*/
	@ApiModelProperty(value = "主键ID", example = "String" , required = true)
	private String keyID;

	/**名称*/
	@ApiModelProperty(value = "名称", example = "String" )
	private String menuName;

	/**路径*/
	@ApiModelProperty(value = "路径", example = "String" )
	private String menuUrl;

	/**菜单标识*/
	@ApiModelProperty(value = "菜单标识", example = "String" )
	private String menuSign;

	/**父级ID*/
	@ApiModelProperty(value = "父级ID", example = "String" )
	private String parentID;

	/**是否跳转  (0.否 1.是)*/
	@ApiModelProperty(value = "是否跳转  (0.否 1.是)", example = "0" )
	private Integer isTurn;

	/**排序(按数字从小到大)*/
	@ApiModelProperty(value = "排序(按数字从小到大)", example = "0" )
	private Integer menuOrder;

	/**备注*/
	@ApiModelProperty(value = "备注", example = "String" )
	private String remark;

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

	/** 表_菜单 BO 转换 DTO */
	public static TMenuDTO toDTO(TMenuBO bo) {
		if (bo != null) {
			return TMenuDTO.builder()
					.keyID(bo.getKeyID())
					.menuName(bo.getMenuName())
					.menuUrl(bo.getMenuUrl())
					.menuSign(bo.getMenuSign())
					.parentID(bo.getParentID())
					.isTurn(bo.getIsTurn())
					.menuOrder(bo.getMenuOrder())
					.remark(bo.getRemark())
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

	/** 表_菜单 BO 数组 转换 DTO List */
	public static List<TMenuDTO> toDTO(TMenuBO[] bos) {
		List<TMenuDTO> dtos = new ArrayList<>();
		for (TMenuBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_菜单 BO List 转换 DTO List */
	public static List<TMenuDTO> toDTO(List<TMenuBO> bos) {
		List<TMenuDTO> dtos = new ArrayList<>();
		for (TMenuBO bo : bos) {
			dtos.add(toDTO(bo));
		}
		return dtos;
	}

	/** 表_菜单 DTO 转换 BO */
	public static TMenuBO toBO(TMenuDTO dto) {
		if (dto != null) {
			return TMenuBO.builder()
					.keyID(dto.getKeyID())
					.menuName(dto.getMenuName())
					.menuUrl(dto.getMenuUrl())
					.menuSign(dto.getMenuSign())
					.parentID(dto.getParentID())
					.isTurn(dto.getIsTurn())
					.menuOrder(dto.getMenuOrder())
					.remark(dto.getRemark())
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

	/** 表_菜单 DTO List 转换 BO List */
	public static List<TMenuBO> toBO(List<TMenuDTO> dtos) {
		List<TMenuBO> bos = new ArrayList<>();
		for (TMenuDTO dto : dtos) {
			bos.add(toBO(dto));
		}
		return bos;
	}

	/** 表_菜单 DTO 转换 BO */
	public TMenuBO toBO() {
		return TMenuBO.builder()
				.keyID(this.getKeyID())
				.menuName(this.getMenuName())
				.menuUrl(this.getMenuUrl())
				.menuSign(this.getMenuSign())
				.parentID(this.getParentID())
				.isTurn(this.getIsTurn())
				.menuOrder(this.getMenuOrder())
				.remark(this.getRemark())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
