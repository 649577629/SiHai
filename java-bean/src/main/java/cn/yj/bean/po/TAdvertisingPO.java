package cn.yj.bean.po;

import lombok.*;
import java.io.Serializable;
import java.util.Date;

/** 表_广告 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TAdvertisingPO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**关联公司ID*/
	private String companyID;

	/**广告内容*/
	private String adContent;

	/**上架时间*/
	private Date setTime;

	/**下架时间*/
	private Date downTime;

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
