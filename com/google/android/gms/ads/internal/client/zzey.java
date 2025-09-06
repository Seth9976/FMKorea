package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaa;
import java.util.Collections;
import java.util.List;

public final class zzey extends zzcn {
    private zzbkv zza;

    // 检测为 Lambda 实现
    final void zzb() [...]

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final float zze() {
        return 1.0f;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return "";
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        return Collections.emptyList();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() {
        zzcaa.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzex zzex0 = () -> {
            zzbkv zzbkv0 = this.zza;
            if(zzbkv0 != null) {
                try {
                    zzbkv0.zzb(Collections.emptyList());
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzk("Could not notify onComplete event.", remoteException0);
                }
            }
        };
        zzbzt.zza.post(zzex0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String s, IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzda0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper0, String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbof zzbof0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbkv zzbkv0) {
        this.zza = zzbkv0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzff0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() {
        return false;
    }
}

