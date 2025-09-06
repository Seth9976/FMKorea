package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class zznx {
    private final zzct zza;
    private zzfud zzb;
    private zzfug zzc;
    private zzts zzd;
    private zzts zze;
    private zzts zzf;

    public zznx(zzct zzct0) {
        this.zza = zzct0;
        this.zzb = zzfud.zzl();
        this.zzc = zzfug.zzd();
    }

    public final zzcw zza(zzts zzts0) {
        return (zzcw)this.zzc.get(zzts0);
    }

    public final zzts zzb() {
        return this.zzd;
    }

    public final zzts zzc() {
        Object object0;
        if(this.zzb.isEmpty()) {
            return null;
        }
        zzfud zzfud0 = this.zzb;
        if(zzfud0 instanceof List) {
            if(zzfud0.isEmpty()) {
                throw new NoSuchElementException();
            }
            return (zzts)zzfud0.get(zzfud0.size() - 1);
        }
        Iterator iterator0 = zzfud0.iterator();
        do {
            object0 = iterator0.next();
        }
        while(iterator0.hasNext());
        return (zzts)object0;
    }

    public final zzts zzd() {
        return this.zze;
    }

    public final zzts zze() {
        return this.zzf;
    }

    public final void zzg(zzcp zzcp0) {
        this.zzd = zznx.zzj(zzcp0, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list0, zzts zzts0, zzcp zzcp0) {
        this.zzb = zzfud.zzj(list0);
        if(!list0.isEmpty()) {
            this.zze = (zzts)list0.get(0);
            zzts0.getClass();
            this.zzf = zzts0;
        }
        if(this.zzd == null) {
            this.zzd = zznx.zzj(zzcp0, this.zzb, this.zze, this.zza);
        }
        this.zzl(zzcp0.zzn());
    }

    public final void zzi(zzcp zzcp0) {
        this.zzd = zznx.zzj(zzcp0, this.zzb, this.zze, this.zza);
        this.zzl(zzcp0.zzn());
    }

    private static zzts zzj(zzcp zzcp0, zzfud zzfud0, zzts zzts0, zzct zzct0) {
        zzcw zzcw0 = zzcp0.zzn();
        int v = zzcp0.zze();
        Object object0 = zzcw0.zzo() ? null : zzcw0.zzf(v);
        int v1 = !zzcp0.zzx() && !zzcw0.zzo() ? zzcw0.zzd(v, zzct0, false).zzc(zzfk.zzp(zzcp0.zzk())) : -1;
        for(int v2 = 0; v2 < zzfud0.size(); ++v2) {
            zzts zzts1 = (zzts)zzfud0.get(v2);
            if(zznx.zzm(zzts1, object0, zzcp0.zzx(), zzcp0.zzb(), zzcp0.zzc(), v1)) {
                return zzts1;
            }
        }
        return !zzfud0.isEmpty() || zzts0 == null || !zznx.zzm(zzts0, object0, zzcp0.zzx(), zzcp0.zzb(), zzcp0.zzc(), v1) ? null : zzts0;
    }

    private final void zzk(zzfuf zzfuf0, zzts zzts0, zzcw zzcw0) {
        if(zzts0 == null) {
            return;
        }
        if(zzcw0.zza(zzts0.zza) != -1) {
            zzfuf0.zza(zzts0, zzcw0);
            return;
        }
        zzcw zzcw1 = (zzcw)this.zzc.get(zzts0);
        if(zzcw1 != null) {
            zzfuf0.zza(zzts0, zzcw1);
        }
    }

    private final void zzl(zzcw zzcw0) {
        zzfuf zzfuf0 = new zzfuf();
        if(this.zzb.isEmpty()) {
            this.zzk(zzfuf0, this.zze, zzcw0);
            if(!zzfrd.zza(this.zzf, this.zze)) {
                this.zzk(zzfuf0, this.zzf, zzcw0);
            }
            if(!zzfrd.zza(this.zzd, this.zze) && !zzfrd.zza(this.zzd, this.zzf)) {
                this.zzk(zzfuf0, this.zzd, zzcw0);
            }
        }
        else {
            for(int v = 0; v < this.zzb.size(); ++v) {
                this.zzk(zzfuf0, ((zzts)this.zzb.get(v)), zzcw0);
            }
            if(!this.zzb.contains(this.zzd)) {
                this.zzk(zzfuf0, this.zzd, zzcw0);
            }
        }
        this.zzc = zzfuf0.zzc();
    }

    private static boolean zzm(zzts zzts0, Object object0, boolean z, int v, int v1, int v2) {
        if(!zzts0.zza.equals(object0)) {
            return false;
        }
        return z ? zzts0.zzb == v && zzts0.zzc == v1 : zzts0.zzb == -1 && zzts0.zze == v2;
    }
}

