package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;

public final class zzeso implements zzesi {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final String zzi;
    public final String zzj;
    public final String zzk;
    public final boolean zzl;
    public final String zzm;
    public final long zzn;
    public final boolean zzo;

    public zzeso(boolean z, boolean z1, String s, boolean z2, boolean z3, boolean z4, String s1, ArrayList arrayList0, String s2, String s3, String s4, boolean z5, String s5, long v, boolean z6) {
        this.zza = z;
        this.zzb = z1;
        this.zzc = s;
        this.zzd = z2;
        this.zze = z3;
        this.zzf = z4;
        this.zzg = s1;
        this.zzh = arrayList0;
        this.zzi = s2;
        this.zzj = s3;
        this.zzk = s4;
        this.zzl = z5;
        this.zzm = s5;
        this.zzn = v;
        this.zzo = z6;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        ((Bundle)object0).putBoolean("cog", this.zza);
        ((Bundle)object0).putBoolean("coh", this.zzb);
        ((Bundle)object0).putString("gl", this.zzc);
        ((Bundle)object0).putBoolean("simulator", this.zzd);
        ((Bundle)object0).putBoolean("is_latchsky", this.zze);
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzjV)).booleanValue()) {
            ((Bundle)object0).putBoolean("is_sidewinder", this.zzf);
        }
        ((Bundle)object0).putString("hl", this.zzg);
        if(!this.zzh.isEmpty()) {
            ((Bundle)object0).putStringArrayList("hl_list", this.zzh);
        }
        ((Bundle)object0).putString("mv", this.zzi);
        ((Bundle)object0).putString("submodel", this.zzm);
        Bundle bundle0 = zzfcm.zza(((Bundle)object0), "device");
        ((Bundle)object0).putBundle("device", bundle0);
        bundle0.putString("build", this.zzk);
        bundle0.putLong("remaining_data_partition_space", this.zzn);
        Bundle bundle1 = zzfcm.zza(bundle0, "browser");
        bundle0.putBundle("browser", bundle1);
        bundle1.putBoolean("is_browser_custom_tabs_capable", this.zzl);
        if(!TextUtils.isEmpty(this.zzj)) {
            Bundle bundle2 = zzfcm.zza(bundle0, "play_store");
            bundle0.putBundle("play_store", bundle2);
            bundle2.putString("package_version", this.zzj);
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzkh)).booleanValue()) {
            ((Bundle)object0).putBoolean("is_bstar", this.zzo);
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzkf)).booleanValue()) {
            zzfcm.zzg(((Bundle)object0), "gotmt_l", true, ((Boolean)zzba.zzc().zzb(zzbbr.zzkc)).booleanValue());
            zzfcm.zzg(((Bundle)object0), "gotmt_i", true, ((Boolean)zzba.zzc().zzb(zzbbr.zzkb)).booleanValue());
        }
    }
}

