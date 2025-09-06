package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;

public final class zzfgn {
    private final HashMap zza;
    private final zzfgt zzb;

    private zzfgn() {
        HashMap hashMap0 = new HashMap();
        this.zza = hashMap0;
        this.zzb = new zzfgt(zzt.zzB());
        hashMap0.put("new_csi", "1");
    }

    public final zzfgn zza(String s, String s1) {
        this.zza.put(s, s1);
        return this;
    }

    public static zzfgn zzb(String s) {
        zzfgn zzfgn0 = new zzfgn();
        zzfgn0.zza.put("action", s);
        return zzfgn0;
    }

    public static zzfgn zzc(String s) {
        zzfgn zzfgn0 = new zzfgn();
        zzfgn0.zza.put("request_id", s);
        return zzfgn0;
    }

    public final zzfgn zzd(String s) {
        this.zzb.zzb(s);
        return this;
    }

    public final zzfgn zze(String s, String s1) {
        this.zzb.zzc(s, s1);
        return this;
    }

    public final zzfgn zzf(zzfbe zzfbe0) {
        this.zza.put("aai", zzfbe0.zzx);
        return this;
    }

    public final zzfgn zzg(zzfbi zzfbi0) {
        if(!TextUtils.isEmpty(zzfbi0.zzb)) {
            this.zza.put("gqi", zzfbi0.zzb);
        }
        return this;
    }

    public final zzfgn zzh(zzfbr zzfbr0, zzbzn zzbzn0) {
        zzfbq zzfbq0 = zzfbr0.zzb;
        this.zzg(zzfbq0.zzb);
        if(!zzfbq0.zza.isEmpty()) {
            switch(((zzfbe)zzfbq0.zza.get(0)).zzb) {
                case 1: {
                    this.zza.put("ad_format", "banner");
                    return this;
                }
                case 2: {
                    this.zza.put("ad_format", "interstitial");
                    return this;
                }
                case 3: {
                    this.zza.put("ad_format", "native_express");
                    return this;
                }
                case 4: {
                    this.zza.put("ad_format", "native_advanced");
                    return this;
                }
                case 5: {
                    this.zza.put("ad_format", "rewarded");
                    return this;
                }
                case 6: {
                    this.zza.put("ad_format", "app_open_ad");
                    if(zzbzn0 != null) {
                        this.zza.put("as", (zzbzn0.zzm() ? "1" : "0"));
                        return this;
                    }
                    break;
                }
                default: {
                    this.zza.put("ad_format", "unknown");
                    return this;
                }
            }
        }
        return this;
    }

    public final zzfgn zzi(Bundle bundle0) {
        if(bundle0.containsKey("cnt")) {
            String s = Integer.toString(bundle0.getInt("cnt"));
            this.zza.put("network_coarse", s);
        }
        if(bundle0.containsKey("gnt")) {
            String s1 = Integer.toString(bundle0.getInt("gnt"));
            this.zza.put("network_fine", s1);
        }
        return this;
    }

    public final Map zzj() {
        Map map0 = new HashMap(this.zza);
        for(Object object0: this.zzb.zza()) {
            map0.put(((zzfgs)object0).zza, ((zzfgs)object0).zzb);
        }
        return map0;
    }
}

