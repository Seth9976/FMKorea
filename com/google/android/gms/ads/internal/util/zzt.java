package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfp;
import com.google.android.gms.internal.ads.zzcgm;
import com.google.android.gms.internal.ads.zzecs;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
public class zzt extends zzaa {
    public zzt() {
        super(null);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final int zza() {
        return 0x1030226;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final CookieManager zzb(Context context0) {
        if(zzs.zzC()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        }
        catch(Throwable throwable0) {
            zzcaa.zzh("Failed to obtain CookieManager.", throwable0);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(throwable0, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final WebResourceResponse zzc(String s, String s1, int v, String s2, Map map0, InputStream inputStream0) {
        return new WebResourceResponse(s, s1, v, s2, map0, inputStream0);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final zzcfp zzd(zzcfi zzcfi0, zzaxe zzaxe0, boolean z, zzecs zzecs0) {
        return new zzcgm(zzcfi0, zzaxe0, z, zzecs0);
    }
}

