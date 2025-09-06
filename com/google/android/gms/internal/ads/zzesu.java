package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

public final class zzesu implements zzesj {
    private final zzfyo zza;
    private final Context zzb;

    public zzesu(zzfyo zzfyo0, Context context0) {
        this.zza = zzfyo0;
        this.zzb = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 39;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzest zzest0 = () -> {
            int v2;
            TelephonyManager telephonyManager0 = (TelephonyManager)this.zzb.getSystemService("phone");
            String s = telephonyManager0.getNetworkOperator();
            int v = telephonyManager0.getPhoneType();
            int v1 = -1;
            if(zzs.zzx(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
                ConnectivityManager connectivityManager0 = (ConnectivityManager)this.zzb.getSystemService("connectivity");
                NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
                if(networkInfo0 == null) {
                    v2 = -1;
                }
                else {
                    v2 = networkInfo0.getType();
                    v1 = networkInfo0.getDetailedState().ordinal();
                }
                boolean z = connectivityManager0.isActiveNetworkMetered();
                return new zzess(s, v2, zzt.zzq().zzn(this.zzb), v, z, v1);
            }
            return new zzess(s, -2, zzt.zzq().zzn(this.zzb), v, false, -1);
        };
        return this.zza.zzb(zzest0);
    }

    // 检测为 Lambda 实现
    final zzess zzc() [...]
}

