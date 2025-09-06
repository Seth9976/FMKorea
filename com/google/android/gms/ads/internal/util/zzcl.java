package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzcl {
    private static final Map zza;
    private static List zzb;
    private static final Object zzc;

    static {
        zzcl.zza = new HashMap();
        zzcl.zzc = new Object();
    }

    public static List zza(String s) {
        Object object0 = zzcl.zzc;
        synchronized(object0) {
            Map map0 = zzcl.zza;
            if(map0.containsKey(s)) {
                return (List)map0.get(s);
            }
            try {
                __monitor_enter(object0);
            }
            catch(RuntimeException | LinkageError runtimeException0) {
                goto label_51;
            }
            try {
                if(zzcl.zzb == null) {
                    zzcl.zzb = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                }
                goto label_18;
            }
            catch(Throwable throwable0) {
                try {
                    __monitor_exit(object0);
                    throw throwable0;
                label_18:
                    __monitor_exit(object0);
                    List list1 = new ArrayList();
                    for(Object object1: zzcl.zzb) {
                        MediaCodecInfo mediaCodecInfo0 = (MediaCodecInfo)object1;
                        if(!mediaCodecInfo0.isEncoder() && Arrays.asList(mediaCodecInfo0.getSupportedTypes()).contains(s)) {
                            HashMap hashMap0 = new HashMap();
                            hashMap0.put("codecName", mediaCodecInfo0.getName());
                            MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = mediaCodecInfo0.getCapabilitiesForType(s);
                            ArrayList arrayList0 = new ArrayList();
                            MediaCodecInfo.CodecProfileLevel[] arr_mediaCodecInfo$CodecProfileLevel = mediaCodecInfo$CodecCapabilities0.profileLevels;
                            for(int v1 = 0; v1 < arr_mediaCodecInfo$CodecProfileLevel.length; ++v1) {
                                MediaCodecInfo.CodecProfileLevel mediaCodecInfo$CodecProfileLevel0 = arr_mediaCodecInfo$CodecProfileLevel[v1];
                                arrayList0.add(new Integer[]{mediaCodecInfo$CodecProfileLevel0.profile, mediaCodecInfo$CodecProfileLevel0.level});
                            }
                            hashMap0.put("profileLevels", arrayList0);
                            MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = mediaCodecInfo$CodecCapabilities0.getVideoCapabilities();
                            hashMap0.put("bitRatesBps", zzcl.zzb(mediaCodecInfo$VideoCapabilities0.getBitrateRange()));
                            hashMap0.put("widthAlignment", mediaCodecInfo$VideoCapabilities0.getWidthAlignment());
                            hashMap0.put("heightAlignment", mediaCodecInfo$VideoCapabilities0.getHeightAlignment());
                            hashMap0.put("frameRates", zzcl.zzb(mediaCodecInfo$VideoCapabilities0.getSupportedFrameRates()));
                            hashMap0.put("widths", zzcl.zzb(mediaCodecInfo$VideoCapabilities0.getSupportedWidths()));
                            hashMap0.put("heights", zzcl.zzb(mediaCodecInfo$VideoCapabilities0.getSupportedHeights()));
                            hashMap0.put("instancesLimit", mediaCodecInfo$CodecCapabilities0.getMaxSupportedInstances());
                            ((ArrayList)list1).add(hashMap0);
                        }
                    }
                    zzcl.zza.put(s, list1);
                    return list1;
                }
                catch(RuntimeException | LinkageError runtimeException0) {
                }
            }
        label_51:
            HashMap hashMap1 = new HashMap();
            hashMap1.put("error", runtimeException0.getClass().getSimpleName());
            List list2 = new ArrayList();
            ((ArrayList)list2).add(hashMap1);
            zzcl.zza.put(s, list2);
            return list2;
        }
    }

    @TargetApi(21)
    private static Integer[] zzb(Range range0) {
        return new Integer[]{((Integer)range0.getLower()), ((Integer)range0.getUpper())};
    }
}

