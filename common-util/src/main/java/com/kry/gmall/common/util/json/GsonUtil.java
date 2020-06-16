package com.kry.gmall.common.util.json;

import com.google.gson.GsonBuilder;

/**
 * gson util
 * @author kerryhe
 * @date 2020/6/15
 */
public class GsonUtil {

    private GsonUtil() { }

    /**
     * object to json
     * @param source
     * @return
     */
    public static String toJson(Object source) {
        return new GsonBuilder().create().toJson(source);
    }

    /**
     * json to object
     * @param json
     * @param classOfT target class
     * @param <T>
     * @return
     */
    public static <T> T fromJson(String json, Class<T> classOfT) {
        return new GsonBuilder().create().fromJson(json, classOfT);
    }

}
