package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzyz extends zzsa {
    private long zzA;
    private long zzB;
    private int zzC;
    private long zzD;
    private zzdn zzE;
    private zzdn zzF;
    private int zzG;
    private zzzd zzH;
    private static final int[] zzb;
    private static boolean zzc;
    private static boolean zzd;
    private final Context zze;
    private final zzzk zzf;
    private final zzzv zzg;
    private final zzyy zzh;
    private final boolean zzi;
    private zzyr zzj;
    private boolean zzk;
    private boolean zzl;
    private Surface zzm;
    private zzzc zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    static {
        zzyz.zzb = new int[]{0x780, 1600, 0x5A0, 0x500, 960, 854, 640, 540, 480};
    }

    public zzyz(Context context0, zzrs zzrs0, zzsc zzsc0, long v, boolean z, Handler handler0, zzzw zzzw0, int v1, float f) {
        zzyu zzyu0 = new zzyu(null);
        super(2, zzrs0, zzsc0, false, 30.0f);
        Context context1 = context0.getApplicationContext();
        this.zze = context1;
        zzzk zzzk0 = new zzzk(context1);
        this.zzf = zzzk0;
        this.zzg = new zzzv(handler0, zzzw0);
        this.zzh = new zzyy(zzyu0, zzzk0, this);
        this.zzi = "NVIDIA".equals(zzfk.zzc);
        this.zzu = 0x8000000000000001L;
        this.zzp = 1;
        this.zzE = zzdn.zza;
        this.zzG = 0;
        this.zzF = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzic
    protected final void zzA() {
        this.zzw = 0;
        this.zzh();
        long v = SystemClock.elapsedRealtime();
        this.zzv = v;
        this.zzA = zzfk.zzp(v);
        this.zzB = 0L;
        this.zzC = 0;
        this.zzf.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzic
    protected final void zzB() {
        this.zzu = 0x8000000000000001L;
        if(this.zzw > 0) {
            this.zzh();
            long v = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzw, v - this.zzv);
            this.zzw = 0;
            this.zzv = v;
        }
        int v1 = this.zzC;
        if(v1 != 0) {
            this.zzg.zzr(this.zzB, v1);
            this.zzB = 0L;
            this.zzC = 0;
        }
        this.zzf.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    public final void zzJ(float f, float f1) {
        super.zzJ(f, f1);
        this.zzf.zze(f);
    }

    @Override  // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlp
    public final String zzQ() {
        return "MediaCodecVideoRenderer";
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    public final boolean zzT() {
        if(super.zzT() && (this.zzq || (this.zzn != null && this.zzm == this.zzn || this.zzaq() == null))) {
            this.zzu = 0x8000000000000001L;
            return true;
        }
        if(Long.compare(this.zzu, 0x8000000000000001L) == 0) {
            return false;
        }
        this.zzh();
        if(SystemClock.elapsedRealtime() < this.zzu) {
            return true;
        }
        this.zzu = 0x8000000000000001L;
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final float zzV(float f, zzam zzam0, zzam[] arr_zzam) {
        float f1 = -1.0f;
        for(int v = 0; v < arr_zzam.length; ++v) {
            float f2 = arr_zzam[v].zzt;
            if(f2 != -1.0f) {
                f1 = Math.max(f1, f2);
            }
        }
        return f1 == -1.0f ? -1.0f : f1 * f;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final int zzW(zzsc zzsc0, zzam zzam0) {
        int v = 0;
        int v1 = 0x80;
        if(!zzcc.zzg(zzam0.zzm)) {
            return 0x80;
        }
        boolean z = zzam0.zzp != null;
        List list0 = zzyz.zzaO(this.zze, zzsc0, zzam0, z, false);
        if(z && list0.isEmpty()) {
            list0 = zzyz.zzaO(this.zze, zzsc0, zzam0, false, false);
        }
        if(list0.isEmpty()) {
            return 0x81;
        }
        if(!zzsa.zzaE(zzam0)) {
            return 130;
        }
        int v2 = 1;
        zzrw zzrw0 = (zzrw)list0.get(0);
        boolean z1 = zzrw0.zze(zzam0);
        if(!z1) {
            for(int v3 = 1; v3 < list0.size(); ++v3) {
                zzrw zzrw1 = (zzrw)list0.get(v3);
                if(zzrw1.zze(zzam0)) {
                    z1 = true;
                    v2 = 0;
                    zzrw0 = zzrw1;
                    break;
                }
            }
        }
        int v4 = zzrw0.zzf(zzam0) ? 16 : 8;
        int v5 = zzrw0.zzg ? 0x40 : 0;
        if(1 != v2) {
            v1 = 0;
        }
        if(zzfk.zza >= 26 && "video/dolby-vision".equals(zzam0.zzm) && !zzyq.zza(this.zze)) {
            v1 = 0x100;
        }
        if(z1) {
            List list1 = zzyz.zzaO(this.zze, zzsc0, zzam0, z, true);
            if(!list1.isEmpty()) {
                zzrw zzrw2 = (zzrw)zzsp.zzi(list1, zzam0).get(0);
                if(zzrw2.zze(zzam0) && zzrw2.zzf(zzam0)) {
                    v = 0x20;
                }
            }
        }
        return (z1 ? 4 : 3) | v4 | v | v5 | v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final zzie zzX(zzrw zzrw0, zzam zzam0, zzam zzam1) {
        zzie zzie0 = zzrw0.zzb(zzam0, zzam1);
        int v = zzam1.zzr <= this.zzj.zza && zzam1.zzs <= this.zzj.zzb ? zzie0.zze : zzie0.zze | 0x100;
        if(zzyz.zzaa(zzrw0, zzam1) > this.zzj.zzc) {
            v |= 0x40;
        }
        return v == 0 ? new zzie(zzrw0.zza, zzam0, zzam1, zzie0.zzd, 0) : new zzie(zzrw0.zza, zzam0, zzam1, 0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final zzie zzY(zzkn zzkn0) {
        zzie zzie0 = super.zzY(zzkn0);
        this.zzg.zzf(zzkn0.zza, zzie0);
        return zzie0;
    }

    public static int zzZ(zzrw zzrw0, zzam zzam0) {
        int v = zzam0.zzr;
        int v1 = zzam0.zzs;
        if(v != -1 && v1 != -1) {
            String s = zzam0.zzm;
            if("video/dolby-vision".equals(s)) {
                Pair pair0 = zzsp.zzb(zzam0);
                if(pair0 == null) {
                    s = "video/hevc";
                }
                else {
                    switch(((int)(((Integer)pair0.first)))) {
                        case 1: 
                        case 2: 
                        case 0x200: {
                            s = "video/avc";
                            break;
                        }
                        default: {
                            s = "video/hevc";
                        }
                    }
                }
            }
            switch(s) {
                case "video/3gpp": {
                    return v * v1 * 3 / 4;
                }
                case "video/av01": {
                    return v * v1 * 3 / 4;
                }
                case "video/avc": {
                    return "BRAVIA 4K 2015".equals(zzfk.zzd) || "Amazon".equals(zzfk.zzc) && ("KFSOWI".equals(zzfk.zzd) || "AFTS".equals(zzfk.zzd) && zzrw0.zzf) ? -1 : (v + 15) / 16 * ((v1 + 15) / 16) * 0x300 / 4;
                }
                case "video/hevc": {
                    return Math.max(0x200000, v * v1 * 3 / 4);
                }
                case "video/mp4v-es": {
                    return v * v1 * 3 / 4;
                }
                case "video/x-vnd.on2.vp8": {
                    return v * v1 * 3 / 4;
                }
                case "video/x-vnd.on2.vp9": {
                    return v * v1 * 3 / 8;
                }
                default: {
                    return -1;
                }
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final boolean zzaD(zzrw zzrw0) {
        return this.zzm != null || this.zzaU(zzrw0);
    }

    static zzil zzaF(zzyz zzyz0, Throwable throwable0, zzam zzam0, int v) {
        return zzyz0.zzi(throwable0, zzam0, false, 7000);
    }

    final void zzaG() {
        this.zzs = true;
        if(!this.zzq) {
            this.zzq = true;
            this.zzg.zzq(this.zzm);
            this.zzo = true;
        }
    }

    protected final void zzaH(zzrt zzrt0, int v, long v1) {
        Trace.beginSection("releaseOutputBuffer");
        zzrt0.zzn(v, true);
        Trace.endSection();
        ++this.zza.zze;
        this.zzx = 0;
        this.zzh();
        this.zzA = zzfk.zzp(SystemClock.elapsedRealtime());
        this.zzaP(this.zzE);
        this.zzaG();
    }

    protected final void zzaI(zzrt zzrt0, int v, long v1, long v2) {
        Trace.beginSection("releaseOutputBuffer");
        zzrt0.zzm(v, v2);
        Trace.endSection();
        ++this.zza.zze;
        this.zzx = 0;
        this.zzh();
        this.zzA = zzfk.zzp(SystemClock.elapsedRealtime());
        this.zzaP(this.zzE);
        this.zzaG();
    }

    protected final void zzaJ(zzrt zzrt0, int v, long v1) {
        Trace.beginSection("skipVideoBuffer");
        zzrt0.zzn(v, false);
        Trace.endSection();
        ++this.zza.zzf;
    }

    protected final void zzaK(int v, int v1) {
        this.zza.zzh += v;
        int v2 = v + v1;
        this.zza.zzg += v2;
        this.zzw += v2;
        int v3 = this.zzx + v2;
        this.zzx = v3;
        this.zza.zzi = Math.max(v3, this.zza.zzi);
    }

    protected final void zzaL(long v) {
        this.zza.zzk += v;
        ++this.zza.zzl;
        this.zzB += v;
        ++this.zzC;
    }

    static boolean zzaM() {
        return zzyz.zzaS();
    }

    // 去混淆评级： 中等(65)
    protected static final boolean zzaN(String s) {
        boolean z = false;
        if(s.startsWith("OMX.google")) {
            return false;
        }
        synchronized(zzyz.class) {
            if(!zzyz.zzc) {
                int v1 = zzfk.zza;
                if(v1 <= 28) {
                    switch(zzfk.zzb) {
                        case "aquaman": 
                        case "dangal": 
                        case "dangalFHD": 
                        case "dangalUHD": 
                        case "machuca": 
                        case "magnolia": 
                        case "once": 
                        case "oneday": {
                            z = true;
                            zzyz.zzd = z;
                            zzyz.zzc = true;
                            return zzyz.zzd;
                        }
                    }
                }
                else if(v1 > 27 || !"HWEML".equals(zzfk.zzb)) {
                    String s1 = zzfk.zzd;
                    switch(s1) {
                        case "AFTA": 
                        case "AFTEU011": 
                        case "AFTEU014": 
                        case "AFTEUFF014": 
                        case "AFTJMST12": 
                        case "AFTKMST12": 
                        case "AFTN": 
                        case "AFTR": 
                        case "AFTSO001": {
                            z = true;
                            zzyz.zzd = z;
                            zzyz.zzc = true;
                            return zzyz.zzd;
                        }
                        default: {
                            if(v1 <= 26) {
                                switch(zzfk.zzb) {
                                    case "1601": 
                                    case "1713": 
                                    case "1714": 
                                    case "601LV": 
                                    case "602LV": 
                                    case "A10-70F": 
                                    case "A10-70L": 
                                    case "A1601": 
                                    case "A2016a40": 
                                    case "A7000-a": 
                                    case "A7000plus": 
                                    case "A7010a48": 
                                    case "A7020a48": 
                                    case "ASUS_X00AD_2": 
                                    case "AquaPowerM": 
                                    case "Aura_Note_2": 
                                    case "BLACK-1X": 
                                    case "BRAVIA_ATV2": 
                                    case "BRAVIA_ATV3_4K": 
                                    case "C1": 
                                    case "CP8676_I02": 
                                    case "CPH1609": 
                                    case "CPH1715": 
                                    case "CPY83_I00": 
                                    case "ComioS1": 
                                    case "DM-01K": 
                                    case "E5643": 
                                    case "ELUGA_A3_Pro": 
                                    case "ELUGA_Note": 
                                    case "ELUGA_Prim": 
                                    case "ELUGA_Ray_X": 
                                    case "EverStar_S": 
                                    case "F01H": 
                                    case "F01J": 
                                    case "F02H": 
                                    case "F03H": 
                                    case "F04H": 
                                    case "F04J": 
                                    case "F3111": 
                                    case "F3113": 
                                    case "F3116": 
                                    case "F3211": 
                                    case "F3213": 
                                    case "F3215": 
                                    case "F3311": 
                                    case "GIONEE_GBL7360": 
                                    case "GIONEE_SWW1609": 
                                    case "GIONEE_SWW1627": 
                                    case "GIONEE_SWW1631": 
                                    case "GIONEE_WBL5708": 
                                    case "GIONEE_WBL7365": 
                                    case "GIONEE_WBL7519": 
                                    case "GiONEE_CBL7513": 
                                    case "GiONEE_GBL7319": 
                                    case "HWBLN-H": 
                                    case "HWCAM-H": 
                                    case "HWVNS-H": 
                                    case "HWWAS-H": 
                                    case "Infinix-X572": 
                                    case "JGZ": 
                                    case "K50a40": 
                                    case "LS-5017": 
                                    case "M04": 
                                    case "M5c": 
                                    case "MEIZU_M5": 
                                    case "MX6": 
                                    case "NX541J": 
                                    case "NX573J": 
                                    case "OnePlus5T": 
                                    case "P681": 
                                    case "P85": 
                                    case "PB2-670M": 
                                    case "PGN528": 
                                    case "PGN610": 
                                    case "PGN611": 
                                    case "PLE": 
                                    case "PRO7S": 
                                    case "Phantom6": 
                                    case "Pixi4-7_3G": 
                                    case "Pixi5-10_4G": 
                                    case "Q350": 
                                    case "Q4260": 
                                    case "Q427": 
                                    case "Q4310": 
                                    case "Q5": 
                                    case "QM16XE_U": 
                                    case "QX1": 
                                    case "RAIJIN": 
                                    case "SVP-DTV15": 
                                    case "Slate_Pro": 
                                    case "TB3-730F": 
                                    case "TB3-730X": 
                                    case "TB3-850F": 
                                    case "TB3-850M": 
                                    case "V1": 
                                    case "V23GB": 
                                    case "V5": 
                                    case "X3_HK": 
                                    case "XE2X": 
                                    case "XT1663": 
                                    case "Z12_PRO": 
                                    case "Z80": 
                                    case "b5": 
                                    case "cv1": 
                                    case "cv3": 
                                    case "deb": 
                                    case "flo": 
                                    case "fugu": 
                                    case "griffin": 
                                    case "htc_e56ml_dtul": 
                                    case "hwALE-H": 
                                    case "i9031": 
                                    case "iball8735_9806": 
                                    case "iris60": 
                                    case "itel_S41": 
                                    case "j2xlteins": 
                                    case "kate": 
                                    case "l5460": 
                                    case "le_x6": 
                                    case "manning": 
                                    case "marino_f": 
                                    case "mh": 
                                    case "mido": 
                                    case "namath": 
                                    case "nicklaus_f": 
                                    case "p212": 
                                    case "pacificrim": 
                                    case "panell_d": 
                                    case "panell_dl": 
                                    case "panell_ds": 
                                    case "panell_dt": 
                                    case "s905x018": 
                                    case "santoni": 
                                    case "taido_row": 
                                    case "tcl_eu": 
                                    case "vernee_M5": 
                                    case "watson": 
                                    case "whyred": 
                                    case "woods_f": 
                                    case "woods_fn": {
                                        z = true;
                                        zzyz.zzd = z;
                                        zzyz.zzc = true;
                                        return zzyz.zzd;
                                    }
                                    default: {
                                        if(s1.hashCode() == 0xDC901DE3 && s1.equals("JSN-L21")) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    z = true;
                }
                zzyz.zzd = z;
                zzyz.zzc = true;
            }
            return zzyz.zzd;
        }
    }

    private static List zzaO(Context context0, zzsc zzsc0, zzam zzam0, boolean z, boolean z1) {
        String s = zzam0.zzm;
        if(s == null) {
            return zzfud.zzl();
        }
        if(zzfk.zza >= 26 && "video/dolby-vision".equals(s) && !zzyq.zza(context0)) {
            List list0 = zzsp.zzf(zzsc0, zzam0, z, z1);
            return list0.isEmpty() ? zzsp.zzh(zzsc0, zzam0, z, z1) : list0;
        }
        return zzsp.zzh(zzsc0, zzam0, z, z1);
    }

    private final void zzaP(zzdn zzdn0) {
        if(!zzdn0.equals(zzdn.zza) && !zzdn0.equals(this.zzF)) {
            this.zzF = zzdn0;
            this.zzg.zzt(zzdn0);
        }
    }

    private final void zzaQ() {
        zzdn zzdn0 = this.zzF;
        if(zzdn0 != null) {
            this.zzg.zzt(zzdn0);
        }
    }

    private final void zzaR() {
        zzzc zzzc0 = this.zzn;
        if(this.zzm == zzzc0) {
            this.zzm = null;
        }
        zzzc0.release();
        this.zzn = null;
    }

    private static boolean zzaS() [...] // 潜在的解密器

    private static boolean zzaT(long v) {
        return v < -30000L;
    }

    // 去混淆评级： 低(30)
    private final boolean zzaU(zzrw zzrw0) {
        return zzfk.zza >= 23 && !zzyz.zzaN(zzrw0.zza) && (!zzrw0.zzf || zzzc.zzb(this.zze));
    }

    protected static int zzaa(zzrw zzrw0, zzam zzam0) {
        if(zzam0.zzn != -1) {
            int v = zzam0.zzo.size();
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                v2 += ((byte[])zzam0.zzo.get(v1)).length;
            }
            return zzam0.zzn + v2;
        }
        return zzyz.zzZ(zzrw0, zzam0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    @TargetApi(17)
    protected final zzrr zzab(zzrw zzrw0, zzam zzam0, MediaCrypto mediaCrypto0, float f) {
        Point point2;
        String s1;
        zzyr zzyr0;
        if(this.zzn != null && this.zzn.zza != zzrw0.zzf) {
            this.zzaR();
        }
        String s = zzrw0.zzc;
        zzam[] arr_zzam = this.zzP();
        int v = zzam0.zzr;
        int v1 = zzam0.zzs;
        int v2 = zzyz.zzaa(zzrw0, zzam0);
        if(arr_zzam.length == 1) {
            if(v2 != -1) {
                int v3 = zzyz.zzZ(zzrw0, zzam0);
                if(v3 != -1) {
                    v2 = Math.min(((int)(((float)v2) * 1.5f)), v3);
                }
            }
            zzyr0 = new zzyr(v, v1, v2);
            s1 = s;
        }
        else {
            int v5 = 0;
            for(int v4 = 0; v4 < arr_zzam.length; ++v4) {
                zzam zzam1 = arr_zzam[v4];
                if(zzam0.zzy != null && zzam1.zzy == null) {
                    zzak zzak0 = zzam1.zzb();
                    zzak0.zzy(zzam0.zzy);
                    zzam1 = zzak0.zzY();
                }
                if(zzrw0.zzb(zzam0, zzam1).zzd != 0) {
                    v5 |= (zzam1.zzr != -1 && zzam1.zzs != -1 ? 0 : 1);
                    v = Math.max(v, zzam1.zzr);
                    v1 = Math.max(v1, zzam1.zzs);
                    v2 = Math.max(v2, zzyz.zzaa(zzrw0, zzam1));
                }
            }
            if(v5 == 0) {
                s1 = s;
            }
            else {
                zzes.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + v + "x" + v1);
                int v6 = zzam0.zzs;
                int v7 = zzam0.zzr;
                int v8 = v6 <= v7 ? 0 : 1;
                int v9 = v8 == 0 ? v7 : v6;
                if(1 == v8) {
                    v6 = v7;
                }
                int[] arr_v = zzyz.zzb;
                int v10 = 0;
                while(true) {
                    if(v10 >= 9) {
                        s1 = s;
                        break;
                    }
                    s1 = s;
                    int v11 = arr_v[v10];
                    if(v11 <= v9) {
                        break;
                    }
                    int v12 = (int)(((float)v11) * (((float)v6) / ((float)v9)));
                    if(v12 <= v6) {
                        break;
                    }
                    if(zzfk.zza >= 21) {
                        int v13 = 1 == v8 ? v12 : v11;
                        if(1 != v8) {
                            v11 = v12;
                        }
                        Point point0 = zzrw0.zza(v13, v11);
                        Point point1 = point0;
                        if(zzrw0.zzg(point0.x, point0.y, ((double)zzam0.zzt))) {
                            point2 = point1;
                            goto label_68;
                        }
                    }
                    else {
                        try {
                            int v14 = (v11 + 15) / 16 * 16;
                            int v15 = (v12 + 15) / 16 * 16;
                            if(v14 * v15 <= zzsp.zza()) {
                                int v16 = 1 == v8 ? v15 : v14;
                                if(1 != v8) {
                                    v14 = v15;
                                }
                                point2 = new Point(v16, v14);
                                goto label_68;
                            }
                            ++v10;
                            s = s1;
                            continue;
                        }
                        catch(zzsj unused_ex) {
                        }
                        break;
                    }
                    ++v10;
                    s = s1;
                }
                point2 = null;
            label_68:
                if(point2 != null) {
                    v = Math.max(v, point2.x);
                    v1 = Math.max(v1, point2.y);
                    zzak zzak1 = zzam0.zzb();
                    zzak1.zzX(v);
                    zzak1.zzF(v1);
                    v2 = Math.max(v2, zzyz.zzZ(zzrw0, zzak1.zzY()));
                    zzes.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + v + "x" + v1);
                }
            }
            zzyr0 = new zzyr(v, v1, v2);
        }
        this.zzj = zzyr0;
        boolean z = this.zzi;
        MediaFormat mediaFormat0 = new MediaFormat();
        mediaFormat0.setString("mime", s1);
        mediaFormat0.setInteger("width", zzam0.zzr);
        mediaFormat0.setInteger("height", zzam0.zzs);
        zzeu.zzb(mediaFormat0, zzam0.zzo);
        float f1 = zzam0.zzt;
        if(f1 != -1.0f) {
            mediaFormat0.setFloat("frame-rate", f1);
        }
        zzeu.zza(mediaFormat0, "rotation-degrees", zzam0.zzu);
        zzs zzs0 = zzam0.zzy;
        if(zzs0 != null) {
            zzeu.zza(mediaFormat0, "color-transfer", zzs0.zzf);
            zzeu.zza(mediaFormat0, "color-standard", zzs0.zzd);
            zzeu.zza(mediaFormat0, "color-range", zzs0.zze);
            byte[] arr_b = zzs0.zzg;
            if(arr_b != null) {
                mediaFormat0.setByteBuffer("hdr-static-info", ByteBuffer.wrap(arr_b));
            }
        }
        if("video/dolby-vision".equals(zzam0.zzm)) {
            Pair pair0 = zzsp.zzb(zzam0);
            if(pair0 != null) {
                zzeu.zza(mediaFormat0, "profile", ((int)(((Integer)pair0.first))));
            }
        }
        mediaFormat0.setInteger("max-width", zzyr0.zza);
        mediaFormat0.setInteger("max-height", zzyr0.zzb);
        zzeu.zza(mediaFormat0, "max-input-size", zzyr0.zzc);
        if(zzfk.zza >= 23) {
            mediaFormat0.setInteger("priority", 0);
            if(f != -1.0f) {
                mediaFormat0.setFloat("operating-rate", f);
            }
        }
        if(z) {
            mediaFormat0.setInteger("no-post-process", 1);
            mediaFormat0.setInteger("auto-frc", 0);
        }
        if(this.zzm == null) {
            if(!this.zzaU(zzrw0)) {
                throw new IllegalStateException();
            }
            if(this.zzn == null) {
                this.zzn = zzzc.zza(this.zze, zzrw0.zzf);
            }
            this.zzm = this.zzn;
            return zzrr.zzb(zzrw0, mediaFormat0, zzam0, this.zzm, null);
        }
        return zzrr.zzb(zzrw0, mediaFormat0, zzam0, this.zzm, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final List zzac(zzsc zzsc0, zzam zzam0, boolean z) {
        return zzsp.zzi(zzyz.zzaO(this.zze, zzsc0, zzam0, false, false), zzam0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzad(Exception exception0) {
        zzes.zzd("MediaCodecVideoRenderer", "Video codec error", exception0);
        this.zzg.zzs(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzae(String s, zzrr zzrr0, long v, long v1) {
        this.zzg.zza(s, v, v1);
        this.zzk = zzyz.zzaN(s);
        zzrw zzrw0 = this.zzas();
        zzrw0.getClass();
        boolean z = false;
        if(zzfk.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzrw0.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] arr_mediaCodecInfo$CodecProfileLevel = zzrw0.zzh();
            for(int v2 = 0; v2 < arr_mediaCodecInfo$CodecProfileLevel.length; ++v2) {
                if(arr_mediaCodecInfo$CodecProfileLevel[v2].profile == 0x4000) {
                    z = true;
                    break;
                }
            }
        }
        this.zzl = z;
        this.zzh.zza(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzaf(String s) {
        this.zzg.zzb(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzag(zzam zzam0, MediaFormat mediaFormat0) {
        zzrt zzrt0 = this.zzaq();
        if(zzrt0 != null) {
            zzrt0.zzq(this.zzp);
        }
        mediaFormat0.getClass();
        boolean z = mediaFormat0.containsKey("crop-right") && mediaFormat0.containsKey("crop-left") && mediaFormat0.containsKey("crop-bottom") && mediaFormat0.containsKey("crop-top");
        int v = z ? mediaFormat0.getInteger("crop-right") - mediaFormat0.getInteger("crop-left") + 1 : mediaFormat0.getInteger("width");
        int v1 = z ? mediaFormat0.getInteger("crop-bottom") - mediaFormat0.getInteger("crop-top") + 1 : mediaFormat0.getInteger("height");
        float f = zzam0.zzv;
        if(zzam0.zzu == 90 || zzam0.zzu == 270) {
            f = 1.0f / f;
            int v2 = v1;
            v1 = v;
            v = v2;
        }
        this.zzE = new zzdn(v, v1, 0, f);
        this.zzf.zzc(zzam0.zzt);
    }

    static Context zzah(zzyz zzyz0) {
        return zzyz0.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzai(long v) {
        super.zzai(v);
        --this.zzy;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzaj() {
        this.zzq = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzak(zzht zzht0) {
        ++this.zzy;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final boolean zzam(long v, long v1, zzrt zzrt0, ByteBuffer byteBuffer0, int v2, int v3, int v4, long v5, boolean z, boolean z1, zzam zzam0) {
        boolean z3;
        zzrt0.getClass();
        if(this.zzt == 0x8000000000000001L) {
            this.zzt = v;
        }
        if(v5 != this.zzz) {
            this.zzf.zzd(v5);
            this.zzz = v5;
        }
        long v6 = v5 - this.zzap();
        if(z && !z1) {
            this.zzaJ(zzrt0, v2, v6);
            return true;
        }
        int v7 = this.zzbc();
        this.zzh();
        long v8 = zzfk.zzp(SystemClock.elapsedRealtime());
        long v9 = (long)(((double)(v5 - v)) / ((double)this.zzao()));
        if(v7 == 2) {
            v9 -= v8 - v1;
        }
        if(this.zzm == this.zzn) {
            if(zzyz.zzaT(v9)) {
                this.zzaJ(zzrt0, v2, v6);
                this.zzaL(v9);
                return true;
            }
            return false;
        }
        boolean z2 = this.zzbc() == 2;
        if(this.zzs) {
            z3 = !this.zzq;
        }
        else if(z2 || this.zzr) {
            z3 = true;
        }
        else {
            z3 = false;
        }
        this.zzh();
        long v10 = zzfk.zzp(SystemClock.elapsedRealtime()) - this.zzA;
        if(Long.compare(this.zzu, 0x8000000000000001L) == 0 && v >= this.zzap() && (z3 || z2 && zzyz.zzaT(v9) && v10 > 100000L)) {
            this.zzh();
            long v11 = System.nanoTime();
            if(zzfk.zza >= 21) {
                this.zzaI(zzrt0, v2, v6, v11);
            }
            else {
                this.zzaH(zzrt0, v2, v6);
            }
            this.zzaL(v9);
            return true;
        }
        if(v7 != 2 || v == this.zzt) {
            return false;
        }
        this.zzh();
        long v12 = System.nanoTime();
        long v13 = this.zzf.zza(v9 * 1000L + v12);
        long v14 = this.zzu;
        long v15 = (v13 - v12) / 1000L;
        if(v15 < -500000L && !z1) {
            int v16 = this.zzd(v);
            if(v16 != 0) {
                if(v14 == 0x8000000000000001L) {
                    ++this.zza.zzj;
                    this.zzaK(v16, this.zzy);
                }
                else {
                    this.zza.zzd += v16;
                    this.zza.zzf += this.zzy;
                }
                this.zzaz();
                return false;
            }
        }
        if(zzyz.zzaT(v15) && !z1) {
            if(v14 == 0x8000000000000001L) {
                Trace.beginSection("dropVideoBuffer");
                zzrt0.zzn(v2, false);
                Trace.endSection();
                this.zzaK(0, 1);
            }
            else {
                this.zzaJ(zzrt0, v2, v6);
            }
            this.zzaL(v15);
            return true;
        }
        if(zzfk.zza >= 21) {
            if(v15 < 50000L) {
                if(v13 == this.zzD) {
                    this.zzaJ(zzrt0, v2, v6);
                }
                else {
                    this.zzaI(zzrt0, v2, v6, v13);
                }
                this.zzaL(v15);
                this.zzD = v13;
                return true;
            }
        }
        else if(v15 < 30000L) {
            if(v15 > 11000L) {
                try {
                    Thread.sleep((v15 - 10000L) / 1000L);
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            this.zzaH(zzrt0, v2, v6);
            this.zzaL(v15);
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final zzru zzar(Throwable throwable0, zzrw zzrw0) {
        return new zzyp(throwable0, zzrw0, this.zzm);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    @TargetApi(29)
    protected final void zzat(zzht zzht0) {
        if(!this.zzl) {
            return;
        }
        ByteBuffer byteBuffer0 = zzht0.zze;
        byteBuffer0.getClass();
        if(byteBuffer0.remaining() >= 7) {
            int v = byteBuffer0.get();
            int v1 = byteBuffer0.getShort();
            int v2 = byteBuffer0.getShort();
            int v3 = byteBuffer0.get();
            int v4 = byteBuffer0.get();
            byteBuffer0.position(0);
            if(v == -75 && v1 == 60 && v2 == 1 && v3 == 4 && (v4 == 0 || v4 == 1)) {
                byte[] arr_b = new byte[byteBuffer0.remaining()];
                byteBuffer0.get(arr_b);
                byteBuffer0.position(0);
                Bundle bundle0 = new Bundle();
                bundle0.putByteArray("hdr10-plus-info", arr_b);
                this.zzaq().zzp(bundle0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzav(zzam zzam0) {
        zzdz zzdz0 = this.zzh();
        this.zzh.zzd(zzam0, this.zzap(), zzdz0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzax() {
        super.zzax();
        this.zzy = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzic
    public final void zzs() {
        this.zzr = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzic
    public final void zzt(int v, Object object0) {
        switch(v) {
            case 1: {
                Surface surface1 = object0 instanceof Surface ? ((Surface)object0) : null;
                if(surface1 == null) {
                    zzzc zzzc0 = this.zzn;
                    if(zzzc0 == null) {
                        zzrw zzrw0 = this.zzas();
                        if(zzrw0 != null && this.zzaU(zzrw0)) {
                            surface1 = zzzc.zza(this.zze, zzrw0.zzf);
                            this.zzn = surface1;
                        }
                    }
                    else {
                        surface1 = zzzc0;
                    }
                }
                if(this.zzm != surface1) {
                    this.zzm = surface1;
                    this.zzf.zzi(surface1);
                    this.zzo = false;
                    int v3 = this.zzbc();
                    zzrt zzrt1 = this.zzaq();
                    if(zzrt1 != null) {
                        if(zzfk.zza < 23 || surface1 == null || this.zzk) {
                            this.zzaw();
                            this.zzau();
                        }
                        else {
                            zzrt1.zzo(surface1);
                        }
                    }
                    if(surface1 == null || surface1 == this.zzn) {
                        this.zzF = null;
                        this.zzq = false;
                        return;
                    }
                    this.zzaQ();
                    this.zzq = false;
                    if(v3 == 2) {
                        this.zzu = 0x8000000000000001L;
                        return;
                    }
                }
                else if(surface1 != null && surface1 != this.zzn) {
                    this.zzaQ();
                    if(this.zzo) {
                        this.zzg.zzq(this.zzm);
                    }
                }
                break;
            }
            case 4: {
                int v1 = (int)(((Integer)object0));
                this.zzp = v1;
                zzrt zzrt0 = this.zzaq();
                if(zzrt0 != null) {
                    zzrt0.zzq(v1);
                    return;
                }
                break;
            }
            case 5: {
                this.zzf.zzj(((int)(((Integer)object0))));
                return;
            }
            case 7: {
                this.zzH = (zzzd)object0;
                return;
            }
            case 10: {
                int v2 = (int)(((Integer)object0));
                if(this.zzG != v2) {
                    this.zzG = v2;
                    return;
                }
                break;
            }
            case 13: {
                object0.getClass();
                this.zzh.zzc(((List)object0));
                return;
            }
            case 14: {
                object0.getClass();
                if(((zzfc)object0).zzb() != 0 && ((zzfc)object0).zza() != 0) {
                    Surface surface0 = this.zzm;
                    if(surface0 != null) {
                        this.zzh.zzb(surface0, ((zzfc)object0));
                        return;
                    }
                }
                break;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzw() {
        try {
            this.zzF = null;
            this.zzq = false;
            this.zzo = false;
            super.zzw();
        }
        finally {
            this.zzg.zzc(this.zza);
            this.zzg.zzt(zzdn.zza);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzx(boolean z, boolean z1) {
        super.zzx(z, z1);
        this.zzm();
        this.zzg.zze(this.zza);
        this.zzr = z1;
        this.zzs = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzy(long v, boolean z) {
        super.zzy(v, z);
        this.zzq = false;
        this.zzf.zzf();
        this.zzz = 0x8000000000000001L;
        this.zzt = 0x8000000000000001L;
        this.zzx = 0;
        this.zzu = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    @TargetApi(17)
    protected final void zzz() {
        try {
            super.zzz();
        }
        catch(Throwable throwable0) {
            if(this.zzn != null) {
                this.zzaR();
            }
            throw throwable0;
        }
        if(this.zzn != null) {
            this.zzaR();
        }
    }
}

