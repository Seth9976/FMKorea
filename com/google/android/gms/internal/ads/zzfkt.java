package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

public final class zzfkt extends zzfkp {
    public zzfkt(zzfki zzfki0, HashSet hashSet0, JSONObject jSONObject0, long v) {
        super(zzfki0, hashSet0, jSONObject0, v);
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        return this.zzb.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzfkq
    protected final void onPostExecute(Object object0) {
        this.zzc(((String)object0));
        super.zza(((String)object0));
    }

    @Override  // com.google.android.gms.internal.ads.zzfkq
    protected final void zza(String s) {
        this.zzc(s);
        super.zza(s);
    }

    private final void zzc(String s) {
        zzfjh zzfjh0 = zzfjh.zza();
        if(zzfjh0 != null) {
            for(Object object0: zzfjh0.zzc()) {
                zzfit zzfit0 = (zzfit)object0;
                if(this.zza.contains(zzfit0.zzh())) {
                    zzfit0.zzg().zzd(s, this.zzc);
                }
            }
        }
    }
}

