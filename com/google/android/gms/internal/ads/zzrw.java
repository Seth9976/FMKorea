package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Pair;

public final class zzrw {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    zzrw(String s, String s1, String s2, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
        s.getClass();
        this.zza = s;
        this.zzb = s1;
        this.zzc = s2;
        this.zzd = mediaCodecInfo$CodecCapabilities0;
        this.zzg = z;
        this.zze = z3;
        this.zzf = z5;
        this.zzh = zzcc.zzg(s1);
    }

    @Override
    public final String toString() {
        return this.zza;
    }

    public final Point zza(int v, int v1) {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.zzd;
        if(mediaCodecInfo$CodecCapabilities0 == null) {
            return null;
        }
        MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = mediaCodecInfo$CodecCapabilities0.getVideoCapabilities();
        return mediaCodecInfo$VideoCapabilities0 == null ? null : zzrw.zzi(mediaCodecInfo$VideoCapabilities0, v, v1);
    }

    public final zzie zzb(zzam zzam0, zzam zzam1) {
        int v = zzfk.zzD(zzam0.zzm, zzam1.zzm) ? 0 : 8;
        if(this.zzh) {
            if(zzam0.zzu != zzam1.zzu) {
                v |= 0x400;
            }
            if(!this.zze && (zzam0.zzr != zzam1.zzr || zzam0.zzs != zzam1.zzs)) {
                v |= 0x200;
            }
            if(!zzfk.zzD(zzam0.zzy, zzam1.zzy)) {
                v |= 0x800;
            }
            if(zzfk.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.zza) && !zzam0.zzd(zzam1)) {
                v |= 2;
            }
            if(v == 0) {
                return zzam0.zzd(zzam1) ? new zzie(this.zza, zzam0, zzam1, 3, 0) : new zzie(this.zza, zzam0, zzam1, 2, 0);
            }
            return new zzie(this.zza, zzam0, zzam1, 0, v);
        }
        if(zzam0.zzz != zzam1.zzz) {
            v |= 0x1000;
        }
        if(zzam0.zzA != zzam1.zzA) {
            v |= 0x2000;
        }
        if(zzam0.zzB != zzam1.zzB) {
            v |= 0x4000;
        }
        if(v == 0 && "audio/mp4a-latm".equals(this.zzb)) {
            Pair pair0 = zzsp.zzb(zzam0);
            Pair pair1 = zzsp.zzb(zzam1);
            if(pair0 != null && pair1 != null && (((int)(((Integer)pair0.first))) == 42 && ((int)(((Integer)pair1.first))) == 42)) {
                return new zzie(this.zza, zzam0, zzam1, 3, 0);
            }
        }
        if(!zzam0.zzd(zzam1)) {
            v |= 0x20;
        }
        if("audio/opus".equals(this.zzb)) {
            v |= 2;
        }
        return v == 0 ? new zzie(this.zza, zzam0, zzam1, 1, 0) : new zzie(this.zza, zzam0, zzam1, 0, v);
    }

    public static zzrw zzc(String s, String s1, String s2, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        if(mediaCodecInfo$CodecCapabilities0 == null || !mediaCodecInfo$CodecCapabilities0.isFeatureSupported("adaptive-playback")) {
            z5 = false;
        }
        else if(zzfk.zza > 22 || !"ODROID-XU3".equals(zzfk.zzd) && !"Nexus 10".equals(zzfk.zzd)) {
            z5 = true;
        }
        else if(!"OMX.Exynos.AVC.Decoder".equals(s) && !"OMX.Exynos.AVC.Decoder.secure".equals(s)) {
            z5 = true;
        }
        else {
            z5 = false;
        }
        boolean z6 = mediaCodecInfo$CodecCapabilities0 != null && zzfk.zza >= 21 && mediaCodecInfo$CodecCapabilities0.isFeatureSupported("tunneled-playback");
        return !z4 && (mediaCodecInfo$CodecCapabilities0 == null || zzfk.zza < 21 || !mediaCodecInfo$CodecCapabilities0.isFeatureSupported("secure-playback")) ? new zzrw(s, s1, s2, mediaCodecInfo$CodecCapabilities0, z, z1, z2, z5, z6, false) : new zzrw(s, s1, s2, mediaCodecInfo$CodecCapabilities0, z, z1, z2, z5, z6, true);
    }

    // 去混淆评级： 低(20)
    public final boolean zzd(zzam zzam0) {
        return this.zzm(zzam0) && this.zzl(zzam0, false);
    }

    public final boolean zze(zzam zzam0) {
        int v6;
        if(!this.zzm(zzam0)) {
            return false;
        }
        if(!this.zzl(zzam0, true)) {
            return false;
        }
        if(this.zzh) {
            int v = zzam0.zzr;
            if(v > 0) {
                int v1 = zzam0.zzs;
                if(v1 > 0) {
                    if(zzfk.zza >= 21) {
                        return this.zzg(v, v1, ((double)zzam0.zzt));
                    }
                    if(v * v1 <= zzsp.zza()) {
                        return true;
                    }
                    this.zzj("legacyFrameSize, " + zzam0.zzr + "x" + zzam0.zzs);
                    return false;
                }
            }
            return true;
        }
        int v2 = zzfk.zza;
        if(v2 >= 21) {
            int v3 = zzam0.zzA;
            if(v3 != -1) {
                MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.zzd;
                if(mediaCodecInfo$CodecCapabilities0 == null) {
                    this.zzj("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities mediaCodecInfo$AudioCapabilities0 = mediaCodecInfo$CodecCapabilities0.getAudioCapabilities();
                if(mediaCodecInfo$AudioCapabilities0 == null) {
                    this.zzj("sampleRate.aCaps");
                    return false;
                }
                if(!mediaCodecInfo$AudioCapabilities0.isSampleRateSupported(v3)) {
                    this.zzj("sampleRate.support, " + v3);
                    return false;
                }
            }
            int v4 = zzam0.zzz;
            if(v4 != -1) {
                MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities1 = this.zzd;
                if(mediaCodecInfo$CodecCapabilities1 == null) {
                    this.zzj("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities mediaCodecInfo$AudioCapabilities1 = mediaCodecInfo$CodecCapabilities1.getAudioCapabilities();
                if(mediaCodecInfo$AudioCapabilities1 == null) {
                    this.zzj("channelCount.aCaps");
                    return false;
                }
                String s = this.zza;
                String s1 = this.zzb;
                int v5 = mediaCodecInfo$AudioCapabilities1.getMaxInputChannelCount();
                if(v5 <= 1 && (v2 < 26 || v5 <= 0) && !"audio/mpeg".equals(s1) && !"audio/3gpp".equals(s1) && !"audio/amr-wb".equals(s1) && !"audio/mp4a-latm".equals(s1) && !"audio/vorbis".equals(s1) && !"audio/opus".equals(s1) && !"audio/raw".equals(s1) && !"audio/flac".equals(s1) && !"audio/g711-alaw".equals(s1) && !"audio/g711-mlaw".equals(s1) && !"audio/gsm".equals(s1)) {
                    if("audio/ac3".equals(s1)) {
                        v6 = 6;
                    }
                    else {
                        v6 = "audio/eac3".equals(s1) ? 16 : 30;
                    }
                    zzes.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + s + ", [" + v5 + " to " + v6 + "]");
                    v5 = v6;
                }
                if(v5 < v4) {
                    this.zzj("channelCount.support, " + v4);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean zzf(zzam zzam0) {
        if(this.zzh) {
            return this.zze;
        }
        Pair pair0 = zzsp.zzb(zzam0);
        return pair0 != null && ((int)(((Integer)pair0.first))) == 42;
    }

    public final boolean zzg(int v, int v1, double f) {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.zzd;
        if(mediaCodecInfo$CodecCapabilities0 == null) {
            this.zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = mediaCodecInfo$CodecCapabilities0.getVideoCapabilities();
        if(mediaCodecInfo$VideoCapabilities0 == null) {
            this.zzj("sizeAndRate.vCaps");
            return false;
        }
        if(zzfk.zza >= 29) {
            int v2 = zzrv.zza(mediaCodecInfo$VideoCapabilities0, v, v1, f);
            if(v2 == 2) {
                return true;
            }
            if(v2 == 1) {
                this.zzj("sizeAndRate.cover, " + v + "x" + v1 + "@" + f);
                return false;
            }
        }
        if(!zzrw.zzk(mediaCodecInfo$VideoCapabilities0, v, v1, f)) {
            if(v < v1 && (!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) || !"mcv5a".equals(zzfk.zzb)) && zzrw.zzk(mediaCodecInfo$VideoCapabilities0, v1, v, f)) {
                zzes.zzb("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + v + "x" + v1 + "@" + f) + "] [" + this.zza + ", " + this.zzb + "] [" + zzfk.zze + "]");
                return true;
            }
            this.zzj("sizeAndRate.support, " + v + "x" + v1 + "@" + f);
            return false;
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.zzd;
        if(mediaCodecInfo$CodecCapabilities0 != null) {
            return mediaCodecInfo$CodecCapabilities0.profileLevels == null ? new MediaCodecInfo.CodecProfileLevel[0] : mediaCodecInfo$CodecCapabilities0.profileLevels;
        }
        return new MediaCodecInfo.CodecProfileLevel[0];
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0, int v, int v1) {
        int v2 = mediaCodecInfo$VideoCapabilities0.getWidthAlignment();
        int v3 = mediaCodecInfo$VideoCapabilities0.getHeightAlignment();
        return new Point((v + v2 - 1) / v2 * v2, (v1 + v3 - 1) / v3 * v3);
    }

    private final void zzj(String s) {
        zzes.zzb("MediaCodecInfo", "NoSupport [" + s + "] [" + this.zza + ", " + this.zzb + "] [" + zzfk.zze + "]");
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0, int v, int v1, double f) {
        Point point0 = zzrw.zzi(mediaCodecInfo$VideoCapabilities0, v, v1);
        int v2 = point0.x;
        int v3 = point0.y;
        return f == -1.0 || f < 1.0 ? mediaCodecInfo$VideoCapabilities0.isSizeSupported(v2, v3) : mediaCodecInfo$VideoCapabilities0.areSizeAndRateSupported(v2, v3, Math.floor(f));
    }

    private final boolean zzl(zzam zzam0, boolean z) {
        int v3;
        Pair pair0 = zzsp.zzb(zzam0);
        if(pair0 == null) {
            return true;
        }
        int v = (int)(((Integer)pair0.first));
        int v1 = (int)(((Integer)pair0.second));
        int v2 = 8;
        if("video/dolby-vision".equals(zzam0.zzm)) {
            if("video/avc".equals(this.zzb)) {
                v = 8;
                v1 = 0;
            }
            else if("video/hevc".equals(this.zzb)) {
                v = 2;
                v1 = 0;
            }
        }
        if(!this.zzh && v != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] arr_mediaCodecInfo$CodecProfileLevel = this.zzh();
        if(zzfk.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && arr_mediaCodecInfo$CodecProfileLevel.length == 0) {
            MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.zzd;
            if(mediaCodecInfo$CodecCapabilities0 == null) {
                v3 = 0;
            }
            else {
                MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = mediaCodecInfo$CodecCapabilities0.getVideoCapabilities();
                v3 = mediaCodecInfo$VideoCapabilities0 == null ? 0 : ((int)(((Integer)mediaCodecInfo$VideoCapabilities0.getBitrateRange().getUpper())));
            }
            if(v3 >= 180000000) {
                v2 = 0x400;
            }
            else if(v3 >= 120000000) {
                v2 = 0x200;
            }
            else if(v3 >= 60000000) {
                v2 = 0x100;
            }
            else if(v3 >= 30000000) {
                v2 = 0x80;
            }
            else if(v3 >= 18000000) {
                v2 = 0x40;
            }
            else if(v3 >= 12000000) {
                v2 = 0x20;
            }
            else if(v3 >= 7200000) {
                v2 = 16;
            }
            else if(v3 < 3600000) {
                if(v3 >= 1800000) {
                    v2 = 4;
                }
                else {
                    v2 = v3 < 800000 ? 1 : 2;
                }
            }
            MediaCodecInfo.CodecProfileLevel mediaCodecInfo$CodecProfileLevel0 = new MediaCodecInfo.CodecProfileLevel();
            mediaCodecInfo$CodecProfileLevel0.profile = 1;
            mediaCodecInfo$CodecProfileLevel0.level = v2;
            arr_mediaCodecInfo$CodecProfileLevel = new MediaCodecInfo.CodecProfileLevel[]{mediaCodecInfo$CodecProfileLevel0};
        }
        for(int v4 = 0; v4 < arr_mediaCodecInfo$CodecProfileLevel.length; ++v4) {
            MediaCodecInfo.CodecProfileLevel mediaCodecInfo$CodecProfileLevel1 = arr_mediaCodecInfo$CodecProfileLevel[v4];
            if(mediaCodecInfo$CodecProfileLevel1.profile == v && (mediaCodecInfo$CodecProfileLevel1.level >= v1 || !z) && (!"video/hevc".equals(this.zzb) || v != 2 || !"sailfish".equals(zzfk.zzb) && !"marlin".equals(zzfk.zzb))) {
                return true;
            }
        }
        this.zzj("codec.profileLevel, " + zzam0.zzj + ", " + this.zzc);
        return false;
    }

    private final boolean zzm(zzam zzam0) {
        if(!this.zzb.equals(zzam0.zzm)) {
            String s = zzsp.zze(zzam0);
            return this.zzb.equals(s);
        }
        return true;
    }
}

