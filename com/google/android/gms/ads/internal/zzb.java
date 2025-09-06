package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbxb;
import java.util.Collections;
import java.util.List;

public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzbxb zzc;
    private final zzbtt zzd;

    public zzb(Context context0, zzbxb zzbxb0, zzbtt zzbtt0) {
        this.zza = context0;
        this.zzc = zzbxb0;
        this.zzd = new zzbtt(false, Collections.emptyList());
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String s) {
        if(!this.zzd()) {
            return;
        }
        if(s == null) {
            s = "";
        }
        zzbxb zzbxb0 = this.zzc;
        if(zzbxb0 != null) {
            zzbxb0.zzd(s, null, 3);
            return;
        }
        zzbtt zzbtt0 = this.zzd;
        if(zzbtt0.zza) {
            List list0 = zzbtt0.zzb;
            if(list0 != null) {
                for(Object object0: list0) {
                    String s1 = (String)object0;
                    if(!TextUtils.isEmpty(s1)) {
                        String s2 = s1.replace("{NAVIGATION_URL}", Uri.encode(s));
                        zzs.zzI(this.zza, "", s2);
                    }
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    public final boolean zzc() {
        return !this.zzd() || this.zzb;
    }

    // 去混淆评级： 低(30)
    private final boolean zzd() {
        return this.zzc != null && this.zzc.zza().zzf || this.zzd.zza;
    }
}

