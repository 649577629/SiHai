package cn.yj.bean.bo;

import cn.yj.bean.po.TPicturePO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_图片 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TPictureBO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**所属分类ID*/
	private String pictureClassId;

	/**关联ID*/
	private String relationID;

	/**图片名称*/
	private String pictureName;

	/**展示名称*/
	private String showName;

	/**图片地址*/
	private String pictureUrl;

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

	/** 表_图片 PO 转换 BO */
	public static TPictureBO toBO(TPicturePO po) {
		if (po != null) {
			return TPictureBO.builder()
					.keyID(po.getKeyID())
					.pictureClassId(po.getPictureClassId())
					.relationID(po.getRelationID())
					.pictureName(po.getPictureName())
					.showName(po.getShowName())
					.pictureUrl(po.getPictureUrl())
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

	/** 表_图片 PO 数组 转换 BO List */
	public static List<TPictureBO> toBO(TPicturePO[] pos) {
		List<TPictureBO> bos = new ArrayList<>();
		for (TPicturePO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_图片 PO List 转换 BO List */
	public static List<TPictureBO> toBO(List<TPicturePO> pos) {
		List<TPictureBO> bos = new ArrayList<>();
		for (TPicturePO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_图片 BO 转换 PO */
	public static TPicturePO toPO(TPictureBO bo) {
		if (bo != null) {
			return TPicturePO.builder()
					.keyID(bo.getKeyID())
					.pictureClassId(bo.getPictureClassId())
					.relationID(bo.getRelationID())
					.pictureName(bo.getPictureName())
					.showName(bo.getShowName())
					.pictureUrl(bo.getPictureUrl())
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

	/** 表_图片 BO List 转换 PO List */
	public static List<TPicturePO> toPO(List<TPictureBO> bos) {
		List<TPicturePO> pos = new ArrayList<>();
		for (TPictureBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_图片 BO 转换 PO */
	public TPicturePO toPO() {
		return TPicturePO.builder()
				.keyID(this.getKeyID())
				.pictureClassId(this.getPictureClassId())
				.relationID(this.getRelationID())
				.pictureName(this.getPictureName())
				.showName(this.getShowName())
				.pictureUrl(this.getPictureUrl())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
