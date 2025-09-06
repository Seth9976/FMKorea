package com.google.android.gms.internal.measurement;

public final class zzng implements zznh {
    private static final zzgn zza;
    private static final zzgn zzaa;
    private static final zzgn zzab;
    private static final zzgn zzac;
    private static final zzgn zzad;
    private static final zzgn zzae;
    private static final zzgn zzaf;
    private static final zzgn zzag;
    private static final zzgn zzah;
    private static final zzgn zzai;
    private static final zzgn zzaj;
    private static final zzgn zzak;
    private static final zzgn zzal;
    private static final zzgn zzam;
    private static final zzgn zzan;
    private static final zzgn zzao;
    private static final zzgn zzap;
    private static final zzgn zzaq;
    private static final zzgn zzar;
    private static final zzgn zzas;
    private static final zzgn zzat;
    private static final zzgn zzau;
    private static final zzgn zzav;
    private static final zzgn zzaw;
    private static final zzgn zzax;
    private static final zzgn zzb;
    private static final zzgn zzc;
    private static final zzgn zzd;
    private static final zzgn zze;
    private static final zzgn zzf;
    private static final zzgn zzg;
    private static final zzgn zzh;
    private static final zzgn zzi;
    private static final zzgn zzj;
    private static final zzgn zzk;
    private static final zzgn zzl;
    private static final zzgn zzm;
    private static final zzgn zzn;
    private static final zzgn zzo;
    private static final zzgn zzp;
    private static final zzgn zzq;
    private static final zzgn zzr;
    private static final zzgn zzs;
    private static final zzgn zzt;
    private static final zzgn zzu;
    private static final zzgn zzv;
    private static final zzgn zzw;
    private static final zzgn zzx;
    private static final zzgn zzy;
    private static final zzgn zzz;

