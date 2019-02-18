package com.mfw.traffic.train.po.marketing;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Setter;
import lombok.Getter;

/**
* description
* @date 2019-02-18 16:38
* @author mfw-gaofeng
*/
@Setter
@Getter
public class TrainGrabSpeedupAssocPO {

    /**
     * 自增主键
     */
    private Long id;

    /**
     * 用户助力id
     */
    private String uid;

    /**
     * 火车票抢票单id
     */
    private String orderId;

    /**
     * 金卡会员加速包
     */
    private Integer svipPackageCount;

    /**
     * 普通会员加速包
     */
    private Integer averagePackageCount;

    /**
     * 订单状态 0 :有效，1：无效
     */
    private Integer orderStatus;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 修改时间
     */
    private Date mtime;

    /**
     * 订单版本
     */
    private Long version;

}
