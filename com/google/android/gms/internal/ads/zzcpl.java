package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

public final class zzcpl {
    private final zzfgo zza;
    private final zzdrh zzb;
    private final zzfbr zzc;

    public zzcpl(zzdrh zzdrh0, zzfbr zzfbr0, zzfgo zzfgo0) {
        this.zza = zzfgo0;
        this.zzb = zzdrh0;
        this.zzc = zzfbr0;
    }

    public final void zza(long v, int v1) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
            zzfgn zzfgn0 = zzfgn.zzb("ad_closed");
            zzfgn0.zzg(this.zzc.zzb.zzb);
            zzfgn0.zza("show_time", String.valueOf(v));
            zzfgn0.zza("ad_format", "app_open_ad");
            zzfgn0.zza("acr", zzcpl.zzb(v1));
            this.zza.zzb(zzfgn0);
            return;
        }
        zzdrg zzdrg0 = this.zzb.zza();
        zzdrg0.zze(this.zzc.zzb.zzb);
        zzdrg0.zzb("action", "ad_closed");
        zzdrg0.zzb("show_time", String.valueOf(v));
        zzdrg0.zzb("ad_format", "app_open_ad");
        zzdrg0.zzb("acr", zzcpl.zzb(v1));
        zzdrg0.zzg();
    }

    private static String zzb(int v) {
        switch(v - 1) {
            case 0: {
                return "h";
            }
            case 1: {
                return "bb";
            }
            case 2: {
                return "cc";
            }
            case 3: {
                return "cb";
            }
            case 4: {
                return "ac";
            }
            default: {
                return "u";
            }
        }
    }
}