    static {
        zzgv zzgv0 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzng.zza = zzgv0.zza("measurement.ad_id_cache_time", 10000L);
        zzng.zzb = zzgv0.zza("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        zzng.zzc = zzgv0.zza("measurement.max_bundles_per_iteration", 100L);
        zzng.zzd = zzgv0.zza("measurement.config.cache_time", 86400000L);
        zzng.zze = zzgv0.zza("measurement.log_tag", "FA");
        zzng.zzf = zzgv0.zza("measurement.config.url_authority", "app-measurement.com");
        zzng.zzg = zzgv0.zza("measurement.config.url_scheme", "https");
        zzng.zzh = zzgv0.zza("measurement.upload.debug_upload_interval", 1000L);
        zzng.zzi = zzgv0.zza("measurement.rb.attribution.event_params", "value|currency");
        zzng.zzj = zzgv0.zza("measurement.lifetimevalue.max_currency_tracked", 4L);
        zzng.zzk = zzgv0.zza("measurement.upload.max_event_parameter_value_length", 100L);
        zzng.zzl = zzgv0.zza("measurement.store.max_stored_events_per_app", 100000L);
        zzng.zzm = zzgv0.zza("measurement.experiment.max_ids", 50L);
        zzng.zzn = zzgv0.zza("measurement.audience.filter_result_max_count", 200L);
        zzng.zzo = zzgv0.zza("measurement.upload.max_item_scoped_custom_parameters", 27L);
        zzng.zzp = zzgv0.zza("measurement.rb.attribution.client.min_ad_services_version", 7L);
        zzng.zzq = zzgv0.zza("measurement.alarm_manager.minimum_interval", 60000L);
        zzng.zzr = zzgv0.zza("measurement.upload.minimum_delay", 500L);
        zzng.zzs = zzgv0.zza("measurement.monitoring.sample_period_millis", 86400000L);
        zzng.zzt = zzgv0.zza("measurement.rb.attribution.app_allowlist", "");
        zzng.zzu = zzgv0.zza("measurement.upload.realtime_upload_interval", 10000L);
        zzng.zzv = zzgv0.zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        zzng.zzw = zzgv0.zza("measurement.config.cache_time.service", 3600000L);
        zzng.zzx = zzgv0.zza("measurement.service_client.idle_disconnect_millis", 5000L);
        zzng.zzy = zzgv0.zza("measurement.log_tag.service", "FA-SVC");
        zzng.zzz = zzgv0.zza("measurement.upload.stale_data_deletion_interval", 86400000L);
        zzng.zzaa = zzgv0.zza("measurement.rb.attribution.uri_authority", "google-analytics.com");
        zzng.zzab = zzgv0.zza("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        zzng.zzac = zzgv0.zza("measurement.rb.attribution.query_parameters_to_remove", "");
        zzng.zzad = zzgv0.zza("measurement.rb.attribution.uri_scheme", "https");
        zzng.zzae = zzgv0.zza("measurement.sdk.attribution.cache.ttl", 604800000L);
        zzng.zzaf = zzgv0.zza("measurement.redaction.app_instance_id.ttl", 7200000L);
        zzng.zzag = zzgv0.zza("measurement.upload.backoff_period", 43200000L);
        zzng.zzah = zzgv0.zza("measurement.upload.initial_upload_delay_time", 15000L);
        zzng.zzai = zzgv0.zza("measurement.upload.interval", 3600000L);
        zzng.zzaj = zzgv0.zza("measurement.upload.max_bundle_size", 0x10000L);
        zzng.zzak = zzgv0.zza("measurement.upload.max_bundles", 100L);
        zzng.zzal = zzgv0.zza("measurement.upload.max_conversions_per_day", 500L);
        zzng.zzam = zzgv0.zza("measurement.upload.max_error_events_per_day", 1000L);
        zzng.zzan = zzgv0.zza("measurement.upload.max_events_per_bundle", 1000L);
        zzng.zzao = zzgv0.zza("measurement.upload.max_events_per_day", 100000L);
        zzng.zzap = zzgv0.zza("measurement.upload.max_public_events_per_day", 50000L);
        zzng.zzaq = zzgv0.zza("measurement.upload.max_queue_time", 2419200000L);
        zzng.zzar = zzgv0.zza("measurement.upload.max_realtime_events_per_day", 10L);
        zzng.zzas = zzgv0.zza("measurement.upload.max_batch_size", 0x10000L);
        zzng.zzat = zzgv0.zza("measurement.upload.retry_count", 6L);
        zzng.zzau = zzgv0.zza("measurement.upload.retry_time", 1800000L);
        zzng.zzav = zzgv0.zza("measurement.upload.url", "https://app-measurement.com/a");
        zzng.zzaw = zzgv0.zza("measurement.upload.window_interval", 3600000L);
        zzng.zzax = zzgv0.zza("measurement.rb.attribution.user_properties", "_npa,npa");
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zza() {
        return (long)(((Long)zzng.zza.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzaa() {
        return (long)(((Long)zzng.zzal.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzab() {
        return (long)(((Long)zzng.zzam.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzac() {
        return (long)(((Long)zzng.zzan.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzad() {
        return (long)(((Long)zzng.zzao.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzae() {
        return (long)(((Long)zzng.zzap.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzaf() {
        return (long)(((Long)zzng.zzaq.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzag() {
        return (long)(((Long)zzng.zzar.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzah() {
        return (long)(((Long)zzng.zzas.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzai() {
        return (long)(((Long)zzng.zzat.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzaj() {
        return (long)(((Long)zzng.zzau.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzak() {
        return (long)(((Long)zzng.zzaw.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final String zzal() {
        return (String)zzng.zzf.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final String zzam() {
        return (String)zzng.zzg.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final String zzan() {
        return (String)zzng.zzi.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final String zzao() {
        return (String)zzng.zzt.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final String zzap() {
        return (String)zzng.zzaa.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final String zzaq() {
        return (String)zzng.zzab.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final String zzar() {
        return (String)zzng.zzac.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final String zzas() {
        return (String)zzng.zzad.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final String zzat() {
        return (String)zzng.zzav.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final String zzau() {
        return (String)zzng.zzax.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzb() {
        return (long)(((Long)zzng.zzb.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzc() {
        return (long)(((Long)zzng.zzc.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzd() {
        return (long)(((Long)zzng.zzd.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zze() {
        return (long)(((Long)zzng.zzh.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzf() {
        return (long)(((Long)zzng.zzj.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzg() {
        return (long)(((Long)zzng.zzk.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzh() {
        return (long)(((Long)zzng.zzl.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzi() {
        return (long)(((Long)zzng.zzm.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzj() {
        return (long)(((Long)zzng.zzn.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzk() {
        return (long)(((Long)zzng.zzo.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzl() {
        return (long)(((Long)zzng.zzp.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzm() {
        return (long)(((Long)zzng.zzq.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzn() {
        return (long)(((Long)zzng.zzr.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzo() {
        return (long)(((Long)zzng.zzs.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzp() {
        return (long)(((Long)zzng.zzu.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzq() {
        return (long)(((Long)zzng.zzv.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzr() {
        return (long)(((Long)zzng.zzx.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzs() {
        return (long)(((Long)zzng.zzz.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzt() {
        return (long)(((Long)zzng.zzae.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzu() {
        return (long)(((Long)zzng.zzaf.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzv() {
        return (long)(((Long)zzng.zzag.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzw() {
        return (long)(((Long)zzng.zzah.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzx() {
        return (long)(((Long)zzng.zzai.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzy() {
        return (long)(((Long)zzng.zzaj.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final long zzz() {
        return (long)(((Long)zzng.zzak.zza()));
    }
}

