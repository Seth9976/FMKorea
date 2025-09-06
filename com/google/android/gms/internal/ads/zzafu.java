package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public final class zzafu implements zzabb {
    private long zzA;
    private zzaft zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzet zzJ;
    private zzet zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    public static final zzabi zza;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzabe zzai;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private final zzafp zzh;
    private final zzafw zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzfb zzl;
    private final zzfb zzm;
    private final zzfb zzn;
    private final zzfb zzo;
    private final zzfb zzp;
    private final zzfb zzq;
    private final zzfb zzr;
    private final zzfb zzs;
    private final zzfb zzt;
    private final zzfb zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        zzafu.zza = (Uri uri0, Map map0) -> new zzabb[]{new zzafu(0)};
        zzafu.zzb = new byte[]{49, 10, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44, 0x30, 0x30, 0x30, 0x20, 45, 45, 62, 0x20, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44, 0x30, 0x30, 0x30, 10};
        zzafu.zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zzfqu.zzc);
        zzafu.zzd = new byte[]{68, 105, 97, 108, 0x6F, 103, 0x75, 101, 58, 0x20, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44};
        zzafu.zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 46, 0x30, 0x30, 0x30, 0x20, 45, 45, 62, 0x20, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 46, 0x30, 0x30, 0x30, 10};
        zzafu.zzf = new UUID(0x100000000001000L, 0x800000AA00389B71L);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("htc_video_rotA-000", 0);
        hashMap0.put("htc_video_rotA-090", 90);
        hashMap0.put("htc_video_rotA-180", 180);
        hashMap0.put("htc_video_rotA-270", 270);
        zzafu.zzg = Collections.unmodifiableMap(hashMap0);
    }

    public zzafu() {
        this(0);
    }

    public zzafu(int v) {
        zzafn zzafn0 = new zzafn();
        super();
        this.zzx = -1L;
        this.zzy = 0x8000000000000001L;
        this.zzz = 0x8000000000000001L;
        this.zzA = 0x8000000000000001L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = 0x8000000000000001L;
        this.zzh = zzafn0;
        zzafn0.zza(new zzafs(this, null));
        this.zzk = true;
        this.zzi = new zzafw();
        this.zzj = new SparseArray();
        this.zzn = new zzfb(4);
        this.zzo = new zzfb(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzfb(4);
        this.zzl = new zzfb(zzfy.zza);
        this.zzm = new zzfb(4);
        this.zzq = new zzfb();
        this.zzr = new zzfb();
        this.zzs = new zzfb(8);
        this.zzt = new zzfb();
        this.zzu = new zzfb();
        this.zzS = new int[1];
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        this.zzM = false;
        while(this.zzh.zzc(zzabc0)) {
            long v1 = zzabc0.zzf();
            if(this.zzF) {
                this.zzH = v1;
                zzabx0.zza = this.zzG;
                this.zzF = false;
                return 1;
            }
            if(this.zzC) {
                long v2 = this.zzH;
                if(v2 != -1L) {
                    zzabx0.zza = v2;
                    this.zzH = -1L;
                    return 1;
                }
                if(false) {
                    break;
                }
            }
        }
        for(int v = 0; v < this.zzj.size(); ++v) {
            zzaft zzaft0 = (zzaft)this.zzj.valueAt(v);
            zzaft.zzd(zzaft0);
            zzacf zzacf0 = zzaft0.zzS;
            if(zzacf0 != null) {
                zzacf0.zza(zzaft0.zzV, zzaft0.zzi);
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabe0) {
        this.zzai = zzabe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long v, long v1) {
        this.zzI = 0x8000000000000001L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        this.zzu();
        for(int v2 = 0; v2 < this.zzj.size(); ++v2) {
            zzacf zzacf0 = ((zzaft)this.zzj.valueAt(v2)).zzS;
            if(zzacf0 != null) {
                zzacf0.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabc0) {
        return new zzafv().zza(zzabc0);
    }

    static UUID zzf() {
        return zzafu.zzf;
    }

    protected final void zzg(int v, int v1, zzabc zzabc0) {
        int v22;
        int v20;
        long v18;
        int v14;
        int v10;
        int v8;
        int v2 = v;
        if(v2 != 0xA1 && v2 != 0xA3) {
            switch(v2) {
                case 0xA5: {
                    if(this.zzN != 2) {
                        return;
                    }
                    zzaft zzaft5 = (zzaft)this.zzj.get(this.zzT);
                    if(this.zzW == 4 && "V_VP9".equals(zzaft5.zzb)) {
                        this.zzu.zzD(v1);
                        ((zzaar)zzabc0).zzn(this.zzu.zzI(), 0, v1, false);
                        return;
                    }
                    ((zzaar)zzabc0).zzo(v1, false);
                    return;
                }
                case 0x41ED: {
                    this.zzr(v);
                    zzaft zzaft4 = this.zzB;
                    if(zzaft4.zzX != 1685480259 && zzaft4.zzX != 0x64767643) {
                        ((zzaar)zzabc0).zzo(v1, false);
                        return;
                    }
                    byte[] arr_b4 = new byte[v1];
                    zzaft4.zzM = arr_b4;
                    ((zzaar)zzabc0).zzn(arr_b4, 0, v1, false);
                    return;
                }
                case 0x4255: {
                    this.zzr(v);
                    zzaft zzaft3 = this.zzB;
                    byte[] arr_b3 = new byte[v1];
                    zzaft3.zzh = arr_b3;
                    ((zzaar)zzabc0).zzn(arr_b3, 0, v1, false);
                    return;
                }
                case 18402: {
                    byte[] arr_b2 = new byte[v1];
                    ((zzaar)zzabc0).zzn(arr_b2, 0, v1, false);
                    this.zzr(v);
                    zzaft zzaft2 = this.zzB;
                    zzaft2.zzi = new zzacd(1, arr_b2, 0, 0);
                    return;
                }
                case 0x53AB: {
                    Arrays.fill(this.zzp.zzI(), 0);
                    ((zzaar)zzabc0).zzn(this.zzp.zzI(), 4 - v1, v1, false);
                    this.zzp.zzG(0);
                    this.zzD = (int)this.zzp.zzt();
                    return;
                }
                case 25506: {
                    this.zzr(v);
                    zzaft zzaft1 = this.zzB;
                    byte[] arr_b1 = new byte[v1];
                    zzaft1.zzj = arr_b1;
                    ((zzaar)zzabc0).zzn(arr_b1, 0, v1, false);
                    return;
                }
                case 30322: {
                    this.zzr(v);
                    zzaft zzaft0 = this.zzB;
                    byte[] arr_b = new byte[v1];
                    zzaft0.zzu = arr_b;
                    ((zzaar)zzabc0).zzn(arr_b, 0, v1, false);
                    return;
                }
                default: {
                    throw zzcd.zza(("Unexpected id: " + v2), null);
                }
            }
        }
        if(this.zzN == 0) {
            this.zzT = (int)this.zzi.zzd(zzabc0, false, true, 8);
            this.zzU = this.zzi.zza();
            this.zzP = 0x8000000000000001L;
            this.zzN = 1;
            this.zzn.zzD(0);
        }
        Object object0 = this.zzj.get(this.zzT);
        if(((zzaft)object0) == null) {
            ((zzaar)zzabc0).zzo(v1 - this.zzU, false);
            this.zzN = 0;
            return;
        }
        zzaft.zzd(((zzaft)object0));
        if(this.zzN == 1) {
            this.zzt(zzabc0, 3);
            int v3 = (this.zzn.zzI()[2] & 6) >> 1;
            if(v3 == 0) {
                this.zzR = 1;
                int[] arr_v = zzafu.zzx(this.zzS, 1);
                this.zzS = arr_v;
                arr_v[0] = v1 - this.zzU - 3;
                goto label_142;
            }
            else {
                this.zzt(zzabc0, 4);
                int v4 = (this.zzn.zzI()[3] & 0xFF) + 1;
                this.zzR = v4;
                int[] arr_v1 = zzafu.zzx(this.zzS, v4);
                this.zzS = arr_v1;
                if(v3 == 2) {
                    Arrays.fill(arr_v1, 0, this.zzR, (v1 - this.zzU - 4) / this.zzR);
                    goto label_142;
                }
                else if(v3 == 1) {
                    int v5 = 0;
                    int v6 = 0;
                    int v7;
                    for(v7 = 4; true; ++v7) {
                        v8 = this.zzR - 1;
                        if(v5 >= v8) {
                            break;
                        }
                        this.zzS[v5] = 0;
                        while(true) {
                            this.zzt(zzabc0, v7 + 1);
                            int v9 = this.zzn.zzI()[v7] & 0xFF;
                            int[] arr_v2 = this.zzS;
                            v10 = arr_v2[v5] + v9;
                            arr_v2[v5] = v10;
                            if(v9 != 0xFF) {
                                break;
                            }
                            ++v7;
                        }
                        v6 += v10;
                        ++v5;
                    }
                    this.zzS[v8] = v1 - this.zzU - v7 - v6;
                    goto label_142;
                }
                else {
                    if(v3 != 3) {
                        throw zzcd.zza("Unexpected lacing value: 2", null);
                    }
                    int v11 = 0;
                    int v12 = 0;
                    int v13 = 4;
                    while(true) {
                        v14 = this.zzR - 1;
                        if(v11 >= v14) {
                            goto label_141;
                        }
                        this.zzS[v11] = 0;
                        this.zzt(zzabc0, v13 + 1);
                        if(this.zzn.zzI()[v13] == 0) {
                            throw zzcd.zza("No valid varint length mask found", null);
                        }
                        int v15 = 0;
                        while(true) {
                            if(v15 < 8) {
                                int v16 = 1 << 7 - v15;
                                if((this.zzn.zzI()[v13] & v16) == 0) {
                                    ++v15;
                                    continue;
                                }
                                else {
                                    int v17 = v13 + 1 + v15;
                                    this.zzt(zzabc0, v17);
                                    v18 = (long)(this.zzn.zzI()[v13] & 0xFF & ~v16);
                                    for(int v19 = v13 + 1; v19 < v17; ++v19) {
                                        v18 = v18 << 8 | ((long)(this.zzn.zzI()[v19] & 0xFF));
                                    }
                                    v20 = v17;
                                    if(v11 > 0) {
                                        v18 -= (1L << v15 * 7 + 6) - 1L;
                                    }
                                    break;
                                }
                            }
                            v18 = 0L;
                            v20 = v13 + 1;
                            break;
                        }
                        if(v18 < 0xFFFFFFFF80000000L || v18 > 0x7FFFFFFFL) {
                            break;
                        }
                        int[] arr_v3 = this.zzS;
                        int v21 = v11 == 0 ? ((int)v18) : ((int)v18) + arr_v3[v11 - 1];
                        arr_v3[v11] = v21;
                        v12 += v21;
                        ++v11;
                        v13 = v20;
                    }
                    throw zzcd.zza("EBML lacing sample size out of range.", null);
                label_141:
                    this.zzS[v14] = v1 - this.zzU - v13 - v12;
                label_142:
                    this.zzO = this.zzI + this.zzp(((long)(this.zzn.zzI()[0] << 8 | this.zzn.zzI()[1] & 0xFF)));
                    if(((zzaft)object0).zzd == 2) {
                        v22 = 1;
                    }
                    else if(v2 != 0xA3) {
                        v22 = 0;
                    }
                    else if((this.zzn.zzI()[2] & 0x80) == 0x80) {
                        v2 = 0xA3;
                        v22 = 1;
                    }
                    else {
                        v22 = 0;
                        v2 = 0xA3;
                    }
                    this.zzV = v22;
                    this.zzN = 2;
                    this.zzQ = 0;
                }
            }
        }
        if(v2 == 0xA3) {
            int v23;
            while((v23 = this.zzQ) < this.zzR) {
                int v24 = this.zzn(zzabc0, ((zzaft)object0), this.zzS[v23], false);
                this.zzs(((zzaft)object0), ((long)(this.zzQ * ((zzaft)object0).zze / 1000)) + this.zzO, this.zzV, v24, 0);
                ++this.zzQ;
            }
            this.zzN = 0;
            return;
        }
        int v25;
        while((v25 = this.zzQ) < this.zzR) {
            int[] arr_v4 = this.zzS;
            arr_v4[v25] = this.zzn(zzabc0, ((zzaft)object0), arr_v4[v25], true);
            ++this.zzQ;
        }
    }

    protected final void zzh(int v) {
        zzabz zzabz0;
        int v7;
        zzdy.zzb(this.zzai);
        switch(v) {
            case 0xA0: {
                if(this.zzN != 2) {
                    return;
                }
                Object object0 = this.zzj.get(this.zzT);
                zzaft.zzd(((zzaft)object0));
                if(this.zzY > 0L && "A_OPUS".equals(((zzaft)object0).zzb)) {
                    byte[] arr_b = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzY).array();
                    this.zzu.zzE(arr_b, arr_b.length);
                }
                int v3 = 0;
                for(int v2 = 0; v2 < this.zzR; ++v2) {
                    v3 += this.zzS[v2];
                }
                int v4 = 0;
                while(v4 < this.zzR) {
                    long v5 = this.zzO + ((long)(((zzaft)object0).zze * v4 / 1000));
                    int v6 = this.zzV;
                    if(v4 == 0) {
                        if(!this.zzX) {
                            v6 |= 1;
                        }
                        v7 = 0;
                    }
                    else {
                        v7 = v4;
                    }
                    int v8 = this.zzS[v7];
                    int v9 = v3 - v8;
                    this.zzs(((zzaft)object0), v5, v6, v8, v9);
                    v4 = v7 + 1;
                    v3 = v9;
                }
                this.zzN = 0;
                return;
            }
            case 0xAE: {
                zzaft zzaft0 = this.zzB;
                zzdy.zzb(zzaft0);
                String s = zzaft0.zzb;
                if(s == null) {
                    throw zzcd.zza("CodecId is missing in TrackEntry element", null);
                }
                switch(s) {
                    case "A_AAC": 
                    case "A_AC3": 
                    case "A_DTS": 
                    case "A_DTS/EXPRESS": 
                    case "A_DTS/LOSSLESS": 
                    case "A_EAC3": 
                    case "A_FLAC": 
                    case "A_MPEG/L2": 
                    case "A_MPEG/L3": 
                    case "A_MS/ACM": 
                    case "A_OPUS": 
                    case "A_PCM/FLOAT/IEEE": 
                    case "A_PCM/INT/BIG": 
                    case "A_PCM/INT/LIT": 
                    case "A_TRUEHD": 
                    case "A_VORBIS": 
                    case "S_DVBSUB": 
                    case "S_HDMV/PGS": 
                    case "S_TEXT/ASS": 
                    case "S_TEXT/UTF8": 
                    case "S_TEXT/WEBVTT": 
                    case "S_VOBSUB": 
                    case "V_AV1": 
                    case "V_MPEG2": 
                    case "V_MPEG4/ISO/AP": 
                    case "V_MPEG4/ISO/ASP": 
                    case "V_MPEG4/ISO/AVC": 
                    case "V_MPEG4/ISO/SP": 
                    case "V_MPEGH/ISO/HEVC": 
                    case "V_MS/VFW/FOURCC": 
                    case "V_THEORA": 
                    case "V_VP8": 
                    case "V_VP9": {
                        zzaft0.zze(this.zzai, zzaft0.zzc);
                        this.zzj.put(zzaft0.zzc, zzaft0);
                    }
                }
                this.zzB = null;
                return;
            }
            case 0x4DBB: {
                int v13 = this.zzD;
                if(v13 == -1) {
                    throw zzcd.zza("Mandatory element SeekID or SeekPosition not found", null);
                }
                long v14 = this.zzE;
                if(v14 == -1L) {
                    throw zzcd.zza("Mandatory element SeekID or SeekPosition not found", null);
                }
                if(v13 == 0x1C53BB6B) {
                    this.zzG = v14;
                    return;
                }
                break;
            }
            case 0x6240: {
                this.zzr(0x6240);
                zzaft zzaft1 = this.zzB;
                if(zzaft1.zzg) {
                    if(zzaft1.zzi == null) {
                        throw zzcd.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzaft1.zzk = new zzad(null, new zzac[]{new zzac(zzo.zza, null, "video/webm", this.zzB.zzi.zzb)});
                    return;
                }
                break;
            }
            case 0x6D80: {
                this.zzr(0x6D80);
                if(this.zzB.zzg && this.zzB.zzh != null) {
                    throw zzcd.zza("Combining encryption and compression is not supported", null);
                }
                break;
            }
            case 357149030: {
                if(this.zzy == 0x8000000000000001L) {
                    this.zzy = 1000000L;
                }
                long v15 = this.zzz;
                if(v15 != 0x8000000000000001L) {
                    this.zzA = this.zzp(v15);
                    return;
                }
                break;
            }
            case 0x1654AE6B: {
                if(this.zzj.size() == 0) {
                    throw zzcd.zza("No valid tracks were found", null);
                }
                this.zzai.zzC();
                return;
            }
            case 0x1C53BB6B: {
                if(!this.zzC) {
                    zzabe zzabe0 = this.zzai;
                    zzet zzet0 = this.zzJ;
                    zzet zzet1 = this.zzK;
                    if(this.zzx == -1L || this.zzA == 0x8000000000000001L || zzet0 == null || zzet0.zza() == 0 || zzet1 == null || zzet1.zza() != zzet0.zza()) {
                        zzabz0 = new zzabz(this.zzA, 0L);
                    }
                    else {
                        int v10 = zzet0.zza();
                        int[] arr_v = new int[v10];
                        long[] arr_v1 = new long[v10];
                        long[] arr_v2 = new long[v10];
                        long[] arr_v3 = new long[v10];
                        for(int v11 = 0; v11 < v10; ++v11) {
                            arr_v3[v11] = zzet0.zzb(v11);
                            arr_v1[v11] = this.zzx + zzet1.zzb(v11);
                        }
                        for(int v1 = 0; v1 < v10 - 1; ++v1) {
                            arr_v[v1] = (int)(arr_v1[v1 + 1] - arr_v1[v1]);
                            arr_v2[v1] = arr_v3[v1 + 1] - arr_v3[v1];
                        }
                        arr_v[v10 - 1] = (int)(this.zzx + this.zzw - arr_v1[v10 - 1]);
                        long v12 = this.zzA - arr_v3[v10 - 1];
                        arr_v2[v10 - 1] = v12;
                        if(v12 <= 0L) {
                            zzes.zzf("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + v12);
                            arr_v = Arrays.copyOf(arr_v, v10 - 1);
                            arr_v1 = Arrays.copyOf(arr_v1, v10 - 1);
                            arr_v2 = Arrays.copyOf(arr_v2, v10 - 1);
                            arr_v3 = Arrays.copyOf(arr_v3, v10 - 1);
                        }
                        zzabz0 = new zzaap(arr_v, arr_v1, arr_v2, arr_v3);
                    }
                    zzabe0.zzN(zzabz0);
                    this.zzC = true;
                }
                this.zzJ = null;
                this.zzK = null;
            }
        }
    }

    protected final void zzi(int v, double f) {
        switch(v) {
            case 0xB5: {
                this.zzr(0xB5);
                this.zzB.zzP = (int)f;
                return;
            }
            case 0x4489: {
                this.zzz = (long)f;
                return;
            }
            case 0x55D1: {
                this.zzr(0x55D1);
                this.zzB.zzC = (float)f;
                return;
            }
            case 21970: {
                this.zzr(21970);
                this.zzB.zzD = (float)f;
                return;
            }
            case 0x55D3: {
                this.zzr(0x55D3);
                this.zzB.zzE = (float)f;
                return;
            }
            case 0x55D4: {
                this.zzr(0x55D4);
                this.zzB.zzF = (float)f;
                return;
            }
            case 0x55D5: {
                this.zzr(0x55D5);
                this.zzB.zzG = (float)f;
                return;
            }
            case 0x55D6: {
                this.zzr(0x55D6);
                this.zzB.zzH = (float)f;
                return;
            }
            case 0x55D7: {
                this.zzr(0x55D7);
                this.zzB.zzI = (float)f;
                return;
            }
            case 0x55D8: {
                this.zzr(0x55D8);
                this.zzB.zzJ = (float)f;
                return;
            }
            case 0x55D9: {
                this.zzr(0x55D9);
                this.zzB.zzK = (float)f;
                return;
            }
            case 0x55DA: {
                this.zzr(0x55DA);
                this.zzB.zzL = (float)f;
                return;
            }
            case 30323: {
                this.zzr(30323);
                this.zzB.zzr = (float)f;
                return;
            }
            case 30324: {
                this.zzr(30324);
                this.zzB.zzs = (float)f;
                return;
            }
            case 30325: {
                this.zzr(30325);
                this.zzB.zzt = (float)f;
            }
        }
    }

    protected final void zzj(int v, long v1) {
        switch(v) {
            case 0x5031: {
                if(v1 != 0L) {
                    throw zzcd.zza(("ContentEncodingOrder " + v1 + " not supported"), null);
                }
                break;
            }
            case 20530: {
                if(v1 != 1L) {
                    throw zzcd.zza(("ContentEncodingScope " + v1 + " not supported"), null);
                }
                break;
            }
            default: {
                boolean z = false;
                switch(v) {
                    case 0x83: {
                        this.zzr(0x83);
                        this.zzB.zzd = (int)v1;
                        return;
                    }
                    case 0x88: {
                        this.zzr(0x88);
                        zzaft zzaft0 = this.zzB;
                        if(v1 == 1L) {
                            z = true;
                        }
                        zzaft0.zzU = z;
                        return;
                    }
                    case 0x9B: {
                        this.zzP = this.zzp(v1);
                        return;
                    }
                    case 0x9F: {
                        this.zzr(0x9F);
                        this.zzB.zzN = (int)v1;
                        return;
                    }
                    case 0xB0: {
                        this.zzr(0xB0);
                        this.zzB.zzl = (int)v1;
                        return;
                    }
                    case 0xB3: {
                        this.zzq(0xB3);
                        this.zzJ.zzc(this.zzp(v1));
                        return;
                    }
                    case 0xBA: {
                        this.zzr(0xBA);
                        this.zzB.zzm = (int)v1;
                        return;
                    }
                    case 0xD7: {
                        this.zzr(0xD7);
                        this.zzB.zzc = (int)v1;
                        return;
                    }
                    case 0xE7: {
                        this.zzI = this.zzp(v1);
                        return;
                    }
                    case 0xEE: {
                        this.zzW = (int)v1;
                        return;
                    }
                    case 0xF1: {
                        if(!this.zzL) {
                            this.zzq(0xF1);
                            this.zzK.zzc(v1);
                            this.zzL = true;
                            return;
                        }
                        break;
                    }
                    case 0xFB: {
                        this.zzX = true;
                        return;
                    }
                    case 0x41E7: {
                        this.zzr(0x41E7);
                        this.zzB.zzX = (int)v1;
                        return;
                    }
                    case 16980: {
                        if(v1 != 3L) {
                            throw zzcd.zza(("ContentCompAlgo " + v1 + " not supported"), null);
                        }
                        break;
                    }
                    case 17029: {
                        if(v1 < 1L || v1 > 2L) {
                            throw zzcd.zza(("DocTypeReadVersion " + v1 + " not supported"), null);
                        }
                        break;
                    }
                    case 0x42F7: {
                        if(v1 != 1L) {
                            throw zzcd.zza(("EBMLReadVersion " + v1 + " not supported"), null);
                        }
                        break;
                    }
                    case 18401: {
                        if(v1 != 5L) {
                            throw zzcd.zza(("ContentEncAlgo " + v1 + " not supported"), null);
                        }
                        break;
                    }
                    case 18408: {
                        if(v1 != 1L) {
                            throw zzcd.zza(("AESSettingsCipherMode " + v1 + " not supported"), null);
                        }
                        break;
                    }
                    case 21420: {
                        this.zzE = v1 + this.zzx;
                        return;
                    }
                    case 0x53B8: {
                        this.zzr(0x53B8);
                        switch(((int)v1)) {
                            case 0: {
                                this.zzB.zzv = 0;
                                return;
                            }
                            case 1: {
                                this.zzB.zzv = 2;
                                return;
                            }
                            case 3: {
                                this.zzB.zzv = 1;
                                return;
                            }
                        }
                        if(((int)v1) == 15) {
                            this.zzB.zzv = 3;
                            return;
                        }
                        break;
                    }
                    case 0x54B0: {
                        this.zzr(0x54B0);
                        this.zzB.zzn = (int)v1;
                        return;
                    }
                    case 0x54B2: {
                        this.zzr(0x54B2);
                        this.zzB.zzp = (int)v1;
                        return;
                    }
                    case 21690: {
                        this.zzr(21690);
                        this.zzB.zzo = (int)v1;
                        return;
                    }
                    case 21930: {
                        this.zzr(21930);
                        zzaft zzaft1 = this.zzB;
                        if(v1 == 1L) {
                            z = true;
                        }
                        zzaft1.zzT = z;
                        return;
                    }
                    case 0x55B9: {
                        this.zzr(0x55B9);
                        switch(((int)v1)) {
                            case 1: {
                                this.zzB.zzz = 2;
                                return;
                            }
                            case 2: {
                                this.zzB.zzz = 1;
                                return;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    case 0x55BA: {
                        this.zzr(0x55BA);
                        int v2 = zzs.zzb(((int)v1));
                        if(v2 != -1) {
                            this.zzB.zzy = v2;
                            return;
                        }
                        break;
                    }
                    case 0x55BB: {
                        this.zzr(0x55BB);
                        this.zzB.zzw = true;
                        int v3 = zzs.zza(((int)v1));
                        if(v3 != -1) {
                            this.zzB.zzx = v3;
                            return;
                        }
                        break;
                    }
                    case 0x55BC: {
                        this.zzr(0x55BC);
                        this.zzB.zzA = (int)v1;
                        return;
                    }
                    case 0x55BD: {
                        this.zzr(0x55BD);
                        this.zzB.zzB = (int)v1;
                        return;
                    }
                    case 0x55EE: {
                        this.zzr(0x55EE);
                        this.zzB.zzf = (int)v1;
                        return;
                    }
                    case 0x56AA: {
                        this.zzr(0x56AA);
                        this.zzB.zzQ = v1;
                        return;
                    }
                    case 22203: {
                        this.zzr(22203);
                        this.zzB.zzR = v1;
                        return;
                    }
                    case 0x6264: {
                        this.zzr(0x6264);
                        this.zzB.zzO = (int)v1;
                        return;
                    }
                    case 30114: {
                        this.zzY = v1;
                        return;
                    }
                    case 30321: {
                        this.zzr(30321);
                        switch(((int)v1)) {
                            case 0: {
                                this.zzB.zzq = 0;
                                return;
                            }
                            case 1: {
                                this.zzB.zzq = 1;
                                return;
                            }
                            case 2: {
                                this.zzB.zzq = 2;
                                return;
                            }
                            case 3: {
                                this.zzB.zzq = 3;
                                return;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    case 2352003: {
                        this.zzr(2352003);
                        this.zzB.zze = (int)v1;
                        return;
                    }
                    case 2807729: {
                        this.zzy = v1;
                    }
                }
            }
        }
    }

    protected final void zzk(int v, long v1, long v2) {
        zzdy.zzb(this.zzai);
        switch(v) {
            case 0xA0: {
                this.zzX = false;
                this.zzY = 0L;
                return;
            }
            case 0xAE: {
                this.zzB = new zzaft();
                return;
            }
            case 0xBB: {
                this.zzL = false;
                return;
            }
            case 0x4DBB: {
                this.zzD = -1;
                this.zzE = -1L;
                return;
            }
            case 0x5035: {
                this.zzr(0x5035);
                this.zzB.zzg = true;
                return;
            }
            case 0x55D0: {
                this.zzr(0x55D0);
                this.zzB.zzw = true;
                return;
            }
            case 0x18538067: {
                if(this.zzx != -1L && this.zzx != v1) {
                    throw zzcd.zza("Multiple Segment elements not supported", null);
                }
                this.zzx = v1;
                this.zzw = v2;
                return;
            }
            case 0x1C53BB6B: {
                this.zzJ = new zzet(0x20);
                this.zzK = new zzet(0x20);
                return;
            }
            case 0x1F43B675: {
                if(!this.zzC) {
                    if(this.zzk && this.zzG != -1L) {
                        this.zzF = true;
                        return;
                    }
                    this.zzai.zzN(new zzabz(this.zzA, 0L));
                    this.zzC = true;
                }
            }
        }
    }

    protected final void zzl(int v, String s) {
        switch(v) {
            case 0x86: {
                this.zzr(0x86);
                this.zzB.zzb = s;
                return;
            }
            case 17026: {
                if(!"webm".equals(s) && !"matroska".equals(s)) {
                    throw zzcd.zza(("DocType " + s + " not supported"), null);
                }
                return;
            }
            case 0x536E: {
                this.zzr(0x536E);
                this.zzB.zza = s;
                return;
            }
            case 0x22B59C: {
                this.zzr(0x22B59C);
                this.zzB.zzY = s;
            }
        }
    }

    private final int zzn(zzabc zzabc0, zzaft zzaft0, int v, boolean z) {
        if("S_TEXT/UTF8".equals(zzaft0.zzb)) {
            this.zzv(zzabc0, zzafu.zzb, v);
            int v1 = this.zzaa;
            this.zzu();
            return v1;
        }
        if("S_TEXT/ASS".equals(zzaft0.zzb)) {
            this.zzv(zzabc0, zzafu.zzd, v);
            int v2 = this.zzaa;
            this.zzu();
            return v2;
        }
        if("S_TEXT/WEBVTT".equals(zzaft0.zzb)) {
            this.zzv(zzabc0, zzafu.zze, v);
            int v3 = this.zzaa;
            this.zzu();
            return v3;
        }
        zzace zzace0 = zzaft0.zzV;
        boolean z1 = true;
        if(!this.zzac) {
            if(zzaft0.zzg) {
                this.zzV &= 0xBFFFFFFF;
                int v4 = 0x80;
                if(!this.zzad) {
                    ((zzaar)zzabc0).zzn(this.zzn.zzI(), 0, 1, false);
                    ++this.zzZ;
                    if((this.zzn.zzI()[0] & 0x80) == 0x80) {
                        throw zzcd.zza("Extension bit is set in signal byte", null);
                    }
                    this.zzag = this.zzn.zzI()[0];
                    this.zzad = true;
                }
                int v5 = this.zzag;
                if((v5 & 1) == 1) {
                    this.zzV |= 0x40000000;
                    if(!this.zzah) {
                        ((zzaar)zzabc0).zzn(this.zzs.zzI(), 0, 8, false);
                        this.zzZ += 8;
                        this.zzah = true;
                        byte[] arr_b = this.zzn.zzI();
                        if((v5 & 2) != 2) {
                            v4 = 0;
                        }
                        arr_b[0] = (byte)(v4 | 8);
                        this.zzn.zzG(0);
                        zzace0.zzr(this.zzn, 1, 1);
                        ++this.zzaa;
                        this.zzs.zzG(0);
                        zzace0.zzr(this.zzs, 8, 1);
                        this.zzaa += 8;
                    }
                    if((v5 & 2) == 2) {
                        if(!this.zzae) {
                            ((zzaar)zzabc0).zzn(this.zzn.zzI(), 0, 1, false);
                            ++this.zzZ;
                            this.zzn.zzG(0);
                            this.zzaf = this.zzn.zzl();
                            this.zzae = true;
                        }
                        int v6 = this.zzaf * 4;
                        this.zzn.zzD(v6);
                        ((zzaar)zzabc0).zzn(this.zzn.zzI(), 0, v6, false);
                        this.zzZ += v6;
                        int v7 = (this.zzaf >> 1) + 1;
                        int v8 = v7 * 6 + 2;
                        if(this.zzv == null || this.zzv.capacity() < v8) {
                            this.zzv = ByteBuffer.allocate(v8);
                        }
                        this.zzv.position(0);
                        this.zzv.putShort(((short)v7));
                        int v9 = 0;
                        int v10;
                        for(v10 = 0; true; v10 = v12) {
                            int v11 = this.zzaf;
                            if(v9 >= v11) {
                                break;
                            }
                            int v12 = this.zzn.zzo();
                            if(v9 % 2 == 0) {
                                this.zzv.putShort(((short)(v12 - v10)));
                            }
                            else {
                                this.zzv.putInt(v12 - v10);
                            }
                            ++v9;
                        }
                        int v13 = v - this.zzZ - v10;
                        if((v11 & 1) == 1) {
                            this.zzv.putInt(v13);
                        }
                        else {
                            this.zzv.putShort(((short)v13));
                            this.zzv.putInt(0);
                        }
                        byte[] arr_b1 = this.zzv.array();
                        this.zzt.zzE(arr_b1, v8);
                        zzace0.zzr(this.zzt, v8, 1);
                        this.zzaa += v8;
                    }
                }
            }
            else {
                byte[] arr_b2 = zzaft0.zzh;
                if(arr_b2 != null) {
                    this.zzq.zzE(arr_b2, arr_b2.length);
                }
            }
            if(!"A_OPUS".equals(zzaft0.zzb)) {
                if(zzaft0.zzf > 0) {
                label_93:
                    this.zzV |= 0x10000000;
                    this.zzu.zzD(0);
                    int v14 = this.zzq.zzd() + v - this.zzZ;
                    this.zzn.zzD(4);
                    this.zzn.zzI()[0] = (byte)(v14 >> 24 & 0xFF);
                    this.zzn.zzI()[1] = (byte)(v14 >> 16 & 0xFF);
                    this.zzn.zzI()[2] = (byte)(v14 >> 8 & 0xFF);
                    this.zzn.zzI()[3] = (byte)(v14 & 0xFF);
                    zzace0.zzr(this.zzn, 4, 2);
                    this.zzaa += 4;
                }
            }
            else if(z) {
                goto label_93;
            }
            this.zzac = true;
        }
        int v15 = v + this.zzq.zzd();
        if("V_MPEG4/ISO/AVC".equals(zzaft0.zzb) || "V_MPEGH/ISO/HEVC".equals(zzaft0.zzb)) {
            byte[] arr_b3 = this.zzm.zzI();
            arr_b3[0] = 0;
            arr_b3[1] = 0;
            arr_b3[2] = 0;
            int v18 = zzaft0.zzW;
            while(this.zzZ < v15) {
                int v19 = this.zzab;
                if(v19 == 0) {
                    int v20 = Math.min(v18, this.zzq.zza());
                    ((zzaar)zzabc0).zzn(arr_b3, 4 - v18 + v20, v18 - v20, false);
                    if(v20 > 0) {
                        this.zzq.zzC(arr_b3, 4 - v18, v20);
                    }
                    this.zzZ += v18;
                    this.zzm.zzG(0);
                    this.zzab = this.zzm.zzo();
                    this.zzl.zzG(0);
                    zzacc.zzb(zzace0, this.zzl, 4);
                    this.zzaa += 4;
                }
                else {
                    int v21 = this.zzo(zzabc0, zzace0, v19);
                    this.zzZ += v21;
                    this.zzaa += v21;
                    this.zzab -= v21;
                }
            }
        }
        else {
            if(zzaft0.zzS != null) {
                if(this.zzq.zzd() != 0) {
                    z1 = false;
                }
                zzdy.zzf(z1);
                zzaft0.zzS.zzd(zzabc0);
            }
            int v16;
            while((v16 = this.zzZ) < v15) {
                int v17 = this.zzo(zzabc0, zzace0, v15 - v16);
                this.zzZ += v17;
                this.zzaa += v17;
            }
        }
        if("A_VORBIS".equals(zzaft0.zzb)) {
            this.zzo.zzG(0);
            zzacc.zzb(zzace0, this.zzo, 4);
            this.zzaa += 4;
        }
        int v22 = this.zzaa;
        this.zzu();
        return v22;
    }

    private final int zzo(zzabc zzabc0, zzace zzace0, int v) {
        int v1 = this.zzq.zza();
        if(v1 > 0) {
            int v2 = Math.min(v, v1);
            zzacc.zzb(zzace0, this.zzq, v2);
            return v2;
        }
        return zzacc.zza(zzace0, zzabc0, v, false);
    }

    private final long zzp(long v) {
        long v1 = this.zzy;
        if(v1 == 0x8000000000000001L) {
            throw zzcd.zza("Can\'t scale timecode prior to timecodeScale being set.", null);
        }
        return zzfk.zzq(v, v1, 1000L);
    }

    private final void zzq(int v) {
        if(this.zzJ == null || this.zzK == null) {
            throw zzcd.zza(("Element " + v + " must be in a Cues"), null);
        }
    }

    private final void zzr(int v) {
        if(this.zzB == null) {
            throw zzcd.zza(("Element " + v + " must be in a TrackEntry"), null);
        }
    }

    private final void zzs(zzaft zzaft0, long v, int v1, int v2, int v3) {
        int v6;
        byte[] arr_b1;
        int v4;
        zzacf zzacf0 = zzaft0.zzS;
        if(zzacf0 == null) {
            if(!"S_TEXT/UTF8".equals(zzaft0.zzb) && !"S_TEXT/ASS".equals(zzaft0.zzb) && !"S_TEXT/WEBVTT".equals(zzaft0.zzb)) {
                v4 = v2;
            }
            else if(this.zzR > 1) {
                zzes.zzf("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                v4 = v2;
            }
            else {
                long v5 = this.zzP;
                if(v5 == 0x8000000000000001L) {
                    zzes.zzf("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    v4 = v2;
                }
                else {
                    String s = zzaft0.zzb;
                    byte[] arr_b = this.zzr.zzI();
                    switch(s) {
                        case "S_TEXT/ASS": {
                            arr_b1 = zzafu.zzw(v5, "%01d:%02d:%02d:%02d", 10000L);
                            v6 = 21;
                            break;
                        }
                        case "S_TEXT/UTF8": {
                            arr_b1 = zzafu.zzw(v5, "%02d:%02d:%02d,%03d", 1000L);
                            v6 = 19;
                            break;
                        }
                        case "S_TEXT/WEBVTT": {
                            arr_b1 = zzafu.zzw(v5, "%02d:%02d:%02d.%03d", 1000L);
                            v6 = 25;
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException();
                        }
                    }
                    System.arraycopy(arr_b1, 0, arr_b, v6, arr_b1.length);
                    for(int v7 = this.zzr.zzc(); v7 < this.zzr.zzd(); ++v7) {
                        if(this.zzr.zzI()[v7] == 0) {
                            this.zzr.zzF(v7);
                            break;
                        }
                    }
                    zzacc.zzb(zzaft0.zzV, this.zzr, this.zzr.zzd());
                    v4 = v2 + this.zzr.zzd();
                }
            }
            if((v1 & 0x10000000) != 0) {
                if(this.zzR > 1) {
                    this.zzu.zzD(0);
                }
                else {
                    int v8 = this.zzu.zzd();
                    zzaft0.zzV.zzr(this.zzu, v8, 2);
                    v4 += v8;
                }
            }
            zzaft0.zzV.zzs(v, v1, v4, v3, zzaft0.zzi);
        }
        else {
            zzacf0.zzc(zzaft0.zzV, v, v1, v2, v3, zzaft0.zzi);
        }
        this.zzM = true;
    }

    private final void zzt(zzabc zzabc0, int v) {
        if(this.zzn.zzd() >= v) {
            return;
        }
        if(this.zzn.zzb() < v) {
            int v1 = this.zzn.zzb();
            this.zzn.zzA(Math.max(v1 + v1, v));
        }
        ((zzaar)zzabc0).zzn(this.zzn.zzI(), this.zzn.zzd(), v - this.zzn.zzd(), false);
        this.zzn.zzF(v);
    }

    private final void zzu() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = 0;
        this.zzah = false;
        this.zzq.zzD(0);
    }

    private final void zzv(zzabc zzabc0, byte[] arr_b, int v) {
        int v1 = arr_b.length + v;
        if(this.zzr.zzb() < v1) {
            byte[] arr_b1 = Arrays.copyOf(arr_b, v1 + v);
            this.zzr.zzE(arr_b1, arr_b1.length);
        }
        else {
            System.arraycopy(arr_b, 0, this.zzr.zzI(), 0, arr_b.length);
        }
        ((zzaar)zzabc0).zzn(this.zzr.zzI(), arr_b.length, v, false);
        this.zzr.zzG(0);
        this.zzr.zzF(v1);
    }

    private static byte[] zzw(long v, String s, long v1) {
        zzdy.zzd(v != 0x8000000000000001L);
        long v2 = v - ((long)(((int)(v / 3600000000L)))) * 3600000000L;
        long v3 = v2 - ((long)(((int)(v2 / 60000000L)))) * 60000000L;
        return String.format(Locale.US, s, ((int)(v / 3600000000L)), ((int)(v2 / 60000000L)), ((int)(v3 / 1000000L)), ((int)((v3 - ((long)(((int)(v3 / 1000000L)))) * 1000000L) / v1))).getBytes(zzfqu.zzc);
    }

    private static int[] zzx(int[] arr_v, int v) {
        if(arr_v == null) {
            return new int[v];
        }
        return arr_v.length < v ? new int[Math.max(arr_v.length + arr_v.length, v)] : arr_v;
    }
}

