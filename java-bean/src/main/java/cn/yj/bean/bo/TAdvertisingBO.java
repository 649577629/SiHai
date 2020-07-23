package cn.yj.bean.bo;

import cn.yj.bean.po.TAdvertisingPO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_广告 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TAdvertisingBO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**关联公司ID*/
	private String companyID;

	/**广告内容*/
	private String adContent;

	/**上架时间*/
	private Date setTime;

	/**下架时间*/
	private Date downTime;

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

	/** 表_广告 PO 转换 BO */
	public static TAdvertisingBO toBO(TAdvertisingPO po) {
		if (po != null) {
			return TAdvertisingBO.builder()
					.keyID(po.getKeyID())
					.companyID(po.getCompanyID())
					.adContent(po.getAdContent())
					.setTime(po.getSetTime())
					.downTime(po.getDownTime())
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

	/** 表_广告 PO 数组 转换 BO List */
	public static List<TAdvertisingBO> toBO(TAdvertisingPO[] pos) {
		List<TAdvertisingBO> bos = new ArrayList<>();
		for (TAdvertisingPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_广告 PO List 转换 BO List */
	public static List<TAdvertisingBO> toBO(List<TAdvertisingPO> pos) {
		List<TAdvertisingBO> bos = new ArrayList<>();
		for (TAdvertisingPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_广告 BO 转换 PO */
	public static TAdvertisingPO toPO(TAdvertisingBO bo) {
		if (bo != null) {
			return TAdvertisingPO.builder()
					.keyID(bo.getKeyID())
					.companyID(bo.getCompanyID())
					.adContent(bo.getAdContent())
					.setTime(bo.getSetTime())
					.downTime(bo.getDownTime())
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

	/** 表_广告 BO List 转换 PO List */
	public static List<TAdvertisingPO> toPO(List<TAdvertisingBO> bos) {
		List<TAdvertisingPO> pos = new ArrayList<>();
		for (TAdvertisingBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_广告 BO 转换 PO */
	public TAdvertisingPO toPO() {
		return TAdvertisingPO.builder()
				.keyID(this.getKeyID())
				.companyID(this.getCompanyID())
				.adContent(this.getAdContent())
				.setTime(this.getSetTime())
				.downTime(this.getDownTime())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
