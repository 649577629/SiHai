package cn.yj.bean.vo;

import cn.yj.bean.bo.TCompanyModuleBO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_角色菜单关系 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TCompanyModuleVO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**公司ID*/
	private String compnayID;

	/**模块ID*/
	private String moduleID;

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

	/** 表_角色菜单关系 BO 转换 VO */
	public static TCompanyModuleVO toVO(TCompanyModuleBO bo) {
		if (bo != null) {
			return TCompanyModuleVO.builder()
					.keyID(bo.getKeyID())
					.compnayID(bo.getCompnayID())
					.moduleID(bo.getModuleID())
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

	/** 表_角色菜单关系 BO 数组 转换 VO List */
	public static List<TCompanyModuleVO> toVO(TCompanyModuleBO[] bos) {
		List<TCompanyModuleVO> vos = new ArrayList<>();
		for (TCompanyModuleBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_角色菜单关系 BO List 转换 VO List */
	public static List<TCompanyModuleVO> toVO(List<TCompanyModuleBO> bos) {
		List<TCompanyModuleVO> vos = new ArrayList<>();
		for (TCompanyModuleBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_角色菜单关系 VO 转换 BO */
	public static TCompanyModuleBO toBO(TCompanyModuleVO vo) {
		if (vo != null) {
			return TCompanyModuleBO.builder()
					.keyID(vo.getKeyID())
					.compnayID(vo.getCompnayID())
					.moduleID(vo.getModuleID())
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

	/** 表_角色菜单关系 VO List 转换 BO List */
	public static List<TCompanyModuleBO> toBO(List<TCompanyModuleVO> vos) {
		List<TCompanyModuleBO> bos = new ArrayList<>();
		for (TCompanyModuleVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_角色菜单关系 VO 转换 BO */
	public TCompanyModuleBO toBO() {
		return TCompanyModuleBO.builder()
				.keyID(this.getKeyID())
				.compnayID(this.getCompnayID())
				.moduleID(this.getModuleID())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
