package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zznw;

final class zzgd extends zzic {
    static final Pair zza;
    public zzgh zzb;
    public final zzgi zzc;
    public final zzgi zzd;
    public final zzgj zze;
    public final zzgi zzf;
    public final zzgg zzg;
    public final zzgj zzh;
    public final zzgf zzi;
    public final zzgg zzj;
    public final zzgi zzk;
    public final zzgi zzl;
    public boolean zzm;
    public zzgg zzn;
    public zzgg zzo;
    public zzgi zzp;
    public final zzgj zzq;
    public final zzgj zzr;
    public final zzgi zzs;
    public final zzgf zzt;
    private SharedPreferences zzv;
    private String zzw;
    private boolean zzx;
    private long zzy;

    static {
        zzgd.zza = new Pair("", 0L);
    }

    zzgd(zzhf zzhf0) {
        super(zzhf0);
        this.zzf = new zzgi(this, "session_timeout", 1800000L);
        this.zzg = new zzgg(this, "start_new_session", true);
        this.zzk = new zzgi(this, "last_pause_time", 0L);
        this.zzl = new zzgi(this, "session_id", 0L);
        this.zzh = new zzgj(this, "non_personalized_ads", null);
        this.zzi = new zzgf(this, "last_received_uri_timestamps_by_source", null);
        this.zzj = new zzgg(this, "allow_remote_dynamite", false);
        this.zzc = new zzgi(this, "first_open_time", 0L);
        this.zzd = new zzgi(this, "app_install_time", 0L);
        this.zze = new zzgj(this, "app_instance_id", null);
        this.zzn = new zzgg(this, "app_backgrounded", false);
        this.zzo = new zzgg(this, "deep_link_retrieval_complete", false);
        this.zzp = new zzgi(this, "deep_link_retrieval_attempts", 0L);
        this.zzq = new zzgj(this, "firebase_feature_rollouts", null);
        this.zzr = new zzgj(this, "deferred_attribution_cache", null);
        this.zzs = new zzgi(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzt = new zzgf(this, "default_event_parameters", null);
    }

    final Pair zza(String s) {
        this.zzt();
        if(zznw.zza() && this.zze().zza(zzbi.zzck) && !this.zzm().zza(zza.zza)) {
            return new Pair("", Boolean.FALSE);
        }
        long v = this.zzb().elapsedRealtime();
        if(this.zzw != null && v < this.zzy) {
            return new Pair(this.zzw, Boolean.valueOf(this.zzx));
        }
        this.zzy = v + this.zze().zzf(s);
        try {
            Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(this.zza());
            this.zzw = "";
            String s1 = advertisingIdClient$Info0.getId();
            if(s1 != null) {
                this.zzw = s1;
            }
            this.zzx = advertisingIdClient$Info0.isLimitAdTrackingEnabled();
            return new Pair(this.zzw, Boolean.valueOf(this.zzx));
        }
        catch(Exception exception0) {
        }
        this.zzj().zzc().zza("Unable to get advertising id", exception0);
        this.zzw = "";
        return new Pair("", Boolean.valueOf(this.zzx));
    }

    final void zza(Boolean boolean0) {
        this.zzt();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzc().edit();
        if(boolean0 == null) {
            sharedPreferences$Editor0.remove("measurement_enabled");
        }
        else {
            sharedPreferences$Editor0.putBoolean("measurement_enabled", boolean0.booleanValue());
        }
        sharedPreferences$Editor0.apply();
    }

    final void zza(boolean z) {
        this.zzt();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzc().edit();
        sharedPreferences$Editor0.putBoolean("use_service", z);
        sharedPreferences$Editor0.apply();
    }

    final boolean zza(int v) {
        return zzih.zza(v, this.zzc().getInt("consent_source", 100));
    }

    final boolean zza(long v) {
        return v - this.zzf.zza() > this.zzk.zza();
    }

    final boolean zza(zzay zzay0) {
        this.zzt();
        if(zzih.zza(zzay0.zza(), this.zzh().zza())) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzc().edit();
            sharedPreferences$Editor0.putString("dma_consent_settings", zzay0.zzf());
            sharedPreferences$Editor0.apply();
            return true;
        }
        return false;
    }

