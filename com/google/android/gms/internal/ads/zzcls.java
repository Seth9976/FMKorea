package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.util.zzas;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONObject;

public final class zzcls extends zzcn {
    private final Context zza;
    private final zzcag zzb;
    private final zzdpc zzc;
    private final zzedp zzd;
    private final zzejt zze;
    private final zzdtj zzf;
    private final zzbyf zzg;
    private final zzdph zzh;
    private final zzdue zzi;
    private final zzbed zzj;
    private final zzfhu zzk;
    private final zzfcu zzl;
    private final zzbbs zzm;
    private boolean zzn;

    zzcls(Context context0, zzcag zzcag0, zzdpc zzdpc0, zzedp zzedp0, zzejt zzejt0, zzdtj zzdtj0, zzbyf zzbyf0, zzdph zzdph0, zzdue zzdue0, zzbed zzbed0, zzfhu zzfhu0, zzfcu zzfcu0, zzbbs zzbbs0) {
        this.zza = context0;
        this.zzb = zzcag0;
        this.zzc = zzdpc0;
        this.zzd = zzedp0;
        this.zze = zzejt0;
        this.zzf = zzdtj0;
        this.zzg = zzbyf0;
        this.zzh = zzdph0;
        this.zzi = zzdue0;
        this.zzj = zzbed0;
        this.zzk = zzfhu0;
        this.zzl = zzfcu0;
        this.zzm = zzbbs0;
        this.zzn = false;
    }

    // 检测为 Lambda 实现
    final void zzb() [...]

    final void zzc(Runnable runnable0) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map map0 = zzt.zzo().zzh().zzh().zze();
        if(map0.isEmpty()) {
            return;
        }
        if(runnable0 != null) {
            try {
                runnable0.run();
            }
            catch(Throwable throwable0) {
                zzcaa.zzk("Could not initialize rewarded ads.", throwable0);
                return;
            }
        }
        if(!this.zzc.zzd()) {
            return;
        }
        HashMap hashMap0 = new HashMap();
        for(Object object0: map0.values()) {
            for(Object object1: ((zzboa)object0).zza) {
                String s = ((zzbnz)object1).zzk;
                for(Object object2: ((zzbnz)object1).zzc) {
                    String s1 = (String)object2;
                    if(!hashMap0.containsKey(s1)) {
                        hashMap0.put(s1, new ArrayList());
                    }
                    if(s != null) {
                        ((List)hashMap0.get(s1)).add(s);
                    }
                }
            }
            if(false) {
                break;
            }
        }
        JSONObject jSONObject0 = new JSONObject();
        for(Object object3: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object3;
            String s2 = (String)map$Entry0.getKey();
            try {
                zzedq zzedq0 = this.zzd.zza(s2, jSONObject0);
                if(zzedq0 == null) {
                    continue;
                }
                zzfcw zzfcw0 = (zzfcw)zzedq0.zzb;
                if(zzfcw0.zzC() || !zzfcw0.zzB()) {
                    continue;
                }
                List list0 = (List)map$Entry0.getValue();
                zzfcw0.zzj(this.zza, ((zzefk)zzedq0.zzc), list0);
                zzcaa.zze(("Initialized rewarded video mediation adapter " + s2));
            }
            catch(zzfcf zzfcf0) {
                zzcaa.zzk(("Failed to initialize rewarded video mediation adapter \"" + s2 + "\""), zzfcf0);
            }
        }
    }

    // 检测为 Lambda 实现
    final void zzd() [...]

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final float zze() {
        synchronized(this) {
            return zzt.zzr().zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return this.zzb.zza;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        return this.zzf.zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String s) {
        this.zze.zzg(s);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) {
        try {
            zzfoj.zzi(this.zza).zzn(z);
        }
        catch(IOException iOException0) {
            throw new RemoteException(iOException0.getMessage());
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() {
        synchronized(this) {
            if(this.zzn) {
                zzcaa.zzj("Mobile ads is initialized already.");
                return;
            }
            zzbbr.zza(this.zza);
            this.zzm.zza();
            zzt.zzo().zzs(this.zza, this.zzb);
            zzt.zzc().zzi(this.zza);
            this.zzn = true;
            this.zzf.zzr();
            this.zze.zze();
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzdO)).booleanValue()) {
                this.zzh.zzc();
            }
            this.zzi.zzg();
            if(((Boolean)zzba.zzc().zzb(zzbbr.zziO)).booleanValue()) {
                zzclo zzclo0 = () -> if(zzt.zzo().zzh().zzP()) {
                    String s = zzt.zzo().zzh().zzl();
                    if(!zzt.zzs().zzj(this.zza, s, this.zzb.zza)) {
                        zzt.zzo().zzh().zzB(false);
                        zzt.zzo().zzh().zzA("");
                    }
                };
                zzcan.zza.execute(zzclo0);
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzjQ)).booleanValue()) {
                zzcln zzcln0 = () -> {
                    zzbtk zzbtk0 = new zzbtk();
                    this.zzj.zza(zzbtk0);
                };
                zzcan.zza.execute(zzcln0);
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzcC)).booleanValue()) {
                zzclp zzclp0 = () -> zzfde.zzb(this.zza, true);
                zzcan.zza.execute(zzclp0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String s, IObjectWrapper iObjectWrapper0) {
        zzclq zzclq0;
        zzbbr.zza(this.zza);
        String s1 = ((Boolean)zzba.zzc().zzb(zzbbr.zzdS)).booleanValue() ? zzs.zzn(this.zza) : "";
        int v = 1;
        String s2 = TextUtils.isEmpty(s1) ? s : s1;
        if(TextUtils.isEmpty(s2)) {
            return;
        }
        boolean z = ((Boolean)zzba.zzc().zzb(zzbbr.zzdM)).booleanValue();
        boolean z1 = ((Boolean)zzba.zzc().zzb(zzbbr.zzaO)).booleanValue();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzaO)).booleanValue()) {
            zzclq0 = new zzclq(this, ((Runnable)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
        else {
            zzclq0 = null;
            v = z | z1;
        }
        if(v != 0) {
            zzt.zza().zza(this.zza, this.zzb, s2, zzclq0, this.zzk);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzda0) {
        this.zzi.zzh(zzda0, zzdud.zzb);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper0, String s) {
        if(iObjectWrapper0 == null) {
            zzcaa.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        if(context0 == null) {
            zzcaa.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzas zzas0 = new zzas(context0);
        zzas0.zzn(s);
        zzas0.zzo(this.zzb.zza);
        zzas0.zzr();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbof zzbof0) {
        this.zzl.zzf(zzbof0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z) {
        synchronized(this) {
            zzt.zzr().zzc(z);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f) {
        synchronized(this) {
            zzt.zzr().zzd(f);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String s) {
        synchronized(this) {
            zzbbr.zza(this.zza);
            if(!TextUtils.isEmpty(s) && ((Boolean)zzba.zzc().zzb(zzbbr.zzdM)).booleanValue()) {
                zzt.zza().zza(this.zza, this.zzb, s, null, this.zzk);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbkv zzbkv0) {
        this.zzf.zzs(zzbkv0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String s) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziZ)).booleanValue()) {
            zzt.zzo().zzw(s);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzff0) {
        this.zzg.zzq(this.zza, zzff0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() {
        synchronized(this) {
            return zzt.zzr().zze();
        }
    }

    // 检测为 Lambda 实现
    final void zzw() [...]
}

