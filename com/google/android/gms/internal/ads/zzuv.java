package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzuv implements zzabe, zztq, zzvh, zzxz, zzye {
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzxy zzM;
    private final zzxu zzN;
    private static final Map zzb;
    private static final zzam zzc;
    private final Uri zzd;
    private final zzgi zze;
    private final zzqz zzf;
    private final zzub zzg;
    private final zzqt zzh;
    private final zzur zzi;
    private final long zzj;
    private final zzyh zzk;
    private final zzul zzl;
    private final zzeb zzm;
    private final Runnable zzn;
    private final Runnable zzo;
    private final Handler zzp;
    private zztp zzq;
    private zzaeb zzr;
    private zzvi[] zzs;
    private zzut[] zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zzuu zzx;
    private zzaca zzy;
    private long zzz;

    static {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("Icy-MetaData", "1");
        zzuv.zzb = Collections.unmodifiableMap(hashMap0);
        zzak zzak0 = new zzak();
        zzak0.zzH("icy");
        zzak0.zzS("application/x-icy");
        zzuv.zzc = zzak0.zzY();
    }

    public zzuv(Uri uri0, zzgi zzgi0, zzul zzul0, zzqz zzqz0, zzqt zzqt0, zzxy zzxy0, zzub zzub0, zzur zzur0, zzxu zzxu0, String s, int v) {
        this.zzd = uri0;
        this.zze = zzgi0;
        this.zzf = zzqz0;
        this.zzh = zzqt0;
        this.zzM = zzxy0;
        this.zzg = zzub0;
        this.zzi = zzur0;
        this.zzN = zzxu0;
        this.zzj = (long)v;
        this.zzk = new zzyh("ProgressiveMediaPeriod");
        this.zzl = zzul0;
        this.zzm = new zzeb(zzdz.zza);
        this.zzn = () -> this.zzT();
        this.zzo = () -> if(!this.zzL) {
            zztp zztp0 = this.zzq;
            zztp0.getClass();
            zztp0.zzg(this);
        };
        this.zzp = zzfk.zzu(null);
        this.zzt = new zzut[0];
        this.zzs = new zzvi[0];
        this.zzH = 0x8000000000000001L;
        this.zzz = 0x8000000000000001L;
        this.zzB = 1;
    }

    static void zzB(zzuv zzuv0) {
        zzuo zzuo0 = () -> zzuv0.zzF = true;
        zzuv0.zzp.post(zzuo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzabe
    public final void zzC() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    // 检测为 Lambda 实现
    final void zzD() [...]

    // 检测为 Lambda 实现
    final void zzE() [...]

    // 检测为 Lambda 实现
    final void zzF(zzaca zzaca0) [...]

    final void zzG() {
        this.zzk.zzi(zzxy.zza(this.zzB));
    }

    final void zzH(int v) {
        this.zzs[v].zzm();
        this.zzG();
    }

    @Override  // com.google.android.gms.internal.ads.zzxz
    public final void zzI(zzyd zzyd0, long v, long v1, boolean z) {
        zzhj zzhj0 = ((zzuq)zzyd0).zzd;
        zztj zztj0 = new zztj(((zzuq)zzyd0).zzb, ((zzuq)zzyd0).zzl, zzhj0.zzh(), zzhj0.zzi(), v, v1, zzhj0.zzg());
        long v2 = this.zzz;
        zzto zzto0 = new zzto(1, -1, null, 0, null, zzfk.zzr(((zzuq)zzyd0).zzk), zzfk.zzr(v2));
        this.zzg.zzd(zztj0, zzto0);
        if(!z) {
            zzvi[] arr_zzvi = this.zzs;
            for(int v3 = 0; v3 < arr_zzvi.length; ++v3) {
                arr_zzvi[v3].zzp(false);
            }
            if(this.zzE > 0) {
                zztp zztp0 = this.zzq;
                zztp0.getClass();
                zztp0.zzg(this);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzxz
    public final void zzJ(zzyd zzyd0, long v, long v1) {
        if(Long.compare(this.zzz, 0x8000000000000001L) == 0) {
            zzaca zzaca0 = this.zzy;
            if(zzaca0 != null) {
                boolean z = zzaca0.zzh();
                long v2 = this.zzQ(true);
                long v3 = v2 == 0x8000000000000000L ? 0L : v2 + 10000L;
                this.zzz = v3;
                this.zzi.zza(v3, z, this.zzA);
            }
        }
        zzhj zzhj0 = ((zzuq)zzyd0).zzd;
        zztj zztj0 = new zztj(((zzuq)zzyd0).zzb, ((zzuq)zzyd0).zzl, zzhj0.zzh(), zzhj0.zzi(), v, v1, zzhj0.zzg());
        long v4 = this.zzz;
        zzto zzto0 = new zzto(1, -1, null, 0, null, zzfk.zzr(((zzuq)zzyd0).zzk), zzfk.zzr(v4));
        this.zzg.zze(zztj0, zzto0);
        this.zzK = true;
        zztp zztp0 = this.zzq;
        zztp0.getClass();
        zztp0.zzg(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzye
    public final void zzK() {
        zzvi[] arr_zzvi = this.zzs;
        for(int v = 0; v < arr_zzvi.length; ++v) {
            arr_zzvi[v].zzo();
        }
        this.zzl.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzvh
    public final void zzL(zzam zzam0) {
        this.zzp.post(this.zzn);
    }

    public final void zzM() {
        if(this.zzv) {
            zzvi[] arr_zzvi = this.zzs;
            for(int v = 0; v < arr_zzvi.length; ++v) {
                arr_zzvi[v].zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzabe
    public final void zzN(zzaca zzaca0) {
        zzup zzup0 = () -> {
            zzaca zzaca1 = this.zzr == null ? zzaca0 : new zzabz(0x8000000000000001L, 0L);
            this.zzy = zzaca1;
            this.zzz = zzaca0.zze();
            boolean z = false;
            int v = 1;
            if(!this.zzF && zzaca0.zze() == 0x8000000000000001L) {
                z = true;
            }
            this.zzA = z;
            if(z) {
                v = 7;
            }
            this.zzB = v;
            long v1 = this.zzz;
            boolean z1 = zzaca0.zzh();
            this.zzi.zza(v1, z1, this.zzA);
            if(!this.zzv) {
                this.zzT();
            }
        };
        this.zzp.post(zzup0);
    }

    // 去混淆评级： 低(20)
    final boolean zzO(int v) {
        return !this.zzY() && this.zzs[v].zzx(this.zzK);
    }

    private final int zzP() {
        zzvi[] arr_zzvi = this.zzs;
        int v1 = 0;
        for(int v = 0; v < arr_zzvi.length; ++v) {
            v1 += arr_zzvi[v].zzc();
        }
        return v1;
    }

    private final long zzQ(boolean z) {
        long v1 = 0x8000000000000000L;
        for(int v = 0; true; ++v) {
            zzvi[] arr_zzvi = this.zzs;
            if(v >= arr_zzvi.length) {
                break;
            }
            if(z) {
                v1 = Math.max(v1, arr_zzvi[v].zzg());
            }
            else {
                zzuu zzuu0 = this.zzx;
                zzuu0.getClass();
                if(zzuu0.zzc[v]) {
                    v1 = Math.max(v1, arr_zzvi[v].zzg());
                }
            }
        }
        return v1;
    }

    private final zzace zzR(zzut zzut0) {
        int v = this.zzs.length;
        for(int v1 = 0; v1 < v; ++v1) {
            if(zzut0.equals(this.zzt[v1])) {
                return this.zzs[v1];
            }
        }
        zzvi zzvi0 = new zzvi(this.zzN, this.zzf, this.zzh);
        zzvi0.zzu(this);
        zzut[] arr_zzut = (zzut[])Arrays.copyOf(this.zzt, v + 1);
        arr_zzut[v] = zzut0;
        this.zzt = arr_zzut;
        zzvi[] arr_zzvi = (zzvi[])Arrays.copyOf(this.zzs, v + 1);
        arr_zzvi[v] = zzvi0;
        this.zzs = arr_zzvi;
        return zzvi0;
    }

    private final void zzS() {
        zzdy.zzf(this.zzv);
        this.zzx.getClass();
        this.zzy.getClass();
    }

    private final void zzT() {
        if(!this.zzL && !this.zzv && this.zzu && this.zzy != null) {
            zzvi[] arr_zzvi = this.zzs;
            for(int v = 0; v < arr_zzvi.length; ++v) {
                if(arr_zzvi[v].zzh() == null) {
                    return;
                }
            }
            this.zzm.zzc();
            int v1 = this.zzs.length;
            zzcy[] arr_zzcy = new zzcy[v1];
            boolean[] arr_z = new boolean[v1];
            for(int v2 = 0; v2 < v1; ++v2) {
                zzam zzam0 = this.zzs[v2].zzh();
                zzam0.getClass();
                boolean z = zzcc.zzf(zzam0.zzm);
                boolean z1 = z || zzcc.zzg(zzam0.zzm);
                arr_z[v2] = z1;
                this.zzw |= z1;
                zzaeb zzaeb0 = this.zzr;
                if(zzaeb0 != null) {
                    if(z || this.zzt[v2].zzb) {
                        zzbz zzbz0 = zzam0.zzk == null ? new zzbz(0x8000000000000001L, new zzby[]{zzaeb0}) : zzam0.zzk.zzc(new zzby[]{zzaeb0});
                        zzak zzak0 = zzam0.zzb();
                        zzak0.zzM(zzbz0);
                        zzam0 = zzak0.zzY();
                    }
                    if(z && zzam0.zzg == -1 && zzam0.zzh == -1) {
                        int v3 = zzaeb0.zza;
                        if(v3 != -1) {
                            zzak zzak1 = zzam0.zzb();
                            zzak1.zzv(v3);
                            zzam0 = zzak1.zzY();
                        }
                    }
                }
                arr_zzcy[v2] = new zzcy(Integer.toString(v2), new zzam[]{zzam0.zzc(this.zzf.zza(zzam0))});
            }
            this.zzx = new zzuu(new zzvs(arr_zzcy), arr_z);
            this.zzv = true;
            zztp zztp0 = this.zzq;
            zztp0.getClass();
            zztp0.zzi(this);
        }
    }

    private final void zzU(int v) {
        this.zzS();
        zzuu zzuu0 = this.zzx;
        boolean[] arr_z = zzuu0.zzd;
        if(!arr_z[v]) {
            zzam zzam0 = zzuu0.zza.zzb(v).zzb(0);
            zzto zzto0 = new zzto(1, zzcc.zzb(zzam0.zzm), zzam0, 0, null, zzfk.zzr(this.zzG), 0x8000000000000001L);
            this.zzg.zzc(zzto0);
            arr_z[v] = true;
        }
    }

    private final void zzV(int v) {
        this.zzS();
        if(this.zzI && this.zzx.zzb[v] && !this.zzs[v].zzx(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            zzvi[] arr_zzvi = this.zzs;
            for(int v1 = 0; v1 < arr_zzvi.length; ++v1) {
                arr_zzvi[v1].zzp(false);
            }
            zztp zztp0 = this.zzq;
            zztp0.getClass();
            zztp0.zzg(this);
        }
    }

    private final void zzW() {
        zzuq zzuq0 = new zzuq(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if(this.zzv) {
            zzdy.zzf(this.zzX());
            if(this.zzz != 0x8000000000000001L && this.zzH > this.zzz) {
                this.zzK = true;
                this.zzH = 0x8000000000000001L;
                return;
            }
            zzaca zzaca0 = this.zzy;
            zzaca0.getClass();
            zzuq.zzf(zzuq0, zzaca0.zzg(this.zzH).zza.zzc, this.zzH);
            zzvi[] arr_zzvi = this.zzs;
            for(int v = 0; v < arr_zzvi.length; ++v) {
                arr_zzvi[v].zzt(this.zzH);
            }
            this.zzH = 0x8000000000000001L;
        }
        this.zzJ = this.zzP();
        long v1 = this.zzk.zza(zzuq0, this, zzxy.zza(this.zzB));
        zzgn zzgn0 = zzuq0.zzl;
        Map map0 = Collections.emptyMap();
        zztj zztj0 = new zztj(zzuq0.zzb, zzgn0, zzgn0.zza, map0, v1, 0L, 0L);
        long v2 = this.zzz;
        zzto zzto0 = new zzto(1, -1, null, 0, null, zzfk.zzr(zzuq0.zzk), zzfk.zzr(v2));
        this.zzg.zzg(zztj0, zzto0);
    }

    private final boolean zzX() {
        return this.zzH != 0x8000000000000001L;
    }

    // 去混淆评级： 低(20)
    private final boolean zzY() {
        return this.zzD || this.zzX();
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zza(long v, zzlr zzlr0) {
        this.zzS();
        if(!this.zzy.zzh()) {
            return 0L;
        }
        zzaby zzaby0 = this.zzy.zzg(v);
        long v1 = zzaby0.zza.zzb;
        long v2 = zzaby0.zzb.zzb;
        long v3 = zzlr0.zzf;
        if(v3 == 0L) {
            if(zzlr0.zzg != 0L) {
                v3 = 0L;
                goto label_12;
            }
            return v;
        }
    label_12:
        long v4 = v - v3;
        long v5 = v + zzlr0.zzg;
        long v6 = zzlr0.zzg ^ v5;
        if(((v3 ^ v) & (v ^ v4)) < 0L) {
            v4 = 0x8000000000000000L;
        }
        if(((v ^ v5) & v6) < 0L) {
            v5 = 0x7FFFFFFFFFFFFFFFL;
        }
        boolean z = true;
        boolean z1 = Long.compare(v4, v1) <= 0 && v1 <= v5;
        if(v4 > v2 || v2 > v5) {
            z = false;
        }
        if(z1 && z) {
            return Math.abs(v1 - v) <= Math.abs(v2 - v) ? v1 : v2;
        }
        if(z1) {
            return v1;
        }
        return z ? v2 : v4;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzb() {
        long v1;
        this.zzS();
        if(!this.zzK && this.zzE != 0) {
            if(this.zzX()) {
                return this.zzH;
            }
            if(this.zzw) {
                v1 = 0x7FFFFFFFFFFFFFFFL;
                for(int v = 0; v < this.zzs.length; ++v) {
                    if(this.zzx.zzb[v] && this.zzx.zzc[v] && !this.zzs[v].zzw()) {
                        v1 = Math.min(v1, this.zzs[v].zzg());
                    }
                }
            }
            else {
                v1 = 0x7FFFFFFFFFFFFFFFL;
            }
            if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                v1 = this.zzQ(false);
            }
            return v1 == 0x8000000000000000L ? this.zzG : v1;
        }
        return 0x8000000000000000L;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzc() {
        return this.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzd() {
        if(this.zzD && (this.zzK || this.zzP() > this.zzJ)) {
            this.zzD = false;
            return this.zzG;
        }
        return 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zze(long v) {
        this.zzS();
        boolean[] arr_z = this.zzx.zzb;
        if(!this.zzy.zzh()) {
            v = 0L;
        }
        this.zzD = false;
        this.zzG = v;
        if(this.zzX()) {
            this.zzH = v;
            return v;
        }
        if(this.zzB != 7) {
            int v2 = 0;
            while(v2 < this.zzs.length) {
                if(!this.zzs[v2].zzy(v, false) && (arr_z[v2] || !this.zzw)) {
                    goto label_17;
                }
                ++v2;
            }
            return v;
        }
    label_17:
        this.zzI = false;
        this.zzH = v;
        this.zzK = false;
        zzyh zzyh0 = this.zzk;
        if(zzyh0.zzl()) {
            zzvi[] arr_zzvi = this.zzs;
            for(int v1 = 0; v1 < arr_zzvi.length; ++v1) {
                arr_zzvi[v1].zzj();
            }
            this.zzk.zzg();
            return v;
        }
        zzyh0.zzh();
        zzvi[] arr_zzvi1 = this.zzs;
        for(int v3 = 0; v3 < arr_zzvi1.length; ++v3) {
            arr_zzvi1[v3].zzp(false);
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzf(zzxf[] arr_zzxf, boolean[] arr_z, zzvj[] arr_zzvj, boolean[] arr_z1, long v) {
        boolean z;
        this.zzS();
        zzvs zzvs0 = this.zzx.zza;
        boolean[] arr_z2 = this.zzx.zzc;
        int v1 = this.zzE;
        int v2 = 0;
        for(int v3 = 0; v3 < arr_zzxf.length; ++v3) {
            zzvj zzvj0 = arr_zzvj[v3];
            if(zzvj0 != null && (arr_zzxf[v3] == null || !arr_z[v3])) {
                int v4 = ((zzus)zzvj0).zzb;
                zzdy.zzf(arr_z2[v4]);
                --this.zzE;
                arr_z2[v4] = false;
                arr_zzvj[v3] = null;
            }
        }
        if(!this.zzC) {
            if(v == 0L) {
                z = false;
                v = 0L;
            }
            else {
                z = true;
            }
        }
        else if(v1 != 0) {
            z = false;
        }
        else {
            z = true;
        }
        for(int v5 = 0; v5 < arr_zzxf.length; ++v5) {
            if(arr_zzvj[v5] == null) {
                zzxf zzxf0 = arr_zzxf[v5];
                if(zzxf0 != null) {
                    zzdy.zzf(zzxf0.zzc() == 1);
                    zzdy.zzf(zzxf0.zza(0) == 0);
                    int v6 = zzvs0.zza(zzxf0.zze());
                    zzdy.zzf(!arr_z2[v6]);
                    ++this.zzE;
                    arr_z2[v6] = true;
                    arr_zzvj[v5] = new zzus(this, v6);
                    arr_z1[v5] = true;
                    if(!z) {
                        zzvi zzvi0 = this.zzs[v6];
                        z = zzvi0.zza() != 0 && !zzvi0.zzy(v, true);
                    }
                }
            }
        }
        if(this.zzE == 0) {
            this.zzI = false;
            this.zzD = false;
            if(this.zzk.zzl()) {
                zzvi[] arr_zzvi = this.zzs;
                while(v2 < arr_zzvi.length) {
                    arr_zzvi[v2].zzj();
                    ++v2;
                }
                this.zzk.zzg();
            }
            else {
                zzvi[] arr_zzvi1 = this.zzs;
                for(int v7 = 0; v7 < arr_zzvi1.length; ++v7) {
                    arr_zzvi1[v7].zzp(false);
                }
            }
        }
        else if(z) {
            v = this.zze(v);
            while(v2 < arr_zzvj.length) {
                if(arr_zzvj[v2] != null) {
                    arr_z1[v2] = true;
                }
                ++v2;
            }
        }
        this.zzC = true;
        return v;
    }

    final int zzg(int v, zzkn zzkn0, zzht zzht0, int v1) {
        if(this.zzY()) {
            return -3;
        }
        this.zzU(v);
        int v2 = this.zzs[v].zzd(zzkn0, zzht0, v1, this.zzK);
        if(v2 == -3) {
            this.zzV(v);
        }
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final zzvs zzh() {
        this.zzS();
        return this.zzx.zza;
    }

    final int zzi(int v, long v1) {
        if(this.zzY()) {
            return 0;
        }
        this.zzU(v);
        zzvi zzvi0 = this.zzs[v];
        int v2 = zzvi0.zzb(v1, this.zzK);
        zzvi0.zzv(v2);
        if(v2 == 0) {
            this.zzV(v);
            return 0;
        }
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzj(long v, boolean z) {
        this.zzS();
        if(this.zzX()) {
            return;
        }
        boolean[] arr_z = this.zzx.zzc;
        for(int v1 = 0; v1 < this.zzs.length; ++v1) {
            this.zzs[v1].zzi(v, false, arr_z[v1]);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzk() {
        this.zzG();
        if(this.zzK && !this.zzv) {
            throw zzcd.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzl(zztp zztp0, long v) {
        this.zzq = zztp0;
        this.zzm.zze();
        this.zzW();
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzm(long v) {
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final boolean zzo(long v) {
        if(!this.zzK && !this.zzk.zzk() && !this.zzI && (!this.zzv || this.zzE != 0)) {
            boolean z = this.zzm.zze();
            if(!this.zzk.zzl()) {
                this.zzW();
                return true;
            }
            return z;
        }
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zztq
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    static long zzq(zzuv zzuv0, boolean z) {
        return zzuv0.zzQ(true);
    }

    @Override  // com.google.android.gms.internal.ads.zzxz
    public final zzyb zzt(zzyd zzyd0, long v, long v1, IOException iOException0, int v2) {
        zzyb zzyb0;
        long v3;
        zzhj zzhj0 = ((zzuq)zzyd0).zzd;
        zztj zztj0 = new zztj(((zzuq)zzyd0).zzb, ((zzuq)zzyd0).zzl, zzhj0.zzh(), zzhj0.zzi(), v, v1, zzhj0.zzg());
        if(iOException0 instanceof zzcd || iOException0 instanceof FileNotFoundException || iOException0 instanceof zzha || iOException0 instanceof zzyg) {
        label_10:
            v3 = 0x8000000000000001L;
        }
        else {
            Throwable throwable0 = iOException0;
            while(throwable0 != null) {
                if(throwable0 instanceof zzgj && ((zzgj)throwable0).zza == 2008) {
                    goto label_10;
                }
                throwable0 = throwable0.getCause();
            }
            v3 = (long)Math.min((v2 - 1) * 1000, 5000);
        }
        if(v3 == 0x8000000000000001L) {
            zzyb0 = zzyh.zzd;
        }
        else {
            int v4 = this.zzP();
            boolean z = v4 > this.zzJ;
            if(this.zzF || this.zzy != null && this.zzy.zze() != 0x8000000000000001L) {
                this.zzJ = v4;
                zzyb0 = zzyh.zzb(z, v3);
            }
            else {
                boolean z1 = this.zzv;
                if(!z1 || this.zzY()) {
                    this.zzD = z1;
                    this.zzG = 0L;
                    this.zzJ = 0;
                    zzvi[] arr_zzvi = this.zzs;
                    for(int v5 = 0; v5 < arr_zzvi.length; ++v5) {
                        arr_zzvi[v5].zzp(false);
                    }
                    zzuq.zzf(((zzuq)zzyd0), 0L, 0L);
                    zzyb0 = zzyh.zzb(z, v3);
                }
                else {
                    this.zzI = true;
                    zzyb0 = zzyh.zzc;
                }
            }
        }
        boolean z2 = zzyb0.zzc();
        long v6 = this.zzz;
        zzto zzto0 = new zzto(1, -1, null, 0, null, zzfk.zzr(((zzuq)zzyd0).zzk), zzfk.zzr(v6));
        this.zzg.zzf(zztj0, zzto0, iOException0, ((boolean)(true ^ z2)));
        return zzyb0;
    }

    final zzace zzu() {
        return this.zzR(new zzut(0, true));
    }

    @Override  // com.google.android.gms.internal.ads.zzabe
    public final zzace zzv(int v, int v1) {
        return this.zzR(new zzut(v, false));
    }

    static Map zzy() {
        return zzuv.zzb;
    }

    // 检测为 Lambda 实现
    public static void zzz(zzuv zzuv0) [...]
}

