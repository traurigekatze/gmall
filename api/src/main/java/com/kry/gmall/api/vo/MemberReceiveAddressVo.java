package com.kry.gmall.api.vo;

import com.kry.gmall.api.common.domain.BaseVo;
import lombok.Data;

/**
 * @author kerryhe
 * @date 2020/6/13
 */
@Data
public class MemberReceiveAddressVo extends BaseVo {

    private static final long serialVersionUID = -4120116228667955951L;

    /**
     * 收货人名称
     */
    private String name;

    private String phoneNumber;

    /**
     * 是否为默认
     */
    private Integer defaultStatus;

    /**
     * 邮政编码
     */
    private String postCode;

    /**
     * 省份/直辖市
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区
     */
    private String region;

    /**
     * 详细地址(街道)
     */
    private String detailAddress;

}
