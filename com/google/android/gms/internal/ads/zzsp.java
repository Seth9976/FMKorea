package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
public final class zzsp {
    public static final int zza;
    private static final Pattern zzb;
    private static final HashMap zzc;
    private static int zzd;

    static {
        zzsp.zzb = Pattern.compile("^\\D?(\\d+)$");
        zzsp.zzc = new HashMap();
        zzsp.zzd = -1;
    }

    public static int zza() {
        int v4;
        int v = zzsp.zzd;
        if(v == -1) {
            zzrw zzrw0 = zzsp.zzc("video/avc", false, false);
            if(zzrw0 == null) {
                v = 0;
            }
            else {
                MediaCodecInfo.CodecProfileLevel[] arr_mediaCodecInfo$CodecProfileLevel = zzrw0.zzh();
                int v2 = 0;
                for(int v1 = 0; v1 < arr_mediaCodecInfo$CodecProfileLevel.length; ++v1) {
                    int v3 = arr_mediaCodecInfo$CodecProfileLevel[v1].level;
                    if(v3 == 1 || v3 == 2) {
                        v4 = 0x6300;
                    }
                    else {
                        switch(v3) {
                            case 8: 
                            case 16: 
                            case 0x20: {
                                v4 = 0x18C00;
                                break;
                            }
                            case 0x40: {
                                v4 = 0x31800;
                                break;
                            }
                            case 0x80: 
                            case 0x100: {
                                v4 = 0x65400;
                                break;
                            }
                            case 0x200: {
                                v4 = 0xE1000;
                                break;
                            }
                            case 0x400: {
                                v4 = 0x140000;
                                break;
                            }
                            case 0x800: 
                            case 0x1000: {
                                v4 = 0x200000;
                                break;
                            }
                            case 0x2000: {
                                v4 = 0x220000;
                                break;
                            }
                            case 0x4000: {
                                v4 = 0x564000;
                                break;
                            }
                            case 0x8000: 
                            case 0x10000: {
                                v4 = 0x900000;
                                break;
                            }
                            case 0x20000: 
                            case 0x40000: 
                            case 0x80000: {
                                v4 = 0x2200000;
                                break;
                            }
                            default: {
                                v4 = -1;
                            }
                        }
                    }
                    v2 = Math.max(v4, v2);
                }
                v = Math.max(v2, (zzfk.zza < 21 ? 0x2A300 : 0x54600));
            }
            zzsp.zzd = v;
        }
        return v;
    }

