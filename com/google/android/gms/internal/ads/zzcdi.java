package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzcl;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcdi implements zzbir {
    private boolean zza;

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        int v9;
        int v7;
        Integer integer2;
        int v = 0;
        zzccj zzccj0 = (zzccj)object0;
        String s = (String)map0.get("action");
        if(s == null) {
            zzcaa.zzj("Action missing from video GMSG.");
            return;
        }
        Integer integer0 = map0.containsKey("playerId") ? Integer.parseInt(((String)map0.get("playerId"))) : null;
        Integer integer1 = zzccj0.zzo() == null ? null : zzccj0.zzo().zzb();
        if(integer0 != null && integer1 != null && !integer0.equals(integer1) && !s.equals("load")) {
            zzcaa.zzi(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", integer0, integer1));
            return;
        }
        if(zzcaa.zzm(3)) {
            JSONObject jSONObject0 = new JSONObject(map0);
            jSONObject0.remove("google.afma.Notify_dt");
            zzcaa.zze(("Video GMSG: " + s + " " + jSONObject0.toString()));
        }
        if("background".equals(s)) {
            String s1 = (String)map0.get("color");
            if(TextUtils.isEmpty(s1)) {
                zzcaa.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzccj0.setBackgroundColor(Color.parseColor(s1));
            }
            catch(IllegalArgumentException unused_ex) {
                zzcaa.zzj("Invalid color parameter in background video GMSG.");
            }
            return;
        }
        if("playerBackground".equals(s)) {
            String s2 = (String)map0.get("color");
            if(TextUtils.isEmpty(s2)) {
                zzcaa.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzccj0.zzB(Color.parseColor(s2));
            }
            catch(IllegalArgumentException unused_ex) {
                zzcaa.zzj("Invalid color parameter in playerBackground video GMSG.");
            }
            return;
        }
        if("decoderProps".equals(s)) {
            String s3 = (String)map0.get("mimeTypes");
            if(s3 == null) {
                zzcaa.zzj("No MIME types specified for decoder properties inspection.");
                HashMap hashMap0 = new HashMap();
                hashMap0.put("event", "decoderProps");
                hashMap0.put("error", "missingMimeTypes");
                zzccj0.zzd("onVideoEvent", hashMap0);
                return;
            }
            HashMap hashMap1 = new HashMap();
            String[] arr_s = s3.split(",");
            while(v < arr_s.length) {
                String s4 = arr_s[v];
                hashMap1.put(s4, zzcl.zza(s4.trim()));
                ++v;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("event", "decoderProps");
            hashMap2.put("mimeTypes", hashMap1);
            zzccj0.zzd("onVideoEvent", hashMap2);
            return;
        }
        zzcby zzcby0 = zzccj0.zzo();
        if(zzcby0 == null) {
            zzcaa.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean z = "new".equals(s);
        if(!z && !"position".equals(s)) {
            zzcge zzcge0 = zzccj0.zzq();
            if(zzcge0 != null) {
                if("timeupdate".equals(s)) {
                    String s5 = (String)map0.get("currentTime");
                    if(s5 == null) {
                        zzcaa.zzj("currentTime parameter missing from timeupdate video GMSG.");
                        return;
                    }
                    try {
                        zzcge0.zzt(Float.parseFloat(s5));
                    }
                    catch(NumberFormatException unused_ex) {
                        zzcaa.zzj(("Could not parse currentTime parameter from timeupdate video GMSG: " + s5));
                    }
                    return;
                }
                if("skip".equals(s)) {
                    zzcge0.zzu();
                    return;
                }
            }
            zzcbx zzcbx0 = zzcby0.zza();
            if(zzcbx0 == null) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("event", "no_video_view");
                zzccj0.zzd("onVideoEvent", hashMap3);
                return;
            }
            if("click".equals(s)) {
                Context context0 = zzccj0.getContext();
                int v1 = zzcdi.zzb(context0, map0, "x", 0);
                float f = (float)zzcdi.zzb(context0, map0, "y", 0);
                long v2 = SystemClock.uptimeMillis();
                MotionEvent motionEvent0 = MotionEvent.obtain(v2, v2, 0, ((float)v1), f, 0);
                zzcbx0.zzx(motionEvent0);
                motionEvent0.recycle();
                return;
            }
            if("currentTime".equals(s)) {
                String s6 = (String)map0.get("time");
                if(s6 == null) {
                    zzcaa.zzj("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    zzcbx0.zzw(((int)(Float.parseFloat(s6) * 1000.0f)));
                }
                catch(NumberFormatException unused_ex) {
                    zzcaa.zzj(("Could not parse time parameter from currentTime video GMSG: " + s6));
                }
                return;
            }
            if("hide".equals(s)) {
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzG)).booleanValue()) {
                    zzcbx0.setVisibility(8);
                    return;
                }
                zzcbx0.setVisibility(4);
                return;
            }
            if("load".equals(s)) {
                zzcbx0.zzr(integer0);
                return;
            }
            if("loadControl".equals(s)) {
                zzcdi.zzc(zzcbx0, map0);
                return;
            }
            if("muted".equals(s)) {
                if(Boolean.parseBoolean(((String)map0.get("muted")))) {
                    zzcbx0.zzs();
                    return;
                }
                zzcbx0.zzI();
                return;
            }
            if("pause".equals(s)) {
                zzcbx0.zzu();
                return;
            }
            if("play".equals(s)) {
                zzcbx0.zzv();
                return;
            }
            if("show".equals(s)) {
                zzcbx0.setVisibility(0);
                return;
            }
            if("src".equals(s)) {
                String s7 = (String)map0.get("src");
                if(map0.containsKey("periodicReportIntervalMs")) {
                    try {
                        integer2 = Integer.parseInt(((String)map0.get("periodicReportIntervalMs")));
                    }
                    catch(NumberFormatException unused_ex) {
                        zzcaa.zzj(("Video gmsg invalid numeric parameter \'periodicReportIntervalMs\': " + ((String)map0.get("periodicReportIntervalMs"))));
                        integer2 = null;
                    }
                }
                else {
                    integer2 = null;
                }
                String[] arr_s1 = {s7};
                String s8 = (String)map0.get("demuxed");
                if(s8 != null) {
                    try {
                        JSONArray jSONArray0 = new JSONArray(s8);
                        String[] arr_s2 = new String[jSONArray0.length()];
                        for(int v3 = 0; v3 < jSONArray0.length(); ++v3) {
                            arr_s2[v3] = jSONArray0.getString(v3);
                        }
                        arr_s1 = arr_s2;
                    }
                    catch(JSONException unused_ex) {
                        zzcaa.zzj(("Malformed demuxed URL list for playback: " + s8));
                        arr_s1 = new String[]{s7};
                    }
                }
                if(integer2 != null) {
                    zzccj0.zzA(((int)integer2));
                }
                zzcbx0.zzE(s7, arr_s1);
                return;
            }
            if("touchMove".equals(s)) {
                Context context1 = zzccj0.getContext();
                zzcbx0.zzH(((float)zzcdi.zzb(context1, map0, "dx", 0)), ((float)zzcdi.zzb(context1, map0, "dy", 0)));
                if(this.zza) {
                    return;
                }
                zzccj0.zzu();
                this.zza = true;
                return;
            }
            if("volume".equals(s)) {
                String s9 = (String)map0.get("volume");
                if(s9 == null) {
                    zzcaa.zzj("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    zzcbx0.zzG(Float.parseFloat(s9));
                }
                catch(NumberFormatException unused_ex) {
                    zzcaa.zzj(("Could not parse volume parameter from volume video GMSG: " + s9));
                }
                return;
            }
            if("watermark".equals(s)) {
                zzcbx0.zzn();
                return;
            }
            zzcaa.zzj(("Unknown video action: " + s));
            return;
        }
        Context context2 = zzccj0.getContext();
        int v4 = zzcdi.zzb(context2, map0, "x", 0);
        int v5 = zzcdi.zzb(context2, map0, "y", 0);
        int v6 = zzcdi.zzb(context2, map0, "w", -1);
        zzbbj zzbbj0 = zzbbr.zzdG;
        if(!((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue()) {
            if(zze.zzc()) {
                zze.zza(("Calculate width with original width " + v6 + ", videoHost.getVideoBoundingWidth() " + zzccj0.zzh() + ", x " + v4 + "."));
            }
            v7 = Math.min(v6, zzccj0.zzh() - v4);
        }
        else if(v6 == -1) {
            v7 = zzccj0.zzh();
        }
        else {
            v7 = Math.min(v6, zzccj0.zzh());
        }
        int v8 = zzcdi.zzb(context2, map0, "h", -1);
        if(!((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue()) {
            if(zze.zzc()) {
                zze.zza(("Calculate height with original height " + v8 + ", videoHost.getVideoBoundingHeight() " + zzccj0.zzg() + ", y " + v5 + "."));
            }
            v9 = Math.min(v8, zzccj0.zzg() - v5);
        }
        else if(v8 == -1) {
            v9 = zzccj0.zzg();
        }
        else {
            v9 = Math.min(v8, zzccj0.zzg());
        }
        try {
            v = Integer.parseInt(((String)map0.get("player")));
        }
        catch(NumberFormatException unused_ex) {
        }
        boolean z1 = Boolean.parseBoolean(((String)map0.get("spherical")));
        if(z && zzcby0.zza() == null) {
            zzcby0.zzd(v4, v5, v7, v9, v, z1, new zzcci(((String)map0.get("flags"))));
            zzcbx zzcbx1 = zzcby0.zza();
            if(zzcbx1 != null) {
                zzcdi.zzc(zzcbx1, map0);
            }
            return;
        }
        zzcby0.zzc(v4, v5, v7, v9);
    }

    private static int zzb(Context context0, Map map0, String s, int v) {
        String s1 = (String)map0.get(s);
        if(s1 != null) {
            try {
                v = zzbzt.zzx(context0, Integer.parseInt(s1));
            }
            catch(NumberFormatException unused_ex) {
                zzcaa.zzj(("Could not parse " + s + " in a video GMSG: " + s1));
            }
        }
        if(zze.zzc()) {
            zze.zza(("Parse pixels for " + s + ", got string " + s1 + ", int " + v + "."));
        }
        return v;
    }

    private static void zzc(zzcbx zzcbx0, Map map0) {
        String s = (String)map0.get("minBufferMs");
        String s1 = (String)map0.get("maxBufferMs");
        String s2 = (String)map0.get("bufferForPlaybackMs");
        String s3 = (String)map0.get("bufferForPlaybackAfterRebufferMs");
        String s4 = (String)map0.get("socketReceiveBufferSize");
        try {
            if(s != null) {
                zzcbx0.zzB(Integer.parseInt(s));
            }
            if(s1 != null) {
                zzcbx0.zzA(Integer.parseInt(s1));
            }
            if(s2 != null) {
                zzcbx0.zzy(Integer.parseInt(s2));
            }
            if(s3 != null) {
                zzcbx0.zzz(Integer.parseInt(s3));
            }
            if(s4 != null) {
                zzcbx0.zzD(Integer.parseInt(s4));
            }
        }
        catch(NumberFormatException unused_ex) {
            zzcaa.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", s, s1));
        }
    }
}

