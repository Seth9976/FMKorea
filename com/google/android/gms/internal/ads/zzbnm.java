package com.google.android.gms.internal.ads;

import Z1.d;
import org.json.JSONObject;

public final class zzbnm implements zzbmy {
    private final zzbna zza;
    private final zzbnb zzb;
    private final zzbmu zzc;
    private final String zzd;

    zzbnm(zzbmu zzbmu0, String s, zzbnb zzbnb0, zzbna zzbna0) {
        this.zzc = zzbmu0;
        this.zzd = s;
        this.zzb = zzbnb0;
        this.zza = zzbna0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        return this.zzb(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final d zzb(Object object0) {
        d d0 = new zzcas();
        zzbmo zzbmo0 = this.zzc.zzb(null);
        zzbmo0.zzi(new zzbnj(this, zzbmo0, object0, ((zzcas)d0)), new zzbnk(this, ((zzcas)d0), zzbmo0));
        return d0;
    }

    static zzbna zzc(zzbnm zzbnm0) {
        return zzbnm0.zza;
    }

    static void zzd(zzbnm zzbnm0, zzbmo zzbmo0, zzbmv zzbmv0, Object object0, zzcas zzcas0) {
        try {
            zzbnl zzbnl0 = new zzbnl(zzbnm0, zzbmo0, zzcas0);
            zzbiq.zzo.zzc("0e51483c-42ce-4a91-909d-50846bef7dee", zzbnl0);
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("id", "0e51483c-42ce-4a91-909d-50846bef7dee");
            jSONObject0.put("args", zzbnm0.zzb.zzb(object0));
            zzbmv0.zzl(zzbnm0.zzd, jSONObject0);
        }
        catch(Exception unused_ex) {
            try {
                zzcas0.zzd(exception0);
                zzcaa.zzh("Unable to invokeJavascript", exception0);
            }
            finally {
                zzbmo0.zzb();
            }
        }
    }
}

