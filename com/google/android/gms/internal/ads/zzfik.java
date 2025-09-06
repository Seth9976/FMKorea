package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

public final class zzfik {
    private final Context zza;
    private final Executor zzb;
    private final zzcaf zzc;
    private final zzfhu zzd;

    zzfik(Context context0, Executor executor0, zzcaf zzcaf0, zzfhu zzfhu0) {
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = zzcaf0;
        this.zzd = zzfhu0;
    }

    // 检测为 Lambda 实现
    final void zza(String s) [...]

    // 检测为 Lambda 实现
    final void zzb(String s, zzfhr zzfhr0) [...]

    public final void zzc(String s, zzfhr zzfhr0) {
        if(zzfhu.zza() && ((Boolean)zzbdd.zzd.zze()).booleanValue()) {
            zzfij zzfij0 = () -> {
                zzfhg zzfhg0 = zzfhf.zza(this.zza, 14);
                zzfhg0.zzh();
                zzfhg0.zzf(this.zzc.zza(s));
                if(zzfhr0 == null) {
                    zzfhk zzfhk0 = zzfhg0.zzl();
                    this.zzd.zzb(zzfhk0);
                    return;
                }
                zzfhr0.zza(zzfhg0);
                zzfhr0.zzg();
            };
            this.zzb.execute(zzfij0);
            return;
        }
        zzfii zzfii0 = () -> this.zzc.zza(s);
        this.zzb.execute(zzfii0);
    }

    public final void zzd(List list0) {
        for(Object object0: list0) {
            this.zzc(((String)object0), null);
        }
    }
}

