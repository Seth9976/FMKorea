package com.google.android.gms.internal.ads;

import android.net.Network;
import java.net.URL;
import java.net.URLConnection;

public final class zzfnt implements zzfny {
    public final Network zza;
    public final URL zzb;

    public zzfnt(Network network0, URL uRL0) {
        this.zza = network0;
        this.zzb = uRL0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfny
    public final URLConnection zza() {
        return zzfnz.zzq(this.zza, this.zzb);
    }
}

