package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class zzvz extends zzwb {
    private final zzxt zzd;
    private final zzfud zze;
    private final zzdz zzf;

    protected zzvz(zzcy zzcy0, int[] arr_v, int v, zzxt zzxt0, long v1, long v2, long v3, int v4, int v5, float f, float f1, List list0, zzdz zzdz0) {
        super(zzcy0, arr_v, 0);
        this.zzd = zzxt0;
        this.zze = zzfud.zzj(list0);
        this.zzf = zzdz0;
    }

    static zzfud zzf(zzxe[] arr_zzxe) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < 2; ++v) {
            zzxe zzxe0 = arr_zzxe[v];
            if(zzxe0 == null || zzxe0.zzb.length <= 1) {
                arrayList0.add(null);
            }
            else {
                zzfua zzfua0 = new zzfua();
                zzfua0.zzf(new zzvx(0L, 0L));
                arrayList0.add(zzfua0);
            }
        }
        long[][] arr2_v = new long[2][];
        for(int v1 = 0; v1 < 2; ++v1) {
            zzxe zzxe1 = arr_zzxe[v1];
            if(zzxe1 == null) {
                arr2_v[v1] = new long[0];
            }
            else {
                arr2_v[v1] = new long[zzxe1.zzb.length];
                for(int v2 = 0; true; ++v2) {
                    int[] arr_v = zzxe1.zzb;
                    if(v2 >= arr_v.length) {
                        break;
                    }
                    long v3 = (long)zzxe1.zza.zzb(arr_v[v2]).zzi;
                    long[] arr_v1 = arr2_v[v1];
                    if(v3 == -1L) {
                        v3 = 0L;
                    }
                    arr_v1[v2] = v3;
                }
                Arrays.sort(arr2_v[v1]);
            }
        }
        int[] arr_v2 = new int[2];
        long[] arr_v3 = new long[2];
        for(int v4 = 0; v4 < 2; ++v4) {
            long[] arr_v4 = arr2_v[v4];
            arr_v3[v4] = arr_v4.length == 0 ? 0L : arr_v4[0];
        }
        zzvz.zzg(arrayList0, arr_v3);
        zzfuo zzfuo0 = zzfvh.zzc(zzfvm.zzc()).zzb(2).zza();
        for(int v5 = 0; v5 < 2; ++v5) {
            int v6 = arr2_v[v5].length;
            if(v6 > 1) {
                double[] arr_f = new double[v6];
                for(int v7 = 0; true; ++v7) {
                    long[] arr_v5 = arr2_v[v5];
                    double f = 0.0;
                    if(v7 >= arr_v5.length) {
                        break;
                    }
                    long v8 = arr_v5[v7];
                    if(v8 != -1L) {
                        f = Math.log(v8);
                    }
                    arr_f[v7] = f;
                }
                int v9 = v6 - 1;
                double f1 = arr_f[v9] - arr_f[0];
                int v10 = 0;
                while(v10 < v9) {
                    double f2 = arr_f[v10];
                    ++v10;
                    zzfuo0.zzq(((double)(f1 == 0.0 ? 1.0 : ((f2 + arr_f[v10]) * 0.5 - arr_f[0]) / f1)), v5);
                }
            }
        }
        zzfud zzfud0 = zzfud.zzj(zzfuo0.zzr());
        for(int v11 = 0; v11 < zzfud0.size(); ++v11) {
            int v12 = (int)(((Integer)zzfud0.get(v11)));
            int v13 = arr_v2[v12] + 1;
            arr_v2[v12] = v13;
            arr_v3[v12] = arr2_v[v12][v13];
            zzvz.zzg(arrayList0, arr_v3);
        }
        for(int v14 = 0; v14 < 2; ++v14) {
            if(arrayList0.get(v14) != null) {
                long v15 = arr_v3[v14];
                arr_v3[v14] = v15 + v15;
            }
        }
        zzvz.zzg(arrayList0, arr_v3);
        zzfua zzfua1 = new zzfua();
        for(int v16 = 0; v16 < arrayList0.size(); ++v16) {
            zzfua zzfua2 = (zzfua)arrayList0.get(v16);
            zzfua1.zzf((zzfua2 == null ? zzfud.zzl() : zzfua2.zzi()));
        }
        return zzfua1.zzi();
    }

    private static void zzg(List list0, long[] arr_v) {
        long v1 = 0L;
        for(int v2 = 0; v2 < 2; ++v2) {
            v1 += arr_v[v2];
        }
        for(int v = 0; v < list0.size(); ++v) {
            zzfua zzfua0 = (zzfua)list0.get(v);
            if(zzfua0 != null) {
                zzfua0.zzf(new zzvx(v1, arr_v[v]));
            }
        }
    }
}

