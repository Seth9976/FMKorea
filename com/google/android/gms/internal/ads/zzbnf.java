package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

public final class zzbnf {
    public static final zzbnc zza;
    public static final zzbna zzb;
    private static final Charset zzc;

    static {
        zzbnf.zzc = Charset.forName("UTF-8");
        zzbnf.zza = new zzbne();
        zzbnf.zzb = (JSONObject jSONObject0) -> new ByteArrayInputStream(jSONObject0.toString().getBytes(zzbnf.zzc));
    }

    // 检测为 Lambda 实现
    static InputStream zza(JSONObject jSONObject0) [...]
}

