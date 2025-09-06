package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class zzst implements zztu {
    private final ArrayList zza;
    private final HashSet zzb;
    private final zzub zzc;
    private final zzqt zzd;
    private Looper zze;
    private zzcw zzf;
    private zzoh zzg;

    public zzst() {
        this.zza = new ArrayList(1);
        this.zzb = new HashSet(1);
        this.zzc = new zzub();
        this.zzd = new zzqt();
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public zzcw zzM() {
        return null;
    }

    protected final zzoh zzb() {
        zzoh zzoh0 = this.zzg;
        zzdy.zzb(zzoh0);
        return zzoh0;
    }

    protected final zzqt zzc(zzts zzts0) {
        return this.zzd.zza(0, zzts0);
    }

    protected final zzqt zzd(int v, zzts zzts0) {
        return this.zzd.zza(0, zzts0);
    }

    protected final zzub zze(zzts zzts0) {
        return this.zzc.zza(0, zzts0);
    }

    protected final zzub zzf(int v, zzts zzts0) {
        return this.zzc.zza(0, zzts0);
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final void zzg(Handler handler0, zzqu zzqu0) {
        this.zzd.zzb(handler0, zzqu0);
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final void zzh(Handler handler0, zzuc zzuc0) {
        this.zzc.zzb(handler0, zzuc0);
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final void zzi(zztt zztt0) {
        this.zzb.remove(zztt0);
        if(!this.zzb.isEmpty() && this.zzb.isEmpty()) {
            this.zzj();
        }
    }

    protected void zzj() {
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final void zzk(zztt zztt0) {
        this.zze.getClass();
        this.zzb.add(zztt0);
        if(this.zzb.isEmpty()) {
            this.zzl();
        }
    }

    protected void zzl() {
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final void zzm(zztt zztt0, zzhk zzhk0, zzoh zzoh0) {
        Looper looper0 = Looper.myLooper();
        zzdy.zzd(this.zze == null || this.zze == looper0);
        this.zzg = zzoh0;
        zzcw zzcw0 = this.zzf;
        this.zza.add(zztt0);
        if(this.zze == null) {
            this.zze = looper0;
            this.zzb.add(zztt0);
            this.zzn(zzhk0);
            return;
        }
        if(zzcw0 != null) {
            this.zzk(zztt0);
            zztt0.zza(this, zzcw0);
        }
    }

    protected abstract void zzn(zzhk arg1);

    protected final void zzo(zzcw zzcw0) {
        this.zzf = zzcw0;
        ArrayList arrayList0 = this.zza;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((zztt)arrayList0.get(v1)).zza(this, zzcw0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final void zzp(zztt zztt0) {
        this.zza.remove(zztt0);
        if(this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            this.zzq();
            return;
        }
        this.zzi(zztt0);
    }

    protected abstract void zzq();

    @Override  // com.google.android.gms.internal.ads.zztu
    public final void zzr(zzqu zzqu0) {
        this.zzd.zzc(zzqu0);
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final void zzs(zzuc zzuc0) {
        this.zzc.zzh(zzuc0);
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public void zzt(zzbp zzbp0) {
        throw null;
    }

    protected final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public boolean zzv() {
        return true;
    }
}

