package cn.yj.bean.vo;

import cn.yj.bean.bo.TPictureBO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_图片 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TPictureVO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**所属分类ID*/
	private String pictureClassId;

	/**关联ID*/
	private String relationID;

	/**图片名称*/
	private String pictureName;

	/**展示名称*/
	private String showName;

	/**图片地址*/
	private String pictureUrl;

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

	/** 表_图片 BO 转换 VO */
	public static TPictureVO toVO(TPictureBO bo) {
		if (bo != null) {
			return TPictureVO.builder()
					.keyID(bo.getKeyID())
					.pictureClassId(bo.getPictureClassId())
					.relationID(bo.getRelationID())
					.pictureName(bo.getPictureName())
					.showName(bo.getShowName())
					.pictureUrl(bo.getPictureUrl())
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

	/** 表_图片 BO 数组 转换 VO List */
	public static List<TPictureVO> toVO(TPictureBO[] bos) {
		List<TPictureVO> vos = new ArrayList<>();
		for (TPictureBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_图片 BO List 转换 VO List */
	public static List<TPictureVO> toVO(List<TPictureBO> bos) {
		List<TPictureVO> vos = new ArrayList<>();
		for (TPictureBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_图片 VO 转换 BO */
	public static TPictureBO toBO(TPictureVO vo) {
		if (vo != null) {
			return TPictureBO.builder()
					.keyID(vo.getKeyID())
					.pictureClassId(vo.getPictureClassId())
					.relationID(vo.getRelationID())
					.pictureName(vo.getPictureName())
					.showName(vo.getShowName())
					.pictureUrl(vo.getPictureUrl())
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

	/** 表_图片 VO List 转换 BO List */
	public static List<TPictureBO> toBO(List<TPictureVO> vos) {
		List<TPictureBO> bos = new ArrayList<>();
		for (TPictureVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_图片 VO 转换 BO */
	public TPictureBO toBO() {
		return TPictureBO.builder()
				.keyID(this.getKeyID())
				.pictureClassId(this.getPictureClassId())
				.relationID(this.getRelationID())
				.pictureName(this.getPictureName())
				.showName(this.getShowName())
				.pictureUrl(this.getPictureUrl())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
