package cn.yj.bean.vo;

import cn.yj.bean.bo.TModuleBO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_模块分类 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TModuleVO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**模块名称*/
	private String moduleName;

	/**模块排序*/
	private Integer moduleOrder;

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

	/** 表_模块分类 BO 转换 VO */
	public static TModuleVO toVO(TModuleBO bo) {
		if (bo != null) {
			return TModuleVO.builder()
					.keyID(bo.getKeyID())
					.moduleName(bo.getModuleName())
					.moduleOrder(bo.getModuleOrder())
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

	/** 表_模块分类 BO 数组 转换 VO List */
	public static List<TModuleVO> toVO(TModuleBO[] bos) {
		List<TModuleVO> vos = new ArrayList<>();
		for (TModuleBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_模块分类 BO List 转换 VO List */
	public static List<TModuleVO> toVO(List<TModuleBO> bos) {
		List<TModuleVO> vos = new ArrayList<>();
		for (TModuleBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_模块分类 VO 转换 BO */
	public static TModuleBO toBO(TModuleVO vo) {
		if (vo != null) {
			return TModuleBO.builder()
					.keyID(vo.getKeyID())
					.moduleName(vo.getModuleName())
					.moduleOrder(vo.getModuleOrder())
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

	/** 表_模块分类 VO List 转换 BO List */
	public static List<TModuleBO> toBO(List<TModuleVO> vos) {
		List<TModuleBO> bos = new ArrayList<>();
		for (TModuleVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_模块分类 VO 转换 BO */
	public TModuleBO toBO() {
		return TModuleBO.builder()
				.keyID(this.getKeyID())
				.moduleName(this.getModuleName())
				.moduleOrder(this.getModuleOrder())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
