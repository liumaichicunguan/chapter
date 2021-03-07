package org.qgiuaooe.utils;

import org.apache.commons.lang3.StringUtils;

import static java.lang.Boolean.*;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public final class CastUtil {

    public static String castString(Object obj) {
        return castString(obj, "");
    }
    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    public static double castDouble(Object obj) {
        return castDouble(obj, 0);
    }
    public static double castDouble(Object obj, double defaultValue) {
        double doubleValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtils.isNotEmpty(strValue)) {
                doubleValue = parseDouble(strValue);
            }
        }
        return doubleValue;
    }

    public static long castLong(Object obj) {
        return castLong(obj, 0);
    }
    public static long castLong(Object obj, long defaultValue) {
        long longValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtils.isNotEmpty(strValue)) {
                longValue = parseLong(strValue);
            }
        }
        return longValue;
    }

    public static int castInt(Object obj) {
        return castInt(obj, 0);
    }
    public static int castInt(Object obj, int defaultValue) {
        int intValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtils.isNotEmpty(strValue)) {
                intValue = parseInt(strValue);
            }
        }
        return intValue;
    }

    public static boolean castBoolean(Object obj) {
        return castBoolean(obj, false);
    }
    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtils.isNotEmpty(strValue)) {
                booleanValue = parseBoolean(strValue);
            }
        }
        return booleanValue;
    }

}
