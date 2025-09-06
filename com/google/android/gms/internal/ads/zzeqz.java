package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzeqz implements zzesi {
    private zzfof zza;
    private zzfof zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze;
    private final boolean zzf;

    public zzeqz(zzfof zzfof0, zzfof zzfof1, boolean z, boolean z1, boolean z2) {
        this.zza = zzfof0;
        this.zzb = zzfof1;
        this.zzc = z;
        this.zzd = z1;
        this.zze = false;
        this.zzf = z2;
    }

    public zzeqz(boolean z) {
        this.zze = true;
        this.zzf = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        if(!this.zze) {
            Bundle bundle0 = zzfcm.zza(((Bundle)object0), "pii");
            if((!this.zzf && ((Boolean)zzba.zzc().zzb(zzbbr.zzcG)).booleanValue() || this.zzf && ((Boolean)zzba.zzc().zzb(zzbbr.zzcI)).booleanValue()) && this.zza.zzc()) {
                bundle0.putString("paidv1_id_android", this.zza.zzb());
                bundle0.putLong("paidv1_creation_time_android", this.zza.zza());
            }
            if(!this.zzf && ((Boolean)zzba.zzc().zzb(zzbbr.zzcH)).booleanValue() || this.zzf && ((Boolean)zzba.zzc().zzb(zzbbr.zzcJ)).booleanValue()) {
                if(this.zzb.zzc()) {
                    bundle0.putString("paidv2_id_android", this.zzb.zzb());
                    bundle0.putLong("paidv2_creation_time_android", this.zzb.zza());
                }
                bundle0.putBoolean("paidv2_pub_option_android", this.zzc);
                bundle0.putBoolean("paidv2_user_option_android", this.zzd);
            }
            if(!bundle0.isEmpty()) {
                ((Bundle)object0).putBundle("pii", bundle0);
            }
        }
    }
}

