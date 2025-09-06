package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

public final class zzbef extends zzben {
    static final int zza;
    static final int zzb;
    private static final int zzc;
    private final String zzd;
    private final List zze;
    private final List zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    static {
        int v = Color.rgb(12, 0xAE, 206);
        zzbef.zzc = v;
        zzbef.zza = Color.rgb(204, 204, 204);
        zzbef.zzb = v;
    }

    public zzbef(String s, List list0, Integer integer0, Integer integer1, Integer integer2, int v, int v1, boolean z) {
        this.zze = new ArrayList();
        this.zzf = new ArrayList();
        this.zzd = s;
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            zzbei zzbei0 = (zzbei)list0.get(v2);
            this.zze.add(zzbei0);
            this.zzf.add(zzbei0);
        }
        this.zzg = integer0 == null ? zzbef.zza : ((int)integer0);
        this.zzh = integer1 == null ? zzbef.zzb : ((int)integer1);
        this.zzi = integer2 == null ? 12 : ((int)integer2);
        this.zzj = v;
        this.zzk = v1;
    }

    public final int zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final int zze() {
        return this.zzh;
    }

    public final int zzf() {
        return this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzbeo
    public final String zzg() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzbeo
    public final List zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }
}

