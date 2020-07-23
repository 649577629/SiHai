package cn.yj.bean.vo;

import cn.yj.bean.bo.TUserRoleBO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_用户角色关系 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TUserRoleVO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**用户ID*/
	private String userID;

	/**角色ID*/
	private String roleID;

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

	/** 表_用户角色关系 BO 转换 VO */
	public static TUserRoleVO toVO(TUserRoleBO bo) {
		if (bo != null) {
			return TUserRoleVO.builder()
					.keyID(bo.getKeyID())
					.userID(bo.getUserID())
					.roleID(bo.getRoleID())
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

	/** 表_用户角色关系 BO 数组 转换 VO List */
	public static List<TUserRoleVO> toVO(TUserRoleBO[] bos) {
		List<TUserRoleVO> vos = new ArrayList<>();
		for (TUserRoleBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_用户角色关系 BO List 转换 VO List */
	public static List<TUserRoleVO> toVO(List<TUserRoleBO> bos) {
		List<TUserRoleVO> vos = new ArrayList<>();
		for (TUserRoleBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_用户角色关系 VO 转换 BO */
	public static TUserRoleBO toBO(TUserRoleVO vo) {
		if (vo != null) {
			return TUserRoleBO.builder()
					.keyID(vo.getKeyID())
					.userID(vo.getUserID())
					.roleID(vo.getRoleID())
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

	/** 表_用户角色关系 VO List 转换 BO List */
	public static List<TUserRoleBO> toBO(List<TUserRoleVO> vos) {
		List<TUserRoleBO> bos = new ArrayList<>();
		for (TUserRoleVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_用户角色关系 VO 转换 BO */
	public TUserRoleBO toBO() {
		return TUserRoleBO.builder()
				.keyID(this.getKeyID())
				.userID(this.getUserID())
				.roleID(this.getRoleID())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
