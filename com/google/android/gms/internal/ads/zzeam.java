package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

public final class zzeam implements zzddb {
    private boolean zza;
    private boolean zzb;
    private final String zzc;
    private final zzfgo zzd;
    private final zzg zze;

    public zzeam(String s, zzfgo zzfgo0) {
        this.zza = false;
        this.zzb = false;
        this.zzc = s;
        this.zzd = zzfgo0;
        this.zze = zzt.zzo().zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zza(String s) {
        zzfgn zzfgn0 = this.zzg("aaia");
        zzfgn0.zza("aair", "MalformedJson");
        this.zzd.zzb(zzfgn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zzb(String s, String s1) {
        zzfgn zzfgn0 = this.zzg("adapter_init_finished");
        zzfgn0.zza("ancn", s);
        zzfgn0.zza("rqe", s1);
        this.zzd.zzb(zzfgn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zzc(String s) {
        zzfgn zzfgn0 = this.zzg("adapter_init_started");
        zzfgn0.zza("ancn", s);
        this.zzd.zzb(zzfgn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zzd(String s) {
        zzfgn zzfgn0 = this.zzg("adapter_init_finished");
        zzfgn0.zza("ancn", s);
        this.zzd.zzb(zzfgn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zze() {
        synchronized(this) {
            if(!this.zzb) {
                zzfgn zzfgn0 = this.zzg("init_finished");
                this.zzd.zzb(zzfgn0);
                this.zzb = true;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zzf() {
        synchronized(this) {
            if(!this.zza) {
                zzfgn zzfgn0 = this.zzg("init_started");
                this.zzd.zzb(zzfgn0);
                this.zza = true;
            }
        }
    }

    private final zzfgn zzg(String s) {
        String s1 = this.zze.zzQ() ? "" : this.zzc;
        zzfgn zzfgn0 = zzfgn.zzb(s);
        zzfgn0.zza("tms", Long.toString(zzt.zzB().elapsedRealtime(), 10));
        zzfgn0.zza("tid", s1);
        return zzfgn0;
    }
}

