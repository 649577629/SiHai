package cn.yj.bean.bo;

import cn.yj.bean.po.TUserCompanyPO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_用户公司关系 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TUserCompanyBO implements Serializable {

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

	/** 表_用户公司关系 PO 转换 BO */
	public static TUserCompanyBO toBO(TUserCompanyPO po) {
		if (po != null) {
			return TUserCompanyBO.builder()
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

	/** 表_用户公司关系 PO 数组 转换 BO List */
	public static List<TUserCompanyBO> toBO(TUserCompanyPO[] pos) {
		List<TUserCompanyBO> bos = new ArrayList<>();
		for (TUserCompanyPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_用户公司关系 PO List 转换 BO List */
	public static List<TUserCompanyBO> toBO(List<TUserCompanyPO> pos) {
		List<TUserCompanyBO> bos = new ArrayList<>();
		for (TUserCompanyPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_用户公司关系 BO 转换 PO */
	public static TUserCompanyPO toPO(TUserCompanyBO bo) {
		if (bo != null) {
			return TUserCompanyPO.builder()
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

	/** 表_用户公司关系 BO List 转换 PO List */
	public static List<TUserCompanyPO> toPO(List<TUserCompanyBO> bos) {
		List<TUserCompanyPO> pos = new ArrayList<>();
		for (TUserCompanyBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_用户公司关系 BO 转换 PO */
	public TUserCompanyPO toPO() {
		return TUserCompanyPO.builder()
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
