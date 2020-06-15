package com.kry.gmall.api.service;

import com.kry.gmall.api.common.service.IService;
import com.kry.gmall.api.domain.Member;
import com.kry.gmall.api.qry.MemberQry;
import com.kry.gmall.api.qry.QryId;
import com.kry.gmall.api.vo.MemberReceiveAddressVo;
import com.kry.gmall.api.vo.MemberVo;

import java.util.List;

/**
 * @author kerryhe
 * @date 2020/6/12
 */
public interface MemberService extends IService<Member> {

    /**
     * find all
     * @param qry
     * @return
     */
    List<MemberVo> findAll(MemberQry qry);

    /**
     * find receive address by member id
     * @param qryId
     * @return
     */
    List<MemberReceiveAddressVo> findAddressByMid(QryId qryId);

}
