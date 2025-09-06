package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgn {
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    @Deprecated
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final String zzh;
    public final int zzi;
    public static final int zzj;

    static {
        zzbq.zzb("media3.datasource");
    }

    public zzgn(Uri uri0) {
        this(uri0, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 0, null);
    }

    private zzgn(Uri uri0, long v, int v1, byte[] arr_b, Map map0, long v2, long v3, String s, int v4, Object object0) {
        long v5 = v + v2;
        boolean z = false;
        zzdy.zzd(Long.compare(v5, 0L) >= 0);
        zzdy.zzd(v2 >= 0L);
        if(v3 > 0L) {
            z = true;
        }
        else if(v3 == -1L) {
            v3 = -1L;
            z = true;
        }
        zzdy.zzd(z);
        this.zza = uri0;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map0));
        this.zzf = v2;
        this.zze = v5;
        this.zzg = v3;
        this.zzh = null;
        this.zzi = v4;
    }

    zzgn(Uri uri0, long v, int v1, byte[] arr_b, Map map0, long v2, long v3, String s, int v4, Object object0, zzgm zzgm0) {
        this(uri0, 0L, 1, null, map0, v2, -1L, null, v4, null);
    }

    @Deprecated
    public zzgn(Uri uri0, byte[] arr_b, long v, long v1, long v2, String s, int v3) {
        this(uri0, v - v1, 1, null, Collections.emptyMap(), v1, v2, null, v3, null);
    }

    // 去混淆评级： 低(40)
    @Override
    public final String toString() {
        return "DataSpec[GET " + this.zza + ", " + this.zzf + ", " + this.zzg + ", null, " + this.zzi + "]";
    }

    public final boolean zza(int v) {
        return (this.zzi & v) == v;
    }
}

