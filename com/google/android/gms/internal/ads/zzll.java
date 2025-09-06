package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

final class zzll extends zzhu {
    public static final int zzc;
    private final int zzd;
    private final int zze;
    private final int[] zzf;
    private final int[] zzg;
    private final zzcw[] zzh;
    private final Object[] zzi;
    private final HashMap zzj;

    public zzll(Collection collection0, zzvm zzvm0) {
        zzcw[] arr_zzcw = new zzcw[collection0.size()];
        int v = 0;
        int v1 = 0;
        for(Object object0: collection0) {
            arr_zzcw[v1] = ((zzku)object0).zza();
            ++v1;
        }
        Object[] arr_object = new Object[collection0.size()];
        for(Object object1: collection0) {
            arr_object[v] = ((zzku)object1).zzb();
            ++v;
        }
        this(arr_zzcw, arr_object, zzvm0);
    }

    private zzll(zzcw[] arr_zzcw, Object[] arr_object, zzvm zzvm0) {
        int v = 0;
        super(false, zzvm0);
        this.zzh = arr_zzcw;
        this.zzf = new int[arr_zzcw.length];
        this.zzg = new int[arr_zzcw.length];
        this.zzi = arr_object;
        this.zzj = new HashMap();
        int v1 = 0;
        int v2 = 0;
        for(int v3 = 0; v < arr_zzcw.length; ++v3) {
            zzcw zzcw0 = arr_zzcw[v];
            this.zzh[v3] = zzcw0;
            this.zzg[v3] = v1;
            this.zzf[v3] = v2;
            v1 += zzcw0.zzc();
            v2 += this.zzh[v3].zzb();
            this.zzj.put(arr_object[v3], v3);
            ++v;
        }
        this.zzd = v1;
        this.zze = v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzcw
    public final int zzb() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzcw
    public final int zzc() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzhu
    protected final int zzp(Object object0) {
        Integer integer0 = (Integer)this.zzj.get(object0);
        return integer0 == null ? -1 : ((int)integer0);
    }

    @Override  // com.google.android.gms.internal.ads.zzhu
    protected final int zzq(int v) {
        return zzfk.zzb(this.zzf, v + 1, false, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzhu
    protected final int zzr(int v) {
        return zzfk.zzb(this.zzg, v + 1, false, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzhu
    protected final int zzs(int v) {
        return this.zzf[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzhu
    protected final int zzt(int v) {
        return this.zzg[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzhu
    protected final zzcw zzu(int v) {
        return this.zzh[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzhu
    protected final Object zzv(int v) {
        return this.zzi[v];
    }

    final List zzw() {
        return Arrays.asList(this.zzh);
    }

    public final zzll zzx(zzvm zzvm0) {
        zzcw[] arr_zzcw = new zzcw[this.zzh.length];
        for(int v = 0; true; ++v) {
            zzcw[] arr_zzcw1 = this.zzh;
            if(v >= arr_zzcw1.length) {
                break;
            }
            arr_zzcw[v] = new zzlk(this, arr_zzcw1[v]);
        }
        return new zzll(arr_zzcw, this.zzi, zzvm0);
    }
}

