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
public class TrainActivitySpeedupFlowPO {

    /**
     * 自增主键
     */
    private Long id;

    /**
     * 用户助力id
     */
    private String uid;

    /**
     * 助力用户id
     */
    private String companionUid;

    /**
     * 助力用户名称
     */
    private String companionName;

    /**
     * 本次加速包数量
     */
    private Integer speedCount;

    /**
     * 0 不可回赠  1 可回赠
     */
    private Integer rebatable;

    /**
     * 火车票抢票单id
     */
    private String orderId;

    /**
     * 记录助力时间
     */
    private Date ctime;

    /**
     * 更新助力时间
     */
    private Date mtime;

    /**
     * 助力版本号
     */
    private Long version;

}
