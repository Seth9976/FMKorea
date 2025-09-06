package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzerj implements Callable {
    public final List zza;
    public final Bundle zzb;

    public zzerj(List list0, Bundle bundle0) {
        this.zza = list0;
        this.zzb = bundle0;
    }

    @Override
    public final Object call() {
        Bundle bundle0 = this.zzb;
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: this.zza) {
            d d0 = (d)object0;
            if(((JSONObject)d0.get()) != null) {
                jSONArray0.put(d0.get());
            }
        }
        return jSONArray0.length() == 0 ? null : new zzerl(jSONArray0.toString(), bundle0);
    }
}

