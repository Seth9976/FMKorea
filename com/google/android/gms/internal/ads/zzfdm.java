package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedList;

final class zzfdm {
    private final LinkedList zza;
    private final int zzb;
    private final int zzc;
    private final zzfel zzd;

    public zzfdm(int v, int v1) {
        this.zza = new LinkedList();
        this.zzb = v;
        this.zzc = v1;
        this.zzd = new zzfel();
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        this.zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzfdw zze() {
        this.zzd.zzf();
        this.zzi();
        if(this.zza.isEmpty()) {
            return null;
        }
        zzfdw zzfdw0 = (zzfdw)this.zza.remove();
        if(zzfdw0 != null) {
            this.zzd.zzh();
        }
        return zzfdw0;
    }

    public final zzfek zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfdw zzfdw0) {
        this.zzd.zzf();
        this.zzi();
        if(this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfdw0);
        return true;
    }

    private final void zzi() {
        while(!this.zza.isEmpty()) {
            zzfdw zzfdw0 = (zzfdw)this.zza.getFirst();
            if(zzt.zzB().currentTimeMillis() - zzfdw0.zzd < ((long)this.zzc)) {
                break;
            }
            this.zzd.zzg();
            this.zza.remove();
        }
    }
}

