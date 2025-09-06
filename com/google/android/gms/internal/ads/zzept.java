package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzept implements zzesi {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzept(String s, boolean z, boolean z1, boolean z2, boolean z3) {
        this.zza = s;
        this.zzb = z;
        this.zzc = z1;
        this.zzd = z2;
        this.zze = z3;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        if(!this.zza.isEmpty()) {
            ((Bundle)object0).putString("inspector_extras", this.zza);
        }
        ((Bundle)object0).putInt("test_mode", ((int)this.zzb));
        ((Bundle)object0).putInt("linked_device", ((int)this.zzc));
        if(this.zzb || this.zzc) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zziP)).booleanValue()) {
                ((Bundle)object0).putInt("risd", !this.zzd);
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zziT)).booleanValue()) {
                ((Bundle)object0).putBoolean("collect_response_logs", this.zze);
            }
        }
    }
}

