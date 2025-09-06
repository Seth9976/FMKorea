package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzery implements zzesj {
    private final zzfyo zza;
    private final Context zzb;
    private final zzcag zzc;
    private final String zzd;

    zzery(zzfyo zzfyo0, Context context0, zzcag zzcag0, String s) {
        this.zza = zzfyo0;
        this.zzb = context0;
        this.zzc = zzcag0;
        this.zzd = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 35;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzerx zzerx0 = () -> {
            boolean z = Wrappers.packageManager(this.zzb).isCallerInstantApp();
            boolean z1 = zzs.zzB(this.zzb);
            String s = this.zzc.zza;
            boolean z2 = zzs.zzC();
            return this.zzb.getApplicationInfo() == null ? new zzerz(z, z1, s, z2, 0, DynamiteModule.getRemoteVersion(this.zzb, "com.google.android.gms.ads.dynamite"), DynamiteModule.getLocalVersion(this.zzb, "com.google.android.gms.ads.dynamite"), this.zzd) : new zzerz(z, z1, s, z2, 35, DynamiteModule.getRemoteVersion(this.zzb, "com.google.android.gms.ads.dynamite"), DynamiteModule.getLocalVersion(this.zzb, "com.google.android.gms.ads.dynamite"), this.zzd);
        };
        return this.zza.zzb(zzerx0);
    }

    // 检测为 Lambda 实现
    final zzerz zzc() [...]
}

