package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

public final class zzsv implements zzul {
    private final zzabi zza;
    private zzabb zzb;
    private zzabc zzc;

    public zzsv(zzabi zzabi0) {
        this.zza = zzabi0;
    }

    @Override  // com.google.android.gms.internal.ads.zzul
    public final int zza(zzabx zzabx0) {
        zzabb zzabb0 = this.zzb;
        zzabb0.getClass();
        zzabc zzabc0 = this.zzc;
        zzabc0.getClass();
        return zzabb0.zza(zzabc0, zzabx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzul
    public final long zzb() {
        return this.zzc == null ? -1L : this.zzc.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzul
    public final void zzc() {
        zzabb zzabb0 = this.zzb;
        if(zzabb0 == null) {
            return;
        }
        if(zzabb0 instanceof zzagc) {
            ((zzagc)zzabb0).zze();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzul
    public final void zzd(zzt zzt0, Uri uri0, Map map0, long v, long v1, zzabe zzabe0) {
        boolean z;
        zzaar zzaar0 = new zzaar(zzt0, v, v1);
        this.zzc = zzaar0;
        if(this.zzb != null) {
            return;
        }
        zzabb[] arr_zzabb = this.zza.zza(uri0, map0);
        int v2 = 0;
        if(arr_zzabb.length == 1) {
            this.zzb = arr_zzabb[0];
        }
        else {
            int v3 = 0;
            while(v3 < arr_zzabb.length) {
                zzabb zzabb0 = arr_zzabb[v3];
                try {
                    if(zzabb0.zzd(zzaar0)) {
                        this.zzb = zzabb0;
                        goto label_26;
                    }
                    goto label_29;
                }
                catch(EOFException unused_ex) {
                    z = this.zzb == null && zzaar0.zzf() != v ? false : true;
                    goto label_30;
                }
                catch(Throwable throwable0) {
                    if(this.zzb != null || zzaar0.zzf() == v) {
                        v2 = 1;
                    }
                    zzdy.zzf(((boolean)v2));
                    zzaar0.zzj();
                    throw throwable0;
                }
            label_26:
                zzdy.zzf(true);
                zzaar0.zzj();
                break;
            label_29:
                z = this.zzb != null || zzaar0.zzf() == v;
            label_30:
                zzdy.zzf(z);
                zzaar0.zzj();
                ++v3;
            }
            if(this.zzb == null) {
                StringBuilder stringBuilder0 = new StringBuilder();
                while(v2 < arr_zzabb.length) {
                    stringBuilder0.append(arr_zzabb[v2].getClass().getSimpleName());
                    if(v2 < arr_zzabb.length - 1) {
                        stringBuilder0.append(", ");
                    }
                    ++v2;
                }
                throw new zzvt("None of the available extractors (" + stringBuilder0.toString() + ") could read the stream.", uri0);
            }
        }
        this.zzb.zzb(zzabe0);
    }

    @Override  // com.google.android.gms.internal.ads.zzul
    public final void zze() {
        if(this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzul
    public final void zzf(long v, long v1) {
        zzabb zzabb0 = this.zzb;
        zzabb0.getClass();
        zzabb0.zzc(v, v1);
    }
}

