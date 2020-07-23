package cn.yj.bean.bo;

import cn.yj.bean.po.TPictureClassPO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_图片分类 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TPictureClassBO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**图片名称*/
	private String className;

	/**分类描述*/
	private String pictureDetails;

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

	/** 表_图片分类 PO 转换 BO */
	public static TPictureClassBO toBO(TPictureClassPO po) {
		if (po != null) {
			return TPictureClassBO.builder()
					.keyID(po.getKeyID())
					.className(po.getClassName())
					.pictureDetails(po.getPictureDetails())
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

	/** 表_图片分类 PO 数组 转换 BO List */
	public static List<TPictureClassBO> toBO(TPictureClassPO[] pos) {
		List<TPictureClassBO> bos = new ArrayList<>();
		for (TPictureClassPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_图片分类 PO List 转换 BO List */
	public static List<TPictureClassBO> toBO(List<TPictureClassPO> pos) {
		List<TPictureClassBO> bos = new ArrayList<>();
		for (TPictureClassPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_图片分类 BO 转换 PO */
	public static TPictureClassPO toPO(TPictureClassBO bo) {
		if (bo != null) {
			return TPictureClassPO.builder()
					.keyID(bo.getKeyID())
					.className(bo.getClassName())
					.pictureDetails(bo.getPictureDetails())
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

	/** 表_图片分类 BO List 转换 PO List */
	public static List<TPictureClassPO> toPO(List<TPictureClassBO> bos) {
		List<TPictureClassPO> pos = new ArrayList<>();
		for (TPictureClassBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_图片分类 BO 转换 PO */
	public TPictureClassPO toPO() {
		return TPictureClassPO.builder()
				.keyID(this.getKeyID())
				.className(this.getClassName())
				.pictureDetails(this.getPictureDetails())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
