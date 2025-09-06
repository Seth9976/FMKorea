package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;

final class zzawy implements BaseConnectionCallbacks {
    final zzawq zza;
    final zzcas zzb;
    final zzaxa zzc;
    public static final int zzd;

    zzawy(zzaxa zzaxa0, zzawq zzawq0, zzcas zzcas0) {
        this.zzc = zzaxa0;
        this.zza = zzawq0;
        this.zzb = zzcas0;
        super();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        synchronized(zzaxa.zzb(this.zzc)) {
            zzaxa zzaxa0 = this.zzc;
            if(!zzaxa.zzf(zzaxa0)) {
                zzaxa.zzd(zzaxa0, true);
                zzawp zzawp0 = zzaxa.zza(this.zzc);
                if(zzawp0 == null) {
                    return;
                }
                zzawv zzawv0 = new zzawv(this, zzawp0, this.zza, this.zzb);
                d d0 = zzcan.zza.zza(zzawv0);
                zzaww zzaww0 = new zzaww(this.zzb, d0);
                this.zzb.addListener(zzaww0, zzcan.zzf);
            }
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
    }
}

