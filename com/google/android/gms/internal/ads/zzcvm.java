package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.List;

public final class zzcvm {
    private final zzfge zza;
    private final zzcag zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzgyn zzg;
    private final String zzh;
    private final zzesm zzi;
    private final zzg zzj;
    private final zzfca zzk;

    public zzcvm(zzfge zzfge0, zzcag zzcag0, ApplicationInfo applicationInfo0, String s, List list0, PackageInfo packageInfo0, zzgyn zzgyn0, zzg zzg0, String s1, zzesm zzesm0, zzfca zzfca0) {
        this.zza = zzfge0;
        this.zzb = zzcag0;
        this.zzc = applicationInfo0;
        this.zzd = s;
        this.zze = list0;
        this.zzf = packageInfo0;
        this.zzg = zzgyn0;
        this.zzh = s1;
        this.zzi = zzesm0;
        this.zzj = zzg0;
        this.zzk = zzfca0;
    }

    // 检测为 Lambda 实现
    final zzbun zza(d d0) [...]

    public final d zzb() {
        Bundle bundle0 = new Bundle();
        return zzffo.zzc(this.zzi.zza(bundle0), zzffy.zza, this.zza).zza();
    }

    public final d zzc() {
        d d0 = this.zzb();
        d[] arr_d = {d0, ((d)this.zzg.zzb())};
        return this.zza.zza(zzffy.zzb, arr_d).zza(() -> {
            Object object0 = d0.get();
            Object object1 = ((d)this.zzg.zzb()).get();
            return !((Boolean)zzba.zzc().zzb(zzbbr.zzha)).booleanValue() || !this.zzj.zzQ() ? new zzbun(((Bundle)object0), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, ((String)object1), this.zzh, null, null, false, this.zzk.zzb()) : new zzbun(((Bundle)object0), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, ((String)object1), this.zzh, null, null, true, this.zzk.zzb());
        }).zza();
    }
}

