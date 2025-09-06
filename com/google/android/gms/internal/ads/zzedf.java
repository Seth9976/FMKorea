package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

public final class zzedf implements zzedg {
    // 去混淆评级： 低(40)
    @Override  // com.google.android.gms.internal.ads.zzedg
    public final zzfip zza(String s, WebView webView0, String s1, String s2, String s3, zzedi zzedi0, zzedh zzedh0, String s4) {
        return !((Boolean)zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() || true ? null : ((zzfip)zzedf.zzn(() -> {
            zzfiz zzfiz0 = zzfiz.zza("Google", s);
            zzfiy zzfiy0 = zzedf.zzm("javascript");
            zzfiu zzfiu0 = zzedf.zzk(zzedh0.toString());
            zzfiy zzfiy1 = zzfiy.zzc;
            if(zzfiy0 == zzfiy1) {
                zzcaa.zzj("Omid html session error; Unable to parse impression owner: javascript");
                return null;
            }
            if(zzfiu0 == null) {
                zzcaa.zzj(("Omid html session error; Unable to parse creative type: " + zzedh0));
                return null;
            }
            zzfiy zzfiy2 = zzedf.zzm(s3);
            if(zzfiu0 == zzfiu.zzd && zzfiy2 == zzfiy1) {
                zzcaa.zzj(("Omid html session error; Video events owner unknown for video creative: " + s3));
                return null;
            }
            zzfir zzfir0 = zzfir.zzb(zzfiz0, webView0, s4, "");
            return zzfip.zza(zzfiq.zza(zzfiu0, zzedf.zzl(zzedi0.toString()), zzfiy0, zzfiy2, true), zzfir0);
        }));
    }

    // 去混淆评级： 低(40)
    @Override  // com.google.android.gms.internal.ads.zzedg
    public final zzfip zzb(String s, WebView webView0, String s1, String s2, String s3, String s4, zzedi zzedi0, zzedh zzedh0, String s5) {
        return !((Boolean)zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() || true ? null : ((zzfip)zzedf.zzn(() -> {
            zzfiz zzfiz0 = zzfiz.zza(s4, s);
            zzfiy zzfiy0 = zzedf.zzm("javascript");
            zzfiy zzfiy1 = zzedf.zzm(s3);
            zzfiu zzfiu0 = zzedf.zzk(zzedh0.toString());
            zzfiy zzfiy2 = zzfiy.zzc;
            if(zzfiy0 == zzfiy2) {
                zzcaa.zzj("Omid js session error; Unable to parse impression owner: javascript");
                return null;
            }
            if(zzfiu0 == null) {
                zzcaa.zzj(("Omid js session error; Unable to parse creative type: " + zzedh0));
                return null;
            }
            if(zzfiu0 == zzfiu.zzd && zzfiy1 == zzfiy2) {
                zzcaa.zzj(("Omid js session error; Video events owner unknown for video creative: " + s3));
                return null;
            }
            zzfir zzfir0 = zzfir.zzc(zzfiz0, webView0, s5, "");
            return zzfip.zza(zzfiq.zza(zzfiu0, zzedf.zzl(zzedi0.toString()), zzfiy0, zzfiy1, true), zzfir0);
        }));
    }

    // 检测为 Lambda 实现
    static zzfip zzc(String s, String s1, String s2, zzedh zzedh0, String s3, WebView webView0, String s4, String s5, zzedi zzedi0) [...]

    // 检测为 Lambda 实现
    static zzfip zzd(String s, String s1, String s2, String s3, zzedh zzedh0, WebView webView0, String s4, String s5, zzedi zzedi0) [...]

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzedg
    public final String zze(Context context0) {
        return ((Boolean)zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() ? "a.1.4.6-google_20230720" : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzedg
    public final void zzf(zzfip zzfip0, View view0) {
        zzedf.zzo(new zzecx(zzfip0, view0));
    }

    @Override  // com.google.android.gms.internal.ads.zzedg
    public final void zzg(zzfip zzfip0) {
        zzedf.zzo(new zzeda(zzfip0));
    }

    @Override  // com.google.android.gms.internal.ads.zzedg
    public final void zzh(zzfip zzfip0, View view0) {
        zzedf.zzo(new zzecw(zzfip0, view0));
    }

    @Override  // com.google.android.gms.internal.ads.zzedg
    public final void zzi(zzfip zzfip0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() && false) {
            zzfip0.getClass();
            zzedf.zzo(new zzecz(zzfip0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzedg
    public final boolean zzj(Context context0) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzeR)).booleanValue()) {
            zzcaa.zzj("Omid flag is disabled");
            return false;
        }
        Boolean boolean0 = (Boolean)zzedf.zzn(new zzedd(context0));
        return boolean0 != null && boolean0.booleanValue();
    }

    private static zzfiu zzk(String s) {
        switch(s) {
            case "htmlDisplay": {
                return zzfiu.zzb;
            }
            case "nativeDisplay": {
                return zzfiu.zzc;
            }
            case "video": {
                return zzfiu.zzd;
            }
            default: {
                return null;
            }
        }
    }

    private static zzfix zzl(String s) {
        switch(s) {
            case "beginToRender": {
                return zzfix.zzd;
            }
            case "definedByJavascript": {
                return zzfix.zza;
            }
            case "onePixel": {
                return zzfix.zze;
            }
            default: {
                return zzfix.zzb;
            }
        }
    }

    private static zzfiy zzm(String s) {
        if("native".equals(s)) {
            return zzfiy.zza;
        }
        return "javascript".equals(s) ? zzfiy.zzb : zzfiy.zzc;
    }

    private static final Object zzn(zzede zzede0) {
        try {
            return zzede0.zza();
        }
        catch(RuntimeException runtimeException0) {
            zzt.zzo().zzt(runtimeException0, "omid exception");
            return null;
        }
    }

    private static final void zzo(Runnable runnable0) {
        try {
            runnable0.run();
        }
        catch(RuntimeException runtimeException0) {
            zzt.zzo().zzt(runtimeException0, "omid exception");
        }
    }
}

