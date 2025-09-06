package com.google.android.gms.internal.ads;

import androidx.collection.g;
import java.util.ArrayList;

public final class zzdin {
    public static final zzdin zza;
    private final zzbfx zzb;
    private final zzbfu zzc;
    private final zzbgk zzd;
    private final zzbgh zze;
    private final zzblj zzf;
    private final g zzg;
    private final g zzh;

    static {
        zzdin.zza = new zzdin(new zzdil());
    }

    private zzdin(zzdil zzdil0) {
        this.zzb = zzdil0.zza;
        this.zzc = zzdil0.zzb;
        this.zzd = zzdil0.zzc;
        this.zzg = new g(zzdil0.zzf);
        this.zzh = new g(zzdil0.zzg);
        this.zze = zzdil0.zzd;
        this.zzf = zzdil0.zze;
    }

    zzdin(zzdil zzdil0, zzdim zzdim0) {
        this(zzdil0);
    }

    public final zzbfu zza() {
        return this.zzc;
    }

    public final zzbfx zzb() {
        return this.zzb;
    }

    public final zzbga zzc(String s) {
        return (zzbga)this.zzh.get(s);
    }

    public final zzbgd zzd(String s) {
        return (zzbgd)this.zzg.get(s);
    }

    public final zzbgh zze() {
        return this.zze;
    }

    public final zzbgk zzf() {
        return this.zzd;
    }

    public final zzblj zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList0 = new ArrayList(this.zzg.size());
        for(int v = 0; v < this.zzg.size(); ++v) {
            arrayList0.add(((String)this.zzg.j(v)));
        }
        return arrayList0;
    }

    public final ArrayList zzi() {
        ArrayList arrayList0 = new ArrayList();
        if(this.zzd != null) {
            arrayList0.add("6");
        }
        if(this.zzb != null) {
            arrayList0.add("1");
        }
        if(this.zzc != null) {
            arrayList0.add("2");
        }
        if(!this.zzg.isEmpty()) {
            arrayList0.add("3");
        }
        if(this.zzf != null) {
            arrayList0.add("7");
        }
        return arrayList0;
    }
}

