package io.github.doocs.im.util;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Random 随机数生成工具类
 *
 * @author bingo
 * @since 2022/7/28 15:41
 */
public class RandomUtil {
    public static final long DEFAULT_BOUND = 0x100000000L;

    /**
     * 生成随机的 32 位无符号整数，取值范围 [0, 4294967295]
     *
     * @return random
     */
    public static long next() {
        return next(DEFAULT_BOUND);
    }

    public static long next(long bound) {
        return ThreadLocalRandom.current().nextLong(0, bound);
    }

    private RandomUtil() {
    }
}
