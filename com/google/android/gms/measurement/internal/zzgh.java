package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;

public final class zzgh {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzgd zze;

    private zzgh(zzgd zzgd0, String s, long v) {
        this.zze = zzgd0;
        super();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkArgument(v > 0L);
        this.zza = s + ":start";
        this.zzb = s + ":count";
        this.zzc = s + ":value";
        this.zzd = v;
    }

    zzgh(zzgd zzgd0, String s, long v, zzgk zzgk0) {
        this(zzgd0, s, v);
    }

    public final Pair zza() {
        long v1;
        this.zze.zzt();
        this.zze.zzt();
        long v = this.zzb();
        if(v == 0L) {
            this.zzc();
            v1 = 0L;
        }
        else {
            v1 = Math.abs(v - this.zze.zzb().currentTimeMillis());
        }
        long v2 = this.zzd;
        if(Long.compare(v1, v2) < 0) {
            return null;
        }
        if(v1 > v2 << 1) {
            this.zzc();
            return null;
        }
        String s = this.zze.zzc().getString(this.zzc, null);
        long v3 = this.zze.zzc().getLong(this.zzb, 0L);
        this.zzc();
        return s == null || v3 <= 0L ? zzgd.zza : new Pair(s, v3);
    }

    public final void zza(String s, long v) {
        this.zze.zzt();
        if(this.zzb() == 0L) {
            this.zzc();
        }
        if(s == null) {
            s = "";
        }
        long v1 = this.zze.zzc().getLong(this.zzb, 0L);
        if(Long.compare(v1, 0L) <= 0) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zze.zzc().edit();
            sharedPreferences$Editor0.putString(this.zzc, s);
            sharedPreferences$Editor0.putLong(this.zzb, 1L);
            sharedPreferences$Editor0.apply();
            return;
        }
        boolean z = (this.zze.zzq().zzv().nextLong() & 0x7FFFFFFFFFFFFFFFL) < 0x7FFFFFFFFFFFFFFFL / (v1 + 1L);
        SharedPreferences.Editor sharedPreferences$Editor1 = this.zze.zzc().edit();
        if(z) {
            sharedPreferences$Editor1.putString(this.zzc, s);
        }
        sharedPreferences$Editor1.putLong(this.zzb, v1 + 1L);
        sharedPreferences$Editor1.apply();
    }

    private final long zzb() {
        return this.zze.zzc().getLong(this.zza, 0L);
    }

    private final void zzc() {
        this.zze.zzt();
        long v = this.zze.zzb().currentTimeMillis();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zze.zzc().edit();
        sharedPreferences$Editor0.remove(this.zzb);
        sharedPreferences$Editor0.remove(this.zzc);
        sharedPreferences$Editor0.putLong(this.zza, v);
        sharedPreferences$Editor0.apply();
    }
}

