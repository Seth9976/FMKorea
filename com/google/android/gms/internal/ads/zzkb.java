package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

final class zzkb extends zzm implements zziw {
    private final zzlw zzA;
    private final long zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private int zzF;
    private zzlr zzG;
    private zzcl zzH;
    private zzbv zzI;
    private zzbv zzJ;
    private zzam zzK;
    private zzam zzL;
    private AudioTrack zzM;
    private Object zzN;
    private Surface zzO;
    private int zzP;
    private zzfc zzQ;
    private zzid zzR;
    private zzid zzS;
    private int zzT;
    private zzk zzU;
    private float zzV;
    private boolean zzW;
    private zzdx zzX;
    private boolean zzY;
    private boolean zzZ;
    private zzz zzaa;
    private zzdn zzab;
    private zzbv zzac;
    private zzlg zzad;
    private int zzae;
    private long zzaf;
    private final zzjg zzag;
    private zzvm zzah;
    final zzxm zzb;
    final zzcl zzc;
    public static final int zzd;
    private final zzeb zze;
    private final Context zzf;
    private final zzcp zzg;
    private final zzln[] zzh;
    private final zzxl zzi;
    private final zzej zzj;
    private final zzkl zzk;
    private final zzep zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzct zzn;
    private final List zzo;
    private final boolean zzp;
    private final zztr zzq;
    private final zzlx zzr;
    private final Looper zzs;
    private final zzxt zzt;
    private final zzdz zzu;
    private final zzjx zzv;
    private final zzjz zzw;
    private final zzhx zzx;
    private final zzib zzy;
    private final zzlv zzz;

