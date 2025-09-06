package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzeqg implements zzesj {
    private final zzfyo zza;
    private final zzfca zzb;
    private final PackageInfo zzc;
    private final zzg zzd;

    public zzeqg(zzfyo zzfyo0, zzfca zzfca0, PackageInfo packageInfo0, zzg zzg0) {
        this.zza = zzfyo0;
        this.zzb = zzfca0;
        this.zzc = packageInfo0;
        this.zzd = zzg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 26;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzeqf zzeqf0 = new zzeqf(this);
        return this.zza.zzb(zzeqf0);
    }

    public static zzeqh zzc(zzeqg zzeqg0) {
        ArrayList arrayList0 = zzeqg0.zzb.zzg;
        if(arrayList0 == null) {
            return (Object object0) -> Bundle bundle0 = (Bundle)object0;
        }
        return arrayList0.isEmpty() ? zzeqd.zza : new zzeqe(zzeqg0, arrayList0);
    }

    final void zzd(ArrayList arrayList0, Bundle bundle0) {
        String s1;
        bundle0.putInt("native_version", 3);
        bundle0.putStringArrayList("native_templates", arrayList0);
        bundle0.putStringArrayList("native_custom_templates", this.zzb.zzh);
        String s = "any";
        if(this.zzb.zzi.zza > 3) {
            bundle0.putBoolean("enable_native_media_orientation", true);
            int v = this.zzb.zzi.zzh;
            switch(v) {
                case 1: {
                    s1 = "any";
                    break;
                }
                case 2: {
                    s1 = "landscape";
                    break;
                }
                case 3: {
                    s1 = "portrait";
                    break;
                }
                default: {
                    s1 = v == 4 ? "square" : "unknown";
                }
            }
            if(!"unknown".equals(s1)) {
                bundle0.putString("native_media_orientation", s1);
            }
        }
        switch(this.zzb.zzi.zzc) {
            case 0: {
                break;
            }
            case 1: {
                s = "portrait";
                break;
            }
            case 2: {
                s = "landscape";
                break;
            }
            default: {
                s = "unknown";
            }
        }
        if(!"unknown".equals(s)) {
            bundle0.putString("native_image_orientation", s);
        }
        bundle0.putBoolean("native_multiple_images", this.zzb.zzi.zzd);
        bundle0.putBoolean("use_custom_mute", this.zzb.zzi.zzg);
        zzbek zzbek0 = this.zzb.zzi;
        if(zzbek0.zzi != 0) {
            bundle0.putBoolean("sccg_tap", zzbek0.zzj);
            bundle0.putInt("sccg_dir", this.zzb.zzi.zzi);
        }
        int v1 = this.zzc == null ? 0 : this.zzc.versionCode;
        if(v1 > this.zzd.zza()) {
            this.zzd.zzs();
            this.zzd.zzv(v1);
        }
        JSONObject jSONObject0 = this.zzd.zzp();
        CharSequence charSequence0 = null;
        if(jSONObject0 != null) {
            JSONArray jSONArray0 = jSONObject0.optJSONArray(this.zzb.zzf);
            if(jSONArray0 != null) {
                charSequence0 = jSONArray0.toString();
            }
        }
        if(!TextUtils.isEmpty(charSequence0)) {
            bundle0.putString("native_advanced_settings", ((String)charSequence0));
        }
        int v2 = this.zzb.zzk;
        if(v2 > 1) {
            bundle0.putInt("max_num_ads", v2);
        }
        String s2 = "p";
        zzbla zzbla0 = this.zzb.zzb;
        if(zzbla0 != null) {
            if(TextUtils.isEmpty(zzbla0.zzc)) {
                if(zzbla0.zza < 2) {
                    int v3 = zzbla0.zzb;
                    if(v3 == 1) {
                        s2 = "l";
                    }
                    else if(v3 != 2) {
                        zzcaa.zzg(("Instream ad video aspect ratio " + v3 + " is wrong."));
                        s2 = "l";
                    }
                }
                else if(zzbla0.zzd == 2 || zzbla0.zzd != 3) {
                    s2 = "l";
                }
                bundle0.putString("ia_var", s2);
            }
            else {
                bundle0.putString("ad_tag", zzbla0.zzc);
            }
            bundle0.putBoolean("instr", true);
        }
        if(this.zzb.zza() != null) {
            bundle0.putBoolean("has_delayed_banner_listener", true);
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzkB)).booleanValue()) {
            if(this.zzb.zzi.zzf != null) {
                Bundle bundle1 = new Bundle();
                bundle1.putBoolean("startMuted", this.zzb.zzi.zzf.zza);
                bundle1.putBoolean("clickToExpandRequested", this.zzb.zzi.zzf.zzc);
                bundle1.putBoolean("customControlsRequested", this.zzb.zzi.zzf.zzb);
                bundle0.putBundle("video", bundle1);
            }
            bundle0.putBoolean("disable_image_loading", this.zzb.zzi.zzb);
            bundle0.putInt("preferred_ad_choices_position", this.zzb.zzi.zze);
        }
    }
}

