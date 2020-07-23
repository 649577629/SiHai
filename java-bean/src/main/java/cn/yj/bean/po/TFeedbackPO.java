package cn.yj.bean.po;

import lombok.*;
import java.io.Serializable;
import java.util.Date;

/** 表_反馈信息表 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TFeedbackPO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**用户ID*/
	private String userID;

	/**反馈内容*/
	private String remark;

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
