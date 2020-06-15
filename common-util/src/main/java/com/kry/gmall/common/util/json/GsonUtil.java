package com.kry.gmall.common.util.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kry.gmall.common.util.dto.PersonDto;

/**
 * gson util
 * @author kerryhe
 * @date 2020/6/15
 */
public class GsonUtil {

    private GsonUtil() { }

    // value:null 会被忽略

    public static String toJson(Object o) {
        Gson gson = new Gson();
        return gson.toJson(o);
    }

    public static String toJson2(Object o) {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(o);
    }

    public static void main(String[] args) {
        PersonDto hank = new PersonDto("hank", "man", null, "");
        PersonDto leo = new PersonDto("leo", "man", null, "");
        System.out.println(GsonUtil.toJson(hank));
        System.out.println(GsonUtil.toJson2(leo));
    }

}
