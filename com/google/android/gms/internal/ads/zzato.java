package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager.OnChecksumsReadyListener;
import java.util.List;

public final class zzato implements PackageManager.OnChecksumsReadyListener {
    public final zzfyw zza;

    public zzato(zzfyw zzfyw0) {
        this.zza = zzfyw0;
    }

    @Override  // android.content.pm.PackageManager$OnChecksumsReadyListener
    public final void onChecksumsReady(List list0) {
        zzfyw zzfyw0 = this.zza;
        if(list0 == null) {
            zzfyw0.zzc(null);
            return;
        }
        try {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ApkChecksum apkChecksum0 = c.a(list0.get(v1));
                if(apkChecksum0.getType() == 8) {
                    zzfyw0.zzc(zzasb.zzb(apkChecksum0.getValue()));
                    return;
                }
            }
            zzfyw0.zzc(null);
        }
        catch(Throwable unused_ex) {
            zzfyw0.zzc(null);
        }
    }
}

