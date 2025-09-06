package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

public final class zzgjw {
    private ArrayList zza;
    private zzgjt zzb;
    private Integer zzc;

    public zzgjw() {
        this.zza = new ArrayList();
        this.zzb = zzgjt.zza;
        this.zzc = null;
    }

    public final zzgjw zza(zzfzu zzfzu0, int v, String s, String s1) {
        ArrayList arrayList0 = this.zza;
        if(arrayList0 == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList0.add(new zzgjy(zzfzu0, v, s, s1, null));
        return this;
    }

    public final zzgjw zzb(zzgjt zzgjt0) {
        if(this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzgjt0;
        return this;
    }

    public final zzgjw zzc(int v) {
        if(this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = v;
        return this;
    }

    public final zzgka zzd() {
        if(this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer integer0 = this.zzc;
        if(integer0 != null) {
            int v = (int)integer0;
            ArrayList arrayList0 = this.zza;
            int v1 = arrayList0.size();
            int v2 = 0;
            while(v2 < v1) {
                int v3 = ((zzgjy)arrayList0.get(v2)).zza();
                ++v2;
                if(v3 != v) {
                    continue;
                }
                goto label_13;
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
    label_13:
        zzgka zzgka0 = new zzgka(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
        this.zza = null;
        return zzgka0;
    }
}

