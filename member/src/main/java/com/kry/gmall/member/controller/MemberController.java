package com.kry.gmall.member.controller;

import com.kry.gmall.api.common.domain.ResponseBo;
import com.kry.gmall.api.qry.MemberQry;
import com.kry.gmall.api.qry.QryId;
import com.kry.gmall.api.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author kerryhe
 * @date 2020/6/10
 */
@RestController
@RequestMapping("/member/")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("index")
    public ResponseBo index() {
        return ResponseBo.okWithObj("hello world");
    }

    @PostMapping("findAll")
    public ResponseBo findAll(@RequestBody MemberQry memberQry) {
        return ResponseBo.okWithObj(memberService.findAll(memberQry));
    }

    @GetMapping("findAddressByMid/{mId}")
    public ResponseBo findAddressByMid(@PathVariable("mId") long mId) {
        return ResponseBo.okWithObj(memberService.findAddressByMid(new QryId(mId)));
    }



}
