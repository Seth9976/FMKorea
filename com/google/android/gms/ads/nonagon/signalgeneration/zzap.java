package com.google.android.gms.ads.nonagon.signalgeneration;

import java.util.concurrent.Callable;

public final class zzap implements Callable {
    public final TaggingLibraryJsInterface zza;

    public zzap(TaggingLibraryJsInterface taggingLibraryJsInterface0) {
        this.zza = taggingLibraryJsInterface0;
    }

    @Override
    public final Object call() {
        return this.zza.getViewSignals();
    }
}

