package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzerv implements zzesi {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzerv(String s, String s1, String s2, String s3, Long long0) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = s2;
        this.zzd = s3;
        this.zze = long0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        zzfcm.zzc(((Bundle)object0), "gmp_app_id", this.zza);
        zzfcm.zzc(((Bundle)object0), "fbs_aiid", this.zzb);
        zzfcm.zzc(((Bundle)object0), "fbs_aeid", this.zzc);
        zzfcm.zzc(((Bundle)object0), "apm_id_origin", this.zzd);
        Long long0 = this.zze;
        if(long0 != null) {
            ((Bundle)object0).putLong("sai_timeout", ((long)long0));
        }
    }
}

