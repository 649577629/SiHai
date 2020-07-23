package cn.yj.bean.bo;

import cn.yj.bean.po.TFeedbackPO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_反馈信息表 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TFeedbackBO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**用户ID*/
	private String userID;

	/**反馈内容*/
	private String remark;

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

	/** 表_反馈信息表 PO 转换 BO */
	public static TFeedbackBO toBO(TFeedbackPO po) {
		if (po != null) {
			return TFeedbackBO.builder()
					.keyID(po.getKeyID())
					.userID(po.getUserID())
					.remark(po.getRemark())
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

	/** 表_反馈信息表 PO 数组 转换 BO List */
	public static List<TFeedbackBO> toBO(TFeedbackPO[] pos) {
		List<TFeedbackBO> bos = new ArrayList<>();
		for (TFeedbackPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_反馈信息表 PO List 转换 BO List */
	public static List<TFeedbackBO> toBO(List<TFeedbackPO> pos) {
		List<TFeedbackBO> bos = new ArrayList<>();
		for (TFeedbackPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_反馈信息表 BO 转换 PO */
	public static TFeedbackPO toPO(TFeedbackBO bo) {
		if (bo != null) {
			return TFeedbackPO.builder()
					.keyID(bo.getKeyID())
					.userID(bo.getUserID())
					.remark(bo.getRemark())
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

	/** 表_反馈信息表 BO List 转换 PO List */
	public static List<TFeedbackPO> toPO(List<TFeedbackBO> bos) {
		List<TFeedbackPO> pos = new ArrayList<>();
		for (TFeedbackBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_反馈信息表 BO 转换 PO */
	public TFeedbackPO toPO() {
		return TFeedbackPO.builder()
				.keyID(this.getKeyID())
				.userID(this.getUserID())
				.remark(this.getRemark())
				.pictureUrl(this.getPictureUrl())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
