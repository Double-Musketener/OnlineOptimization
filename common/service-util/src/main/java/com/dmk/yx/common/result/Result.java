package com.dmk.yx.common.result;


import lombok.Data;




/**
 * @author LangJ
 * @version 1.0
 */
@Data
public class Result<T> {
    //状态码
    private Integer  code;

    //信息
    private String message;

    //数据
    private T data;

    //将构造方法私有化  使不能在外部创建类。
    private Result() {}

    //创建build方法，外部像得到Result对象 只能通过build创建或通过ok()  false()方法。
    public static<T> Result<T> build(T data,ResultCodeEnum resultCodeEnum){
        //创建return的对象
        Result<T> tResult = new Result<>();
        //判断是否装入数据
        if(data!=null){
            tResult.setData(data);
        }
        //设置其他值
        tResult.setCode(resultCodeEnum.getCode());
        tResult.setMessage(resultCodeEnum.getMessage());
        return tResult;
    }

    //success和fail经常使用  则直接创建方法来方便调用。

    //成功的方法
    public static<T> Result<T> ok(T data){
        return build(data,ResultCodeEnum.SUCCESS);
    }

    //失败的方法
    public static<T> Result<T> fail(T data){
        return build(data,ResultCodeEnum.FAIL);
    }

}
