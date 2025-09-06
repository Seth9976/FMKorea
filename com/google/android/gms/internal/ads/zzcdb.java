package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class zzcdb extends zzcbp implements TextureView.SurfaceTextureListener, zzcbz {
    private final zzccj zzc;
    private final zzcck zzd;
    private final zzcci zze;
    private zzcbo zzf;
    private Surface zzg;
    private zzcca zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzcch zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcdb(Context context0, zzcck zzcck0, zzccj zzccj0, boolean z, boolean z1, zzcci zzcci0) {
        super(context0);
        this.zzl = 1;
        this.zzc = zzccj0;
        this.zzd = zzcck0;
        this.zzn = z;
        this.zze = zzcci0;
        this.setSurfaceTextureListener(this);
        zzcck0.zza(this);
    }

    @Override  // android.view.View
    protected final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = this.getMeasuredWidth();
        int v3 = this.getMeasuredHeight();
        float f = this.zzs;
        if(f != 0.0f && this.zzm == null) {
            float f1 = ((float)v2) / ((float)v3);
            if(f > f1) {
                v3 = (int)(((float)v2) / f);
            }
            if(f < f1) {
                v2 = (int)(((float)v3) * f);
            }
        }
        this.setMeasuredDimension(v2, v3);
        zzcch zzcch0 = this.zzm;
        if(zzcch0 != null) {
            zzcch0.zzc(v2, v3);
        }
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
        if(this.zzn) {
            zzcch zzcch0 = new zzcch(this.getContext());
            this.zzm = zzcch0;
            zzcch0.zzd(surfaceTexture0, v, v1);
            this.zzm.start();
            SurfaceTexture surfaceTexture1 = this.zzm.zzb();
            if(surfaceTexture1 == null) {
                this.zzm.zze();
                this.zzm = null;
            }
            else {
                surfaceTexture0 = surfaceTexture1;
            }
        }
        Surface surface0 = new Surface(surfaceTexture0);
        this.zzg = surface0;
        if(this.zzh == null) {
            this.zzW(false, null);
        }
        else {
            this.zzZ(surface0, true);
            if(!this.zze.zza) {
                this.zzU();
            }
        }
        if(this.zzq == 0 || this.zzr == 0) {
            this.zzab(v, v1);
        }
        else {
            this.zzaa();
        }
        zzccv zzccv0 = () -> {
            zzcbo zzcbo0 = this.zzf;
            if(zzcbo0 != null) {
                zzcbo0.zzh();
            }
        };
        zzs.zza.post(zzccv0);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
        this.zzo();
        zzcch zzcch0 = this.zzm;
        if(zzcch0 != null) {
            zzcch0.zze();
            this.zzm = null;
        }
        if(this.zzh != null) {
            this.zzX();
            Surface surface0 = this.zzg;
            if(surface0 != null) {
                surface0.release();
            }
            this.zzg = null;
            this.zzZ(null, true);
        }
        zzccz zzccz0 = () -> {
            zzcbo zzcbo0 = this.zzf;
            if(zzcbo0 != null) {
                zzcbo0.zzi();
            }
        };
        zzs.zza.post(zzccz0);
        return true;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
        zzcch zzcch0 = this.zzm;
        if(zzcch0 != null) {
            zzcch0.zzc(v, v1);
        }
        zzccp zzccp0 = () -> {
            zzcbo zzcbo0 = this.zzf;
            if(zzcbo0 != null) {
                zzcbo0.zzj(v, v1);
            }
        };
        zzs.zza.post(zzccp0);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture0, this.zzf);
    }

    @Override  // android.view.View
    protected final void onWindowVisibilityChanged(int v) {
        zze.zza(("AdExoPlayerView3 window visibility changed to " + v));
        zzccy zzccy0 = () -> {
            zzcbo zzcbo0 = this.zzf;
            if(zzcbo0 != null) {
                zzcbo0.onWindowVisibilityChanged(v);
            }
        };
        zzs.zza.post(zzccy0);
        super.onWindowVisibilityChanged(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final void zzA(int v) {
        zzcca zzcca0 = this.zzh;
        if(zzcca0 != null) {
            zzcca0.zzN(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final void zzB(int v) {
        zzcca zzcca0 = this.zzh;
        if(zzcca0 != null) {
            zzcca0.zzR(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final void zzC(String s, String[] arr_s, Integer integer0) {
        if(s == null) {
            return;
        }
        this.zzj = arr_s == null ? new String[]{s} : ((String[])Arrays.copyOf(arr_s, arr_s.length));
        boolean z = this.zze.zzl && this.zzi != null && !s.equals(this.zzi) && this.zzl == 4;
        this.zzi = s;
        this.zzW(z, integer0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbz
    public final void zzD(int v, int v1) {
        this.zzq = v;
        this.zzr = v1;
        this.zzaa();
    }

    final zzcca zzE(Integer integer0) {
        zzcca zzcca0 = new zzcev(this.zzc.getContext(), this.zze, this.zzc, integer0);
        zzcaa.zzi("ExoPlayerAdapter initialized.");
        return zzcca0;
    }

    final String zzF() {
        return zzt.zzp().zzc(this.zzc.getContext(), this.zzc.zzn().zza);
    }

    // 检测为 Lambda 实现
    final void zzG(String s) [...]

    // 检测为 Lambda 实现
    final void zzH() [...]

    // 检测为 Lambda 实现
    final void zzI() [...]

    // 检测为 Lambda 实现
    final void zzJ(boolean z, long v) [...]

    // 检测为 Lambda 实现
    final void zzK(String s) [...]

    // 检测为 Lambda 实现
    final void zzL() [...]

    // 检测为 Lambda 实现
    final void zzM() [...]

    // 检测为 Lambda 实现
    final void zzN() [...]

    // 检测为 Lambda 实现
    final void zzO(int v, int v1) [...]

    // 检测为 Lambda 实现
    final void zzP() [...]

    // 检测为 Lambda 实现
    final void zzQ(int v) [...]

    // 检测为 Lambda 实现
    final void zzR() [...]

    // 检测为 Lambda 实现
    final void zzS() [...]

    private static String zzT(String s, Exception exception0) {
        return s + "/" + exception0.getClass().getCanonicalName() + ":" + exception0.getMessage();
    }

    private final void zzU() {
        zzcca zzcca0 = this.zzh;
        if(zzcca0 != null) {
            zzcca0.zzQ(true);
        }
    }

    private final void zzV() {
        if(this.zzo) {
            return;
        }
        this.zzo = true;
        zzccw zzccw0 = () -> {
            zzcbo zzcbo0 = this.zzf;
            if(zzcbo0 != null) {
                zzcbo0.zzf();
            }
        };
        zzs.zza.post(zzccw0);
        this.zzn();
        this.zzd.zzb();
        if(this.zzp) {
            this.zzp();
        }
    }

    private final void zzW(boolean z, Integer integer0) {
        zzcca zzcca0 = this.zzh;
        if(zzcca0 != null && !z) {
            zzcca0.zzP(integer0);
            return;
        }
        if(this.zzi != null && this.zzg != null) {
            if(z) {
                if(this.zzad()) {
                    zzcca0.zzU();
                    this.zzY();
                    goto label_12;
                }
                zzcaa.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            }
        label_12:
            if(this.zzi.startsWith("cache:")) {
                zzcdu zzcdu0 = this.zzc.zzp(this.zzi);
                if(zzcdu0 instanceof zzced) {
                    zzcca zzcca1 = ((zzced)zzcdu0).zza();
                    this.zzh = zzcca1;
                    zzcca1.zzP(integer0);
                    if(!this.zzh.zzV()) {
                        zzcaa.zzj("Precached video player has been released.");
                        return;
                    }
                }
                else {
                    if(zzcdu0 instanceof zzcea) {
                        String s = this.zzF();
                        ByteBuffer byteBuffer0 = ((zzcea)zzcdu0).zzk();
                        boolean z1 = ((zzcea)zzcdu0).zzl();
                        String s1 = ((zzcea)zzcdu0).zzi();
                        if(s1 == null) {
                            zzcaa.zzj("Stream cache URL is null.");
                            return;
                        }
                        zzcca zzcca2 = this.zzE(integer0);
                        this.zzh = zzcca2;
                        zzcca2.zzG(new Uri[]{Uri.parse(s1)}, s, byteBuffer0, z1);
                        goto label_45;
                    }
                    zzcaa.zzj(("Stream cache miss: " + this.zzi));
                    return;
                }
            }
            else {
                this.zzh = this.zzE(integer0);
                String s2 = this.zzF();
                Uri[] arr_uri = new Uri[this.zzj.length];
                for(int v = 0; true; ++v) {
                    String[] arr_s = this.zzj;
                    if(v >= arr_s.length) {
                        break;
                    }
                    arr_uri[v] = Uri.parse(arr_s[v]);
                }
                this.zzh.zzF(arr_uri, s2);
            }
        label_45:
            this.zzh.zzL(this);
            this.zzZ(this.zzg, false);
            if(this.zzh.zzV()) {
                int v1 = this.zzh.zzt();
                this.zzl = v1;
                if(v1 == 3) {
                    this.zzV();
                }
            }
        }
    }

    private final void zzX() {
        zzcca zzcca0 = this.zzh;
        if(zzcca0 != null) {
            zzcca0.zzQ(false);
        }
    }

    private final void zzY() {
        if(this.zzh != null) {
            this.zzZ(null, true);
            zzcca zzcca0 = this.zzh;
            if(zzcca0 != null) {
                zzcca0.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface0, boolean z) {
        zzcca zzcca0 = this.zzh;
        if(zzcca0 != null) {
            try {
                zzcca0.zzS(surface0, z);
            }
            catch(IOException iOException0) {
                zzcaa.zzk("", iOException0);
            }
            return;
        }
        zzcaa.zzj("Trying to set surface before player is initialized.");
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final int zza() {
        return this.zzac() ? ((int)this.zzh.zzy()) : 0;
    }

    private final void zzaa() {
        this.zzab(this.zzq, this.zzr);
    }

    private final void zzab(int v, int v1) {
        float f = v1 <= 0 ? 1.0f : ((float)v) / ((float)v1);
        if(this.zzs != f) {
            this.zzs = f;
            this.requestLayout();
        }
    }

    private final boolean zzac() {
        return this.zzad() && this.zzl != 1;
    }

    // 去混淆评级： 低(20)
    private final boolean zzad() {
        return this.zzh != null && this.zzh.zzV() && !this.zzk;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final int zzb() {
        return this.zzh == null ? -1 : this.zzh.zzr();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final int zzc() {
        return this.zzac() ? ((int)this.zzh.zzz()) : 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final int zzd() {
        return this.zzr;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final int zze() {
        return this.zzq;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final long zzf() {
        return this.zzh == null ? -1L : this.zzh.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final long zzg() {
        return this.zzh == null ? -1L : this.zzh.zzA();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final long zzh() {
        return this.zzh == null ? -1L : this.zzh.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbz
    public final void zzi(boolean z, long v) {
        if(this.zzc != null) {
            zzccx zzccx0 = () -> this.zzc.zzv(z, v);
            zzcan.zze.execute(zzccx0);
        }
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final String zzj() {
        return this.zzn ? "ExoPlayer/2 spherical" : "ExoPlayer/2";
    }

    @Override  // com.google.android.gms.internal.ads.zzcbz
    public final void zzk(String s, Exception exception0) {
        String s1 = zzcdb.zzT(s, exception0);
        zzcaa.zzj(("ExoPlayerAdapter error: " + s1));
        this.zzk = true;
        if(this.zze.zza) {
            this.zzX();
        }
        zzcco zzcco0 = () -> {
            zzcbo zzcbo0 = this.zzf;
            if(zzcbo0 != null) {
                zzcbo0.zzb("ExoPlayerAdapter error", s1);
            }
        };
        zzs.zza.post(zzcco0);
        zzt.zzo().zzt(exception0, "AdExoPlayerView.onError");
    }

    @Override  // com.google.android.gms.internal.ads.zzcbz
    public final void zzl(String s, Exception exception0) {
        String s1 = zzcdb.zzT("onLoadException", exception0);
        zzcaa.zzj(("ExoPlayerAdapter exception: " + s1));
        zzt.zzo().zzt(exception0, "AdExoPlayerView.onException");
        zzccr zzccr0 = () -> {
            zzcbo zzcbo0 = this.zzf;
            if(zzcbo0 != null) {
                zzcbo0.zzc("ExoPlayerAdapter exception", s1);
            }
        };
        zzs.zza.post(zzccr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbz
    public final void zzm(int v) {
        if(this.zzl != v) {
            this.zzl = v;
            switch(v) {
                case 3: {
                    this.zzV();
                    break;
                }
                case 4: {
                    if(this.zze.zza) {
                        this.zzX();
                    }
                    this.zzd.zze();
                    this.zzb.zzc();
                    zzccu zzccu0 = () -> {
                        zzcbo zzcbo0 = this.zzf;
                        if(zzcbo0 != null) {
                            zzcbo0.zza();
                        }
                    };
                    zzs.zza.post(zzccu0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final void zzn() {
        zzccs zzccs0 = () -> {
            float f = this.zzb.zza();
            zzcca zzcca0 = this.zzh;
            if(zzcca0 != null) {
                try {
                    zzcca0.zzT(f, false);
                }
                catch(IOException iOException0) {
                    zzcaa.zzk("", iOException0);
                }
                return;
            }
            zzcaa.zzj("Trying to set volume before player is initialized.");
        };
        zzs.zza.post(zzccs0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final void zzo() {
        if(this.zzac()) {
            if(this.zze.zza) {
                this.zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            zzcct zzcct0 = () -> {
                zzcbo zzcbo0 = this.zzf;
                if(zzcbo0 != null) {
                    zzcbo0.zzd();
                }
            };
            zzs.zza.post(zzcct0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final void zzp() {
        if(this.zzac()) {
            if(this.zze.zza) {
                this.zzU();
            }
            this.zzh.zzO(true);
            this.zzd.zzc();
            this.zzb.zzb();
            this.zza.zzb();
            zzccq zzccq0 = () -> {
                zzcbo zzcbo0 = this.zzf;
                if(zzcbo0 != null) {
                    zzcbo0.zze();
                }
            };
            zzs.zza.post(zzccq0);
            return;
        }
        this.zzp = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final void zzq(int v) {
        if(this.zzac()) {
            this.zzh.zzI(((long)v));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final void zzr(zzcbo zzcbo0) {
        this.zzf = zzcbo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final void zzs(String s) {
        if(s != null) {
            this.zzC(s, null, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final void zzt() {
        if(this.zzad()) {
            this.zzh.zzU();
            this.zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final void zzu(float f, float f1) {
        zzcch zzcch0 = this.zzm;
        if(zzcch0 != null) {
            zzcch0.zzf(f, f1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbz
    public final void zzv() {
        zzcda zzcda0 = () -> {
            zzcbo zzcbo0 = this.zzf;
            if(zzcbo0 != null) {
                zzcbo0.zzg();
            }
        };
        zzs.zza.post(zzcda0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final Integer zzw() {
        return this.zzh == null ? null : this.zzh.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final void zzx(int v) {
        zzcca zzcca0 = this.zzh;
        if(zzcca0 != null) {
            zzcca0.zzJ(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final void zzy(int v) {
        zzcca zzcca0 = this.zzh;
        if(zzcca0 != null) {
            zzcca0.zzK(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbp
    public final void zzz(int v) {
        zzcca zzcca0 = this.zzh;
        if(zzcca0 != null) {
            zzcca0.zzM(v);
        }
    }
}

