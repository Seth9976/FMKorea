package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

public final class zzcge extends zzdp {
    private final zzccj zza;
    private final Object zzb;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private zzdt zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbge zzn;

    public zzcge(zzccj zzccj0, float f, boolean z, boolean z1) {
        this.zzb = new Object();
        this.zzh = true;
        this.zza = zzccj0;
        this.zzi = f;
        this.zzc = z;
        this.zzd = z1;
    }

    public final void zzc(float f, float f1, int v, boolean z, float f2) {
        int v2;
        boolean z2;
        boolean z1 = true;
        synchronized(this.zzb) {
            if(Float.compare(f1, this.zzi) == 0 && f2 == this.zzk) {
                z1 = false;
            }
            this.zzi = f1;
            this.zzj = f;
            z2 = this.zzh;
            this.zzh = z;
            v2 = this.zze;
            this.zze = v;
            float f3 = this.zzk;
            this.zzk = f2;
            if(Math.abs(f2 - f3) > 0.0001f) {
                this.zza.zzF().invalidate();
            }
        }
        if(z1) {
            zzbge zzbge0 = this.zzn;
            if(zzbge0 != null) {
                try {
                    zzbge0.zze();
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzl("#007 Could not call remote method.", remoteException0);
                }
            }
        }
        this.zzw(v2, v, z2, z);
    }

    // 检测为 Lambda 实现
    final void zzd(int v, int v1, boolean z, boolean z1) [...]

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        synchronized(this.zzb) {
        }
        return this.zzk;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        synchronized(this.zzb) {
        }
        return this.zzj;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        synchronized(this.zzb) {
        }
        return this.zzi;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        synchronized(this.zzb) {
        }
        return this.zze;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() {
        synchronized(this.zzb) {
        }
        return this.zzf;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z) {
        this.zzx((z ? "mute" : "unmute"), null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        this.zzx("pause", null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        this.zzx("play", null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(zzdt zzdt0) {
        synchronized(this.zzb) {
            this.zzf = zzdt0;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        this.zzx("stop", null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        boolean z = false;
        boolean z1 = this.zzp();
        synchronized(this.zzb) {
            if(!z1 && this.zzm && this.zzd) {
                z = true;
            }
        }
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        boolean z = false;
        synchronized(this.zzb) {
            if(this.zzc && this.zzl) {
                z = true;
            }
        }
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        synchronized(this.zzb) {
        }
        return this.zzh;
    }

    // 检测为 Lambda 实现
    final void zzr(Map map0) [...]

    public final void zzs(zzfl zzfl0) {
        synchronized(this.zzb) {
            this.zzl = zzfl0.zzb;
            this.zzm = zzfl0.zzc;
        }
        this.zzx("initialState", CollectionUtils.mapOf("muteStart", (zzfl0.zza ? "1" : "0"), "customControlsRequested", (zzfl0.zzb ? "1" : "0"), "clickToExpandRequested", (zzfl0.zzc ? "1" : "0")));
    }

    public final void zzt(float f) {
        synchronized(this.zzb) {
            this.zzj = f;
        }
    }

    public final void zzu() {
        int v;
        synchronized(this.zzb) {
            v = this.zze;
            this.zze = 3;
        }
        this.zzw(v, 3, this.zzh, this.zzh);
    }

    public final void zzv(zzbge zzbge0) {
        synchronized(this.zzb) {
            this.zzn = zzbge0;
        }
    }

    private final void zzw(int v, int v1, boolean z, boolean z1) {
        zzcgd zzcgd0 = () -> {
            boolean z6;
            boolean z4;
            int v3;
            synchronized(this.zzb) {
                boolean z2 = this.zzg;
                boolean z3 = false;
                if(z2 || v1 != 1) {
                    v3 = v1;
                    z4 = false;
                }
                else {
                    v1 = 1;
                    v3 = 1;
                    z4 = true;
                }
                boolean z5 = v != v1;
                if(!z5 || v3 != 1) {
                    z6 = false;
                }
                else {
                    z6 = true;
                    v3 = 1;
                }
                if(z2 || z4) {
                    z3 = true;
                }
                try {
                    this.zzg = z3;
                    if(z4) {
                        zzdt zzdt0 = this.zzf;
                        if(zzdt0 != null) {
                            zzdt0.zzi();
                        }
                    }
                    if(z6) {
                        zzdt zzdt1 = this.zzf;
                        if(zzdt1 != null) {
                            zzdt1.zzh();
                        }
                    }
                    if(z5 && v3 == 2) {
                        zzdt zzdt2 = this.zzf;
                        if(zzdt2 != null) {
                            zzdt2.zzg();
                        }
                    }
                    if(z5 && v3 == 3) {
                        zzdt zzdt3 = this.zzf;
                        if(zzdt3 != null) {
                            zzdt3.zze();
                        }
                        this.zza.zzw();
                    }
                    if(z != z1) {
                        zzdt zzdt4 = this.zzf;
                        if(zzdt4 != null) {
                            zzdt4.zzf(z1);
                        }
                    }
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzl("#007 Could not call remote method.", remoteException0);
                }
            }
        };
        zzcan.zze.execute(zzcgd0);
    }

    private final void zzx(String s, Map map0) {
        HashMap hashMap0 = map0 == null ? new HashMap() : new HashMap(map0);
        hashMap0.put("action", s);
        zzcgc zzcgc0 = () -> this.zza.zzd("pubVideoCmd", hashMap0);
        zzcan.zze.execute(zzcgc0);
    }
}

