package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzbmz {
    private final Object zza;
    private final Object zzb;
    private zzbni zzc;
    private zzbni zzd;

    public zzbmz() {
        this.zza = new Object();
        this.zzb = new Object();
    }

    public final zzbni zza(Context context0, zzcag zzcag0, zzfhu zzfhu0) {
        synchronized(this.zza) {
            if(this.zzc == null) {
                this.zzc = new zzbni(zzbmz.zzc(context0), zzcag0, ((String)zzba.zzc().zzb(zzbbr.zza)), zzfhu0);
            }
            return this.zzc;
        }
    }

    public final zzbni zzb(Context context0, zzcag zzcag0, zzfhu zzfhu0) {
        synchronized(this.zzb) {
            if(this.zzd == null) {
                this.zzd = new zzbni(zzbmz.zzc(context0), zzcag0, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html", zzfhu0);
            }
            return this.zzd;
        }
    }

    private static final Context zzc(Context context0) {
        Context context1 = context0.getApplicationContext();
        return context1 == null ? context0 : context1;
    }
}

