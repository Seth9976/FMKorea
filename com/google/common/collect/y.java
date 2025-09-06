package com.google.common.collect;

import X1.c;
import java.util.Map.Entry;
import java.util.Map;

public abstract class y {
    static abstract enum a implements c {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.collect.y.a.a extends a {
            com.google.common.collect.y.a.a(String s, int v) {
                super(null);
            }

            @Override  // X1.c
            public Object apply(Object object0) {
                return this.f(((Map.Entry)object0));
            }

            public Object f(Map.Entry map$Entry0) {
                return map$Entry0.getKey();
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class b extends a {
            b(String s, int v) {
                super(null);
            }

            @Override  // X1.c
            public Object apply(Object object0) {
                return this.f(((Map.Entry)object0));
            }

            public Object f(Map.Entry map$Entry0) {
                return map$Entry0.getValue();
            }
        }

        KEY /* 警告！未生成枚举子类：com.google.common.collect.y$a$a */,
        VALUE /* 警告！未生成枚举子类：com.google.common.collect.y$a$b */;

        private a() {
        }

        a(x x0) {
            this();
        }

        private static a[] b() [...] // Inlined contents
    }

    static boolean a(Map map0, Object object0) {
        if(map0 == object0) {
            return true;
        }
        return object0 instanceof Map ? map0.entrySet().equals(((Map)object0).entrySet()) : false;
    }

    static c b() {
        return a.f;
    }

    static String c(Map map0) {
        StringBuilder stringBuilder0 = g.a(map0.size());
        stringBuilder0.append('{');
        boolean z = true;
        for(Object object0: map0.entrySet()) {
            if(!z) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((Map.Entry)object0).getKey());
            stringBuilder0.append('=');
            stringBuilder0.append(((Map.Entry)object0).getValue());
            z = false;
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    static c d() {
        return a.g;
    }
}

