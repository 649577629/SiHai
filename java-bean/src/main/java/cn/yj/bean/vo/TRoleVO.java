package cn.yj.bean.vo;

import cn.yj.bean.bo.TRoleBO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_角色 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TRoleVO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**名称*/
	private String roleName;

	/**备注*/
	private String remark;

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

	/** 表_角色 BO 转换 VO */
	public static TRoleVO toVO(TRoleBO bo) {
		if (bo != null) {
			return TRoleVO.builder()
					.keyID(bo.getKeyID())
					.roleName(bo.getRoleName())
					.remark(bo.getRemark())
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

	/** 表_角色 BO 数组 转换 VO List */
	public static List<TRoleVO> toVO(TRoleBO[] bos) {
		List<TRoleVO> vos = new ArrayList<>();
		for (TRoleBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_角色 BO List 转换 VO List */
	public static List<TRoleVO> toVO(List<TRoleBO> bos) {
		List<TRoleVO> vos = new ArrayList<>();
		for (TRoleBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_角色 VO 转换 BO */
	public static TRoleBO toBO(TRoleVO vo) {
		if (vo != null) {
			return TRoleBO.builder()
					.keyID(vo.getKeyID())
					.roleName(vo.getRoleName())
					.remark(vo.getRemark())
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

	/** 表_角色 VO List 转换 BO List */
	public static List<TRoleBO> toBO(List<TRoleVO> vos) {
		List<TRoleBO> bos = new ArrayList<>();
		for (TRoleVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_角色 VO 转换 BO */
	public TRoleBO toBO() {
		return TRoleBO.builder()
				.keyID(this.getKeyID())
				.roleName(this.getRoleName())
				.remark(this.getRemark())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
