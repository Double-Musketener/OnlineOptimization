package com.dmk.yx.common.exception;

import com.dmk.yx.common.result.ResultCodeEnum;
import lombok.Data;

/**
 * @author LangJ
 * @version 1.0
 */

@Data
public class YxException extends RuntimeException{

    //异常码
    private Integer code;

//    //错误消息
//    private String message;


    /**
     * 通过状态码和错误消息创建异常对象
     * @param message
     * @param code
     */
    public YxException(Integer code,String message){
        super(message);
        this.code = code;
    }

    /**
     * 通过接收枚举类型创建异常
     * @param resultCodeEnum
     */
    public YxException(ResultCodeEnum resultCodeEnum){
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "YxException{" +
                "code=" + code +
                '}';
    }
}
