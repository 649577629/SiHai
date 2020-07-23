package cn.yj.bean.vo;

import cn.yj.bean.bo.TMenuBO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_菜单 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TMenuVO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**名称*/
	private String menuName;

	/**路径*/
	private String menuUrl;

	/**菜单标识*/
	private String menuSign;

	/**父级ID*/
	private String parentID;

	/**是否跳转  (0.否 1.是)*/
	private Integer isTurn;

	/**排序(按数字从小到大)*/
	private Integer menuOrder;

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

	/** 表_菜单 BO 转换 VO */
	public static TMenuVO toVO(TMenuBO bo) {
		if (bo != null) {
			return TMenuVO.builder()
					.keyID(bo.getKeyID())
					.menuName(bo.getMenuName())
					.menuUrl(bo.getMenuUrl())
					.menuSign(bo.getMenuSign())
					.parentID(bo.getParentID())
					.isTurn(bo.getIsTurn())
					.menuOrder(bo.getMenuOrder())
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

	/** 表_菜单 BO 数组 转换 VO List */
	public static List<TMenuVO> toVO(TMenuBO[] bos) {
		List<TMenuVO> vos = new ArrayList<>();
		for (TMenuBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_菜单 BO List 转换 VO List */
	public static List<TMenuVO> toVO(List<TMenuBO> bos) {
		List<TMenuVO> vos = new ArrayList<>();
		for (TMenuBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_菜单 VO 转换 BO */
	public static TMenuBO toBO(TMenuVO vo) {
		if (vo != null) {
			return TMenuBO.builder()
					.keyID(vo.getKeyID())
					.menuName(vo.getMenuName())
					.menuUrl(vo.getMenuUrl())
					.menuSign(vo.getMenuSign())
					.parentID(vo.getParentID())
					.isTurn(vo.getIsTurn())
					.menuOrder(vo.getMenuOrder())
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

	/** 表_菜单 VO List 转换 BO List */
	public static List<TMenuBO> toBO(List<TMenuVO> vos) {
		List<TMenuBO> bos = new ArrayList<>();
		for (TMenuVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_菜单 VO 转换 BO */
	public TMenuBO toBO() {
		return TMenuBO.builder()
				.keyID(this.getKeyID())
				.menuName(this.getMenuName())
				.menuUrl(this.getMenuUrl())
				.menuSign(this.getMenuSign())
				.parentID(this.getParentID())
				.isTurn(this.getIsTurn())
				.menuOrder(this.getMenuOrder())
				.remark(this.getRemark())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
