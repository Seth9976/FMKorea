package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

public final class zzgow {
    public static final zzgow zza;
    public static final zzgow zzb;
    public static final zzgow zzc;
    public static final zzgow zzd;
    public static final zzgow zze;
    public static final zzgow zzf;
    public static final zzgow zzg;
    private final zzgov zzh;

    static {
        zzgow.zza = new zzgow(new zzgox());
        zzgow.zzb = new zzgow(new zzgpb());
        zzgow.zzc = new zzgow(new zzgpd());
        zzgow.zzd = new zzgow(new zzgpc());
        zzgow.zze = new zzgow(new zzgoy());
        zzgow.zzf = new zzgow(new zzgpa());
        zzgow.zzg = new zzgow(new zzgoz());
    }

    public zzgow(zzgpe zzgpe0) {
        if(zzgfk.zzb()) {
            this.zzh = new zzgou(zzgpe0, null);
            return;
        }
        if(zzgpl.zza()) {
            this.zzh = new zzgoq(zzgpe0, null);
            return;
        }
        this.zzh = new zzgos(zzgpe0, null);
    }

    public final Object zza(String s) {
        return this.zzh.zza(s);
    }

    public static List zzb(String[] arr_s) {
        List list0 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            Provider provider0 = Security.getProvider(arr_s[v]);
            if(provider0 != null) {
                list0.add(provider0);
            }
        }
        return list0;
    }
}

