package com.google.android.gms.internal.ads;

public final class zzkj {
    public zzlg zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public int zzf;
    private boolean zzg;

    public zzkj(zzlg zzlg0) {
        this.zza = zzlg0;
    }

    public final void zza(int v) {
        this.zzg = 1 == (this.zzg | v);
        this.zzb += v;
    }

    public final void zzb(int v) {
        this.zzg = true;
        this.zze = true;
        this.zzf = v;
    }

    public final void zzc(zzlg zzlg0) {
        this.zzg |= this.zza != zzlg0;
        this.zza = zzlg0;
    }

    public final void zzd(int v) {
        boolean z = true;
        if(this.zzc && this.zzd != 5) {
            if(v != 5) {
                z = false;
            }
            zzdy.zzd(z);
            return;
        }
        this.zzg = true;
        this.zzc = true;
        this.zzd = v;
    }
}

