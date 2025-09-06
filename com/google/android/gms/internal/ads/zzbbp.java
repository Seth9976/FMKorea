package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import jeb.synthetic.FIN;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbbp implements SharedPreferences.OnSharedPreferenceChangeListener {
    volatile boolean zza;
    private final Object zzb;
    private final ConditionVariable zzc;
    private volatile boolean zzd;
    private SharedPreferences zze;
    private Bundle zzf;
    private Context zzg;
    private JSONObject zzh;

    public zzbbp() {
        this.zzb = new Object();
        this.zzc = new ConditionVariable();
        this.zzd = false;
        this.zza = false;
        this.zze = null;
        this.zzf = new Bundle();
        this.zzh = new JSONObject();
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        if("flag_configuration".equals(s)) {
            this.zzf();
        }
    }

    static SharedPreferences zza(zzbbp zzbbp0) {
        return zzbbp0.zze;
    }

    public final Object zzb(zzbbj zzbbj0) {
        if(!this.zzc.block(5000L)) {
            Object object0 = this.zzb;
            synchronized(object0) {
                if(this.zza) {
                    goto label_11;
                }
            }
            throw new IllegalStateException("Flags.initialize() was not called!");
        }
    label_11:
        if(!this.zzd || this.zze == null) {
            synchronized(this.zzb) {
                if(this.zzd && this.zze != null) {
                    goto label_19;
                }
            }
            return zzbbj0.zzm();
        }
    label_19:
        switch(zzbbj0.zze()) {
            case 1: {
                return this.zzh.has(zzbbj0.zzn()) ? zzbbj0.zza(this.zzh) : zzbbw.zza(() -> zzbbj0.zzc(this.zze));
            }
            case 2: {
                return this.zzf == null ? zzbbj0.zzm() : zzbbj0.zzb(this.zzf);
            }
            default: {
                return zzbbw.zza(() -> zzbbj0.zzc(this.zze));
            }
        }
    }

    // 检测为 Lambda 实现
    final Object zzc(zzbbj zzbbj0) [...]

    // 检测为 Lambda 实现
    final String zzd() [...]

    public final void zze(Context context0) {
        if(this.zzd) {
            return;
        }
        Object object0 = this.zzb;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(this.zzd) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        if(!this.zza) {
            this.zza = true;
        }
        Context context1 = context0.getApplicationContext() == null ? context0 : context0.getApplicationContext();
        try {
            this.zzg = context1;
            this.zzf = Wrappers.packageManager(context1).getApplicationInfo("com.fmkorea.m.fmk", 0x80).metaData;
        }
        catch(PackageManager.NameNotFoundException | NullPointerException unused_ex) {
        }
        try {
            Context context2 = GooglePlayServicesUtilLight.getRemoteContext(context0);
            if(context2 == null) {
                context2 = context0.getApplicationContext();
                if(context2 != null) {
                    context0 = context2;
                }
            }
            else {
                context0 = context2;
            }
            if(context0 == null) {
                return;
            }
            SharedPreferences sharedPreferences0 = zzbbl.zza(context0);
            this.zze = sharedPreferences0;
            if(sharedPreferences0 != null) {
                sharedPreferences0.registerOnSharedPreferenceChangeListener(this);
            }
            zzbeb.zzc(new zzbbo(this));
            this.zzf();
            this.zzd = true;
        }
        finally {
            this.zza = false;
            this.zzc.open();
            FIN.finallyExec$NT(v);
        }
    }

    private final void zzf() {
        if(this.zze == null) {
            return;
        }
        try {
            this.zzh = new JSONObject(((String)zzbbw.zza(() -> this.zze.getString("flag_configuration", "{}"))));
        }
        catch(JSONException unused_ex) {
        }
    }
}

