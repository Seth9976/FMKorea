package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

public final class zzah {
    private final SparseBooleanArray zza;

    zzah(SparseBooleanArray sparseBooleanArray0, zzag zzag0) {
        this.zza = sparseBooleanArray0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzah)) {
            return false;
        }
        if(zzfk.zza < 24) {
            if(this.zza.size() == ((zzah)object0).zza.size()) {
                for(int v = 0; v < this.zza.size(); ++v) {
                    if(this.zza(v) != ((zzah)object0).zza(v)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return this.zza.equals(((zzah)object0).zza);
    }

    @Override
    public final int hashCode() {
        if(zzfk.zza < 24) {
            int v = this.zza.size();
            for(int v1 = 0; v1 < this.zza.size(); ++v1) {
                v = v * 0x1F + this.zza(v1);
            }
            return v;
        }
        return this.zza.hashCode();
    }

    public final int zza(int v) {
        zzdy.zza(v, 0, this.zza.size());
        return this.zza.keyAt(v);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int v) {
        return this.zza.get(v);
    }
}

