package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

public final class zzbzv implements zzbzy {
    public final String zza;

    public zzbzv(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbzy
    public final void zza(JsonWriter jsonWriter0) {
        String s = this.zza;
        jsonWriter0.name("params").beginObject();
        if(s != null) {
            jsonWriter0.name("error_description").value(s);
        }
        jsonWriter0.endObject();
    }
}

