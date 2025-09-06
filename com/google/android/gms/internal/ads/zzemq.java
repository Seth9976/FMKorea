package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public final class zzemq implements zzesi {
    public final zzq zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzemq(zzq zzq0, String s, boolean z, String s1, float f, int v, int v1, String s2, boolean z1) {
        Preconditions.checkNotNull(zzq0, "the adSize must not be null");
        this.zza = zzq0;
        this.zzb = s;
        this.zzc = z;
        this.zzd = s1;
        this.zze = f;
        this.zzf = v;
        this.zzg = v1;
        this.zzh = s2;
        this.zzi = z1;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        zzfcm.zzf(((Bundle)object0), "smart_w", "full", this.zza.zze == -1);
        zzfcm.zzf(((Bundle)object0), "smart_h", "auto", this.zza.zzb == -2);
        zzfcm.zzg(((Bundle)object0), "ene", true, this.zza.zzj);
        zzfcm.zzf(((Bundle)object0), "rafmt", "102", this.zza.zzm);
        zzfcm.zzf(((Bundle)object0), "rafmt", "103", this.zza.zzn);
        zzfcm.zzf(((Bundle)object0), "rafmt", "105", this.zza.zzo);
        zzfcm.zzg(((Bundle)object0), "inline_adaptive_slot", true, this.zzi);
        zzfcm.zzg(((Bundle)object0), "interscroller_slot", true, this.zza.zzo);
        zzfcm.zzc(((Bundle)object0), "format", this.zzb);
        zzfcm.zzf(((Bundle)object0), "fluid", "height", this.zzc);
        boolean z = TextUtils.isEmpty(this.zzd);
        zzfcm.zzf(((Bundle)object0), "sz", this.zzd, !z);
        ((Bundle)object0).putFloat("u_sd", this.zze);
        ((Bundle)object0).putInt("sw", this.zzf);
        ((Bundle)object0).putInt("sh", this.zzg);
        boolean z1 = TextUtils.isEmpty(this.zzh);
        zzfcm.zzf(((Bundle)object0), "sc", this.zzh, !z1);
        ArrayList arrayList0 = new ArrayList();
        zzq[] arr_zzq = this.zza.zzg;
        if(arr_zzq == null) {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("height", this.zza.zzb);
            bundle0.putInt("width", this.zza.zze);
            bundle0.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList0.add(bundle0);
        }
        else {
            for(int v = 0; v < arr_zzq.length; ++v) {
                zzq zzq0 = arr_zzq[v];
                Bundle bundle1 = new Bundle();
                bundle1.putBoolean("is_fluid_height", zzq0.zzi);
                bundle1.putInt("height", zzq0.zzb);
                bundle1.putInt("width", zzq0.zze);
                arrayList0.add(bundle1);
            }
        }
        ((Bundle)object0).putParcelableArrayList("valid_ad_sizes", arrayList0);
    }
}

