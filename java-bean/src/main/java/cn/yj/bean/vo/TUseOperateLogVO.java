package cn.yj.bean.vo;

import cn.yj.bean.bo.TUseOperateLogBO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_用户操作记录表 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TUseOperateLogVO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**用户ID*/
	private String userID;

	/**操作行为*/
	private String logAction;

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

	/** 表_用户操作记录表 BO 转换 VO */
	public static TUseOperateLogVO toVO(TUseOperateLogBO bo) {
		if (bo != null) {
			return TUseOperateLogVO.builder()
					.keyID(bo.getKeyID())
					.userID(bo.getUserID())
					.logAction(bo.getLogAction())
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

	/** 表_用户操作记录表 BO 数组 转换 VO List */
	public static List<TUseOperateLogVO> toVO(TUseOperateLogBO[] bos) {
		List<TUseOperateLogVO> vos = new ArrayList<>();
		for (TUseOperateLogBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_用户操作记录表 BO List 转换 VO List */
	public static List<TUseOperateLogVO> toVO(List<TUseOperateLogBO> bos) {
		List<TUseOperateLogVO> vos = new ArrayList<>();
		for (TUseOperateLogBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_用户操作记录表 VO 转换 BO */
	public static TUseOperateLogBO toBO(TUseOperateLogVO vo) {
		if (vo != null) {
			return TUseOperateLogBO.builder()
					.keyID(vo.getKeyID())
					.userID(vo.getUserID())
					.logAction(vo.getLogAction())
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

	/** 表_用户操作记录表 VO List 转换 BO List */
	public static List<TUseOperateLogBO> toBO(List<TUseOperateLogVO> vos) {
		List<TUseOperateLogBO> bos = new ArrayList<>();
		for (TUseOperateLogVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_用户操作记录表 VO 转换 BO */
	public TUseOperateLogBO toBO() {
		return TUseOperateLogBO.builder()
				.keyID(this.getKeyID())
				.userID(this.getUserID())
				.logAction(this.getLogAction())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
