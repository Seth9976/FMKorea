package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzdts implements zzcwl, zzcya, zzczd {
    private final zzdue zza;
    private final String zzb;
    private final String zzc;
    private int zzd;
    private zzdtr zze;
    private zzcwb zzf;
    private zze zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private JSONObject zzk;
    private boolean zzl;
    private boolean zzm;

    zzdts(zzdue zzdue0, zzfca zzfca0, String s) {
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        this.zza = zzdue0;
        this.zzc = s;
        this.zzb = zzfca0.zzf;
        this.zzd = 0;
        this.zze = zzdtr.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzcya
    public final void zza(zzcse zzcse0) {
        if(!this.zza.zzp()) {
            return;
        }
        this.zzf = zzcse0.zzl();
        this.zze = zzdtr.zzb;
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziX)).booleanValue()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(zze zze0) {
        if(!this.zza.zzp()) {
            return;
        }
        this.zze = zzdtr.zzc;
        this.zzg = zze0;
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziX)).booleanValue()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbun0) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zziX)).booleanValue() && this.zza.zzp()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbr0) {
        int v = 0;
        if(!this.zza.zzp()) {
            return;
        }
        if(!zzfbr0.zzb.zza.isEmpty()) {
            this.zzd = ((zzfbe)zzfbr0.zzb.zza.get(0)).zzb;
        }
        if(!TextUtils.isEmpty(zzfbr0.zzb.zzb.zzk)) {
            this.zzh = zzfbr0.zzb.zzb.zzk;
        }
        if(!TextUtils.isEmpty(zzfbr0.zzb.zzb.zzl)) {
            this.zzi = zzfbr0.zzb.zzb.zzl;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziT)).booleanValue() && this.zza.zzr()) {
            if(!TextUtils.isEmpty(zzfbr0.zzb.zzb.zzm)) {
                this.zzj = zzfbr0.zzb.zzb.zzm;
            }
            if(zzfbr0.zzb.zzb.zzn.length() > 0) {
                this.zzk = zzfbr0.zzb.zzb.zzn;
            }
            zzdue zzdue0 = this.zza;
            JSONObject jSONObject0 = this.zzk;
            if(jSONObject0 != null) {
                v = jSONObject0.toString().length();
            }
            if(!TextUtils.isEmpty(this.zzj)) {
                v += this.zzj.length();
            }
            zzdue0.zzj(((long)v));
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() {
        JSONObject jSONObject1;
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("state", this.zze);
        jSONObject0.put("format", zzfbe.zza(this.zzd));
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziX)).booleanValue()) {
            jSONObject0.put("isOutOfContext", this.zzl);
            if(this.zzl) {
                jSONObject0.put("shown", this.zzm);
            }
        }
        zzcwb zzcwb0 = this.zzf;
        if(zzcwb0 == null) {
            zze zze0 = this.zzg;
            JSONObject jSONObject2 = null;
            if(zze0 != null) {
                IBinder iBinder0 = zze0.zze;
                if(iBinder0 != null) {
                    jSONObject2 = this.zzi(((zzcwb)iBinder0));
                    if(((zzcwb)iBinder0).zzj().isEmpty()) {
                        JSONArray jSONArray0 = new JSONArray();
                        jSONArray0.put(zzdts.zzh(this.zzg));
                        jSONObject2.put("errors", jSONArray0);
                    }
                }
            }
            jSONObject1 = jSONObject2;
        }
        else {
            jSONObject1 = this.zzi(zzcwb0);
        }
        jSONObject0.put("responseInfo", jSONObject1);
        return jSONObject0;
    }

    public final void zze() {
        this.zzl = true;
    }

    public final void zzf() {
        this.zzm = true;
    }

    public final boolean zzg() {
        return this.zze != zzdtr.zza;
    }

    private static JSONObject zzh(zze zze0) {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("errorDomain", zze0.zzc);
        jSONObject0.put("errorCode", zze0.zza);
        jSONObject0.put("errorDescription", zze0.zzb);
        jSONObject0.put("underlyingError", (zze0.zzd == null ? null : zzdts.zzh(zze0.zzd)));
        return jSONObject0;
    }

    private final JSONObject zzi(zzcwb zzcwb0) {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("winningAdapterClassName", zzcwb0.zzg());
        jSONObject0.put("responseSecsSinceEpoch", zzcwb0.zzc());
        jSONObject0.put("responseId", zzcwb0.zzi());
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziQ)).booleanValue()) {
            String s = zzcwb0.zzd();
            if(!TextUtils.isEmpty(s)) {
                zzcaa.zze(("Bidding data: " + s));
                jSONObject0.put("biddingData", new JSONObject(s));
            }
        }
        if(!TextUtils.isEmpty(this.zzh)) {
            jSONObject0.put("adRequestUrl", this.zzh);
        }
        if(!TextUtils.isEmpty(this.zzi)) {
            jSONObject0.put("postBody", this.zzi);
        }
        if(!TextUtils.isEmpty(this.zzj)) {
            jSONObject0.put("adResponseBody", this.zzj);
        }
        JSONObject jSONObject1 = this.zzk;
        if(jSONObject1 != null) {
            jSONObject0.put("adResponseHeaders", jSONObject1);
        }
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: zzcwb0.zzj()) {
            zzu zzu0 = (zzu)object0;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzu0.zza);
            jSONObject2.put("latencyMillis", zzu0.zzb);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zziR)).booleanValue()) {
                jSONObject2.put("credentials", zzay.zzb().zzh(zzu0.zzd));
            }
            jSONObject2.put("error", (zzu0.zzc == null ? null : zzdts.zzh(zzu0.zzc)));
            jSONArray0.put(jSONObject2);
        }
        jSONObject0.put("adNetworks", jSONArray0);
        return jSONObject0;
    }
}

