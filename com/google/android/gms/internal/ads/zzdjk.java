package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzdjk implements zzbir {
    public final zzdjo zza;

    public zzdjk(zzdjo zzdjo0) {
        this.zza = zzdjo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        ((zzcfi)object0).zzN().zzA(new zzdjn(this.zza, map0));
        Object object1 = map0.get("overlayHtml");
        Object object2 = map0.get("baseUrl");
        if(TextUtils.isEmpty(((String)object2))) {
            ((zzcfi)object0).loadData(((String)object1), "text/html", "UTF-8");
            return;
        }
        ((zzcfi)object0).loadDataWithBaseURL(((String)object2), ((String)object1), "text/html", "UTF-8", null);
    }
}

