package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbb;

public final class zzbni {
    static final zzbb zza;
    static final zzbb zzb;
    private final zzbmu zzc;

    static {
        zzbni.zza = new zzbng();
        zzbni.zzb = new zzbnh();
    }

    public zzbni(Context context0, zzcag zzcag0, String s, zzfhu zzfhu0) {
        this.zzc = new zzbmu(context0, zzcag0, s, zzbni.zza, zzbni.zzb, zzfhu0);
    }

    public final zzbmy zza(String s, zzbnb zzbnb0, zzbna zzbna0) {
        return new zzbnm(this.zzc, s, zzbnb0, zzbna0);
    }

    public final zzbnr zzb() {
        return new zzbnr(this.zzc);
    }
}

