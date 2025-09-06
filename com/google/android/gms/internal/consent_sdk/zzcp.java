package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import java.util.HashMap;
import java.util.Map;

public final class zzcp {
    private final Context zza;
    private final Map zzb;

    public zzcp(Context context0) {
        this.zzb = new HashMap();
        this.zza = context0;
    }

    public final void zzb() {
        for(Object object0: this.zzb.values()) {
            ((SharedPreferences.Editor)object0).apply();
        }
    }

    public final boolean zzc(String s, Object object0) {
        zzco zzco0 = zzcq.zza(this.zza, s);
        if(zzco0 == null) {
            return false;
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzd(zzco0.zza);
        if(object0 instanceof Integer) {
            sharedPreferences$Editor0.putInt(zzco0.zzb, ((int)(((Integer)object0))));
            return true;
        }
        if(object0 instanceof Long) {
            sharedPreferences$Editor0.putLong(zzco0.zzb, ((long)(((Long)object0))));
            return true;
        }
        if(object0 instanceof Double) {
            sharedPreferences$Editor0.putFloat(zzco0.zzb, ((Double)object0).floatValue());
            return true;
        }
        if(object0 instanceof Float) {
            sharedPreferences$Editor0.putFloat(zzco0.zzb, ((float)(((Float)object0))));
            return true;
        }
        if(object0 instanceof Boolean) {
            sharedPreferences$Editor0.putBoolean(zzco0.zzb, ((Boolean)object0).booleanValue());
            return true;
        }
        if(object0 instanceof String) {
            sharedPreferences$Editor0.putString(zzco0.zzb, ((String)object0));
            return true;
        }
        return false;
    }

    private final SharedPreferences.Editor zzd(String s) {
        if(!this.zzb.containsKey(s)) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zza.getSharedPreferences(s, 0).edit();
            this.zzb.put(s, sharedPreferences$Editor0);
        }
        return (SharedPreferences.Editor)this.zzb.get(s);
    }
}

