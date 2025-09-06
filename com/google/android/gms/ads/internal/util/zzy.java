package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;

@TargetApi(30)
public final class zzy extends zzx {
    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final int zzn(Context context0) {
        return ((Boolean)zzba.zzc().zzb(zzbbr.zzig)).booleanValue() ? 0 : super.zzn(context0);
    }
}

