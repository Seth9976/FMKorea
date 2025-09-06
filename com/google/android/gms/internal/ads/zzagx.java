package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class zzagx implements zzabb {
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzabe zzD;
    private zzace[] zzE;
    private zzace[] zzF;
    private boolean zzG;
    public static final zzabi zza;
    private static final byte[] zzb;
    private static final zzam zzc;
    private final List zzd;
    private final SparseArray zze;
    private final zzfb zzf;
    private final zzfb zzg;
    private final zzfb zzh;
    private final byte[] zzi;
    private final zzfb zzj;
    private final zzadv zzk;
    private final zzfb zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzfb zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzagw zzy;
    private int zzz;

    static {
        zzagx.zza = (Uri uri0, Map map0) -> new zzabb[]{new zzagx(0, null)};
        zzagx.zzb = new byte[]{-94, 57, 0x4F, 82, 90, -101, 0x4F, 20, -94, 68, 108, 66, 0x7C, 100, (byte)0x8D, -12};
        zzak zzak0 = new zzak();
        zzak0.zzS("application/x-emsg");
        zzagx.zzc = zzak0.zzY();
    }

    public zzagx() {
        this(0, null);
    }

    public zzagx(int v, zzfi zzfi0) {
        List list0 = Collections.emptyList();
        super();
        this.zzd = Collections.unmodifiableList(list0);
        this.zzk = new zzadv();
        this.zzl = new zzfb(16);
        this.zzf = new zzfb(zzfy.zza);
        this.zzg = new zzfb(5);
        this.zzh = new zzfb();
        byte[] arr_b = new byte[16];
        this.zzi = arr_b;
        this.zzj = new zzfb(arr_b);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = 0x8000000000000001L;
        this.zzv = 0x8000000000000001L;
        this.zzx = 0x8000000000000001L;
        this.zzD = zzabe.zza;
        this.zzE = new zzace[0];
        this.zzF = new zzace[0];
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        int v18;
        boolean z;
        int v9;
        int v64;
        zzagw zzagw3;
        long v53;
        long v52;
        String s4;
        String s3;
        long v51;
        long v50;
        long v37;
        long v36;
    alab1:
        while(true) {
            long v = 0x7FFFFFFFFFFFFFFFL;
            switch(this.zzo) {
                case 0: {
                    if(this.zzr == 0) {
                        if(!zzabc0.zzn(this.zzl.zzI(), 0, 8, true)) {
                            return -1;
                        }
                        this.zzr = 8;
                        this.zzl.zzG(0);
                        this.zzq = this.zzl.zzt();
                        this.zzp = this.zzl.zzf();
                    }
                    long v23 = this.zzq;
                    if(v23 == 1L) {
                        ((zzaar)zzabc0).zzn(this.zzl.zzI(), 8, 8, false);
                        this.zzr += 8;
                        this.zzq = this.zzl.zzu();
                    }
                    else if(v23 == 0L) {
                        long v24 = zzabc0.zzd();
                        if(v24 == -1L) {
                            v24 = this.zzm.isEmpty() ? -1L : ((zzagh)this.zzm.peek()).zza;
                        }
                        if(v24 != -1L) {
                            this.zzq = v24 - zzabc0.zzf() + ((long)this.zzr);
                        }
                    }
                    long v25 = (long)this.zzr;
                    if(this.zzq >= v25) {
                        long v26 = zzabc0.zzf() - v25;
                        if((this.zzp == 1835295092 || this.zzp == 0x6D6F6F66) && !this.zzG) {
                            this.zzD.zzN(new zzabz(this.zzw, v26));
                            this.zzG = true;
                        }
                        if(this.zzp == 0x6D6F6F66) {
                            int v27 = this.zze.size();
                            for(int v28 = 0; v28 < v27; ++v28) {
                                zzahi zzahi0 = ((zzagw)this.zze.valueAt(v28)).zzb;
                                zzahi0.zzc = v26;
                                zzahi0.zzb = v26;
                            }
                        }
                        int v29 = this.zzp;
                        switch(v29) {
                            case 1835295092: {
                                this.zzy = null;
                                this.zzt = v26 + this.zzq;
                                this.zzo = 2;
                                continue;
                            }
                            case 1701082227: 
                            case 0x6D646961: 
                            case 1835626086: 
                            case 0x6D6F6F66: 
                            case 0x6D6F6F76: 
                            case 0x6D766578: 
                            case 1937007212: 
                            case 1953653094: 
                            case 1953653099: {
                                long v30 = zzabc0.zzf() + this.zzq - 8L;
                                zzagh zzagh0 = new zzagh(v29, v30);
                                this.zzm.push(zzagh0);
                                if(this.zzq == ((long)this.zzr)) {
                                    this.zzi(v30);
                                }
                                else {
                                    this.zzg();
                                }
                                continue;
                            }
                            case 0x636F3634: 
                            case 0x63747473: 
                            case 1701606260: 
                            case 1701671783: 
                            case 0x68646C72: 
                            case 0x6D646864: 
                            case 1835362404: 
                            case 0x6D766864: 
                            case 0x70737368: 
                            case 0x7361696F: 
                            case 0x7361697A: 
                            case 0x73626770: 
                            case 1936027235: 
                            case 0x73677064: 
                            case 1936286840: 
                            case 1937007471: 
                            case 1937011555: 
                            case 1937011556: 
                            case 1937011571: 
                            case 1937011578: 
                            case 1937011827: 
                            case 1937013298: 
                            case 0x74666474: 
                            case 0x74666864: 
                            case 0x746B6864: 
                            case 0x74726578: 
                            case 0x7472756E: 
                            case 1970628964: {
                                if(this.zzr != 8) {
                                    throw zzcd.zzc("Leaf atom defines extended atom size (unsupported).");
                                }
                                if(this.zzq > 0x7FFFFFFFL) {
                                    throw zzcd.zzc("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                zzfb zzfb1 = new zzfb(((int)this.zzq));
                                System.arraycopy(this.zzl.zzI(), 0, zzfb1.zzI(), 0, 8);
                                this.zzs = zzfb1;
                                this.zzo = 1;
                                continue;
                            }
                            default: {
                                if(this.zzq > 0x7FFFFFFFL) {
                                    throw zzcd.zzc("Skipping atom with length > 2147483647 (unsupported).");
                                }
                                this.zzs = null;
                                this.zzo = 1;
                                continue;
                            }
                        }
                    }
                    throw zzcd.zzc("Atom size less than header length (unsupported).");
                }
                case 1: {
                    int v31 = ((int)this.zzq) - this.zzr;
                    zzfb zzfb2 = this.zzs;
                    if(zzfb2 == null) {
                        ((zzaar)zzabc0).zzo(v31, false);
                    }
                    else {
                        ((zzaar)zzabc0).zzn(zzfb2.zzI(), 8, v31, false);
                        zzagi zzagi0 = new zzagi(this.zzp, zzfb2);
                        long v32 = zzabc0.zzf();
                        if(this.zzm.isEmpty()) {
                            int v33 = zzagi0.zzd;
                            if(v33 == 1936286840) {
                                zzfb zzfb3 = zzagi0.zza;
                                zzfb3.zzG(8);
                                int v34 = zzagj.zze(zzfb3.zzf());
                                zzfb3.zzH(4);
                                long v35 = zzfb3.zzt();
                                if(v34 == 0) {
                                    v36 = zzfb3.zzt();
                                    v37 = zzfb3.zzt();
                                }
                                else {
                                    v36 = zzfb3.zzu();
                                    v37 = zzfb3.zzu();
                                }
                                long v38 = v32 + v37;
                                long v39 = zzfk.zzq(v36, 1000000L, v35);
                                zzfb3.zzH(2);
                                int v40 = zzfb3.zzp();
                                int[] arr_v = new int[v40];
                                long[] arr_v1 = new long[v40];
                                long[] arr_v2 = new long[v40];
                                long[] arr_v3 = new long[v40];
                                long v41 = v39;
                                int v42 = 0;
                                while(v42 < v40) {
                                    int v43 = zzfb3.zzf();
                                    if((v43 & 0x80000000) != 0) {
                                        throw zzcd.zza("Unhandled indirect reference", null);
                                    }
                                    long v44 = zzfb3.zzt();
                                    arr_v[v42] = v43 & 0x7FFFFFFF;
                                    arr_v1[v42] = v38;
                                    arr_v3[v42] = v41;
                                    long v45 = v36 + v44;
                                    v41 = zzfk.zzq(v45, 1000000L, v35);
                                    arr_v2[v42] = v41 - arr_v3[v42];
                                    zzfb3.zzH(4);
                                    v38 += (long)arr_v[v42];
                                    ++v42;
                                    v36 = v45;
                                }
                                Pair pair0 = Pair.create(v39, new zzaap(arr_v, arr_v1, arr_v2, arr_v3));
                                this.zzx = (long)(((Long)pair0.first));
                                this.zzD.zzN(((zzaca)pair0.second));
                                this.zzG = true;
                            }
                            else if(v33 == 1701671783) {
                                zzfb zzfb4 = zzagi0.zza;
                                if(this.zzE.length != 0) {
                                    zzfb4.zzG(8);
                                    int v46 = zzagj.zze(zzfb4.zzf());
                                    switch(v46) {
                                        case 0: {
                                            String s1 = zzfb4.zzw('\u0000');
                                            s1.getClass();
                                            String s2 = zzfb4.zzw('\u0000');
                                            s2.getClass();
                                            long v47 = zzfb4.zzt();
                                            long v48 = zzfk.zzq(zzfb4.zzt(), 1000000L, v47);
                                            long v49 = this.zzx == 0x8000000000000001L ? 0x8000000000000001L : this.zzx + v48;
                                            v50 = zzfk.zzq(zzfb4.zzt(), 1000L, v47);
                                            v51 = zzfb4.zzt();
                                            s3 = s1;
                                            s4 = s2;
                                            v52 = v48;
                                            v53 = v49;
                                            break;
                                        }
                                        case 1: {
                                            long v54 = zzfb4.zzt();
                                            long v55 = zzfk.zzq(zzfb4.zzu(), 1000000L, v54);
                                            long v56 = zzfk.zzq(zzfb4.zzt(), 1000L, v54);
                                            long v57 = zzfb4.zzt();
                                            String s5 = zzfb4.zzw('\u0000');
                                            s5.getClass();
                                            String s6 = zzfb4.zzw('\u0000');
                                            s6.getClass();
                                            v50 = v56;
                                            v51 = v57;
                                            s3 = s5;
                                            s4 = s6;
                                            v52 = 0x8000000000000001L;
                                            v53 = v55;
                                            break;
                                        }
                                        default: {
                                            zzes.zzf("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + v46);
                                            goto label_320;
                                        }
                                    }
                                    byte[] arr_b1 = new byte[zzfb4.zza()];
                                    zzfb4.zzC(arr_b1, 0, zzfb4.zza());
                                    zzadu zzadu0 = new zzadu(s3, s4, v50, v51, arr_b1);
                                    zzfb zzfb5 = new zzfb(this.zzk.zza(zzadu0));
                                    int v58 = zzfb5.zza();
                                    zzace[] arr_zzace1 = this.zzE;
                                    for(int v59 = 0; v59 < arr_zzace1.length; ++v59) {
                                        zzace zzace1 = arr_zzace1[v59];
                                        zzfb5.zzG(0);
                                        zzace1.zzq(zzfb5, v58);
                                    }
                                    if(v53 == 0x8000000000000001L) {
                                        zzagv zzagv1 = new zzagv(v52, true, v58);
                                        this.zzn.addLast(zzagv1);
                                        this.zzu += v58;
                                    }
                                    else if(this.zzn.isEmpty()) {
                                        zzace[] arr_zzace2 = this.zzE;
                                        for(int v60 = 0; v60 < arr_zzace2.length; ++v60) {
                                            arr_zzace2[v60].zzs(v53, 1, v58, 0, null);
                                        }
                                    }
                                    else {
                                        zzagv zzagv2 = new zzagv(v53, false, v58);
                                        this.zzn.addLast(zzagv2);
                                        this.zzu += v58;
                                    }
                                }
                            }
                        }
                        else {
                            ((zzagh)this.zzm.peek()).zzd(zzagi0);
                        }
                    }
                label_320:
                    this.zzi(zzabc0.zzf());
                    continue;
                }
                case 2: {
                    int v61 = this.zze.size();
                    zzagw3 = null;
                    for(int v62 = 0; v62 < v61; ++v62) {
                        zzahi zzahi1 = ((zzagw)this.zze.valueAt(v62)).zzb;
                        if(zzahi1.zzo) {
                            long v63 = zzahi1.zzc;
                            if(v63 < v) {
                                zzagw3 = (zzagw)this.zze.valueAt(v62);
                                v = v63;
                            }
                        }
                    }
                    if(zzagw3 == null) {
                        this.zzo = 3;
                        continue;
                    }
                    v64 = (int)(v - zzabc0.zzf());
                    if(v64 >= 0) {
                        break;
                    }
                    break alab1;
                }
                default: {
                    zzagw zzagw0 = this.zzy;
                    if(zzagw0 == null) {
                        SparseArray sparseArray0 = this.zze;
                        int v1 = sparseArray0.size();
                        long v2 = 0x7FFFFFFFFFFFFFFFL;
                        zzagw zzagw1 = null;
                        for(int v3 = 0; v3 < v1; ++v3) {
                            zzagw zzagw2 = (zzagw)sparseArray0.valueAt(v3);
                            if((zzagw2.zzl || zzagw2.zzf != zzagw2.zzd.zzb) && (!zzagw2.zzl || zzagw2.zzh != zzagw2.zzb.zzd)) {
                                long v4 = zzagw2.zzd();
                                if(v4 < v2) {
                                    zzagw1 = zzagw2;
                                    v2 = v4;
                                }
                            }
                        }
                        if(zzagw1 == null) {
                            int v5 = (int)(this.zzt - zzabc0.zzf());
                            if(v5 < 0) {
                                throw zzcd.zza("Offset to end of mdat was negative.", null);
                            }
                            ((zzaar)zzabc0).zzo(v5, false);
                            this.zzg();
                            continue;
                        }
                        else {
                            int v6 = (int)(zzagw1.zzd() - zzabc0.zzf());
                            if(v6 < 0) {
                                zzes.zzf("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                v6 = 0;
                            }
                            ((zzaar)zzabc0).zzo(v6, false);
                            this.zzy = zzagw1;
                            zzagw0 = zzagw1;
                        }
                    }
                    if(this.zzo == 3) {
                        int v7 = zzagw0.zzb();
                        this.zzz = v7;
                        if(zzagw0.zzf < zzagw0.zzi) {
                            ((zzaar)zzabc0).zzo(v7, false);
                            zzahh zzahh0 = zzagw0.zzf();
                            if(zzahh0 != null) {
                                zzfb zzfb0 = zzagw0.zzb.zzn;
                                int v8 = zzahh0.zzd;
                                if(v8 != 0) {
                                    zzfb0.zzH(v8);
                                }
                                if(zzagw0.zzb.zzb(zzagw0.zzf)) {
                                    zzfb0.zzH(zzfb0.zzp() * 6);
                                }
                            }
                            if(!zzagw0.zzk()) {
                                this.zzy = null;
                            }
                            this.zzo = 3;
                            return 0;
                        }
                        if(zzagw0.zzd.zza.zzg == 1) {
                            this.zzz = v7 - 8;
                            ((zzaar)zzabc0).zzo(8, false);
                        }
                        if("audio/ac4".equals(zzagw0.zzd.zza.zzf.zzm)) {
                            this.zzA = zzagw0.zzc(this.zzz, 7);
                            zzaaf.zzb(this.zzz, this.zzj);
                            zzagw0.zza.zzq(this.zzj, 7);
                            v9 = this.zzA + 7;
                        }
                        else {
                            v9 = zzagw0.zzc(this.zzz, 0);
                        }
                        this.zzA = v9;
                        this.zzz += v9;
                        this.zzo = 4;
                        this.zzB = 0;
                    }
                    zzahg zzahg0 = zzagw0.zzd.zza;
                    zzace zzace0 = zzagw0.zza;
                    long v10 = zzagw0.zze();
                    int v11 = zzahg0.zzj;
                    if(v11 == 0) {
                        while(true) {
                            int v12 = this.zzA;
                            int v13 = this.zzz;
                            if(v12 >= v13) {
                                break;
                            }
                            int v14 = zzace0.zze(zzabc0, v13 - v12, false);
                            this.zzA += v14;
                        }
                    }
                    else {
                        byte[] arr_b = this.zzg.zzI();
                        arr_b[0] = 0;
                        arr_b[1] = 0;
                        arr_b[2] = 0;
                        while(this.zzA < this.zzz) {
                            int v15 = this.zzB;
                            if(v15 == 0) {
                                ((zzaar)zzabc0).zzn(arr_b, 4 - v11, v11 + 1, false);
                                this.zzg.zzG(0);
                                int v16 = this.zzg.zzf();
                                if(v16 <= 0) {
                                    throw zzcd.zza("Invalid NAL length", null);
                                }
                                this.zzB = v16 - 1;
                                this.zzf.zzG(0);
                                zzace0.zzq(this.zzf, 4);
                                zzace0.zzq(this.zzg, 1);
                                if(this.zzF.length > 0) {
                                    String s = zzahg0.zzf.zzm;
                                    int v17 = arr_b[4];
                                    if("video/avc".equals(s) && (v17 & 0x1F) == 6) {
                                        z = true;
                                    }
                                    else if("video/hevc".equals(s) && (v17 & 0x7E) >> 1 == 39) {
                                        z = true;
                                    }
                                }
                                else {
                                    z = false;
                                }
                                this.zzC = z;
                                this.zzA += 5;
                                this.zzz += 4 - v11;
                            }
                            else {
                                if(this.zzC) {
                                    this.zzh.zzD(v15);
                                    ((zzaar)zzabc0).zzn(this.zzh.zzI(), 0, this.zzB, false);
                                    zzace0.zzq(this.zzh, this.zzB);
                                    v18 = this.zzB;
                                    int v19 = zzfy.zzb(this.zzh.zzI(), this.zzh.zzd());
                                    this.zzh.zzG(((int)"video/hevc".equals(zzahg0.zzf.zzm)));
                                    this.zzh.zzF(v19);
                                    zzaao.zza(v10, this.zzh, this.zzF);
                                }
                                else {
                                    v18 = zzace0.zze(zzabc0, v15, false);
                                }
                                this.zzA += v18;
                                this.zzB -= v18;
                            }
                        }
                    }
                    int v20 = zzagw0.zza();
                    zzahh zzahh1 = zzagw0.zzf();
                    zzace0.zzs(v10, v20, this.zzz, 0, (zzahh1 == null ? null : zzahh1.zzc));
                    while(!this.zzn.isEmpty()) {
                        zzagv zzagv0 = (zzagv)this.zzn.removeFirst();
                        this.zzu -= zzagv0.zzc;
                        long v21 = zzagv0.zzb ? zzagv0.zza + v10 : zzagv0.zza;
                        zzace[] arr_zzace = this.zzE;
                        for(int v22 = 0; v22 < arr_zzace.length; ++v22) {
                            arr_zzace[v22].zzs(v21, 1, zzagv0.zzc, this.zzu, null);
                        }
                    }
                    if(!zzagw0.zzk()) {
                        this.zzy = null;
                    }
                    this.zzo = 3;
                    return 0;
                }
            }
            ((zzaar)zzabc0).zzo(v64, false);
            ((zzaar)zzabc0).zzn(zzagw3.zzb.zzn.zzI(), 0, zzagw3.zzb.zzn.zzd(), false);
            zzagw3.zzb.zzn.zzG(0);
            zzagw3.zzb.zzo = false;
        }
        throw zzcd.zza("Offset to encryption data was negative.", null);
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabe0) {
        this.zzD = zzabe0;
        this.zzg();
        zzace[] arr_zzace = new zzace[2];
        this.zzE = arr_zzace;
        int v = 0;
        zzace[] arr_zzace1 = (zzace[])zzfk.zzH(arr_zzace, 0);
        this.zzE = arr_zzace1;
        for(int v1 = 0; v1 < arr_zzace1.length; ++v1) {
            arr_zzace1[v1].zzk(zzagx.zzc);
        }
        this.zzF = new zzace[this.zzd.size()];
        for(int v2 = 100; v < this.zzF.length; ++v2) {
            zzace zzace0 = this.zzD.zzv(v2, 3);
            zzace0.zzk(((zzam)this.zzd.get(v)));
            this.zzF[v] = zzace0;
            ++v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long v, long v1) {
        int v2 = this.zze.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((zzagw)this.zze.valueAt(v3)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = v1;
        this.zzm.clear();
        this.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabc0) {
        return zzahf.zza(zzabc0);
    }

    private static int zze(int v) {
        if(v < 0) {
            throw zzcd.zza(("Unexpected negative value: " + v), null);
        }
        return v;
    }

    private static zzad zzf(List list0) {
        zzahd zzahd0;
        int v = list0.size();
        List list1 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            zzagi zzagi0 = (zzagi)list0.get(v1);
            if(zzagi0.zzd == 0x70737368) {
                if(list1 == null) {
                    list1 = new ArrayList();
                }
                byte[] arr_b = zzagi0.zza.zzI();
                zzfb zzfb0 = new zzfb(arr_b);
                if(zzfb0.zzd() >= 0x20) {
                    zzfb0.zzG(0);
                    if(zzfb0.zzf() == zzfb0.zza() + 4 && zzfb0.zzf() == 0x70737368) {
                        int v2 = zzagj.zze(zzfb0.zzf());
                        if(v2 > 1) {
                            zzes.zzf("PsshAtomUtil", "Unsupported pssh version: " + v2);
                            zzahd0 = null;
                        }
                        else {
                            UUID uUID0 = new UUID(zzfb0.zzs(), zzfb0.zzs());
                            if(v2 == 1) {
                                zzfb0.zzH(zzfb0.zzo() * 16);
                            }
                            int v3 = zzfb0.zzo();
                            if(v3 == zzfb0.zza()) {
                                byte[] arr_b1 = new byte[v3];
                                zzfb0.zzC(arr_b1, 0, v3);
                                zzahd0 = new zzahd(uUID0, v2, arr_b1);
                            }
                        }
                    }
                }
                else {
                    zzahd0 = null;
                }
                UUID uUID1 = zzahd0 == null ? null : zzahd.zza(zzahd0);
                if(uUID1 == null) {
                    zzes.zzf("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                }
                else {
                    ((ArrayList)list1).add(new zzac(uUID1, null, "video/mp4", arr_b));
                }
            }
        }
        return list1 == null ? null : new zzad(list1);
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzfb zzfb0, int v, zzahi zzahi0) {
        zzfb0.zzG(v + 8);
        int v1 = zzfb0.zzf();
        if((v1 & 1) != 0) {
            throw zzcd.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        int v2 = zzfb0.zzo();
        if(v2 == 0) {
            Arrays.fill(zzahi0.zzl, 0, zzahi0.zze, false);
            return;
        }
        int v3 = zzahi0.zze;
        if(v2 != v3) {
            throw zzcd.zza(("Senc sample count " + v2 + " is different from fragment sample count" + v3), null);
        }
        Arrays.fill(zzahi0.zzl, 0, v2, (v1 & 2) != 0);
        zzahi0.zza(zzfb0.zza());
        zzfb0.zzC(zzahi0.zzn.zzI(), 0, zzahi0.zzn.zzd());
        zzahi0.zzn.zzG(0);
        zzahi0.zzo = false;
    }

    private final void zzi(long v) {
        zzagx zzagx1;
        byte[] arr_b7;
        byte[] arr_b6;
        byte[] arr_b5;
        int v56;
        zzagh zzagh5;
        int v50;
        int v49;
        int v47;
        int v46;
        zzags zzags2;
        int v45;
        int v44;
        int v43;
        int v42;
        int v41;
        int v40;
        zzahi zzahi4;
        long v36;
        zzahi zzahi3;
        int v35;
        byte[] arr_b1;
        int v33;
        int v27;
        zzagh zzagh4;
        zzagh zzagh3;
        int v25;
        List list2;
        int v24;
        SparseArray sparseArray3;
        zzagx zzagx0 = this;
        while(!zzagx0.zzm.isEmpty() && ((zzagh)zzagx0.zzm.peek()).zza == v) {
            zzagh zzagh0 = (zzagh)zzagx0.zzm.pop();
            int v1 = zzagh0.zzd;
            if(v1 == 0x6D6F6F76) {
                zzad zzad0 = zzagx.zzf(zzagh0.zzb);
                zzagh zzagh1 = zzagh0.zza(0x6D766578);
                zzagh1.getClass();
                SparseArray sparseArray0 = new SparseArray();
                int v2 = zzagh1.zzb.size();
                long v3 = 0x8000000000000001L;
                for(int v4 = 0; v4 < v2; ++v4) {
                    zzagi zzagi0 = (zzagi)zzagh1.zzb.get(v4);
                    int v5 = zzagi0.zzd;
                    if(v5 == 0x74726578) {
                        zzagi0.zza.zzG(12);
                        Pair pair0 = Pair.create(zzagi0.zza.zzf(), new zzags(zzagi0.zza.zzf() - 1, zzagi0.zza.zzf(), zzagi0.zza.zzf(), zzagi0.zza.zzf()));
                        sparseArray0.put(((int)(((Integer)pair0.first))), ((zzags)pair0.second));
                    }
                    else if(v5 == 1835362404) {
                        zzagi0.zza.zzG(8);
                        v3 = zzagj.zze(zzagi0.zza.zzf()) == 0 ? zzagi0.zza.zzt() : zzagi0.zza.zzu();
                    }
                }
                SparseArray sparseArray1 = sparseArray0;
                List list0 = zzagr.zzd(zzagh0, new zzabq(), v3, zzad0, false, false, new zzagu(zzagx0));
                int v6 = list0.size();
                if(zzagx0.zze.size() == 0) {
                    for(int v7 = 0; v7 < v6; ++v7) {
                        zzahj zzahj0 = (zzahj)list0.get(v7);
                        zzagw zzagw0 = new zzagw(zzagx0.zzD.zzv(v7, zzahj0.zza.zzb), zzahj0, zzagx.zzj(sparseArray1, zzahj0.zza.zza));
                        zzagx0.zze.put(zzahj0.zza.zza, zzagw0);
                        zzagx0.zzw = Math.max(zzagx0.zzw, zzahj0.zza.zze);
                    }
                    zzagx0.zzD.zzC();
                }
                else {
                    zzdy.zzf(zzagx0.zze.size() == v6);
                    for(int v8 = 0; v8 < v6; ++v8) {
                        zzahj zzahj1 = (zzahj)list0.get(v8);
                        ((zzagw)zzagx0.zze.get(zzahj1.zza.zza)).zzh(zzahj1, zzagx.zzj(sparseArray1, zzahj1.zza.zza));
                    }
                }
            }
            else {
                if(v1 == 0x6D6F6F66) {
                    SparseArray sparseArray2 = zzagx0.zze;
                    byte[] arr_b = zzagx0.zzi;
                    int v9 = zzagh0.zzc.size();
                    int v10 = 0;
                    while(v10 < v9) {
                        zzagh zzagh2 = (zzagh)zzagh0.zzc.get(v10);
                        if(zzagh2.zzd == 1953653094) {
                            zzagi zzagi1 = zzagh2.zzb(0x74666864);
                            zzagi1.getClass();
                            zzfb zzfb0 = zzagi1.zza;
                            zzfb0.zzG(8);
                            int v11 = zzfb0.zzf();
                            zzagw zzagw1 = (zzagw)sparseArray2.get(zzfb0.zzf());
                            if(zzagw1 == null) {
                                zzagw1 = null;
                            }
                            else {
                                if((v11 & 1) != 0) {
                                    long v12 = zzfb0.zzu();
                                    zzagw1.zzb.zzb = v12;
                                    zzagw1.zzb.zzc = v12;
                                }
                                zzags zzags0 = zzagw1.zze;
                                zzagw1.zzb.zza = new zzags(((v11 & 2) == 0 ? zzags0.zza : zzfb0.zzf() - 1), ((v11 & 8) == 0 ? zzags0.zzb : zzfb0.zzf()), ((v11 & 16) == 0 ? zzags0.zzc : zzfb0.zzf()), ((v11 & 0x20) == 0 ? zzags0.zzd : zzfb0.zzf()));
                            }
                            if(zzagw1 != null) {
                                zzahi zzahi0 = zzagw1.zzb;
                                long v13 = zzahi0.zzp;
                                boolean z = zzahi0.zzq;
                                zzagw1.zzi();
                                zzagw.zzg(zzagw1, true);
                                zzagi zzagi2 = zzagh2.zzb(0x74666474);
                                if(zzagi2 == null) {
                                    zzahi0.zzp = v13;
                                    zzahi0.zzq = z;
                                }
                                else {
                                    zzagi2.zza.zzG(8);
                                    zzahi0.zzp = zzagj.zze(zzagi2.zza.zzf()) == 1 ? zzagi2.zza.zzu() : zzagi2.zza.zzt();
                                    zzahi0.zzq = true;
                                }
                                List list1 = zzagh2.zzb;
                                int v14 = list1.size();
                                int v16 = 0;
                                int v17 = 0;
                                for(int v15 = 0; v15 < v14; ++v15) {
                                    zzagi zzagi3 = (zzagi)list1.get(v15);
                                    if(zzagi3.zzd == 0x7472756E) {
                                        zzagi3.zza.zzG(12);
                                        int v18 = zzagi3.zza.zzo();
                                        if(v18 > 0) {
                                            v17 += v18;
                                            ++v16;
                                        }
                                    }
                                }
                                sparseArray3 = sparseArray2;
                                zzagw1.zzh = 0;
                                zzagw1.zzg = 0;
                                zzagw1.zzf = 0;
                                zzahi zzahi1 = zzagw1.zzb;
                                zzahi1.zzd = v16;
                                zzahi1.zze = v17;
                                if(zzahi1.zzg.length < v16) {
                                    zzahi1.zzf = new long[v16];
                                    zzahi1.zzg = new int[v16];
                                }
                                if(zzahi1.zzh.length < v17) {
                                    int v19 = v17 * 0x7D / 100;
                                    zzahi1.zzh = new int[v19];
                                    zzahi1.zzi = new long[v19];
                                    zzahi1.zzj = new boolean[v19];
                                    zzahi1.zzl = new boolean[v19];
                                }
                                int v20 = 0;
                                int v21 = 0;
                                int v22 = 0;
                                while(v20 < v14) {
                                    zzagi zzagi4 = (zzagi)list1.get(v20);
                                    if(zzagi4.zzd == 0x7472756E) {
                                        zzfb zzfb1 = zzagi4.zza;
                                        zzfb1.zzG(8);
                                        int v23 = zzfb1.zzf();
                                        zzahg zzahg0 = zzagw1.zzd.zza;
                                        v24 = v9;
                                        zzahi zzahi2 = zzagw1.zzb;
                                        list2 = list1;
                                        zzags zzags1 = zzahi2.zza;
                                        v25 = v14;
                                        int[] arr_v = zzahi2.zzg;
                                        arr_v[v21] = zzfb1.zzo();
                                        long[] arr_v1 = zzahi2.zzf;
                                        zzagh3 = zzagh0;
                                        zzagh4 = zzagh2;
                                        long v26 = zzahi2.zzb;
                                        arr_v1[v21] = v26;
                                        if((v23 & 1) == 0) {
                                            v27 = v20;
                                        }
                                        else {
                                            v27 = v20;
                                            arr_v1[v21] = v26 + ((long)zzfb1.zzf());
                                        }
                                        int v28 = (v23 & 4) == 0 ? 0 : 1;
                                        int v29 = v23 & 0x100;
                                        int v30 = v23 & 0x400;
                                        int v31 = v23 & 0x800;
                                        int v32 = v28 == 0 ? zzags1.zzd : zzfb1.zzf();
                                        long[] arr_v2 = zzahg0.zzh;
                                        if(arr_v2 == null) {
                                            arr_b1 = arr_b;
                                            v33 = v10;
                                            v35 = v23 & 0x200;
                                            zzahi3 = zzahi0;
                                        }
                                        else {
                                            v33 = v10;
                                            arr_b1 = arr_b;
                                            if(arr_v2.length == 1) {
                                                long[] arr_v3 = zzahg0.zzi;
                                                if(arr_v3 == null) {
                                                    v35 = v23 & 0x200;
                                                    zzahi3 = zzahi0;
                                                    v36 = 0L;
                                                    goto label_174;
                                                }
                                                else {
                                                    long v34 = arr_v2[0];
                                                    if(v34 == 0L) {
                                                        v35 = v23 & 0x200;
                                                        zzahi3 = zzahi0;
                                                        v36 = zzahg0.zzi[0];
                                                        goto label_174;
                                                    }
                                                    else {
                                                        v35 = v23 & 0x200;
                                                        zzahi3 = zzahi0;
                                                        if(zzfk.zzq(v34 + arr_v3[0], 1000000L, zzahg0.zzd) >= zzahg0.zze) {
                                                            v36 = zzahg0.zzi[0];
                                                            goto label_174;
                                                        }
                                                    }
                                                }
                                            }
                                            else {
                                                v35 = v23 & 0x200;
                                                zzahi3 = zzahi0;
                                                v36 = 0L;
                                                goto label_174;
                                            }
                                        }
                                        v36 = 0L;
                                    label_174:
                                        int[] arr_v4 = zzahi2.zzh;
                                        long[] arr_v5 = zzahi2.zzi;
                                        boolean[] arr_z = zzahi2.zzj;
                                        int v37 = zzahi2.zzg[v21] + v22;
                                        long v38 = zzahg0.zzc;
                                        boolean[] arr_z1 = arr_z;
                                        zzahi4 = zzahi3;
                                        long v39 = zzahi2.zzp;
                                        while(v22 < v37) {
                                            if(v29 == 0) {
                                                v40 = v37;
                                                v41 = zzags1.zzb;
                                            }
                                            else {
                                                v40 = v37;
                                                v41 = zzfb1.zzf();
                                            }
                                            zzagx.zze(v41);
                                            if(v35 == 0) {
                                                v42 = v29;
                                                v43 = zzags1.zzc;
                                            }
                                            else {
                                                v42 = v29;
                                                v43 = zzfb1.zzf();
                                            }
                                            zzagx.zze(v43);
                                            if(v30 == 0) {
                                                v44 = v28;
                                                if(v22 == 0) {
                                                    if(v28 == 0) {
                                                        v22 = 0;
                                                    }
                                                    else {
                                                        v45 = v32;
                                                        v22 = 0;
                                                        goto label_209;
                                                    }
                                                }
                                                v45 = zzags1.zzd;
                                            }
                                            else {
                                                v44 = v28;
                                                v45 = zzfb1.zzf();
                                            }
                                        label_209:
                                            if(v31 == 0) {
                                                zzags2 = zzags1;
                                                v46 = v30;
                                                v47 = 0;
                                            }
                                            else {
                                                zzags2 = zzags1;
                                                v46 = v30;
                                                v47 = zzfb1.zzf();
                                            }
                                            long v48 = zzfk.zzq(((long)v47) + v39 - v36, 1000000L, v38);
                                            arr_v5[v22] = v48;
                                            if(!zzahi2.zzq) {
                                                arr_v5[v22] = v48 + zzagw1.zzd.zzh;
                                            }
                                            arr_v4[v22] = v43;
                                            arr_z1[v22] = 1 == (v45 >> 16 & 1 ^ 1);
                                            v39 += (long)v41;
                                            ++v22;
                                            v37 = v40;
                                            v29 = v42;
                                            v28 = v44;
                                            zzags1 = zzags2;
                                            v30 = v46;
                                        }
                                        zzahi2.zzp = v39;
                                        ++v21;
                                        v22 = v37;
                                    }
                                    else {
                                        v27 = v20;
                                        arr_b1 = arr_b;
                                        v24 = v9;
                                        v33 = v10;
                                        zzagh3 = zzagh0;
                                        zzagh4 = zzagh2;
                                        zzahi4 = zzahi0;
                                        list2 = list1;
                                        v25 = v14;
                                    }
                                    v20 = v27 + 1;
                                    v9 = v24;
                                    list1 = list2;
                                    v14 = v25;
                                    zzagh0 = zzagh3;
                                    zzagh2 = zzagh4;
                                    v10 = v33;
                                    arr_b = arr_b1;
                                    zzahi0 = zzahi4;
                                }
                                byte[] arr_b2 = arr_b;
                                v49 = v9;
                                v50 = v10;
                                zzagh5 = zzagh0;
                                zzahg zzahg1 = zzagw1.zzd.zza;
                                zzahi zzahi5 = zzahi0;
                                zzags zzags3 = zzahi5.zza;
                                zzags3.getClass();
                                zzahh zzahh0 = zzahg1.zza(zzags3.zza);
                                zzagh zzagh6 = zzagh2;
                                zzagi zzagi5 = zzagh6.zzb(0x7361697A);
                                if(zzagi5 != null) {
                                    zzahh0.getClass();
                                    zzfb zzfb2 = zzagi5.zza;
                                    int v51 = zzahh0.zzd;
                                    zzfb2.zzG(8);
                                    if((zzfb2.zzf() & 1) == 1) {
                                        zzfb2.zzH(8);
                                    }
                                    int v52 = zzfb2.zzl();
                                    int v53 = zzfb2.zzo();
                                    int v54 = zzahi5.zze;
                                    if(v53 > v54) {
                                        throw zzcd.zza(("Saiz sample count " + v53 + " is greater than fragment sample count" + v54), null);
                                    }
                                    if(v52 == 0) {
                                        boolean[] arr_z2 = zzahi5.zzl;
                                        v56 = 0;
                                        for(int v55 = 0; v55 < v53; ++v55) {
                                            int v57 = zzfb2.zzl();
                                            v56 += v57;
                                            arr_z2[v55] = v57 > v51;
                                        }
                                    }
                                    else {
                                        v56 = v52 * v53;
                                        Arrays.fill(zzahi5.zzl, 0, v53, v52 > v51);
                                    }
                                    Arrays.fill(zzahi5.zzl, v53, zzahi5.zze, false);
                                    if(v56 > 0) {
                                        zzahi5.zza(v56);
                                    }
                                }
                                zzagi zzagi6 = zzagh6.zzb(0x7361696F);
                                if(zzagi6 != null) {
                                    zzfb zzfb3 = zzagi6.zza;
                                    zzfb3.zzG(8);
                                    int v58 = zzfb3.zzf();
                                    if((v58 & 1) == 1) {
                                        zzfb3.zzH(8);
                                    }
                                    int v59 = zzfb3.zzo();
                                    if(v59 != 1) {
                                        throw zzcd.zza(("Unexpected saio entry count: " + v59), null);
                                    }
                                    zzahi5.zzc += ((v58 >> 24 & 0xFF) == 0 ? zzfb3.zzt() : zzfb3.zzu());
                                }
                                zzagi zzagi7 = zzagh6.zzb(1936027235);
                                if(zzagi7 != null) {
                                    zzagx.zzh(zzagi7.zza, 0, zzahi5);
                                }
                                String s = zzahh0 == null ? null : zzahh0.zzb;
                                zzfb zzfb4 = null;
                                zzfb zzfb5 = null;
                                for(int v60 = 0; v60 < zzagh6.zzb.size(); ++v60) {
                                    zzagi zzagi8 = (zzagi)zzagh6.zzb.get(v60);
                                    zzfb zzfb6 = zzagi8.zza;
                                    int v61 = zzagi8.zzd;
                                    if(v61 == 0x73626770) {
                                        zzfb6.zzG(12);
                                        if(zzfb6.zzf() == 1936025959) {
                                            zzfb4 = zzfb6;
                                        }
                                    }
                                    else if(v61 == 0x73677064) {
                                        zzfb6.zzG(12);
                                        if(zzfb6.zzf() == 1936025959) {
                                            zzfb5 = zzfb6;
                                        }
                                    }
                                }
                                if(zzfb4 != null && zzfb5 != null) {
                                    zzfb4.zzG(8);
                                    int v62 = zzagj.zze(zzfb4.zzf());
                                    zzfb4.zzH(4);
                                    if(v62 == 1) {
                                        zzfb4.zzH(4);
                                    }
                                    if(zzfb4.zzf() != 1) {
                                        throw zzcd.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzfb5.zzG(8);
                                    int v63 = zzagj.zze(zzfb5.zzf());
                                    zzfb5.zzH(4);
                                    if(v63 == 1) {
                                        if(zzfb5.zzt() == 0L) {
                                            throw zzcd.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    }
                                    else if(v63 >= 2) {
                                        zzfb5.zzH(4);
                                    }
                                    if(zzfb5.zzt() != 1L) {
                                        throw zzcd.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzfb5.zzH(1);
                                    int v64 = zzfb5.zzl();
                                    int v65 = (v64 & 0xF0) >> 4;
                                    int v66 = v64 & 15;
                                    if(zzfb5.zzl() == 1) {
                                        int v67 = zzfb5.zzl();
                                        byte[] arr_b3 = new byte[16];
                                        zzfb5.zzC(arr_b3, 0, 16);
                                        if(v67 == 0) {
                                            int v68 = zzfb5.zzl();
                                            byte[] arr_b4 = new byte[v68];
                                            zzfb5.zzC(arr_b4, 0, v68);
                                            arr_b5 = arr_b4;
                                        }
                                        else {
                                            arr_b5 = null;
                                        }
                                        zzahi5.zzk = true;
                                        zzahi5.zzm = new zzahh(true, s, v67, arr_b3, v65, v66, arr_b5);
                                    }
                                }
                                int v69 = zzagh6.zzb.size();
                                int v70 = 0;
                                while(v70 < v69) {
                                    zzagi zzagi9 = (zzagi)zzagh6.zzb.get(v70);
                                    if(zzagi9.zzd == 1970628964) {
                                        zzfb zzfb7 = zzagi9.zza;
                                        zzfb7.zzG(8);
                                        arr_b6 = arr_b2;
                                        zzfb7.zzC(arr_b6, 0, 16);
                                        if(Arrays.equals(arr_b6, zzagx.zzb)) {
                                            zzagx.zzh(zzfb7, 16, zzahi5);
                                        }
                                    }
                                    else {
                                        arr_b6 = arr_b2;
                                    }
                                    ++v70;
                                    arr_b2 = arr_b6;
                                }
                                arr_b7 = arr_b2;
                            }
                        }
                        else {
                            sparseArray3 = sparseArray2;
                            arr_b7 = arr_b;
                            v49 = v9;
                            v50 = v10;
                            zzagh5 = zzagh0;
                        }
                        arr_b = arr_b7;
                        sparseArray2 = sparseArray3;
                        v9 = v49;
                        zzagh0 = zzagh5;
                        v10 = v50 + 1;
                    }
                    zzad zzad1 = zzagx.zzf(zzagh0.zzb);
                    zzagx1 = this;
                    if(zzad1 != null) {
                        int v71 = zzagx1.zze.size();
                        for(int v72 = 0; v72 < v71; ++v72) {
                            zzagw zzagw2 = (zzagw)zzagx1.zze.valueAt(v72);
                            zzahh zzahh1 = zzagw2.zzd.zza.zza(zzagw2.zzb.zza.zza);
                            zzad zzad2 = zzad1.zzb((zzahh1 == null ? null : zzahh1.zzb));
                            zzak zzak0 = zzagw2.zzd.zza.zzf.zzb();
                            zzak0.zzB(zzad2);
                            zzam zzam0 = zzak0.zzY();
                            zzagw2.zza.zzk(zzam0);
                        }
                    }
                    if(zzagx1.zzv != 0x8000000000000001L) {
                        int v73 = zzagx1.zze.size();
                        for(int v74 = 0; v74 < v73; ++v74) {
                            zzagw zzagw3 = (zzagw)zzagx1.zze.valueAt(v74);
                            long v75 = zzagx1.zzv;
                            for(int v76 = zzagw3.zzf; true; ++v76) {
                                zzahi zzahi6 = zzagw3.zzb;
                                if(v76 >= zzahi6.zze || zzahi6.zzi[v76] > v75) {
                                    break;
                                }
                                if(zzahi6.zzj[v76]) {
                                    zzagw3.zzi = v76;
                                }
                            }
                        }
                        zzagx1.zzv = 0x8000000000000001L;
                    }
                }
                else {
                    zzagx1 = zzagx0;
                    if(!zzagx1.zzm.isEmpty()) {
                        ((zzagh)zzagx1.zzm.peek()).zzc(zzagh0);
                    }
                }
                zzagx0 = zzagx1;
            }
        }
        this.zzg();
    }

    private static final zzags zzj(SparseArray sparseArray0, int v) {
        if(sparseArray0.size() == 1) {
            return (zzags)sparseArray0.valueAt(0);
        }
        zzags zzags0 = (zzags)sparseArray0.get(v);
        zzags0.getClass();
        return zzags0;
    }
}

