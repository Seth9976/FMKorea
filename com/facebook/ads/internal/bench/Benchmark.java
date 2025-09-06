package com.facebook.ads.internal.bench;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface Benchmark {
    int failAtMillis() default 0x7FFFFFFF;

    int warnAtMillis() default 0x7FFFFFFF;
}

