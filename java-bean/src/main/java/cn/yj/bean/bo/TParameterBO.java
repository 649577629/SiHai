package cn.yj.bean.bo;

import cn.yj.bean.po.TParameterPO;
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
public class TParameterBO implements Serializable {

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

	/** 表_参数 PO 转换 BO */
	public static TParameterBO toBO(TParameterPO po) {
		if (po != null) {
			return TParameterBO.builder()
					.keyID(po.getKeyID())
					.parameterCode(po.getParameterCode())
					.parameterName(po.getParameterName())
					.parameterValue(po.getParameterValue())
					.parameterExplain(po.getParameterExplain())
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

	/** 表_参数 PO 数组 转换 BO List */
	public static List<TParameterBO> toBO(TParameterPO[] pos) {
		List<TParameterBO> bos = new ArrayList<>();
		for (TParameterPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_参数 PO List 转换 BO List */
	public static List<TParameterBO> toBO(List<TParameterPO> pos) {
		List<TParameterBO> bos = new ArrayList<>();
		for (TParameterPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_参数 BO 转换 PO */
	public static TParameterPO toPO(TParameterBO bo) {
		if (bo != null) {
			return TParameterPO.builder()
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

	/** 表_参数 BO List 转换 PO List */
	public static List<TParameterPO> toPO(List<TParameterBO> bos) {
		List<TParameterPO> pos = new ArrayList<>();
		for (TParameterBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_参数 BO 转换 PO */
	public TParameterPO toPO() {
		return TParameterPO.builder()
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
