package cn.yj.bean.bo;

import cn.yj.bean.po.TUseOperateLogPO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_用户操作记录表 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TUseOperateLogBO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**用户ID*/
	private String userID;

	/**操作行为*/
	private String logAction;

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

	/** 表_用户操作记录表 PO 转换 BO */
	public static TUseOperateLogBO toBO(TUseOperateLogPO po) {
		if (po != null) {
			return TUseOperateLogBO.builder()
					.keyID(po.getKeyID())
					.userID(po.getUserID())
					.logAction(po.getLogAction())
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

	/** 表_用户操作记录表 PO 数组 转换 BO List */
	public static List<TUseOperateLogBO> toBO(TUseOperateLogPO[] pos) {
		List<TUseOperateLogBO> bos = new ArrayList<>();
		for (TUseOperateLogPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_用户操作记录表 PO List 转换 BO List */
	public static List<TUseOperateLogBO> toBO(List<TUseOperateLogPO> pos) {
		List<TUseOperateLogBO> bos = new ArrayList<>();
		for (TUseOperateLogPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_用户操作记录表 BO 转换 PO */
	public static TUseOperateLogPO toPO(TUseOperateLogBO bo) {
		if (bo != null) {
			return TUseOperateLogPO.builder()
					.keyID(bo.getKeyID())
					.userID(bo.getUserID())
					.logAction(bo.getLogAction())
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

	/** 表_用户操作记录表 BO List 转换 PO List */
	public static List<TUseOperateLogPO> toPO(List<TUseOperateLogBO> bos) {
		List<TUseOperateLogPO> pos = new ArrayList<>();
		for (TUseOperateLogBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_用户操作记录表 BO 转换 PO */
	public TUseOperateLogPO toPO() {
		return TUseOperateLogPO.builder()
				.keyID(this.getKeyID())
				.userID(this.getUserID())
				.logAction(this.getLogAction())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
