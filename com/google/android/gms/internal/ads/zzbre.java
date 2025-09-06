package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbre extends zzbrf implements zzbir {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcfi zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbbb zzk;
    private float zzl;
    private int zzm;

    public zzbre(zzcfi zzcfi0, Context context0, zzbbb zzbbb0) {
        super(zzcfi0, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcfi0;
        this.zzi = context0;
        this.zzk = zzbbb0;
        this.zzj = (WindowManager)context0.getSystemService("window");
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        JSONObject jSONObject0;
        zzcfi zzcfi0 = (zzcfi)object0;
        this.zza = new DisplayMetrics();
        Display display0 = this.zzj.getDefaultDisplay();
        display0.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = display0.getRotation();
        this.zzb = zzbzt.zzv(this.zza, this.zza.widthPixels);
        this.zzc = zzbzt.zzv(this.zza, this.zza.heightPixels);
        Activity activity0 = this.zzh.zzi();
        if(activity0 == null || activity0.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        }
        else {
            int[] arr_v = zzs.zzN(activity0);
            this.zzd = zzbzt.zzv(this.zza, arr_v[0]);
            this.zze = zzbzt.zzv(this.zza, arr_v[1]);
        }
        if(this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        }
        else {
            this.zzh.measure(0, 0);
        }
        this.zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbrd zzbrd0 = new zzbrd();
        Intent intent0 = new Intent("android.intent.action.DIAL");
        intent0.setData(Uri.parse("tel:"));
        zzbrd0.zze(this.zzk.zza(intent0));
        Intent intent1 = new Intent("android.intent.action.VIEW");
        intent1.setData(Uri.parse("sms:"));
        zzbrd0.zzc(this.zzk.zza(intent1));
        zzbrd0.zza(this.zzk.zzb());
        zzbrd0.zzd(this.zzk.zzc());
        zzbrd0.zzb(true);
        zzcfi zzcfi1 = this.zzh;
        try {
            jSONObject0 = new JSONObject().put("sms", zzbrd0.zza).put("tel", zzbrd0.zzb).put("calendar", zzbrd0.zzc).put("storePicture", zzbrd0.zzd).put("inlineVideo", zzbrd0.zze);
        }
        catch(JSONException jSONException0) {
            zzcaa.zzh("Error occurred while obtaining the MRAID capabilities.", jSONException0);
            jSONObject0 = null;
        }
        zzcfi1.zze("onDeviceFeaturesReceived", jSONObject0);
        int[] arr_v1 = new int[2];
        this.zzh.getLocationOnScreen(arr_v1);
        this.zzb(zzay.zzb().zzb(this.zzi, arr_v1[0]), zzay.zzb().zzb(this.zzi, arr_v1[1]));
        if(zzcaa.zzm(2)) {
            zzcaa.zzi("Dispatching Ready Event.");
        }
        this.zzh(this.zzh.zzn().zza);
    }

    public final void zzb(int v, int v1) {
        int v2 = 0;
        int v3 = this.zzi instanceof Activity ? zzs.zzO(((Activity)this.zzi))[0] : 0;
        if(this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            int v4 = this.zzh.getWidth();
            int v5 = this.zzh.getHeight();
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzS)).booleanValue()) {
                if(v4 == 0) {
                    v4 = this.zzh.zzO() == null ? 0 : this.zzh.zzO().zzb;
                }
                if(v5 != 0) {
                    v2 = v5;
                }
                else if(this.zzh.zzO() != null) {
                    v2 = this.zzh.zzO().zza;
                }
            }
            else {
                v2 = v5;
            }
            this.zzf = zzay.zzb().zzb(this.zzi, v4);
            this.zzg = zzay.zzb().zzb(this.zzi, v2);
        }
        this.zzf(v, v1 - v3, this.zzf, this.zzg);
        this.zzh.zzN().zzB(v, v1);
    }
}

