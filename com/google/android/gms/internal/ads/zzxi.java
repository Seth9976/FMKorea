package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

public abstract class zzxi extends zzxl {
    private zzxh zza;

    protected abstract Pair zzb(zzxh arg1, int[][][] arg2, int[] arg3, zzts arg4, zzcw arg5);

    @Override  // com.google.android.gms.internal.ads.zzxl
    public final zzxm zzo(zzlp[] arr_zzlp, zzvs zzvs0, zzts zzts0, zzcw zzcw0) {
        boolean z1;
        int[] arr_v = new int[3];
        zzcy[][] arr2_zzcy = new zzcy[3][];
        int[][][] arr3_v = new int[3][][];
        for(int v = 0; v < 3; ++v) {
            arr2_zzcy[v] = new zzcy[zzvs0.zzc];
            arr3_v[v] = new int[zzvs0.zzc][];
        }
        int[] arr_v1 = new int[2];
        for(int v1 = 0; v1 < 2; ++v1) {
            arr_v1[v1] = arr_zzlp[v1].zze();
        }
        for(int v2 = 0; v2 < zzvs0.zzc; ++v2) {
            zzcy zzcy0 = zzvs0.zzb(v2);
            int v3 = zzcy0.zzd;
            int v4 = 2;
            int v5 = 0;
            int v6 = 1;
            for(int v7 = 0; v7 < 2; ++v7) {
                zzlp zzlp0 = arr_zzlp[v7];
                int v8 = 0;
                for(int v9 = 0; v9 <= 0; ++v9) {
                    v8 = Math.max(v8, zzlp0.zzU(zzcy0.zzb(v9)) & 7);
                }
                int v10 = arr_v[v7] == 0 ? 1 : 0;
                if(v8 > v5) {
                    v6 = v10;
                    v4 = v7;
                    v5 = v8;
                }
                else if(v8 == v5 && v3 == 5 && v6 == 0 && v10 != 0) {
                    v4 = v7;
                    v5 = v8;
                    v6 = 1;
                }
            }
            int[] arr_v2 = v4 == 2 ? new int[1] : new int[]{arr_zzlp[v4].zzU(zzcy0.zzb(0))};
            int v11 = arr_v[v4];
            arr2_zzcy[v4][v11] = zzcy0;
            arr3_v[v4][v11] = arr_v2;
            arr_v[v4] = v11 + 1;
        }
        zzvs[] arr_zzvs = new zzvs[2];
        String[] arr_s = new String[2];
        int[] arr_v3 = new int[2];
        for(int v12 = 0; v12 < 2; ++v12) {
            int v13 = arr_v[v12];
            arr_zzvs[v12] = new zzvs(((zzcy[])zzfk.zzH(arr2_zzcy[v12], v13)));
            arr3_v[v12] = (int[][])zzfk.zzH(arr3_v[v12], v13);
            arr_s[v12] = arr_zzlp[v12].zzQ();
            arr_v3[v12] = arr_zzlp[v12].zzb();
        }
        zzxh zzxh0 = new zzxh(arr_s, arr_v3, arr_zzvs, arr_v1, arr3_v, new zzvs(((zzcy[])zzfk.zzH(arr2_zzcy[2], arr_v[2]))));
        Pair pair0 = this.zzb(zzxh0, arr3_v, arr_v1, zzts0, zzcw0);
        zzxj[] arr_zzxj = (zzxj[])pair0.second;
        List[] arr_list = new List[arr_zzxj.length];
        for(int v14 = 0; v14 < arr_zzxj.length; ++v14) {
            zzxj zzxj0 = arr_zzxj[v14];
            arr_list[v14] = zzxj0 == null ? zzfud.zzl() : zzfud.zzm(zzxj0);
        }
        zzfua zzfua0 = new zzfua();
        int v15 = 0;
        while(v15 < 2) {
            zzvs zzvs1 = zzxh0.zzd(v15);
            List list0 = arr_list[v15];
            int v16 = 0;
            while(v16 < zzvs1.zzc) {
                zzcy zzcy1 = zzvs1.zzb(v16);
                boolean z = zzxh0.zza(v15, v16, false) != 0;
                int[] arr_v4 = new int[1];
                boolean[] arr_z = new boolean[1];
                int v17 = 0;
                while(v17 <= 0) {
                    arr_v4[v17] = zzxh0.zzb(v15, v16, v17) & 7;
                    int v18 = 0;
                    while(true) {
                        z1 = false;
                        if(v18 < list0.size()) {
                            zzxj zzxj1 = (zzxj)list0.get(v18);
                            if(!zzxj1.zze().equals(zzcy1) || zzxj1.zzb(v17) == -1) {
                                ++v18;
                                continue;
                            }
                            else {
                                z1 = true;
                            }
                        }
                        break;
                    }
                    arr_z[v17] = z1;
                    ++v17;
                }
                zzfua0.zzf(new zzdg(zzcy1, z, arr_v4, arr_z));
                ++v16;
            }
            ++v15;
        }
        zzvs zzvs2 = zzxh0.zze();
        for(int v19 = 0; v19 < zzvs2.zzc; ++v19) {
            zzcy zzcy2 = zzvs2.zzb(v19);
            int[] arr_v5 = new int[1];
            Arrays.fill(arr_v5, 0);
            zzfua0.zzf(new zzdg(zzcy2, false, arr_v5, new boolean[1]));
        }
        zzdh zzdh0 = new zzdh(zzfua0.zzi());
        return new zzxm(((zzlq[])pair0.first), ((zzxf[])pair0.second), zzdh0, zzxh0);
    }

    @Override  // com.google.android.gms.internal.ads.zzxl
    public final void zzp(Object object0) {
        this.zza = (zzxh)object0;
    }
}

