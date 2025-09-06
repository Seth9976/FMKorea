package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.internal.bench.Benchmark;

@Keep
public interface AdListener {
    @Benchmark
    void onAdClicked(Ad arg1);

    @Benchmark
    void onAdLoaded(Ad arg1);

    @Benchmark
    void onError(Ad arg1, AdError arg2);

    @Benchmark
    void onLoggingImpression(Ad arg1);
}

