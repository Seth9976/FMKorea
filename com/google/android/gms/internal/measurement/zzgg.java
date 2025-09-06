package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.d;

final class zzgg implements zzgb {
    private static zzgg zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzgg() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzgg(Context context0) {
        this.zzb = context0;
        zzgi zzgi0 = new zzgi(this, null);
        this.zzc = zzgi0;
        context0.getContentResolver().registerContentObserver(zzfr.zza, true, zzgi0);
    }

    static zzgg zza(Context context0) {
        synchronized(zzgg.class) {
            if(zzgg.zza == null) {
                zzgg.zza = d.b(context0, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzgg(context0) : new zzgg();
            }
            return zzgg.zza;
        }
    }

    static void zza() {
        synchronized(zzgg.class) {
            zzgg zzgg0 = zzgg.zza;
            if(zzgg0 != null) {
                Context context0 = zzgg0.zzb;
                if(context0 != null && zzgg0.zzc != null) {
                    context0.getContentResolver().unregisterContentObserver(zzgg.zza.zzc);
                }
            }
            zzgg.zza = null;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzgb
    public final Object zza(String s) {
        return this.zzc(s);
    }

    // 检测为 Lambda 实现
    final String zzb(String s) [...]

    private final String zzc(String s) {
        if(this.zzb != null && !zzfw.zza(this.zzb)) {
            try {
                return (String)zzge.zza(() -> zzfr.zza(this.zzb.getContentResolver(), s, null));
            }
            catch(IllegalStateException | SecurityException | NullPointerException illegalStateException0) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + s, illegalStateException0);
            }
        }
        return null;
    }
}

