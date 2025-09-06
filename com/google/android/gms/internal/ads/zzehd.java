package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

public final class zzehd {
    private final zzfcq zza;
    private final zzdoz zzb;
    private final zzdrh zzc;
    private final zzfgo zzd;

    public zzehd(zzfcq zzfcq0, zzdoz zzdoz0, zzdrh zzdrh0, zzfgo zzfgo0) {
        this.zza = zzfcq0;
        this.zzb = zzdoz0;
        this.zzc = zzdrh0;
        this.zzd = zzfgo0;
    }

    public final void zza(zzfbi zzfbi0, zzfbe zzfbe0, int v, zzedr zzedr0, long v1) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
            zzfgn zzfgn0 = zzfgn.zzb("adapter_status");
            zzfgn0.zzg(zzfbi0);
            zzfgn0.zzf(zzfbe0);
            zzfgn0.zza("adapter_l", String.valueOf(v1));
            zzfgn0.zza("sc", Integer.toString(v));
            if(zzedr0 != null) {
                zzfgn0.zza("arec", Integer.toString(zzedr0.zzb().zza));
                String s = this.zza.zza(zzedr0.getMessage());
                if(s != null) {
                    zzfgn0.zza("areec", s);
                }
            }
            zzdoy zzdoy0 = this.zzb.zzb(zzfbe0.zzu);
            if(zzdoy0 != null) {
                zzfgn0.zza("ancn", zzdoy0.zza);
                zzbqq zzbqq0 = zzdoy0.zzb;
                if(zzbqq0 != null) {
                    zzfgn0.zza("adapter_v", zzbqq0.toString());
                }
                zzbqq zzbqq1 = zzdoy0.zzc;
                if(zzbqq1 != null) {
                    zzfgn0.zza("adapter_sv", zzbqq1.toString());
                }
            }
            this.zzd.zzb(zzfgn0);
            return;
        }
        zzdrg zzdrg0 = this.zzc.zza();
        zzdrg0.zze(zzfbi0);
        zzdrg0.zzd(zzfbe0);
        zzdrg0.zzb("action", "adapter_status");
        zzdrg0.zzb("adapter_l", String.valueOf(v1));
        zzdrg0.zzb("sc", Integer.toString(v));
        if(zzedr0 != null) {
            zzdrg0.zzb("arec", Integer.toString(zzedr0.zzb().zza));
            String s1 = this.zza.zza(zzedr0.getMessage());
            if(s1 != null) {
                zzdrg0.zzb("areec", s1);
            }
        }
        zzdoy zzdoy1 = this.zzb.zzb(zzfbe0.zzu);
        if(zzdoy1 != null) {
            zzdrg0.zzb("ancn", zzdoy1.zza);
            zzbqq zzbqq2 = zzdoy1.zzb;
            if(zzbqq2 != null) {
                zzdrg0.zzb("adapter_v", zzbqq2.toString());
            }
            zzbqq zzbqq3 = zzdoy1.zzc;
            if(zzbqq3 != null) {
                zzdrg0.zzb("adapter_sv", zzbqq3.toString());
            }
        }
        zzdrg0.zzg();
    }
}

