package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcou implements zzbnb {
    private final Context zza;
    private final zzaub zzb;
    private final PowerManager zzc;

    public zzcou(Context context0, zzaub zzaub0) {
        this.zza = context0;
        this.zzb = zzaub0;
        this.zzc = (PowerManager)context0.getSystemService("power");
    }

    public final JSONObject zza(zzcox zzcox0) {
        JSONObject jSONObject1;
        JSONArray jSONArray0 = new JSONArray();
        JSONObject jSONObject0 = new JSONObject();
        zzaue zzaue0 = zzcox0.zzf;
        if(zzaue0 == null) {
            jSONObject1 = new JSONObject();
        }
        else if(this.zzb.zzd() != null) {
            boolean z = zzaue0.zza;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcox0.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcox0.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", zzt.zzr().zze()).put("appVolume", ((double)zzt.zzr().zza())).put("deviceVolume", ((double)zzab.zzb(this.zza.getApplicationContext())));
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzfA)).booleanValue()) {
                AudioManager audioManager0 = (AudioManager)this.zza.getApplicationContext().getSystemService("audio");
                Integer integer0 = audioManager0 == null ? null : audioManager0.getMode();
                if(integer0 != null) {
                    jSONObject2.put("audioMode", integer0);
                }
            }
            Rect rect0 = new Rect();
            Display display0 = ((WindowManager)this.zza.getSystemService("window")).getDefaultDisplay();
            rect0.right = display0.getWidth();
            rect0.bottom = display0.getHeight();
            DisplayMetrics displayMetrics0 = this.zza.getResources().getDisplayMetrics();
            jSONObject2.put("windowVisibility", zzaue0.zzb).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzaue0.zzc.top).put("bottom", zzaue0.zzc.bottom).put("left", zzaue0.zzc.left).put("right", zzaue0.zzc.right)).put("adBox", new JSONObject().put("top", zzaue0.zzd.top).put("bottom", zzaue0.zzd.bottom).put("left", zzaue0.zzd.left).put("right", zzaue0.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzaue0.zze.top).put("bottom", zzaue0.zze.bottom).put("left", zzaue0.zze.left).put("right", zzaue0.zze.right)).put("globalVisibleBoxVisible", zzaue0.zzf).put("localVisibleBox", new JSONObject().put("top", zzaue0.zzg.top).put("bottom", zzaue0.zzg.bottom).put("left", zzaue0.zzg.left).put("right", zzaue0.zzg.right)).put("localVisibleBoxVisible", zzaue0.zzh).put("hitBox", new JSONObject().put("top", zzaue0.zzi.top).put("bottom", zzaue0.zzi.bottom).put("left", zzaue0.zzi.left).put("right", zzaue0.zzi.right)).put("screenDensity", ((double)displayMetrics0.density));
            jSONObject2.put("isVisible", zzcox0.zza);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbm)).booleanValue()) {
                JSONArray jSONArray1 = new JSONArray();
                List list0 = zzaue0.zzk;
                if(list0 != null) {
                    for(Object object0: list0) {
                        jSONArray1.put(new JSONObject().put("top", ((Rect)object0).top).put("bottom", ((Rect)object0).bottom).put("left", ((Rect)object0).left).put("right", ((Rect)object0).right));
                    }
                }
                jSONObject2.put("scrollableContainerBoxes", jSONArray1);
            }
            if(!TextUtils.isEmpty(zzcox0.zze)) {
                jSONObject2.put("doneReasonCode", "u");
            }
            jSONObject1 = jSONObject2;
        }
        else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray0.put(jSONObject1);
        jSONObject0.put("units", jSONArray0);
        return jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbnb
    public final JSONObject zzb(Object object0) {
        return this.zza(((zzcox)object0));
    }
}

