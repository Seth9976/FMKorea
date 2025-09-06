package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

final class zzfdo implements zzfdn {
    private final ConcurrentHashMap zza;
    private final zzfdu zzb;
    private final zzfdq zzc;

    public zzfdo(zzfdu zzfdu0) {
        this.zza = new ConcurrentHashMap(zzfdu0.zzd);
        this.zzb = zzfdu0;
        this.zzc = new zzfdq();
    }

    @Override  // com.google.android.gms.internal.ads.zzfdn
    public final zzfdu zza() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfdn
    public final zzfdw zzb(zzfdx zzfdx0) {
        zzfdw zzfdw0;
        synchronized(this) {
            zzfdm zzfdm0 = (zzfdm)this.zza.get(zzfdx0);
            if(zzfdm0 == null) {
                this.zzc.zzf();
                this.zzf();
                zzfdw0 = null;
            }
            else {
                zzfdw0 = zzfdm0.zze();
                if(zzfdw0 == null) {
                    this.zzc.zze();
                }
                zzfek zzfek0 = zzfdm0.zzf();
                if(zzfdw0 != null) {
                    zzaxt zzaxt0 = zzaxz.zza();
                    zzaxr zzaxr0 = zzaxs.zza();
                    zzaxr0.zzd(2);
                    zzaxv zzaxv0 = zzaxw.zza();
                    zzaxv0.zza(zzfek0.zza);
                    zzaxv0.zzb(zzfek0.zzb);
                    zzaxr0.zza(zzaxv0);
                    zzaxt0.zza(zzaxr0);
                    zzaxz zzaxz0 = (zzaxz)zzaxt0.zzal();
                    zzfdw0.zza.zzb().zzc().zzi(zzaxz0);
                }
                this.zzf();
            }
            return zzfdw0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfdn
    @Deprecated
    public final zzfdx zzc(zzl zzl0, String s, zzw zzw0) {
        return new zzfdy(zzl0, s, new zzbur(this.zzb.zza).zza().zzk, this.zzb.zzf, zzw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfdn
    public final boolean zzd(zzfdx zzfdx0, zzfdw zzfdw0) {
        synchronized(this) {
            zzfdm zzfdm0 = (zzfdm)this.zza.get(zzfdx0);
            zzfdw0.zzd = zzt.zzB().currentTimeMillis();
            if(zzfdm0 == null) {
                zzfdm0 = new zzfdm(this.zzb.zzd, this.zzb.zze * 1000);
                zzfdu zzfdu0 = this.zzb;
                if(this.zza.size() == zzfdu0.zzc) {
                    long v1 = 0x7FFFFFFFFFFFFFFFL;
                    int v2 = zzfdu0.zzg - 1;
                    zzfdx zzfdx1 = null;
                    if(zzfdu0.zzg == 0) {
                        throw null;
                    }
                    if(v2 == 0) {
                        for(Object object2: this.zza.entrySet()) {
                            Map.Entry map$Entry2 = (Map.Entry)object2;
                            if(((zzfdm)map$Entry2.getValue()).zzc() < v1) {
                                v1 = ((zzfdm)map$Entry2.getValue()).zzc();
                                zzfdx1 = (zzfdx)map$Entry2.getKey();
                            }
                        }
                        if(zzfdx1 != null) {
                            this.zza.remove(zzfdx1);
                        }
                    }
                    else {
                        switch(v2) {
                            case 1: {
                                for(Object object0: this.zza.entrySet()) {
                                    Map.Entry map$Entry0 = (Map.Entry)object0;
                                    if(((zzfdm)map$Entry0.getValue()).zzd() < v1) {
                                        v1 = ((zzfdm)map$Entry0.getValue()).zzd();
                                        zzfdx1 = (zzfdx)map$Entry0.getKey();
                                    }
                                }
                                if(zzfdx1 != null) {
                                    this.zza.remove(zzfdx1);
                                }
                                break;
                            }
                            case 2: {
                                int v3 = 0x7FFFFFFF;
                                for(Object object1: this.zza.entrySet()) {
                                    Map.Entry map$Entry1 = (Map.Entry)object1;
                                    if(((zzfdm)map$Entry1.getValue()).zza() < v3) {
                                        v3 = ((zzfdm)map$Entry1.getValue()).zza();
                                        zzfdx1 = (zzfdx)map$Entry1.getKey();
                                    }
                                }
                                if(zzfdx1 != null) {
                                    this.zza.remove(zzfdx1);
                                }
                            }
                        }
                    }
                    this.zzc.zzg();
                }
                this.zza.put(zzfdx0, zzfdm0);
                this.zzc.zzd();
            }
            boolean z = zzfdm0.zzh(zzfdw0);
            this.zzc.zzc();
            zzfdp zzfdp0 = this.zzc.zza();
            zzfek zzfek0 = zzfdm0.zzf();
            zzaxt zzaxt0 = zzaxz.zza();
            zzaxr zzaxr0 = zzaxs.zza();
            zzaxr0.zzd(2);
            zzaxx zzaxx0 = zzaxy.zza();
            zzaxx0.zza(zzfdp0.zza);
            zzaxx0.zzb(zzfdp0.zzb);
            zzaxx0.zzc(zzfek0.zzb);
            zzaxr0.zzc(zzaxx0);
            zzaxt0.zza(zzaxr0);
            zzaxz zzaxz0 = (zzaxz)zzaxt0.zzal();
            zzfdw0.zza.zzb().zzc().zzj(zzaxz0);
            this.zzf();
            return z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfdn
    public final boolean zze(zzfdx zzfdx0) {
        synchronized(this) {
            zzfdm zzfdm0 = (zzfdm)this.zza.get(zzfdx0);
            if(zzfdm0 != null) {
                int v1 = zzfdm0.zzb();
                return v1 < this.zzb.zzd;
            }
            return true;
        }
    }

    private final void zzf() {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzgk)).booleanValue()) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(this.zzb.zzb);
            stringBuilder0.append(" PoolCollection");
            stringBuilder0.append("\n\tPool does not exist: 0\n\tNew pools created: 0\n\tPools removed: 0\n\tEntries added: 0\n\tNo entries retrieved: 0\n");
            int v = 0;
            for(Object object0: this.zza.entrySet()) {
                ++v;
                stringBuilder0.append(v);
                stringBuilder0.append(". ");
                stringBuilder0.append(((Map.Entry)object0).getValue());
                stringBuilder0.append("#");
                stringBuilder0.append(((zzfdx)((Map.Entry)object0).getKey()).hashCode());
                stringBuilder0.append("    ");
                for(int v1 = 0; v1 < ((zzfdm)((Map.Entry)object0).getValue()).zzb(); ++v1) {
                    stringBuilder0.append("[O]");
                }
                for(int v2 = ((zzfdm)((Map.Entry)object0).getValue()).zzb(); v2 < this.zzb.zzd; ++v2) {
                    stringBuilder0.append("[ ]");
                }
                stringBuilder0.append("\n");
                stringBuilder0.append(((zzfdm)((Map.Entry)object0).getValue()).zzg());
                stringBuilder0.append("\n");
            }
            while(v < this.zzb.zzc) {
                ++v;
                stringBuilder0.append(v);
                stringBuilder0.append(".\n");
            }
            zzcaa.zze(stringBuilder0.toString());
        }
    }
}

