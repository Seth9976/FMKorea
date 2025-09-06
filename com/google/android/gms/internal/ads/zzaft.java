package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzaft {
    public int zzA;
    public int zzB;
    public float zzC;
    public float zzD;
    public float zzE;
    public float zzF;
    public float zzG;
    public float zzH;
    public float zzI;
    public float zzJ;
    public float zzK;
    public float zzL;
    public byte[] zzM;
    public int zzN;
    public int zzO;
    public int zzP;
    public long zzQ;
    public long zzR;
    public zzacf zzS;
    public boolean zzT;
    public boolean zzU;
    public zzace zzV;
    public int zzW;
    private int zzX;
    private String zzY;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzacd zzi;
    public byte[] zzj;
    public zzad zzk;
    public int zzl;
    public int zzm;
    public int zzn;
    public int zzo;
    public int zzp;
    public int zzq;
    public float zzr;
    public float zzs;
    public float zzt;
    public byte[] zzu;
    public int zzv;
    public boolean zzw;
    public int zzx;
    public int zzy;
    public int zzz;

    protected zzaft() {
        this.zzl = -1;
        this.zzm = -1;
        this.zzn = -1;
        this.zzo = -1;
        this.zzp = 0;
        this.zzq = -1;
        this.zzr = 0.0f;
        this.zzs = 0.0f;
        this.zzt = 0.0f;
        this.zzu = null;
        this.zzv = -1;
        this.zzw = false;
        this.zzx = -1;
        this.zzy = -1;
        this.zzz = -1;
        this.zzA = 1000;
        this.zzB = 200;
        this.zzC = -1.0f;
        this.zzD = -1.0f;
        this.zzE = -1.0f;
        this.zzF = -1.0f;
        this.zzG = -1.0f;
        this.zzH = -1.0f;
        this.zzI = -1.0f;
        this.zzJ = -1.0f;
        this.zzK = -1.0f;
        this.zzL = -1.0f;
        this.zzN = 1;
        this.zzO = -1;
        this.zzP = 8000;
        this.zzQ = 0L;
        this.zzR = 0L;
        this.zzU = true;
        this.zzY = "eng";
    }

    static void zzd(zzaft zzaft0) {
        zzaft0.zzV.getClass();
    }

    public final void zze(zzabe zzabe0, int v) {
        float f;
        int v9;
        int v7;
        int v4;
        String s2;
        List list0;
        int v3;
        String s = this.zzb;
        int v1 = 4;
        int v2 = 0;
        switch(s) {
            case "A_AAC": {
                v3 = 13;
                break;
            }
            case "A_AC3": {
                v3 = 16;
                break;
            }
            case "A_DTS": {
                v3 = 19;
                break;
            }
            case "A_DTS/EXPRESS": {
                v3 = 20;
                break;
            }
            case "A_DTS/LOSSLESS": {
                v3 = 21;
                break;
            }
            case "A_EAC3": {
                v3 = 17;
                break;
            }
            case "A_FLAC": {
                v3 = 22;
                break;
            }
            case "A_MPEG/L2": {
                v3 = 14;
                break;
            }
            case "A_MPEG/L3": {
                v3 = 15;
                break;
            }
            case "A_MS/ACM": {
                v3 = 23;
                break;
            }
            case "A_OPUS": {
                v3 = 12;
                break;
            }
            case "A_PCM/FLOAT/IEEE": {
                v3 = 26;
                break;
            }
            case "A_PCM/INT/BIG": {
                v3 = 25;
                break;
            }
            case "A_PCM/INT/LIT": {
                v3 = 24;
                break;
            }
            case "A_TRUEHD": {
                v3 = 18;
                break;
            }
            case "A_VORBIS": {
                v3 = 11;
                break;
            }
            case "S_DVBSUB": {
                v3 = 0x20;
                break;
            }
            case "S_HDMV/PGS": {
                v3 = 0x1F;
                break;
            }
            case "S_TEXT/ASS": {
                v3 = 28;
                break;
            }
            case "S_TEXT/UTF8": {
                v3 = 27;
                break;
            }
            case "S_TEXT/WEBVTT": {
                v3 = 29;
                break;
            }
            case "S_VOBSUB": {
                v3 = 30;
                break;
            }
            case "V_AV1": {
                v3 = 2;
                break;
            }
            case "V_MPEG2": {
                v3 = 3;
                break;
            }
            case "V_MPEG4/ISO/AP": {
                v3 = 6;
                break;
            }
            case "V_MPEG4/ISO/ASP": {
                v3 = 5;
                break;
            }
            case "V_MPEG4/ISO/AVC": {
                v3 = 7;
                break;
            }
            case "V_MPEG4/ISO/SP": {
                v3 = 4;
                break;
            }
            case "V_MPEGH/ISO/HEVC": {
                v3 = 8;
                break;
            }
            case "V_MS/VFW/FOURCC": {
                v3 = 9;
                break;
            }
            case "V_THEORA": {
                v3 = 10;
                break;
            }
            case "V_VP8": {
                v3 = 0;
                break;
            }
            case "V_VP9": {
                v3 = 1;
                break;
            }
            default: {
                v3 = -1;
            }
        }
        String s1 = "audio/raw";
        byte[] arr_b = null;
        switch(v3) {
            case 0: {
                s1 = "video/x-vnd.on2.vp8";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 1: {
                s1 = "video/x-vnd.on2.vp9";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 2: {
                s1 = "video/av01";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 3: {
                s1 = "video/mpeg2";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                list0 = this.zzj == null ? null : Collections.singletonList(this.zzj);
                s1 = "video/mp4v-es";
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 7: {
                zzaag zzaag0 = zzaag.zza(new zzfb(this.zzi(this.zzb)));
                this.zzW = zzaag0.zzb;
                s1 = "video/avc";
                s2 = zzaag0.zzi;
                list0 = zzaag0.zza;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 8: {
                zzabr zzabr0 = zzabr.zza(new zzfb(this.zzi(this.zzb)));
                this.zzW = zzabr0.zzb;
                s1 = "video/hevc";
                s2 = zzabr0.zzg;
                list0 = zzabr0.zza;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 9: {
                Pair pair0 = zzaft.zzf(new zzfb(this.zzi(this.zzb)));
                s1 = (String)pair0.first;
                list0 = (List)pair0.second;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 10: {
                s1 = "video/x-unknown";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 11: {
                list0 = zzaft.zzg(this.zzi(s));
                v4 = 0x2000;
                s1 = "audio/vorbis";
                s2 = null;
                v1 = -1;
                break;
            }
            case 12: {
                list0 = new ArrayList(3);
                list0.add(this.zzi(this.zzb));
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
                ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
                list0.add(byteBuffer0.order(byteOrder0).putLong(this.zzQ).array());
                list0.add(ByteBuffer.allocate(8).order(byteOrder0).putLong(this.zzR).array());
                v4 = 5760;
                s1 = "audio/opus";
                s2 = null;
                v1 = -1;
                break;
            }
            case 13: {
                list0 = Collections.singletonList(this.zzi(s));
                zzzy zzzy0 = zzzz.zza(this.zzj);
                this.zzP = zzzy0.zza;
                this.zzN = zzzy0.zzb;
                s1 = "audio/mp4a-latm";
                s2 = zzzy0.zzc;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 14: {
                s1 = "audio/mpeg-L2";
                goto label_129;
            }
            case 15: {
                s1 = "audio/mpeg";
            label_129:
                v4 = 0x1000;
                list0 = null;
                s2 = null;
                v1 = -1;
                break;
            }
            case 16: {
                s1 = "audio/ac3";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 17: {
                s1 = "audio/eac3";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 18: {
                this.zzS = new zzacf();
                s1 = "audio/true-hd";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 19: 
            case 20: {
                s1 = "audio/vnd.dts";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 21: {
                s1 = "audio/vnd.dts.hd";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 22: {
                list0 = Collections.singletonList(this.zzi(s));
                s1 = "audio/flac";
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 23: {
                if(zzaft.zzh(new zzfb(this.zzi(this.zzb)))) {
                    v1 = zzfk.zzk(this.zzO);
                    if(v1 == 0) {
                        zzes.zzf("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                        goto label_180;
                    }
                    else {
                        list0 = null;
                        s2 = null;
                        v4 = -1;
                        break;
                    }
                }
                else {
                    zzes.zzf("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    goto label_180;
                }
                break;
            }
            case 24: {
                v1 = zzfk.zzk(this.zzO);
                if(v1 == 0) {
                    zzes.zzf("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    goto label_180;
                }
                else {
                    list0 = null;
                    s2 = null;
                    v4 = -1;
                    break;
                }
                break;
            }
            case 25: {
                int v5 = this.zzO;
                if(v5 == 8) {
                    v1 = 3;
                    list0 = null;
                    s2 = null;
                    v4 = -1;
                    break;
                }
                else if(v5 == 16) {
                    v1 = 0x10000000;
                    list0 = null;
                    s2 = null;
                    v4 = -1;
                    break;
                }
                else if(v5 == 24) {
                    v1 = 0x50000000;
                    list0 = null;
                    s2 = null;
                    v4 = -1;
                    break;
                }
                else if(v5 == 0x20) {
                    v1 = 0x60000000;
                    list0 = null;
                    s2 = null;
                    v4 = -1;
                    break;
                }
                else {
                    zzes.zzf("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + v5 + ". Setting mimeType to audio/x-unknown");
                    goto label_180;
                }
                break;
            }
            case 26: {
                int v6 = this.zzO;
                if(v6 == 0x20) {
                    list0 = null;
                    s2 = null;
                    v4 = -1;
                }
                else {
                    zzes.zzf("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + v6 + ". Setting mimeType to audio/x-unknown");
                label_180:
                    list0 = null;
                    s2 = null;
                    s1 = "audio/x-unknown";
                    v4 = -1;
                    v1 = -1;
                    break;
                }
                break;
            }
            case 27: {
                s1 = "application/x-subrip";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 28: {
                list0 = zzfud.zzn(zzafu.zzc, this.zzi(this.zzb));
                s1 = "text/x-ssa";
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 29: {
                s1 = "text/vtt";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 30: {
                list0 = zzfud.zzm(this.zzi(s));
                s2 = null;
                s1 = "application/vobsub";
                v4 = -1;
                v1 = -1;
                break;
            }
            case 0x1F: {
                list0 = null;
                s2 = null;
                s1 = "application/pgs";
                v4 = -1;
                v1 = -1;
                break;
            }
            case 0x20: {
                byte[] arr_b1 = new byte[4];
                System.arraycopy(this.zzi(s), 0, arr_b1, 0, 4);
                list0 = zzfud.zzm(arr_b1);
                s1 = "application/dvbsubs";
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            default: {
                throw zzcd.zza("Unrecognized codec identifier.", null);
            }
        }
        if(this.zzM != null) {
            zzaax zzaax0 = zzaax.zza(new zzfb(this.zzM));
            if(zzaax0 != null) {
                s2 = zzaax0.zza;
                s1 = "video/dolby-vision";
            }
        }
        boolean z = this.zzU;
        zzak zzak0 = new zzak();
        if(zzcc.zzf(s1)) {
            zzak0.zzw(this.zzN);
            zzak0.zzT(this.zzP);
            zzak0.zzN(v1);
            v7 = 1;
        }
        else if(zzcc.zzg(s1)) {
            if(this.zzp == 0) {
                int v8 = this.zzn;
                v9 = -1;
                if(v8 == -1) {
                    v8 = this.zzl;
                }
                this.zzn = v8;
                this.zzo = this.zzo == -1 ? this.zzm : this.zzo;
            }
            else {
                v9 = -1;
            }
            int v10 = this.zzn;
            if(v10 == -1) {
                f = -1.0f;
            }
            else {
                int v11 = this.zzo;
                f = v11 == -1 ? -1.0f : ((float)(this.zzm * v10)) / ((float)(this.zzl * v11));
            }
            if(this.zzw) {
                if(this.zzC != -1.0f && this.zzD != -1.0f && this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f) {
                    arr_b = new byte[25];
                    ByteBuffer byteBuffer1 = ByteBuffer.wrap(arr_b).order(ByteOrder.LITTLE_ENDIAN);
                    byteBuffer1.put(0);
                    byteBuffer1.putShort(((short)(((int)(this.zzC * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzD * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzE * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzF * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzG * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzH * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzI * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzJ * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzK + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzL + 0.5f)))));
                    byteBuffer1.putShort(((short)this.zzA));
                    byteBuffer1.putShort(((short)this.zzB));
                }
                arr_b = new zzs(this.zzx, this.zzz, this.zzy, arr_b);
            }
            if(this.zza != null && zzafu.zzg.containsKey(this.zza)) {
                v9 = (int)(((Integer)zzafu.zzg.get(this.zza)));
            }
            if(this.zzq != 0 || Float.compare(this.zzr, 0.0f) != 0 || Float.compare(this.zzs, 0.0f) != 0) {
                v2 = v9;
            }
            else if(Float.compare(this.zzt, 0.0f) != 0) {
                if(Float.compare(this.zzt, 90.0f) == 0) {
                    v2 = 90;
                }
                else if(Float.compare(this.zzt, -180.0f) == 0 || Float.compare(this.zzt, 180.0f) == 0) {
                    v2 = 180;
                }
                else if(Float.compare(this.zzt, -90.0f) == 0) {
                    v2 = 270;
                }
                else {
                    v2 = v9;
                }
            }
            zzak0.zzX(this.zzl);
            zzak0.zzF(this.zzm);
            zzak0.zzP(f);
            zzak0.zzR(v2);
            zzak0.zzQ(this.zzu);
            zzak0.zzV(this.zzv);
            zzak0.zzy(((zzs)arr_b));
            v7 = 2;
        }
        else if("application/x-subrip".equals(s1) || "text/x-ssa".equals(s1) || "text/vtt".equals(s1) || "application/vobsub".equals(s1) || "application/pgs".equals(s1) || "application/dvbsubs".equals(s1)) {
            v7 = 3;
        }
        else {
            throw zzcd.zza("Unexpected MIME type.", null);
        }
        if(this.zza != null && !zzafu.zzg.containsKey(this.zza)) {
            zzak0.zzJ(this.zza);
        }
        zzak0.zzG(v);
        zzak0.zzS(s1);
        zzak0.zzL(v4);
        zzak0.zzK(this.zzY);
        zzak0.zzU(z);
        zzak0.zzI(list0);
        zzak0.zzx(s2);
        zzak0.zzB(this.zzk);
        zzam zzam0 = zzak0.zzY();
        zzace zzace0 = zzabe0.zzv(this.zzc, v7);
        this.zzV = zzace0;
        zzace0.zzk(zzam0);
    }

    private static Pair zzf(zzfb zzfb0) {
        try {
            zzfb0.zzH(16);
            long v = zzfb0.zzr();
            if(v == 1482049860L) {
                return new Pair("video/divx", null);
            }
            if(v == 0x33363248L) {
                return new Pair("video/3gpp", null);
            }
            if(v == 0x31435657L) {
                int v1 = zzfb0.zzc() + 20;
                byte[] arr_b = zzfb0.zzI();
                while(v1 < arr_b.length - 4) {
                    if(arr_b[v1] == 0 && arr_b[v1 + 1] == 0 && arr_b[v1 + 2] == 1 && arr_b[v1 + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(arr_b, v1, arr_b.length)));
                    }
                    ++v1;
                }
                throw zzcd.zza("Failed to find FourCC VC1 initialization data", null);
            }
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw zzcd.zza("Error parsing FourCC private data", null);
        }
        zzes.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
        return new Pair("video/x-unknown", null);
    }

    private static List zzg(byte[] arr_b) {
        try {
            if(arr_b[0] != 2) {
                throw zzcd.zza("Error parsing vorbis codec private", null);
            }
            int v = 0;
            int v1 = 1;
            int v2;
            while((v2 = arr_b[v1] & 0xFF) == 0xFF) {
                ++v1;
                v += 0xFF;
            }
            int v3 = v + v2;
            int v4 = v1 + 1;
            int v5 = 0;
            int v6;
            while((v6 = arr_b[v4] & 0xFF) == 0xFF) {
                ++v4;
                v5 += 0xFF;
            }
            if(arr_b[v4 + 1] != 1) {
                throw zzcd.zza("Error parsing vorbis codec private", null);
            }
            byte[] arr_b1 = new byte[v3];
            System.arraycopy(arr_b, v4 + 1, arr_b1, 0, v3);
            int v7 = v4 + 1 + v3;
            if(arr_b[v7] != 3) {
                throw zzcd.zza("Error parsing vorbis codec private", null);
            }
            int v8 = v7 + (v5 + v6);
            if(arr_b[v8] != 5) {
                throw zzcd.zza("Error parsing vorbis codec private", null);
            }
            int v9 = arr_b.length - v8;
            byte[] arr_b2 = new byte[v9];
            System.arraycopy(arr_b, v8, arr_b2, 0, v9);
            List list0 = new ArrayList(2);
            list0.add(arr_b1);
            list0.add(arr_b2);
            return list0;
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw zzcd.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzfb zzfb0) {
        try {
            int v = zzfb0.zzj();
            if(v == 1) {
                return true;
            }
            if(v != 0xFFFE) {
                return false;
            }
            zzfb0.zzG(24);
            return zzfb0.zzs() != zzafu.zzf().getMostSignificantBits() || zzfb0.zzs() != zzafu.zzf().getLeastSignificantBits() ? false : true;
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw zzcd.zza("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String s) {
        byte[] arr_b = this.zzj;
        if(arr_b == null) {
            throw zzcd.zza(("Missing CodecPrivate for codec " + s), null);
        }
        return arr_b;
    }
}

