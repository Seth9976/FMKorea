package com.google.android.gms.internal.ads;

import java.net.URL;
import java.net.URLConnection;

public final class zzfnv implements zzfny {
    public final URL zza;

    public zzfnv(URL uRL0) {
        this.zza = uRL0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfny
    public final URLConnection zza() {
        return zzfnz.zzp(this.zza);
    }
}

