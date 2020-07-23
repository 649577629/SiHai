package cn.yj.bean.po;

import lombok.*;
import java.io.Serializable;
import java.util.Date;

/** 表_参数 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TParameterPO implements Serializable {

	/**主键ID*/
	private String keyID;

	/**参数代码*/
	private String parameterCode;

	/**参数名称*/
	private String parameterName;

	/**参数值*/
	private String parameterValue;

	/**参数说明*/
	private String parameterExplain;

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
