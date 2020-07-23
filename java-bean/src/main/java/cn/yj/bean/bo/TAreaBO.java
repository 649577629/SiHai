package cn.yj.bean.bo;

import cn.yj.bean.po.TAreaPO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_区域 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TAreaBO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**地区名称CN*/
	private String areaNameCN;

	/**地区名称EN*/
	private String areaNameEN;

	/**父级ID*/
	private String upLevelID;

	/**等级*/
	private Integer areaLevel;

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

	/** 表_区域 PO 转换 BO */
	public static TAreaBO toBO(TAreaPO po) {
		if (po != null) {
			return TAreaBO.builder()
					.keyID(po.getKeyID())
					.areaNameCN(po.getAreaNameCN())
					.areaNameEN(po.getAreaNameEN())
					.upLevelID(po.getUpLevelID())
					.areaLevel(po.getAreaLevel())
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

	/** 表_区域 PO 数组 转换 BO List */
	public static List<TAreaBO> toBO(TAreaPO[] pos) {
		List<TAreaBO> bos = new ArrayList<>();
		for (TAreaPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_区域 PO List 转换 BO List */
	public static List<TAreaBO> toBO(List<TAreaPO> pos) {
		List<TAreaBO> bos = new ArrayList<>();
		for (TAreaPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_区域 BO 转换 PO */
	public static TAreaPO toPO(TAreaBO bo) {
		if (bo != null) {
			return TAreaPO.builder()
					.keyID(bo.getKeyID())
					.areaNameCN(bo.getAreaNameCN())
					.areaNameEN(bo.getAreaNameEN())
					.upLevelID(bo.getUpLevelID())
					.areaLevel(bo.getAreaLevel())
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

	/** 表_区域 BO List 转换 PO List */
	public static List<TAreaPO> toPO(List<TAreaBO> bos) {
		List<TAreaPO> pos = new ArrayList<>();
		for (TAreaBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_区域 BO 转换 PO */
	public TAreaPO toPO() {
		return TAreaPO.builder()
				.keyID(this.getKeyID())
				.areaNameCN(this.getAreaNameCN())
				.areaNameEN(this.getAreaNameEN())
				.upLevelID(this.getUpLevelID())
				.areaLevel(this.getAreaLevel())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
