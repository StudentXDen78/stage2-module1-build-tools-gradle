package com.epam.utils;
// import org.gradle.api.publish.maven;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return Integer.parseInt(str) > 0;
    }
}
