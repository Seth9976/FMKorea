package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzejw extends zzbqe {
    private final String zza;
    private final zzbqc zzb;
    private final zzcas zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzejw(String s, zzbqc zzbqc0, zzcas zzcas0, long v) {
        JSONObject jSONObject0 = new JSONObject();
        this.zzd = jSONObject0;
        this.zzf = false;
        this.zzc = zzcas0;
        this.zza = s;
        this.zzb = zzbqc0;
        this.zze = v;
        try {
            jSONObject0.put("adapter_version", zzbqc0.zzf().toString());
            jSONObject0.put("sdk_version", zzbqc0.zzg().toString());
            jSONObject0.put("name", s);
        }
        catch(JSONException | NullPointerException | RemoteException unused_ex) {
        }
    }

    public static void zzb(String s, zzcas zzcas0) {
        synchronized(zzejw.class) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("name", s);
                jSONObject0.put("signal_error", "Adapter failed to instantiate");
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzbx)).booleanValue()) {
                    jSONObject0.put("signal_error_code", 1);
                }
                zzcas0.zzc(jSONObject0);
            }
            catch(JSONException unused_ex) {
            }
        }
    }

    public final void zzc() {
        synchronized(this) {
            this.zzh("Signal collection timeout.", 3);
        }
    }

    public final void zzd() {
        synchronized(this) {
            if(this.zzf) {
                return;
            }
            try {
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzbx)).booleanValue()) {
                    this.zzd.put("signal_error_code", 0);
                }
            }
            catch(JSONException unused_ex) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbqf
    public final void zze(String s) {
        __monitor_enter(this);
        if(this.zzf) {
            __monitor_exit(this);
            return;
        }
        if(s == null) {
            try {
                this.zzf("Adapter returned null signals");
            }
            catch(Throwable throwable0) {
                __monitor_exit(this);
                throw throwable0;
            }
            __monitor_exit(this);
            return;
        }
        try {
            try {
                this.zzd.put("signals", s);
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzby)).booleanValue()) {
                    long v = zzt.zzB().elapsedRealtime();
                    this.zzd.put("latency", v - this.zze);
                }
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzbx)).booleanValue()) {
                    this.zzd.put("signal_error_code", 0);
                }
            }
            catch(JSONException unused_ex) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        }
        catch(Throwable throwable0) {
            __monitor_exit(this);
            throw throwable0;
        }
        __monitor_exit(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqf
    public final void zzf(String s) {
        synchronized(this) {
            this.zzh(s, 2);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbqf
    public final void zzg(zze zze0) {
        synchronized(this) {
            this.zzh(zze0.zzb, 2);
        }
    }

    private final void zzh(String s, int v) {
        synchronized(this) {
            if(this.zzf) {
                return;
            }
            try {
                this.zzd.put("signal_error", s);
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzby)).booleanValue()) {
                    long v2 = zzt.zzB().elapsedRealtime();
                    this.zzd.put("latency", v2 - this.zze);
                }
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzbx)).booleanValue()) {
                    this.zzd.put("signal_error_code", v);
                }
            }
            catch(JSONException unused_ex) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        }
    }
}

