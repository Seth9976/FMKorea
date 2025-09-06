package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzaaw implements zzabi {
    private static final int[] zza;
    private static final zzaav zzc;
    private static final zzaav zzd;
    private zzfud zze;
    private final zzaib zzf;

    static {
        zzaaw.zza = new int[]{5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
        zzaaw.zzc = new zzaav(zzaas.zza);
        zzaaw.zzd = new zzaav(zzaat.zza);
    }

    public zzaaw() {
        this.zzf = new zzaib();
    }

    @Override  // com.google.android.gms.internal.ads.zzabi
    public final zzabb[] zza(Uri uri0, Map map0) {
        int v2;
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(16);
            List list0 = (List)map0.get("Content-Type");
            String s = list0 == null || list0.isEmpty() ? null : ((String)list0.get(0));
            int v1 = 2;
            if(s == null) {
            label_63:
                v2 = -1;
            }
            else {
                switch(s) {
                    case "audio/mp3": {
                        s = "audio/mpeg";
                        break;
                    }
                    case "audio/x-flac": {
                        s = "audio/flac";
                        break;
                    }
                    case "audio/x-wav": {
                        s = "audio/wav";
                    }
                }
                switch(s) {
                    case "application/mp4": {
                        v2 = 8;
                        goto label_64;
                    }
                    case "application/webm": {
                        break;
                    }
                    case "audio/3gpp": {
                        v2 = 3;
                        goto label_64;
                    }
                    case "audio/ac3": {
                        v2 = 0;
                        goto label_64;
                    }
                    case "audio/ac4": {
                        v2 = 1;
                        goto label_64;
                    }
                    case "audio/amr": {
                        v2 = 3;
                        goto label_64;
                    }
                    case "audio/amr-wb": {
                        v2 = 3;
                        goto label_64;
                    }
                    case "audio/eac3": {
                        v2 = 0;
                        goto label_64;
                    }
                    case "audio/eac3-joc": {
                        v2 = 0;
                        goto label_64;
                    }
                    case "audio/flac": {
                        v2 = 4;
                        goto label_64;
                    }
                    case "audio/midi": {
                        v2 = 15;
                        goto label_64;
                    }
                    case "audio/mp4": {
                        v2 = 8;
                        goto label_64;
                    }
                    case "audio/mpeg": {
                        v2 = 7;
                        goto label_64;
                    }
                    case "audio/ogg": {
                        v2 = 9;
                        goto label_64;
                    }
                    case "audio/wav": {
                        v2 = 12;
                        goto label_64;
                    }
                    case "video/x-matroska": 
                    case "audio/webm": {
                        break;
                    }
                    case "audio/x-matroska": {
                        break;
                    }
                    case "image/jpeg": {
                        v2 = 14;
                        goto label_64;
                    }
                    case "text/vtt": {
                        v2 = 13;
                        goto label_64;
                    }
                    case "video/mp2p": {
                        v2 = 10;
                        goto label_64;
                    }
                    case "video/mp2t": {
                        v2 = 11;
                        goto label_64;
                    }
                    case "video/mp4": {
                        v2 = 8;
                        goto label_64;
                    }
                    case "video/webm": {
                        break;
                    }
                    case "video/x-flv": {
                        v2 = 5;
                        goto label_64;
                    }
                    case "video/x-msvideo": {
                        v2 = 16;
                        goto label_64;
                    }
                    default: {
                        goto label_63;
                    }
                }
                v2 = 6;
            }
        label_64:
            if(v2 != -1) {
                this.zzb(v2, arrayList0);
            }
            String s1 = uri0.getLastPathSegment();
            if(s1 == null) {
                v1 = -1;
            }
            else if(s1.endsWith(".ac3") || s1.endsWith(".ec3")) {
                v1 = 0;
            }
            else if(s1.endsWith(".ac4")) {
                v1 = 1;
            }
            else if(!s1.endsWith(".adts") && !s1.endsWith(".aac")) {
                if(s1.endsWith(".amr")) {
                    v1 = 3;
                }
                else if(s1.endsWith(".flac")) {
                    v1 = 4;
                }
                else if(s1.endsWith(".flv")) {
                    v1 = 5;
                }
                else if(s1.endsWith(".mid") || s1.endsWith(".midi") || s1.endsWith(".smf")) {
                    v1 = 15;
                }
                else if(s1.startsWith(".mk", s1.length() - 4) || s1.endsWith(".webm")) {
                    v1 = 6;
                }
                else if(s1.endsWith(".mp3")) {
                    v1 = 7;
                }
                else if(s1.endsWith(".mp4") || s1.startsWith(".m4", s1.length() - 4) || s1.startsWith(".mp4", s1.length() - 5) || s1.startsWith(".cmf", s1.length() - 5)) {
                    v1 = 8;
                }
                else if(s1.startsWith(".og", s1.length() - 4) || s1.endsWith(".opus")) {
                    v1 = 9;
                }
                else if(s1.endsWith(".ps") || s1.endsWith(".mpeg") || s1.endsWith(".mpg") || s1.endsWith(".m2p")) {
                    v1 = 10;
                }
                else if(s1.endsWith(".ts") || s1.startsWith(".ts", s1.length() - 4)) {
                    v1 = 11;
                }
                else if(s1.endsWith(".wav") || s1.endsWith(".wave")) {
                    v1 = 12;
                }
                else if(s1.endsWith(".vtt") || s1.endsWith(".webvtt")) {
                    v1 = 13;
                }
                else if(s1.endsWith(".jpg") || s1.endsWith(".jpeg")) {
                    v1 = 14;
                }
                else if(s1.endsWith(".avi")) {
                    v1 = 16;
                }
                else {
                    v1 = -1;
                }
            }
            if(v1 != -1 && v1 != v2) {
                this.zzb(v1, arrayList0);
            }
            int[] arr_v = zzaaw.zza;
            for(int v3 = 0; v3 < 16; ++v3) {
                int v4 = arr_v[v3];
                if(v4 != v2 && v4 != v1) {
                    this.zzb(v4, arrayList0);
                }
            }
            zzabb[] arr_zzabb = new zzabb[arrayList0.size()];
            for(int v5 = 0; v5 < arrayList0.size(); ++v5) {
                arr_zzabb[v5] = (zzabb)arrayList0.get(v5);
            }
            return arr_zzabb;
        }
    }

    private final void zzb(int v, List list0) {
        switch(v) {
            case 0: {
                list0.add(new zzaid());
                return;
            }
            case 1: {
                list0.add(new zzaig());
                return;
            }
            case 2: {
                list0.add(new zzaij(0));
                return;
            }
            case 3: {
                list0.add(new zzacm(0));
                return;
            }
            case 4: {
                zzabb zzabb0 = zzaaw.zzc.zza(new Object[]{0});
                if(zzabb0 != null) {
                    list0.add(zzabb0);
                    return;
                }
                list0.add(new zzadd(0));
                return;
            }
            case 5: {
                list0.add(new zzadg());
                return;
            }
            case 6: {
                list0.add(new zzafu(0));
                return;
            }
            case 7: {
                list0.add(new zzagc(0));
                return;
            }
            case 8: {
                list0.add(new zzagx(0, null));
                list0.add(new zzahc(0));
                return;
            }
            case 9: {
                list0.add(new zzahq());
                return;
            }
            case 10: {
                list0.add(new zzajm());
                return;
            }
            case 11: {
                if(this.zze == null) {
                    this.zze = zzfud.zzl();
                }
                list0.add(new zzajw(1, new zzfi(0L), new zzail(0, this.zze), 112800));
                return;
            }
            case 12: {
                list0.add(new zzaki());
                return;
            }
            case 14: {
                list0.add(new zzadl());
                return;
            }
            case 15: {
                zzabb zzabb1 = zzaaw.zzd.zza(new Object[0]);
                if(zzabb1 != null) {
                    list0.add(zzabb1);
                }
                return;
            }
            case 16: {
                list0.add(new zzacr());
            }
        }
    }
}

