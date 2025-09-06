package com.google.android.gms.internal.ads;

import Z1.d;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbjg implements zzbir {
    private final Object zza;
    private final Map zzb;

    public zzbjg() {
        this.zza = new Object();
        this.zzb = new HashMap();
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("id");
        String s1 = (String)map0.get("fail");
        String s2 = (String)map0.get("fail_reason");
        String s3 = (String)map0.get("fail_stack");
        String s4 = (String)map0.get("result");
        if(TextUtils.isEmpty(s3)) {
            s2 = "Unknown Fail Reason.";
        }
        String s5 = TextUtils.isEmpty(s3) ? "" : "\n" + s3;
        synchronized(this.zza) {
            zzbjf zzbjf0 = (zzbjf)this.zzb.remove(s);
            if(zzbjf0 == null) {
                zzcaa.zzj(("Received result for unexpected method invocation: " + s));
                return;
            }
            if(!TextUtils.isEmpty(s1)) {
                zzbjf0.zza(s2 + s5);
                return;
            }
            if(s4 == null) {
                zzbjf0.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject0 = new JSONObject(s4);
                if(zze.zzc()) {
                    zze.zza(("Result GMSG: " + jSONObject0.toString(2)));
                }
                zzbjf0.zzb(jSONObject0);
            }
            catch(JSONException jSONException0) {
                zzbjf0.zza(jSONException0.getMessage());
            }
        }
    }

    public final d zzb(zzbly zzbly0, String s, JSONObject jSONObject0) {
        d d0 = new zzcas();
        this.zzc("6d201163-381c-4dd7-91bf-aa7071318c94", new zzbje(this, ((zzcas)d0)));
        try {
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("id", "6d201163-381c-4dd7-91bf-aa7071318c94");
            jSONObject1.put("args", jSONObject0);
            zzbly0.zzl(s, jSONObject1);
        }
        catch(Exception exception0) {
            ((zzcas)d0).zzd(exception0);
        }
        return d0;
    }

    public final void zzc(String s, zzbjf zzbjf0) {
        synchronized(this.zza) {
            this.zzb.put(s, zzbjf0);
        }
    }
}

