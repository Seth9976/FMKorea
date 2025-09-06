package com.google.android.gms.ads.nonagon.signalgeneration;

import Z1.d;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbun;
import com.google.android.gms.internal.ads.zzfxl;
import com.google.android.gms.internal.ads.zzfye;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;

public final class zzaj implements zzfxl {
    public final zzbun zza;

    public zzaj(zzbun zzbun0) {
        this.zza = zzbun0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        zzam zzam0 = new zzam(new JsonReader(new InputStreamReader(((InputStream)object0))));
        try {
            zzam0.zzb = zzay.zzb().zzh(this.zza.zza).toString();
            return zzfye.zzh(zzam0);
        }
        catch(JSONException unused_ex) {
            zzam0.zzb = "{}";
            return zzfye.zzh(zzam0);
        }
    }
}

