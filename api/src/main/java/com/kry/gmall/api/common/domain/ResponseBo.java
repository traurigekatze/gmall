package com.kry.gmall.api.common.domain;

import java.util.HashMap;

/**
 * @author kerryhe
 * @date 2020/6/11
 */
public class ResponseBo extends HashMap<String, Object> {

    private static final long serialVersionUID = -8353657624624664283L;

    private static Integer SUCCESS_CODE = 200;
    private static String SUCCESS_DESC = "success";

    private static Integer UNAUTHORIZED_CODE = 401;
    private static String UNAUTHORIZED_DESC = "unauthorized";

    private static Integer FAIL_CODE = 500;

    private ResponseBo() { }

    private static ResponseBo init(Integer code, String msg) {
        ResponseBo responseBo = new ResponseBo();
        responseBo.put("code", code);
        responseBo.put("msg", msg);
        return responseBo;
    }

    /**
     * return ok
     * @return
     */
    public static ResponseBo ok() {
        return init(SUCCESS_CODE, SUCCESS_DESC);
    }

    /**
     * return ok
     * @param data
     * @return
     */
    public static ResponseBo okWithObj(Object data) {
        ResponseBo responseBo = init(SUCCESS_CODE, SUCCESS_DESC);
        responseBo.put("data", data);
        return responseBo;
    }


    /**
     * return unauthorized
     * @return
     */
    public static ResponseBo unauthorized() {
        return init(UNAUTHORIZED_CODE, UNAUTHORIZED_DESC);
    }

    /**
     * return fail
     * @param msg
     * @return
     */
    public static ResponseBo error(String msg) {
        return init(FAIL_CODE, msg);
    }

}
