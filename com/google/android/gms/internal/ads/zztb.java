package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;

public abstract class zztb extends zzst {
    private final HashMap zza;
    private Handler zzb;
    private zzhk zzc;

    protected zztb() {
        this.zza = new HashMap();
    }

    // 检测为 Lambda 实现
    protected abstract void zzA(Object arg1, zztu arg2, zzcw arg3);

    protected final void zzB(Object object0, zztu zztu0) {
        zzdy.zzd(!this.zza.containsKey(object0));
        zzsy zzsy0 = (zztu arg2, zzcw arg3) -> ;;
        zzsz zzsz0 = new zzsz(this, object0);
        zzta zzta0 = new zzta(zztu0, zzsy0, zzsz0);
        this.zza.put(object0, zzta0);
        Handler handler0 = this.zzb;
        handler0.getClass();
        zztu0.zzh(handler0, zzsz0);
        Handler handler1 = this.zzb;
        handler1.getClass();
        zztu0.zzg(handler1, zzsz0);
        zztu0.zzm(zzsy0, this.zzc, this.zzb());
        if(!this.zzu()) {
            zztu0.zzi(zzsy0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzst
    protected final void zzj() {
        for(Object object0: this.zza.values()) {
            ((zzta)object0).zza.zzi(((zzta)object0).zzb);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzst
    protected final void zzl() {
        for(Object object0: this.zza.values()) {
            ((zzta)object0).zza.zzk(((zzta)object0).zzb);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzst
    protected void zzn(zzhk zzhk0) {
        this.zzc = zzhk0;
        this.zzb = zzfk.zzu(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzst
    protected void zzq() {
        for(Object object0: this.zza.values()) {
            ((zzta)object0).zza.zzp(((zzta)object0).zzb);
            ((zzta)object0).zza.zzs(((zzta)object0).zzc);
            ((zzta)object0).zza.zzr(((zzta)object0).zzc);
        }
        this.zza.clear();
    }

    protected int zzw(Object object0, int v) {
        return 0;
    }

    protected long zzx(Object object0, long v) {
        return v;
    }

    protected zzts zzy(Object object0, zzts zzts0) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public void zzz() {
        for(Object object0: this.zza.values()) {
            ((zzta)object0).zza.zzz();
        }
    }
}

