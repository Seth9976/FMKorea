package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;

public final class zzbxn implements zzauf {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzbxn(Context context0, String s) {
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.zza = context0;
        this.zzc = s;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final String zza() {
        return this.zzc;
    }

    public final void zzb(boolean z) {
        if(!zzt.zzn().zzu(this.zza)) {
            return;
        }
        synchronized(this.zzb) {
            if(this.zzd == z) {
                return;
            }
            this.zzd = z;
            if(TextUtils.isEmpty(this.zzc)) {
                return;
            }
            if(this.zzd) {
                zzt.zzn().zzh(this.zza, this.zzc);
            }
            else {
                zzt.zzn().zzi(this.zza, this.zzc);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaue0) {
        this.zzb(zzaue0.zzj);
    }
}

