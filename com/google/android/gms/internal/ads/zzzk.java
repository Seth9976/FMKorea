package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;

public final class zzzk {
    private final zzyo zza;
    private final zzzg zzb;
    private final zzzj zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzzk(Context context0) {
        zzzg zzzg0;
        this.zza = new zzyo();
        zzzj zzzj0 = null;
        if(context0 == null) {
            zzzg0 = null;
        }
        else {
            Context context1 = context0.getApplicationContext();
            zzzg0 = zzzi.zzc(context1);
            if(zzzg0 == null) {
                zzzg0 = zzzh.zzc(context1);
            }
        }
        this.zzb = zzzg0;
        if(zzzg0 != null) {
            zzzj0 = zzzj.zza();
        }
        this.zzc = zzzj0;
        this.zzk = 0x8000000000000001L;
        this.zzl = 0x8000000000000001L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public final long zza(long v) {
        long v6;
        if(this.zzp != -1L && this.zza.zzg()) {
            long v1 = this.zza.zzc();
            long v2 = this.zzq + ((long)(((float)(v1 * (this.zzm - this.zzp))) / this.zzi));
            if(Math.abs(v - v2) > 20000000L) {
                this.zzl();
            }
            else {
                v = v2;
            }
        }
        this.zzn = this.zzm;
        this.zzo = v;
        zzzj zzzj0 = this.zzc;
        if(zzzj0 != null && this.zzk != 0x8000000000000001L) {
            long v3 = zzzj0.zza;
            if(v3 == 0x8000000000000001L) {
                return v;
            }
            long v4 = this.zzk;
            long v5 = v3 + (v - v3) / v4 * v4;
            if(v <= v5) {
                v6 = v5 - v4;
            }
            else {
                long v7 = v5;
                v5 = v4 + v5;
                v6 = v7;
            }
            long v8 = this.zzl;
            if(v5 - v >= v - v6) {
                v5 = v6;
            }
            return v5 - v8;
        }
        return v;
    }

    public static void zzb(zzzk zzzk0, Display display0) {
        if(display0 != null) {
            long v = (long)(1000000000.0 / ((double)display0.getRefreshRate()));
            zzzk0.zzk = v;
            zzzk0.zzl = v * 80L / 100L;
            return;
        }
        zzes.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        zzzk0.zzk = 0x8000000000000001L;
        zzzk0.zzl = 0x8000000000000001L;
    }

    public final void zzc(float f) {
        this.zzf = f;
        this.zza.zzf();
        this.zzm();
    }

    public final void zzd(long v) {
        long v1 = this.zzn;
        if(v1 != -1L) {
            this.zzp = v1;
            this.zzq = this.zzo;
        }
        ++this.zzm;
        this.zza.zze(v * 1000L);
        this.zzm();
    }

    public final void zze(float f) {
        this.zzi = f;
        this.zzl();
        this.zzn(false);
    }

    public final void zzf() {
        this.zzl();
    }

    public final void zzg() {
        this.zzd = true;
        this.zzl();
        if(this.zzb != null) {
            this.zzc.getClass();
            this.zzc.zzb();
            zzze zzze0 = new zzze(this);
            this.zzb.zzb(zzze0);
        }
        this.zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzzg zzzg0 = this.zzb;
        if(zzzg0 != null) {
            zzzg0.zza();
            this.zzc.getClass();
            this.zzc.zzc();
        }
        this.zzk();
    }

    public final void zzi(Surface surface0) {
        if(surface0 instanceof zzzc) {
            surface0 = null;
        }
        if(this.zze == surface0) {
            return;
        }
        this.zzk();
        this.zze = surface0;
        this.zzn(true);
    }

    public final void zzj(int v) {
        if(this.zzj == v) {
            return;
        }
        this.zzj = v;
        this.zzn(true);
    }

    private final void zzk() {
        if(zzfk.zza >= 30) {
            Surface surface0 = this.zze;
            if(surface0 != null && this.zzj != 0x80000000 && this.zzh != 0.0f) {
                this.zzh = 0.0f;
                zzzf.zza(surface0, 0.0f);
            }
        }
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    private final void zzm() {
        if(zzfk.zza >= 30 && this.zze != null) {
            float f = this.zza.zzg() ? this.zza.zza() : this.zzf;
            float f1 = this.zzg;
            if(f == f1) {
                return;
            }
            float f2 = 1.0f;
            int v = Float.compare(f, -1.0f);
            if(v != 0 && f1 != -1.0f) {
                if(this.zza.zzg() && this.zza.zzd() >= 5000000000L) {
                    f2 = 0.02f;
                }
                if(Math.abs(f - this.zzg) < f2) {
                    return;
                }
            }
            else if(v == 0 && this.zza.zzb() < 30) {
                return;
            }
            this.zzg = f;
            this.zzn(false);
        }
    }

    private final void zzn(boolean z) {
        if(zzfk.zza >= 30) {
            float f = 0.0f;
            Surface surface0 = this.zze;
            if(surface0 != null && this.zzj != 0x80000000) {
                if(this.zzd) {
                    float f1 = this.zzg;
                    if(f1 != -1.0f) {
                        f = this.zzi * f1;
                    }
                }
                if(!z && this.zzh == f) {
                    return;
                }
                this.zzh = f;
                zzzf.zza(surface0, f);
            }
        }
    }
}

