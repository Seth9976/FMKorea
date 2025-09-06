package com.google.android.gms.internal.measurement;

import X1.h;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jeb.synthetic.TWR;

public final class zzfy implements zzgb {
    private static final Map zza;
    private static final String[] zzb;
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map zzh;
    private final List zzi;

    static {
        zzfy.zza = new a();
        zzfy.zzb = new String[]{"key", "value"};
    }

    private zzfy(ContentResolver contentResolver0, Uri uri0, Runnable runnable0) {
        zzga zzga0 = new zzga(this, null);
        this.zzf = zzga0;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        h.i(contentResolver0);
        h.i(uri0);
        this.zzc = contentResolver0;
        this.zzd = uri0;
        this.zze = runnable0;
        contentResolver0.registerContentObserver(uri0, false, zzga0);
    }

    public static zzfy zza(ContentResolver contentResolver0, Uri uri0, Runnable runnable0) {
        synchronized(zzfy.class) {
            Map map0 = zzfy.zza;
            zzfy zzfy0 = (zzfy)map0.get(uri0);
            if(zzfy0 == null) {
                try {
                    zzfy zzfy1 = new zzfy(contentResolver0, uri0, runnable0);
                    try {
                        map0.put(uri0, zzfy1);
                    }
                    catch(SecurityException unused_ex) {
                    }
                    zzfy0 = zzfy1;
                }
                catch(SecurityException unused_ex) {
                }
            }
            return zzfy0;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzgb
    public final Object zza(String s) {
        return (String)this.zza().get(s);
    }

    public final Map zza() {
        Map map0 = this.zzh;
        if(map0 == null) {
            synchronized(this.zzg) {
                map0 = this.zzh;
                if(map0 == null) {
                    map0 = this.zze();
                    this.zzh = map0;
                }
            }
        }
        return map0 == null ? Collections.emptyMap() : map0;
    }

    // 检测为 Lambda 实现
    final Map zzb() [...]

    static void zzc() {
        synchronized(zzfy.class) {
            for(Object object0: zzfy.zza.values()) {
                ((zzfy)object0).zzc.unregisterContentObserver(((zzfy)object0).zzf);
            }
            zzfy.zza.clear();
        }
    }

    public final void zzd() {
        synchronized(this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized(this) {
            for(Object object0: this.zzi) {
                ((zzfz)object0).zza();
            }
        }
    }

    private final Map zze() {
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            return (Map)zzge.zza(() -> {
                Map map1;
                Map map0;
                Cursor cursor0 = this.zzc.query(this.zzd, zzfy.zzb, null, null, null);
                if(cursor0 == null) {
                    return Collections.emptyMap();
                }
                try {
                    int v = cursor0.getCount();
                    if(v != 0) {
                        map0 = v <= 0x100 ? new a(v) : new HashMap(v, 1.0f);
                        while(true) {
                            if(!cursor0.moveToNext()) {
                                goto label_12;
                            }
                            map0.put(cursor0.getString(0), cursor0.getString(1));
                        }
                    }
                    goto label_14;
                }
                catch(Throwable throwable0) {
                    goto label_17;
                }
            label_12:
                cursor0.close();
                return map0;
                try {
                label_14:
                    map1 = Collections.emptyMap();
                }
                catch(Throwable throwable0) {
                label_17:
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
                cursor0.close();
                return map1;
            });
        }
        catch(SecurityException | SQLiteException | IllegalStateException unused_ex) {
            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }
}

