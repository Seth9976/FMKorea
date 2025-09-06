package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzxd extends zzxi implements zzlo {
    public final Context zza;
    public static final int zzb;
    private static final zzfvm zzc;
    private static final zzfvm zzd;
    private final Object zze;
    private final boolean zzf;
    private zzwr zzg;
    private zzww zzh;
    private zzk zzi;
    private final zzvy zzj;

    static {
        zzxd.zzc = zzfvm.zzb(zzwj.zza);
        zzxd.zzd = zzfvm.zzb(zzwk.zza);
    }

    public zzxd(Context context0) {
        zzvy zzvy0 = new zzvy();
        zzwr zzwr0 = zzwr.zzd(context0);
        super();
        this.zze = new Object();
        this.zza = context0 == null ? null : context0.getApplicationContext();
        this.zzj = zzvy0;
        this.zzg = zzwr0;
        this.zzi = zzk.zza;
        boolean z = context0 != null && zzfk.zzF(context0);
        this.zzf = z;
        if(!z && context0 != null && zzfk.zza >= 0x20) {
            this.zzh = zzww.zza(context0);
        }
        if(this.zzg.zzQ && context0 == null) {
            zzes.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    protected static int zza(zzam zzam0, String s, boolean z) {
        if(!TextUtils.isEmpty(s) && s.equals(zzam0.zzd)) {
            return 4;
        }
        String s1 = zzxd.zzg(s);
        String s2 = zzxd.zzg(zzam0.zzd);
        if(s2 != null && s1 != null) {
            if(!s2.startsWith(s1) && !s1.startsWith(s2)) {
                return s2.split("-", 2)[0].equals(s1.split("-", 2)[0]) ? 2 : 0;
            }
            return 3;
        }
        return !z || s2 != null ? 0 : 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzxi
    protected final Pair zzb(zzxh zzxh0, int[][][] arr3_v, int[] arr_v, zzts zzts0, zzcw zzcw0) {
        zzwr zzwr0;
        zzxg zzxg0;
        boolean z;
        synchronized(this.zze) {
            zzwr0 = this.zzg;
            if(zzwr0.zzQ && zzfk.zza >= 0x20) {
                zzww zzww0 = this.zzh;
                if(zzww0 != null) {
                    Looper looper0 = Looper.myLooper();
                    zzdy.zzb(looper0);
                    zzww0.zzb(this, looper0);
                }
            }
        }
        zzxe[] arr_zzxe = new zzxe[2];
        Pair pair0 = zzxd.zzv(2, zzxh0, arr3_v, new zzwf(zzwr0, arr_v), (/* 缺少Lambda参数 */, /* 缺少Lambda参数 */) -> zzfts.zzj().zzc(((zzxc)Collections.max(((List)object0), zzxa.zza)), ((zzxc)Collections.max(((List)object1), zzxa.zza)), zzxa.zza).zzb(((List)object0).size(), ((List)object1).size()).zzc(((zzxc)Collections.max(((List)object0), zzxb.zza)), ((zzxc)Collections.max(((List)object1), zzxb.zza)), zzxb.zza).zza());
        if(pair0 != null) {
            arr_zzxe[((int)(((Integer)pair0.second)))] = (zzxe)pair0.first;
        }
        for(int v1 = 0; true; ++v1) {
            z = false;
            if(v1 >= 2) {
                break;
            }
            if(zzxh0.zzc(v1) == 2 && zzxh0.zzd(v1).zzc > 0) {
                z = true;
                break;
            }
        }
        Pair pair1 = zzxd.zzv(1, zzxh0, arr3_v, new zzwd(this, zzwr0, z), (/* 缺少Lambda参数 */, /* 缺少Lambda参数 */) -> ((zzwl)Collections.max(((List)object0))).zza(((zzwl)Collections.max(((List)object1)))));
        if(pair1 != null) {
            arr_zzxe[((int)(((Integer)pair1.second)))] = (zzxe)pair1.first;
        }
        Pair pair2 = zzxd.zzv(3, zzxh0, arr3_v, new zzwh(zzwr0, (pair1 == null ? null : ((zzxe)pair1.first).zza.zzb(((zzxe)pair1.first).zzb[0]).zzd)), (/* 缺少Lambda参数 */, /* 缺少Lambda参数 */) -> ((zzwx)((List)object0).get(0)).zza(((zzwx)((List)object1).get(0))));
        if(pair2 != null) {
            arr_zzxe[((int)(((Integer)pair2.second)))] = (zzxe)pair2.first;
        }
        for(int v2 = 0; v2 < 2; ++v2) {
            switch(zzxh0.zzc(v2)) {
                case 1: 
                case 2: 
                case 3: {
                    break;
                }
                default: {
                    zzvs zzvs0 = zzxh0.zzd(v2);
                    int[][] arr2_v = arr3_v[v2];
                    int v3 = 0;
                    int v4 = 0;
                    zzcy zzcy0 = null;
                    for(zzwm zzwm0 = null; v3 < zzvs0.zzc; zzwm0 = zzwm1) {
                        zzcy zzcy1 = zzvs0.zzb(v3);
                        int[] arr_v1 = arr2_v[v3];
                        zzwm zzwm1 = zzwm0;
                        for(int v5 = 0; v5 <= 0; ++v5) {
                            if(zzxd.zzn(arr_v1[v5], zzwr0.zzR)) {
                                zzwm zzwm2 = new zzwm(zzcy1.zzb(v5), arr_v1[v5]);
                                if(zzwm1 == null || zzwm2.zza(zzwm1) > 0) {
                                    zzwm1 = zzwm2;
                                    v4 = v5;
                                    zzcy0 = zzcy1;
                                }
                            }
                        }
                        ++v3;
                    }
                    arr_zzxe[v2] = zzcy0 == null ? null : new zzxe(zzcy0, new int[]{v4}, 0);
                }
            }
        }
        HashMap hashMap0 = new HashMap();
        for(int v6 = 0; v6 < 2; ++v6) {
            zzxd.zzt(zzxh0.zzd(v6), zzwr0, hashMap0);
        }
        zzxd.zzt(zzxh0.zze(), zzwr0, hashMap0);
        for(int v7 = 0; v7 < 2; ++v7) {
            if(((zzda)hashMap0.get(zzxh0.zzc(v7))) != null) {
                throw null;
            }
        }
        for(int v8 = 0; v8 < 2; ++v8) {
            zzvs zzvs1 = zzxh0.zzd(v8);
            if(zzwr0.zzg(v8, zzvs1)) {
                if(zzwr0.zze(v8, zzvs1) != null) {
                    throw null;
                }
                arr_zzxe[v8] = null;
                continue;
            }
        }
        for(int v9 = 0; v9 < 2; ++v9) {
            int v10 = zzxh0.zzc(v9);
            if(zzwr0.zzf(v9) || zzwr0.zzD.contains(v10)) {
                arr_zzxe[v9] = null;
            }
        }
        zzvy zzvy0 = this.zzj;
        zzxt zzxt0 = this.zzq();
        zzfud zzfud0 = zzvz.zzf(arr_zzxe);
        zzxf[] arr_zzxf = new zzxf[2];
        for(int v11 = 0; v11 < 2; ++v11) {
            zzxe zzxe0 = arr_zzxe[v11];
            if(zzxe0 != null) {
                int[] arr_v2 = zzxe0.zzb;
                int v12 = arr_v2.length;
                if(v12 != 0) {
                    if(v12 == 1) {
                        zzxg0 = new zzxg(zzxe0.zza, arr_v2[0], 0, 0, null);
                    }
                    else {
                        Object object1 = zzfud0.get(v11);
                        zzxg0 = zzvy0.zza(zzxe0.zza, arr_v2, 0, zzxt0, ((zzfud)object1));
                    }
                    arr_zzxf[v11] = zzxg0;
                }
            }
        }
        zzlq[] arr_zzlq = new zzlq[2];
        for(int v13 = 0; v13 < 2; ++v13) {
            int v14 = zzxh0.zzc(v13);
            arr_zzlq[v13] = zzwr0.zzf(v13) || zzwr0.zzD.contains(v14) || zzxh0.zzc(v13) != -2 && arr_zzxf[v13] == null ? null : zzlq.zza;
        }
        return Pair.create(arr_zzlq, arr_zzxf);
    }

    @Override  // com.google.android.gms.internal.ads.zzxl
    public final zzlo zzc() {
        return this;
    }

    public final zzwr zzd() {
        synchronized(this.zze) {
        }
        return this.zzg;
    }

    static zzfvm zze() {
        return zzxd.zzc;
    }

    static zzfvm zzf() {
        return zzxd.zzd;
    }

    // 去混淆评级： 低(20)
    protected static String zzg(String s) {
        return TextUtils.isEmpty(s) || TextUtils.equals(s, "und") ? null : s;
    }

    static void zzh(zzxd zzxd0) {
        zzxd0.zzu();
    }

    @Override  // com.google.android.gms.internal.ads.zzxl
    public final void zzi() {
        synchronized(this.zze) {
            if(zzfk.zza >= 0x20) {
                zzww zzww0 = this.zzh;
                if(zzww0 != null) {
                    zzww0.zzc();
                }
            }
        }
        super.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzxl
    public final void zzj(zzk zzk0) {
        synchronized(this.zze) {
            boolean z = this.zzi.equals(zzk0);
            this.zzi = zzk0;
        }
        if(!z) {
            this.zzu();
        }
    }

    public final void zzk(zzwp zzwp0) {
        zzwr zzwr0 = new zzwr(zzwp0, null);
        synchronized(this.zze) {
            boolean z = this.zzg.equals(zzwr0);
            this.zzg = zzwr0;
        }
        if(!z) {
            if(zzwr0.zzQ && this.zza == null) {
                zzes.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            this.zzs();
        }
    }

    public static boolean zzl(zzxd zzxd0, zzam zzam0) {
        int v1;
        boolean z = true;
        synchronized(zzxd0.zze) {
            if(zzxd0.zzg.zzQ && !zzxd0.zzf && zzam0.zzz > 2) {
                String s = zzam0.zzm;
                if(s == null) {
                label_18:
                    if(zzfk.zza < 0x20 || (zzxd0.zzh == null || !zzxd0.zzh.zzg() || !zzxd0.zzh.zze() || !zzxd0.zzh.zzf() || !zzxd0.zzh.zzd(zzxd0.zzi, zzam0))) {
                        z = false;
                    }
                }
                else {
                    switch(s) {
                        case "audio/ac3": {
                            v1 = 0;
                            break;
                        }
                        case "audio/ac4": {
                            v1 = 3;
                            break;
                        }
                        case "audio/eac3": {
                            v1 = 1;
                            break;
                        }
                        case "audio/eac3-joc": {
                            v1 = 2;
                            break;
                        }
                        default: {
                            v1 = -1;
                        }
                    }
                    if(v1 != 0 && v1 != 1 && v1 != 2 && v1 != 3 || zzfk.zza >= 0x20 && (zzxd0.zzh != null && zzxd0.zzh.zzg())) {
                        goto label_18;
                    }
                }
            }
            return z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzxl
    public final boolean zzm() {
        return true;
    }

    protected static boolean zzn(int v, boolean z) {
        return (v & 7) == 4 || z && (v & 7) == 3;
    }

    private static void zzt(zzvs zzvs0, zzdd zzdd0, Map map0) {
        for(int v = 0; v < zzvs0.zzc; ++v) {
            zzcy zzcy0 = zzvs0.zzb(v);
            if(((zzda)zzdd0.zzC.get(zzcy0)) != null) {
                throw null;
            }
        }
    }

    private final void zzu() {
        boolean z = false;
        synchronized(this.zze) {
            if(this.zzg.zzQ && !this.zzf && zzfk.zza >= 0x20 && (this.zzh != null && this.zzh.zzg())) {
                z = true;
            }
        }
        if(z) {
            this.zzs();
        }
    }

    private static final Pair zzv(int v, zzxh zzxh0, int[][][] arr3_v, zzwy zzwy0, Comparator comparator0) {
        zzfud zzfud0;
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < 2; ++v1) {
            if(v == zzxh0.zzc(v1)) {
                zzvs zzvs0 = zzxh0.zzd(v1);
                for(int v2 = 0; v2 < zzvs0.zzc; ++v2) {
                    List list0 = zzwy0.zza(v1, zzvs0.zzb(v2), arr3_v[v1][v2]);
                    boolean[] arr_z = new boolean[1];
                    for(int v3 = 0; v3 <= 0; ++v3) {
                        zzwz zzwz0 = (zzwz)list0.get(v3);
                        int v4 = zzwz0.zzb();
                        if(!arr_z[v3] && v4 != 0) {
                            if(v4 == 1) {
                                zzfud0 = zzfud.zzm(zzwz0);
                            }
                            else {
                                ArrayList arrayList1 = new ArrayList();
                                arrayList1.add(zzwz0);
                                for(int v5 = v3 + 1; v5 <= 0; ++v5) {
                                    zzwz zzwz1 = (zzwz)list0.get(v5);
                                    if(zzwz1.zzb() == 2 && zzwz0.zzc(zzwz1)) {
                                        arrayList1.add(zzwz1);
                                        arr_z[v5] = true;
                                    }
                                }
                                zzfud0 = arrayList1;
                            }
                            arrayList0.add(zzfud0);
                        }
                    }
                }
            }
        }
        if(arrayList0.isEmpty()) {
            return null;
        }
        List list1 = (List)Collections.max(arrayList0, comparator0);
        int[] arr_v = new int[list1.size()];
        for(int v6 = 0; v6 < list1.size(); ++v6) {
            arr_v[v6] = ((zzwz)list1.get(v6)).zzc;
        }
        zzwz zzwz2 = (zzwz)list1.get(0);
        return Pair.create(new zzxe(zzwz2.zzb, arr_v, 0), zzwz2.zza);
    }
}

