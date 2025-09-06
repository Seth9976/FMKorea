package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

public final class zzqe implements zzpe {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private float zzI;
    private ByteBuffer zzJ;
    private int zzK;
    private ByteBuffer zzL;
    private byte[] zzM;
    private int zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzl zzT;
    private zzpq zzU;
    private long zzV;
    private boolean zzW;
    private boolean zzX;
    private final zzpu zzY;
    private final zzpm zzZ;
    private static final Object zza;
    private static ExecutorService zzb;
    private static int zzc;
    private final zzpj zzd;
    private final zzqo zze;
    private final zzfud zzf;
    private final zzfud zzg;
    private final zzeb zzh;
    private final zzpi zzi;
    private final ArrayDeque zzj;
    private zzqc zzk;
    private final zzpx zzl;
    private final zzpx zzm;
    private final zzpr zzn;
    private zzoh zzo;
    private zzpb zzp;
    private zzpt zzq;
    private zzpt zzr;
    private zzdo zzs;
    private AudioTrack zzt;
    private zzoj zzu;
    private zzk zzv;
    private zzpw zzw;
    private zzpw zzx;
    private zzch zzy;
    private boolean zzz;

    static {
        zzqe.zza = new Object();
    }

    zzqe(zzps zzps0, zzqd zzqd0) {
        this.zzu = zzps0.zza;
        this.zzY = zzps0.zzd;
        this.zzn = zzps0.zzc;
        zzpm zzpm0 = zzps0.zze;
        zzpm0.getClass();
        this.zzZ = zzpm0;
        zzeb zzeb0 = new zzeb(zzdz.zza);
        this.zzh = zzeb0;
        zzeb0.zze();
        this.zzi = new zzpi(new zzpz(this, null));
        zzpj zzpj0 = new zzpj();
        this.zzd = zzpj0;
        zzqo zzqo0 = new zzqo();
        this.zze = zzqo0;
        this.zzf = zzfud.zzo(new zzdv(), zzpj0, zzqo0);
        this.zzg = zzfud.zzm(new zzqn());
        this.zzI = 1.0f;
        this.zzv = zzk.zza;
        this.zzS = 0;
        this.zzT = new zzl(0, 0.0f);
        this.zzx = new zzpw(zzch.zza, 0L, 0L, null);
        this.zzy = zzch.zza;
        this.zzz = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzpx(100L);
        this.zzm = new zzpx(100L);
    }

    static AudioTrack zzC(zzqe zzqe0) {
        return zzqe0.zzt;
    }

    // 检测为 Lambda 实现
    static void zzE(AudioTrack audioTrack0, zzeb zzeb0) [...]

    static boolean zzF(zzqe zzqe0) {
        return zzqe0.zzQ;
    }

    private final long zzG() {
        return this.zzr.zzc == 0 ? this.zzA / ((long)this.zzr.zzb) : this.zzB;
    }

    private final long zzH() {
        return this.zzr.zzc == 0 ? this.zzC / ((long)this.zzr.zzd) : this.zzD;
    }

    private final AudioTrack zzI(zzpt zzpt0) {
        try {
            return zzpt0.zzb(false, this.zzv, this.zzS);
        }
        catch(zzpa zzpa0) {
            zzpb zzpb0 = this.zzp;
            if(zzpb0 != null) {
                zzpb0.zza(zzpa0);
            }
            throw zzpa0;
        }
    }

    private final void zzJ(long v) {
        boolean z;
        zzch zzch0;
        if(this.zzT()) {
            zzch0 = this.zzy;
            this.zzY.zzc(zzch0);
        }
        else {
            zzch0 = zzch.zza;
        }
        this.zzy = zzch0;
        if(this.zzT()) {
            z = this.zzz;
            this.zzY.zzd(z);
        }
        else {
            z = false;
        }
        this.zzz = z;
        zzpw zzpw0 = new zzpw(zzch0, Math.max(0L, v), this.zzr.zza(this.zzH()), null);
        this.zzj.add(zzpw0);
        this.zzO();
        zzpb zzpb0 = this.zzp;
        if(zzpb0 != null) {
            zzqk.zzaa(((zzqj)zzpb0).zza).zzs(this.zzz);
        }
    }

