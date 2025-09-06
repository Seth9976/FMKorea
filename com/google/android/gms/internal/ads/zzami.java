package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

final class zzami {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    zzami(String s, zzaky zzaky0) {
        String s1 = zzaky0.zzb;
        long v = zzaky0.zzc;
        long v1 = zzaky0.zzd;
        long v2 = zzaky0.zze;
        long v3 = zzaky0.zzf;
        List list0 = zzaky0.zzh;
        if(list0 == null) {
            Map map0 = zzaky0.zzg;
            list0 = new ArrayList(map0.size());
            for(Object object0: map0.entrySet()) {
                list0.add(new zzalh(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue())));
            }
        }
        this(s, s1, v, v1, v2, v3, list0);
    }

    private zzami(String s, String s1, long v, long v1, long v2, long v3, List list0) {
        this.zzb = s;
        if("".equals(s1)) {
            s1 = null;
        }
        this.zzc = s1;
        this.zzd = v;
        this.zze = v1;
        this.zzf = v2;
        this.zzg = v3;
        this.zzh = list0;
    }

    static zzami zza(zzamj zzamj0) {
        if(zzaml.zze(zzamj0) != 0x20150306) {
            throw new IOException();
        }
        String s = zzaml.zzh(zzamj0);
        String s1 = zzaml.zzh(zzamj0);
        long v = zzaml.zzf(zzamj0);
        long v1 = zzaml.zzf(zzamj0);
        long v2 = zzaml.zzf(zzamj0);
        long v3 = zzaml.zzf(zzamj0);
        int v4 = zzaml.zze(zzamj0);
        if(v4 < 0) {
            throw new IOException("readHeaderList size=" + v4);
        }
        List list0 = v4 == 0 ? Collections.emptyList() : new ArrayList();
        for(int v5 = 0; v5 < v4; ++v5) {
            list0.add(new zzalh(zzaml.zzh(zzamj0).intern(), zzaml.zzh(zzamj0).intern()));
        }
        return new zzami(s, s1, v, v1, v2, v3, list0);
    }
}

