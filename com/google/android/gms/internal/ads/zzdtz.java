package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public final class zzdtz {
    private final zzdtj zza;
    private final zzdoz zzb;
    private final Object zzc;
    private final List zzd;
    private boolean zze;

    zzdtz(zzdtj zzdtj0, zzdoz zzdoz0) {
        this.zzc = new Object();
        this.zza = zzdtj0;
        this.zzb = zzdoz0;
        this.zzd = new ArrayList();
    }

    public final JSONArray zza() {
        JSONArray jSONArray0 = new JSONArray();
        synchronized(this.zzc) {
            if(!this.zze) {
                if(this.zza.zzt()) {
                    this.zzd(this.zza.zzg());
                    goto label_13;
                }
                this.zzc();
                return jSONArray0;
            }
        label_13:
            for(Object object1: this.zzd) {
                jSONArray0.put(((zzdty)object1).zza());
            }
            return jSONArray0;
        }
    }

    static void zzb(zzdtz zzdtz0, List list0) {
        zzdtz0.zzd(list0);
    }

    public final void zzc() {
        zzdtx zzdtx0 = new zzdtx(this);
        this.zza.zzs(zzdtx0);
    }

    private final void zzd(List list0) {
        boolean z;
        String s;
        synchronized(this.zzc) {
            if(this.zze) {
                return;
            }
            for(Object object1: list0) {
                zzbko zzbko0 = (zzbko)object1;
                if(((Boolean)zzba.zzc().zzb(zzbbr.zziV)).booleanValue()) {
                    zzdoy zzdoy0 = this.zzb.zza(zzbko0.zza);
                    if(zzdoy0 != null) {
                        zzbqq zzbqq0 = zzdoy0.zzc;
                        if(zzbqq0 != null) {
                            s = zzbqq0.toString();
                        }
                    }
                }
                else {
                    s = "";
                }
                if(((Boolean)zzba.zzc().zzb(zzbbr.zziW)).booleanValue()) {
                    zzdoy zzdoy1 = this.zzb.zza(zzbko0.zza);
                    if(zzdoy1 != null && zzdoy1.zzd) {
                        z = true;
                    }
                }
                else {
                    z = false;
                }
                String s1 = this.zzb.zzc(zzbko0.zza);
                zzdty zzdty0 = new zzdty(zzbko0.zza, s, s1, ((int)zzbko0.zzb), zzbko0.zzd, zzbko0.zzc, z);
                this.zzd.add(zzdty0);
            }
            this.zze = true;
        }
    }
}

