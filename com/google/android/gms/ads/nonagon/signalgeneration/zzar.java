package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzcaa;
import org.json.JSONException;
import org.json.JSONObject;

final class zzar extends QueryInfoGenerationCallback {
    final String zza;
    final TaggingLibraryJsInterface zzb;

    zzar(TaggingLibraryJsInterface taggingLibraryJsInterface0, String s) {
        this.zzb = taggingLibraryJsInterface0;
        this.zza = s;
        super();
    }

    @Override  // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String s) {
        zzcaa.zzj(("Failed to generate query info for the tagging library, error: " + s));
        this.zzb.zzb.evaluateJavascript(String.format("window.postMessage({\'paw_id\': \'%1$s\', \'error\': \'%2$s\'}, \'*\');", this.zza, s), null);
    }

    @Override  // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo0) {
        String s1;
        String s = queryInfo0.getQuery();
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("paw_id", this.zza);
            jSONObject0.put("signal", s);
            s1 = String.format("window.postMessage(%1$s, \'*\');", jSONObject0);
        }
        catch(JSONException unused_ex) {
            String s2 = queryInfo0.getQuery();
            s1 = String.format("window.postMessage({\'paw_id\': \'%1$s\', \'signal\': \'%2$s\'}, \'*\');", this.zza, s2);
        }
        this.zzb.zzb.evaluateJavascript(s1, null);
    }
}

