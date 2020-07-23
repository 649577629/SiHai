package cn.yj.bean.po;

import lombok.*;
import java.io.Serializable;
import java.util.Date;

/** 表_图片分类 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TPictureClassPO implements Serializable {

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

}