    private final void zzK() {
        if(!this.zzP) {
            this.zzP = true;
            long v = this.zzH();
            this.zzi.zzc(v);
            this.zzt.stop();
        }
    }

    private final void zzL(long v) {
        if(this.zzs.zzh()) {
            while(!this.zzs.zzg()) {
                while(true) {
                    ByteBuffer byteBuffer0 = this.zzs.zzb();
                    if(!byteBuffer0.hasRemaining()) {
                        break;
                    }
                    this.zzP(byteBuffer0, v);
                    if(byteBuffer0.hasRemaining()) {
                        return;
                    }
                }
                if(this.zzJ == null || !this.zzJ.hasRemaining()) {
                    break;
                }
                this.zzs.zze(this.zzJ);
            }
            return;
        }
        this.zzP((this.zzJ == null ? zzdr.zza : this.zzJ), v);
    }

    private final void zzM(zzch zzch0) {
        zzpw zzpw0 = new zzpw(zzch0, 0x8000000000000001L, 0x8000000000000001L, null);
        if(this.zzR()) {
            this.zzw = zzpw0;
            return;
        }
        this.zzx = zzpw0;
    }

    private final void zzN() {
        if(!this.zzR()) {
            return;
        }
        if(zzfk.zza >= 21) {
            this.zzt.setVolume(this.zzI);
            return;
        }
        this.zzt.setStereoVolume(this.zzI, this.zzI);
    }

    private final void zzO() {
        this.zzs = this.zzr.zzi;
        this.zzr.zzi.zzc();
    }

