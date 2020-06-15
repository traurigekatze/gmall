package com.kry.gmall.api.vo;

import com.kry.gmall.api.common.domain.BaseVo;
import lombok.Data;

import java.util.Date;

/**
 * @author kerryhe
 * @date 2020/6/12
 */
@Data
public class MemberVo extends BaseVo {

    private static final long serialVersionUID = -3231245807699043326L;

    private Long id;

    private Long memberLevelId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 帐号启用状态:0->禁用；1->启用
     */
    private Integer status;

    /**
     * 注册时间
     */
    private Date createTime;

    /**
     * 性别：0->未知；1->男；2->女
     */
    private Integer gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 所做城市
     */
    private String city;

    /**
     * 职业
     */
    private String job;

    /**
     * 个性签名
     */
    private String personalizedSignature;

    /**
     * 用户来源
     */
    private Integer sourceType;

    /**
     * 积分
     */
    private Integer integration;

    /**
     * 成长值
     */
    private Integer growth;

    /**
     * 剩余抽奖次数
     */
    private Integer luckyCount;

    /**
     * 历史积分数量
     */
    private Integer historyIntegration;

}
