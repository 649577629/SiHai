package cn.yj.bean.po;

import lombok.*;
import java.io.Serializable;
import java.util.Date;

/** 表_区域 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TAreaPO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**地区名称CN*/
	private String areaNameCN;

	/**地区名称EN*/
	private String areaNameEN;

	/**父级ID*/
	private String upLevelID;

	/**等级*/
	private Integer areaLevel;

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
