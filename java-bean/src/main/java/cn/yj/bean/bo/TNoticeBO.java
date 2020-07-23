package cn.yj.bean.bo;

import cn.yj.bean.po.TNoticePO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_公告 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TNoticeBO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**图片名称*/
	private String noticeIntroduction;

	/**展示名称*/
	private String noticeDetails;

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

	/** 表_公告 PO 转换 BO */
	public static TNoticeBO toBO(TNoticePO po) {
		if (po != null) {
			return TNoticeBO.builder()
					.keyID(po.getKeyID())
					.noticeIntroduction(po.getNoticeIntroduction())
					.noticeDetails(po.getNoticeDetails())
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

	/** 表_公告 PO 数组 转换 BO List */
	public static List<TNoticeBO> toBO(TNoticePO[] pos) {
		List<TNoticeBO> bos = new ArrayList<>();
		for (TNoticePO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_公告 PO List 转换 BO List */
	public static List<TNoticeBO> toBO(List<TNoticePO> pos) {
		List<TNoticeBO> bos = new ArrayList<>();
		for (TNoticePO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_公告 BO 转换 PO */
	public static TNoticePO toPO(TNoticeBO bo) {
		if (bo != null) {
			return TNoticePO.builder()
					.keyID(bo.getKeyID())
					.noticeIntroduction(bo.getNoticeIntroduction())
					.noticeDetails(bo.getNoticeDetails())
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

	/** 表_公告 BO List 转换 PO List */
	public static List<TNoticePO> toPO(List<TNoticeBO> bos) {
		List<TNoticePO> pos = new ArrayList<>();
		for (TNoticeBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_公告 BO 转换 PO */
	public TNoticePO toPO() {
		return TNoticePO.builder()
				.keyID(this.getKeyID())
				.noticeIntroduction(this.getNoticeIntroduction())
				.noticeDetails(this.getNoticeDetails())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