    static {
        zzbq.zzb("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public zzkb(zziv zziv0, zzcp zzcp0) {
        zzeb zzeb0 = new zzeb(zzdz.zza);
        this.zze = zzeb0;
        try {
            zzes.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.1.0] [" + zzfk.zze + "]");
            Context context0 = zziv0.zza.getApplicationContext();
            this.zzf = context0;
            Object object0 = zziv0.zzh.apply(zziv0.zzb);
            this.zzr = object0;
            this.zzU = zziv0.zzj;
            this.zzP = zziv0.zzk;
            this.zzW = false;
            this.zzB = zziv0.zzo;
            zzjx zzjx0 = new zzjx(this, null);
            this.zzv = zzjx0;
            zzjz zzjz0 = new zzjz(null);
            this.zzw = zzjz0;
            Handler handler0 = new Handler(zziv0.zzi);
            zzln[] arr_zzln = ((zzip)zziv0.zzc).zza.zza(handler0, zzjx0, zzjx0, zzjx0, zzjx0);
            this.zzh = arr_zzln;
            zzxl zzxl0 = (zzxl)zziv0.zze.zza();
            this.zzi = zzxl0;
            this.zzq = zziv.zza(((zziq)zziv0.zzd).zza);
            zzxx zzxx0 = zzxx.zzg(((zzit)zziv0.zzg).zza);
            this.zzt = zzxx0;
            this.zzp = zziv0.zzl;
            this.zzG = zziv0.zzm;
            Looper looper0 = zziv0.zzi;
            this.zzs = looper0;
            zzdz zzdz0 = zziv0.zzb;
            this.zzu = zzdz0;
            this.zzg = zzcp0;
            zzep zzep0 = new zzep(looper0, zzdz0, new zzjf(this));
            this.zzl = zzep0;
            CopyOnWriteArraySet copyOnWriteArraySet0 = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet0;
            this.zzo = new ArrayList();
            this.zzah = new zzvm(0);
            zzxm zzxm0 = new zzxm(new zzlq[2], new zzxf[2], zzdh.zza, null);
            this.zzb = zzxm0;
            this.zzn = new zzct();
            zzcj zzcj0 = new zzcj();
            zzcj0.zzc(new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 0x1F, 20, 30, 21, 22, 24, 27, 28, 0x20});
            zzxl0.zzm();
            zzcj0.zzd(29, true);
            zzcj0.zzd(23, false);
            zzcj0.zzd(25, false);
            zzcj0.zzd(33, false);
            zzcj0.zzd(26, false);
            zzcj0.zzd(34, false);
            zzcl zzcl0 = zzcj0.zze();
            this.zzc = zzcl0;
            zzcj zzcj1 = new zzcj();
            zzcj1.zzb(zzcl0);
            zzcj1.zza(4);
            zzcj1.zza(10);
            this.zzH = zzcj1.zze();
            this.zzj = zzdz0.zzb(looper0, null);
            zzjg zzjg0 = new zzjg(this);
            this.zzag = zzjg0;
            this.zzad = zzlg.zzi(zzxm0);
            ((zzlx)object0).zzP(zzcp0, looper0);
            zzoh zzoh0 = zzfk.zza >= 0x1F ? zzjs.zza(context0, this, zziv0.zzp) : new zzoh();
            this.zzk = new zzkl(arr_zzln, zzxl0, zzxm0, ((zzko)zziv0.zzf.zza()), zzxx0, 0, false, ((zzlx)object0), this.zzG, zziv0.zzr, zziv0.zzn, false, looper0, zzdz0, zzjg0, zzoh0, null);
            this.zzV = 1.0f;
            this.zzI = zzbv.zza;
            this.zzJ = zzbv.zza;
            this.zzac = zzbv.zza;
            int v = -1;
            this.zzae = -1;
            if(zzfk.zza < 21) {
                if(this.zzM != null && this.zzM.getAudioSessionId() != 0) {
                    this.zzM.release();
                    this.zzM = null;
                }
                if(this.zzM == null) {
                    this.zzM = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.zzT = this.zzM.getAudioSessionId();
            }
            else {
                AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
                if(audioManager0 != null) {
                    v = audioManager0.generateAudioSessionId();
                }
                this.zzT = v;
            }
            this.zzX = zzdx.zza;
            this.zzY = true;
            if(object0 == null) {
                throw null;
            }
            zzep0.zzb(object0);
            zzxx0.zze(new Handler(looper0), ((zzxs)object0));
            copyOnWriteArraySet0.add(zzjx0);
            this.zzx = new zzhx(zziv0.zza, handler0, zzjx0);
            this.zzy = new zzib(zziv0.zza, handler0, zzjx0);
            zzfk.zzD(null, null);
            this.zzz = new zzlv(zziv0.zza);
            this.zzA = new zzlw(zziv0.zza);
            this.zzaa = new zzx(0).zza();
            this.zzab = zzdn.zza;
            this.zzQ = zzfc.zza;
            zzxl0.zzj(this.zzU);
            this.zzah(1, 10, this.zzT);
            this.zzah(2, 10, this.zzT);
            this.zzah(1, 3, this.zzU);
            this.zzah(2, 4, this.zzP);
            this.zzah(2, 5, 0);
            this.zzah(1, 9, Boolean.valueOf(this.zzW));
            this.zzah(2, 7, zzjz0);
            this.zzah(6, 8, zzjz0);
        }
        catch(Throwable throwable0) {
            this.zze.zze();
            throw throwable0;
        }
        zzeb0.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zziw
    public final void zzA(zzma zzma0) {
        this.zzao();
        this.zzr.zzO(zzma0);
    }

    @Override  // com.google.android.gms.internal.ads.zziw
    public final void zzB(zztu zztu0) {
        this.zzao();
        List list0 = Collections.singletonList(zztu0);
        this.zzao();
        this.zzao();
        this.zzX(this.zzad);
        this.zzk();
        ++this.zzC;
        if(!this.zzo.isEmpty()) {
            int v = this.zzo.size();
            for(int v1 = v - 1; v1 >= 0; --v1) {
                this.zzo.remove(v1);
            }
            this.zzah = this.zzah.zzh(0, v);
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            zzld zzld0 = new zzld(((zztu)list0.get(v2)), this.zzp);
            arrayList0.add(zzld0);
            zzka zzka0 = new zzka(zzld0.zzb, zzld0.zza);
            this.zzo.add(v2, zzka0);
        }
        this.zzah = this.zzah.zzg(0, arrayList0.size());
        zzll zzll0 = new zzll(this.zzo, this.zzah);
        if(!zzll0.zzo() && zzll0.zzc() < 0) {
            throw new zzan(zzll0, -1, 0x8000000000000001L);
        }
        int v3 = zzll0.zzg(false);
        zzlg zzlg0 = this.zzae(this.zzad, zzll0, this.zzad(zzll0, v3, 0x8000000000000001L));
        zzlg zzlg1 = zzlg0.zzg((v3 == -1 || zzlg0.zze == 1 || (zzll0.zzo() || v3 >= zzll0.zzc()) ? zzlg0.zze : 2));
        this.zzk.zzq(arrayList0, v3, 0x8000000000000001L, this.zzah);
        this.zzam(zzlg1, 0, 1, !this.zzad.zzb.zza.equals(zzlg1.zzb.zza) && !this.zzad.zza.zzo(), 4, this.zzaa(zzlg1), -1, false);
    }

    static int zzC(boolean z, int v) {
        return zzkb.zzY(z, v);
    }

    static zzep zzD(zzkb zzkb0) {
        return zzkb0.zzl;
    }

    public final zzil zzE() {
        this.zzao();
        return this.zzad.zzf;
    }

    static zzlx zzF(zzkb zzkb0) {
        return zzkb0.zzr;
    }

    static Object zzG(zzkb zzkb0) {
        return zzkb0.zzN;
    }

    static void zzH(zzkb zzkb0, zzid zzid0) {
        zzkb0.zzS = zzid0;
    }

    static void zzI(zzkb zzkb0, zzam zzam0) {
        zzkb0.zzL = zzam0;
    }

    static void zzJ(zzkb zzkb0, boolean z) {
        zzkb0.zzW = z;
    }

    static void zzK(zzkb zzkb0, zzid zzid0) {
        zzkb0.zzR = zzid0;
    }

    static void zzL(zzkb zzkb0, zzam zzam0) {
        zzkb0.zzK = zzam0;
    }

    static void zzM(zzkb zzkb0, zzdn zzdn0) {
        zzkb0.zzab = zzdn0;
    }

    static void zzN(zzkb zzkb0, int v, int v1) {
        zzkb0.zzag(v, v1);
    }

    static void zzO(zzkb zzkb0) {
        zzkb0.zzai();
    }

    static void zzP(zzkb zzkb0, SurfaceTexture surfaceTexture0) {
        Surface surface0 = new Surface(surfaceTexture0);
        zzkb0.zzaj(surface0);
        zzkb0.zzO = surface0;
    }

    static void zzQ(zzkb zzkb0, Object object0) {
        zzkb0.zzaj(null);
    }

    static void zzR(zzkb zzkb0, boolean z, int v, int v1) {
        zzkb0.zzal(z, v, v1);
    }

    static void zzS(zzkb zzkb0) {
        zzkb0.zzan();
    }

    // 检测为 Lambda 实现
    final void zzT(zzkj zzkj0) [...]

    final void zzU(zzkj zzkj0) {
        zzjh zzjh0 = () -> {
            boolean z1;
            long v2;
            int v = this.zzC - zzkj0.zzb;
            this.zzC = v;
            boolean z = true;
            if(zzkj0.zzc) {
                this.zzD = zzkj0.zzd;
                this.zzE = true;
            }
            if(zzkj0.zze) {
                this.zzF = zzkj0.zzf;
            }
            if(v == 0) {
                zzcw zzcw0 = zzkj0.zza.zza;
                if(!this.zzad.zza.zzo() && zzcw0.zzo()) {
                    this.zzae = -1;
                    this.zzaf = 0L;
                }
                if(!zzcw0.zzo()) {
                    List list0 = ((zzll)zzcw0).zzw();
                    zzdy.zzf(list0.size() == this.zzo.size());
                    for(int v1 = 0; v1 < list0.size(); ++v1) {
                        ((zzka)this.zzo.get(v1)).zzc(((zzcw)list0.get(v1)));
                    }
                }
                if(this.zzE) {
                    if(zzkj0.zza.zzb.equals(this.zzad.zzb) && zzkj0.zza.zzd == this.zzad.zzr) {
                        z = false;
                        v2 = 0x8000000000000001L;
                    }
                    else if(zzcw0.zzo() || zzkj0.zza.zzb.zzb()) {
                        v2 = zzkj0.zza.zzd;
                    }
                    else {
                        v2 = zzkj0.zza.zzd;
                        this.zzac(zzcw0, zzkj0.zza.zzb, v2);
                    }
                    z1 = z;
                }
                else {
                    v2 = 0x8000000000000001L;
                    z1 = false;
                }
                this.zzE = false;
                this.zzam(zzkj0.zza, 1, this.zzF, z1, this.zzD, v2, -1, false);
            }
        };
        this.zzj.zzh(zzjh0);
    }

    // 检测为 Lambda 实现
    final void zzV(zzcm zzcm0) [...]

    static boolean zzW(zzkb zzkb0) {
        return zzkb0.zzW;
    }

    // 去混淆评级： 低(20)
    private final int zzX(zzlg zzlg0) {
        return zzlg0.zza.zzo() ? this.zzae : zzlg0.zza.zzn(zzlg0.zzb.zza, this.zzn).zzd;
    }

    private static int zzY(boolean z, int v) {
        return !z || v == 1 ? 1 : 2;
    }

    private final long zzZ(zzlg zzlg0) {
        if(zzlg0.zzb.zzb()) {
            zzlg0.zza.zzn(zzlg0.zzb.zza, this.zzn);
            long v = zzlg0.zzc;
            if(Long.compare(v, 0x8000000000000001L) == 0) {
                int v1 = this.zzX(zzlg0);
                zzlg0.zza.zze(v1, this.zza, 0L);
                return zzfk.zzr(0L);
            }
            return zzfk.zzr(v) + zzfk.zzr(0L);
        }
        return zzfk.zzr(this.zzaa(zzlg0));
    }

    @Override  // com.google.android.gms.internal.ads.zzm
    public final void zza(int v, long v1, int v2, boolean z) {
        this.zzao();
        zzdy.zzd(v >= 0);
        this.zzr.zzu();
        zzcw zzcw0 = this.zzad.zza;
        if(!zzcw0.zzo() && v >= zzcw0.zzc()) {
            return;
        }
        ++this.zzC;
        if(this.zzx()) {
            zzes.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            zzkj zzkj0 = new zzkj(this.zzad);
            zzkj0.zza(1);
            this.zzag.zza.zzU(zzkj0);
            return;
        }
        zzlg zzlg0 = this.zzad.zze != 3 && (this.zzad.zze != 4 || zzcw0.zzo()) ? this.zzad : this.zzad.zzg(2);
        int v3 = this.zzd();
        zzlg zzlg1 = this.zzae(zzlg0, zzcw0, this.zzad(zzcw0, v, v1));
        this.zzk.zzl(zzcw0, v, zzfk.zzp(v1));
        this.zzam(zzlg1, 0, 1, true, 1, this.zzaa(zzlg1), v3, false);
    }

    private final long zzaa(zzlg zzlg0) {
        if(zzlg0.zza.zzo()) {
            return zzfk.zzp(this.zzaf);
        }
        long v = zzlg0.zzo ? zzlg0.zza() : zzlg0.zzr;
        if(zzlg0.zzb.zzb()) {
            return v;
        }
        this.zzac(zzlg0.zza, zzlg0.zzb, v);
        return v;
    }

    private static long zzab(zzlg zzlg0) {
        zzcv zzcv0 = new zzcv();
        zzct zzct0 = new zzct();
        zzlg0.zza.zzn(zzlg0.zzb.zza, zzct0);
        long v = zzlg0.zzc;
        if(v == 0x8000000000000001L) {
            v = 0L;
            zzlg0.zza.zze(zzct0.zzd, zzcv0, 0L);
        }
        return v;
    }

    private final long zzac(zzcw zzcw0, zzts zzts0, long v) {
        zzcw0.zzn(zzts0.zza, this.zzn);
        return v;
    }

    private final Pair zzad(zzcw zzcw0, int v, long v1) {
        if(zzcw0.zzo()) {
            this.zzae = v;
            if(v1 == 0x8000000000000001L) {
                v1 = 0L;
            }
            this.zzaf = v1;
            return null;
        }
        if(v != -1 && v < zzcw0.zzc()) {
            return zzcw0.zzl(this.zza, this.zzn, v, zzfk.zzp(v1));
        }
        v = zzcw0.zzg(false);
        zzcw0.zze(v, this.zza, 0L);
        v1 = zzfk.zzr(0L);
        return zzcw0.zzl(this.zza, this.zzn, v, zzfk.zzp(v1));
    }

    private final zzlg zzae(zzlg zzlg0, zzcw zzcw0, Pair pair0) {
        zzdy.zzd(zzcw0.zzo() || pair0 != null);
        zzcw zzcw1 = zzlg0.zza;
        long v = this.zzZ(zzlg0);
        zzlg zzlg1 = zzlg0.zzh(zzcw0);
        if(zzcw0.zzo()) {
            zzts zzts0 = zzlg.zzj();
            long v1 = zzfk.zzp(this.zzaf);
            zzlg zzlg2 = zzlg1.zzd(zzts0, v1, v1, v1, 0L, zzvs.zza, this.zzb, zzfud.zzl()).zzc(zzts0);
            zzlg2.zzp = zzlg2.zzr;
            return zzlg2;
        }
        Object object0 = zzlg1.zzb.zza;
        boolean z = object0.equals(pair0.first);
        zzts zzts1 = z ? zzlg1.zzb : new zzts(pair0.first);
        long v2 = (long)(((Long)pair0.second));
        long v3 = zzfk.zzp(v);
        if(!zzcw1.zzo()) {
            zzcw1.zzn(object0, this.zzn);
        }
        if(z) {
            int v4 = Long.compare(v2, v3);
            if(v4 >= 0) {
                if(v4 != 0) {
                    goto label_28;
                }
                int v5 = zzcw0.zza(zzlg1.zzk.zza);
                if(v5 == -1 || zzcw0.zzd(v5, this.zzn, false).zzd != zzcw0.zzn(zzts1.zza, this.zzn).zzd) {
                    zzcw0.zzn(zzts1.zza, this.zzn);
                    long v6 = zzts1.zzb() ? this.zzn.zzh(zzts1.zzb, zzts1.zzc) : this.zzn.zze;
                    zzlg1 = zzlg1.zzd(zzts1, zzlg1.zzr, zzlg1.zzr, zzlg1.zzd, v6 - zzlg1.zzr, zzlg1.zzh, zzlg1.zzi, zzlg1.zzj).zzc(zzts1);
                    zzlg1.zzp = v6;
                    return zzlg1;
                label_28:
                    zzdy.zzf(!zzts1.zzb());
                    long v7 = Math.max(0L, zzlg1.zzq - (v2 - v3));
                    long v8 = zzlg1.zzk.equals(zzlg1.zzb) ? v2 + v7 : zzlg1.zzp;
                    zzlg1 = zzlg1.zzd(zzts1, v2, v2, v2, v7, zzlg1.zzh, zzlg1.zzi, zzlg1.zzj);
                    zzlg1.zzp = v8;
                    return zzlg1;
                }
            }
            else {
                goto label_34;
            }
        }
        else {
        label_34:
            zzdy.zzf(!zzts1.zzb());
            zzvs zzvs0 = z ? zzlg1.zzh : zzvs.zza;
            zzxm zzxm0 = z ? zzlg1.zzi : this.zzb;
            List list0 = z ? zzlg1.zzj : zzfud.zzl();
            zzlg1 = zzlg1.zzd(zzts1, v2, v2, v2, 0L, zzvs0, zzxm0, list0).zzc(zzts1);
            zzlg1.zzp = v2;
        }
        return zzlg1;
    }

    private final zzlj zzaf(zzli zzli0) {
        int v = this.zzX(this.zzad);
        zzkl zzkl0 = this.zzk;
        zzcw zzcw0 = this.zzad.zza;
        if(v == -1) {
            v = 0;
        }
        return new zzlj(zzkl0, zzli0, zzcw0, v, this.zzu, zzkl0.zzb());
    }

    private final void zzag(int v, int v1) {
        if(v == this.zzQ.zzb() && v1 == this.zzQ.zza()) {
            return;
        }
        this.zzQ = new zzfc(v, v1);
        zzjj zzjj0 = new zzjj(v, v1);
        this.zzl.zzd(24, zzjj0);
        this.zzl.zzc();
        this.zzah(2, 14, new zzfc(v, v1));
    }

    private final void zzah(int v, int v1, Object object0) {
        zzln[] arr_zzln = this.zzh;
        for(int v2 = 0; v2 < 2; ++v2) {
            zzln zzln0 = arr_zzln[v2];
            if(zzln0.zzb() == v) {
                zzlj zzlj0 = this.zzaf(zzln0);
                zzlj0.zzf(v1);
                zzlj0.zze(object0);
                zzlj0.zzd();
            }
        }
    }

    private final void zzai() {
        this.zzah(1, 2, ((float)(this.zzV * this.zzy.zza())));
    }

    private final void zzaj(Object object0) {
        ArrayList arrayList0 = new ArrayList();
        zzln[] arr_zzln = this.zzh;
        boolean z = false;
        for(int v = 0; v < 2; ++v) {
            zzln zzln0 = arr_zzln[v];
            if(zzln0.zzb() == 2) {
                zzlj zzlj0 = this.zzaf(zzln0);
                zzlj0.zzf(1);
                zzlj0.zze(object0);
                zzlj0.zzd();
                arrayList0.add(zzlj0);
            }
        }
        if(this.zzN != null && this.zzN != object0) {
            try {
                for(Object object1: arrayList0) {
                    ((zzlj)object1).zzi(this.zzB);
                }
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
            }
            catch(TimeoutException unused_ex) {
                z = true;
            }
            Surface surface0 = this.zzO;
            if(this.zzN == surface0) {
                surface0.release();
                this.zzO = null;
            }
        }
        this.zzN = object0;
        if(z) {
            this.zzak(zzil.zzd(new zzkm(3), 1003));
        }
    }

    private final void zzak(zzil zzil0) {
        zzlg zzlg0 = this.zzad.zzc(this.zzad.zzb);
        zzlg0.zzp = zzlg0.zzr;
        zzlg0.zzq = 0L;
        zzlg zzlg1 = zzlg0.zzg(1);
        if(zzil0 != null) {
            zzlg1 = zzlg1.zzf(zzil0);
        }
        ++this.zzC;
        this.zzk.zzo();
        this.zzam(zzlg1, 0, 1, false, 5, 0x8000000000000001L, -1, false);
    }

    private final void zzal(boolean z, int v, int v1) {
        int v2 = 0;
        boolean z1 = z && v != -1;
        if(z1 && v != 1) {
            v2 = 1;
        }
        zzlg zzlg0 = this.zzad;
        if(zzlg0.zzl == z1 && zzlg0.zzm == v2) {
            return;
        }
        ++this.zzC;
        if(zzlg0.zzo) {
            zzlg0 = zzlg0.zzb();
        }
        zzlg zzlg1 = zzlg0.zze(z1, v2);
        this.zzk.zzn(z1, v2);
        this.zzam(zzlg1, 0, v1, false, 5, 0x8000000000000001L, -1, false);
    }

    private final void zzam(zzlg zzlg0, int v, int v1, boolean z, int v2, long v3, int v4, boolean z1) {
        boolean z14;
        boolean z13;
        boolean z9;
        boolean z8;
        boolean z7;
        zzcl zzcl2;
        Object object4;
        zzbp zzbp3;
        Object object3;
        int v20;
        long v18;
        long v17;
        int v16;
        int v15;
        zzbp zzbp2;
        Object object1;
        Object object0;
        int v14;
        int v13;
        zzbv zzbv0;
        zzbp zzbp0;
        int v6;
        Pair pair0;
        zzlg zzlg1 = this.zzad;
        this.zzad = zzlg0;
        boolean z2 = zzlg1.zza.equals(zzlg0.zza);
        zzcw zzcw0 = zzlg1.zza;
        zzcw zzcw1 = zzlg0.zza;
        if(zzcw1.zzo() && zzcw0.zzo()) {
            pair0 = new Pair(Boolean.FALSE, -1);
        }
        else if(zzcw1.zzo() != zzcw0.zzo()) {
            pair0 = new Pair(Boolean.TRUE, 3);
        }
        else if(zzcw0.zze(zzcw0.zzn(zzlg1.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc.equals(zzcw1.zze(zzcw1.zzn(zzlg0.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc)) {
            pair0 = !z || v2 != 0 || zzlg1.zzb.zzd >= zzlg0.zzb.zzd ? new Pair(Boolean.FALSE, -1) : new Pair(Boolean.TRUE, 0);
        }
        else if(z && v2 == 0) {
            v6 = 1;
            pair0 = new Pair(Boolean.TRUE, v6);
        }
        else if(!z || v2 != 1) {
            if(z2) {
                throw new IllegalStateException();
            }
            pair0 = new Pair(Boolean.TRUE, 3);
        }
        else {
            v6 = 2;
            pair0 = new Pair(Boolean.TRUE, v6);
        }
        boolean z3 = ((Boolean)pair0.first).booleanValue();
        int v7 = (int)(((Integer)pair0.second));
        if(z3) {
            if(zzlg0.zza.zzo()) {
                zzbp0 = null;
            }
            else {
                zzct zzct0 = zzlg0.zza.zzn(zzlg0.zzb.zza, this.zzn);
                zzbp0 = zzlg0.zza.zze(zzct0.zzd, this.zza, 0L).zze;
            }
            this.zzac = zzbv.zza;
        }
        else {
            zzbp0 = null;
        }
        if(!zzlg1.zzj.equals(zzlg0.zzj)) {
            zzbt zzbt0 = this.zzac.zza();
            List list0 = zzlg0.zzj;
            int v8 = 0;
            for(int v5 = 0; v8 < list0.size(); v5 = 0) {
                zzbz zzbz0 = (zzbz)list0.get(v8);
                while(v5 < zzbz0.zza()) {
                    zzbz0.zzb(v5).zza(zzbt0);
                    ++v5;
                }
                ++v8;
            }
            this.zzac = zzbt0.zzu();
        }
        zzcw zzcw2 = this.zzn();
        if(zzcw2.zzo()) {
            zzbv0 = this.zzac;
        }
        else {
            zzbp zzbp1 = zzcw2.zze(this.zzd(), this.zza, 0L).zze;
            zzbt zzbt1 = this.zzac.zza();
            zzbt1.zzb(zzbp1.zzg);
            zzbv0 = zzbt1.zzu();
        }
        boolean z4 = zzbv0.equals(this.zzI);
        this.zzI = zzbv0;
        boolean z5 = zzlg1.zzl != zzlg0.zzl;
        int v9 = zzlg1.zze == zzlg0.zze ? 0 : 1;
        if(v9 != 0 || z5) {
            this.zzan();
        }
        int v10 = zzlg1.zzg == zzlg0.zzg ? 0 : 1;
        if(!z2) {
            zzjl zzjl0 = new zzjl(zzlg0, v);
            this.zzl.zzd(0, zzjl0);
        }
        if(z) {
            zzct zzct1 = new zzct();
            if(zzlg1.zza.zzo()) {
                v13 = v9;
                v14 = v10;
                v16 = v4;
                object1 = null;
                zzbp2 = null;
                object0 = null;
                v15 = -1;
            }
            else {
                zzlg1.zza.zzn(zzlg1.zzb.zza, zzct1);
                int v11 = zzct1.zzd;
                int v12 = zzlg1.zza.zza(zzlg1.zzb.zza);
                v13 = v9;
                v14 = v10;
                zzcv zzcv0 = zzlg1.zza.zze(v11, this.zza, 0L);
                object0 = zzlg1.zzb.zza;
                object1 = zzcv0.zzc;
                zzbp2 = this.zza.zze;
                v15 = v12;
                v16 = v11;
            }
            if(v2 != 0) {
                if(zzlg1.zzb.zzb()) {
                    v17 = zzlg1.zzr;
                    v18 = zzkb.zzab(zzlg1);
                }
                else {
                    v17 = zzlg1.zzr;
                    v18 = v17;
                }
            }
            else if(zzlg1.zzb.zzb()) {
                v17 = zzct1.zzh(zzlg1.zzb.zzb, zzlg1.zzb.zzc);
                v18 = zzkb.zzab(zzlg1);
            }
            else {
                v17 = zzlg1.zzb.zze == -1 ? zzct1.zze : zzkb.zzab(this.zzad);
                v18 = v17;
            }
            zzco zzco0 = new zzco(object1, v16, zzbp2, object0, v15, zzfk.zzr(v17), zzfk.zzr(v18), zzlg1.zzb.zzb, zzlg1.zzb.zzc);
            int v19 = this.zzd();
            if(this.zzad.zza.zzo()) {
                object3 = null;
                zzbp3 = null;
                object4 = null;
                v20 = -1;
            }
            else {
                Object object2 = this.zzad.zzb.zza;
                this.zzad.zza.zzn(object2, this.zzn);
                v20 = this.zzad.zza.zza(object2);
                object3 = this.zzad.zza.zze(v19, this.zza, 0L).zzc;
                zzbp3 = this.zza.zze;
                object4 = object2;
            }
            long v21 = zzfk.zzr(v3);
            zzjq zzjq0 = new zzjq(v2, zzco0, new zzco(object3, v19, zzbp3, object4, v20, v21, (this.zzad.zzb.zzb() ? zzfk.zzr(zzkb.zzab(this.zzad)) : v21), this.zzad.zzb.zzb, this.zzad.zzb.zzc));
            this.zzl.zzd(11, zzjq0);
        }
        else {
            v13 = v9;
            v14 = v10;
        }
        if(z3) {
            zzjr zzjr0 = new zzjr(zzbp0, v7);
            this.zzl.zzd(1, zzjr0);
        }
        if(zzlg1.zzf != zzlg0.zzf) {
            zzix zzix0 = new zzix(zzlg0);
            this.zzl.zzd(10, zzix0);
            if(zzlg0.zzf != null) {
                zziy zziy0 = new zziy(zzlg0);
                this.zzl.zzd(10, zziy0);
            }
        }
        zzxm zzxm0 = zzlg0.zzi;
        if(zzlg1.zzi != zzxm0) {
            this.zzi.zzp(zzxm0.zze);
            zziz zziz0 = new zziz(zzlg0);
            this.zzl.zzd(2, zziz0);
        }
        if(!z4) {
            zzja zzja0 = new zzja(this.zzI);
            this.zzl.zzd(14, zzja0);
        }
        if(v14 != 0) {
            zzjb zzjb0 = new zzjb(zzlg0);
            this.zzl.zzd(3, zzjb0);
        }
        if(v13 != 0 || z5) {
            zzjc zzjc0 = new zzjc(zzlg0);
            this.zzl.zzd(-1, zzjc0);
        }
        if(v13 != 0) {
            zzjd zzjd0 = new zzjd(zzlg0);
            this.zzl.zzd(4, zzjd0);
        }
        if(z5) {
            zzjm zzjm0 = new zzjm(zzlg0, v1);
            this.zzl.zzd(5, zzjm0);
        }
        if(zzlg1.zzm != zzlg0.zzm) {
            zzjn zzjn0 = new zzjn(zzlg0);
            this.zzl.zzd(6, zzjn0);
        }
        if(zzlg1.zzk() != zzlg0.zzk()) {
            zzjo zzjo0 = new zzjo(zzlg0);
            this.zzl.zzd(7, zzjo0);
        }
        if(!zzlg1.zzn.equals(zzlg0.zzn)) {
            zzjp zzjp0 = new zzjp(zzlg0);
            this.zzl.zzd(12, zzjp0);
        }
        zzcl zzcl0 = this.zzH;
        zzcp zzcp0 = this.zzg;
        zzcl zzcl1 = this.zzc;
        boolean z6 = zzcp0.zzx();
        zzcw zzcw3 = ((zzm)zzcp0).zzn();
        if(zzcw3.zzo()) {
            zzcl2 = zzcl0;
            z7 = false;
        }
        else {
            zzcl2 = zzcl0;
            z7 = zzcw3.zze(((zzm)zzcp0).zzd(), ((zzm)zzcp0).zza, 0L).zzi;
        }
        zzcw zzcw4 = ((zzm)zzcp0).zzn();
        if(zzcw4.zzo()) {
            z8 = false;
        }
        else {
            int v22 = ((zzm)zzcp0).zzd();
            ((zzm)zzcp0).zzh();
            ((zzm)zzcp0).zzw();
            z8 = zzcw4.zzk(v22, 0, false) != -1;
        }
        zzcw zzcw5 = ((zzm)zzcp0).zzn();
        if(zzcw5.zzo()) {
            z9 = false;
        }
        else {
            int v23 = ((zzm)zzcp0).zzd();
            ((zzm)zzcp0).zzh();
            ((zzm)zzcp0).zzw();
            z9 = zzcw5.zzj(v23, 0, false) == -1 ? false : true;
        }
        zzcw zzcw6 = ((zzm)zzcp0).zzn();
        boolean z10 = !zzcw6.zzo() && zzcw6.zze(((zzm)zzcp0).zzd(), ((zzm)zzcp0).zza, 0L).zzb();
        zzcw zzcw7 = ((zzm)zzcp0).zzn();
        boolean z11 = !zzcw7.zzo() && zzcw7.zze(((zzm)zzcp0).zzd(), ((zzm)zzcp0).zza, 0L).zzj;
        boolean z12 = zzcp0.zzn().zzo();
        zzcj zzcj0 = new zzcj();
        zzcj0.zzb(zzcl1);
        zzcj0.zzd(4, !z6);
        zzcj0.zzd(5, z7 && !z6);
        zzcj0.zzd(6, z8 && !z6);
        if(z12 || !z8 && z10 && !z7) {
            z13 = false;
        }
        else if(!z6) {
            z13 = true;
        }
        else {
            z13 = false;
        }
        zzcj0.zzd(7, z13);
        zzcj0.zzd(8, z9 && !z6);
        if(z12 || !z9 && (!z10 || !z11)) {
            z14 = false;
        }
        else if(!z6) {
            z14 = true;
        }
        else {
            z14 = false;
        }
        zzcj0.zzd(9, z14);
        zzcj0.zzd(10, !z6);
        zzcj0.zzd(11, z7 && !z6);
        zzcj0.zzd(12, z7 && !z6);
        zzcl zzcl3 = zzcj0.zze();
        this.zzH = zzcl3;
        if(!zzcl3.equals(zzcl2)) {
            zzje zzje0 = (zzcm zzcm0) -> zzcm0.zza(this.zzH);
            this.zzl.zzd(13, zzje0);
        }
        this.zzl.zzc();
        if(zzlg1.zzo != zzlg0.zzo) {
            for(Object object5: this.zzm) {
                ((zzim)object5).zza(zzlg0.zzo);
            }
        }
    }

    private final void zzan() {
        switch(this.zzf()) {
            case 2: 
            case 3: {
                this.zzao();
                this.zzv();
                this.zzv();
            }
        }
    }

    private final void zzao() {
        this.zze.zzb();
        if(Thread.currentThread() != this.zzs.getThread()) {
            Object[] arr_object = {"jeb-dexdec-sb-st-20151", this.zzs.getThread().getName()};
            String s = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: \'%s\'\nExpected thread: \'%s\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", arr_object);
            if(this.zzY) {
                throw new IllegalStateException(s);
            }
            zzes.zzg("ExoPlayerImpl", s, (this.zzZ ? null : new IllegalStateException()));
            this.zzZ = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final int zzb() {
        this.zzao();
        return this.zzx() ? this.zzad.zzb.zzb : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final int zzc() {
        this.zzao();
        return this.zzx() ? this.zzad.zzb.zzc : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final int zzd() {
        this.zzao();
        int v = this.zzX(this.zzad);
        return v == -1 ? 0 : v;
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final int zze() {
        this.zzao();
        return this.zzad.zza.zzo() ? 0 : this.zzad.zza.zza(this.zzad.zzb.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final int zzf() {
        this.zzao();
        return this.zzad.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final int zzg() {
        this.zzao();
        return this.zzad.zzm;
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final int zzh() {
        this.zzao();
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final long zzi() {
        this.zzao();
        if(this.zzx()) {
            return this.zzad.zzk.equals(this.zzad.zzb) ? zzfk.zzr(this.zzad.zzp) : this.zzl();
        }
        this.zzao();
        if(this.zzad.zza.zzo()) {
            return this.zzaf;
        }
        zzlg zzlg0 = this.zzad;
        long v = 0L;
        if(Long.compare(zzlg0.zzk.zzd, zzlg0.zzb.zzd) != 0) {
            int v1 = this.zzd();
            return zzfk.zzr(zzlg0.zza.zze(v1, this.zza, 0L).zzo);
        }
        long v2 = zzlg0.zzp;
        if(this.zzad.zzk.zzb()) {
            this.zzad.zza.zzn(this.zzad.zzk.zza, this.zzn).zzi(this.zzad.zzk.zzb);
        }
        else {
            v = v2;
        }
        this.zzac(this.zzad.zza, this.zzad.zzk, v);
        return zzfk.zzr(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final long zzj() {
        this.zzao();
        return this.zzZ(this.zzad);
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final long zzk() {
        this.zzao();
        return zzfk.zzr(this.zzaa(this.zzad));
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final long zzl() {
        this.zzao();
        if(!this.zzx()) {
            zzcw zzcw0 = this.zzn();
            return zzcw0.zzo() ? 0x8000000000000001L : zzfk.zzr(zzcw0.zze(this.zzd(), this.zza, 0L).zzo);
        }
        zzts zzts0 = this.zzad.zzb;
        this.zzad.zza.zzn(zzts0.zza, this.zzn);
        return zzfk.zzr(this.zzn.zzh(zzts0.zzb, zzts0.zzc));
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final long zzm() {
        this.zzao();
        return zzfk.zzr(this.zzad.zzq);
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final zzcw zzn() {
        this.zzao();
        return this.zzad.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final zzdh zzo() {
        this.zzao();
        return this.zzad.zzi.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final void zzp() {
        this.zzao();
        boolean z = this.zzv();
        int v = 2;
        int v1 = this.zzy.zzb(z, 2);
        this.zzal(z, v1, zzkb.zzY(z, v1));
        zzlg zzlg0 = this.zzad;
        if(zzlg0.zze != 1) {
            return;
        }
        zzlg zzlg1 = zzlg0.zzf(null);
        if(zzlg1.zza.zzo()) {
            v = 4;
        }
        zzlg zzlg2 = zzlg1.zzg(v);
        ++this.zzC;
        this.zzk.zzk();
        this.zzam(zzlg2, 1, 1, false, 5, 0x8000000000000001L, -1, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final void zzq() {
        zzes.zze("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.1.0] [" + zzfk.zze + "] [" + "media3.common" + "]");
        this.zzao();
        if(zzfk.zza < 21) {
            AudioTrack audioTrack0 = this.zzM;
            if(audioTrack0 != null) {
                audioTrack0.release();
                this.zzM = null;
            }
        }
        this.zzy.zzd();
        if(!this.zzk.zzp()) {
            this.zzl.zzd(10, (zzji this) -> ((zzcm)object0).zzj(zzil.zzd(new zzkm(1), 1003)));
            this.zzl.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzt.zzf(this.zzr);
        zzlg zzlg0 = this.zzad;
        if(zzlg0.zzo) {
            this.zzad = zzlg0.zzb();
        }
        zzlg zzlg1 = this.zzad.zzg(1);
        this.zzad = zzlg1;
        zzlg zzlg2 = zzlg1.zzc(zzlg1.zzb);
        this.zzad = zzlg2;
        zzlg2.zzp = zzlg2.zzr;
        this.zzad.zzq = 0L;
        this.zzr.zzN();
        this.zzi.zzi();
        Surface surface0 = this.zzO;
        if(surface0 != null) {
            surface0.release();
            this.zzO = null;
        }
        this.zzX = zzdx.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final void zzr(boolean z) {
        this.zzao();
        int v = this.zzf();
        int v1 = this.zzy.zzb(z, v);
        this.zzal(z, v1, zzkb.zzY(z, v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final void zzs(Surface surface0) {
        this.zzao();
        this.zzaj(surface0);
        int v = surface0 == null ? 0 : -1;
        this.zzag(v, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final void zzt(float f) {
        this.zzao();
        float f1 = Math.max(0.0f, Math.min(f, 1.0f));
        if(this.zzV == f1) {
            return;
        }
        this.zzV = f1;
        this.zzai();
        zzjk zzjk0 = new zzjk(f1);
        this.zzl.zzd(22, zzjk0);
        this.zzl.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final void zzu() {
        this.zzao();
        boolean z = this.zzv();
        this.zzy.zzb(z, 1);
        this.zzak(null);
        this.zzX = new zzdx(zzfud.zzl(), this.zzad.zzr);
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final boolean zzv() {
        this.zzao();
        return this.zzad.zzl;
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final boolean zzw() {
        this.zzao();
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final boolean zzx() {
        this.zzao();
        return this.zzad.zzb.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zziw
    public final int zzy() {
        this.zzao();
        return 2;
    }

    @Override  // com.google.android.gms.internal.ads.zziw
    public final void zzz(zzma zzma0) {
        this.zzr.zzt(zzma0);
    }
}

