package cn.yj.bean.bo;

import cn.yj.bean.po.TUserRolePO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_用户角色关系 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TUserRoleBO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**用户ID*/
	private String userID;

	/**角色ID*/
	private String roleID;

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

	/** 表_用户角色关系 PO 转换 BO */
	public static TUserRoleBO toBO(TUserRolePO po) {
		if (po != null) {
			return TUserRoleBO.builder()
					.keyID(po.getKeyID())
					.userID(po.getUserID())
					.roleID(po.getRoleID())
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

	/** 表_用户角色关系 PO 数组 转换 BO List */
	public static List<TUserRoleBO> toBO(TUserRolePO[] pos) {
		List<TUserRoleBO> bos = new ArrayList<>();
		for (TUserRolePO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_用户角色关系 PO List 转换 BO List */
	public static List<TUserRoleBO> toBO(List<TUserRolePO> pos) {
		List<TUserRoleBO> bos = new ArrayList<>();
		for (TUserRolePO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_用户角色关系 BO 转换 PO */
	public static TUserRolePO toPO(TUserRoleBO bo) {
		if (bo != null) {
			return TUserRolePO.builder()
					.keyID(bo.getKeyID())
					.userID(bo.getUserID())
					.roleID(bo.getRoleID())
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

	/** 表_用户角色关系 BO List 转换 PO List */
	public static List<TUserRolePO> toPO(List<TUserRoleBO> bos) {
		List<TUserRolePO> pos = new ArrayList<>();
		for (TUserRoleBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_用户角色关系 BO 转换 PO */
	public TUserRolePO toPO() {
		return TUserRolePO.builder()
				.keyID(this.getKeyID())
				.userID(this.getUserID())
				.roleID(this.getRoleID())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