    final boolean zza(zzih zzih0) {
        this.zzt();
        int v = zzih0.zza();
        if(this.zza(v)) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzc().edit();
            sharedPreferences$Editor0.putString("consent_settings", zzih0.zze());
            sharedPreferences$Editor0.putInt("consent_source", v);
            sharedPreferences$Editor0.apply();
            return true;
        }
        return false;
    }

    final boolean zzaa() {
        return this.zzv == null ? false : this.zzv.contains("deferred_analytics_collection");
    }

    final void zzb(Boolean boolean0) {
        this.zzt();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzc().edit();
        if(boolean0 == null) {
            sharedPreferences$Editor0.remove("measurement_enabled_from_api");
        }
        else {
            sharedPreferences$Editor0.putBoolean("measurement_enabled_from_api", boolean0.booleanValue());
        }
        sharedPreferences$Editor0.apply();
    }

    final void zzb(String s) {
        this.zzt();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzc().edit();
        sharedPreferences$Editor0.putString("admob_app_id", s);
        sharedPreferences$Editor0.apply();
    }

    final void zzb(boolean z) {
        this.zzt();
        this.zzj().zzp().zza("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzc().edit();
        sharedPreferences$Editor0.putBoolean("deferred_analytics_collection", z);
        sharedPreferences$Editor0.apply();
    }

    protected final SharedPreferences zzc() {
        this.zzt();
        this.zzab();
        Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    final void zzc(String s) {
        this.zzt();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzc().edit();
        sharedPreferences$Editor0.putString("gmp_app_id", s);
        sharedPreferences$Editor0.apply();
    }

    final SparseArray zzg() {
        Bundle bundle0 = this.zzi.zza();
        if(bundle0 == null) {
            return new SparseArray();
        }
        int[] arr_v = bundle0.getIntArray("uriSources");
        long[] arr_v1 = bundle0.getLongArray("uriTimestamps");
        if(arr_v != null && arr_v1 != null) {
            if(arr_v.length != arr_v1.length) {
                this.zzj().zzg().zza("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray();
            }
            SparseArray sparseArray0 = new SparseArray();
            for(int v = 0; v < arr_v.length; ++v) {
                sparseArray0.put(arr_v[v], ((long)arr_v1[v]));
            }
            return sparseArray0;
        }
        return new SparseArray();
    }

    final zzay zzh() {
        this.zzt();
        return zzay.zza(this.zzc().getString("dma_consent_settings", null));
    }

    final zzih zzm() {
        this.zzt();
        return zzih.zza(this.zzc().getString("consent_settings", "G1"), this.zzc().getInt("consent_source", 100));
    }

    final Boolean zzn() {
        this.zzt();
        return this.zzc().contains("use_service") ? Boolean.valueOf(this.zzc().getBoolean("use_service", false)) : null;
    }

    @Override  // com.google.android.gms.measurement.internal.zzic
    protected final boolean zzo() {
        return true;
    }

    final Boolean zzp() {
        this.zzt();
        return this.zzc().contains("measurement_enabled_from_api") ? Boolean.valueOf(this.zzc().getBoolean("measurement_enabled_from_api", true)) : null;
    }

    final Boolean zzu() {
        this.zzt();
        return this.zzc().contains("measurement_enabled") ? Boolean.valueOf(this.zzc().getBoolean("measurement_enabled", true)) : null;
    }

    protected final String zzv() {
        this.zzt();
        String s = this.zzc().getString("previous_os_version", null);
        this.zzf().zzab();
        String s1 = Build.VERSION.RELEASE;
        if(!TextUtils.isEmpty(s1) && !s1.equals(s)) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzc().edit();
            sharedPreferences$Editor0.putString("previous_os_version", s1);
            sharedPreferences$Editor0.apply();
        }
        return s;
    }

    final String zzw() {
        this.zzt();
        return this.zzc().getString("admob_app_id", null);
    }

    final String zzx() {
        this.zzt();
        return this.zzc().getString("gmp_app_id", null);
    }

    final void zzy() {
        this.zzt();
        Boolean boolean0 = this.zzu();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzc().edit();
        sharedPreferences$Editor0.clear();
        sharedPreferences$Editor0.apply();
        if(boolean0 != null) {
            this.zza(boolean0);
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzic
    protected final void zzz() {
        SharedPreferences sharedPreferences0 = this.zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzv = sharedPreferences0;
        boolean z = sharedPreferences0.getBoolean("has_been_opened", false);
        this.zzm = z;
        if(!z) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzv.edit();
            sharedPreferences$Editor0.putBoolean("has_been_opened", true);
            sharedPreferences$Editor0.apply();
        }
        this.zzb = new zzgh(this, "health_monitor", Math.max(0L, ((long)(((Long)zzbi.zzc.zza(null))))), null);
    }
}

