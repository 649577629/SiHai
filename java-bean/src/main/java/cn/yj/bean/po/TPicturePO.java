package cn.yj.bean.po;

import lombok.*;
import java.io.Serializable;
import java.util.Date;

/** 表_图片 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TPicturePO implements Serializable {

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

}
