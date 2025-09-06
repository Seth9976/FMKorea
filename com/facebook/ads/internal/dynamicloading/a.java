package com.facebook.ads.internal.dynamicloading;

import dalvik.system.InMemoryDexClassLoader;
import java.nio.ByteBuffer;

public abstract class a {
    public static InMemoryDexClassLoader a(ByteBuffer byteBuffer0, ClassLoader classLoader0) {
        return new InMemoryDexClassLoader(byteBuffer0, classLoader0);
    }
}

