package cn.yj.bean.vo;

import cn.yj.bean.bo.TRoleMenuBO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_角色菜单关系 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TRoleMenuVO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**角色ID*/
	private String roleID;

	/**菜单ID*/
	private String menuID;

	/**创建时间*/
	private Date createTime;

	/**创建用户ID*/
	private String createID;

	/**修改时间*/
	private Date updateTime;

	/**修改用户ID*/
	private String updateID;

	/**状态(0.正常 99.删除)*/
	private Integer state;

	//------------------------------------------------------------------------------------------------------------------转换

	/** 表_角色菜单关系 BO 转换 VO */
	public static TRoleMenuVO toVO(TRoleMenuBO bo) {
		if (bo != null) {
			return TRoleMenuVO.builder()
					.keyID(bo.getKeyID())
					.roleID(bo.getRoleID())
					.menuID(bo.getMenuID())
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

	/** 表_角色菜单关系 BO 数组 转换 VO List */
	public static List<TRoleMenuVO> toVO(TRoleMenuBO[] bos) {
		List<TRoleMenuVO> vos = new ArrayList<>();
		for (TRoleMenuBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_角色菜单关系 BO List 转换 VO List */
	public static List<TRoleMenuVO> toVO(List<TRoleMenuBO> bos) {
		List<TRoleMenuVO> vos = new ArrayList<>();
		for (TRoleMenuBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_角色菜单关系 VO 转换 BO */
	public static TRoleMenuBO toBO(TRoleMenuVO vo) {
		if (vo != null) {
			return TRoleMenuBO.builder()
					.keyID(vo.getKeyID())
					.roleID(vo.getRoleID())
					.menuID(vo.getMenuID())
					.createTime(vo.getCreateTime())
					.createID(vo.getCreateID())
					.updateTime(vo.getUpdateTime())
					.updateID(vo.getUpdateID())
					.state(vo.getState())
					.build();
		} else {
			return null;
		}
	}

	/** 表_角色菜单关系 VO List 转换 BO List */
	public static List<TRoleMenuBO> toBO(List<TRoleMenuVO> vos) {
		List<TRoleMenuBO> bos = new ArrayList<>();
		for (TRoleMenuVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_角色菜单关系 VO 转换 BO */
	public TRoleMenuBO toBO() {
		return TRoleMenuBO.builder()
				.keyID(this.getKeyID())
				.roleID(this.getRoleID())
				.menuID(this.getMenuID())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
