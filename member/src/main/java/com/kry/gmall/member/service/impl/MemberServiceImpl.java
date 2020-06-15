package com.kry.gmall.member.service.impl;

import com.kry.gmall.api.domain.Member;
import com.kry.gmall.api.domain.MemberReceiveAddress;
import com.kry.gmall.api.qry.MemberQry;
import com.kry.gmall.api.qry.QryId;
import com.kry.gmall.api.service.MemberService;
import com.kry.gmall.api.vo.MemberReceiveAddressVo;
import com.kry.gmall.api.vo.MemberVo;
import com.kry.gmall.member.common.service.impl.IServiceImpl;
import com.kry.gmall.member.dao.MemberMapper;
import com.kry.gmall.member.dao.MemberReceiveAddressMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kerryhe
 * @date 2020/6/12
 */
@Service
public class MemberServiceImpl extends IServiceImpl<Member> implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private MemberReceiveAddressMapper receiveAddressMapper;

    @Override
    public List<MemberVo> findAll(MemberQry qry) {
        Member record = new Member();
        List<Member> list = memberMapper.select(record);
        List<MemberVo> vos = new ArrayList<>();
        if (!CollectionUtils.isEmpty(list)) {
            list.forEach(m -> {
                MemberVo vo = new MemberVo();
                BeanUtils.copyProperties(m, vo);
                vos.add(vo);
            });
        }
        return vos;
    }

    @Override
    public List<MemberReceiveAddressVo> findAddressByMid(QryId qryId) {
        MemberReceiveAddress record = new MemberReceiveAddress();
        record.setMemberId(qryId.getId());
        List<MemberReceiveAddress> list = receiveAddressMapper.select(record);

        List<MemberReceiveAddressVo> vos = new ArrayList<>();
        if (!CollectionUtils.isEmpty(list)) {
            list.forEach(m -> {
                MemberReceiveAddressVo vo = new MemberReceiveAddressVo();
                BeanUtils.copyProperties(m, vo);
                vos.add(vo);
            });
        }
        return vos;
    }
}
