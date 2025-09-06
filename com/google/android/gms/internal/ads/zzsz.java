package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzsz implements zzqu, zzuc {
    final zztb zza;
    private final Object zzb;
    private zzub zzc;
    private zzqt zzd;

    public zzsz(zztb zztb0, Object object0) {
        this.zza = zztb0;
        super();
        this.zzc = zztb0.zze(null);
        this.zzd = zztb0.zzc(null);
        this.zzb = object0;
    }

    @Override  // com.google.android.gms.internal.ads.zzuc
    public final void zzac(int v, zzts zzts0, zzto zzto0) {
        if(this.zzg(0, zzts0)) {
            this.zzc.zzc(this.zzf(zzto0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzuc
    public final void zzad(int v, zzts zzts0, zztj zztj0, zzto zzto0) {
        if(this.zzg(0, zzts0)) {
            this.zzc.zzd(zztj0, this.zzf(zzto0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzuc
    public final void zzae(int v, zzts zzts0, zztj zztj0, zzto zzto0) {
        if(this.zzg(0, zzts0)) {
            this.zzc.zze(zztj0, this.zzf(zzto0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzuc
    public final void zzaf(int v, zzts zzts0, zztj zztj0, zzto zzto0, IOException iOException0, boolean z) {
        if(this.zzg(0, zzts0)) {
            this.zzc.zzf(zztj0, this.zzf(zzto0), iOException0, z);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzuc
    public final void zzag(int v, zzts zzts0, zztj zztj0, zzto zzto0) {
        if(this.zzg(0, zzts0)) {
            this.zzc.zzg(zztj0, this.zzf(zzto0));
        }
    }

    private final zzto zzf(zzto zzto0) {
        this.zza.zzx(this.zzb, zzto0.zzc);
        this.zza.zzx(this.zzb, zzto0.zzd);
        return zzto0;
    }

    private final boolean zzg(int v, zzts zzts0) {
        zzts zzts1;
        if(zzts0 == null) {
            zzts1 = null;
        }
        else {
            zzts1 = this.zza.zzy(this.zzb, zzts0);
            if(zzts1 == null) {
                return false;
            }
        }
        this.zza.zzw(this.zzb, 0);
        if(!zzfk.zzD(this.zzc.zzb, zzts1)) {
            this.zzc = this.zza.zzf(0, zzts1);
        }
        if(!zzfk.zzD(this.zzd.zzb, zzts1)) {
            this.zzd = this.zza.zzd(0, zzts1);
        }
        return true;
    }
}

