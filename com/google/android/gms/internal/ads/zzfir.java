package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzfir {
    private final zzfiz zza;
    private final WebView zzb;
    private final List zzc;
    private final Map zzd;
    private final String zze;
    private final String zzf;
    private final zzfis zzg;

    private zzfir(zzfiz zzfiz0, WebView webView0, String s, List list0, String s1, String s2, zzfis zzfis0) {
        this.zzc = new ArrayList();
        this.zzd = new HashMap();
        this.zza = zzfiz0;
        this.zzb = webView0;
        this.zzg = zzfis0;
        this.zzf = s1;
        this.zze = "";
    }

    public final WebView zza() {
        return this.zzb;
    }

    public static zzfir zzb(zzfiz zzfiz0, WebView webView0, String s, String s1) {
        return new zzfir(zzfiz0, webView0, null, null, s, "", zzfis.zza);
    }

    public static zzfir zzc(zzfiz zzfiz0, WebView webView0, String s, String s1) {
        return new zzfir(zzfiz0, webView0, null, null, s, "", zzfis.zzc);
    }

    public final zzfis zzd() {
        return this.zzg;
    }

    public final zzfiz zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}

