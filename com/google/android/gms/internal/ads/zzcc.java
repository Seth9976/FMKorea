package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzcc {
    public static final int zza;
    private static final ArrayList zzb;
    private static final Pattern zzc;

    static {
        zzcc.zzb = new ArrayList();
        zzcc.zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    }

    public static int zza(String s, String s1) {
        switch(s) {
            case "audio/ac3": {
                return 5;
            }
            case "audio/ac4": {
                return 17;
            }
            case "audio/eac3": {
                return 6;
            }
            case "audio/eac3-joc": {
                return 18;
            }
            case "audio/mp4a-latm": {
                if(s1 == null) {
                    return 0;
                }
                zzcb zzcb0 = zzcc.zzc(s1);
                return zzcb0 == null ? 0 : zzcb0.zza();
            }
            case "audio/mpeg": {
                return 9;
            }
            case "audio/opus": {
                return 20;
            }
            case "audio/true-hd": {
                return 14;
            }
            case "audio/vnd.dts": {
                return 7;
            }
            case "audio/vnd.dts.hd": {
                return 8;
            }
            case "audio/vnd.dts.hd;profile=lbr": {
                return 8;
            }
            case "audio/vnd.dts.uhd;profile=p2": {
                return 30;
            }
            default: {
                return 0;
            }
        }
    }

    public static int zzb(String s) {
        if(TextUtils.isEmpty(s)) {
            return -1;
        }
        if(zzcc.zzf(s)) {
            return 1;
        }
        if(!zzcc.zzg(s)) {
            if(!"text".equals(zzcc.zzh(s)) && !"application/cea-608".equals(s) && !"application/cea-708".equals(s) && !"application/x-mp4-cea-608".equals(s) && !"application/x-subrip".equals(s) && !"application/ttml+xml".equals(s) && !"application/x-quicktime-tx3g".equals(s) && !"application/x-mp4-vtt".equals(s) && !"application/x-rawcc".equals(s) && !"application/vobsub".equals(s) && !"application/pgs".equals(s) && !"application/dvbsubs".equals(s)) {
                if("image".equals(zzcc.zzh(s))) {
                    return 4;
                }
                if(!"application/id3".equals(s) && !"application/x-emsg".equals(s) && !"application/x-scte35".equals(s)) {
                    if(!"application/x-camera-motion".equals(s)) {
                        int v = zzcc.zzb.size();
                        for(int v1 = 0; v1 < v; ++v1) {
                            zzca zzca0 = (zzca)zzcc.zzb.get(v1);
                            if(s.equals(null)) {
                                return 0;
                            }
                        }
                        return -1;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 2;
    }

    static zzcb zzc(String s) {
        int v;
        Matcher matcher0 = zzcc.zzc.matcher(s);
        if(!matcher0.matches()) {
            return null;
        }
        String s1 = matcher0.group(1);
        s1.getClass();
        String s2 = matcher0.group(2);
        try {
            v = Integer.parseInt(s1, 16);
            if(s2 != null) {
                return new zzcb(v, Integer.parseInt(s2));
            }
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
        return new zzcb(v, 0);
    }

    public static String zzd(int v) {
        switch(v) {
            case 0x20: {
                return "video/mp4v-es";
            }
            case 33: {
                return "video/avc";
            }
            case 35: {
                return "video/hevc";
            }
            case 0x60: 
            case 97: 
            case 98: 
            case 99: 
            case 100: 
            case 101: {
                return "video/mpeg2";
            }
            case 0x40: 
            case 102: 
            case 103: 
            case 104: {
                return "audio/mp4a-latm";
            }
            case 106: {
                return "video/mpeg";
            }
            case 105: 
            case 107: {
                return "audio/mpeg";
            }
            case 0xA3: {
                return "video/wvc1";
            }
            case 0xA5: {
                return "audio/ac3";
            }
            case 0xA6: {
                return "audio/eac3";
            }
            case 170: 
            case 0xAB: {
                return "audio/vnd.dts.hd";
            }
            case 0xA9: 
            case 0xAC: {
                return "audio/vnd.dts";
            }
            case 0xAD: {
                return "audio/opus";
            }
            case 0xAE: {
                return "audio/ac4";
            }
            case 0xB1: {
                return "video/x-vnd.on2.vp9";
            }
            case 0xDD: {
                return "audio/vorbis";
            }
            default: {
                return null;
            }
        }
    }

    public static boolean zze(String s, String s1) {
        if(s == null) {
            return false;
        }
        switch(s) {
            case "audio/ac3": {
                return true;
            }
            case "audio/eac3": {
                return true;
            }
            case "audio/eac3-joc": {
                return true;
            }
            case "audio/flac": {
                return true;
            }
            case "audio/g711-alaw": {
                return true;
            }
            case "audio/g711-mlaw": {
                return true;
            }
            case "audio/mp4a-latm": {
                if(s1 == null) {
                    return false;
                }
                zzcb zzcb0 = zzcc.zzc(s1);
                if(zzcb0 == null) {
                    return false;
                }
                switch(zzcb0.zza()) {
                    case 0: 
                    case 16: {
                        return false;
                    }
                    default: {
                        return true;
                    }
                }
            }
            case "audio/mpeg": {
                return true;
            }
            case "audio/mpeg-L1": {
                return true;
            }
            case "audio/mpeg-L2": {
                return true;
            }
            case "audio/raw": {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean zzf(String s) {
        return "audio".equals(zzcc.zzh(s));
    }

    public static boolean zzg(String s) {
        return "video".equals(zzcc.zzh(s));
    }

    private static String zzh(String s) {
        if(s == null) {
            return null;
        }
        int v = s.indexOf(0x2F);
        return v == -1 ? null : s.substring(0, v);
    }
}

