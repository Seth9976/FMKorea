package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

public final class zzbuv {
    private final WeakHashMap zza;

    public zzbuv() {
        this.zza = new WeakHashMap();
    }

    static WeakHashMap zza(zzbuv zzbuv0) {
        return zzbuv0.zza;
    }

    public final Future zzb(Context context0) {
        zzbut zzbut0 = new zzbut(this, context0);
        return zzcan.zza.zzb(zzbut0);
    }
}

