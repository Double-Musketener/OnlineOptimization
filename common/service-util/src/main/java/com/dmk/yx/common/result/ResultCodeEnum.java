package com.dmk.yx.common.result;

import lombok.Data;
import lombok.Getter;

/**
 * @author LangJ
 * @version 1.0
 */

@Getter  //只创建get方法，即不能对值进行修改
public enum  ResultCodeEnum {


    SUCCESS(200,"成功"),
    FAIL(201, "失败"),
    SERVICE_ERROR(2012, "服务异常"),
    DATA_ERROR(204, "数据异常"),
    ILLEGAL_REQUEST(205, "非法请求"),
    REPEAT_SUBMIT(206, "重复提交"),

    LOGIN_AUTH(208, "未登陆"),
    PERMISSION(209, "没有权限"),

    ORDER_PRICE_ERROR(210, "订单商品价格变化"),
    ORDER_STOCK_FALL(204, "订单库存锁定失败"),
    CREATE_ORDER_FAIL(210, "创建订单失败"),

    COUPON_GET(220, "优惠券已经领取"),
    COUPON_LIMIT_GET(221, "优惠券已发放完毕"),

    URL_ENCODE_ERROR( 216, "URL编码失败"),
    ILLEGAL_CALLBACK_REQUEST_ERROR( 217, "非法回调请求"),
    FETCH_ACCESSTOKEN_FAILD( 218, "获取accessToken失败"),
    FETCH_USERINFO_ERROR( 219, "获取用户信息失败"),


    SKU_LIMIT_ERROR(230, "购买个数不能大于限购个数"),
    REGION_OPEN(240, "该区域已开通"),
    REGION_NO_OPEN(240, "该区域未开通"),
    ;


    //状态码
    private Integer code;

    //消息
    private String message;

    //私有化构造方法  使不能在外部创建类
    private ResultCodeEnum(Integer code,String message){
        this.code = code;
        this.message=message;
    }

}
