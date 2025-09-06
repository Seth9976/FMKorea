package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzeif implements zzdfy {
    public final zzedq zza;

    public zzeif(zzedq zzedq0) {
        this.zza = zzedq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdfy
    public final void zza(boolean z, Context context0, zzcwv zzcwv0) {
        try {
            ((zzfcw)this.zza.zzb).zzv(z);
            ((zzfcw)this.zza.zzb).zzA();
        }
        catch(zzfcf zzfcf0) {
            zzcaa.zzk("Cannot show rewarded video.", zzfcf0);
            throw new zzdfx(zzfcf0.getCause());
        }
    }
}

