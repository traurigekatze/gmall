package com.kry.gmall.api.qry;

import com.kry.gmall.api.common.domain.BaseQry;
import lombok.Data;

/**
 * @author kerryhe
 * @date 2020/6/12
 */
@Data
public class MemberQry extends BaseQry {

    private static final long serialVersionUID = -7645982759298188239L;

    private String name;

    private String phone;

    private Integer status;


}
