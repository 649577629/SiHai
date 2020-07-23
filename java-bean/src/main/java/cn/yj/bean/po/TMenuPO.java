package cn.yj.bean.po;

import lombok.*;
import java.io.Serializable;
import java.util.Date;

/** 表_菜单 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TMenuPO implements Serializable {

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

}
