package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;

final class zzwl extends zzwz implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzwr zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzwl(int v, zzcy zzcy0, int v1, zzwr zzwr0, int v2, boolean z, zzfrj zzfrj0) {
        super(v, zzcy0, v1);
        int v11;
        int v7;
        int v5;
        this.zzh = zzwr0;
        this.zzg = zzxd.zzg(this.zzd.zzd);
        int v3 = 0;
        this.zzi = zzxd.zzn(v2, false);
        int v4;
        for(v4 = 0; true; ++v4) {
            v5 = 0x7FFFFFFF;
            if(v4 >= zzwr0.zzq.size()) {
                v7 = 0;
                v4 = 0x7FFFFFFF;
                break;
            }
            String s = (String)zzwr0.zzq.get(v4);
            int v6 = zzxd.zza(this.zzd, s, false);
            if(v6 > 0) {
                v7 = v6;
                break;
            }
        }
        this.zzk = v4;
        this.zzj = v7;
        this.zzl = 0;
        this.zzm = true;
        this.zzp = 1 == (this.zzd.zze & 1);
        this.zzq = this.zzd.zzz;
        this.zzr = this.zzd.zzA;
        this.zzs = this.zzd.zzi;
        this.zzf = zzfrj0.zza(this.zzd);
        Configuration configuration0 = Resources.getSystem().getConfiguration();
        String[] arr_s = zzfk.zza < 24 ? new String[]{zzfk.zzy(configuration0.locale)} : configuration0.getLocales().toLanguageTags().split(",", -1);
        for(int v8 = 0; v8 < arr_s.length; ++v8) {
            arr_s[v8] = zzfk.zzA(arr_s[v8]);
        }
        int v9;
        for(v9 = 0; true; ++v9) {
            if(v9 >= arr_s.length) {
                v11 = 0;
                v9 = 0x7FFFFFFF;
                break;
            }
            int v10 = zzxd.zza(this.zzd, arr_s[v9], false);
            if(v10 > 0) {
                v11 = v10;
                break;
            }
        }
        this.zzn = v9;
        this.zzo = v11;
        for(int v12 = 0; v12 < zzwr0.zzu.size(); ++v12) {
            String s1 = this.zzd.zzm;
            if(s1 != null && s1.equals(zzwr0.zzu.get(v12))) {
                v5 = v12;
                break;
            }
        }
        this.zzt = v5;
        this.zzu = (v2 & 0x180) == 0x80;
        this.zzv = (v2 & 0x40) == 0x40;
        zzwr zzwr1 = this.zzh;
        if(zzxd.zzn(v2, zzwr1.zzR)) {
            boolean z1 = this.zzf;
            if(z1 || zzwr1.zzL) {
                v3 = !zzxd.zzn(v2, false) || !z1 || this.zzd.zzi == -1 || !zzwr1.zzT && z ? 1 : 2;
            }
        }
        this.zze = v3;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.zza(((zzwl)object0));
    }

    public final int zza(zzwl zzwl0) {
        zzfvm zzfvm0 = !this.zzf || !this.zzi ? zzxd.zze().zza() : zzxd.zze();
        zzfts zzfts0 = zzfts.zzj().zzd(this.zzi, zzwl0.zzi);
        zzfvm zzfvm1 = zzfvm.zzc().zza();
        zzfts zzfts1 = zzfts0.zzc(this.zzk, zzwl0.zzk, zzfvm1).zzb(this.zzj, zzwl0.zzj).zzb(this.zzl, zzwl0.zzl).zzd(this.zzp, zzwl0.zzp).zzd(true, true);
        zzfvm zzfvm2 = zzfvm.zzc().zza();
        zzfts zzfts2 = zzfts1.zzc(this.zzn, zzwl0.zzn, zzfvm2).zzb(this.zzo, zzwl0.zzo).zzd(this.zzf, zzwl0.zzf);
        zzfvm zzfvm3 = zzfvm.zzc().zza();
        zzfts zzfts3 = zzfts2.zzc(this.zzt, zzwl0.zzt, zzfvm3).zzc(this.zzs, zzwl0.zzs, zzxd.zzf()).zzd(this.zzu, zzwl0.zzu).zzd(this.zzv, zzwl0.zzv).zzc(this.zzq, zzwl0.zzq, zzfvm0).zzc(this.zzr, zzwl0.zzr, zzfvm0);
        Integer integer0 = this.zzs;
        Integer integer1 = zzwl0.zzs;
        if(!zzfk.zzD(this.zzg, zzwl0.zzg)) {
            zzfvm0 = zzxd.zzf();
        }
        return zzfts3.zzc(integer0, integer1, zzfvm0).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzwz
    public final int zzb() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzwz
    public final boolean zzc(zzwz zzwz0) {
        zzam zzam0 = this.zzd;
        int v = zzam0.zzz;
        if(v != -1) {
            zzam zzam1 = ((zzwl)zzwz0).zzd;
            if(v == zzam1.zzz && (zzam0.zzm != null && TextUtils.equals(zzam0.zzm, zzam1.zzm))) {
                int v1 = this.zzd.zzA;
                return v1 != -1 && v1 == ((zzwl)zzwz0).zzd.zzA && this.zzu == ((zzwl)zzwz0).zzu && this.zzv == ((zzwl)zzwz0).zzv;
            }
        }
        return false;
    }
}

