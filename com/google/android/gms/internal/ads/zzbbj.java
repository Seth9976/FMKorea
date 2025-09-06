package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

public abstract class zzbbj {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    zzbbj(int v, String s, Object object0, zzbbi zzbbi0) {
        this.zza = v;
        this.zzb = s;
        this.zzc = object0;
        zzba.zza().zzd(this);
    }

    protected abstract Object zza(JSONObject arg1);

    public abstract Object zzb(Bundle arg1);

    protected abstract Object zzc(SharedPreferences arg1);

    public abstract void zzd(SharedPreferences.Editor arg1, Object arg2);

    public final int zze() {
        return this.zza;
    }

    public static zzbbj zzf(int v, String s, float f) {
        return new zzbbg(1, s, f);
    }

    public static zzbbj zzg(int v, String s, int v1) {
        return new zzbbe(1, s, v1);
    }

    public static zzbbj zzh(int v, String s, long v1) {
        return new zzbbf(1, s, v1);
    }

    public static zzbbj zzi(int v, String s, Boolean boolean0) {
        return new zzbbd(v, s, boolean0);
    }

    public static zzbbj zzj(int v, String s, String s1) {
        return new zzbbh(1, s, s1);
    }

    public static zzbbj zzk(int v, String s) {
        zzbbj zzbbj0 = zzbbj.zzj(1, "gads:sdk_core_constants:experiment_id", null);
        zzba.zza().zzc(zzbbj0);
        return zzbbj0;
    }

    public final Object zzl() {
        return zzba.zzc().zzb(this);
    }

    public final Object zzm() {
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}

