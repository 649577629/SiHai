package cn.yj.bean.bo;

import cn.yj.bean.po.TModulePO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_模块分类 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TModuleBO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**模块名称*/
	private String moduleName;

	/**模块排序*/
	private Integer moduleOrder;

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

	/** 表_模块分类 PO 转换 BO */
	public static TModuleBO toBO(TModulePO po) {
		if (po != null) {
			return TModuleBO.builder()
					.keyID(po.getKeyID())
					.moduleName(po.getModuleName())
					.moduleOrder(po.getModuleOrder())
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

	/** 表_模块分类 PO 数组 转换 BO List */
	public static List<TModuleBO> toBO(TModulePO[] pos) {
		List<TModuleBO> bos = new ArrayList<>();
		for (TModulePO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_模块分类 PO List 转换 BO List */
	public static List<TModuleBO> toBO(List<TModulePO> pos) {
		List<TModuleBO> bos = new ArrayList<>();
		for (TModulePO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_模块分类 BO 转换 PO */
	public static TModulePO toPO(TModuleBO bo) {
		if (bo != null) {
			return TModulePO.builder()
					.keyID(bo.getKeyID())
					.moduleName(bo.getModuleName())
					.moduleOrder(bo.getModuleOrder())
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

	/** 表_模块分类 BO List 转换 PO List */
	public static List<TModulePO> toPO(List<TModuleBO> bos) {
		List<TModulePO> pos = new ArrayList<>();
		for (TModuleBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_模块分类 BO 转换 PO */
	public TModulePO toPO() {
		return TModulePO.builder()
				.keyID(this.getKeyID())
				.moduleName(this.getModuleName())
				.moduleOrder(this.getModuleOrder())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
