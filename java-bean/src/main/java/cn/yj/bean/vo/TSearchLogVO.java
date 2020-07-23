package cn.yj.bean.vo;

import cn.yj.bean.bo.TSearchLogBO;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/** 表_搜索记录表 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TSearchLogVO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**用户ID*/
	private String userID;

	/**搜索内容*/
	private String content;

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

	/** 表_搜索记录表 BO 转换 VO */
	public static TSearchLogVO toVO(TSearchLogBO bo) {
		if (bo != null) {
			return TSearchLogVO.builder()
					.keyID(bo.getKeyID())
					.userID(bo.getUserID())
					.content(bo.getContent())
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

	/** 表_搜索记录表 BO 数组 转换 VO List */
	public static List<TSearchLogVO> toVO(TSearchLogBO[] bos) {
		List<TSearchLogVO> vos = new ArrayList<>();
		for (TSearchLogBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_搜索记录表 BO List 转换 VO List */
	public static List<TSearchLogVO> toVO(List<TSearchLogBO> bos) {
		List<TSearchLogVO> vos = new ArrayList<>();
		for (TSearchLogBO bo : bos) {
			vos.add(toVO(bo));
		}
		return vos;
	}

	/** 表_搜索记录表 VO 转换 BO */
	public static TSearchLogBO toBO(TSearchLogVO vo) {
		if (vo != null) {
			return TSearchLogBO.builder()
					.keyID(vo.getKeyID())
					.userID(vo.getUserID())
					.content(vo.getContent())
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

	/** 表_搜索记录表 VO List 转换 BO List */
	public static List<TSearchLogBO> toBO(List<TSearchLogVO> vos) {
		List<TSearchLogBO> bos = new ArrayList<>();
		for (TSearchLogVO vo : vos) {
			bos.add(toBO(vo));
		}
		return bos;
	}

	/** 表_搜索记录表 VO 转换 BO */
	public TSearchLogBO toBO() {
		return TSearchLogBO.builder()
				.keyID(this.getKeyID())
				.userID(this.getUserID())
				.content(this.getContent())
				.createTime(this.getCreateTime())
				.createID(this.getCreateID())
				.updateTime(this.getUpdateTime())
				.updateID(this.getUpdateID())
				.state(this.getState())
				.build();
	}

}
