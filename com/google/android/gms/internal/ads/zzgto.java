package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

final class zzgto {
    private final ArrayDeque zza;

    private zzgto() {
        this.zza = new ArrayDeque();
    }

    zzgto(zzgtn zzgtn0) {
        this.zza = new ArrayDeque();
    }

    static zzgqi zza(zzgto zzgto0, zzgqi zzgqi0, zzgqi zzgqi1) {
        zzgto0.zzb(zzgqi0);
        zzgto0.zzb(zzgqi1);
        zzgqi zzgqi2;
        for(zzgqi2 = (zzgqi)zzgto0.zza.pop(); !zzgto0.zza.isEmpty(); zzgqi2 = new zzgts(((zzgqi)zzgto0.zza.pop()), zzgqi2, null)) {
        }
        return zzgqi2;
    }

    private final void zzb(zzgqi zzgqi0) {
        if(zzgqi0.zzh()) {
            int v = zzgto.zzc(zzgqi0.zzd());
            int v1 = zzgts.zzc(v + 1);
            if(!this.zza.isEmpty() && ((zzgqi)this.zza.peek()).zzd() < v1) {
                int v2 = zzgts.zzc(v);
                zzgqi zzgqi1;
                for(zzgqi1 = (zzgqi)this.zza.pop(); !this.zza.isEmpty() && ((zzgqi)this.zza.peek()).zzd() < v2; zzgqi1 = new zzgts(((zzgqi)this.zza.pop()), zzgqi1, null)) {
                }
                zzgts zzgts0;
                for(zzgts0 = new zzgts(zzgqi1, zzgqi0, null); !this.zza.isEmpty(); zzgts0 = new zzgts(((zzgqi)this.zza.pop()), zzgts0, null)) {
                    int v3 = zzgts.zzc(zzgto.zzc(zzgts0.zzd()) + 1);
                    if(((zzgqi)this.zza.peek()).zzd() >= v3) {
                        break;
                    }
                }
                this.zza.push(zzgts0);
                return;
            }
            this.zza.push(zzgqi0);
            return;
        }
        if(!(zzgqi0 instanceof zzgts)) {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + zzgqi0.getClass());
        }
        this.zzb(zzgts.zzg(((zzgts)zzgqi0)));
        this.zzb(zzgts.zzB(((zzgts)zzgqi0)));
    }

    private static final int zzc(int v) {
        int v1 = Arrays.binarySearch(zzgts.zza, v);
        return v1 >= 0 ? v1 : -(v1 + 1) - 1;
    }
}

