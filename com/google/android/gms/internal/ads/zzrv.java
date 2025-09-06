package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint;
import android.media.MediaCodecInfo.VideoCapabilities;
import java.util.List;

final class zzrv {
    public static int zza(MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0, int v, int v1, double f) {
        List list0 = mediaCodecInfo$VideoCapabilities0.getSupportedPerformancePoints();
        if(list0 != null && !list0.isEmpty() && (!zzfk.zzb.equals("sabrina") && !zzfk.zzb.equals("boreal")) && (!zzfk.zzd.startsWith("Lenovo TB-X605") && !zzfk.zzd.startsWith("Lenovo TB-X606") && !zzfk.zzd.startsWith("Lenovo TB-X616"))) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint mediaCodecInfo$VideoCapabilities$PerformancePoint0 = M0.a(v, v1, ((int)f));
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                if(K0.a(list0.get(v2)).covers(mediaCodecInfo$VideoCapabilities$PerformancePoint0)) {
                    return 2;
                }
            }
            return 1;
        }
        return 0;
    }
}

