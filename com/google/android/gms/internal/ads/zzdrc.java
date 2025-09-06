package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
public final class zzdrc {
    private final ConcurrentHashMap zza;
    private final zzbzn zzb;
    private final zzfca zzc;
    private final String zzd;
    private final String zze;

    public zzdrc(zzdrm zzdrm0, zzbzn zzbzn0, zzfca zzfca0, String s, String s1) {
        ConcurrentHashMap concurrentHashMap0 = zzdrm0.zzc();
        this.zza = concurrentHashMap0;
        this.zzb = zzbzn0;
        this.zzc = zzfca0;
        this.zzd = s;
        this.zze = s1;
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzgS)).booleanValue()) {
            return;
        }
        int v = zzf.zze(zzfca0);
        if(v - 1 != 0) {
            switch(v - 1) {
                case 1: {
                    concurrentHashMap0.put("se", "query_g");
                    break;
                }
                case 2: {
                    concurrentHashMap0.put("se", "r_adinfo");
                    break;
                }
                default: {
                    if(v - 1 == 3) {
                        concurrentHashMap0.put("se", "r_adstring");
                    }
                    else {
                        concurrentHashMap0.put("se", "r_both");
                    }
                }
            }
            concurrentHashMap0.put("scar", "true");
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzhr)).booleanValue()) {
                concurrentHashMap0.put("ad_format", s1);
            }
            if(v == 2) {
                concurrentHashMap0.put("rid", s);
            }
            this.zzd("ragent", zzfca0.zzd.zzp);
            this.zzd("rtype", zzf.zza(zzf.zzb(zzfca0.zzd)));
            return;
        }
        concurrentHashMap0.put("scar", "false");
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzfbr zzfbr0) {
        if(!zzfbr0.zzb.zza.isEmpty()) {
            switch(((zzfbe)zzfbr0.zzb.zza.get(0)).zzb) {
                case 1: {
                    this.zza.put("ad_format", "banner");
                    break;
                }
                case 2: {
                    this.zza.put("ad_format", "interstitial");
                    break;
                }
                case 3: {
                    this.zza.put("ad_format", "native_express");
                    break;
                }
                case 4: {
                    this.zza.put("ad_format", "native_advanced");
                    break;
                }
                case 5: {
                    this.zza.put("ad_format", "rewarded");
                    break;
                }
                case 6: {
                    this.zza.put("ad_format", "app_open_ad");
                    this.zza.put("as", (this.zzb.zzm() ? "1" : "0"));
                    break;
                }
                default: {
                    this.zza.put("ad_format", "unknown");
                }
            }
        }
        this.zzd("gqi", zzfbr0.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle0) {
        if(bundle0.containsKey("cnt")) {
            String s = Integer.toString(bundle0.getInt("cnt"));
            this.zza.put("network_coarse", s);
        }
        if(bundle0.containsKey("gnt")) {
            String s1 = Integer.toString(bundle0.getInt("gnt"));
            this.zza.put("network_fine", s1);
        }
    }

    private final void zzd(String s, String s1) {
        if(!TextUtils.isEmpty(s1)) {
            this.zza.put(s, s1);
        }
    }
}

