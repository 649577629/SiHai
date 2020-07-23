package cn.yj.bean.bo;

import cn.yj.bean.po.TRoleMenuPO;
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
public class TRoleMenuBO implements Serializable {

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

	/** 表_角色菜单关系 PO 转换 BO */
	public static TRoleMenuBO toBO(TRoleMenuPO po) {
		if (po != null) {
			return TRoleMenuBO.builder()
					.keyID(po.getKeyID())
					.roleID(po.getRoleID())
					.menuID(po.getMenuID())
					.createTime(po.getCreateTime())
					.createID(po.getCreateID())
					.updateTime(po.getUpdateTime())
					.updateID(po.getUpdateID())
					.state(po.getState())
					.build();
		} else {
			return null;
		}
	}

	/** 表_角色菜单关系 PO 数组 转换 BO List */
	public static List<TRoleMenuBO> toBO(TRoleMenuPO[] pos) {
		List<TRoleMenuBO> bos = new ArrayList<>();
		for (TRoleMenuPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_角色菜单关系 PO List 转换 BO List */
	public static List<TRoleMenuBO> toBO(List<TRoleMenuPO> pos) {
		List<TRoleMenuBO> bos = new ArrayList<>();
		for (TRoleMenuPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_角色菜单关系 BO 转换 PO */
	public static TRoleMenuPO toPO(TRoleMenuBO bo) {
		if (bo != null) {
			return TRoleMenuPO.builder()
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

	/** 表_角色菜单关系 BO List 转换 PO List */
	public static List<TRoleMenuPO> toPO(List<TRoleMenuBO> bos) {
		List<TRoleMenuPO> pos = new ArrayList<>();
		for (TRoleMenuBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_角色菜单关系 BO 转换 PO */
	public TRoleMenuPO toPO() {
		return TRoleMenuPO.builder()
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
