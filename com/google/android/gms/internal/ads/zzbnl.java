package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

final class zzbnl implements zzbjf {
    final zzbnm zza;
    private final zzbmo zzb;
    private final zzcas zzc;

    public zzbnl(zzbnm zzbnm0, zzbmo zzbmo0, zzcas zzcas0) {
        this.zza = zzbnm0;
        super();
        this.zzb = zzbmo0;
        this.zzc = zzcas0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjf
    public final void zza(String s) {
        try {
            if(s == null) {
                zzbmx zzbmx0 = new zzbmx();
                this.zzc.zzd(zzbmx0);
            }
            else {
                zzbmx zzbmx1 = new zzbmx(s);
                this.zzc.zzd(zzbmx1);
            }
            goto label_13;
        }
        catch(IllegalStateException unused_ex) {
        }
        catch(Throwable throwable0) {
            this.zzb.zzb();
            throw throwable0;
        }
        zzbmo zzbmo0 = this.zzb;
        zzbmo0.zzb();
        return;
    label_13:
        zzbmo0 = this.zzb;
        zzbmo0.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbjf
    public final void zzb(JSONObject jSONObject0) {
        zzbmo zzbmo0;
        try {
            try {
                Object object0 = zzbnm.zzc(this.zza).zza(jSONObject0);
                this.zzc.zzc(object0);
            }
            catch(IllegalStateException unused_ex) {
                zzbmo0 = this.zzb;
                goto label_12;
            }
            catch(JSONException jSONException0) {
                this.zzc.zzd(jSONException0);
            }
        }
        catch(Throwable throwable0) {
            this.zzb.zzb();
            throw throwable0;
        }
        zzbmo0 = this.zzb;
    label_12:
        zzbmo0.zzb();
    }
}

