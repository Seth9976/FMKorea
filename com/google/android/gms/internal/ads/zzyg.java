package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzyg extends IOException {
    public zzyg(Throwable throwable0) {
        super("Unexpected " + throwable0.getClass().getSimpleName() + ": " + throwable0.getMessage(), throwable0);
    }
}

