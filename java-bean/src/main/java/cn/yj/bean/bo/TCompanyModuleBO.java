package cn.yj.bean.bo;

import cn.yj.bean.po.TCompanyModulePO;
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
public class TCompanyModuleBO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**公司ID*/
	private String compnayID;

	/**模块ID*/
	private String moduleID;

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
	public static TCompanyModuleBO toBO(TCompanyModulePO po) {
		if (po != null) {
			return TCompanyModuleBO.builder()
					.keyID(po.getKeyID())
					.compnayID(po.getCompnayID())
					.moduleID(po.getModuleID())
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
	public static List<TCompanyModuleBO> toBO(TCompanyModulePO[] pos) {
		List<TCompanyModuleBO> bos = new ArrayList<>();
		for (TCompanyModulePO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_角色菜单关系 PO List 转换 BO List */
	public static List<TCompanyModuleBO> toBO(List<TCompanyModulePO> pos) {
		List<TCompanyModuleBO> bos = new ArrayList<>();
		for (TCompanyModulePO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_角色菜单关系 BO 转换 PO */
	public static TCompanyModulePO toPO(TCompanyModuleBO bo) {
		if (bo != null) {
			return TCompanyModulePO.builder()
					.keyID(bo.getKeyID())
					.compnayID(bo.getCompnayID())
					.moduleID(bo.getModuleID())
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
	public static List<TCompanyModulePO> toPO(List<TCompanyModuleBO> bos) {
		List<TCompanyModulePO> pos = new ArrayList<>();
		for (TCompanyModuleBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_角色菜单关系 BO 转换 PO */
	public TCompanyModulePO toPO() {
		return TCompanyModulePO.builder()
				.keyID(this.getKeyID())
				.compnayID(this.getCompnayID())
				.moduleID(this.getModuleID())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
