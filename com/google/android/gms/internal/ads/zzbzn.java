package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class zzbzn implements zzauy {
    final zzbzk zza;
    final HashSet zzb;
    final HashSet zzc;
    private final Object zzd;
    private final zzg zze;
    private final zzbzl zzf;
    private boolean zzg;

    public zzbzn(String s, zzg zzg0) {
        this.zzd = new Object();
        this.zzb = new HashSet();
        this.zzc = new HashSet();
        this.zzg = false;
        this.zza = new zzbzk(s, zzg0);
        this.zze = zzg0;
        this.zzf = new zzbzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzauy
    public final void zza(boolean z) {
        long v = zzt.zzB().currentTimeMillis();
        if(z) {
            this.zza.zzd = v - this.zze.zzd() > ((long)(((Long)zzba.zzc().zzb(zzbbr.zzaR)))) ? -1 : this.zze.zzc();
            this.zzg = true;
            return;
        }
        this.zze.zzt(v);
        this.zze.zzK(this.zza.zzd);
    }

    public final int zzb() {
        synchronized(this.zzd) {
        }
        return this.zza.zza();
    }

    // 去混淆评级： 低(20)
    public final zzbzc zzc(Clock clock0, String s) {
        return new zzbzc(clock0, this, "1", s);
    }

    // 去混淆评级： 低(20)
    public final String zzd() {
        return "0";
    }

    public final void zze(zzbzc zzbzc0) {
        synchronized(this.zzd) {
            this.zzb.add(zzbzc0);
        }
    }

    public final void zzf() {
        synchronized(this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzg() {
        synchronized(this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzh() {
        synchronized(this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzi() {
        synchronized(this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzj(zzl zzl0, long v) {
        synchronized(this.zzd) {
            this.zza.zzg(zzl0, v);
        }
    }

    public final void zzk() {
        synchronized(this.zzd) {
            this.zza.zzh();
        }
    }

    public final void zzl(HashSet hashSet0) {
        synchronized(this.zzd) {
            this.zzb.addAll(hashSet0);
        }
    }

    public final boolean zzm() {
        return this.zzg;
    }

    public final Bundle zzn(Context context0, zzfdh zzfdh0) {
        HashSet hashSet0 = new HashSet();
        synchronized(this.zzd) {
            hashSet0.addAll(this.zzb);
            this.zzb.clear();
        }
        Bundle bundle0 = new Bundle();
        bundle0.putBundle("app", this.zza.zzb(context0, "0"));
        Bundle bundle1 = new Bundle();
        Iterator iterator0 = this.zzc.iterator();
        if(!iterator0.hasNext()) {
            bundle0.putBundle("slots", bundle1);
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: hashSet0) {
                arrayList0.add(((zzbzc)object0).zza());
            }
            bundle0.putParcelableArrayList("ads", arrayList0);
            zzfdh0.zzc(hashSet0);
            return bundle0;
        }
        Object object1 = iterator0.next();
        zzbzm zzbzm0 = (zzbzm)object1;
        throw null;
    }
}

