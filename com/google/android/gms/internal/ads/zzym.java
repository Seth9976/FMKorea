package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class zzym {
    private static final Comparator zza;
    private static final Comparator zzb;
    private final ArrayList zzc;
    private final zzyl[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzym.zza = (Object object0, Object object1) -> ((zzyl)object0).zza - ((zzyl)object1).zza;
        zzym.zzb = zzyj.zza;
    }

    public zzym(int v) {
        this.zzd = new zzyl[5];
        this.zzc = new ArrayList();
        this.zze = -1;
    }

    public final float zza(float f) {
        if(this.zze != 0) {
            Collections.sort(this.zzc, zzym.zzb);
            this.zze = 0;
        }
        float f1 = (float)this.zzg;
        int v1 = 0;
        for(int v = 0; v < this.zzc.size(); ++v) {
            zzyl zzyl0 = (zzyl)this.zzc.get(v);
            v1 += zzyl0.zzb;
            if(((float)v1) >= 0.5f * f1) {
                return zzyl0.zzc;
            }
        }
        return this.zzc.isEmpty() ? NaNf : ((zzyl)this.zzc.get(this.zzc.size() - 1)).zzc;
    }

    public final void zzb(int v, float f) {
        zzyl zzyl0;
        if(this.zze != 1) {
            Collections.sort(this.zzc, zzym.zza);
            this.zze = 1;
        }
        int v1 = this.zzh;
        if(v1 > 0) {
            this.zzh = v1 - 1;
            zzyl0 = this.zzd[v1 - 1];
        }
        else {
            zzyl0 = new zzyl(null);
        }
        int v2 = this.zzf;
        this.zzf = v2 + 1;
        zzyl0.zza = v2;
        zzyl0.zzb = v;
        zzyl0.zzc = f;
        this.zzc.add(zzyl0);
        this.zzg += v;
        int v3;
        while((v3 = this.zzg) > 2000) {
            zzyl zzyl1 = (zzyl)this.zzc.get(0);
            int v4 = zzyl1.zzb;
            if(v4 <= v3 - 2000) {
                this.zzg -= v4;
                this.zzc.remove(0);
                int v5 = this.zzh;
                if(v5 >= 5) {
                    continue;
                }
                this.zzh = v5 + 1;
                this.zzd[v5] = zzyl1;
            }
            else {
                zzyl1.zzb = v4 - (v3 - 2000);
                this.zzg -= v3 - 2000;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}

