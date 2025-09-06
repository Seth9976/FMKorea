package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

public final class zzbmw implements zzbln, zzbmv {
    private final zzbmv zza;
    private final HashSet zzb;

    public zzbmw(zzbmv zzbmv0) {
        this.zza = zzbmv0;
        this.zzb = new HashSet();
    }

    @Override  // com.google.android.gms.internal.ads.zzbln, com.google.android.gms.internal.ads.zzbly
    public final void zza(String s) {
        this.zza.zza(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbln, com.google.android.gms.internal.ads.zzbly
    public final void zzb(String s, String s1) {
        zzblm.zzc(this, s, s1);
    }

    public final void zzc() {
        for(Object object0: this.zzb) {
            zze.zza(("Unregistering eventhandler: " + ((zzbir)((AbstractMap.SimpleEntry)object0).getValue()).toString()));
            String s = (String)((AbstractMap.SimpleEntry)object0).getKey();
            zzbir zzbir0 = (zzbir)((AbstractMap.SimpleEntry)object0).getValue();
            this.zza.zzr(s, zzbir0);
        }
        this.zzb.clear();
    }

    @Override  // com.google.android.gms.internal.ads.zzbll
    public final void zzd(String s, Map map0) {
        zzblm.zza(this, s, map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbln, com.google.android.gms.internal.ads.zzbll
    public final void zze(String s, JSONObject jSONObject0) {
        zzblm.zzb(this, s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbly
    public final void zzl(String s, JSONObject jSONObject0) {
        zzblm.zzd(this, s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmv
    public final void zzq(String s, zzbir zzbir0) {
        this.zza.zzq(s, zzbir0);
        AbstractMap.SimpleEntry abstractMap$SimpleEntry0 = new AbstractMap.SimpleEntry(s, zzbir0);
        this.zzb.add(abstractMap$SimpleEntry0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmv
    public final void zzr(String s, zzbir zzbir0) {
        this.zza.zzr(s, zzbir0);
        AbstractMap.SimpleEntry abstractMap$SimpleEntry0 = new AbstractMap.SimpleEntry(s, zzbir0);
        this.zzb.remove(abstractMap$SimpleEntry0);
    }
}

