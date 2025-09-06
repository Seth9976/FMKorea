package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import androidx.collection.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzgw implements zzgb {
    private static final Map zza;
    private final SharedPreferences zzb;
    private final Runnable zzc;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzd;
    private final Object zze;
    private volatile Map zzf;
    private final List zzg;

    static {
        zzgw.zza = new a();
    }

    private zzgw(SharedPreferences sharedPreferences0, Runnable runnable0) {
        zzgz zzgz0 = (SharedPreferences sharedPreferences0, String s) -> {
            synchronized(this.zze) {
                this.zzf = null;
                this.zzc.run();
            }
            synchronized(this) {
                for(Object object0: this.zzg) {
                    ((zzfz)object0).zza();
                }
            }
        };
        this.zzd = zzgz0;
        this.zze = new Object();
        this.zzg = new ArrayList();
        this.zzb = sharedPreferences0;
        this.zzc = runnable0;
        sharedPreferences0.registerOnSharedPreferenceChangeListener(zzgz0);
    }

    private static SharedPreferences zza(Context context0, String s) {
        SharedPreferences sharedPreferences1;
        SharedPreferences sharedPreferences0;
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            if(s.startsWith("direct_boot:")) {
                sharedPreferences0 = context0.createDeviceProtectedStorageContext().getSharedPreferences(s.substring(12), 0);
                goto label_3;
            }
            sharedPreferences1 = context0.getSharedPreferences(s, 0);
            goto label_10;
        }
        catch(Throwable throwable0) {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            throw throwable0;
        }
    label_3:
        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        return sharedPreferences0;
        try {
            sharedPreferences1 = context0.getSharedPreferences(s, 0);
        }
        catch(Throwable throwable0) {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            throw throwable0;
        }
    label_10:
        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        return sharedPreferences1;
    }

    static zzgw zza(Context context0, String s, Runnable runnable0) {
        if(!(s.startsWith("direct_boot:") ? true : zzfw.zzb(context0))) {
            return null;
        }
        synchronized(zzgw.class) {
            Map map0 = zzgw.zza;
            zzgw zzgw0 = (zzgw)map0.get(s);
            if(zzgw0 == null) {
                zzgw0 = new zzgw(zzgw.zza(context0, s), runnable0);
                map0.put(s, zzgw0);
            }
            return zzgw0;
        }
    }

    static void zza() {
        synchronized(zzgw.class) {
            for(Object object0: zzgw.zza.values()) {
                ((zzgw)object0).zzb.unregisterOnSharedPreferenceChangeListener(((zzgw)object0).zzd);
            }
            zzgw.zza.clear();
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzgb
    public final Object zza(String s) {
        Map map1;
        Map map0 = this.zzf;
        if(map0 == null) {
            synchronized(this.zze) {
                map0 = this.zzf;
                if(map0 == null) {
                    StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
                    try {
                        map1 = this.zzb.getAll();
                        this.zzf = map1;
                    }
                    catch(Throwable throwable0) {
                        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
                        throw throwable0;
                    }
                    StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
                    map0 = map1;
                }
            }
        }
        return map0 == null ? null : map0.get(s);
    }

    // 检测为 Lambda 实现
    final void zza(SharedPreferences sharedPreferences0, String s) [...]
}

