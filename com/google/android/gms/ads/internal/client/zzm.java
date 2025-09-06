package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class zzm {
    private Bundle zza;
    private List zzb;
    private boolean zzc;
    private int zzd;
    private final Bundle zze;
    private final Bundle zzf;
    private final List zzg;
    private int zzh;
    private String zzi;
    private final List zzj;
    private int zzk;

    public zzm() {
        this.zza = new Bundle();
        this.zzb = new ArrayList();
        this.zzc = false;
        this.zzd = -1;
        this.zze = new Bundle();
        this.zzf = new Bundle();
        this.zzg = new ArrayList();
        this.zzh = -1;
        this.zzi = null;
        this.zzj = new ArrayList();
        this.zzk = 60000;
    }

    public final zzl zza() {
        return new zzl(8, -1L, this.zza, -1, this.zzb, this.zzc, this.zzd, false, null, null, null, null, this.zze, this.zzf, this.zzg, null, null, false, null, this.zzh, this.zzi, this.zzj, this.zzk, null);
    }

    public final zzm zzb(Bundle bundle0) {
        this.zza = bundle0;
        return this;
    }

    public final zzm zzc(int v) {
        this.zzk = v;
        return this;
    }

    public final zzm zzd(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzm zze(List list0) {
        this.zzb = list0;
        return this;
    }

    public final zzm zzf(String s) {
        this.zzi = s;
        return this;
    }

    public final zzm zzg(int v) {
        this.zzd = v;
        return this;
    }

    public final zzm zzh(int v) {
        this.zzh = v;
        return this;
    }
}

