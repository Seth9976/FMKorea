package com.google.android.gms.ads.internal.util;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzakx;
import com.google.android.gms.internal.ads.zzals;
import com.google.android.gms.internal.ads.zzalu;
import com.google.android.gms.internal.ads.zzamv;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcas;
import java.util.Map;

public final class zzbo {
    @Deprecated
    public static final zzbj zza;
    private static zzals zzb;
    private static final Object zzc;

    static {
        zzbo.zzc = new Object();
        zzbo.zza = new zzbg();
    }

    public zzbo(Context context0) {
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        synchronized(zzbo.zzc) {
            if(zzbo.zzb == null) {
                zzbbr.zza(context0);
                zzbo.zzb = ((Boolean)zzba.zzc().zzb(zzbbr.zzem)).booleanValue() ? zzax.zzb(context0) : zzamv.zza(context0, null);
            }
        }
    }

    public final d zza(String s) {
        d d0 = new zzcas();
        zzbo.zzb.zza(new zzbn(s, null, ((zzcas)d0)));
        return d0;
    }

    public final d zzb(int v, String s, Map map0, byte[] arr_b) {
        d d0 = new zzbl(null);
        zzbh zzbh0 = new zzbh(this, s, ((zzbl)d0));
        zzbzz zzbzz0 = new zzbzz(null);
        zzbi zzbi0 = new zzbi(this, v, s, ((zzalu)d0), zzbh0, arr_b, map0, zzbzz0);
        if(zzbzz.zzk()) {
            try {
                zzbzz0.zzd(s, "GET", zzbi0.zzl(), zzbi0.zzx());
            }
            catch(zzakx zzakx0) {
                zzcaa.zzj(zzakx0.getMessage());
            }
        }
        zzbo.zzb.zza(zzbi0);
        return d0;
    }
}

