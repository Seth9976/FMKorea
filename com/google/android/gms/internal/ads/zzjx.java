package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.TextureView.SurfaceTextureListener;

final class zzjx implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzhw, zzia, zzim, zzoy, zzss, zzvv, zzzw {
    final zzkb zza;
    public static final int zzb;

    zzjx(zzkb zzkb0, zzjw zzjw0) {
        this.zza = zzkb0;
        super();
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
        zzkb.zzP(this.zza, surfaceTexture0);
        zzkb.zzN(this.zza, v, v1);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
        zzkb.zzQ(this.zza, null);
        zzkb.zzN(this.zza, 0, 0);
        return true;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
        zzkb.zzN(this.zza, v, v1);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
        zzkb.zzN(this.zza, v1, v2);
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder0) {
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
        zzkb.zzN(this.zza, 0, 0);
    }

    @Override  // com.google.android.gms.internal.ads.zzim
    public final void zza(boolean z) {
        zzkb.zzS(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzoy
    public final void zzb(Exception exception0) {
        zzkb.zzF(this.zza).zzv(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zzoy
    public final void zzc(String s, long v, long v1) {
        zzkb.zzF(this.zza).zzw(s, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzoy
    public final void zzd(String s) {
        zzkb.zzF(this.zza).zzx(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzoy
    public final void zze(zzid zzid0) {
        zzkb.zzF(this.zza).zzy(zzid0);
        zzkb.zzI(this.zza, null);
        zzkb.zzH(this.zza, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzoy
    public final void zzf(zzid zzid0) {
        zzkb.zzH(this.zza, zzid0);
        zzkb.zzF(this.zza).zzz(zzid0);
    }

    @Override  // com.google.android.gms.internal.ads.zzoy
    public final void zzg(zzam zzam0, zzie zzie0) {
        zzkb.zzI(this.zza, zzam0);
        zzkb.zzF(this.zza).zzA(zzam0, zzie0);
    }

    @Override  // com.google.android.gms.internal.ads.zzoy
    public final void zzh(long v) {
        zzkb.zzF(this.zza).zzB(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzoy
    public final void zzi(Exception exception0) {
        zzkb.zzF(this.zza).zzC(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zzoy
    public final void zzj(int v, long v1, long v2) {
        zzkb.zzF(this.zza).zzD(v, v1, v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzzw
    public final void zzk(int v, long v1) {
        zzkb.zzF(this.zza).zzE(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzzw
    public final void zzl(Object object0, long v) {
        zzkb.zzF(this.zza).zzF(object0, v);
        zzkb zzkb0 = this.zza;
        if(zzkb.zzG(zzkb0) == object0) {
            zzep zzep0 = zzkb.zzD(zzkb0);
            zzep0.zzd(26, (Object object0) -> zzcm zzcm0 = (zzcm)object0);
            zzep0.zzc();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzoy
    public final void zzm(boolean z) {
        zzkb zzkb0 = this.zza;
        if(zzkb.zzW(zzkb0) == z) {
            return;
        }
        zzkb.zzJ(zzkb0, z);
        zzep zzep0 = zzkb.zzD(this.zza);
        zzep0.zzd(23, new zzju(z));
        zzep0.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzzw
    public final void zzn(Exception exception0) {
        zzkb.zzF(this.zza).zzG(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zzzw
    public final void zzo(String s, long v, long v1) {
        zzkb.zzF(this.zza).zzH(s, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzzw
    public final void zzp(String s) {
        zzkb.zzF(this.zza).zzI(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzzw
    public final void zzq(zzid zzid0) {
        zzkb.zzF(this.zza).zzJ(zzid0);
        zzkb.zzL(this.zza, null);
        zzkb.zzK(this.zza, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzzw
    public final void zzr(zzid zzid0) {
        zzkb.zzK(this.zza, zzid0);
        zzkb.zzF(this.zza).zzK(zzid0);
    }

    @Override  // com.google.android.gms.internal.ads.zzzw
    public final void zzs(long v, int v1) {
        zzkb.zzF(this.zza).zzL(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzzw
    public final void zzt(zzam zzam0, zzie zzie0) {
        zzkb.zzL(this.zza, zzam0);
        zzkb.zzF(this.zza).zzM(zzam0, zzie0);
    }

    @Override  // com.google.android.gms.internal.ads.zzzw
    public final void zzu(zzdn zzdn0) {
        zzkb.zzM(this.zza, zzdn0);
        zzep zzep0 = zzkb.zzD(this.zza);
        zzep0.zzd(25, new zzjv(zzdn0));
        zzep0.zzc();
    }
}

