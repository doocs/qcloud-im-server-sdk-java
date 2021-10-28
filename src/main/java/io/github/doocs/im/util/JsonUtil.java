package io.github.doocs.im.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;

/**
 * JSON tool
 *
 * @author bingo
 * @since 2021/7/27 17:41
 */
public class JsonUtil {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        JsonMapper.builder().enable(MapperFeature.USE_GETTERS_AS_SETTERS);
        JsonMapper.builder().enable(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS);
        OBJECT_MAPPER.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        OBJECT_MAPPER.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    private JsonUtil() {
    }

    public static String obj2Str(Object object) throws JsonProcessingException {
        return OBJECT_MAPPER.writeValueAsString(object);
    }

    public static <T> T str2Obj(String str, Class<T> cls) throws JsonProcessingException {
        return OBJECT_MAPPER.readValue(str, cls);
    }
}
