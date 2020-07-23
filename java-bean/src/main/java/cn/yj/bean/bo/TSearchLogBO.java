package cn.yj.bean.bo;

import cn.yj.bean.po.TSearchLogPO;
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
public class TSearchLogBO implements Serializable {

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

	/** 表_搜索记录表 PO 转换 BO */
	public static TSearchLogBO toBO(TSearchLogPO po) {
		if (po != null) {
			return TSearchLogBO.builder()
					.keyID(po.getKeyID())
					.userID(po.getUserID())
					.content(po.getContent())
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

	/** 表_搜索记录表 PO 数组 转换 BO List */
	public static List<TSearchLogBO> toBO(TSearchLogPO[] pos) {
		List<TSearchLogBO> bos = new ArrayList<>();
		for (TSearchLogPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_搜索记录表 PO List 转换 BO List */
	public static List<TSearchLogBO> toBO(List<TSearchLogPO> pos) {
		List<TSearchLogBO> bos = new ArrayList<>();
		for (TSearchLogPO po : pos) {
			bos.add(toBO(po));
		}
		return bos;
	}

	/** 表_搜索记录表 BO 转换 PO */
	public static TSearchLogPO toPO(TSearchLogBO bo) {
		if (bo != null) {
			return TSearchLogPO.builder()
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

	/** 表_搜索记录表 BO List 转换 PO List */
	public static List<TSearchLogPO> toPO(List<TSearchLogBO> bos) {
		List<TSearchLogPO> pos = new ArrayList<>();
		for (TSearchLogBO bo : bos) {
			pos.add(toPO(bo));
		}
		return pos;
	}

	/** 表_搜索记录表 BO 转换 PO */
	public TSearchLogPO toPO() {
		return TSearchLogPO.builder()
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
