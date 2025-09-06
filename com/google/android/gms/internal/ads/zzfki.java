package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

public final class zzfki {
    private JSONObject zza;
    private final zzfkr zzb;

    public zzfki(zzfkr zzfkr0) {
        this.zzb = zzfkr0;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        zzfks zzfks0 = new zzfks(this);
        this.zzb.zzb(zzfks0);
    }

    public final void zzc(JSONObject jSONObject0, HashSet hashSet0, long v) {
        zzfkt zzfkt0 = new zzfkt(this, hashSet0, jSONObject0, v);
        this.zzb.zzb(zzfkt0);
    }

    public final void zzd(JSONObject jSONObject0, HashSet hashSet0, long v) {
        zzfku zzfku0 = new zzfku(this, hashSet0, jSONObject0, v);
        this.zzb.zzb(zzfku0);
    }

    public final void zze(JSONObject jSONObject0) {
        this.zza = jSONObject0;
    }
}

