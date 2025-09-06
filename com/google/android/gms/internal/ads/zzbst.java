package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbst {
    private static zzbyr zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final zzdx zzd;
    private final String zze;

    public zzbst(Context context0, AdFormat adFormat0, zzdx zzdx0, String s) {
        this.zzb = context0;
        this.zzc = adFormat0;
        this.zzd = zzdx0;
        this.zze = s;
    }

    public static zzbyr zza(Context context0) {
        synchronized(zzbst.class) {
            if(zzbst.zza == null) {
                zzbst.zza = zzay.zza().zzr(context0, new zzboc());
            }
            return zzbst.zza;
        }
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        zzbyr zzbyr0 = zzbst.zza(this.zzb);
        if(zzbyr0 == null) {
            queryInfoGenerationCallback0.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zzb);
        zzl zzl0 = this.zzd == null ? new zzm().zza() : zzp.zza.zza(this.zzb, this.zzd);
        zzbyv zzbyv0 = new zzbyv(this.zze, this.zzc.name(), null, zzl0);
        try {
            zzbyr0.zze(iObjectWrapper0, zzbyv0, new zzbss(this, queryInfoGenerationCallback0));
        }
        catch(RemoteException unused_ex) {
            queryInfoGenerationCallback0.onFailure("Internal Error.");
        }
    }
}

