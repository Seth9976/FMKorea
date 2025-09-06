package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

public final class zzbba implements Callable {
    public static final zzbba zza;

    static {
        zzbba.zza = new zzbba();
    }

    @Override
    public final Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}

