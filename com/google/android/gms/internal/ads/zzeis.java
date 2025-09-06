package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

public final class zzeis implements zzedn {
    private final zzedp zza;
    private final zzedt zzb;
    private final zzfge zzc;
    private final zzfyo zzd;

    public zzeis(zzfge zzfge0, zzfyo zzfyo0, zzedp zzedp0, zzedt zzedt0) {
        this.zzc = zzfge0;
        this.zzd = zzfyo0;
        this.zzb = zzedt0;
        this.zza = zzedp0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final d zza(zzfbr zzfbr0, zzfbe zzfbe0) {
        zzedq zzedq0;
        Iterator iterator0 = zzfbe0.zzu.iterator();
    label_1:
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            try {
                zzedq0 = this.zza.zza(s, zzfbe0.zzw);
            }
            catch(zzfcf unused_ex) {
                goto label_1;
            }
        }
        else {
            zzedq0 = null;
        }
        if(zzedq0 == null) {
            return zzfye.zzg(new zzegp("Unable to instantiate mediation adapter class."));
        }
        zzcas zzcas0 = new zzcas();
        zzeir zzeir0 = new zzeir(this, zzedq0, zzcas0);
        zzedq0.zzc.zza(zzeir0);
        if(zzfbe0.zzN) {
            Bundle bundle0 = zzfbr0.zza.zza.zzd.zzm;
            Class class0 = AdMobAdapter.class;
            Bundle bundle1 = bundle0.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
            if(bundle1 == null) {
                bundle1 = new Bundle();
                bundle0.putBundle(class0.getName(), bundle1);
            }
            bundle1.putBoolean("render_test_ad_label", true);
        }
        return zzffo.zzd(() -> this.zzb.zzb(zzfbr0, zzfbe0, zzedq0), this.zzd, zzffy.zzp, this.zzc).zzb(zzffy.zzq).zzd(zzcas0).zzb(zzffy.zzr).zze((Void void0) -> this.zzb.zza(zzfbr0, zzfbe0, zzedq0)).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbr0, zzfbe zzfbe0) {
        return !zzfbe0.zzu.isEmpty();
    }

    // 检测为 Lambda 实现
    final Object zzc(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0, Void void0) [...]

    // 检测为 Lambda 实现
    final void zzd(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) [...]

    static final String zze(String s, int v) [...] // Inlined contents
}

