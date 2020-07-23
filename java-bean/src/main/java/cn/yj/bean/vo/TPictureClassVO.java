package cn.yj.bean.vo;

import cn.yj.bean.bo.TPictureClassBO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_图片分类 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TPictureClassVO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**图片名称*/
	private String className;

	/**分类描述*/
	private String pictureDetails;

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

	/** 表_图片分类 BO 转换 VO */
	public static TPictureClassVO toVO(TPictureClassBO bo) {
		if (bo != null) {
			return TPictureClassVO.builder()
					.keyID(bo.getKeyID())
					.className(bo.getClassName())
					.pictureDetails(bo.getPictureDetails())
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

	/** 表_图片分类 BO 数组 转换 VO List */
	public static List<TPictureClassVO> toVO(TPictureClassBO[] bos) {
		List<TPictureClassVO> vos = new ArrayList<>();
		for (TPictureClassBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_图片分类 BO List 转换 VO List */
	public static List<TPictureClassVO> toVO(List<TPictureClassBO> bos) {
		List<TPictureClassVO> vos = new ArrayList<>();
		for (TPictureClassBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_图片分类 VO 转换 BO */
	public static TPictureClassBO toBO(TPictureClassVO vo) {
		if (vo != null) {
			return TPictureClassBO.builder()
					.keyID(vo.getKeyID())
					.className(vo.getClassName())
					.pictureDetails(vo.getPictureDetails())
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

	/** 表_图片分类 VO List 转换 BO List */
	public static List<TPictureClassBO> toBO(List<TPictureClassVO> vos) {
		List<TPictureClassBO> bos = new ArrayList<>();
		for (TPictureClassVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_图片分类 VO 转换 BO */
	public TPictureClassBO toBO() {
		return TPictureClassBO.builder()
				.keyID(this.getKeyID())
				.className(this.getClassName())
				.pictureDetails(this.getPictureDetails())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
