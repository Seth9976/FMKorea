package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzlf {
    private final zzoh zza;
    private final List zzb;
    private final IdentityHashMap zzc;
    private final Map zzd;
    private final zzle zze;
    private final HashMap zzf;
    private final Set zzg;
    private final zzlx zzh;
    private final zzej zzi;
    private boolean zzj;
    private zzhk zzk;
    private zzvm zzl;

    public zzlf(zzle zzle0, zzlx zzlx0, zzej zzej0, zzoh zzoh0) {
        this.zza = zzoh0;
        this.zze = zzle0;
        this.zzl = new zzvm(0);
        this.zzc = new IdentityHashMap();
        this.zzd = new HashMap();
        this.zzb = new ArrayList();
        this.zzh = zzlx0;
        this.zzi = zzej0;
        this.zzf = new HashMap();
        this.zzg = new HashSet();
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzcw zzb() {
        if(!this.zzb.isEmpty()) {
            int v1 = 0;
            for(int v = 0; v < this.zzb.size(); ++v) {
                zzld zzld0 = (zzld)this.zzb.get(v);
                zzld0.zzd = v1;
                v1 += zzld0.zza.zzC().zzc();
            }
            return new zzll(this.zzb, this.zzl);
        }
        return zzcw.zza;
    }

    public final zzcw zzc(int v, int v1, List list0) {
        boolean z = true;
        zzdy.zzd(v >= 0 && v <= v1 && v1 <= this.zza());
        if(list0.size() != v1 - v) {
            z = false;
        }
        zzdy.zzd(z);
        for(int v2 = v; v2 < v1; ++v2) {
            ((zzld)this.zzb.get(v2)).zza.zzt(((zzbp)list0.get(v2 - v)));
        }
        return this.zzb();
    }

    static zzej zzd(zzlf zzlf0) {
        return zzlf0.zzi;
    }

    static zzlx zze(zzlf zzlf0) {
        return zzlf0.zzh;
    }

    // 检测为 Lambda 实现
    final void zzf(zztu zztu0, zzcw zzcw0) [...]

    public final void zzg(zzhk zzhk0) {
        zzdy.zzf(!this.zzj);
        this.zzk = zzhk0;
        for(int v = 0; v < this.zzb.size(); ++v) {
            zzld zzld0 = (zzld)this.zzb.get(v);
            this.zzv(zzld0);
            this.zzg.add(zzld0);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for(Object object0: this.zzf.values()) {
            zzlc zzlc0 = (zzlc)object0;
            try {
                zzlc0.zza.zzp(zzlc0.zzb);
            }
            catch(RuntimeException runtimeException0) {
                zzes.zzd("MediaSourceList", "Failed to release child source.", runtimeException0);
            }
            zzlc0.zza.zzs(zzlc0.zzc);
            zzlc0.zza.zzr(zzlc0.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zztq zztq0) {
        zzld zzld0 = (zzld)this.zzc.remove(zztq0);
        zzld0.getClass();
        zzld0.zza.zzG(zztq0);
        zzld0.zzc.remove(((zztk)zztq0).zza);
        if(!this.zzc.isEmpty()) {
            this.zzt();
        }
        this.zzu(zzld0);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzcw zzk(int v, List list0, zzvm zzvm0) {
        if(!list0.isEmpty()) {
            this.zzl = zzvm0;
            for(int v1 = v; v1 < list0.size() + v; ++v1) {
                zzld zzld0 = (zzld)list0.get(v1 - v);
                if(v1 > 0) {
                    zzld zzld1 = (zzld)this.zzb.get(v1 - 1);
                    zzld0.zzc(zzld1.zzd + zzld1.zza.zzC().zzc());
                }
                else {
                    zzld0.zzc(0);
                }
                this.zzr(v1, zzld0.zza.zzC().zzc());
                this.zzb.add(v1, zzld0);
                this.zzd.put(zzld0.zzb, zzld0);
                if(this.zzj) {
                    this.zzv(zzld0);
                    if(this.zzc.isEmpty()) {
                        this.zzg.add(zzld0);
                    }
                    else {
                        this.zzs(zzld0);
                    }
                }
            }
        }
        return this.zzb();
    }

    public final zzcw zzl(int v, int v1, int v2, zzvm zzvm0) {
        zzdy.zzd(this.zza() >= 0);
        this.zzl = null;
        return this.zzb();
    }

    public final zzcw zzm(int v, int v1, zzvm zzvm0) {
        zzdy.zzd(v >= 0 && v <= v1 && v1 <= this.zza());
        this.zzl = zzvm0;
        this.zzw(v, v1);
        return this.zzb();
    }

    public final zzcw zzn(List list0, zzvm zzvm0) {
        this.zzw(0, this.zzb.size());
        return this.zzk(this.zzb.size(), list0, zzvm0);
    }

    public final zzcw zzo(zzvm zzvm0) {
        int v = this.zza();
        if(zzvm0.zzc() != v) {
            zzvm0 = zzvm0.zzf().zzg(0, v);
        }
        this.zzl = zzvm0;
        return this.zzb();
    }

    public final zztq zzp(zzts zzts0, zzxu zzxu0, long v) {
        Object object0 = ((Pair)zzts0.zza).first;
        zzts zzts1 = zzts0.zzc(((Pair)zzts0.zza).second);
        zzld zzld0 = (zzld)this.zzd.get(object0);
        zzld0.getClass();
        this.zzg.add(zzld0);
        zzlc zzlc0 = (zzlc)this.zzf.get(zzld0);
        if(zzlc0 != null) {
            zzlc0.zza.zzk(zzlc0.zzb);
        }
        zzld0.zzc.add(zzts1);
        zztq zztq0 = zzld0.zza.zzH(zzts1, zzxu0, v);
        this.zzc.put(zztq0, zzld0);
        this.zzt();
        return zztq0;
    }

    public final zzvm zzq() {
        return this.zzl;
    }

    private final void zzr(int v, int v1) {
        while(v < this.zzb.size()) {
            zzld zzld0 = (zzld)this.zzb.get(v);
            zzld0.zzd += v1;
            ++v;
        }
    }

    private final void zzs(zzld zzld0) {
        zzlc zzlc0 = (zzlc)this.zzf.get(zzld0);
        if(zzlc0 != null) {
            zzlc0.zza.zzi(zzlc0.zzb);
        }
    }

    private final void zzt() {
        Iterator iterator0 = this.zzg.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            zzld zzld0 = (zzld)object0;
            if(zzld0.zzc.isEmpty()) {
                this.zzs(zzld0);
                iterator0.remove();
            }
        }
    }

    private final void zzu(zzld zzld0) {
        if(zzld0.zze && zzld0.zzc.isEmpty()) {
            zzlc zzlc0 = (zzlc)this.zzf.remove(zzld0);
            zzlc0.getClass();
            zzlc0.zza.zzp(zzlc0.zzb);
            zzlc0.zza.zzs(zzlc0.zzc);
            zzlc0.zza.zzr(zzlc0.zzc);
            this.zzg.remove(zzld0);
        }
    }

    private final void zzv(zzld zzld0) {
        zzkv zzkv0 = (zztu zztu0, zzcw zzcw0) -> this.zze.zzh();
        zzlb zzlb0 = new zzlb(this, zzld0);
        zzlc zzlc0 = new zzlc(zzld0.zza, zzkv0, zzlb0);
        this.zzf.put(zzld0, zzlc0);
        Handler handler0 = new Handler(zzfk.zzv(), null);
        zzld0.zza.zzh(handler0, zzlb0);
        Handler handler1 = new Handler(zzfk.zzv(), null);
        zzld0.zza.zzg(handler1, zzlb0);
        zzld0.zza.zzm(zzkv0, this.zzk, this.zza);
    }

    private final void zzw(int v, int v1) {
        while(true) {
            --v1;
            if(v1 < v) {
                break;
            }
            zzld zzld0 = (zzld)this.zzb.remove(v1);
            this.zzd.remove(zzld0.zzb);
            this.zzr(v1, -zzld0.zza.zzC().zzc());
            zzld0.zze = true;
            if(this.zzj) {
                this.zzu(zzld0);
            }
        }
    }
}

