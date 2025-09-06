package com.facebook.ads;

import androidx.annotation.Keep;
import java.util.EnumSet;

@Keep
public enum CacheFlag {
    NONE,
    ICON,
    IMAGE,
    VIDEO;

    public static final EnumSet ALL;

    static {
        CacheFlag.ALL = EnumSet.allOf(CacheFlag.class);
    }
}