    private final void zzP(ByteBuffer byteBuffer0, long v) {
        int v5;
        if(!byteBuffer0.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer1 = this.zzL;
        boolean z = true;
        if(byteBuffer1 == null) {
            this.zzL = byteBuffer0;
            if(zzfk.zza < 21) {
                int v1 = byteBuffer0.remaining();
                if(this.zzM == null || this.zzM.length < v1) {
                    this.zzM = new byte[v1];
                }
                byteBuffer0.get(this.zzM, 0, v1);
                byteBuffer0.position(byteBuffer0.position());
                this.zzN = 0;
            }
        }
        else {
            zzdy.zzd(byteBuffer1 == byteBuffer0);
        }
        int v2 = byteBuffer0.remaining();
        int v3 = zzfk.zza;
        if(v3 < 21) {
            int v4 = this.zzi.zza(this.zzC);
            if(v4 > 0) {
                v5 = this.zzt.write(this.zzM, this.zzN, Math.min(v2, v4));
                if(v5 > 0) {
                    this.zzN += v5;
                    byteBuffer0.position(byteBuffer0.position() + v5);
                }
            }
            else {
                v5 = 0;
            }
        }
        else {
            v5 = this.zzt.write(byteBuffer0, v2, 1);
        }
        this.zzV = SystemClock.elapsedRealtime();
        if(v5 < 0) {
            if((v3 < 24 || v5 != -6) && v5 != 0xFFFFFFE0 || this.zzD <= 0L) {
                z = false;
            }
            zzpd zzpd0 = new zzpd(v5, this.zzr.zza, z);
            zzpb zzpb0 = this.zzp;
            if(zzpb0 != null) {
                zzpb0.zza(zzpd0);
            }
            if(!zzpd0.zzb) {
                this.zzm.zzb(zzpd0);
                return;
            }
            this.zzu = zzoj.zza;
            throw zzpd0;
        }
        this.zzm.zza();
        if(zzqe.zzS(this.zzt)) {
            if(this.zzD > 0L) {
                this.zzX = false;
            }
            if(this.zzQ) {
                zzpb zzpb1 = this.zzp;
                if(zzpb1 != null && v5 < v2) {
                    zzqk zzqk0 = ((zzqj)zzpb1).zza;
                    if(zzqk.zzZ(zzqk0) != null) {
                        zzqk.zzZ(zzqk0).zza();
                    }
                }
            }
        }
        int v6 = this.zzr.zzc;
        if(v6 == 0) {
            this.zzC += (long)v5;
        }
        if(v5 == v2) {
            if(v6 != 0) {
                if(byteBuffer0 != this.zzJ) {
                    z = false;
                }
                zzdy.zzf(z);
                this.zzD += ((long)this.zzE) * ((long)this.zzK);
            }
            this.zzL = null;
        }
    }

    private final boolean zzQ() {
        if(!this.zzs.zzh()) {
            ByteBuffer byteBuffer0 = this.zzL;
            if(byteBuffer0 == null) {
                return true;
            }
            this.zzP(byteBuffer0, 0x8000000000000000L);
            return this.zzL == null;
        }
        this.zzs.zzd();
        this.zzL(0x8000000000000000L);
        return this.zzs.zzg() && (this.zzL == null || !this.zzL.hasRemaining());
    }

    private final boolean zzR() {
        return this.zzt != null;
    }

    private static boolean zzS(AudioTrack audioTrack0) {
        return zzfk.zza >= 29 && audioTrack0.isOffloadedPlayback();
    }

    private final boolean zzT() {
        return this.zzr.zzc == 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final int zza(zzam zzam0) {
        if("audio/raw".equals(zzam0.zzm)) {
            if(!zzfk.zzE(zzam0.zzB)) {
                zzes.zzf("DefaultAudioSink", "Invalid PCM encoding: " + zzam0.zzB);
                return 0;
            }
            return zzam0.zzB == 2 ? 2 : 1;
        }
        return this.zzu.zza(zzam0) == null ? 0 : 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final long zzb(boolean z) {
        if(this.zzR() && !this.zzG) {
            long v = Math.min(this.zzi.zzb(z), this.zzr.zza(this.zzH()));
            while(!this.zzj.isEmpty() && v >= ((zzpw)this.zzj.getFirst()).zzc) {
                this.zzx = (zzpw)this.zzj.remove();
            }
            long v1 = v - this.zzx.zzc;
            if(this.zzx.zza.equals(zzch.zza)) {
                return this.zzx.zzb + v1 + this.zzr.zza(this.zzY.zzb());
            }
            if(this.zzj.isEmpty()) {
                return this.zzY.zza(v1) + this.zzx.zzb + this.zzr.zza(this.zzY.zzb());
            }
            zzpw zzpw0 = (zzpw)this.zzj.getFirst();
            return zzpw0.zzb - zzfk.zzn(zzpw0.zzc - v, this.zzx.zza.zzc) + this.zzr.zza(this.zzY.zzb());
        }
        return 0x8000000000000000L;
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final zzch zzc() {
        return this.zzy;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzpe
    public final zzom zzd(zzam zzam0) {
        return this.zzW ? zzom.zza : this.zzZ.zza(zzam0, this.zzv);
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zze(zzam zzam0, int v, int[] arr_v) {
        int v17;
        int v16;
        int v8;
        int v7;
        int v6;
        int v5;
        int v4;
        zzdo zzdo1;
        int v3;
        zzdp zzdp1;
        int[] arr_v1;
        if("audio/raw".equals(zzam0.zzm)) {
            zzdy.zzd(zzfk.zzE(zzam0.zzB));
            int v1 = zzfk.zzl(zzam0.zzB, zzam0.zzz);
            zzfua zzfua0 = new zzfua();
            zzfua0.zzh(this.zzf);
            zzfua0.zzg(this.zzY.zze());
            zzdo zzdo0 = new zzdo(zzfua0.zzi());
            if(zzdo0.equals(this.zzs)) {
                zzdo0 = this.zzs;
            }
            this.zze.zzq(zzam0.zzC, zzam0.zzD);
            if(zzfk.zza >= 21 || zzam0.zzz != 8 || arr_v != null) {
                arr_v1 = arr_v;
            }
            else {
                arr_v1 = new int[6];
                for(int v2 = 0; v2 < 6; ++v2) {
                    arr_v1[v2] = v2;
                }
            }
            this.zzd.zzo(arr_v1);
            zzdp zzdp0 = new zzdp(zzam0.zzA, zzam0.zzz, zzam0.zzB);
            try {
                zzdp1 = zzdo0.zza(zzdp0);
            }
            catch(zzdq zzdq0) {
                throw new zzoz(zzdq0, zzam0);
            }
            v3 = zzfk.zzg(zzdp1.zzc);
            zzdo1 = zzdo0;
            v4 = zzfk.zzl(zzdp1.zzd, zzdp1.zzc);
            v5 = v1;
            v6 = zzdp1.zzd;
            v7 = zzdp1.zzb;
            v8 = 0;
        }
        else {
            zzdo zzdo2 = new zzdo(zzfud.zzl());
            int v9 = zzam0.zzA;
            Pair pair0 = this.zzu.zza(zzam0);
            if(pair0 == null) {
                throw new zzoz("Unable to configure passthrough for: " + zzam0, zzam0);
            }
            int v10 = (int)(((Integer)pair0.first));
            v8 = 2;
            zzdo1 = zzdo2;
            v3 = (int)(((Integer)pair0.second));
            v6 = v10;
            v4 = -1;
            v7 = v9;
            v5 = -1;
        }
        if(v6 == 0) {
            throw new zzoz("Invalid output encoding (mode=" + v8 + ") for: " + zzam0, zzam0);
        }
        if(v3 == 0) {
            throw new zzoz("Invalid output channel config (mode=" + v8 + ") for: " + zzam0, zzam0);
        }
        int v11 = AudioTrack.getMinBufferSize(v7, v3, v6);
        zzdy.zzf(v11 != -2);
        int v12 = v4 == -1 ? 1 : v4;
        int v13 = 5;
        int v14 = zzam0.zzi;
        int v15 = 250000;
        if(v8 == 0) {
            v16 = v5;
            v17 = Math.max(zzqg.zza(250000, v7, v12), Math.min(v11 * 4, zzqg.zza(750000, v7, v12)));
            v13 = v6;
        }
        else {
            if(v6 == 5) {
                v15 = 500000;
                v6 = 5;
            }
            else {
                v13 = v6;
            }
            v16 = v5;
            v17 = zzfwl.zza(((long)v15) * ((long)(v14 == -1 ? zzqg.zzb(v6) : zzfwj.zza(v14, 8, RoundingMode.CEILING))) / 1000000L);
        }
        this.zzW = false;
        zzpt zzpt0 = new zzpt(zzam0, v16, v8, v4, v7, v3, v13, (Math.max(v11, ((int)(((double)v17)))) + v12 - 1) / v12 * v12, zzdo1, false, false);
        if(this.zzR()) {
            this.zzq = zzpt0;
            return;
        }
        this.zzr = zzpt0;
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzf() {
        if(this.zzR()) {
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzX = false;
            this.zzE = 0;
            this.zzx = new zzpw(this.zzy, 0L, 0L, null);
            this.zzH = 0L;
            this.zzw = null;
            this.zzj.clear();
            this.zzJ = null;
            this.zzK = 0;
            this.zzL = null;
            this.zzP = false;
            this.zzO = false;
            this.zze.zzp();
            this.zzO();
            if(this.zzi.zzi()) {
                this.zzt.pause();
            }
            if(zzqe.zzS(this.zzt)) {
                zzqc zzqc0 = this.zzk;
                zzqc0.getClass();
                zzqc0.zzb(this.zzt);
            }
            if(zzfk.zza < 21 && !this.zzR) {
                this.zzS = 0;
            }
            zzpt zzpt0 = this.zzq;
            if(zzpt0 != null) {
                this.zzr = zzpt0;
                this.zzq = null;
            }
            this.zzi.zzd();
            AudioTrack audioTrack0 = this.zzt;
            zzeb zzeb0 = this.zzh;
            zzeb0.zzc();
            Object object0 = zzqe.zza;
            synchronized(object0) {
                if(zzqe.zzb == null) {
                    zzqe.zzb = zzfk.zzB("ExoPlayer:AudioTrackReleaseThread");
                }
                ++zzqe.zzc;
                zzqe.zzb.execute(() -> try {
                    audioTrack0.flush();
                    audioTrack0.release();
                }
                finally {
                    zzeb0.zze();
                    Object object0 = zzqe.zza;
                    synchronized(object0) {
                        int v2 = zzqe.zzc - 1;
                        zzqe.zzc = v2;
                        if(v2 == 0) {
                            zzqe.zzb.shutdown();
                            zzqe.zzb = null;
                        }
                    }
                });
            }
            this.zzt = null;
        }
        this.zzm.zza();
        this.zzl.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzg() {
        this.zzF = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzh() {
        this.zzQ = false;
        if(this.zzR() && this.zzi.zzl()) {
            this.zzt.pause();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzi() {
        this.zzQ = true;
        if(this.zzR()) {
            this.zzi.zzg();
            this.zzt.play();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzj() {
        if(!this.zzO && this.zzR() && this.zzQ()) {
            this.zzK();
            this.zzO = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzk() {
        this.zzf();
        zzfud zzfud0 = this.zzf;
        int v = zzfud0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((zzdr)zzfud0.get(v1)).zzf();
        }
        zzfud zzfud1 = this.zzg;
        int v2 = zzfud1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((zzdr)zzfud1.get(v3)).zzf();
        }
        zzdo zzdo0 = this.zzs;
        if(zzdo0 != null) {
            zzdo0.zzf();
        }
        this.zzQ = false;
        this.zzW = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzl(zzk zzk0) {
        if(this.zzv.equals(zzk0)) {
            return;
        }
        this.zzv = zzk0;
        this.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzm(int v) {
        if(this.zzS != v) {
            this.zzS = v;
            this.zzR = v != 0;
            this.zzf();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzn(zzl zzl0) {
        if(this.zzT.equals(zzl0)) {
            return;
        }
        this.zzT = zzl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzo(zzdz zzdz0) {
        this.zzi.zzf(zzdz0);
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzp(zzpb zzpb0) {
        this.zzp = zzpb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzq(zzch zzch0) {
        this.zzy = new zzch(Math.max(0.1f, Math.min(zzch0.zzc, 8.0f)), Math.max(0.1f, Math.min(zzch0.zzd, 8.0f)));
        this.zzM(zzch0);
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzr(zzoh zzoh0) {
        this.zzo = zzoh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzs(AudioDeviceInfo audioDeviceInfo0) {
        zzpq zzpq0 = audioDeviceInfo0 == null ? null : new zzpq(audioDeviceInfo0);
        this.zzU = zzpq0;
        AudioTrack audioTrack0 = this.zzt;
        if(audioTrack0 != null) {
            zzpo.zza(audioTrack0, zzpq0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzt(boolean z) {
        this.zzz = z;
        this.zzM(this.zzy);
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final void zzu(float f) {
        if(this.zzI != f) {
            this.zzI = f;
            this.zzN();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final boolean zzv(ByteBuffer byteBuffer0, long v, int v1) {
        int v5;
        int v15;
        int v9;
        int v8;
        int v11;
        zzpt zzpt3;
        AudioTrack audioTrack0;
        zzdy.zzd(this.zzJ == null || byteBuffer0 == this.zzJ);
        if(this.zzq != null) {
            if(!this.zzQ()) {
                return false;
            }
            zzpt zzpt0 = this.zzq;
            if(this.zzr.zzc != zzpt0.zzc || this.zzr.zzg != zzpt0.zzg || this.zzr.zze != zzpt0.zze || this.zzr.zzf != zzpt0.zzf || this.zzr.zzd != zzpt0.zzd) {
                this.zzK();
                if(this.zzw()) {
                    return false;
                }
                this.zzf();
            }
            else {
                this.zzr = zzpt0;
                this.zzq = null;
                if(this.zzt != null && zzqe.zzS(this.zzt)) {
                }
            }
            this.zzJ(v);
        }
        if(!this.zzR()) {
            try {
                if(!this.zzh.zzd()) {
                    return false;
                }
                goto label_18;
            }
            catch(zzpa zzpa0) {
                goto label_55;
            }
            return false;
            try {
            label_18:
                zzpt zzpt1 = this.zzr;
                if(zzpt1 == null) {
                    throw null;
                }
                audioTrack0 = this.zzI(zzpt1);
                goto label_35;
            }
            catch(zzpa zzpa1) {
                try {
                    zzpt zzpt2 = this.zzr;
                    if(zzpt2.zzh > 1000000) {
                        zzpt3 = new zzpt(zzpt2.zza, zzpt2.zzb, zzpt2.zzc, zzpt2.zzd, zzpt2.zze, zzpt2.zzf, zzpt2.zzg, 1000000, zzpt2.zzi, false, false);
                        audioTrack0 = this.zzI(zzpt3);
                        this.zzr = zzpt3;
                        goto label_35;
                    }
                    goto label_32;
                }
                catch(zzpa zzpa0) {
                    goto label_55;
                }
                try {
                    audioTrack0 = this.zzI(zzpt3);
                    this.zzr = zzpt3;
                    goto label_35;
                }
                catch(zzpa zzpa2) {
                    try {
                        zzpa1.addSuppressed(zzpa2);
                    }
                    catch(Exception unused_ex) {
                    }
                }
                try {
                label_32:
                    if(this.zzr.zzc()) {
                        this.zzW = true;
                    }
                    throw zzpa1;
                label_35:
                    this.zzt = audioTrack0;
                    if(zzqe.zzS(audioTrack0)) {
                        AudioTrack audioTrack1 = this.zzt;
                        if(this.zzk == null) {
                            this.zzk = new zzqc(this);
                        }
                        this.zzk.zza(audioTrack1);
                    }
                    int v2 = zzfk.zza;
                    if(v2 >= 0x1F) {
                        zzoh zzoh0 = this.zzo;
                        if(zzoh0 != null) {
                            zzpp.zza(this.zzt, zzoh0);
                        }
                    }
                    this.zzS = this.zzt.getAudioSessionId();
                    this.zzi.zze(this.zzt, this.zzr.zzc == 2, this.zzr.zzg, this.zzr.zzd, this.zzr.zzh);
                    this.zzN();
                    zzpq zzpq0 = this.zzU;
                    if(zzpq0 != null && v2 >= 23) {
                        zzpo.zza(this.zzt, zzpq0);
                    }
                    this.zzG = true;
                    goto label_59;
                label_55:
                    if(zzpa0.zzb) {
                        throw zzpa0;
                    }
                }
                catch(zzpa zzpa0) {
                    goto label_55;
                }
            }
            this.zzl.zzb(zzpa0);
            return false;
        }
    label_59:
        this.zzl.zza();
        if(this.zzG) {
            this.zzH = Math.max(0L, v);
            this.zzF = false;
            this.zzG = false;
            this.zzJ(v);
            if(this.zzQ) {
                this.zzi();
            }
        }
        long v3 = this.zzH();
        if(!this.zzi.zzk(v3)) {
            return false;
        }
        if(this.zzJ == null) {
            zzdy.zzd(byteBuffer0.order() == ByteOrder.LITTLE_ENDIAN);
            if(!byteBuffer0.hasRemaining()) {
                return true;
            }
            zzpt zzpt4 = this.zzr;
            if(zzpt4.zzc != 0 && this.zzE == 0) {
                int v4 = zzpt4.zzg;
            alab1:
                switch(v4) {
                    case 7: 
                    case 8: {
                        switch(byteBuffer0.getInt(0)) {
                            case 0xE842C471: {
                                goto label_107;
                            }
                            case 0xF21B4140: {
                                v5 = 0x400;
                                break alab1;
                            }
                            case 0x25205864: {
                                v5 = 0x1000;
                                break alab1;
                            }
                            default: {
                                int v6 = byteBuffer0.position();
                                int v7 = byteBuffer0.get(v6);
                                switch(v7) {
                                    case -2: {
                                        int v10 = byteBuffer0.get(v6 + 5);
                                        v11 = (byteBuffer0.get(v6 + 4) & 0xFC) >> 2 | (v10 & 1) << 6;
                                        break;
                                    }
                                    case -1: {
                                        v8 = (byteBuffer0.get(v6 + 4) & 7) << 4;
                                        v9 = byteBuffer0.get(v6 + 7) & 60;
                                        v11 = v9 >> 2 | v8;
                                        break;
                                    }
                                    default: {
                                        if(v7 == 0x1F) {
                                            v8 = (byteBuffer0.get(v6 + 5) & 7) << 4;
                                            v9 = byteBuffer0.get(v6 + 6) & 60;
                                        }
                                        else {
                                            v8 = (byteBuffer0.get(v6 + 4) & 1) << 6;
                                            v9 = byteBuffer0.get(v6 + 5) & 0xFC;
                                        }
                                        v11 = v9 >> 2 | v8;
                                        break;
                                    }
                                }
                                v5 = (v11 + 1) * 0x20;
                                break alab1;
                            }
                        }
                    }
                    case 9: {
                        v5 = zzabv.zzc(zzfk.zzh(byteBuffer0, byteBuffer0.position()));
                        if(v5 == -1) {
                            throw new IllegalArgumentException();
                        }
                        break;
                    }
                    case 11: 
                    case 12: {
                        v5 = 0x800;
                        break;
                    }
                    case 14: {
                        int v12 = byteBuffer0.position();
                        int v13 = byteBuffer0.limit();
                        for(int v14 = v12; true; ++v14) {
                            v15 = -1;
                            if(v14 > v13 - 10) {
                                break;
                            }
                            if((zzfk.zzh(byteBuffer0, v14 + 4) & -2) == 0xF8726FBA) {
                                v15 = v14 - v12;
                                break;
                            }
                        }
                        v5 = v15 == -1 ? 0 : (40 << (byteBuffer0.get(byteBuffer0.position() + v15 + ((byteBuffer0.get(byteBuffer0.position() + v15 + 7) & 0xFF) == 0xBB ? 9 : 8)) >> 4 & 7)) * 16;
                        break;
                    }
                    case 15: {
                        v5 = 0x200;
                        break;
                    }
                    case 10: 
                    case 16: {
                    label_107:
                        v5 = 0x400;
                        break;
                    }
                    case 17: {
                        byte[] arr_b = new byte[16];
                        byteBuffer0.get(arr_b);
                        byteBuffer0.position(byteBuffer0.position());
                        v5 = zzaaf.zza(new zzfa(arr_b, 16)).zzc;
                        break;
                    }
                    case 5: 
                    case 6: 
                    case 18: {
                        v5 = zzaac.zza(byteBuffer0);
                        break;
                    }
                    case 20: {
                        v5 = zzabw.zza(byteBuffer0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Unexpected audio encoding: " + v4);
                    }
                }
                this.zzE = v5;
                if(v5 == 0) {
                    return true;
                }
            }
            if(this.zzw != null) {
                if(!this.zzQ()) {
                    return false;
                }
                this.zzJ(v);
                this.zzw = null;
            }
            zzpt zzpt5 = this.zzr;
            long v16 = this.zzH + (this.zzG() - this.zze.zzo()) * 1000000L / ((long)zzpt5.zza.zzA);
            if(!this.zzF && Math.abs(v16 - v) > 200000L) {
                zzpb zzpb0 = this.zzp;
                if(zzpb0 != null) {
                    zzpb0.zza(new zzpc(v, v16));
                }
                this.zzF = true;
            }
            if(this.zzF) {
                if(!this.zzQ()) {
                    return false;
                }
                long v17 = v - v16;
                this.zzH += v17;
                this.zzF = false;
                this.zzJ(v);
                zzpb zzpb1 = this.zzp;
                if(zzpb1 != null && v17 != 0L) {
                    ((zzqj)zzpb1).zza.zzah();
                }
            }
            if(this.zzr.zzc == 0) {
                this.zzA += (long)byteBuffer0.remaining();
            }
            else {
                this.zzB += ((long)this.zzE) * ((long)v1);
            }
            this.zzJ = byteBuffer0;
            this.zzK = v1;
        }
        this.zzL(v);
        if(!this.zzJ.hasRemaining()) {
            this.zzJ = null;
            this.zzK = 0;
            return true;
        }
        long v18 = this.zzH();
        if(this.zzi.zzj(v18)) {
            zzes.zzf("DefaultAudioSink", "Resetting stalled audio track");
            this.zzf();
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final boolean zzw() {
        if(this.zzR()) {
            long v = this.zzH();
            return this.zzi.zzh(v);
        }
        return false;
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzpe
    public final boolean zzx() {
        return !this.zzR() || this.zzO && !this.zzw();
    }

    @Override  // com.google.android.gms.internal.ads.zzpe
    public final boolean zzy(zzam zzam0) {
        return this.zza(zzam0) != 0;
    }

    static long zzz(zzqe zzqe0) {
        return zzqe0.zzV;
    }
}

