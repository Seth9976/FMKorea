package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdtj {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private final long zzd;
    private final zzcas zze;
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdpc zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdrq zzl;
    private final zzcag zzm;
    private final Map zzn;
    private final zzdcz zzo;
    private final zzfhu zzp;
    private boolean zzq;

    public zzdtj(Executor executor0, Context context0, WeakReference weakReference0, Executor executor1, zzdpc zzdpc0, ScheduledExecutorService scheduledExecutorService0, zzdrq zzdrq0, zzcag zzcag0, zzdcz zzdcz0, zzfhu zzfhu0) {
        this.zza = false;
        this.zzb = false;
        this.zzc = false;
        this.zze = new zzcas();
        this.zzn = new ConcurrentHashMap();
        this.zzq = true;
        this.zzh = zzdpc0;
        this.zzf = context0;
        this.zzg = weakReference0;
        this.zzi = executor1;
        this.zzk = scheduledExecutorService0;
        this.zzj = executor0;
        this.zzl = zzdrq0;
        this.zzm = zzcag0;
        this.zzo = zzdcz0;
        this.zzp = zzfhu0;
        this.zzd = zzt.zzB().elapsedRealtime();
        this.zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static long zza(zzdtj zzdtj0) {
        return zzdtj0.zzd;
    }

    static zzcas zzb(zzdtj zzdtj0) {
        return zzdtj0.zze;
    }

    static zzdcz zzc(zzdtj zzdtj0) {
        return zzdtj0.zzo;
    }

    static zzdrq zzd(zzdtj zzdtj0) {
        return zzdtj0.zzl;
    }

    static zzfhu zze(zzdtj zzdtj0) {
        return zzdtj0.zzp;
    }

    final Object zzf(zzfhg zzfhg0) {
        this.zze.zzc(Boolean.TRUE);
        zzfhg0.zzf(true);
        zzfhk zzfhk0 = zzfhg0.zzl();
        this.zzp.zzb(zzfhk0);
        return null;
    }

    public final List zzg() {
        List list0 = new ArrayList();
        for(Object object0: this.zzn.keySet()) {
            zzbko zzbko0 = (zzbko)this.zzn.get(((String)object0));
            list0.add(new zzbko(((String)object0), zzbko0.zzb, zzbko0.zzc, zzbko0.zzd));
        }
        return list0;
    }

    static Executor zzh(zzdtj zzdtj0) {
        return zzdtj0.zzi;
    }

    static void zzi(zzdtj zzdtj0, boolean z) {
        zzdtj0.zzc = true;
    }

    static void zzj(zzdtj zzdtj0, String s) {
        zzfhg zzfhg0 = zzfhf.zza(zzdtj0.zzf, 5);
        zzfhg0.zzh();
        try {
            ArrayList arrayList0 = new ArrayList();
            JSONObject jSONObject0 = new JSONObject(s).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator iterator0 = jSONObject0.keys();
            while(true) {
                if(!iterator0.hasNext()) {
                    zzfye.zza(arrayList0).zza(new zzdtb(zzdtj0, zzfhg0), zzdtj0.zzi);
                    return;
                }
                Object object0 = iterator0.next();
                String s1 = (String)object0;
                zzfhg zzfhg1 = zzfhf.zza(zzdtj0.zzf, 5);
                zzfhg1.zzh();
                zzfhg1.zzd(s1);
                Object object1 = new Object();
                zzcas zzcas0 = new zzcas();
                d d0 = zzfye.zzo(zzcas0, ((long)(((Long)zzba.zzc().zzb(zzbbr.zzbL)))), TimeUnit.SECONDS, zzdtj0.zzk);
                zzdtj0.zzl.zzc(s1);
                zzdtj0.zzo.zzc(s1);
                long v = zzt.zzB().elapsedRealtime();
                d0.addListener(() -> synchronized(object1) {
                    if(!zzcas0.isDone()) {
                        zzdtj0.zzv(s1, false, "Timeout.", ((int)(zzt.zzB().elapsedRealtime() - v)));
                        zzdtj0.zzl.zzb(s1, "timeout");
                        zzdtj0.zzo.zzb(s1, "timeout");
                        zzfhg1.zzc("Timeout");
                        zzfhg1.zzf(false);
                        zzfhk zzfhk0 = zzfhg1.zzl();
                        zzdtj0.zzp.zzb(zzfhk0);
                        zzcas0.zzc(Boolean.FALSE);
                    }
                }, zzdtj0.zzi);
                arrayList0.add(d0);
                zzdti zzdti0 = new zzdti(zzdtj0, object1, s1, v, zzfhg1, zzcas0);
                JSONObject jSONObject1 = jSONObject0.optJSONObject(s1);
                ArrayList arrayList1 = new ArrayList();
                if(jSONObject1 != null) {
                    try {
                        JSONArray jSONArray0 = jSONObject1.getJSONArray("data");
                        for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                            JSONObject jSONObject2 = jSONArray0.getJSONObject(v1);
                            String s2 = jSONObject2.optString("format", "");
                            JSONObject jSONObject3 = jSONObject2.optJSONObject("data");
                            Bundle bundle0 = new Bundle();
                            if(jSONObject3 != null) {
                                Iterator iterator1 = jSONObject3.keys();
                                while(iterator1.hasNext()) {
                                    Object object2 = iterator1.next();
                                    bundle0.putString(((String)object2), jSONObject3.optString(((String)object2), ""));
                                }
                            }
                            arrayList1.add(new zzbky(s2, bundle0));
                        }
                    }
                    catch(JSONException unused_ex) {
                    }
                }
                zzdtj0.zzv(s1, false, "", 0);
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    zzdte zzdte0 = () -> try {
                        Context context0 = (Context)zzdtj0.zzg.get();
                        if(context0 == null) {
                            context0 = zzdtj0.zzf;
                        }
                        zzdtj0.zzh.zzc(s1, jSONObject4).zzi(context0, zzdti0, arrayList1);
                    }
                    catch(zzfcf unused_ex) {
                        try {
                            zzdti0.zze("Failed to initialize adapter. " + s1 + " does not implement the initialize() method.");
                        }
                        catch(RemoteException remoteException0) {
                            zzcaa.zzh("", remoteException0);
                        }
                    };
                    zzdtj0.zzj.execute(zzdte0);
                }
                catch(zzfcf unused_ex) {
                    try {
                        zzdti0.zze("Failed to create Adapter.");
                    }
                    catch(RemoteException remoteException0) {
                        zzcaa.zzh("", remoteException0);
                    }
                }
            }
        }
        catch(JSONException jSONException0) {
            zze.zzb("Malformed CLD response", jSONException0);
            zzdtj0.zzo.zza("MalformedJson");
            zzdtj0.zzl.zza("MalformedJson");
            zzdtj0.zze.zzd(jSONException0);
            zzt.zzo().zzu(jSONException0, "AdapterInitializer.updateAdapterStatus");
            zzfhg0.zzg(jSONException0);
            zzfhg0.zzf(false);
            zzfhk zzfhk0 = zzfhg0.zzl();
            zzdtj0.zzp.zzb(zzfhk0);
        }
    }

    static void zzk(zzdtj zzdtj0, String s, boolean z, String s1, int v) {
        zzdtj0.zzv(s, z, s1, v);
    }

    public final void zzl() {
        this.zzq = false;
    }

    // 检测为 Lambda 实现
    final void zzm() [...]

    // 检测为 Lambda 实现
    final void zzn(zzfcw zzfcw0, zzbks zzbks0, List list0, String s) [...]

    // 检测为 Lambda 实现
    final void zzo(zzcas zzcas0) [...]

    // 检测为 Lambda 实现
    final void zzp() [...]

    // 检测为 Lambda 实现
    final void zzq(Object object0, zzcas zzcas0, String s, long v, zzfhg zzfhg0) [...]

    public final void zzr() {
        if(!((Boolean)zzbdp.zza.zze()).booleanValue() && this.zzm.zzc >= ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzbK)))) && this.zzq) {
            if(this.zza) {
                return;
            }
            synchronized(this) {
                if(this.zza) {
                    return;
                }
                this.zzl.zzf();
                this.zzo.zzf();
                zzdsz zzdsz0 = () -> {
                    this.zzl.zze();
                    this.zzo.zze();
                    this.zzb = true;
                };
                this.zze.addListener(zzdsz0, this.zzi);
                this.zza = true;
                d d0 = this.zzu();
                zzdtc zzdtc0 = () -> synchronized(this) {
                    if(this.zzc) {
                        return;
                    }
                    this.zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", ((int)(zzt.zzB().elapsedRealtime() - this.zzd)));
                    this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                    this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                    this.zze.zzd(new Exception());
                };
                long v1 = (long)(((Long)zzba.zzc().zzb(zzbbr.zzbM)));
                this.zzk.schedule(zzdtc0, v1, TimeUnit.SECONDS);
                zzfye.zzr(d0, new zzdth(this), this.zzi);
            }
            return;
        }
        if(!this.zza) {
            this.zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.zze.zzc(Boolean.FALSE);
            this.zza = true;
            this.zzb = true;
        }
    }

    public final void zzs(zzbkv zzbkv0) {
        zzdtd zzdtd0 = new zzdtd(this, zzbkv0);
        this.zze.addListener(zzdtd0, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }

    private final d zzu() {
        synchronized(this) {
            String s = zzt.zzo().zzh().zzh().zzc();
            if(!TextUtils.isEmpty(s)) {
                return zzfye.zzh(s);
            }
            d d1 = new zzcas();
            zzt.zzo().zzh().zzq(() -> {
                zzdsy zzdsy0 = new zzdsy(this, ((zzcas)d1));
                this.zzi.execute(zzdsy0);
            });
            return d1;
        }
    }

    private final void zzv(String s, boolean z, String s1, int v) {
        zzbko zzbko0 = new zzbko(s, z, v, s1);
        this.zzn.put(s, zzbko0);
    }
}

