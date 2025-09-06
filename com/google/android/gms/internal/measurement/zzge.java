package com.google.android.gms.internal.measurement;

import android.os.Binder;

public final class zzge {
    public static Object zza(zzgd zzgd0) {
        try {
            return zzgd0.zza();
        }
        catch(SecurityException unused_ex) {
            long v = Binder.clearCallingIdentity();
            try {
                return zzgd0.zza();
            }
            finally {
                Binder.restoreCallingIdentity(v);
            }
        }
    }
}

