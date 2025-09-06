package com.google.android.gms.internal.ads;

import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

final class zzkl implements Handler.Callback, zzii, zzle, zzlh, zztp, zzxk {
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    private zzkk zzH;
    private long zzI;
    private int zzJ;
    private boolean zzK;
    private zzil zzL;
    private long zzM;
    private final zzjg zzN;
    private final zzig zzO;
    private final zzln[] zza;
    private final Set zzb;
    private final zzlp[] zzc;
    private final zzxl zzd;
    private final zzxm zze;
    private final zzko zzf;
    private final zzxt zzg;
    private final zzej zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzcv zzk;
    private final zzct zzl;
    private final long zzm;
    private final zzij zzn;
    private final ArrayList zzo;
    private final zzdz zzp;
    private final zzkt zzq;
    private final zzlf zzr;
    private final long zzs;
    private zzlr zzt;
    private zzlg zzu;
    private zzkj zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    public zzkl(zzln[] arr_zzln, zzxl zzxl0, zzxm zzxm0, zzko zzko0, zzxt zzxt0, int v, boolean z, zzlx zzlx0, zzlr zzlr0, zzig zzig0, long v1, boolean z1, Looper looper0, zzdz zzdz0, zzjg zzjg0, zzoh zzoh0, Looper looper1) {
        this.zzN = zzjg0;
        this.zza = arr_zzln;
        this.zzd = zzxl0;
        this.zze = zzxm0;
        this.zzf = zzko0;
        this.zzg = zzxt0;
        this.zzB = 0;
        this.zzC = false;
        this.zzt = zzlr0;
        this.zzO = zzig0;
        this.zzs = v1;
        this.zzx = false;
        this.zzp = zzdz0;
        this.zzM = 0x8000000000000001L;
        this.zzm = zzko0.zza();
        zzko0.zzf();
        zzlg zzlg0 = zzlg.zzi(zzxm0);
        this.zzu = zzlg0;
        this.zzv = new zzkj(zzlg0);
        this.zzc = new zzlp[2];
        zzlo zzlo0 = zzxl0.zzc();
        for(int v2 = 0; v2 < 2; ++v2) {
            arr_zzln[v2].zzu(v2, zzoh0, zzdz0);
            this.zzc[v2] = arr_zzln[v2].zzl();
            this.zzc[v2].zzI(zzlo0);
        }
        this.zzn = new zzij(this, zzdz0);
        this.zzo = new ArrayList();
        this.zzb = Collections.newSetFromMap(new IdentityHashMap());
        this.zzk = new zzcv();
        this.zzl = new zzct();
        zzxl0.zzr(this, zzxt0);
        this.zzK = true;
        zzej zzej0 = zzdz0.zzb(looper0, null);
        this.zzq = new zzkt(zzlx0, zzej0);
        this.zzr = new zzlf(this, zzlx0, zzej0, zzoh0);
        HandlerThread handlerThread0 = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzi = handlerThread0;
        handlerThread0.start();
        Looper looper2 = handlerThread0.getLooper();
        this.zzj = looper2;
        this.zzh = zzdz0.zzb(looper2, this);
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        int v41;
        zzil zzil1;
        long v33;
        Throwable throwable2;
        long v32;
        zzlg zzlg3;
        long v31;
        zzlg zzlg2;
        long v30;
        long v28;
        int v27;
        zzts zzts4;
        long v26;
        zzkk zzkk0;
        boolean z9;
        int v22;
        long v21;
        boolean z5;
        boolean z4;
        int v11;
        long v4;
        try {
            switch(message0.what) {
                case 0: {
                    this.zzv.zza(1);
                    this.zzM(false, false, false, true);
                    this.zzf.zzb();
                    this.zzU((this.zzu.zza.zzo() ? 4 : 2));
                    this.zzr.zzg(((zzhk)this.zzg));
                    this.zzh.zzi(2);
                    goto label_531;
                }
                case 1: {
                    this.zzT(message0.arg1 != 0, message0.arg2, true, 1);
                    goto label_531;
                }
                case 2: {
                    long v2 = SystemClock.uptimeMillis();
                    this.zzh.zzf(2);
                    if(!this.zzu.zza.zzo() && this.zzr.zzj()) {
                        this.zzq.zzk(this.zzI);
                        if(this.zzq.zzn()) {
                            zzkr zzkr0 = this.zzq.zzf(this.zzI, this.zzu);
                            if(zzkr0 != null) {
                                zzxu zzxu0 = this.zzf.zzi();
                                zzkq zzkq0 = this.zzq.zzr(this.zzc, this.zzd, zzxu0, this.zzr, zzkr0, this.zze);
                                zzkq0.zza.zzl(this, zzkr0.zzb);
                                if(this.zzq.zzd() == zzkq0) {
                                    this.zzO(zzkr0.zzb);
                                }
                                this.zzE(false);
                            }
                        }
                        if(this.zzA) {
                            this.zzA = this.zzad();
                            this.zzY();
                        }
                        else {
                            this.zzI();
                        }
                        zzkq zzkq1 = this.zzq.zze();
                        if(zzkq1 == null) {
                        label_104:
                            v4 = v2;
                        }
                        else if(zzkq1.zzg() != null && !this.zzy) {
                            zzkq zzkq2 = this.zzq.zze();
                            if(zzkq2.zzd) {
                                int v3 = 0;
                                while(true) {
                                    zzln[] arr_zzln = this.zza;
                                    if(v3 >= 2) {
                                        break;
                                    }
                                    zzln zzln0 = arr_zzln[v3];
                                    zzvj zzvj0 = zzkq2.zzc[v3];
                                    if(zzln0.zzo() != zzvj0 || zzvj0 != null && !zzln0.zzM()) {
                                        goto label_104;
                                    }
                                    ++v3;
                                }
                                if(!zzkq1.zzg().zzd && this.zzI < zzkq1.zzg().zzf()) {
                                    v4 = v2;
                                }
                                else {
                                    zzkq zzkq3 = this.zzq.zzb();
                                    zzxm zzxm0 = zzkq3.zzi();
                                    v4 = v2;
                                    zzxm zzxm1 = zzkq1.zzi();
                                    this.zzab(this.zzu.zza, zzkq3.zzf.zza, this.zzu.zza, zzkq1.zzf.zza, 0x8000000000000001L, false);
                                    if(!zzkq3.zzd || zzkq3.zza.zzd() == 0x8000000000000001L) {
                                        for(int v7 = 0; v7 < 2; ++v7) {
                                            boolean z = zzxm1.zzb(v7);
                                            boolean z1 = zzxm0.zzb(v7);
                                            if(z && !this.zza[v7].zzN()) {
                                                this.zzc[v7].zzb();
                                                if(!z1 || !zzxm0.zzb[v7].equals(zzxm1.zzb[v7])) {
                                                    zzkl.zzam(this.zza[v7], zzkq3.zzf());
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        long v5 = zzkq3.zzf();
                                        zzln[] arr_zzln1 = this.zza;
                                        for(int v6 = 0; v6 < 2; ++v6) {
                                            zzln zzln1 = arr_zzln1[v6];
                                            if(zzln1.zzo() != null) {
                                                zzkl.zzam(zzln1, v5);
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                goto label_104;
                            }
                        }
                        else {
                            v4 = v2;
                            if(zzkq1.zzf.zzi || this.zzy) {
                                for(int v8 = 0; true; ++v8) {
                                    zzln[] arr_zzln2 = this.zza;
                                    if(v8 >= 2) {
                                        break;
                                    }
                                    zzln zzln2 = arr_zzln2[v8];
                                    zzvj zzvj1 = zzkq1.zzc[v8];
                                    if(zzvj1 != null && zzln2.zzo() == zzvj1 && zzln2.zzM()) {
                                        long v9 = zzkq1.zzf.zze;
                                        zzkl.zzam(zzln2, (v9 == 0x8000000000000001L || v9 == 0x8000000000000000L ? 0x8000000000000001L : zzkq1.zze() + v9));
                                    }
                                }
                            }
                        }
                        zzkq zzkq4 = this.zzq.zze();
                        if(zzkq4 != null && this.zzq.zzd() != zzkq4 && !zzkq4.zzg) {
                            zzkq zzkq5 = this.zzq.zze();
                            zzxm zzxm2 = zzkq5.zzi();
                            boolean z2 = false;
                            for(int v10 = 0; true; ++v10) {
                                zzln[] arr_zzln3 = this.zza;
                                if(v10 >= 2) {
                                    break;
                                }
                                zzln zzln3 = arr_zzln3[v10];
                                if(zzkl.zzae(zzln3) && (!zzxm2.zzb(v10) || zzln3.zzo() != zzkq5.zzc[v10])) {
                                    if(!zzln3.zzN()) {
                                        zzln3.zzE(zzkl.zzaj(zzxm2.zzc[v10]), zzkq5.zzc[v10], zzkq5.zzf(), zzkq5.zze());
                                    }
                                    else if(zzln3.zzS()) {
                                        this.zzA(zzln3);
                                    }
                                    else {
                                        z2 = true;
                                    }
                                }
                            }
                            if(!z2) {
                                this.zzB();
                            }
                        }
                        for(boolean z3 = false; this.zzah() && !this.zzy; z3 = true) {
                            zzkq zzkq6 = this.zzq.zzd();
                            if(zzkq6 == null) {
                                break;
                            }
                            zzkq zzkq7 = zzkq6.zzg();
                            if(zzkq7 == null || this.zzI < zzkq7.zzf() || !zzkq7.zzg) {
                                break;
                            }
                            if(z3) {
                                this.zzJ();
                            }
                            zzkq zzkq8 = this.zzq.zza();
                            if(zzkq8 == null) {
                                throw null;
                            }
                            if(this.zzu.zzb.zza.equals(zzkq8.zzf.zza.zza)) {
                                zzts zzts0 = this.zzu.zzb;
                                if(zzts0.zzb == -1) {
                                    zzts zzts1 = zzkq8.zzf.zza;
                                    if(zzts1.zzb == -1 && zzts0.zze != zzts1.zze) {
                                        v11 = 1;
                                    }
                                }
                            }
                            else {
                                v11 = 0;
                            }
                            this.zzu = this.zzz(zzkq8.zzf.zza, zzkq8.zzf.zzb, zzkq8.zzf.zzc, zzkq8.zzf.zzb, ((boolean)(v11 ^ 1)), 0);
                            this.zzN();
                            this.zzaa();
                            zzxm zzxm3 = this.zzq.zzd().zzi();
                            for(int v12 = 0; v12 < 2; ++v12) {
                                if(zzxm3.zzb(v12)) {
                                    this.zza[v12].zzs();
                                }
                            }
                        }
                    }
                    else {
                        v4 = v2;
                    }
                    if(this.zzu.zze != 1 && this.zzu.zze != 4) {
                        zzkq zzkq9 = this.zzq.zzd();
                        if(zzkq9 == null) {
                            this.zzQ(v4, 10L);
                        }
                        else {
                            Trace.beginSection("doSomeWork");
                            this.zzaa();
                            if(zzkq9.zzd) {
                                long v13 = zzfk.zzp(SystemClock.elapsedRealtime());
                                zzkq9.zza.zzj(this.zzu.zzr - this.zzm, false);
                                z4 = true;
                                z5 = true;
                                for(int v14 = 0; true; ++v14) {
                                    zzln[] arr_zzln4 = this.zza;
                                    if(v14 >= 2) {
                                        break;
                                    }
                                    zzln zzln4 = arr_zzln4[v14];
                                    if(zzkl.zzae(zzln4)) {
                                        zzln4.zzR(this.zzI, v13);
                                        z4 = z4 && zzln4.zzS();
                                        boolean z6 = zzkq9.zzc[v14] != zzln4.zzo();
                                        boolean z7 = z6 || !z6 && zzln4.zzM() || zzln4.zzT() || zzln4.zzS();
                                        z5 = z5 && z7;
                                        if(!z7) {
                                            zzln4.zzv();
                                        }
                                    }
                                }
                            }
                            else {
                                zzkq9.zza.zzk();
                                z4 = true;
                                z5 = true;
                            }
                            long v15 = zzkq9.zzf.zze;
                            if(!z4 || !zzkq9.zzd || v15 != 0x8000000000000001L && v15 > this.zzu.zzr) {
                            label_195:
                                zzlg zzlg0 = this.zzu;
                                if(zzlg0.zze != 2) {
                                label_216:
                                    if(this.zzu.zze == 3) {
                                        if(this.zzG != 0) {
                                            if(!z5) {
                                            label_221:
                                                this.zzz = this.zzah();
                                                this.zzU(2);
                                                if(this.zzz) {
                                                    for(zzkq zzkq12 = this.zzq.zzd(); zzkq12 != null; zzkq12 = zzkq12.zzg()) {
                                                        zzxf[] arr_zzxf = zzkq12.zzi().zzc;
                                                        for(int v18 = 0; v18 < arr_zzxf.length; ++v18) {
                                                            zzxf zzxf0 = arr_zzxf[v18];
                                                        }
                                                    }
                                                    this.zzO.zzc();
                                                }
                                                this.zzX();
                                            }
                                        }
                                        else if(!this.zzaf()) {
                                            goto label_221;
                                        }
                                    }
                                }
                                else if(this.zzG != 0) {
                                    if(!z5) {
                                        goto label_216;
                                    }
                                    else if(zzlg0.zzg) {
                                        zzkq zzkq10 = this.zzq.zzd();
                                        long v16 = this.zzai(this.zzu.zza, zzkq10.zzf.zza) ? this.zzO.zzb() : 0x8000000000000001L;
                                        zzkq zzkq11 = this.zzq.zzc();
                                        if(zzkq11.zzr() && zzkq11.zzf.zzi || zzkq11.zzf.zza.zzb() && !zzkq11.zzd) {
                                            goto label_211;
                                        }
                                        else {
                                            zzcw zzcw0 = this.zzu.zza;
                                            zzts zzts2 = zzkq10.zzf.zza;
                                            long v17 = this.zzt();
                                            zzch zzch0 = this.zzn.zzc();
                                            if(this.zzf.zzh(zzcw0, zzts2, v17, zzch0.zzc, this.zzz, v16)) {
                                                goto label_211;
                                            }
                                            else {
                                                goto label_216;
                                            }
                                        }
                                    }
                                    else {
                                    label_211:
                                        this.zzU(3);
                                        this.zzL = null;
                                        if(this.zzah()) {
                                            this.zzV();
                                        }
                                    }
                                }
                                else if(this.zzaf()) {
                                    goto label_211;
                                }
                                else {
                                    goto label_216;
                                }
                            }
                            else {
                                if(this.zzy) {
                                    this.zzy = false;
                                    this.zzT(false, this.zzu.zzm, false, 5);
                                }
                                if(zzkq9.zzf.zzi) {
                                    this.zzU(4);
                                    this.zzX();
                                    goto label_236;
                                }
                                goto label_195;
                            }
                        label_236:
                            if(this.zzu.zze == 2) {
                                for(int v19 = 0; true; ++v19) {
                                    zzln[] arr_zzln5 = this.zza;
                                    if(v19 >= 2) {
                                        break;
                                    }
                                    if(zzkl.zzae(arr_zzln5[v19]) && this.zza[v19].zzo() == zzkq9.zzc[v19]) {
                                        this.zza[v19].zzv();
                                    }
                                }
                                if(this.zzu.zzg || this.zzu.zzq >= 500000L || !this.zzad()) {
                                    this.zzM = 0x8000000000000001L;
                                }
                                else if(this.zzM == 0x8000000000000001L) {
                                    this.zzM = SystemClock.elapsedRealtime();
                                }
                                else if(SystemClock.elapsedRealtime() - this.zzM >= 4000L) {
                                    throw new IllegalStateException("Playback stuck buffering and not loading");
                                }
                            }
                            else {
                                this.zzM = 0x8000000000000001L;
                            }
                            int v20 = !this.zzah() || this.zzu.zze != 3 ? 0 : 1;
                            boolean z8 = this.zzF && this.zzE && v20 != 0;
                            zzlg zzlg1 = this.zzu;
                            if(zzlg1.zzo == z8) {
                                v22 = v20;
                                z9 = z8;
                                v21 = v4;
                            }
                            else {
                                v21 = v4;
                                v22 = v20;
                                z9 = z8;
                                this.zzu = new zzlg(zzlg1.zza, zzlg1.zzb, zzlg1.zzc, zzlg1.zzd, zzlg1.zze, zzlg1.zzf, zzlg1.zzg, zzlg1.zzh, zzlg1.zzi, zzlg1.zzj, zzlg1.zzk, zzlg1.zzl, zzlg1.zzm, zzlg1.zzn, zzlg1.zzp, zzlg1.zzq, zzlg1.zzr, zzlg1.zzs, z9);
                            }
                            this.zzE = false;
                            if(!z9) {
                                int v23 = this.zzu.zze;
                                if(v23 != 4) {
                                    if(v22 == 0) {
                                        switch(v23) {
                                            case 2: {
                                                this.zzQ(v21, 10L);
                                                break;
                                            }
                                            case 3: {
                                                if(this.zzG != 0) {
                                                    this.zzQ(v21, 1000L);
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        this.zzQ(v21, 10L);
                                    }
                                }
                            }
                            Trace.endSection();
                        }
                    }
                    goto label_531;
                }
                case 3: {
                    zzkk0 = (zzkk)message0.obj;
                    this.zzv.zza(1);
                    Pair pair0 = zzkl.zzy(this.zzu.zza, zzkk0, true, this.zzB, this.zzC, this.zzk, this.zzl);
                    if(pair0 == null) {
                        Pair pair1 = this.zzx(this.zzu.zza);
                        zzts4 = (zzts)pair1.first;
                        long v29 = (long)(((Long)pair1.second));
                        v27 = !this.zzu.zza.zzo();
                        v28 = v29;
                        v26 = 0x8000000000000001L;
                    }
                    else {
                        Object object0 = pair0.first;
                        long v24 = (long)(((Long)pair0.second));
                        long v25 = zzkk0.zzc == 0x8000000000000001L ? 0x8000000000000001L : v24;
                        zzts zzts3 = this.zzq.zzh(this.zzu.zza, object0, v24);
                        if(zzts3.zzb()) {
                            this.zzu.zza.zzn(zzts3.zza, this.zzl);
                            boolean z10 = this.zzl.zze(zzts3.zzb) != zzts3.zzc;
                            v26 = v25;
                            zzts4 = zzts3;
                            v27 = 1;
                            v28 = 0L;
                        }
                        else {
                            v26 = v25;
                            v28 = v24;
                            zzts4 = zzts3;
                            v27 = zzkk0.zzc == 0x8000000000000001L ? 1 : 0;
                        }
                    }
                    break;
                }
                case 4: {
                    goto label_346;
                }
                case 5: {
                    this.zzt = (zzlr)message0.obj;
                    goto label_531;
                }
                case 6: {
                    goto label_351;
                }
                case 7: {
                    this.zzM(true, false, true, false);
                    for(int v = 0; v < 2; ++v) {
                        this.zzc[v].zzp();
                        this.zza[v].zzD();
                    }
                    this.zzf.zzc();
                    this.zzU(1);
                    HandlerThread handlerThread0 = this.zzi;
                    if(handlerThread0 != null) {
                        handlerThread0.quit();
                    }
                    synchronized(this) {
                        this.zzw = true;
                        this.notifyAll();
                        return true;
                    }
                }
                case 8: {
                    goto label_353;
                }
                case 9: {
                    goto label_363;
                }
                case 10: {
                    goto label_367;
                }
                case 11: {
                    goto label_369;
                }
                case 12: {
                    goto label_374;
                }
                case 13: {
                    goto label_379;
                }
                case 14: {
                    goto label_401;
                }
                case 15: {
                    goto label_409;
                }
                case 16: {
                    goto label_417;
                }
                case 17: {
                    goto label_419;
                }
                case 18: {
                    goto label_425;
                }
                case 19: {
                    goto label_433;
                }
                case 20: {
                    goto label_437;
                }
                case 21: {
                    goto label_443;
                }
                case 22: {
                    goto label_447;
                }
                case 23: {
                    goto label_449;
                }
                case 24: {
                    goto label_455;
                }
                case 25: {
                    goto label_461;
                }
                case 26: {
                    goto label_463;
                }
                case 27: {
                    goto label_465;
                }
                default: {
                    return false;
                }
            }
        }
        catch(zzil zzil0) {
            goto label_484;
        }
        catch(zzqr zzqr0) {
            this.zzD(zzqr0, zzqr0.zza);
            goto label_531;
        }
        catch(zzcd zzcd0) {
            goto label_512;
        }
        catch(zzgj zzgj0) {
            this.zzD(zzgj0, zzgj0.zza);
            goto label_531;
        }
        catch(zzsu zzsu0) {
            this.zzD(zzsu0, 1002);
            goto label_531;
        }
        catch(IOException iOException0) {
            this.zzD(iOException0, 2000);
            goto label_531;
        }
        catch(RuntimeException runtimeException0) {
            goto label_527;
        }
        try {
            if(this.zzu.zza.zzo()) {
                this.zzH = zzkk0;
                v32 = v28;
                zzlg3 = this.zzz(zzts4, v32, v26, v32, ((boolean)v27), 2);
                this.zzu = zzlg3;
                goto label_531;
            }
            else if(pair0 == null) {
                if(this.zzu.zze != 1) {
                    this.zzU(4);
                }
                this.zzM(false, true, false, true);
                v32 = v28;
                zzlg3 = this.zzz(zzts4, v32, v26, v32, ((boolean)v27), 2);
                this.zzu = zzlg3;
                goto label_531;
            }
            else if(zzts4.equals(this.zzu.zzb)) {
                zzkq zzkq13 = this.zzq.zzd();
                v30 = zzkq13 == null || !zzkq13.zzd || v28 == 0L ? v28 : zzkq13.zza.zza(v28, this.zzt);
                if(zzfk.zzr(v30) == zzfk.zzr(this.zzu.zzr)) {
                    zzlg2 = this.zzu;
                    if(zzlg2.zze != 2 && zzlg2.zze != 3) {
                        v31 = this.zzv(zzts4, v30, this.zzu.zze == 4);
                        goto label_327;
                    }
                    zzlg3 = this.zzz(zzts4, zzlg2.zzr, v26, zzlg2.zzr, ((boolean)v27), 2);
                    this.zzu = zzlg3;
                    goto label_531;
                }
                else {
                    goto label_326;
                }
            }
            else {
                goto label_325;
            }
            this.zzu = zzlg3;
            goto label_531;
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            v33 = v28;
            this.zzu = this.zzz(zzts4, v33, v26, v33, ((boolean)v27), 2);
            throw throwable2;
        }
        try {
            zzlg3 = this.zzz(zzts4, zzlg2.zzr, v26, zzlg2.zzr, ((boolean)v27), 2);
            this.zzu = zzlg3;
            goto label_531;
        }
        catch(zzil zzil0) {
            goto label_484;
        }
        catch(zzqr zzqr0) {
            this.zzD(zzqr0, zzqr0.zza);
            goto label_531;
        }
        catch(zzcd zzcd0) {
            goto label_512;
        }
        catch(zzgj zzgj0) {
            this.zzD(zzgj0, zzgj0.zza);
            goto label_531;
        }
        catch(zzsu zzsu0) {
            this.zzD(zzsu0, 1002);
            goto label_531;
        }
        catch(IOException iOException0) {
            this.zzD(iOException0, 2000);
            goto label_531;
        }
        catch(RuntimeException runtimeException0) {
            goto label_527;
        }
        try {
        label_325:
            v30 = v28;
        label_326:
            v31 = this.zzv(zzts4, v30, this.zzu.zze == 4);
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            v33 = v28;
            this.zzu = this.zzz(zzts4, v33, v26, v33, ((boolean)v27), 2);
            throw throwable2;
        }
        try {
        label_327:
            v27 |= (v28 == v31 ? 0 : 1);
            this.zzab(this.zzu.zza, zzts4, this.zzu.zza, this.zzu.zzb, v26, true);
            v32 = v31;
            zzlg3 = this.zzz(zzts4, v32, v26, v32, ((boolean)v27), 2);
            this.zzu = zzlg3;
            goto label_531;
        }
        catch(Throwable throwable1) {
            try {
                throwable2 = throwable1;
                v33 = v31;
                this.zzu = this.zzz(zzts4, v33, v26, v33, ((boolean)v27), 2);
                throw throwable2;
            }
            catch(zzil zzil0) {
                goto label_484;
            }
            catch(zzqr zzqr0) {
                this.zzD(zzqr0, zzqr0.zza);
                goto label_531;
            }
            catch(zzcd zzcd0) {
                goto label_512;
            }
            catch(zzgj zzgj0) {
                this.zzD(zzgj0, zzgj0.zza);
                goto label_531;
            }
            catch(zzsu zzsu0) {
                this.zzD(zzsu0, 1002);
                goto label_531;
            }
            catch(IOException iOException0) {
                this.zzD(iOException0, 2000);
                goto label_531;
            }
            catch(RuntimeException runtimeException0) {
                goto label_527;
            }
        }
        try {
            this.zzH = zzkk0;
            v32 = v28;
            zzlg3 = this.zzz(zzts4, v32, v26, v32, ((boolean)v27), 2);
            this.zzu = zzlg3;
            goto label_531;
        }
        catch(Throwable throwable0) {
            try {
                throwable2 = throwable0;
                v33 = v28;
                this.zzu = this.zzz(zzts4, v33, v26, v33, ((boolean)v27), 2);
                throw throwable2;
            label_346:
                this.zzS(((zzch)message0.obj));
                this.zzG(this.zzn.zzc(), true);
                goto label_531;
            label_351:
                this.zzW(false, true);
                goto label_531;
            label_353:
                if(this.zzq.zzl(((zztq)message0.obj))) {
                    zzkq zzkq14 = this.zzq.zzc();
                    zzkq14.zzl(this.zzn.zzc().zzc, this.zzu.zza);
                    this.zzZ(zzkq14.zzf.zza, zzkq14.zzh(), zzkq14.zzi());
                    if(zzkq14 == this.zzq.zzd()) {
                        this.zzO(zzkq14.zzf.zzb);
                        this.zzB();
                        this.zzu = this.zzz(this.zzu.zzb, zzkq14.zzf.zzb, this.zzu.zzc, zzkq14.zzf.zzb, false, 5);
                    }
                    this.zzI();
                    goto label_531;
                label_363:
                    if(this.zzq.zzl(((zztq)message0.obj))) {
                        this.zzq.zzk(this.zzI);
                        this.zzI();
                        goto label_531;
                    label_367:
                        this.zzK();
                        goto label_531;
                    label_369:
                        this.zzB = message0.arg1;
                        if(!this.zzq.zzp(this.zzu.zza, message0.arg1)) {
                            this.zzR(true);
                        }
                        this.zzE(false);
                        goto label_531;
                    label_374:
                        this.zzC = message0.arg1 != 0;
                        if(!this.zzq.zzq(this.zzu.zza, message0.arg1 != 0)) {
                            this.zzR(true);
                        }
                        this.zzE(false);
                        goto label_531;
                    label_379:
                        boolean z11 = message0.arg1 != 0;
                        AtomicBoolean atomicBoolean0 = (AtomicBoolean)message0.obj;
                        if(this.zzD != z11) {
                            this.zzD = z11;
                            if(!z11) {
                                zzln[] arr_zzln6 = this.zza;
                                for(int v34 = 0; v34 < 2; ++v34) {
                                    zzln zzln5 = arr_zzln6[v34];
                                    if(!zzkl.zzae(zzln5) && this.zzb.remove(zzln5)) {
                                        zzln5.zzF();
                                    }
                                }
                            }
                        }
                        if(atomicBoolean0 != null) {
                            synchronized(this) {
                                atomicBoolean0.set(true);
                                this.notifyAll();
                            }
                            goto label_531;
                        label_401:
                            zzlj zzlj0 = (zzlj)message0.obj;
                            if(zzlj0.zzb() == this.zzj) {
                                zzkl.zzak(zzlj0);
                                if(this.zzu.zze == 2 || this.zzu.zze == 3) {
                                    this.zzh.zzi(2);
                                }
                            }
                            else {
                                this.zzh.zzc(15, zzlj0).zza();
                                goto label_531;
                            label_409:
                                zzlj zzlj1 = (zzlj)message0.obj;
                                Looper looper0 = zzlj1.zzb();
                                if(looper0.getThread().isAlive()) {
                                    this.zzp.zzb(looper0, null).zzh(() -> try {
                                        zzkl.zzak(zzlj1);
                                    }
                                    catch(zzil zzil0) {
                                        zzes.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", zzil0);
                                        throw new RuntimeException(zzil0);
                                    });
                                    goto label_531;
                                label_417:
                                    this.zzG(((zzch)message0.obj), false);
                                    goto label_531;
                                label_419:
                                    zzkg zzkg0 = (zzkg)message0.obj;
                                    this.zzv.zza(1);
                                    if(zzkg0.zzb != -1) {
                                        this.zzH = new zzkk(new zzll(zzkg0.zza, zzkg0.zzd), zzkg0.zzb, zzkg0.zzc);
                                    }
                                    this.zzF(this.zzr.zzn(zzkg0.zza, zzkg0.zzd), false);
                                    goto label_531;
                                label_425:
                                    zzkg zzkg1 = (zzkg)message0.obj;
                                    int v36 = message0.arg1;
                                    this.zzv.zza(1);
                                    zzlf zzlf0 = this.zzr;
                                    if(v36 == -1) {
                                        v36 = zzlf0.zza();
                                    }
                                    this.zzF(zzlf0.zzk(v36, zzkg1.zza, zzkg1.zzd), false);
                                    goto label_531;
                                label_433:
                                    zzkh zzkh0 = (zzkh)message0.obj;
                                    this.zzv.zza(1);
                                    this.zzF(this.zzr.zzl(0, 0, 0, null), false);
                                    goto label_531;
                                label_437:
                                    int v37 = message0.arg1;
                                    int v38 = message0.arg2;
                                    zzvm zzvm0 = (zzvm)message0.obj;
                                    this.zzv.zza(1);
                                    this.zzF(this.zzr.zzm(v37, v38, zzvm0), false);
                                    goto label_531;
                                label_443:
                                    zzvm zzvm1 = (zzvm)message0.obj;
                                    this.zzv.zza(1);
                                    this.zzF(this.zzr.zzo(zzvm1), false);
                                    goto label_531;
                                label_447:
                                    this.zzF(this.zzr.zzb(), true);
                                    goto label_531;
                                label_449:
                                    this.zzx = message0.arg1 != 0;
                                    this.zzN();
                                    if(this.zzy && this.zzq.zze() != this.zzq.zzd()) {
                                        this.zzR(true);
                                        this.zzE(false);
                                        goto label_531;
                                    label_455:
                                        boolean z12 = message0.arg1 == 1;
                                        if(z12 != this.zzF) {
                                            this.zzF = z12;
                                            if(!z12 && this.zzu.zzo) {
                                                this.zzh.zzi(2);
                                                goto label_531;
                                            label_461:
                                                this.zzL();
                                                goto label_531;
                                            label_463:
                                                this.zzL();
                                                goto label_531;
                                            label_465:
                                                int v39 = message0.arg1;
                                                int v40 = message0.arg2;
                                                List list0 = (List)message0.obj;
                                                this.zzv.zza(1);
                                                this.zzF(this.zzr.zzc(v39, v40, list0), false);
                                                goto label_531;
                                            label_484:
                                                zzil1 = zzil0;
                                                if(zzil1.zze == 1) {
                                                    goto label_486;
                                                }
                                                goto label_489;
                                            }
                                        }
                                    }
                                }
                                else {
                                    zzes.zzf("TAG", "Trying to send message on a dead thread.");
                                    zzlj1.zzh(false);
                                }
                            }
                        }
                    }
                }
                goto label_531;
            }
            catch(zzil zzil0) {
                goto label_484;
            }
            catch(zzqr zzqr0) {
                this.zzD(zzqr0, zzqr0.zza);
                goto label_531;
            }
            catch(zzcd zzcd0) {
                goto label_512;
            }
            catch(zzgj zzgj0) {
                this.zzD(zzgj0, zzgj0.zza);
                goto label_531;
            }
            catch(zzsu zzsu0) {
                this.zzD(zzsu0, 1002);
                goto label_531;
            }
            catch(IOException iOException0) {
                this.zzD(iOException0, 2000);
                goto label_531;
            }
            catch(RuntimeException runtimeException0) {
                goto label_527;
            }
        }
    label_486:
        zzkq zzkq15 = this.zzq.zze();
        if(zzkq15 != null) {
            zzil1 = zzil1.zza(zzkq15.zzf.zza);
        }
    label_489:
        if(!zzil1.zzk || this.zzL != null) {
            zzil zzil2 = this.zzL;
            if(zzil2 != null) {
                try {
                    zzil2.addSuppressed(zzil1);
                }
                catch(Exception unused_ex) {
                }
                zzil1 = this.zzL;
            }
            zzes.zzd("ExoPlayerImplInternal", "Playback error", zzil1);
            if(zzil1.zze == 1 && this.zzq.zzd() != this.zzq.zze()) {
                while(this.zzq.zzd() != this.zzq.zze()) {
                    this.zzq.zza();
                }
                zzkq zzkq16 = this.zzq.zzd();
                zzkq16.getClass();
                this.zzu = this.zzz(zzkq16.zzf.zza, zzkq16.zzf.zzb, zzkq16.zzf.zzc, zzkq16.zzf.zzb, true, 0);
            }
            this.zzW(true, false);
            this.zzu = this.zzu.zzf(zzil1);
            goto label_531;
        label_512:
            if(zzcd0.zzb != 1) {
                v41 = 1000;
            }
            else if(!zzcd0.zza) {
                v41 = 3003;
            }
            else {
                v41 = 3001;
            }
            this.zzD(zzcd0, v41);
            goto label_531;
        label_527:
            zzil zzil3 = zzil.zzd(runtimeException0, (!(runtimeException0 instanceof IllegalStateException) && !(runtimeException0 instanceof IllegalArgumentException) ? 1000 : 1004));
            zzes.zzd("ExoPlayerImplInternal", "Playback error", zzil3);
            this.zzW(true, false);
            this.zzu = this.zzu.zzf(zzil3);
        }
        else {
            zzes.zzg("ExoPlayerImplInternal", "Recoverable renderer error", zzil1);
            this.zzL = zzil1;
            zzei zzei0 = this.zzh.zzc(25, zzil1);
            this.zzh.zzk(zzei0);
        }
    label_531:
        this.zzJ();
        return true;
    }

    private final void zzA(zzln zzln0) {
        if(!zzkl.zzae(zzln0)) {
            return;
        }
        this.zzn.zzd(zzln0);
        zzkl.zzal(zzln0);
        zzln0.zzq();
        --this.zzG;
    }

    private final void zzB() {
        this.zzC(new boolean[2]);
    }

    private final void zzC(boolean[] arr_z) {
        zzkq zzkq0 = this.zzq.zze();
        zzxm zzxm0 = zzkq0.zzi();
        for(int v = 0; v < 2; ++v) {
            if(!zzxm0.zzb(v) && this.zzb.remove(this.zza[v])) {
                this.zza[v].zzF();
            }
        }
        for(int v1 = 0; v1 < 2; ++v1) {
            if(zzxm0.zzb(v1)) {
                boolean z = arr_z[v1];
                zzln zzln0 = this.zza[v1];
                if(!zzkl.zzae(zzln0)) {
                    zzkq zzkq1 = this.zzq.zze();
                    zzxm zzxm1 = zzkq1.zzi();
                    zzlq zzlq0 = zzxm1.zzb[v1];
                    zzam[] arr_zzam = zzkl.zzaj(zzxm1.zzc[v1]);
                    boolean z1 = this.zzah() && this.zzu.zze == 3;
                    ++this.zzG;
                    this.zzb.add(zzln0);
                    zzln0.zzr(zzlq0, arr_zzam, zzkq1.zzc[v1], this.zzI, !z && z1, zzkq1 == this.zzq.zzd(), zzkq1.zzf(), zzkq1.zze());
                    zzln0.zzt(11, new zzke(this));
                    this.zzn.zze(zzln0);
                    if(z1) {
                        zzln0.zzK();
                    }
                }
            }
        }
        zzkq0.zzg = true;
    }

    private final void zzD(IOException iOException0, int v) {
        zzil zzil0 = zzil.zzc(iOException0, v);
        zzkq zzkq0 = this.zzq.zzd();
        if(zzkq0 != null) {
            zzil0 = zzil0.zza(zzkq0.zzf.zza);
        }
        zzes.zzd("ExoPlayerImplInternal", "Playback error", zzil0);
        this.zzW(false, false);
        this.zzu = this.zzu.zzf(zzil0);
    }

    private final void zzE(boolean z) {
        zzkq zzkq0 = this.zzq.zzc();
        zzts zzts0 = zzkq0 == null ? this.zzu.zzb : zzkq0.zzf.zza;
        boolean z1 = this.zzu.zzk.equals(zzts0);
        if(!z1) {
            this.zzu = this.zzu.zzc(zzts0);
        }
        zzlg zzlg0 = this.zzu;
        zzlg0.zzp = zzkq0 == null ? zzlg0.zzr : zzkq0.zzc();
        this.zzu.zzq = this.zzt();
        if((!z1 || z) && zzkq0 != null && zzkq0.zzd) {
            this.zzZ(zzkq0.zzf.zza, zzkq0.zzh(), zzkq0.zzi());
        }
    }

    private final void zzF(zzcw zzcw0, boolean z) {
        long v22;
        long v16;
        Object object1;
        int v13;
        int v12;
        int v11;
        boolean z5;
        int v10;
        int v9;
        boolean z4;
        int v8;
        long v7;
        int v6;
        zzts zzts2;
        int v15;
        int v14;
        long v4;
        int v3;
        boolean z2;
        long v2;
        zzts zzts0;
        zzlg zzlg0 = this.zzu;
        zzkk zzkk0 = this.zzH;
        zzkt zzkt0 = this.zzq;
        int v = this.zzB;
        boolean z1 = this.zzC;
        zzcv zzcv0 = this.zzk;
        zzct zzct0 = this.zzl;
        int v1 = 1;
        if(zzcw0.zzo()) {
            zzts0 = zzlg.zzj();
            v2 = 0x8000000000000001L;
            z2 = false;
            v3 = 0;
            v4 = 0L;
        }
        else {
            zzts zzts1 = zzlg0.zzb;
            Object object0 = zzts1.zza;
            boolean z3 = zzkl.zzag(zzlg0, zzct0);
            long v5 = zzlg0.zzb.zzb() || z3 ? zzlg0.zzc : zzlg0.zzr;
            if(zzkk0 == null) {
                zzts2 = zzts1;
                if(zzlg0.zza.zzo()) {
                    v14 = zzcw0.zzg(z1);
                    v11 = v14;
                    object1 = object0;
                    v7 = v5;
                    z5 = false;
                    v13 = 0;
                    v12 = 0;
                }
                else if(zzcw0.zza(object0) == -1) {
                    Object object2 = zzkl.zze(zzcv0, zzct0, v, z1, object0, zzlg0.zza, zzcw0);
                    if(object2 == null) {
                        v15 = zzcw0.zzg(z1);
                        v8 = 1;
                    }
                    else {
                        v15 = zzcw0.zzn(object2, zzct0).zzd;
                        v8 = 0;
                    }
                    v11 = v15;
                    v7 = v5;
                    z5 = false;
                    v12 = 0;
                    v13 = v8;
                    object1 = object0;
                }
                else if(v5 == 0x8000000000000001L) {
                    v14 = zzcw0.zzn(object0, zzct0).zzd;
                    v11 = v14;
                    object1 = object0;
                    v7 = v5;
                    z5 = false;
                    v13 = 0;
                    v12 = 0;
                }
                else if(z3) {
                    zzlg0.zza.zzn(zzts2.zza, zzct0);
                    if(zzlg0.zza.zze(zzct0.zzd, zzcv0, 0L).zzp == zzlg0.zza.zza(zzts2.zza)) {
                        Pair pair1 = zzcw0.zzl(zzcv0, zzct0, zzcw0.zzn(object0, zzct0).zzd, v5);
                        object0 = pair1.first;
                        v7 = (long)(((Long)pair1.second));
                    }
                    else {
                        v7 = v5;
                    }
                    v11 = -1;
                    object1 = object0;
                    z5 = false;
                    v13 = 0;
                    v12 = 1;
                }
                else {
                    v11 = -1;
                    object1 = object0;
                    v7 = v5;
                    z5 = false;
                    v13 = 0;
                    v12 = 0;
                }
            }
            else {
                zzts2 = zzts1;
                Pair pair0 = zzkl.zzy(zzcw0, zzkk0, true, v, z1, zzcv0, zzct0);
                if(pair0 == null) {
                    v6 = zzcw0.zzg(z1);
                    v7 = v5;
                    v8 = 1;
                    z4 = false;
                    v9 = 0;
                }
                else {
                    if(zzkk0.zzc == 0x8000000000000001L) {
                        v6 = zzcw0.zzn(pair0.first, zzct0).zzd;
                        v7 = v5;
                        v10 = 0;
                    }
                    else {
                        object0 = pair0.first;
                        v7 = (long)(((Long)pair0.second));
                        v6 = -1;
                        v10 = 1;
                    }
                    z4 = zzlg0.zze == 4;
                    v9 = v10;
                    v8 = 0;
                }
                z5 = z4;
                v11 = v6;
                v12 = v9;
                v13 = v8;
                object1 = object0;
            }
            if(v11 == -1) {
                v16 = v7;
            }
            else {
                Pair pair2 = zzcw0.zzl(zzcv0, zzct0, v11, 0x8000000000000001L);
                object1 = pair2.first;
                v16 = (long)(((Long)pair2.second));
                v7 = 0x8000000000000001L;
            }
            zzts zzts3 = zzkt0.zzh(zzcw0, object1, v16);
            int v17 = !zzts2.zza.equals(object1) || zzts2.zzb() || zzts3.zzb() || zzts3.zze != -1 && (zzts2.zze == -1 || zzts3.zze < zzts2.zze) ? 0 : 1;
            zzcw0.zzn(object1, zzct0);
            if(!z3 && v5 == v7 && zzts2.zza.equals(zzts3.zza)) {
                boolean z6 = !zzts2.zzb();
                boolean z7 = !zzts3.zzb();
            }
            if(1 == v17) {
                zzts3 = zzts2;
            }
            if(zzts3.zzb()) {
                if(zzts3.equals(zzts2)) {
                    v16 = zzlg0.zzr;
                }
                else {
                    zzcw0.zzn(zzts3.zza, zzct0);
                    v16 = 0L;
                }
            }
            v2 = v7;
            v4 = v16;
            z2 = z5;
            v3 = v12;
            zzts0 = zzts3;
            v1 = v13;
        }
        boolean z8 = !this.zzu.zzb.equals(zzts0) || v4 != this.zzu.zzr;
        int v18 = 3;
        try {
            if(v1 != 0) {
                if(this.zzu.zze != 1) {
                    this.zzU(4);
                }
                this.zzM(false, false, false, true);
            }
            if(!z8) {
                zzkt zzkt1 = this.zzq;
                long v19 = this.zzI;
                zzkq zzkq0 = zzkt1.zze();
                if(zzkq0 == null) {
                    v22 = 0L;
                }
                else {
                    long v20 = zzkq0.zze();
                    if(zzkq0.zzd) {
                        int v21 = 0;
                        v22 = v20;
                        while(true) {
                            zzln[] arr_zzln = this.zza;
                            if(v21 >= 2) {
                                goto label_146;
                            }
                            if(zzkl.zzae(arr_zzln[v21]) && this.zza[v21].zzo() == zzkq0.zzc[v21]) {
                                long v23 = this.zza[v21].zzbe();
                                if(v23 == 0x8000000000000000L) {
                                    break;
                                }
                                v22 = Math.max(v23, v22);
                            }
                            ++v21;
                        }
                        v20 = 0x8000000000000000L;
                    }
                    v22 = v20;
                }
            label_146:
                if(!zzkt1.zzo(zzcw0, v19, v22)) {
                    this.zzR(false);
                }
            }
            else if(!zzcw0.zzo()) {
                for(zzkq zzkq1 = this.zzq.zzd(); zzkq1 != null; zzkq1 = zzkq1.zzg()) {
                    if(zzkq1.zzf.zza.equals(zzts0)) {
                        zzkq1.zzf = this.zzq.zzg(zzcw0, zzkq1.zzf);
                        zzkq1.zzq();
                    }
                }
                v4 = this.zzv(zzts0, v4, z2);
            }
            goto label_178;
        }
        catch(Throwable throwable0) {
        }
        boolean z9 = true;
        this.zzab(zzcw0, zzts0, this.zzu.zza, this.zzu.zzb, (1 == v3 ? v4 : 0x8000000000000001L), false);
        if(z8 || v2 != this.zzu.zzc) {
            Object object3 = this.zzu.zzb.zza;
            zzcw zzcw1 = this.zzu.zza;
            if(!z8 || !z || zzcw1.zzo() || zzcw1.zzn(object3, this.zzl).zzg) {
                z9 = false;
            }
            long v24 = this.zzu.zzd;
            if(zzcw0.zza(object3) == -1) {
                v18 = 4;
            }
            this.zzu = this.zzz(zzts0, v4, v2, v24, z9, v18);
        }
        this.zzN();
        this.zzP(zzcw0, this.zzu.zza);
        this.zzu = this.zzu.zzh(zzcw0);
        if(!zzcw0.zzo()) {
            this.zzH = null;
        }
        this.zzE(false);
        throw throwable0;
    label_178:
        this.zzab(zzcw0, zzts0, this.zzu.zza, this.zzu.zzb, (1 == v3 ? v4 : 0x8000000000000001L), false);
        if(z8 || v2 != this.zzu.zzc) {
            Object object4 = this.zzu.zzb.zza;
            zzcw zzcw2 = this.zzu.zza;
            boolean z10 = z8 && z && !zzcw2.zzo() && !zzcw2.zzn(object4, this.zzl).zzg;
            long v25 = this.zzu.zzd;
            if(zzcw0.zza(object4) == -1) {
                v18 = 4;
            }
            this.zzu = this.zzz(zzts0, v4, v2, v25, z10, v18);
        }
        this.zzN();
        this.zzP(zzcw0, this.zzu.zza);
        this.zzu = this.zzu.zzh(zzcw0);
        if(!zzcw0.zzo()) {
            this.zzH = null;
        }
        this.zzE(false);
    }

    private final void zzG(zzch zzch0, boolean z) {
        this.zzH(zzch0, zzch0.zzc, true, z);
    }

    private final void zzH(zzch zzch0, float f, boolean z, boolean z1) {
        int v;
        if(z) {
            if(z1) {
                this.zzv.zza(1);
            }
            this.zzu = new zzlg(this.zzu.zza, this.zzu.zzb, this.zzu.zzc, this.zzu.zzd, this.zzu.zze, this.zzu.zzf, this.zzu.zzg, this.zzu.zzh, this.zzu.zzi, this.zzu.zzj, this.zzu.zzk, this.zzu.zzl, this.zzu.zzm, zzch0, this.zzu.zzp, this.zzu.zzq, this.zzu.zzr, this.zzu.zzs, this.zzu.zzo);
        }
        for(zzkq zzkq0 = this.zzq.zzd(); true; zzkq0 = zzkq0.zzg()) {
            v = 0;
            if(zzkq0 == null) {
                break;
            }
            zzxf[] arr_zzxf = zzkq0.zzi().zzc;
            while(v < arr_zzxf.length) {
                zzxf zzxf0 = arr_zzxf[v];
                ++v;
            }
        }
        zzln[] arr_zzln = this.zza;
        while(v < 2) {
            zzln zzln0 = arr_zzln[v];
            if(zzln0 != null) {
                zzln0.zzJ(f, zzch0.zzc);
            }
            ++v;
        }
    }

    private final void zzI() {
        long v2;
        long v1;
        boolean z = false;
        if(this.zzad()) {
            zzkq zzkq0 = this.zzq.zzc();
            long v = this.zzu(zzkq0.zzd());
            if(zzkq0 == this.zzq.zzd()) {
                v1 = this.zzI;
                v2 = zzkq0.zze();
            }
            else {
                v1 = this.zzI - zzkq0.zze();
                v2 = zzkq0.zzf.zzb;
            }
            long v3 = v1 - v2;
            zzch zzch0 = this.zzn.zzc();
            boolean z1 = this.zzf.zzg(v3, v, zzch0.zzc);
            if(z1 || v >= 500000L || this.zzm <= 0L) {
                z = z1;
            }
            else {
                this.zzq.zzd().zza.zzj(this.zzu.zzr, false);
                zzch zzch1 = this.zzn.zzc();
                z = this.zzf.zzg(v3, v, zzch1.zzc);
            }
        }
        this.zzA = z;
        if(z) {
            this.zzq.zzc().zzk(this.zzI);
        }
        this.zzY();
    }

    private final void zzJ() {
        this.zzv.zzc(this.zzu);
        if(this.zzv.zzg) {
            this.zzN.zza.zzU(this.zzv);
            this.zzv = new zzkj(this.zzu);
        }
    }

    private final void zzK() {
        float f = this.zzn.zzc().zzc;
        zzkq zzkq0 = this.zzq.zzd();
        zzkq zzkq1 = this.zzq.zze();
        int v = 1;
        while(zzkq0 != null && zzkq0.zzd) {
            zzxm zzxm0 = zzkq0.zzj(f, this.zzu.zza);
            zzxm zzxm1 = zzkq0.zzi();
            int v1 = 0;
            if(zzxm1 != null && zzxm1.zzc.length == zzxm0.zzc.length) {
                int v2 = 0;
                while(v2 < zzxm0.zzc.length) {
                    if(!zzxm0.zza(zzxm1, v2)) {
                        goto label_19;
                    }
                    ++v2;
                }
                if(zzkq0 != zzkq1) {
                    v1 = 1;
                }
                v &= v1;
                zzkq0 = zzkq0.zzg();
            }
            else {
            label_19:
                if(v == 0) {
                    this.zzq.zzm(zzkq0);
                    if(zzkq0.zzd) {
                        zzkq0.zza(zzxm0, Math.max(zzkq0.zzf.zzb, this.zzI - zzkq0.zze()), false);
                    }
                }
                else {
                    zzkq zzkq2 = this.zzq.zzd();
                    boolean z = this.zzq.zzm(zzkq2);
                    boolean[] arr_z = new boolean[2];
                    long v3 = zzkq2.zzb(zzxm0, this.zzu.zzr, z, arr_z);
                    boolean z1 = this.zzu.zze != 4 && v3 != this.zzu.zzr;
                    this.zzu = this.zzz(this.zzu.zzb, v3, this.zzu.zzc, this.zzu.zzd, z1, 5);
                    if(z1) {
                        this.zzO(v3);
                    }
                    boolean[] arr_z1 = new boolean[2];
                    for(int v4 = 0; true; ++v4) {
                        zzln[] arr_zzln = this.zza;
                        if(v4 >= 2) {
                            break;
                        }
                        zzln zzln0 = arr_zzln[v4];
                        boolean z2 = zzkl.zzae(zzln0);
                        arr_z1[v4] = z2;
                        zzvj zzvj0 = zzkq2.zzc[v4];
                        if(z2) {
                            if(zzvj0 != zzln0.zzo()) {
                                this.zzA(zzln0);
                            }
                            else if(arr_z[v4]) {
                                zzln0.zzG(this.zzI);
                            }
                        }
                    }
                    this.zzC(arr_z1);
                }
                this.zzE(true);
                if(this.zzu.zze == 4) {
                    break;
                }
                this.zzI();
                this.zzaa();
                this.zzh.zzi(2);
                if(true) {
                    break;
                }
            }
        }
    }

    private final void zzL() {
        this.zzK();
        this.zzR(true);
    }

    private final void zzM(boolean z, boolean z1, boolean z2, boolean z3) {
        zzts zzts1;
        zzcw zzcw1;
        boolean z4;
        this.zzh.zzf(2);
        zzil zzil0 = null;
        this.zzL = null;
        this.zzz = false;
        this.zzn.zzi();
        this.zzI = 1000000000000L;
        zzln[] arr_zzln = this.zza;
        for(int v = 0; v < 2; ++v) {
            zzln zzln0 = arr_zzln[v];
            try {
                this.zzA(zzln0);
            }
            catch(zzil | RuntimeException zzil1) {
                zzes.zzd("ExoPlayerImplInternal", "Disable failed.", zzil1);
            }
        }
        if(z) {
            zzln[] arr_zzln1 = this.zza;
            for(int v1 = 0; v1 < 2; ++v1) {
                zzln zzln1 = arr_zzln1[v1];
                if(this.zzb.remove(zzln1)) {
                    try {
                        zzln1.zzF();
                    }
                    catch(RuntimeException runtimeException0) {
                        zzes.zzd("ExoPlayerImplInternal", "Reset failed.", runtimeException0);
                    }
                }
            }
        }
        this.zzG = 0;
        zzts zzts0 = this.zzu.zzb;
        long v2 = this.zzu.zzr;
        long v3 = this.zzu.zzb.zzb() || zzkl.zzag(this.zzu, this.zzl) ? this.zzu.zzc : this.zzu.zzr;
        if(z1) {
            this.zzH = null;
            Pair pair0 = this.zzx(this.zzu.zza);
            zzts0 = (zzts)pair0.first;
            v2 = (long)(((Long)pair0.second));
            v3 = 0x8000000000000001L;
            z4 = zzts0.equals(this.zzu.zzb) ? false : true;
        }
        else {
            z4 = false;
        }
        this.zzq.zzi();
        this.zzA = false;
        zzcw zzcw0 = this.zzu.zza;
        if(!z2 || !(zzcw0 instanceof zzll)) {
            zzts1 = zzts0;
            zzcw1 = zzcw0;
        }
        else {
            zzcw0 = ((zzll)zzcw0).zzx(this.zzr.zzq());
            if(zzts0.zzb == -1) {
                zzts1 = zzts0;
                zzcw1 = zzcw0;
            }
            else {
                zzcw0.zzn(zzts0.zza, this.zzl);
                zzcw0.zze(this.zzl.zzd, this.zzk, 0L);
                if(this.zzk.zzb()) {
                    zzcw1 = zzcw0;
                    zzts1 = new zzts(zzts0.zza, zzts0.zzd);
                }
                else {
                    zzts1 = zzts0;
                    zzcw1 = zzcw0;
                }
            }
        }
        zzlg zzlg0 = this.zzu;
        int v4 = zzlg0.zze;
        if(!z3) {
            zzil0 = zzlg0.zzf;
        }
        zzvs zzvs0 = z4 ? zzvs.zza : zzlg0.zzh;
        zzxm zzxm0 = z4 ? this.zze : zzlg0.zzi;
        List list0 = z4 ? zzfud.zzl() : zzlg0.zzj;
        this.zzu = new zzlg(zzcw1, zzts1, v3, v2, v4, zzil0, false, zzvs0, zzxm0, list0, zzts1, this.zzu.zzl, this.zzu.zzm, this.zzu.zzn, v2, 0L, v2, 0L, false);
        if(z2) {
            this.zzr.zzh();
        }
    }

    private final void zzN() {
        zzkq zzkq0 = this.zzq.zzd();
        this.zzy = zzkq0 != null && zzkq0.zzf.zzh && this.zzx;
    }

    private final void zzO(long v) {
        zzkq zzkq0 = this.zzq.zzd();
        long v1 = v + (zzkq0 == null ? 1000000000000L : zzkq0.zze());
        this.zzI = v1;
        this.zzn.zzf(v1);
        zzln[] arr_zzln = this.zza;
        for(int v2 = 0; v2 < 2; ++v2) {
            zzln zzln0 = arr_zzln[v2];
            if(zzkl.zzae(zzln0)) {
                zzln0.zzG(this.zzI);
            }
        }
        for(zzkq zzkq1 = this.zzq.zzd(); zzkq1 != null; zzkq1 = zzkq1.zzg()) {
            zzxf[] arr_zzxf = zzkq1.zzi().zzc;
            for(int v3 = 0; v3 < arr_zzxf.length; ++v3) {
                zzxf zzxf0 = arr_zzxf[v3];
            }
        }
    }

    private final void zzP(zzcw zzcw0, zzcw zzcw1) {
        if(zzcw0.zzo() && zzcw1.zzo()) {
            return;
        }
        int v = this.zzo.size();
        if(v - 1 < 0) {
            Collections.sort(this.zzo);
            return;
        }
        zzki zzki0 = (zzki)this.zzo.get(v - 1);
        throw null;
    }

    private final void zzQ(long v, long v1) {
        this.zzh.zzj(2, v + v1);
    }

    private final void zzR(boolean z) {
        zzts zzts0 = this.zzq.zzd().zzf.zza;
        long v = this.zzw(zzts0, this.zzu.zzr, true, false);
        if(v != this.zzu.zzr) {
            this.zzu = this.zzz(zzts0, v, this.zzu.zzc, this.zzu.zzd, z, 5);
        }
    }

    private final void zzS(zzch zzch0) {
        this.zzh.zzf(16);
        this.zzn.zzg(zzch0);
    }

    private final void zzT(boolean z, int v, boolean z1, int v1) {
        this.zzv.zza(((int)z1));
        this.zzv.zzb(v1);
        this.zzu = this.zzu.zze(z, v);
        this.zzz = false;
        for(zzkq zzkq0 = this.zzq.zzd(); zzkq0 != null; zzkq0 = zzkq0.zzg()) {
            zzxf[] arr_zzxf = zzkq0.zzi().zzc;
            for(int v2 = 0; v2 < arr_zzxf.length; ++v2) {
                zzxf zzxf0 = arr_zzxf[v2];
            }
        }
        if(!this.zzah()) {
            this.zzX();
            this.zzaa();
            return;
        }
        int v3 = this.zzu.zze;
        if(v3 == 3) {
            this.zzV();
            this.zzh.zzi(2);
            return;
        }
        if(v3 == 2) {
            this.zzh.zzi(2);
        }
    }

    private final void zzU(int v) {
        zzlg zzlg0 = this.zzu;
        if(zzlg0.zze != v) {
            if(v != 2) {
                this.zzM = 0x8000000000000001L;
            }
            this.zzu = zzlg0.zzg(v);
        }
    }

    private final void zzV() {
        this.zzz = false;
        this.zzn.zzh();
        zzln[] arr_zzln = this.zza;
        for(int v = 0; v < 2; ++v) {
            zzln zzln0 = arr_zzln[v];
            if(zzkl.zzae(zzln0)) {
                zzln0.zzK();
            }
        }
    }

    private final void zzW(boolean z, boolean z1) {
        this.zzM(z || !this.zzD, false, true, false);
        this.zzv.zza(((int)z1));
        this.zzf.zzd();
        this.zzU(1);
    }

    private final void zzX() {
        this.zzn.zzi();
        zzln[] arr_zzln = this.zza;
        for(int v = 0; v < 2; ++v) {
            zzln zzln0 = arr_zzln[v];
            if(zzkl.zzae(zzln0)) {
                zzkl.zzal(zzln0);
            }
        }
    }

    private final void zzY() {
        zzkq zzkq0 = this.zzq.zzc();
        boolean z = this.zzA || zzkq0 != null && zzkq0.zza.zzp();
        zzlg zzlg0 = this.zzu;
        if(z != zzlg0.zzg) {
            this.zzu = new zzlg(zzlg0.zza, zzlg0.zzb, zzlg0.zzc, zzlg0.zzd, zzlg0.zze, zzlg0.zzf, z, zzlg0.zzh, zzlg0.zzi, zzlg0.zzj, zzlg0.zzk, zzlg0.zzl, zzlg0.zzm, zzlg0.zzn, zzlg0.zzp, zzlg0.zzq, zzlg0.zzr, zzlg0.zzs, zzlg0.zzo);
        }
    }

    private final void zzZ(zzts zzts0, zzvs zzvs0, zzxm zzxm0) {
        this.zzf.zze(this.zzu.zza, zzts0, this.zza, zzvs0, zzxm0.zzc);
    }

    @Override  // com.google.android.gms.internal.ads.zzii
    public final void zza(zzch zzch0) {
        this.zzh.zzc(16, zzch0).zza();
    }

    private final void zzaa() {
        zzki zzki0;
        zzkq zzkq0 = this.zzq.zzd();
        if(zzkq0 == null) {
            return;
        }
        long v = zzkq0.zzd ? zzkq0.zza.zzd() : 0x8000000000000001L;
        if(Long.compare(v, 0x8000000000000001L) == 0) {
            long v1 = this.zzn.zzb(zzkq0 != this.zzq.zze());
            this.zzI = v1;
            long v2 = zzkq0.zze();
            long v3 = this.zzu.zzr;
            if(!this.zzo.isEmpty() && !this.zzu.zzb.zzb()) {
                if(this.zzK) {
                    --v3;
                    this.zzK = false;
                }
                int v4 = this.zzu.zza.zza(this.zzu.zzb.zza);
                int v5 = Math.min(this.zzJ, this.zzo.size());
                if(v5 > 0) {
                    zzki0 = (zzki)this.zzo.get(v5 - 1);
                    goto label_27;
                }
            alab1:
                while(true) {
                    zzki0 = null;
                    while(true) {
                    label_27:
                        if(zzki0 == null || v4 >= 0 && (v4 != 0 || v3 >= 0L)) {
                            break alab1;
                        }
                        if(v5 - 1 <= 0) {
                            --v5;
                            break;
                        }
                        zzki0 = (zzki)this.zzo.get(v5 - 2);
                        --v5;
                    }
                }
                if(v5 < this.zzo.size()) {
                    zzki zzki1 = (zzki)this.zzo.get(v5);
                }
                this.zzJ = v5;
            }
            zzlg zzlg0 = this.zzu;
            zzlg0.zzr = v1 - v2;
            zzlg0.zzs = SystemClock.elapsedRealtime();
        }
        else {
            if(!zzkq0.zzr()) {
                this.zzq.zzm(zzkq0);
                this.zzE(false);
                this.zzI();
            }
            this.zzO(v);
            if(v != this.zzu.zzr) {
                this.zzu = this.zzz(this.zzu.zzb, v, this.zzu.zzc, v, true, 5);
            }
        }
        zzlg zzlg1 = this.zzu;
        zzlg1.zzp = this.zzq.zzc().zzc();
        this.zzu.zzq = this.zzt();
        if(this.zzu.zzl && this.zzu.zze == 3 && this.zzai(this.zzu.zza, this.zzu.zzb)) {
            zzlg zzlg2 = this.zzu;
            if(zzlg2.zzn.zzc == 1.0f) {
                long v6 = this.zzs(zzlg2.zza, zzlg2.zzb.zza, zzlg2.zzr);
                long v7 = this.zzt();
                float f = this.zzO.zza(v6, v7);
                if(this.zzn.zzc().zzc != f) {
                    this.zzS(new zzch(f, this.zzu.zzn.zzd));
                    this.zzH(this.zzu.zzn, this.zzn.zzc().zzc, false, false);
                }
            }
        }
    }

    private final void zzab(zzcw zzcw0, zzts zzts0, zzcw zzcw1, zzts zzts1, long v, boolean z) {
        if(!this.zzai(zzcw0, zzts0)) {
            zzch zzch0 = zzts0.zzb() ? zzch.zza : this.zzu.zzn;
            if(!this.zzn.zzc().equals(zzch0)) {
                this.zzS(zzch0);
                this.zzH(this.zzu.zzn, zzch0.zzc, false, false);
            }
            return;
        }
        zzcw0.zze(zzcw0.zzn(zzts0.zza, this.zzl).zzd, this.zzk, 0L);
        this.zzO.zzd(this.zzk.zzl);
        if(v != 0x8000000000000001L) {
            long v1 = this.zzs(zzcw0, zzts0.zza, v);
            this.zzO.zze(v1);
            return;
        }
        Object object0 = this.zzk.zzc;
        if(zzfk.zzD((zzcw1.zzo() ? null : zzcw1.zze(zzcw1.zzn(zzts1.zza, this.zzl).zzd, this.zzk, 0L).zzc), object0) && !z) {
            return;
        }
        this.zzO.zze(0x8000000000000001L);
    }

    private final void zzac(zzfry zzfry0, long v) {
        synchronized(this) {
            long v2 = SystemClock.elapsedRealtime() + v;
            boolean z = false;
            while(!((zzkc)zzfry0).zza.zzw && v > 0L) {
                try {
                    this.wait(v);
                }
                catch(InterruptedException unused_ex) {
                    z = true;
                }
                v = v2 - SystemClock.elapsedRealtime();
            }
            if(z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private final boolean zzad() {
        zzkq zzkq0 = this.zzq.zzc();
        return zzkq0 == null ? false : zzkq0.zzd() != 0x8000000000000000L;
    }

    private static boolean zzae(zzln zzln0) {
        return zzln0.zzbc() != 0;
    }

    private final boolean zzaf() {
        zzkq zzkq0 = this.zzq.zzd();
        long v = zzkq0.zzf.zze;
        return zzkq0.zzd && (Long.compare(v, 0x8000000000000001L) == 0 || this.zzu.zzr < v || !this.zzah());
    }

    // 去混淆评级： 低(20)
    private static boolean zzag(zzlg zzlg0, zzct zzct0) {
        return zzlg0.zza.zzo() || zzlg0.zza.zzn(zzlg0.zzb.zza, zzct0).zzg;
    }

    private final boolean zzah() {
        return this.zzu.zzl && this.zzu.zzm == 0;
    }

    private final boolean zzai(zzcw zzcw0, zzts zzts0) {
        if(!zzts0.zzb() && !zzcw0.zzo()) {
            zzcw0.zze(zzcw0.zzn(zzts0.zza, this.zzl).zzd, this.zzk, 0L);
            return this.zzk.zzb() && (this.zzk.zzj && this.zzk.zzg != 0x8000000000000001L);
        }
        return false;
    }

    private static zzam[] zzaj(zzxf zzxf0) {
        int v1 = zzxf0 == null ? 0 : zzxf0.zzc();
        zzam[] arr_zzam = new zzam[v1];
        for(int v = 0; v < v1; ++v) {
            arr_zzam[v] = zzxf0.zzd(v);
        }
        return arr_zzam;
    }

    private static final void zzak(zzlj zzlj0) {
        try {
            zzlj0.zzc().zzt(zzlj0.zza(), zzlj0.zzg());
        }
        finally {
            zzlj0.zzh(true);
        }
    }

    private static final void zzal(zzln zzln0) {
        if(zzln0.zzbc() == 2) {
            zzln0.zzL();
        }
    }

    private static final void zzam(zzln zzln0, long v) {
        zzln0.zzH();
        if(!(zzln0 instanceof zzvw)) {
            return;
        }
        zzvw zzvw0 = (zzvw)zzln0;
        throw null;
    }

    public final Looper zzb() {
        return this.zzj;
    }

    static zzej zzc(zzkl zzkl0) {
        return zzkl0.zzh;
    }

    // 检测为 Lambda 实现
    final Boolean zzd() [...]

    static Object zze(zzcv zzcv0, zzct zzct0, int v, boolean z, Object object0, zzcw zzcw0, zzcw zzcw1) {
        int v1 = zzcw0.zza(object0);
        int v2 = zzcw0.zzb();
        int v4 = v1;
        int v5 = -1;
        for(int v3 = 0; v3 < v2 && v5 == -1; ++v3) {
            v4 = zzcw0.zzi(v4, zzct0, zzcv0, v, z);
            if(v4 == -1) {
                return null;
            }
            v5 = zzcw1.zza(zzcw0.zzf(v4));
        }
        return v5 == -1 ? null : zzcw1.zzf(v5);
    }

    static void zzf(zzkl zzkl0, boolean z) {
        zzkl0.zzE = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzvk
    public final void zzg(zzvl zzvl0) {
        this.zzh.zzc(9, ((zztq)zzvl0)).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzle
    public final void zzh() {
        this.zzh.zzi(22);
    }

    @Override  // com.google.android.gms.internal.ads.zztp
    public final void zzi(zztq zztq0) {
        this.zzh.zzc(8, zztq0).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzxk
    public final void zzj() {
        this.zzh.zzi(10);
    }

    public final void zzk() {
        this.zzh.zzb(0).zza();
    }

    public final void zzl(zzcw zzcw0, int v, long v1) {
        zzkk zzkk0 = new zzkk(zzcw0, v, v1);
        this.zzh.zzc(3, zzkk0).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzlh
    public final void zzm(zzlj zzlj0) {
        synchronized(this) {
            if(!this.zzw && this.zzj.getThread().isAlive()) {
                this.zzh.zzc(14, zzlj0).zza();
                return;
            }
            zzes.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzlj0.zzh(false);
        }
    }

    public final void zzn(boolean z, int v) {
        this.zzh.zzd(1, ((int)z), v).zza();
    }

    public final void zzo() {
        this.zzh.zzb(6).zza();
    }

    public final boolean zzp() {
        synchronized(this) {
            if(!this.zzw && this.zzj.getThread().isAlive()) {
                this.zzh.zzi(7);
                this.zzac(() -> Boolean.valueOf(this.zzw), this.zzs);
                return this.zzw;
            }
            return true;
        }
    }

    public final void zzq(List list0, int v, long v1, zzvm zzvm0) {
        zzkg zzkg0 = new zzkg(list0, zzvm0, v, v1, null);
        this.zzh.zzc(17, zzkg0).zza();
    }

    // 检测为 Lambda 实现
    static final void zzr(zzlj zzlj0) [...]

    private final long zzs(zzcw zzcw0, Object object0, long v) {
        zzcw0.zze(zzcw0.zzn(object0, this.zzl).zzd, this.zzk, 0L);
        if(this.zzk.zzg != 0x8000000000000001L && this.zzk.zzb()) {
            zzcv zzcv0 = this.zzk;
            if(zzcv0.zzj) {
                return zzcv0.zzh == 0x8000000000000001L ? zzfk.zzp(System.currentTimeMillis() - this.zzk.zzg) - v : zzfk.zzp(zzcv0.zzh + SystemClock.elapsedRealtime() - this.zzk.zzg) - v;
            }
        }
        return 0x8000000000000001L;
    }

    private final long zzt() {
        return this.zzu(this.zzu.zzp);
    }

    private final long zzu(long v) {
        zzkq zzkq0 = this.zzq.zzc();
        return zzkq0 == null ? 0L : Math.max(0L, v - (this.zzI - zzkq0.zze()));
    }

    private final long zzv(zzts zzts0, long v, boolean z) {
        return this.zzq.zzd() == this.zzq.zze() ? this.zzw(zzts0, v, false, z) : this.zzw(zzts0, v, true, z);
    }

    private final long zzw(zzts zzts0, long v, boolean z, boolean z1) {
        this.zzX();
        this.zzz = false;
        if(z1 || this.zzu.zze == 3) {
            this.zzU(2);
        }
        zzkq zzkq0 = this.zzq.zzd();
        zzkq zzkq1;
        for(zzkq1 = zzkq0; zzkq1 != null && !zzts0.equals(zzkq1.zzf.zza); zzkq1 = zzkq1.zzg()) {
        }
        if(z || zzkq0 != zzkq1 || zzkq1 != null && zzkq1.zze() + v < 0L) {
            zzln[] arr_zzln = this.zza;
            for(int v1 = 0; v1 < 2; ++v1) {
                this.zzA(arr_zzln[v1]);
            }
            if(zzkq1 != null) {
                while(this.zzq.zzd() != zzkq1) {
                    this.zzq.zza();
                }
                this.zzq.zzm(zzkq1);
                zzkq1.zzp(1000000000000L);
                this.zzB();
            }
        }
        if(zzkq1 == null) {
            this.zzq.zzi();
            this.zzO(v);
        }
        else {
            this.zzq.zzm(zzkq1);
            if(!zzkq1.zzd) {
                zzkq1.zzf = zzkq1.zzf.zzb(v);
            }
            else if(zzkq1.zze) {
                v = zzkq1.zza.zze(v);
                zzkq1.zza.zzj(v - this.zzm, false);
            }
            this.zzO(v);
            this.zzI();
        }
        this.zzE(false);
        this.zzh.zzi(2);
        return v;
    }

    private final Pair zzx(zzcw zzcw0) {
        if(zzcw0.zzo()) {
            return Pair.create(zzlg.zzj(), 0L);
        }
        int v = zzcw0.zzg(this.zzC);
        Pair pair0 = zzcw0.zzl(this.zzk, this.zzl, v, 0x8000000000000001L);
        zzts zzts0 = this.zzq.zzh(zzcw0, pair0.first, 0L);
        long v1 = (long)(((Long)pair0.second));
        if(zzts0.zzb()) {
            zzcw0.zzn(zzts0.zza, this.zzl);
            return Pair.create(zzts0, 0L);
        }
        return Pair.create(zzts0, v1);
    }

    private static Pair zzy(zzcw zzcw0, zzkk zzkk0, boolean z, int v, boolean z1, zzcv zzcv0, zzct zzct0) {
        Pair pair0;
        zzcw zzcw1 = zzkk0.zza;
        if(zzcw0.zzo()) {
            return null;
        }
        zzcw zzcw2 = zzcw1.zzo() ? zzcw0 : zzcw1;
        try {
            pair0 = zzcw2.zzl(zzcv0, zzct0, zzkk0.zzb, zzkk0.zzc);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            return null;
        }
        if(zzcw0.equals(zzcw2)) {
            return pair0;
        }
        if(zzcw0.zza(pair0.first) != -1) {
            return !zzcw2.zzn(pair0.first, zzct0).zzg || zzcw2.zze(zzct0.zzd, zzcv0, 0L).zzp != zzcw2.zza(pair0.first) ? pair0 : zzcw0.zzl(zzcv0, zzct0, zzcw0.zzn(pair0.first, zzct0).zzd, zzkk0.zzc);
        }
        Object object0 = zzkl.zze(zzcv0, zzct0, v, z1, pair0.first, zzcw2, zzcw0);
        return object0 == null ? null : zzcw0.zzl(zzcv0, zzct0, zzcw0.zzn(object0, zzct0).zzd, 0x8000000000000001L);
    }

    private final zzlg zzz(zzts zzts0, long v, long v1, long v2, boolean z, int v3) {
        zzxm zzxm1;
        zzvs zzvs1;
        List list1;
        this.zzK = this.zzK || v != this.zzu.zzr || !zzts0.equals(this.zzu.zzb);
        this.zzN();
        zzvs zzvs0 = this.zzu.zzh;
        zzxm zzxm0 = this.zzu.zzi;
        List list0 = this.zzu.zzj;
        if(this.zzr.zzj()) {
            zzkq zzkq0 = this.zzq.zzd();
            zzvs0 = zzkq0 == null ? zzvs.zza : zzkq0.zzh();
            zzxm0 = zzkq0 == null ? this.zze : zzkq0.zzi();
            zzxf[] arr_zzxf = zzxm0.zzc;
            zzfua zzfua0 = new zzfua();
            boolean z1 = false;
            for(int v4 = 0; v4 < arr_zzxf.length; ++v4) {
                zzxf zzxf0 = arr_zzxf[v4];
                if(zzxf0 != null) {
                    zzbz zzbz0 = zzxf0.zzd(0).zzk;
                    if(zzbz0 == null) {
                        zzfua0.zzf(new zzbz(0x8000000000000001L, new zzby[0]));
                    }
                    else {
                        zzfua0.zzf(zzbz0);
                        z1 = true;
                    }
                }
            }
            zzfud zzfud0 = z1 ? zzfua0.zzi() : zzfud.zzl();
            if(zzkq0 != null) {
                zzkr zzkr0 = zzkq0.zzf;
                if(zzkr0.zzc != v1) {
                    zzkq0.zzf = zzkr0.zza(v1);
                }
            }
            list1 = zzfud0;
            zzvs1 = zzvs0;
            zzxm1 = zzxm0;
        }
        else if(zzts0.equals(this.zzu.zzb)) {
            list1 = list0;
            zzvs1 = zzvs0;
            zzxm1 = zzxm0;
        }
        else {
            zzvs1 = zzvs.zza;
            zzxm1 = this.zze;
            list1 = zzfud.zzl();
        }
        if(z) {
            this.zzv.zzd(v3);
        }
        return this.zzu.zzd(zzts0, v, v1, v2, this.zzt(), zzvs1, zzxm1, list1);
    }
}

