package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzeeb implements zzdfy {
    public final zzedq zza;

    public zzeeb(zzedq zzedq0) {
        this.zza = zzedq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdfy
    public final void zza(boolean z, Context context0, zzcwv zzcwv0) {
        try {
            ((zzfcw)this.zza.zzb).zzv(z);
            ((zzfcw)this.zza.zzb).zzw(context0);
        }
        catch(zzfcf zzfcf0) {
            throw new zzdfx(zzfcf0.getCause());
        }
    }
}

