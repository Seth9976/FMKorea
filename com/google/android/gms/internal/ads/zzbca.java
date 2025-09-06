package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@Deprecated
public final class zzbca {
    public static final void zza(zzbbz zzbbz0, zzbbx zzbbx0) {
        if(zzbbx0.zza() == null) {
            throw new IllegalArgumentException("Context can\'t be null. Please set up context in CsiConfiguration.");
        }
        if(TextUtils.isEmpty(zzbbx0.zzb())) {
            throw new IllegalArgumentException("AfmaVersion can\'t be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbbz0.zzd(zzbbx0.zza(), zzbbx0.zzb(), zzbbx0.zzc(), zzbbx0.zzd());
    }
}

