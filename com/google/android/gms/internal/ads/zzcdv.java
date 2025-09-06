package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcdv implements zzbir {
    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzcdu zzcdu0;
        zzcdm zzcdm0;
        if(zzcaa.zzm(3)) {
            JSONObject jSONObject0 = new JSONObject(map0);
            jSONObject0.remove("google.afma.Notify_dt");
            zzcaa.zze(("Precache GMSG: " + jSONObject0.toString()));
        }
        zzcdn zzcdn0 = zzt.zzy();
        if(map0.containsKey("abort")) {
            if(zzcdn0.zzd(((zzccj)object0))) {
                return;
            }
            zzcaa.zzj("Precache abort but no precache task running.");
            return;
        }
        String s = (String)map0.get("src");
        Integer integer0 = zzcdv.zzb(map0, "periodicReportIntervalMs");
        Integer integer1 = zzcdv.zzb(map0, "exoPlayerRenderingIntervalMs");
        Integer integer2 = zzcdv.zzb(map0, "exoPlayerIdleIntervalMs");
        zzcci zzcci0 = new zzcci(((String)map0.get("flags")));
        boolean z = zzcci0.zzl;
        if(s != null) {
            String[] arr_s = {s};
            String s1 = (String)map0.get("demuxed");
            if(s1 != null) {
                try {
                    JSONArray jSONArray0 = new JSONArray(s1);
                    String[] arr_s1 = new String[jSONArray0.length()];
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        arr_s1[v] = jSONArray0.getString(v);
                    }
                    arr_s = arr_s1;
                }
                catch(JSONException unused_ex) {
                    zzcaa.zzj(("Malformed demuxed URL list for precache: " + s1));
                    arr_s = null;
                }
            }
            if(arr_s == null) {
                arr_s = new String[]{s};
            }
            if(z) {
                zzcdm0 = null;
                for(Object object1: zzcdn0) {
                    zzcdm zzcdm1 = (zzcdm)object1;
                    if(zzcdm1.zza == ((zzccj)object0) && s.equals(zzcdm1.zze())) {
                        zzcdm0 = zzcdm1;
                        break;
                    }
                }
            }
            else {
                zzcdm0 = zzcdn0.zza(((zzccj)object0));
            }
            if(zzcdm0 != null) {
                zzcaa.zzj("Precache task is already running.");
                return;
            }
            if(((zzccj)object0).zzj() == null) {
                zzcaa.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer integer3 = zzcdv.zzb(map0, "player");
            if(integer3 == null) {
                integer3 = 0;
            }
            if(integer0 != null) {
                ((zzccj)object0).zzA(((int)integer0));
            }
            if(integer1 != null) {
                ((zzccj)object0).zzy(((int)integer1));
            }
            if(integer2 != null) {
                ((zzccj)object0).zzx(((int)integer2));
            }
            ((zzccj)object0).zzj();
            if(((int)integer3) > 0) {
                int v1 = zzcca.zzu();
                if(v1 < zzcci0.zzh) {
                    zzcdu0 = new zzced(((zzccj)object0), zzcci0);
                }
                else if(v1 < zzcci0.zzb) {
                    zzcdu0 = new zzcea(((zzccj)object0), zzcci0);
                }
                else {
                    zzcdu0 = new zzcdy(((zzccj)object0));
                }
            }
            else {
                zzcdu0 = new zzcdx(((zzccj)object0));
            }
            new zzcdm(((zzccj)object0), zzcdu0, s, arr_s).zzb();
            goto label_74;
        }
        zzcdm zzcdm2 = zzcdn0.zza(((zzccj)object0));
        if(zzcdm2 != null) {
            zzcdu0 = zzcdm2.zzb;
        label_74:
            Integer integer4 = zzcdv.zzb(map0, "minBufferMs");
            if(integer4 != null) {
                zzcdu0.zzs(((int)integer4));
            }
            Integer integer5 = zzcdv.zzb(map0, "maxBufferMs");
            if(integer5 != null) {
                zzcdu0.zzr(((int)integer5));
            }
            Integer integer6 = zzcdv.zzb(map0, "bufferForPlaybackMs");
            if(integer6 != null) {
                zzcdu0.zzp(((int)integer6));
            }
            Integer integer7 = zzcdv.zzb(map0, "bufferForPlaybackAfterRebufferMs");
            if(integer7 != null) {
                zzcdu0.zzq(((int)integer7));
            }
            return;
        }
        zzcaa.zzj("Precache must specify a source.");
    }

    private static final Integer zzb(Map map0, String s) {
        if(!map0.containsKey(s)) {
            return null;
        }
        try {
            return Integer.parseInt(((String)map0.get(s)));
        }
        catch(NumberFormatException unused_ex) {
            zzcaa.zzj(("Precache invalid numeric parameter \'" + s + "\': " + ((String)map0.get(s))));
            return null;
        }
    }
}

