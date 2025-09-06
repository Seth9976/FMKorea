package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzdrq {
    private final zzg zza;
    private final List zzb;
    private boolean zzc;
    private boolean zzd;
    private final String zze;
    private final zzdrm zzf;

    public zzdrq(String s, zzdrm zzdrm0) {
        this.zzb = new ArrayList();
        this.zzc = false;
        this.zzd = false;
        this.zze = s;
        this.zzf = zzdrm0;
        this.zza = zzt.zzo().zzh();
    }

    public final void zza(String s) {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbW)).booleanValue() && !((Boolean)zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
                Map map0 = this.zzg();
                map0.put("action", "aaia");
                map0.put("aair", "MalformedJson");
                this.zzb.add(map0);
            }
        }
    }

    public final void zzb(String s, String s1) {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbW)).booleanValue() && !((Boolean)zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
                Map map0 = this.zzg();
                map0.put("action", "adapter_init_finished");
                map0.put("ancn", s);
                map0.put("rqe", s1);
                this.zzb.add(map0);
            }
        }
    }

    public final void zzc(String s) {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbW)).booleanValue() && !((Boolean)zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
                Map map0 = this.zzg();
                map0.put("action", "adapter_init_started");
                map0.put("ancn", s);
                this.zzb.add(map0);
            }
        }
    }

    public final void zzd(String s) {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbW)).booleanValue() && !((Boolean)zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
                Map map0 = this.zzg();
                map0.put("action", "adapter_init_finished");
                map0.put("ancn", s);
                this.zzb.add(map0);
            }
        }
    }

    public final void zze() {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbW)).booleanValue() && !((Boolean)zzba.zzc().zzb(zzbbr.zzil)).booleanValue() && !this.zzd) {
                Map map0 = this.zzg();
                map0.put("action", "init_finished");
                this.zzb.add(map0);
                for(Object object0: this.zzb) {
                    this.zzf.zze(((Map)object0));
                }
                this.zzd = true;
            }
        }
    }

    public final void zzf() {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbW)).booleanValue() && !((Boolean)zzba.zzc().zzb(zzbbr.zzil)).booleanValue() && !this.zzc) {
                Map map0 = this.zzg();
                map0.put("action", "init_started");
                this.zzb.add(map0);
                this.zzc = true;
            }
        }
    }

    private final Map zzg() {
        Map map0 = this.zzf.zza();
        map0.put("tms", Long.toString(zzt.zzB().elapsedRealtime(), 10));
        map0.put("tid", (this.zza.zzQ() ? "" : this.zze));
        return map0;
    }
}

