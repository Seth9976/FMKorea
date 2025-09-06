package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcci {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final boolean zzm;
    public final long zzn;
    public final long zzo;

    public zzcci(String s) {
        String s1;
        JSONObject jSONObject0 = null;
        if(s != null) {
            try {
                jSONObject0 = new JSONObject(s);
            }
            catch(JSONException unused_ex) {
            }
        }
        this.zza = zzcci.zza(jSONObject0, "aggressive_media_codec_release", zzbbr.zzJ);
        this.zzb = zzcci.zzb(jSONObject0, "byte_buffer_precache_limit", zzbbr.zzl);
        this.zzc = zzcci.zzb(jSONObject0, "exo_cache_buffer_size", zzbbr.zzw);
        this.zzd = zzcci.zzb(jSONObject0, "exo_connect_timeout_millis", zzbbr.zzh);
        zzbbj zzbbj0 = zzbbr.zzg;
        if(jSONObject0 == null) {
        label_12:
            s1 = (String)zzba.zzc().zzb(zzbbj0);
        }
        else {
            try {
                s1 = jSONObject0.getString("exo_player_version");
                goto label_13;
            }
            catch(JSONException unused_ex) {
            }
            goto label_12;
        }
    label_13:
        this.zze = s1;
        this.zzf = zzcci.zzb(jSONObject0, "exo_read_timeout_millis", zzbbr.zzi);
        this.zzg = zzcci.zzb(jSONObject0, "load_check_interval_bytes", zzbbr.zzj);
        this.zzh = zzcci.zzb(jSONObject0, "player_precache_limit", zzbbr.zzk);
        this.zzi = zzcci.zzb(jSONObject0, "socket_receive_buffer_size", zzbbr.zzm);
        this.zzj = zzcci.zza(jSONObject0, "use_cache_data_source", zzbbr.zzed);
        zzcci.zzb(jSONObject0, "min_retry_count", zzbbr.zzn);
        this.zzk = zzcci.zza(jSONObject0, "treat_load_exception_as_non_fatal", zzbbr.zzq);
        this.zzl = zzcci.zza(jSONObject0, "enable_multiple_video_playback", zzbbr.zzbO);
        this.zzm = zzcci.zza(jSONObject0, "use_range_http_data_source", zzbbr.zzbQ);
        this.zzn = zzcci.zzc(jSONObject0, "range_http_data_source_high_water_mark", zzbbr.zzbR);
        this.zzo = zzcci.zzc(jSONObject0, "range_http_data_source_low_water_mark", zzbbr.zzbS);
    }

    private static final boolean zza(JSONObject jSONObject0, String s, zzbbj zzbbj0) {
        boolean z = ((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue();
        if(jSONObject0 != null) {
            try {
                return jSONObject0.getBoolean(s);
            }
            catch(JSONException unused_ex) {
            }
        }
        return z;
    }

    private static final int zzb(JSONObject jSONObject0, String s, zzbbj zzbbj0) {
        if(jSONObject0 != null) {
            try {
                return jSONObject0.getInt(s);
            }
            catch(JSONException unused_ex) {
            }
        }
        return (int)(((Integer)zzba.zzc().zzb(zzbbj0)));
    }

    private static final long zzc(JSONObject jSONObject0, String s, zzbbj zzbbj0) {
        if(jSONObject0 != null) {
            try {
                return jSONObject0.getLong(s);
            }
            catch(JSONException unused_ex) {
            }
        }
        return (long)(((Long)zzba.zzc().zzb(zzbbj0)));
    }
}

