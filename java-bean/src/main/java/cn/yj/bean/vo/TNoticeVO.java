package cn.yj.bean.vo;

import cn.yj.bean.bo.TNoticeBO;
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
public class TNoticeVO implements Serializable {

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

	/** 表_公告 BO 转换 VO */
	public static TNoticeVO toVO(TNoticeBO bo) {
		if (bo != null) {
			return TNoticeVO.builder()
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

	/** 表_公告 BO 数组 转换 VO List */
	public static List<TNoticeVO> toVO(TNoticeBO[] bos) {
		List<TNoticeVO> vos = new ArrayList<>();
		for (TNoticeBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_公告 BO List 转换 VO List */
	public static List<TNoticeVO> toVO(List<TNoticeBO> bos) {
		List<TNoticeVO> vos = new ArrayList<>();
		for (TNoticeBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_公告 VO 转换 BO */
	public static TNoticeBO toBO(TNoticeVO vo) {
		if (vo != null) {
			return TNoticeBO.builder()
					.keyID(vo.getKeyID())
					.noticeIntroduction(vo.getNoticeIntroduction())
					.noticeDetails(vo.getNoticeDetails())
					.createTime(vo.getCreateTime())
					.createID(vo.getCreateID())
					.updateTime(vo.getUpdateTime())
					.updateID(vo.getUpdateID())
					.state(vo.getState())
					.build();
		} else {
			return null;
		}
	}

	/** 表_公告 VO List 转换 BO List */
	public static List<TNoticeBO> toBO(List<TNoticeVO> vos) {
		List<TNoticeBO> bos = new ArrayList<>();
		for (TNoticeVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_公告 VO 转换 BO */
	public TNoticeBO toBO() {
		return TNoticeBO.builder()
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
