package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzfoj extends zzfog {
    private static zzfoj zzc;

    static {
    }

    private zzfoj(Context context0) {
        super(context0, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public final zzfof zzh(long v, boolean z) {
        synchronized(zzfoj.class) {
            if(!this.zzo()) {
                return new zzfof();
            }
        }
        return this.zzb(null, null, v, z);
    }

    public static final zzfoj zzi(Context context0) {
        synchronized(zzfoj.class) {
            if(zzfoj.zzc == null) {
                zzfoj.zzc = new zzfoj(context0);
            }
            return zzfoj.zzc;
        }
    }

    public final void zzj() {
        synchronized(zzfoj.class) {
            if(this.zzg(false)) {
                this.zzf(false);
            }
        }
    }

    public final void zzk() {
        this.zzb.zze("paidv2_publisher_option");
    }

    public final void zzl() {
        this.zzb.zze("paidv2_user_option");
    }

    public final void zzm(boolean z) {
        this.zzb.zzd("paidv2_user_option", Boolean.valueOf(z));
    }

    public final void zzn(boolean z) {
        this.zzb.zzd("paidv2_publisher_option", Boolean.valueOf(z));
        if(!z) {
            this.zzj();
        }
    }

    public final boolean zzo() {
        return this.zzb.zzf("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.zzb.zzf("paidv2_user_option", true);
    }
}