    public static Pair zzb(zzam zzam0) {
        int v14;
        int v13;
        int v12;
        int v11;
        Integer integer2;
        int v10;
        int v9;
        int v8;
        int v7;
        int v6;
        int v5;
        int v4;
        int v3;
        int v2;
        Integer integer1;
        Integer integer0;
        String s = zzam0.zzj;
        if(s == null) {
            return null;
        }
        String[] arr_s = s.split("\\.");
        int v = 2;
        int v1 = 1;
        if("video/dolby-vision".equals(zzam0.zzm)) {
            String s1 = zzam0.zzj;
            if(arr_s.length < 3) {
                zzes.zzf("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + s1);
                return null;
            }
            Matcher matcher0 = zzsp.zzb.matcher(arr_s[1]);
            if(!matcher0.matches()) {
                zzes.zzf("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + s1);
                return null;
            }
            String s2 = matcher0.group(1);
            if(s2 == null) {
                integer0 = null;
            label_41:
                if(integer0 == null) {
                    zzes.zzf("MediaCodecUtil", "Unknown Dolby Vision profile string: " + s2);
                    return null;
                }
            }
            else {
                switch(s2) {
                    case "00": {
                        integer0 = 1;
                        goto label_41;
                    }
                    case "01": {
                        integer0 = 2;
                        break;
                    }
                    case "02": {
                        integer0 = 4;
                        break;
                    }
                    case "03": {
                        integer0 = 8;
                        break;
                    }
                    case "04": {
                        integer0 = 16;
                        break;
                    }
                    case "05": {
                        integer0 = 0x20;
                        break;
                    }
                    case "06": {
                        integer0 = 0x40;
                        break;
                    }
                    case "07": {
                        integer0 = 0x80;
                        break;
                    }
                    case "08": {
                        integer0 = 0x100;
                        break;
                    }
                    case "09": {
                        integer0 = 0x200;
                        break;
                    }
                    default: {
                        integer0 = null;
                        goto label_41;
                    }
                }
            }
            String s3 = arr_s[2];
            if(s3 == null) {
                integer1 = null;
            }
            else {
                switch(s3) {
                    case "01": {
                        integer1 = 1;
                        break;
                    }
                    case "02": {
                        return new Pair(integer0, 2);
                    }
                    case "03": {
                        return new Pair(integer0, 4);
                    }
                    case "04": {
                        return new Pair(integer0, 8);
                    }
                    case "05": {
                        return new Pair(integer0, 16);
                    }
                    case "06": {
                        return new Pair(integer0, 0x20);
                    }
                    case "07": {
                        return new Pair(integer0, 0x40);
                    }
                    case "08": {
                        return new Pair(integer0, 0x80);
                    }
                    case "09": {
                        return new Pair(integer0, 0x100);
                    }
                    case "10": {
                        return new Pair(integer0, 0x200);
                    }
                    case "11": {
                        return new Pair(integer0, 0x400);
                    }
                    case "12": {
                        return new Pair(integer0, 0x800);
                    }
                    case "13": {
                        return new Pair(integer0, 0x1000);
                    }
                    default: {
                        integer1 = null;
                        break;
                    }
                }
            }
            if(integer1 == null) {
                zzes.zzf("MediaCodecUtil", "Unknown Dolby Vision level string: " + s3);
                return null;
            }
            return new Pair(integer0, integer1);
        }
        switch(arr_s[0]) {
            case "av01": {
                String s4 = zzam0.zzj;
                zzs zzs0 = zzam0.zzy;
                if(arr_s.length < 4) {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + s4);
                    return null;
                }
                try {
                    v2 = Integer.parseInt(arr_s[1]);
                    v3 = Integer.parseInt(arr_s[2].substring(0, 2));
                    v4 = Integer.parseInt(arr_s[3]);
                }
                catch(NumberFormatException unused_ex) {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + s4);
                    return null;
                }
                if(v2 != 0) {
                    zzes.zzf("MediaCodecUtil", "Unknown AV1 profile: " + v2);
                    return null;
                }
                switch(v4) {
                    case 8: {
                        v5 = 1;
                        break;
                    }
                    case 10: {
                        v5 = zzs0 == null || zzs0.zzg == null && (zzs0.zzf != 6 && zzs0.zzf != 7) ? 2 : 0x1000;
                        break;
                    }
                    default: {
                        zzes.zzf("MediaCodecUtil", "Unknown AV1 bit depth: " + v4);
                        return null;
                    }
                }
                switch(v3) {
                    case 0: {
                        v6 = 1;
                        break;
                    }
                    case 1: {
                        v6 = 2;
                        break;
                    }
                    case 2: {
                        v6 = 4;
                        break;
                    }
                    case 3: {
                        v6 = 8;
                        break;
                    }
                    case 4: {
                        v6 = 16;
                        break;
                    }
                    case 5: {
                        v6 = 0x20;
                        break;
                    }
                    case 6: {
                        v6 = 0x40;
                        break;
                    }
                    case 7: {
                        v6 = 0x80;
                        break;
                    }
                    case 8: {
                        v6 = 0x100;
                        break;
                    }
                    case 9: {
                        v6 = 0x200;
                        break;
                    }
                    case 10: {
                        v6 = 0x400;
                        break;
                    }
                    case 11: {
                        v6 = 0x800;
                        break;
                    }
                    case 12: {
                        v6 = 0x1000;
                        break;
                    }
                    case 13: {
                        v6 = 0x2000;
                        break;
                    }
                    case 14: {
                        v6 = 0x4000;
                        break;
                    }
                    case 15: {
                        v6 = 0x8000;
                        break;
                    }
                    case 16: {
                        v6 = 0x10000;
                        break;
                    }
                    case 17: {
                        v6 = 0x20000;
                        break;
                    }
                    case 18: {
                        v6 = 0x40000;
                        break;
                    }
                    case 19: {
                        v6 = 0x80000;
                        break;
                    }
                    case 20: {
                        v6 = 0x100000;
                        break;
                    }
                    case 21: {
                        v6 = 0x200000;
                        break;
                    }
                    case 22: {
                        v6 = 0x400000;
                        break;
                    }
                    case 23: {
                        v6 = 0x800000;
                        break;
                    }
                    default: {
                        v6 = -1;
                    }
                }
                if(v6 == -1) {
                    zzes.zzf("MediaCodecUtil", "Unknown AV1 level: " + v3);
                    return null;
                }
                return new Pair(v5, v6);
            }
            case "avc1": 
            case "avc2": {
                String s5 = zzam0.zzj;
                if(arr_s.length < 2) {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: " + s5);
                    return null;
                }
                try {
                    if(arr_s[1].length() == 6) {
                        v7 = Integer.parseInt(arr_s[1].substring(0, 2), 16);
                        v8 = Integer.parseInt(arr_s[1].substring(4), 16);
                    }
                    else {
                        if(arr_s.length < 3) {
                            zzes.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: " + s5);
                            return null;
                        }
                        v7 = Integer.parseInt(arr_s[1]);
                        v8 = Integer.parseInt(arr_s[2]);
                    }
                }
                catch(NumberFormatException unused_ex) {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: " + s5);
                    return null;
                }
                switch(v7) {
                    case 66: {
                        v = 1;
                        break;
                    }
                    case 77: {
                        break;
                    }
                    case 88: {
                        v = 4;
                        break;
                    }
                    case 100: {
                        v = 8;
                        break;
                    }
                    case 110: {
                        v = 16;
                        break;
                    }
                    case 0x7A: {
                        v = 0x20;
                        break;
                    }
                    case 0xF4: {
                        v = 0x40;
                        break;
                    }
                    default: {
                        v = -1;
                    }
                }
                if(v == -1) {
                    zzes.zzf("MediaCodecUtil", "Unknown AVC profile: " + v7);
                    return null;
                }
                switch(v8) {
                    case 10: {
                        v9 = 1;
                        break;
                    }
                    case 11: {
                        v9 = 4;
                        break;
                    }
                    case 12: {
                        v9 = 8;
                        break;
                    }
                    case 13: {
                        v9 = 16;
                        break;
                    }
                    case 20: {
                        v9 = 0x20;
                        break;
                    }
                    case 21: {
                        v9 = 0x40;
                        break;
                    }
                    case 22: {
                        v9 = 0x80;
                        break;
                    }
                    case 30: {
                        v9 = 0x100;
                        break;
                    }
                    case 0x1F: {
                        v9 = 0x200;
                        break;
                    }
                    case 0x20: {
                        v9 = 0x400;
                        break;
                    }
                    case 40: {
                        v9 = 0x800;
                        break;
                    }
                    case 41: {
                        v9 = 0x1000;
                        break;
                    }
                    case 42: {
                        v9 = 0x2000;
                        break;
                    }
                    case 50: {
                        v9 = 0x4000;
                        break;
                    }
                    case 51: {
                        v9 = 0x8000;
                        break;
                    }
                    case 52: {
                        v9 = 0x10000;
                        break;
                    }
                    default: {
                        v9 = -1;
                    }
                }
                if(v9 == -1) {
                    zzes.zzf("MediaCodecUtil", "Unknown AVC level: " + v8);
                    return null;
                }
                return new Pair(v, v9);
            }
            case "hev1": 
            case "hvc1": {
                String s6 = zzam0.zzj;
                zzs zzs1 = zzam0.zzy;
                if(arr_s.length < 4) {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + s6);
                    return null;
                }
                Matcher matcher1 = zzsp.zzb.matcher(arr_s[1]);
                if(!matcher1.matches()) {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + s6);
                    return null;
                }
                String s7 = matcher1.group(1);
                boolean z = false;
                if("1".equals(s7)) {
                    z = true;
                    v10 = 1;
                }
                else if("2".equals(s7)) {
                    z = true;
                    v10 = zzs1 == null || zzs1.zzf != 6 ? 2 : 0x1000;
                }
                if(z) {
                    String s8 = arr_s[3];
                    if(s8 == null) {
                        integer2 = null;
                    }
                    else {
                        switch(s8) {
                            case "H120": {
                                return new Pair(v10, 0x800);
                            }
                            case "H123": {
                                return new Pair(v10, 0x2000);
                            }
                            case "H150": {
                                return new Pair(v10, 0x8000);
                            }
                            case "H153": {
                                return new Pair(v10, 0x20000);
                            }
                            case "H156": {
                                return new Pair(v10, 0x80000);
                            }
                            case "H180": {
                                return new Pair(v10, 0x200000);
                            }
                            case "H183": {
                                return new Pair(v10, 0x800000);
                            }
                            case "H186": {
                                return new Pair(v10, 0x2000000);
                            }
                            case "H30": {
                                return new Pair(v10, 2);
                            }
                            case "H60": {
                                return new Pair(v10, 8);
                            }
                            case "H63": {
                                return new Pair(v10, 0x20);
                            }
                            case "H90": {
                                return new Pair(v10, 0x80);
                            }
                            case "H93": {
                                return new Pair(v10, 0x200);
                            }
                            case "L120": {
                                return new Pair(v10, 0x400);
                            }
                            case "L123": {
                                return new Pair(v10, 0x1000);
                            }
                            case "L150": {
                                return new Pair(v10, 0x4000);
                            }
                            case "L153": {
                                return new Pair(v10, 0x10000);
                            }
                            case "L156": {
                                return new Pair(v10, 0x40000);
                            }
                            case "L180": {
                                return new Pair(v10, 0x100000);
                            }
                            case "L183": {
                                return new Pair(v10, 0x400000);
                            }
                            case "L186": {
                                return new Pair(v10, 0x1000000);
                            }
                            case "L30": {
                                integer2 = 1;
                                break;
                            }
                            case "L60": {
                                return new Pair(v10, 4);
                            }
                            case "L63": {
                                return new Pair(v10, 16);
                            }
                            case "L90": {
                                return new Pair(v10, 0x40);
                            }
                            case "L93": {
                                return new Pair(v10, 0x100);
                            }
                            default: {
                                integer2 = null;
                                break;
                            }
                        }
                    }
                    if(integer2 == null) {
                        zzes.zzf("MediaCodecUtil", "Unknown HEVC level string: " + s8);
                        return null;
                    }
                    return new Pair(v10, integer2);
                }
                zzes.zzf("MediaCodecUtil", "Unknown HEVC profile string: " + s7);
                return null;
            }
            case "mp4a": {
                String s9 = zzam0.zzj;
                if(arr_s.length != 3) {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + s9);
                    return null;
                }
                try {
                    if("audio/mp4a-latm".equals(zzcc.zzd(Integer.parseInt(arr_s[1], 16)))) {
                        switch(Integer.parseInt(arr_s[2])) {
                            case 1: {
                                v11 = 1;
                                break;
                            }
                            case 2: {
                                v11 = 2;
                                break;
                            }
                            case 3: {
                                v11 = 3;
                                break;
                            }
                            case 4: {
                                v11 = 4;
                                break;
                            }
                            case 5: {
                                v11 = 5;
                                break;
                            }
                            case 6: {
                                v11 = 6;
                                break;
                            }
                            case 17: {
                                v11 = 17;
                                break;
                            }
                            case 20: {
                                v11 = 20;
                                break;
                            }
                            case 23: {
                                v11 = 23;
                                break;
                            }
                            case 29: {
                                v11 = 29;
                                break;
                            }
                            case 39: {
                                v11 = 39;
                                break;
                            }
                            case 42: {
                                v11 = 42;
                                break;
                            }
                            default: {
                                v11 = -1;
                            }
                        }
                        return v11 == -1 ? null : new Pair(v11, 0);
                    }
                }
                catch(NumberFormatException unused_ex) {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + s9);
                }
                return null;
            }
            case "vp09": {
                String s10 = zzam0.zzj;
                if(arr_s.length < 3) {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + s10);
                    return null;
                }
                try {
                    v12 = Integer.parseInt(arr_s[1]);
                    v13 = Integer.parseInt(arr_s[2]);
                    switch(v12) {
                        case 0: {
                            v14 = 1;
                            goto label_326;
                        }
                        case 1: {
                            v14 = 2;
                            goto label_326;
                        }
                        case 2: {
                            goto label_325;
                        }
                    }
                }
                catch(NumberFormatException unused_ex) {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + s10);
                    return null;
                }
                if(v12 == 3) {
                    v14 = 8;
                    goto label_326;
                label_325:
                    v14 = 4;
                }
                else {
                    v14 = -1;
                }
            label_326:
                if(v14 == -1) {
                    zzes.zzf("MediaCodecUtil", "Unknown VP9 profile: " + v12);
                    return null;
                }
                if(v13 != 10) {
                    switch(v13) {
                        case 11: {
                            v1 = 2;
                            break;
                        }
                        case 20: {
                            v1 = 4;
                            break;
                        }
                        case 21: {
                            v1 = 8;
                            break;
                        }
                        case 30: {
                            v1 = 16;
                            break;
                        }
                        case 0x1F: {
                            v1 = 0x20;
                            break;
                        }
                        case 40: {
                            v1 = 0x40;
                            break;
                        }
                        case 41: {
                            v1 = 0x80;
                            break;
                        }
                        case 50: {
                            v1 = 0x100;
                            break;
                        }
                        case 51: {
                            v1 = 0x200;
                            break;
                        }
                        case 60: {
                            v1 = 0x800;
                            break;
                        }
                        case 61: {
                            v1 = 0x1000;
                            break;
                        }
                        case 62: {
                            v1 = 0x2000;
                            break;
                        }
                        default: {
                            v1 = -1;
                        }
                    }
                }
                if(v1 == -1) {
                    zzes.zzf("MediaCodecUtil", "Unknown VP9 level: " + v13);
                    return null;
                }
                return new Pair(v14, v1);
            }
            default: {
                return null;
            }
        }
    }

    public static zzrw zzc(String s, boolean z, boolean z1) {
        List list0 = zzsp.zzg(s, false, false);
        return list0.isEmpty() ? null : ((zzrw)list0.get(0));
    }

    public static zzrw zzd() {
        return zzsp.zzc("audio/raw", false, false);
    }

    public static String zze(zzam zzam0) {
        if("audio/eac3-joc".equals(zzam0.zzm)) {
            return "audio/eac3";
        }
        if("video/dolby-vision".equals(zzam0.zzm)) {
            Pair pair0 = zzsp.zzb(zzam0);
            if(pair0 != null) {
                switch(((int)(((Integer)pair0.first)))) {
                    case 16: 
                    case 0x100: {
                        return "video/hevc";
                    }
                    case 0x200: {
                        return "video/avc";
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public static List zzf(zzsc zzsc0, zzam zzam0, boolean z, boolean z1) {
        String s = zzsp.zze(zzam0);
        return s == null ? zzfud.zzl() : zzsp.zzg(s, z, z1);
    }

    public static List zzg(String s, boolean z, boolean z1) {
        synchronized(zzsp.class) {
            zzsh zzsh0 = new zzsh(s, z, z1);
            HashMap hashMap0 = zzsp.zzc;
            List list0 = (List)hashMap0.get(zzsh0);
            if(list0 != null) {
                return list0;
            }
            int v1 = zzfk.zza;
            zzsn zzsn0 = v1 >= 21 ? new zzsn(z, z1) : new zzsm(null);
            ArrayList arrayList0 = zzsp.zzj(zzsh0, zzsn0);
            if(z && arrayList0.isEmpty() && v1 >= 21 && v1 <= 23) {
                arrayList0 = zzsp.zzj(zzsh0, new zzsm(null));
                if(!arrayList0.isEmpty()) {
                    zzes.zzf("MediaCodecUtil", "MediaCodecList API didn\'t list secure decoder for: " + s + ". Assuming: " + ((zzrw)arrayList0.get(0)).zza);
                }
            }
            if("audio/raw".equals(s)) {
                if(v1 < 26 && zzfk.zzb.equals("R9") && arrayList0.size() == 1 && ((zzrw)arrayList0.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayList0.add(zzrw.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzsp.zzk(arrayList0, zzsf.zza);
            }
            if(v1 < 21 && arrayList0.size() > 1) {
                String s1 = ((zzrw)arrayList0.get(0)).zza;
                if("OMX.SEC.mp3.dec".equals(s1) || "OMX.SEC.MP3.Decoder".equals(s1) || "OMX.brcm.audio.mp3.decoder".equals(s1)) {
                    zzsp.zzk(arrayList0, (Object object0) -> // 去混淆评级： 低(20)
                    (((zzrw)object0).zza.startsWith("OMX.google") ? 1 : 0));
                }
            }
            if(v1 < 0x20 && arrayList0.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzrw)arrayList0.get(0)).zza)) {
                arrayList0.add(((zzrw)arrayList0.remove(0)));
            }
            List list1 = zzfud.zzj(arrayList0);
            hashMap0.put(zzsh0, list1);
            return list1;
        }
    }

    public static List zzh(zzsc zzsc0, zzam zzam0, boolean z, boolean z1) {
        List list0 = zzsp.zzg(zzam0.zzm, z, z1);
        List list1 = zzsp.zzf(zzsc0, zzam0, z, z1);
        zzfua zzfua0 = new zzfua();
        zzfua0.zzh(list0);
        zzfua0.zzh(list1);
        return zzfua0.zzi();
    }

    public static List zzi(List list0, zzam zzam0) {
        List list1 = new ArrayList(list0);
        zzsp.zzk(list1, new zzsd(zzam0));
        return list1;
    }

    private static ArrayList zzj(zzsh zzsh0, zzsk zzsk0) {
        String s7;
        StringBuilder stringBuilder0;
        String s6;
        String s5;
        boolean z7;
        boolean z6;
        boolean z5;
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0;
        int v3;
        String s2;
        String s1;
        MediaCodecInfo mediaCodecInfo0;
        int v1;
        String s;
        ArrayList arrayList0;
        try {
            arrayList0 = new ArrayList();
            s = zzsh0.zza;
            int v = zzsk0.zza();
            boolean z = zzsk0.zze();
            v1 = 0;
        alab1:
            while(true) {
            label_5:
                if(v1 >= v) {
                    return arrayList0;
                }
                mediaCodecInfo0 = zzsk0.zzb(v1);
                int v2 = zzfk.zza;
                if(v2 < 29 || !mediaCodecInfo0.isAlias()) {
                    s1 = mediaCodecInfo0.getName();
                    if(mediaCodecInfo0.isEncoder()) {
                        v3 = v1;
                    }
                    else if(!z && s1.endsWith(".secure")) {
                        v3 = v1;
                    }
                    else if(v2 < 21 && ("CIPAACDecoder".equals(s1) || "CIPMP3Decoder".equals(s1) || "CIPVorbisDecoder".equals(s1) || "CIPAMRNBDecoder".equals(s1) || "AACDecoder".equals(s1) || "MP3Decoder".equals(s1))) {
                        v3 = v1;
                    }
                    else if(v2 < 24 && (("OMX.SEC.aac.dec".equals(s1) || "OMX.Exynos.AAC.Decoder".equals(s1)) && "samsung".equals(zzfk.zzc) && (zzfk.zzb.startsWith("zeroflte") || zzfk.zzb.startsWith("zerolte") || zzfk.zzb.startsWith("zenlte") || "SC-05G".equals(zzfk.zzb) || "marinelteatt".equals(zzfk.zzb) || "404SC".equals(zzfk.zzb) || "SC-04G".equals(zzfk.zzb) || "SCV31".equals(zzfk.zzb)))) {
                        v3 = v1;
                    }
                    else if(v2 <= 19 && ("OMX.SEC.vp8.dec".equals(s1) && "samsung".equals(zzfk.zzc) && (zzfk.zzb.startsWith("d2") || zzfk.zzb.startsWith("serrano") || zzfk.zzb.startsWith("jflte") || zzfk.zzb.startsWith("santos") || zzfk.zzb.startsWith("t0")))) {
                        v3 = v1;
                    }
                    else if(v2 <= 19 && zzfk.zzb.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(s1) || v2 <= 23 && "audio/eac3-joc".equals(s) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(s1)) {
                        v3 = v1;
                    }
                    else {
                        String[] arr_s = mediaCodecInfo0.getSupportedTypes();
                        int v4 = 0;
                        while(true) {
                            if(v4 >= arr_s.length) {
                                if(s.equals("video/dolby-vision")) {
                                    if("OMX.MS.HEVCDV.Decoder".equals(s1)) {
                                        s2 = "video/hevcdv";
                                    }
                                    else if("OMX.RTK.video.decoder".equals(s1) || "OMX.realtek.video.decoder.tunneled".equals(s1)) {
                                        s2 = "video/dv_hevc";
                                    }
                                    else {
                                        s2 = null;
                                    }
                                }
                                else if(s.equals("audio/alac") && "OMX.lge.alac.decoder".equals(s1)) {
                                    s2 = "audio/x-lg-alac";
                                }
                                else if(s.equals("audio/flac") && "OMX.lge.flac.decoder".equals(s1)) {
                                    s2 = "audio/x-lg-flac";
                                }
                                else if(!s.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(s1)) {
                                    s2 = null;
                                }
                                else {
                                    s2 = "audio/lg-ac3";
                                }
                                break alab1;
                            }
                            String s3 = arr_s[v4];
                            if(!s3.equalsIgnoreCase(s)) {
                                ++v4;
                                continue;
                            }
                            s2 = s3;
                            break alab1;
                        }
                    }
                }
                else {
                    v3 = v1;
                }
                v1 = v3 + 1;
            }
        }
        catch(Exception exception0) {
            throw new zzsj(exception0, null);
        }
        if(s2 == null) {
            v3 = v1;
            v1 = v3 + 1;
            goto label_5;
        }
        else {
            try {
                mediaCodecInfo$CodecCapabilities0 = mediaCodecInfo0.getCapabilitiesForType(s2);
                boolean z1 = zzsk0.zzd("tunneled-playback", s2, mediaCodecInfo$CodecCapabilities0);
                boolean z2 = zzsk0.zzc("tunneled-playback", s2, mediaCodecInfo$CodecCapabilities0);
                if(zzsh0.zzc) {
                label_67:
                    if(z1) {
                        goto label_68;
                    }
                    v3 = v1;
                    v1 = v3 + 1;
                    goto label_5;
                }
                else {
                    if(z2) {
                        v3 = v1;
                        v1 = v3 + 1;
                        goto label_5;
                    }
                    else {
                        goto label_68;
                    }
                    goto label_67;
                }
            label_68:
                boolean z3 = zzsk0.zzd("secure-playback", s2, mediaCodecInfo$CodecCapabilities0);
                boolean z4 = zzsk0.zzc("secure-playback", s2, mediaCodecInfo$CodecCapabilities0);
                if(zzsh0.zzb) {
                label_73:
                    if(z3) {
                        z3 = true;
                    }
                    else {
                        v3 = v1;
                        v1 = v3 + 1;
                        goto label_5;
                    }
                }
                else {
                    if(z4) {
                        v3 = v1;
                        v1 = v3 + 1;
                        goto label_5;
                    }
                    else {
                        goto label_75;
                    }
                    goto label_73;
                }
            label_75:
                z5 = zzfk.zza < 29 ? !zzsp.zzl(mediaCodecInfo0, s) : mediaCodecInfo0.isHardwareAccelerated();
                z6 = zzsp.zzl(mediaCodecInfo0, s);
                if(zzfk.zza >= 29) {
                    z7 = mediaCodecInfo0.isVendor();
                }
                else {
                    String s4 = zzfqo.zza(mediaCodecInfo0.getName());
                    z7 = !s4.startsWith("omx.google.") && !s4.startsWith("c2.android.") && !s4.startsWith("c2.google.");
                }
            }
            catch(Exception exception1) {
                s5 = s2;
                s6 = s1;
                v3 = v1;
                goto label_112;
            }
            if(z) {
                try {
                    if(zzsh0.zzb == z3) {
                        goto label_91;
                    }
                label_90:
                    if(z || zzsh0.zzb) {
                        s5 = s2;
                        s7 = s1;
                        v3 = v1;
                        if(!z && z3) {
                            stringBuilder0 = new StringBuilder();
                            goto label_105;
                        }
                    }
                    else {
                    label_91:
                        s5 = s2;
                        s7 = s1;
                        v3 = v1;
                        arrayList0.add(zzrw.zzc(s1, s, s2, mediaCodecInfo$CodecCapabilities0, z5, z6, z7, false, false));
                    }
                    v1 = v3 + 1;
                    goto label_5;
                }
                catch(Exception exception1) {
                }
            }
            else {
                goto label_90;
            }
            s6 = s7;
            goto label_112;
            try {
            label_105:
                stringBuilder0.append(s7);
                s6 = s7;
                stringBuilder0.append(".secure");
                s6 = s7;
                arrayList0.add(zzrw.zzc(stringBuilder0.toString(), s, s5, mediaCodecInfo$CodecCapabilities0, z5, z6, z7, false, true));
                return arrayList0;
            }
            catch(Exception exception1) {
            }
            try {
            label_112:
                if(zzfk.zza > 23 || arrayList0.isEmpty()) {
                    zzes.zzc("MediaCodecUtil", "Failed to query codec " + s6 + " (" + s5 + ")");
                    throw exception1;
                }
                zzes.zzc("MediaCodecUtil", "Skipping codec " + s6 + " (failed to query capabilities)");
                v1 = v3 + 1;
                goto label_5;
            }
            catch(Exception exception0) {
            }
            throw new zzsj(exception0, null);
        }
        v1 = v3 + 1;
        goto label_5;
    }

    private static void zzk(List list0, zzso zzso0) {
        Collections.sort(list0, new zzse(zzso0));
    }

    // 去混淆评级： 低(20)
    private static boolean zzl(MediaCodecInfo mediaCodecInfo0, String s) {
        if(zzfk.zza >= 29) {
            return mediaCodecInfo0.isSoftwareOnly();
        }
        if(zzcc.zzf(s)) {
            return true;
        }
        String s1 = zzfqo.zza(mediaCodecInfo0.getName());
        return s1.startsWith("arc.") ? false : s1.startsWith("omx.google.") || s1.startsWith("omx.ffmpeg.") || s1.startsWith("omx.sec.") && s1.contains(".sw.") || s1.equals("omx.qcom.video.decoder.hevcswvdec") || s1.startsWith("c2.android.") || s1.startsWith("c2.google.") || !s1.startsWith("omx.") && !s1.startsWith("c2.");
    }
}

