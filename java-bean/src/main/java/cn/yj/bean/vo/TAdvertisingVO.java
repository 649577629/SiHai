package cn.yj.bean.vo;

import cn.yj.bean.bo.TAdvertisingBO;
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
public class TAdvertisingVO implements Serializable {

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

	/** 表_广告 BO 转换 VO */
	public static TAdvertisingVO toVO(TAdvertisingBO bo) {
		if (bo != null) {
			return TAdvertisingVO.builder()
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

	/** 表_广告 BO 数组 转换 VO List */
	public static List<TAdvertisingVO> toVO(TAdvertisingBO[] bos) {
		List<TAdvertisingVO> vos = new ArrayList<>();
		for (TAdvertisingBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_广告 BO List 转换 VO List */
	public static List<TAdvertisingVO> toVO(List<TAdvertisingBO> bos) {
		List<TAdvertisingVO> vos = new ArrayList<>();
		for (TAdvertisingBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_广告 VO 转换 BO */
	public static TAdvertisingBO toBO(TAdvertisingVO vo) {
		if (vo != null) {
			return TAdvertisingBO.builder()
					.keyID(vo.getKeyID())
					.companyID(vo.getCompanyID())
					.adContent(vo.getAdContent())
					.setTime(vo.getSetTime())
					.downTime(vo.getDownTime())
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

	/** 表_广告 VO List 转换 BO List */
	public static List<TAdvertisingBO> toBO(List<TAdvertisingVO> vos) {
		List<TAdvertisingBO> bos = new ArrayList<>();
		for (TAdvertisingVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_广告 VO 转换 BO */
	public TAdvertisingBO toBO() {
		return TAdvertisingBO.builder()
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
