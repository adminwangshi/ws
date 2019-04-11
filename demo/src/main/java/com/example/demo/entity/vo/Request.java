package com.example.demo.entity.vo;

import lombok.Data;

/**
 * @Author wangshi
 * @ClassName Request
 * @Description TODO
 * @Date 2019/4/3 11:27
 * @Version V1.0
 */
@Data
public class Request <T>{

    /**
     * 服务代码
     */
    private Integer code;
    /**
     * 服务信息
     */
    private String message;
    /**
     * 结果数据
     */
    private T data;



}
