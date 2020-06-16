package com.kry.gmall.common.util.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author kerryhe
 * @date 2020/6/15
 */
public class JacksonUtil {

    private static final Log log;

    static {
        log = LogFactory.getLog(JacksonUtil.class);
    }

    private JacksonUtil() { }

//    log

    /**
     * object to json
     * @param source
     * @return
     */
    public static String toJson(Object source) {
        ObjectMapper mapper = new ObjectMapper();
        //在序列化时忽略值为 null 的属性
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(source);
        } catch (JsonProcessingException e) {
            log.error("jackson to Json error,", e);
            return "";
        }
    }

    /**
     * json to object
     * @param json
     * @param classOfT target class
     * @param <T>
     * @return
     */
    public static <T> T fromJson(String json, Class<T> classOfT) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json, classOfT);
        } catch (JsonProcessingException e) {
            log.error("jackson from Json error,", e);
            return null;
        }
    }

}
