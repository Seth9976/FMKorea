package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzfoi extends zzfog {
    private static zzfoi zzc;

    static {
    }

    private zzfoi(Context context0) {
        super(context0, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public final zzfof zzh(long v, boolean z) {
        synchronized(zzfoi.class) {
        }
        return this.zzb(null, null, v, z);
    }

    public final zzfof zzi(String s, String s1, long v, boolean z) {
        synchronized(zzfoi.class) {
        }
        return this.zzb(s, s1, v, z);
    }

    public static final zzfoi zzj(Context context0) {
        synchronized(zzfoi.class) {
            if(zzfoi.zzc == null) {
                zzfoi.zzc = new zzfoi(context0);
            }
            return zzfoi.zzc;
        }
    }

    public final void zzk() {
        synchronized(zzfoi.class) {
            this.zzf(false);
        }
    }

    public final void zzl() {
        synchronized(zzfoi.class) {
            this.zzf(true);
        }
    }
}

