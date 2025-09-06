package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class zzagh extends zzagj {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzagh(int v, long v1) {
        super(v);
        this.zza = v1;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override  // com.google.android.gms.internal.ads.zzagj
    public final String toString() {
        String s = Arrays.toString(this.zzb.toArray());
        String s1 = Arrays.toString(this.zzc.toArray());
        return zzagj.zzf(this.zzd) + " leaves: " + s + " containers: " + s1;
    }

    public final zzagh zza(int v) {
        int v1 = this.zzc.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            zzagh zzagh0 = (zzagh)this.zzc.get(v2);
            if(zzagh0.zzd == v) {
                return zzagh0;
            }
        }
        return null;
    }

    public final zzagi zzb(int v) {
        int v1 = this.zzb.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            zzagi zzagi0 = (zzagi)this.zzb.get(v2);
            if(zzagi0.zzd == v) {
                return zzagi0;
            }
        }
        return null;
    }

    public final void zzc(zzagh zzagh0) {
        this.zzc.add(zzagh0);
    }

    public final void zzd(zzagi zzagi0) {
        this.zzb.add(zzagi0);
    }
}

