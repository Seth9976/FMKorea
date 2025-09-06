package com.google.android.gms.internal.ads;

import android.net.Uri.Builder;
import android.net.Uri;
import java.util.Map.Entry;
import java.util.Map;

public final class zzfgy {
    private final String zza;

    public zzfgy() {
        this.zza = "https://csi.gstatic.com/csi";
    }

    public final String zza(Map map0) {
        Uri.Builder uri$Builder0 = Uri.parse(this.zza).buildUpon();
        for(Object object0: map0.entrySet()) {
            uri$Builder0.appendQueryParameter(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        return uri$Builder0.build().toString();
    }
}

