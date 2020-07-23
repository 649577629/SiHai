package cn.yj.bean.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 请求结果返回消息类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultMessage implements Serializable {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 数据内容
     */
    private Object data;
    /**
     * 状态码描述
     */
    private String message;

    /**
     * 常用正确返回
     *
     * @param data 数据内容
     */
    public ResultMessage(Object data) {
        this.code = 200;
        this.data = data;
        this.message = "请求成功!";
    }

    /**
     * 常用错误返回
     *
     * @param code    状态码
     * @param message 状态码描述
     */
    public ResultMessage(Integer code, String message) {
        this.code = code;
        this.data = null;
        this.message = message;
    }
}
