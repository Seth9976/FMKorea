package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
public final class zzfln {
    private final Context zza;
    private final Looper zzb;

    public zzfln(Context context0, Looper looper0) {
        this.zza = context0;
        this.zzb = looper0;
    }

    public final void zza(String s) {
        zzfmb zzfmb0 = zzfmd.zza();
        zzfmb0.zza("com.fmkorea.m.fmk");
        zzfmb0.zzc(2);
        zzfly zzfly0 = zzflz.zza();
        zzfly0.zza(s);
        zzfly0.zzb(2);
        zzfmb0.zzb(zzfly0);
        zzfmd zzfmd0 = (zzfmd)zzfmb0.zzal();
        new zzflo(this.zza, this.zzb, zzfmd0).zza();
    }
}

