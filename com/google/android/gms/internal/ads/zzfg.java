package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

final class zzfg implements zzej {
    private static final List zza;
    private final Handler zzb;

    static {
        zzfg.zza = new ArrayList(50);
    }

    public zzfg(Handler handler0) {
        this.zzb = handler0;
    }

    @Override  // com.google.android.gms.internal.ads.zzej
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override  // com.google.android.gms.internal.ads.zzej
    public final zzei zzb(int v) {
        zzei zzei0 = zzfg.zzm();
        ((zzff)zzei0).zzb(this.zzb.obtainMessage(v), this);
        return zzei0;
    }

    @Override  // com.google.android.gms.internal.ads.zzej
    public final zzei zzc(int v, Object object0) {
        zzei zzei0 = zzfg.zzm();
        ((zzff)zzei0).zzb(this.zzb.obtainMessage(v, object0), this);
        return zzei0;
    }

    @Override  // com.google.android.gms.internal.ads.zzej
    public final zzei zzd(int v, int v1, int v2) {
        zzei zzei0 = zzfg.zzm();
        ((zzff)zzei0).zzb(this.zzb.obtainMessage(1, v1, v2), this);
        return zzei0;
    }

    @Override  // com.google.android.gms.internal.ads.zzej
    public final void zze(Object object0) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzej
    public final void zzf(int v) {
        this.zzb.removeMessages(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzej
    public final boolean zzg(int v) {
        return this.zzb.hasMessages(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzej
    public final boolean zzh(Runnable runnable0) {
        return this.zzb.post(runnable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzej
    public final boolean zzi(int v) {
        return this.zzb.sendEmptyMessage(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzej
    public final boolean zzj(int v, long v1) {
        return this.zzb.sendEmptyMessageAtTime(2, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzej
    public final boolean zzk(zzei zzei0) {
        return ((zzff)zzei0).zzc(this.zzb);
    }

    static void zzl(zzff zzff0) {
        List list0 = zzfg.zza;
        synchronized(list0) {
            if(list0.size() < 50) {
                list0.add(zzff0);
            }
        }
    }

    private static zzff zzm() {
        synchronized(zzfg.zza) {
            return zzfg.zza.isEmpty() ? new zzff(null) : ((zzff)zzfg.zza.remove(zzfg.zza.size() - 1));
        }
    }
}

