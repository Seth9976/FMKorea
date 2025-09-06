package com.google.android.gms.internal.ads;

import Z1.d;

public final class zzbnr {
    private final zzbmu zza;
    private d zzb;

    zzbnr(zzbmu zzbmu0) {
        this.zza = zzbmu0;
    }

    public final zzbnu zza(String s, zzbnb zzbnb0, zzbna zzbna0) {
        this.zzd();
        return new zzbnu(this.zzb, "google.afma.activeView.handleUpdate", zzbnb0, zzbna0);
    }

    public final void zzb(String s, zzbir zzbir0) {
        this.zzd();
        this.zzb = zzfye.zzn(this.zzb, new zzbnn(s, zzbir0), zzcan.zzf);
    }

    public final void zzc(String s, zzbir zzbir0) {
        this.zzb = zzfye.zzm(this.zzb, new zzbno(s, zzbir0), zzcan.zzf);
    }

    private final void zzd() {
        if(this.zzb == null) {
            zzcas zzcas0 = new zzcas();
            this.zzb = zzcas0;
            this.zza.zzb(null).zzi(new zzbnp(zzcas0), new zzbnq(zzcas0));
        }
    }
}

