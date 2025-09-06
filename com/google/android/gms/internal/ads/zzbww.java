package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbww implements zzbxb {
    boolean zza;
    public static final int zzb;
    private static final List zzc;
    private final zzgvu zzd;
    private final LinkedHashMap zze;
    private final List zzf;
    private final List zzg;
    private final Context zzh;
    private final zzbwy zzi;
    private final Object zzj;
    private HashSet zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzbwx zzn;

    static {
        zzbww.zzc = Collections.synchronizedList(new ArrayList());
    }

    public zzbww(Context context0, zzcag zzcag0, zzbwy zzbwy0, String s, zzbwx zzbwx0) {
        this.zzf = new ArrayList();
        this.zzg = new ArrayList();
        this.zzj = new Object();
        this.zzk = new HashSet();
        this.zzl = false;
        this.zzm = false;
        Preconditions.checkNotNull(zzbwy0, "SafeBrowsing config is not present.");
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.zzh = context0;
        this.zze = new LinkedHashMap();
        this.zzn = zzbwx0;
        this.zzi = zzbwy0;
        for(Object object0: zzbwy0.zze) {
            this.zzk.add(((String)object0).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie");
        zzgvu zzgvu0 = zzgxp.zza();
        zzgvu0.zzn(9);
        zzgvu0.zzj(s);
        zzgvu0.zzh(s);
        zzgvv zzgvv0 = zzgvw.zza();
        String s1 = this.zzi.zza;
        if(s1 != null) {
            zzgvv0.zza(s1);
        }
        zzgvu0.zzg(((zzgvw)zzgvv0.zzal()));
        zzgxj zzgxj0 = zzgxk.zza();
        zzgxj0.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String s2 = zzcag0.zza;
        if(s2 != null) {
            zzgxj0.zza(s2);
        }
        long v = (long)GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if(v > 0L) {
            zzgxj0.zzb(v);
        }
        zzgvu0.zzf(((zzgxk)zzgxj0.zzal()));
        this.zzd = zzgvu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbxb
    public final zzbwy zza() {
        return this.zzi;
    }

    // 检测为 Lambda 实现
    final d zzb(Map map0) [...]

    static List zzc() {
        return zzbww.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzbxb
    public final void zzd(String s, Map map0, int v) {
        synchronized(this.zzj) {
            if(v == 3) {
                this.zzm = true;
            }
            if(this.zze.containsKey(s)) {
                if(v == 3) {
                    ((zzgxh)this.zze.get(s)).zze(4);
                }
                return;
            }
            zzgxh zzgxh0 = zzgxi.zzc();
            int v2 = zzgxg.zza(v);
            if(v2 != 0) {
                zzgxh0.zze(v2);
            }
            zzgxh0.zzb(this.zze.size());
            zzgxh0.zzd(s);
            zzgwh zzgwh0 = zzgwk.zza();
            if(!this.zzk.isEmpty() && map0 != null) {
                for(Object object1: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object1;
                    String s1 = map$Entry0.getKey() == null ? "" : ((String)map$Entry0.getKey());
                    String s2 = map$Entry0.getValue() == null ? "" : ((String)map$Entry0.getValue());
                    if(this.zzk.contains(s1.toLowerCase(Locale.ENGLISH))) {
                        zzgwf zzgwf0 = zzgwg.zza();
                        zzgwf0.zza(zzgqi.zzw(s1));
                        zzgwf0.zzb(zzgqi.zzw(s2));
                        zzgwh0.zza(((zzgwg)zzgwf0.zzal()));
                    }
                }
            }
            zzgxh0.zzc(((zzgwk)zzgwh0.zzal()));
            this.zze.put(s, zzgxh0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxb
    public final void zze() {
        synchronized(this.zzj) {
            this.zze.keySet();
            d d0 = zzfye.zzn(zzfye.zzh(Collections.emptyMap()), (Map map0) -> {
                zzgxh zzgxh0;
                Object object5;
                int v2;
                Object object4;
                JSONArray jSONArray0;
                String s;
                try {
                    if(map0 == null) {
                        goto label_3;
                    }
                    Iterator iterator0 = map0.keySet().iterator();
                    while(true) {
                    label_2:
                        if(!iterator0.hasNext()) {
                        label_3:
                            if(this.zza) {
                                synchronized(this.zzj) {
                                    this.zzd.zzn(10);
                                }
                            }
                            if(this.zza && this.zzi.zzg || this.zzm && this.zzi.zzf || !this.zza && this.zzi.zzd) {
                                synchronized(this.zzj) {
                                    for(Object object1: this.zze.values()) {
                                        zzgxi zzgxi0 = (zzgxi)((zzgxh)object1).zzal();
                                        this.zzd.zzc(zzgxi0);
                                    }
                                    this.zzd.zza(this.zzf);
                                    this.zzd.zzb(this.zzg);
                                    if(zzbxa.zzb()) {
                                        StringBuilder stringBuilder0 = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                                        for(Object object2: this.zzd.zzm()) {
                                            stringBuilder0.append("    [");
                                            stringBuilder0.append(((zzgxi)object2).zza());
                                            stringBuilder0.append("] ");
                                            stringBuilder0.append("");
                                        }
                                        zzbxa.zza(stringBuilder0.toString());
                                    }
                                    byte[] arr_b = ((zzgxp)this.zzd.zzal()).zzax();
                                    d d0 = new zzbo(this.zzh).zzb(1, this.zzi.zzb, null, arr_b);
                                    if(zzbxa.zzb()) {
                                        d0.addListener(() -> zzbxa.zza("Pinged SB successfully."), zzcan.zza);
                                    }
                                    return zzfye.zzm(d0, zzbws.zza, zzcan.zzf);
                                }
                            }
                            return zzfye.zzh(null);
                        }
                        Object object3 = iterator0.next();
                        s = (String)object3;
                        jSONArray0 = new JSONObject(((String)map0.get(s))).optJSONArray("matches");
                        if(jSONArray0 != null) {
                            object4 = this.zzj;
                            __monitor_enter(object4);
                            v2 = FIN.finallyOpen$NT();
                            int v3 = jSONArray0.length();
                            object5 = this.zzj;
                            __monitor_enter(object5);
                            break;
                        }
                    }
                }
                catch(JSONException jSONException0) {
                    goto label_78;
                }
                try {
                    zzgxh0 = (zzgxh)this.zze.get(s);
                    goto label_59;
                }
                catch(Throwable throwable0) {
                    try {
                        __monitor_exit(object5);
                        FIN.finallyExec$NT(v2);
                        throw throwable0;
                    label_59:
                        __monitor_exit(object5);
                        if(zzgxh0 == null) {
                            zzbxa.zza(("Cannot find the corresponding resource object for " + s));
                        }
                        else {
                            boolean z = false;
                            for(int v4 = 0; v4 < v3; ++v4) {
                                zzgxh0.zza(jSONArray0.getJSONObject(v4).getString("threat_type"));
                            }
                            boolean z1 = this.zza;
                            if(v3 > 0) {
                                z = true;
                            }
                            this.zza = z | z1;
                        }
                        FIN.finallyCodeBegin$NT(v2);
                        __monitor_exit(object4);
                        FIN.finallyCodeEnd$NT(v2);
                        goto label_2;
                    }
                    catch(JSONException jSONException0) {
                    }
                }
            label_78:
                if(((Boolean)zzbdr.zzb.zze()).booleanValue()) {
                    zzcaa.zzf("Failed to get SafeBrowsing metadata", jSONException0);
                }
                return zzfye.zzg(new Exception("Safebrowsing report transmission failed."));
            }, zzcan.zzf);
            d d1 = zzfye.zzo(d0, 10L, TimeUnit.SECONDS, zzcan.zzd);
            zzfye.zzr(d0, new zzbwv(this, d1), zzcan.zzf);
            zzbww.zzc.add(d1);
        }
    }

    // 检测为 Lambda 实现
    final void zzf(Bitmap bitmap0) [...]

    @Override  // com.google.android.gms.internal.ads.zzbxb
    public final void zzg(View view0) {
        Bitmap bitmap2;
        boolean z;
        Bitmap bitmap0 = null;
        if(!this.zzi.zzc) {
            return;
        }
        if(this.zzl) {
            return;
        }
        if(view0 != null) {
            try {
                z = view0.isDrawingCacheEnabled();
                view0.setDrawingCacheEnabled(true);
                Bitmap bitmap1 = view0.getDrawingCache();
                bitmap2 = bitmap1 == null ? null : Bitmap.createBitmap(bitmap1);
            }
            catch(RuntimeException runtimeException0) {
                bitmap2 = null;
                goto label_20;
            }
            try {
                view0.setDrawingCacheEnabled(z);
                goto label_21;
            }
            catch(RuntimeException runtimeException0) {
            }
        label_20:
            zzcaa.zzh("Fail to capture the web view", runtimeException0);
        label_21:
            if(bitmap2 == null) {
                try {
                    int v = view0.getWidth();
                    int v1 = view0.getHeight();
                    if(v == 0 || v1 == 0) {
                        zzcaa.zzj("Width or height of view is zero");
                    }
                    else {
                        Bitmap bitmap3 = Bitmap.createBitmap(view0.getWidth(), view0.getHeight(), Bitmap.Config.RGB_565);
                        Canvas canvas0 = new Canvas(bitmap3);
                        view0.layout(0, 0, v, v1);
                        view0.draw(canvas0);
                        bitmap0 = bitmap3;
                    }
                    goto label_37;
                }
                catch(RuntimeException runtimeException1) {
                }
                zzcaa.zzh("Fail to capture the webview", runtimeException1);
            }
            else {
                bitmap0 = bitmap2;
            }
        }
    label_37:
        if(bitmap0 == null) {
            zzbxa.zza("Failed to capture the webview bitmap.");
            return;
        }
        this.zzl = true;
        zzbwu zzbwu0 = () -> {
            zzgqf zzgqf0 = zzgqi.zzt();
            bitmap0.compress(Bitmap.CompressFormat.PNG, 0, zzgqf0);
            synchronized(this.zzj) {
                zzgxa zzgxa0 = zzgxc.zza();
                zzgxa0.zza(zzgqf0.zzb());
                zzgxa0.zzb("image/png");
                zzgxa0.zzc(2);
                zzgxc zzgxc0 = (zzgxc)zzgxa0.zzal();
                this.zzd.zzi(zzgxc0);
            }
        };
        if(Looper.getMainLooper().getThread() != Thread.currentThread()) {
            zzbwu0.run();
            return;
        }
        zzcan.zza.execute(zzbwu0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxb
    public final void zzh(String s) {
        synchronized(this.zzj) {
            if(s == null) {
                this.zzd.zzd();
            }
            else {
                this.zzd.zze(s);
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbxb
    public final boolean zzi() {
        return this.zzi.zzc && !this.zzl;
    }
}

