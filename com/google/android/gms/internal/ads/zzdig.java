package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbu;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdig extends zzdih {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    public zzdig(zzfbe zzfbe0, JSONObject jSONObject0) {
        super(zzfbe0);
        this.zzb = zzbu.zzg(jSONObject0, new String[]{"tracking_urls_and_actions", "active_view"});
        boolean z = false;
        this.zzc = zzbu.zzk(false, jSONObject0, new String[]{"allow_pub_owned_ad_view"});
        this.zzd = zzbu.zzk(false, jSONObject0, new String[]{"attribution", "allow_pub_rendering"});
        this.zze = zzbu.zzk(false, jSONObject0, new String[]{"enable_omid"});
        this.zzg = zzbu.zzb("", jSONObject0, new String[]{"watermark_overlay_png_base64"});
        if(jSONObject0.optJSONObject("overlay") != null) {
            z = true;
        }
        this.zzf = z;
        this.zzh = ((Boolean)zzba.zzc().zzb(zzbbr.zzeV)).booleanValue() ? jSONObject0.optJSONObject("omid_settings") : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdih
    public final zzfcd zza() {
        return this.zzh == null ? this.zza.zzW : new zzfcd(this.zzh);
    }

    @Override  // com.google.android.gms.internal.ads.zzdih
    public final String zzb() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzdih
    public final JSONObject zzc() {
        JSONObject jSONObject0 = this.zzb;
        if(jSONObject0 != null) {
            return jSONObject0;
        }
        try {
            return new JSONObject(this.zza.zzA);
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdih
    public final boolean zzd() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzdih
    public final boolean zze() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzdih
    public final boolean zzf() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzdih
    public final boolean zzg() {
        return this.zzf;
    }
}

