package cn.yj.bean.vo;

import cn.yj.bean.bo.TUserCompanyBO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_用户公司关系 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TUserCompanyVO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**用户ID*/
	private String userID;

	/**公司ID*/
	private String companyID;

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

	/** 表_用户公司关系 BO 转换 VO */
	public static TUserCompanyVO toVO(TUserCompanyBO bo) {
		if (bo != null) {
			return TUserCompanyVO.builder()
					.keyID(bo.getKeyID())
					.userID(bo.getUserID())
					.companyID(bo.getCompanyID())
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

	/** 表_用户公司关系 BO 数组 转换 VO List */
	public static List<TUserCompanyVO> toVO(TUserCompanyBO[] bos) {
		List<TUserCompanyVO> vos = new ArrayList<>();
		for (TUserCompanyBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_用户公司关系 BO List 转换 VO List */
	public static List<TUserCompanyVO> toVO(List<TUserCompanyBO> bos) {
		List<TUserCompanyVO> vos = new ArrayList<>();
		for (TUserCompanyBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_用户公司关系 VO 转换 BO */
	public static TUserCompanyBO toBO(TUserCompanyVO vo) {
		if (vo != null) {
			return TUserCompanyBO.builder()
					.keyID(vo.getKeyID())
					.userID(vo.getUserID())
					.companyID(vo.getCompanyID())
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

	/** 表_用户公司关系 VO List 转换 BO List */
	public static List<TUserCompanyBO> toBO(List<TUserCompanyVO> vos) {
		List<TUserCompanyBO> bos = new ArrayList<>();
		for (TUserCompanyVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_用户公司关系 VO 转换 BO */
	public TUserCompanyBO toBO() {
		return TUserCompanyBO.builder()
				.keyID(this.getKeyID())
				.userID(this.getUserID())
				.companyID(this.getCompanyID())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
