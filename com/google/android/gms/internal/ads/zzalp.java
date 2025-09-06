package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

public abstract class zzalp implements Comparable {
    private final zzama zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzalt zzf;
    private Integer zzg;
    private zzals zzh;
    private boolean zzi;
    private zzaky zzj;
    private zzalo zzk;
    private final zzald zzl;

    public zzalp(int v, String s, zzalt zzalt0) {
        this.zza = zzama.zza ? new zzama() : null;
        this.zze = new Object();
        int v1 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = v;
        this.zzc = s;
        this.zzf = zzalt0;
        this.zzl = new zzald();
        if(!TextUtils.isEmpty(s)) {
            Uri uri0 = Uri.parse(s);
            if(uri0 != null) {
                String s1 = uri0.getHost();
                if(s1 != null) {
                    v1 = s1.hashCode();
                }
            }
        }
        this.zzd = v1;
    }

    @Override
    public final int compareTo(Object object0) {
        return ((int)this.zzg) - ((int)((zzalp)object0).zzg);
    }

    @Override
    public final String toString() {
        return "[ ] " + this.zzc + " " + ("0x" + Integer.toHexString(this.zzd)) + " NORMAL " + this.zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzaky zzd() {
        return this.zzj;
    }

    public final zzalp zze(zzaky zzaky0) {
        this.zzj = zzaky0;
        return this;
    }

    public final zzalp zzf(zzals zzals0) {
        this.zzh = zzals0;
        return this;
    }

    public final zzalp zzg(int v) {
        this.zzg = v;
        return this;
    }

    protected abstract zzalv zzh(zzall arg1);

    // 去混淆评级： 低(30)
    public final String zzj() {
        return this.zzb == 0 ? this.zzc : "1-" + this.zzc;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() {
        return Collections.emptyMap();
    }

    public final void zzm(String s) {
        if(zzama.zza) {
            this.zza.zza(s, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzaly zzaly0) {
        synchronized(this.zze) {
        }
        this.zzf.zza(zzaly0);
    }

    protected abstract void zzo(Object arg1);

    final void zzp(String s) {
        zzals zzals0 = this.zzh;
        if(zzals0 != null) {
            zzals0.zzb(this);
        }
        if(zzama.zza) {
            long v = Thread.currentThread().getId();
            if(Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzaln(this, s, v));
                return;
            }
            this.zza.zza(s, v);
            this.zza.zzb(this.toString());
        }
    }

    public final void zzq() {
        synchronized(this.zze) {
            this.zzi = true;
        }
    }

    final void zzr() {
        zzalo zzalo0;
        synchronized(this.zze) {
            zzalo0 = this.zzk;
        }
        if(zzalo0 != null) {
            zzalo0.zza(this);
        }
    }

    final void zzs(zzalv zzalv0) {
        zzalo zzalo0;
        synchronized(this.zze) {
            zzalo0 = this.zzk;
        }
        if(zzalo0 != null) {
            zzalo0.zzb(this, zzalv0);
        }
    }

    final void zzt(int v) {
        zzals zzals0 = this.zzh;
        if(zzals0 != null) {
            zzals0.zzc(this, v);
        }
    }

    final void zzu(zzalo zzalo0) {
        synchronized(this.zze) {
            this.zzk = zzalo0;
        }
    }

    public final boolean zzv() {
        synchronized(this.zze) {
        }
        return this.zzi;
    }

    public final boolean zzw() {
        synchronized(this.zze) {
        }
        return false;
    }

    public byte[] zzx() {
        return null;
    }

    public final zzald zzy() {
        return this.zzl;
    }
}

