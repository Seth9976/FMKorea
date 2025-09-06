package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzefs implements zzdfy {
    private final zzfbe zza;
    private final zzbqc zzb;
    private final AdFormat zzc;
    private zzcxa zzd;

    zzefs(zzfbe zzfbe0, zzbqc zzbqc0, AdFormat adFormat0) {
        this.zzd = null;
        this.zza = zzfbe0;
        this.zzb = zzbqc0;
        this.zzc = adFormat0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdfy
    public final void zza(boolean z, Context context0, zzcwv zzcwv0) {
        boolean z1;
        try {
            int v = this.zzc.ordinal();
            switch(v) {
                case 1: {
                    IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(context0);
                    z1 = this.zzb.zzs(iObjectWrapper1);
                    goto label_14;
                }
                case 2: {
                    IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(context0);
                    z1 = this.zzb.zzt(iObjectWrapper2);
                    goto label_14;
                }
                default: {
                    if(v != 6) {
                        throw new zzdfx("Adapter failed to show.");
                    }
                    IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
                    z1 = this.zzb.zzr(iObjectWrapper0);
                    goto label_14;
                }
            }
        }
        catch(Throwable throwable0) {
        }
        throw new zzdfx(throwable0);
    label_14:
        if(!z1) {
            throw new zzdfx("Adapter failed to show.");
        }
        if(this.zzd == null) {
            return;
        }
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzbt)).booleanValue() && this.zza.zzZ == 2) {
            this.zzd.zza();
        }
    }

    public final void zzb(zzcxa zzcxa0) {
        this.zzd = zzcxa0;
    }
}

