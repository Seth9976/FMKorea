package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

public final class zzeny implements zzesj {
    private final zzfyo zza;
    private final Context zzb;

    public zzeny(zzfyo zzfyo0, Context context0) {
        this.zza = zzfyo0;
        this.zzb = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 13;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzenx zzenx0 = () -> {
            AudioManager audioManager0 = (AudioManager)this.zzb.getSystemService("audio");
            int v = audioManager0.getMode();
            boolean z = audioManager0.isMusicActive();
            boolean z1 = audioManager0.isSpeakerphoneOn();
            int v1 = audioManager0.getStreamVolume(3);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzjS)).booleanValue()) {
                int v2 = audioManager0.getStreamMaxVolume(3);
                return new zzenz(v, z, z1, v1, zzt.zzq().zzk(audioManager0), v2, audioManager0.getRingerMode(), audioManager0.getStreamVolume(2), zzt.zzr().zza(), zzt.zzr().zze());
            }
            return new zzenz(v, z, z1, v1, -1, -1, audioManager0.getRingerMode(), audioManager0.getStreamVolume(2), zzt.zzr().zza(), zzt.zzr().zze());
        };
        return this.zza.zzb(zzenx0);
    }

    // 检测为 Lambda 实现
    final zzenz zzc() [...]
}

