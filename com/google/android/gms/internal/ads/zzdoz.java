package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzdoz {
    private final Map zza;

    zzdoz() {
        this.zza = new HashMap();
    }

    public final zzdoy zza(String s) {
        synchronized(this) {
            return (zzdoy)this.zza.get(s);
        }
    }

    public final zzdoy zzb(List list0) {
        for(Object object0: list0) {
            zzdoy zzdoy0 = this.zza(((String)object0));
            if(zzdoy0 != null) {
                return zzdoy0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final String zzc(String s) {
        zzdoy zzdoy0 = this.zza(s);
        if(zzdoy0 != null) {
            return zzdoy0.zzb == null ? "" : zzdoy0.zzb.toString();
        }
        return "";
    }

    final void zzd(String s, zzfcw zzfcw0) {
        synchronized(this) {
            if(this.zza.containsKey(s)) {
                return;
            }
            zzbqq zzbqq0 = null;
            zzbqq zzbqq1 = null;
            if(zzfcw0 != null) {
                try {
                    zzbqq1 = zzfcw0.zze();
                }
                catch(zzfcf unused_ex) {
                }
            }
            if(zzfcw0 != null) {
                try {
                    zzbqq0 = zzfcw0.zzf();
                }
                catch(zzfcf unused_ex) {
                }
            }
            boolean z = true;
            if(((Boolean)zzba.zzc().zzb(zzbbr.zziW)).booleanValue()) {
                if(zzfcw0 == null) {
                label_18:
                    z = false;
                }
                else {
                    try {
                        zzfcw0.zzC();
                        goto label_19;
                    }
                    catch(zzfcf unused_ex) {
                    }
                    goto label_18;
                }
            }
        label_19:
            zzdoy zzdoy0 = new zzdoy(s, zzbqq1, zzbqq0, z);
            this.zza.put(s, zzdoy0);
        }
    }

    final void zze(String s, zzbqc zzbqc0) {
        zzbqq zzbqq1;
        zzbqq zzbqq0;
        synchronized(this) {
            if(this.zza.containsKey(s)) {
                return;
            }
            try {
                zzbqq0 = zzbqc0.zzf();
                zzbqq1 = zzbqc0.zzg();
            }
            catch(Throwable unused_ex) {
                return;
            }
            zzdoy zzdoy0 = new zzdoy(s, zzbqq0, zzbqq1, true);
            this.zza.put(s, zzdoy0);
        }
    }
}

