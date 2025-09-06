package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

public abstract class zzcbp extends TextureView implements zzccm {
    protected final zzccd zza;
    protected final zzccn zzb;

    public zzcbp(Context context0) {
        super(context0);
        this.zza = new zzccd();
        this.zzb = new zzccn(context0, this);
    }

    public void zzA(int v) {
    }

    public void zzB(int v) {
    }

    public void zzC(String s, String[] arr_s, Integer integer0) {
        this.zzs(s);
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract int zzc();

    public abstract int zzd();

    public abstract int zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract long zzh();

    public abstract String zzj();

    @Override  // com.google.android.gms.internal.ads.zzccm
    public abstract void zzn();

    public abstract void zzo();

    public abstract void zzp();

    public abstract void zzq(int arg1);

    public abstract void zzr(zzcbo arg1);

    public abstract void zzs(String arg1);

    public abstract void zzt();

    public abstract void zzu(float arg1, float arg2);

    public Integer zzw() {
        return null;
    }

    public void zzx(int v) {
    }

    public void zzy(int v) {
    }

    public void zzz(int v) {
    }
}

