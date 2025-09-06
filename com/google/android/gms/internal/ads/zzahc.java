package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzahc implements zzabb, zzaca {
    public static final zzabi zza;
    private final zzfb zzb;
    private final zzfb zzc;
    private final zzfb zzd;
    private final zzfb zze;
    private final ArrayDeque zzf;
    private final zzahe zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzfb zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzabe zzr;
    private zzahb[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzaff zzx;

    static {
        zzahc.zza = (Uri uri0, Map map0) -> new zzabb[]{new zzahc(0)};
    }

    public zzahc() {
        this(0);
    }

    public zzahc(int v) {
        this.zzi = 0;
        this.zzg = new zzahe();
        this.zzh = new ArrayList();
        this.zze = new zzfb(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzfb(zzfy.zza);
        this.zzc = new zzfb(4);
        this.zzd = new zzfb();
        this.zzn = -1;
        this.zzr = zzabe.zza;
        this.zzs = new zzahb[0];
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        int v15;
        boolean z;
        long v38;
        long v37;
        while(true) {
            switch(this.zzi) {
                case 0: {
                    if(this.zzl == 0) {
                        if(!zzabc0.zzn(this.zze.zzI(), 0, 8, true)) {
                            return -1;
                        }
                        this.zzl = 8;
                        this.zze.zzG(0);
                        this.zzk = this.zze.zzt();
                        this.zzj = this.zze.zzf();
                    }
                    long v28 = this.zzk;
                    if(v28 == 1L) {
                        zzabc0.zzi(this.zze.zzI(), 8, 8);
                        this.zzl += 8;
                        this.zzk = this.zze.zzu();
                    }
                    else if(v28 == 0L) {
                        long v29 = zzabc0.zzd();
                        if(v29 == -1L) {
                            zzagh zzagh0 = (zzagh)this.zzf.peek();
                            v29 = zzagh0 == null ? -1L : zzagh0.zza;
                        }
                        if(v29 != -1L) {
                            this.zzk = v29 - zzabc0.zzf() + ((long)this.zzl);
                        }
                    }
                    int v30 = this.zzl;
                    if(this.zzk < ((long)v30)) {
                        throw zzcd.zzc("Atom size less than header length (unsupported).");
                    }
                    switch(this.zzj) {
                        case 1701082227: 
                        case 0x6D646961: 
                        case 0x6D657461: 
                        case 1835626086: 
                        case 0x6D6F6F76: 
                        case 1937007212: 
                        case 1953653099: {
                            long v34 = zzabc0.zzf() + this.zzk;
                            long v35 = (long)this.zzl;
                            if(this.zzk != v35 && this.zzj == 0x6D657461) {
                                this.zzd.zzD(8);
                                zzabc0.zzh(this.zzd.zzI(), 0, 8);
                                zzagr.zze(this.zzd);
                                zzabc0.zzk(this.zzd.zzc());
                                zzabc0.zzj();
                            }
                            long v36 = v34 - v35;
                            zzagh zzagh1 = new zzagh(this.zzj, v36);
                            this.zzf.push(zzagh1);
                            if(this.zzk == ((long)this.zzl)) {
                                this.zzl(v36);
                            }
                            else {
                                this.zzk();
                            }
                            break;
                        }
                        case 0x636F3634: 
                        case 0x63747473: 
                        case 1701606260: 
                        case 0x66747970: 
                        case 0x68646C72: 
                        case 0x696C7374: 
                        case 1801812339: 
                        case 0x6D646864: 
                        case 0x6D766864: 
                        case 1937007471: 
                        case 1937011555: 
                        case 1937011556: 
                        case 1937011571: 
                        case 1937011578: 
                        case 1937011827: 
                        case 1937013298: 
                        case 0x746B6864: 
                        case 0x75647461: {
                            zzdy.zzf(v30 == 8);
                            zzdy.zzf(this.zzk <= 0x7FFFFFFFL);
                            zzfb zzfb0 = new zzfb(((int)this.zzk));
                            System.arraycopy(this.zze.zzI(), 0, zzfb0.zzI(), 0, 8);
                            this.zzm = zzfb0;
                            this.zzi = 1;
                            break;
                        }
                        default: {
                            long v31 = zzabc0.zzf();
                            long v32 = (long)this.zzl;
                            long v33 = v31 - v32;
                            if(this.zzj == 0x6D707664) {
                                this.zzx = new zzaff(0L, v33, 0x8000000000000001L, v33 + v32, this.zzk - v32);
                            }
                            this.zzm = null;
                            this.zzi = 1;
                        }
                    }
                    continue;
                }
                case 1: {
                    v37 = this.zzk - ((long)this.zzl);
                    v38 = zzabc0.zzf();
                    zzfb zzfb1 = this.zzm;
                    if(zzfb1 != null) {
                        zzabc0.zzi(zzfb1.zzI(), this.zzl, ((int)v37));
                        if(this.zzj == 0x66747970) {
                            zzfb1.zzG(8);
                            int v39 = zzahc.zzf(zzfb1.zzf());
                            if(v39 == 0) {
                                zzfb1.zzH(4);
                                while(zzfb1.zza() > 0) {
                                    v39 = zzahc.zzf(zzfb1.zzf());
                                    if(v39 == 0) {
                                        continue;
                                    }
                                    goto label_187;
                                }
                                v39 = 0;
                            }
                        label_187:
                            this.zzw = v39;
                        }
                        else if(!this.zzf.isEmpty()) {
                            ((zzagh)this.zzf.peek()).zzd(new zzagi(this.zzj, zzfb1));
                        }
                        z = false;
                    }
                    else if(v37 < 0x40000L) {
                        zzabc0.zzk(((int)v37));
                        z = false;
                    }
                    else {
                        zzabx0.zza = zzabc0.zzf() + v37;
                        z = true;
                    }
                    break;
                }
                default: {
                    long v = zzabc0.zzf();
                    int v1 = this.zzn;
                    if(v1 == -1) {
                        int v2 = 1;
                        int v3 = 1;
                        int v4 = -1;
                        int v5 = -1;
                        long v6 = 0x7FFFFFFFFFFFFFFFL;
                        long v7 = 0x7FFFFFFFFFFFFFFFL;
                        long v8 = 0x7FFFFFFFFFFFFFFFL;
                        int v9 = 0;
                        while(true) {
                            zzahb[] arr_zzahb = this.zzs;
                            if(v9 >= arr_zzahb.length) {
                                break;
                            }
                            zzahb zzahb0 = arr_zzahb[v9];
                            int v10 = zzahb0.zze;
                            zzahj zzahj0 = zzahb0.zzb;
                            if(v10 != zzahj0.zzb) {
                                long v11 = zzahj0.zzc[v10];
                                long v12 = this.zzt[v9][v10];
                                long v13 = v11 - v;
                                int v14 = v13 >= 0L && v13 < 0x40000L ? 0 : 1;
                                if(v14 == 0) {
                                    if(v3 == 0) {
                                        v15 = 0;
                                        goto label_27;
                                    }
                                    else {
                                        goto label_28;
                                    }
                                    goto label_26;
                                }
                                else {
                                label_26:
                                    v15 = v3;
                                }
                            label_27:
                                if(v14 != v15 || v13 >= v8) {
                                    v3 = v15;
                                }
                                else {
                                label_28:
                                    v3 = v14;
                                    v5 = v9;
                                    v8 = v13;
                                    v7 = v12;
                                }
                                if(v12 < v6) {
                                    v2 = v14;
                                    v4 = v9;
                                    v6 = v12;
                                }
                            }
                            ++v9;
                        }
                        v1 = v6 == 0x7FFFFFFFFFFFFFFFL || v2 == 0 || v7 < v6 + 0xA00000L ? v5 : v4;
                        this.zzn = v1;
                        if(v1 == -1) {
                            return -1;
                        }
                    }
                    zzahb zzahb1 = this.zzs[v1];
                    zzace zzace0 = zzahb1.zzc;
                    int v16 = zzahb1.zze;
                    long v17 = zzahb1.zzb.zzc[v16];
                    int v18 = zzahb1.zzb.zzd[v16];
                    zzacf zzacf0 = zzahb1.zzd;
                    long v19 = v17 - v + ((long)this.zzo);
                    if(v19 >= 0L && v19 < 0x40000L) {
                        if(zzahb1.zza.zzg == 1) {
                            v19 += 8L;
                            v18 -= 8;
                        }
                        zzabc0.zzk(((int)v19));
                        zzahg zzahg0 = zzahb1.zza;
                        int v20 = zzahg0.zzj;
                        if(v20 == 0) {
                            if("audio/ac4".equals(zzahg0.zzf.zzm)) {
                                if(this.zzp == 0) {
                                    zzaaf.zzb(v18, this.zzd);
                                    zzace0.zzq(this.zzd, 7);
                                    this.zzp += 7;
                                }
                                v18 += 7;
                            }
                            else if(zzacf0 != null) {
                                zzacf0.zzd(zzabc0);
                            }
                            int v24;
                            while((v24 = this.zzp) < v18) {
                                int v25 = zzace0.zze(zzabc0, v18 - v24, false);
                                this.zzo += v25;
                                this.zzp += v25;
                                this.zzq -= v25;
                            }
                        }
                        else {
                            byte[] arr_b = this.zzc.zzI();
                            arr_b[0] = 0;
                            arr_b[1] = 0;
                            arr_b[2] = 0;
                            while(this.zzp < v18) {
                                int v21 = this.zzq;
                                if(v21 == 0) {
                                    zzabc0.zzi(arr_b, 4 - v20, v20);
                                    this.zzo += v20;
                                    this.zzc.zzG(0);
                                    int v22 = this.zzc.zzf();
                                    if(v22 < 0) {
                                        throw zzcd.zza("Invalid NAL length", null);
                                    }
                                    this.zzq = v22;
                                    this.zzb.zzG(0);
                                    zzace0.zzq(this.zzb, 4);
                                    this.zzp += 4;
                                    v18 += 4 - v20;
                                }
                                else {
                                    int v23 = zzace0.zze(zzabc0, v21, false);
                                    this.zzo += v23;
                                    this.zzp += v23;
                                    this.zzq -= v23;
                                }
                            }
                        }
                        long v26 = zzahb1.zzb.zzf[v16];
                        int v27 = zzahb1.zzb.zzg[v16];
                        if(zzacf0 == null) {
                            zzace0.zzs(v26, v27, v18, 0, null);
                        }
                        else {
                            zzacf0.zzc(zzace0, v26, v27, v18, 0, null);
                            if(v16 + 1 == zzahb1.zzb.zzb) {
                                zzacf0.zza(zzace0, null);
                            }
                        }
                        ++zzahb1.zze;
                        this.zzn = -1;
                        this.zzo = 0;
                        this.zzp = 0;
                        this.zzq = 0;
                        return 0;
                    }
                    zzabx0.zza = v17;
                    return 1;
                }
            }
            this.zzl(v38 + v37);
            if(z && this.zzi != 2) {
                break;
            }
        }
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabe0) {
        this.zzr = zzabe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long v, long v1) {
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if(v == 0L) {
            this.zzk();
            return;
        }
        zzahb[] arr_zzahb = this.zzs;
        for(int v2 = 0; v2 < arr_zzahb.length; ++v2) {
            zzahb zzahb0 = arr_zzahb[v2];
            zzahj zzahj0 = zzahb0.zzb;
            int v3 = zzahj0.zza(v1);
            if(v3 == -1) {
                v3 = zzahj0.zzb(v1);
            }
            zzahb0.zze = v3;
            zzacf zzacf0 = zzahb0.zzd;
            if(zzacf0 != null) {
                zzacf0.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabc0) {
        return zzahf.zzb(zzabc0, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzv;
    }

    private static int zzf(int v) {
        switch(v) {
            case 0x68656963: {
                return 2;
            }
            case 0x71742020: {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long v) {
        long v7;
        long v5;
        zzahb[] arr_zzahb = this.zzs;
        if(arr_zzahb.length == 0) {
            return new zzaby(zzacb.zza, zzacb.zza);
        }
        int v1 = this.zzu;
        long v2 = -1L;
        if(v1 == -1) {
            v5 = 0x7FFFFFFFFFFFFFFFL;
            v7 = 0x8000000000000001L;
        }
        else {
            zzahj zzahj0 = arr_zzahb[v1].zzb;
            int v3 = zzahc.zzi(zzahj0, v);
            if(v3 == -1) {
                return new zzaby(zzacb.zza, zzacb.zza);
            }
            long v4 = zzahj0.zzf[v3];
            v5 = zzahj0.zzc[v3];
            if(v4 >= v || v3 >= zzahj0.zzb - 1) {
                v7 = 0x8000000000000001L;
            }
            else {
                int v6 = zzahj0.zzb(v);
                if(v6 == -1 || v6 == v3) {
                    v7 = 0x8000000000000001L;
                }
                else {
                    v7 = zzahj0.zzf[v6];
                    v2 = zzahj0.zzc[v6];
                }
            }
            v = v4;
        }
        for(int v8 = 0; true; ++v8) {
            zzahb[] arr_zzahb1 = this.zzs;
            if(v8 >= arr_zzahb1.length) {
                break;
            }
            if(v8 != this.zzu) {
                zzahj zzahj1 = arr_zzahb1[v8].zzb;
                long v9 = zzahc.zzj(zzahj1, v, v5);
                if(v7 != 0x8000000000000001L) {
                    v2 = zzahc.zzj(zzahj1, v7, v2);
                }
                v5 = v9;
            }
        }
        zzacb zzacb0 = new zzacb(v, v5);
        return v7 == 0x8000000000000001L ? new zzaby(zzacb0, zzacb0) : new zzaby(zzacb0, new zzacb(v7, v2));
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }

    private static int zzi(zzahj zzahj0, long v) {
        int v1 = zzahj0.zza(v);
        return v1 == -1 ? zzahj0.zzb(v) : v1;
    }

    private static long zzj(zzahj zzahj0, long v, long v1) {
        int v2 = zzahc.zzi(zzahj0, v);
        return v2 == -1 ? v1 : Math.min(zzahj0.zzc[v2], v1);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzl(long v) {
        int v7;
        List list1;
        long v6;
        zzbz zzbz1;
        while(!this.zzf.isEmpty() && ((zzagh)this.zzf.peek()).zza == v) {
            zzagh zzagh0 = (zzagh)this.zzf.pop();
            if(zzagh0.zzd == 0x6D6F6F76) {
                ArrayList arrayList0 = new ArrayList();
                int v1 = this.zzw;
                zzabq zzabq0 = new zzabq();
                zzagi zzagi0 = zzagh0.zzb(0x75647461);
                if(zzagi0 == null) {
                    zzbz1 = null;
                }
                else {
                    zzbz zzbz0 = zzagr.zzb(zzagi0);
                    zzabq0.zzb(zzbz0);
                    zzbz1 = zzbz0;
                }
                zzagh zzagh1 = zzagh0.zza(0x6D657461);
                zzbz zzbz2 = zzagh1 == null ? null : zzagr.zza(zzagh1);
                zzagi zzagi1 = zzagh0.zzb(0x6D766864);
                zzagi1.getClass();
                zzbz zzbz3 = new zzbz(0x8000000000000001L, new zzby[]{zzagr.zzc(zzagi1.zza)});
                zzbz zzbz4 = zzbz2;
                List list0 = zzagr.zzd(zzagh0, zzabq0, 0x8000000000000001L, null, false, ((boolean)(v1 == 1 ? 1 : 0)), (Object object0) -> ((zzahg)object0));
                int v2 = list0.size();
                long v3 = 0x8000000000000001L;
                int v4 = 0;
                int v5 = -1;
                while(true) {
                    v6 = 0L;
                    if(v4 >= v2) {
                        break;
                    }
                    zzahj zzahj0 = (zzahj)list0.get(v4);
                    if(zzahj0.zzb == 0) {
                        list1 = list0;
                        v7 = v2;
                    }
                    else {
                        zzahg zzahg0 = zzahj0.zza;
                        long v8 = zzahg0.zze == 0x8000000000000001L ? zzahj0.zzh : zzahg0.zze;
                        long v9 = Math.max(v3, v8);
                        list1 = list0;
                        zzahb zzahb0 = new zzahb(zzahg0, zzahj0, this.zzr.zzv(v4, zzahg0.zzb));
                        zzak zzak0 = zzahg0.zzf.zzb();
                        zzak0.zzL(("audio/true-hd".equals(zzahg0.zzf.zzm) ? zzahj0.zze * 16 : zzahj0.zze + 30));
                        v7 = v2;
                        if(zzahg0.zzb == 2 && v8 > 0L) {
                            int v10 = zzahj0.zzb;
                            if(v10 > 1) {
                                zzak0.zzE(((float)v10) / (((float)v8) / 1000000.0f));
                            }
                        }
                        if(zzahg0.zzb == 1 && zzabq0.zza()) {
                            zzak0.zzC(zzabq0.zza);
                            zzak0.zzD(zzabq0.zzb);
                        }
                        int v11 = zzahg0.zzb;
                        zzbz[] arr_zzbz = {(this.zzh.isEmpty() ? null : new zzbz(this.zzh)), zzbz1, zzbz3};
                        zzbz zzbz5 = new zzbz(0x8000000000000001L, new zzby[0]);
                        if(zzbz4 != null) {
                            for(int v12 = 0; v12 < zzbz4.zza(); ++v12) {
                                zzby zzby0 = zzbz4.zzb(v12);
                                if(zzby0 instanceof zzfo) {
                                    if(!((zzfo)zzby0).zza.equals("com.android.capture.fps")) {
                                        zzbz5 = zzbz5.zzc(new zzby[]{((zzfo)zzby0)});
                                    }
                                    else if(v11 == 2) {
                                        zzbz5 = zzbz5.zzc(new zzby[]{((zzfo)zzby0)});
                                    }
                                }
                            }
                        }
                        for(int v13 = 0; v13 < 3; ++v13) {
                            zzbz5 = zzbz5.zzd(arr_zzbz[v13]);
                        }
                        if(zzbz5.zza() > 0) {
                            zzak0.zzM(zzbz5);
                        }
                        zzam zzam0 = zzak0.zzY();
                        zzahb0.zzc.zzk(zzam0);
                        if(zzahg0.zzb == 2 && v5 == -1) {
                            v5 = arrayList0.size();
                        }
                        arrayList0.add(zzahb0);
                        v3 = v9;
                    }
                    ++v4;
                    list0 = list1;
                    v2 = v7;
                }
                this.zzu = v5;
                this.zzv = v3;
                zzahb[] arr_zzahb = (zzahb[])arrayList0.toArray(new zzahb[0]);
                this.zzs = arr_zzahb;
                long[][] arr2_v = new long[arr_zzahb.length][];
                int[] arr_v = new int[arr_zzahb.length];
                long[] arr_v1 = new long[arr_zzahb.length];
                boolean[] arr_z = new boolean[arr_zzahb.length];
                for(int v14 = 0; v14 < arr_zzahb.length; ++v14) {
                    arr2_v[v14] = new long[arr_zzahb[v14].zzb.zzb];
                    arr_v1[v14] = arr_zzahb[v14].zzb.zzf[0];
                }
                int v15 = 0;
                while(v15 < arr_zzahb.length) {
                    long v16 = 0x7FFFFFFFFFFFFFFFL;
                    int v17 = -1;
                    for(int v18 = 0; v18 < arr_zzahb.length; ++v18) {
                        if(!arr_z[v18]) {
                            long v19 = arr_v1[v18];
                            if(v19 <= v16) {
                                v17 = v18;
                                v16 = v19;
                            }
                        }
                    }
                    int v20 = arr_v[v17];
                    long[] arr_v2 = arr2_v[v17];
                    arr_v2[v20] = v6;
                    zzahj zzahj1 = arr_zzahb[v17].zzb;
                    v6 += (long)zzahj1.zzd[v20];
                    int v21 = v20 + 1;
                    arr_v[v17] = v21;
                    if(v21 < arr_v2.length) {
                        arr_v1[v17] = zzahj1.zzf[v21];
                    }
                    else {
                        arr_z[v17] = true;
                        ++v15;
                    }
                }
                this.zzt = arr2_v;
                this.zzr.zzC();
                this.zzr.zzN(this);
                this.zzf.clear();
                this.zzi = 2;
            }
            else if(!this.zzf.isEmpty()) {
                ((zzagh)this.zzf.peek()).zzc(zzagh0);
            }
        }
        if(this.zzi != 2) {
            this.zzk();
        }
    }
}

