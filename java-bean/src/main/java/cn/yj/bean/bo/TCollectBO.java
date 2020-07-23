package cn.yj.bean.bo;

import cn.yj.bean.po.TCollectPO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_收藏 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TCollectBO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**用户ID*/
	private String userID;

	/**公司ID*/
	private String companyID;

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

	/** 表_收藏 PO 转换 BO */
	public static TCollectBO toBO(TCollectPO po) {
		if (po != null) {
			return TCollectBO.builder()
					.keyID(po.getKeyID())
					.userID(po.getUserID())
					.companyID(po.getCompanyID())
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

	/** 表_收藏 PO 数组 转换 BO List */
	public static List<TCollectBO> toBO(TCollectPO[] pos) {
		List<TCollectBO> bos = new ArrayList<>();
		for (TCollectPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_收藏 PO List 转换 BO List */
	public static List<TCollectBO> toBO(List<TCollectPO> pos) {
		List<TCollectBO> bos = new ArrayList<>();
		for (TCollectPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_收藏 BO 转换 PO */
	public static TCollectPO toPO(TCollectBO bo) {
		if (bo != null) {
			return TCollectPO.builder()
					.keyID(bo.getKeyID())
					.userID(bo.getUserID())
					.companyID(bo.getCompanyID())
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

	/** 表_收藏 BO List 转换 PO List */
	public static List<TCollectPO> toPO(List<TCollectBO> bos) {
		List<TCollectPO> pos = new ArrayList<>();
		for (TCollectBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_收藏 BO 转换 PO */
	public TCollectPO toPO() {
		return TCollectPO.builder()
				.keyID(this.getKeyID())
				.userID(this.getUserID())
				.companyID(this.getCompanyID())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
