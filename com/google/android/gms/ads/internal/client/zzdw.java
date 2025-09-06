package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcaa;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class zzdw {
    private final HashSet zza;
    private final Bundle zzb;
    private final HashMap zzc;
    private final HashSet zzd;
    private final Bundle zze;
    private final HashSet zzf;
    private Date zzg;
    private String zzh;
    private final List zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private int zzm;
    private boolean zzn;
    private String zzo;
    private int zzp;

    public zzdw() {
        this.zza = new HashSet();
        this.zzb = new Bundle();
        this.zzc = new HashMap();
        this.zzd = new HashSet();
        this.zze = new Bundle();
        this.zzf = new HashSet();
        this.zzi = new ArrayList();
        this.zzj = -1;
        this.zzm = -1;
        this.zzp = 60000;
    }

    @Deprecated
    public final void zzA(int v) {
        this.zzj = v;
    }

    public final void zzB(int v) {
        this.zzp = v;
    }

    @Deprecated
    public final void zzC(boolean z) {
        this.zzn = z;
    }

    public final void zzD(List list0) {
        this.zzi.clear();
        for(Object object0: list0) {
            String s = (String)object0;
            if(TextUtils.isEmpty(s)) {
                zzcaa.zzj("neighboring content URL should not be null or empty");
            }
            else {
                this.zzi.add(s);
            }
        }
    }

    public final void zzE(String s) {
        this.zzk = s;
    }

    public final void zzF(String s) {
        this.zzl = s;
    }

    @Deprecated
    public final void zzG(boolean z) {
        this.zzm = z;
    }

    static List zzo(zzdw zzdw0) {
        return zzdw0.zzi;
    }

    public final void zzp(String s) {
        this.zzf.add(s);
    }

    public final void zzq(Class class0, Bundle bundle0) {
        if(this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            Bundle bundle1 = new Bundle();
            this.zzb.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", bundle1);
        }
        Bundle bundle2 = this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        Preconditions.checkNotNull(bundle2);
        bundle2.putBundle(class0.getName(), bundle0);
    }

    public final void zzr(String s, String s1) {
        this.zze.putString(s, s1);
    }

    public final void zzs(String s) {
        this.zza.add(s);
    }

    public final void zzt(Class class0, Bundle bundle0) {
        this.zzb.putBundle(class0.getName(), bundle0);
    }

    @Deprecated
    public final void zzu(NetworkExtras networkExtras0) {
        Class class0 = networkExtras0.getClass();
        this.zzc.put(class0, networkExtras0);
    }

    public final void zzv(String s) {
        this.zzd.add(s);
    }

    public final void zzw(String s) {
        this.zzd.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void zzx(String s) {
        this.zzo = s;
    }

    @Deprecated
    public final void zzy(Date date0) {
        this.zzg = date0;
    }

    public final void zzz(String s) {
        this.zzh = s;
    }
}

