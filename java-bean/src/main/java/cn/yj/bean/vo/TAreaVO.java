package cn.yj.bean.vo;

import cn.yj.bean.bo.TAreaBO;
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
public class TAreaVO implements Serializable {

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

	/** 表_区域 BO 转换 VO */
	public static TAreaVO toVO(TAreaBO bo) {
		if (bo != null) {
			return TAreaVO.builder()
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

	/** 表_区域 BO 数组 转换 VO List */
	public static List<TAreaVO> toVO(TAreaBO[] bos) {
		List<TAreaVO> vos = new ArrayList<>();
		for (TAreaBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_区域 BO List 转换 VO List */
	public static List<TAreaVO> toVO(List<TAreaBO> bos) {
		List<TAreaVO> vos = new ArrayList<>();
		for (TAreaBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_区域 VO 转换 BO */
	public static TAreaBO toBO(TAreaVO vo) {
		if (vo != null) {
			return TAreaBO.builder()
					.keyID(vo.getKeyID())
					.areaNameCN(vo.getAreaNameCN())
					.areaNameEN(vo.getAreaNameEN())
					.upLevelID(vo.getUpLevelID())
					.areaLevel(vo.getAreaLevel())
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

	/** 表_区域 VO List 转换 BO List */
	public static List<TAreaBO> toBO(List<TAreaVO> vos) {
		List<TAreaBO> bos = new ArrayList<>();
		for (TAreaVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_区域 VO 转换 BO */
	public TAreaBO toBO() {
		return TAreaBO.builder()
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
