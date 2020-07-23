package cn.yj.bean.vo;

import cn.yj.bean.bo.TParameterBO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_参数 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TParameterVO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**参数代码*/
	private String parameterCode;

	/**参数名称*/
	private String parameterName;

	/**参数值*/
	private String parameterValue;

	/**参数说明*/
	private String parameterExplain;

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

	/** 表_参数 BO 转换 VO */
	public static TParameterVO toVO(TParameterBO bo) {
		if (bo != null) {
			return TParameterVO.builder()
					.keyID(bo.getKeyID())
					.parameterCode(bo.getParameterCode())
					.parameterName(bo.getParameterName())
					.parameterValue(bo.getParameterValue())
					.parameterExplain(bo.getParameterExplain())
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

	/** 表_参数 BO 数组 转换 VO List */
	public static List<TParameterVO> toVO(TParameterBO[] bos) {
		List<TParameterVO> vos = new ArrayList<>();
		for (TParameterBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_参数 BO List 转换 VO List */
	public static List<TParameterVO> toVO(List<TParameterBO> bos) {
		List<TParameterVO> vos = new ArrayList<>();
		for (TParameterBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_参数 VO 转换 BO */
	public static TParameterBO toBO(TParameterVO vo) {
		if (vo != null) {
			return TParameterBO.builder()
					.keyID(vo.getKeyID())
					.parameterCode(vo.getParameterCode())
					.parameterName(vo.getParameterName())
					.parameterValue(vo.getParameterValue())
					.parameterExplain(vo.getParameterExplain())
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

	/** 表_参数 VO List 转换 BO List */
	public static List<TParameterBO> toBO(List<TParameterVO> vos) {
		List<TParameterBO> bos = new ArrayList<>();
		for (TParameterVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_参数 VO 转换 BO */
	public TParameterBO toBO() {
		return TParameterBO.builder()
				.keyID(this.getKeyID())
				.parameterCode(this.getParameterCode())
				.parameterName(this.getParameterName())
				.parameterValue(this.getParameterValue())
				.parameterExplain(this.getParameterExplain())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
