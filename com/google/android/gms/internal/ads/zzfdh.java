package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import java.util.HashSet;

public final class zzfdh implements zzcwl {
    private final HashSet zza;
    private final Context zzb;
    private final zzbzn zzc;

    public zzfdh(Context context0, zzbzn zzbzn0) {
        this.zza = new HashSet();
        this.zzb = context0;
        this.zzc = zzbzn0;
    }

    public final Bundle zzb() {
        return this.zzc.zzn(this.zzb, this);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(zze zze0) {
        synchronized(this) {
            if(zze0.zza != 3) {
                this.zzc.zzl(this.zza);
            }
        }
    }

    public final void zzc(HashSet hashSet0) {
        synchronized(this) {
            this.zza.clear();
            this.zza.addAll(hashSet0);
        }
    }
}

