package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfko implements zzfjp {
    private static final zzfko zza;
    private static final Handler zzb;
    private static Handler zzc;
    private static final Runnable zzd;
    private static final Runnable zze;
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private final List zzi;
    private final zzfjr zzj;
    private final zzfkh zzk;
    private final zzfki zzl;
    private long zzm;

    static {
        zzfko.zza = new zzfko();
        zzfko.zzb = new Handler(Looper.getMainLooper());
        zzfko.zzc = null;
        zzfko.zzd = () -> {
            zzfko.zzd().zzg = 0;
            zzfko.zzd().zzi.clear();
            zzfko.zzd().zzh = false;
            for(Object object0: zzfjh.zza().zzb()) {
                zzfit zzfit0 = (zzfit)object0;
            }
            zzfko.zzd().zzm = System.nanoTime();
            zzfko.zzd().zzk.zzi();
            long v = System.nanoTime();
            zzfjq zzfjq0 = zzfko.zzd().zzj.zza();
            if(zzfko.zzd().zzk.zze().size() > 0) {
                for(Object object1: zzfko.zzd().zzk.zze()) {
                    String s = (String)object1;
                    JSONObject jSONObject0 = zzfjq0.zza(null);
                    View view0 = zzfko.zzd().zzk.zza(s);
                    zzfjq zzfjq1 = zzfko.zzd().zzj.zzb();
                    String s1 = zzfko.zzd().zzk.zzc(s);
                    if(s1 != null) {
                        JSONObject jSONObject1 = zzfjq1.zza(view0);
                        zzfjz.zzb(jSONObject1, s);
                        try {
                            jSONObject1.put("notVisibleReason", s1);
                        }
                        catch(JSONException jSONException0) {
                            zzfka.zza("Error with setting not visible reason", jSONException0);
                        }
                        zzfjz.zzc(jSONObject0, jSONObject1);
                    }
                    zzfjz.zzf(jSONObject0);
                    HashSet hashSet0 = new HashSet();
                    hashSet0.add(s);
                    zzfko.zzd().zzl.zzc(jSONObject0, hashSet0, v);
                }
            }
            if(zzfko.zzd().zzk.zzf().size() > 0) {
                JSONObject jSONObject2 = zzfjq0.zza(null);
                zzfko.zzd().zzk(null, zzfjq0, jSONObject2, 1, false);
                zzfjz.zzf(jSONObject2);
                zzfko.zzd().zzl.zzd(jSONObject2, zzfko.zzd().zzk.zzf(), v);
            }
            else {
                zzfko.zzd().zzl.zzb();
            }
            zzfko.zzd().zzk.zzg();
            long v1 = System.nanoTime() - zzfko.zzd().zzm;
            if(zzfko.zzd().zzf.size() > 0) {
                for(Object object2: zzfko.zzd().zzf) {
                    zzfkn zzfkn0 = (zzfkn)object2;
                    TimeUnit.NANOSECONDS.toMillis(v1);
                    zzfkn0.zzb();
                    if(zzfkn0 instanceof zzfkm) {
                        ((zzfkm)zzfkn0).zza();
                    }
                }
            }
        };
        zzfko.zze = new zzfkl();
    }

    zzfko() {
        this.zzf = new ArrayList();
        this.zzh = false;
        this.zzi = new ArrayList();
        this.zzk = new zzfkh();
        this.zzj = new zzfjr();
        this.zzl = new zzfki(new zzfkr());
    }

    @Override  // com.google.android.gms.internal.ads.zzfjp
    public final void zza(View view0, zzfjq zzfjq0, JSONObject jSONObject0, boolean z) {
        boolean z1;
        if(zzfkf.zzb(view0) == null) {
            int v = this.zzk.zzk(view0);
            if(v == 3) {
                return;
            }
            JSONObject jSONObject1 = zzfjq0.zza(view0);
            zzfjz.zzc(jSONObject0, jSONObject1);
            String s = this.zzk.zzd(view0);
            if(s == null) {
                zzfkg zzfkg0 = this.zzk.zzb(view0);
                if(zzfkg0 == null) {
                    z1 = false;
                }
                else {
                    zzfjk zzfjk0 = zzfkg0.zza();
                    JSONArray jSONArray0 = new JSONArray();
                    ArrayList arrayList0 = zzfkg0.zzb();
                    int v1 = arrayList0.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        jSONArray0.put(((String)arrayList0.get(v2)));
                    }
                    try {
                        jSONObject1.put("isFriendlyObstructionFor", jSONArray0);
                        jSONObject1.put("friendlyObstructionClass", zzfjk0.zzd());
                        jSONObject1.put("friendlyObstructionPurpose", zzfjk0.zza());
                        jSONObject1.put("friendlyObstructionReason", zzfjk0.zzc());
                    }
                    catch(JSONException jSONException1) {
                        zzfka.zza("Error with setting friendly obstruction", jSONException1);
                    }
                    z1 = true;
                }
                this.zzk(view0, zzfjq0, jSONObject1, v, z || z1);
            }
            else {
                zzfjz.zzb(jSONObject1, s);
                Boolean boolean0 = Boolean.valueOf(this.zzk.zzj(view0));
                try {
                    jSONObject1.put("hasWindowFocus", boolean0);
                }
                catch(JSONException jSONException0) {
                    zzfka.zza("Error with setting has window focus", jSONException0);
                }
                this.zzk.zzh();
            }
            ++this.zzg;
        }
    }

    static Handler zzb() {
        return zzfko.zzc;
    }

    static zzfki zzc(zzfko zzfko0) {
        return zzfko0.zzl;
    }

    public static zzfko zzd() {
        return zzfko.zza;
    }

    static Runnable zze() {
        return zzfko.zze;
    }

    static Runnable zzf() {
        return zzfko.zzd;
    }

    // 检测为 Lambda 实现
    static void zzg(zzfko zzfko0) [...]

    public final void zzh() {
        zzfko.zzl();
    }

    public final void zzi() {
        if(zzfko.zzc == null) {
            Handler handler0 = new Handler(Looper.getMainLooper());
            zzfko.zzc = handler0;
            handler0.post(zzfko.zzd);
            zzfko.zzc.postDelayed(zzfko.zze, 200L);
        }
    }

    public final void zzj() {
        zzfko.zzl();
        this.zzf.clear();
        zzfkj zzfkj0 = new zzfkj(this);
        zzfko.zzb.post(zzfkj0);
    }

    private final void zzk(View view0, zzfjq zzfjq0, JSONObject jSONObject0, int v, boolean z) {
        zzfjq0.zzb(view0, jSONObject0, this, v == 1, z);
    }

    private static final void zzl() {
        Handler handler0 = zzfko.zzc;
        if(handler0 != null) {
            handler0.removeCallbacks(zzfko.zze);
            zzfko.zzc = null;
        }
    }
}

