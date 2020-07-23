package cn.yj.bean.vo;

import cn.yj.bean.bo.TFeedbackBO;
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
public class TFeedbackVO implements Serializable {

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

	/** 表_反馈信息表 BO 转换 VO */
	public static TFeedbackVO toVO(TFeedbackBO bo) {
		if (bo != null) {
			return TFeedbackVO.builder()
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

	/** 表_反馈信息表 BO 数组 转换 VO List */
	public static List<TFeedbackVO> toVO(TFeedbackBO[] bos) {
		List<TFeedbackVO> vos = new ArrayList<>();
		for (TFeedbackBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_反馈信息表 BO List 转换 VO List */
	public static List<TFeedbackVO> toVO(List<TFeedbackBO> bos) {
		List<TFeedbackVO> vos = new ArrayList<>();
		for (TFeedbackBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_反馈信息表 VO 转换 BO */
	public static TFeedbackBO toBO(TFeedbackVO vo) {
		if (vo != null) {
			return TFeedbackBO.builder()
					.keyID(vo.getKeyID())
					.userID(vo.getUserID())
					.remark(vo.getRemark())
					.pictureUrl(vo.getPictureUrl())
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

	/** 表_反馈信息表 VO List 转换 BO List */
	public static List<TFeedbackBO> toBO(List<TFeedbackVO> vos) {
		List<TFeedbackBO> bos = new ArrayList<>();
		for (TFeedbackVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_反馈信息表 VO 转换 BO */
	public TFeedbackBO toBO() {
		return TFeedbackBO.builder()
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
