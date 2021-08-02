package com.github.doocs.im.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.lang3.SerializationException;

import java.io.IOException;

/**
 * JSON tool
 *
 * @author bingo
 * @since 2021/7/27 17:41
 */
public class JsonUtil {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final ObjectMapper INDENT_OUTPUT_OBJECT_MAPPER = new ObjectMapper();

    static {
        OBJECT_MAPPER.enable(MapperFeature.USE_GETTERS_AS_SETTERS);
        OBJECT_MAPPER.enable(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS);
        OBJECT_MAPPER.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        OBJECT_MAPPER.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        INDENT_OUTPUT_OBJECT_MAPPER.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        INDENT_OUTPUT_OBJECT_MAPPER.enable(SerializationFeature.INDENT_OUTPUT);
        INDENT_OUTPUT_OBJECT_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    private JsonUtil() {
    }

    public static String obj2Str(Object object) {
        String str = "";
        try {
            str = OBJECT_MAPPER.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static <T> T str2Obj(String str, Class<T> cls) {
        T object = null;
        try {
            object = OBJECT_MAPPER.readValue(str, cls);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;
    }

    public static void writeValueWithoutNullValue(Object object) {
        try {
            if (null != object) {
                INDENT_OUTPUT_OBJECT_MAPPER.writeValueAsString(object);
            }
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }
}
