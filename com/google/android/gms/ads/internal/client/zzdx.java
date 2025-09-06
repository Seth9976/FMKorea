package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzdx {
    private final Date zza;
    private final String zzb;
    private final List zzc;
    private final int zzd;
    private final Set zze;
    private final Bundle zzf;
    private final Map zzg;
    private final String zzh;
    private final String zzi;
    private final SearchAdRequest zzj;
    private final int zzk;
    private final Set zzl;
    private final Bundle zzm;
    private final Set zzn;
    private final boolean zzo;
    private final String zzp;
    private final int zzq;

    public zzdx(zzdw zzdw0, SearchAdRequest searchAdRequest0) {
        this.zza = zzdw0.zzg;
        this.zzb = zzdw0.zzh;
        this.zzc = zzdw.zzo(zzdw0);
        this.zzd = zzdw0.zzj;
        this.zze = Collections.unmodifiableSet(zzdw0.zza);
        this.zzf = zzdw0.zzb;
        this.zzg = Collections.unmodifiableMap(zzdw0.zzc);
        this.zzh = zzdw0.zzk;
        this.zzi = zzdw0.zzl;
        this.zzj = searchAdRequest0;
        this.zzk = zzdw0.zzm;
        this.zzl = Collections.unmodifiableSet(zzdw0.zzd);
        this.zzm = zzdw0.zze;
        this.zzn = Collections.unmodifiableSet(zzdw0.zzf);
        this.zzo = zzdw0.zzn;
        this.zzp = zzdw0.zzo;
        this.zzq = zzdw0.zzp;
    }

    @Deprecated
    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzq;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final Bundle zzd(Class class0) {
        Bundle bundle0 = this.zzf.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        return bundle0 == null ? null : bundle0.getBundle(class0.getName());
    }

    public final Bundle zze() {
        return this.zzm;
    }

    public final Bundle zzf(Class class0) {
        return this.zzf.getBundle(class0.getName());
    }

    public final Bundle zzg() {
        return this.zzf;
    }

    @Deprecated
    public final NetworkExtras zzh(Class class0) {
        return (NetworkExtras)this.zzg.get(class0);
    }

    public final SearchAdRequest zzi() {
        return this.zzj;
    }

    public final String zzj() {
        return this.zzp;
    }

    public final String zzk() {
        return this.zzb;
    }

    public final String zzl() {
        return this.zzh;
    }

    public final String zzm() {
        return this.zzi;
    }

    @Deprecated
    public final Date zzn() {
        return this.zza;
    }

    public final List zzo() {
        return new ArrayList(this.zzc);
    }

    public final Set zzp() {
        return this.zzn;
    }

    public final Set zzq() {
        return this.zze;
    }

    @Deprecated
    public final boolean zzr() {
        return this.zzo;
    }

    public final boolean zzs(Context context0) {
        RequestConfiguration requestConfiguration0 = zzej.zzf().zzc();
        String s = zzbzt.zzy(context0);
        return this.zzl.contains(s) || requestConfiguration0.getTestDeviceIds().contains(s);
    }
}

