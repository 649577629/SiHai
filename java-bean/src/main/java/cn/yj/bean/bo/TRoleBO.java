package cn.yj.bean.bo;

import cn.yj.bean.po.TRolePO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_角色 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TRoleBO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**名称*/
	private String roleName;

	/**备注*/
	private String remark;

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

	/** 表_角色 PO 转换 BO */
	public static TRoleBO toBO(TRolePO po) {
		if (po != null) {
			return TRoleBO.builder()
					.keyID(po.getKeyID())
					.roleName(po.getRoleName())
					.remark(po.getRemark())
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

	/** 表_角色 PO 数组 转换 BO List */
	public static List<TRoleBO> toBO(TRolePO[] pos) {
		List<TRoleBO> bos = new ArrayList<>();
		for (TRolePO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_角色 PO List 转换 BO List */
	public static List<TRoleBO> toBO(List<TRolePO> pos) {
		List<TRoleBO> bos = new ArrayList<>();
		for (TRolePO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_角色 BO 转换 PO */
	public static TRolePO toPO(TRoleBO bo) {
		if (bo != null) {
			return TRolePO.builder()
					.keyID(bo.getKeyID())
					.roleName(bo.getRoleName())
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

	/** 表_角色 BO List 转换 PO List */
	public static List<TRolePO> toPO(List<TRoleBO> bos) {
		List<TRolePO> pos = new ArrayList<>();
		for (TRoleBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_角色 BO 转换 PO */
	public TRolePO toPO() {
		return TRolePO.builder()
				.keyID(this.getKeyID())
				.roleName(this.getRoleName())
				.remark(this.getRemark())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
