package cn.yj.bean.bo;

import cn.yj.bean.po.TMenuPO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_菜单 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TMenuBO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**名称*/
	private String menuName;

	/**路径*/
	private String menuUrl;

	/**菜单标识*/
	private String menuSign;

	/**父级ID*/
	private String parentID;

	/**是否跳转  (0.否 1.是)*/
	private Integer isTurn;

	/**排序(按数字从小到大)*/
	private Integer menuOrder;

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

	/** 表_菜单 PO 转换 BO */
	public static TMenuBO toBO(TMenuPO po) {
		if (po != null) {
			return TMenuBO.builder()
					.keyID(po.getKeyID())
					.menuName(po.getMenuName())
					.menuUrl(po.getMenuUrl())
					.menuSign(po.getMenuSign())
					.parentID(po.getParentID())
					.isTurn(po.getIsTurn())
					.menuOrder(po.getMenuOrder())
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

	/** 表_菜单 PO 数组 转换 BO List */
	public static List<TMenuBO> toBO(TMenuPO[] pos) {
		List<TMenuBO> bos = new ArrayList<>();
		for (TMenuPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_菜单 PO List 转换 BO List */
	public static List<TMenuBO> toBO(List<TMenuPO> pos) {
		List<TMenuBO> bos = new ArrayList<>();
		for (TMenuPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_菜单 BO 转换 PO */
	public static TMenuPO toPO(TMenuBO bo) {
		if (bo != null) {
			return TMenuPO.builder()
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

	/** 表_菜单 BO List 转换 PO List */
	public static List<TMenuPO> toPO(List<TMenuBO> bos) {
		List<TMenuPO> pos = new ArrayList<>();
		for (TMenuBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_菜单 BO 转换 PO */
	public TMenuPO toPO() {
		return TMenuPO.builder()
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
