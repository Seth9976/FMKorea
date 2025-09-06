package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

final class zzcc implements zzf {
    private final Application zza;
    private final zzby zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zzg zze;
    private final zzaq zzf;
    private final zzbe zzg;
    private final zzas zzh;

    zzcc(Application application0, zzby zzby0, Handler handler0, Executor executor0, zzg zzg0, zzaq zzaq0, zzbe zzbe0, zzas zzas0) {
        this.zza = application0;
        this.zzb = zzby0;
        this.zzc = handler0;
        this.zzd = executor0;
        this.zze = zzg0;
        this.zzf = zzaq0;
        this.zzg = zzbe0;
        this.zzh = zzas0;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzf
    public final Executor zza() {
        return new zzca(this.zzc);
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzf
    public final boolean zzb(String s, JSONObject jSONObject0) {
        int v = -1;
        switch(s) {
            case "browser": {
                this.zzf(jSONObject0);
                return true;
            }
            case "configure_app_assets": {
                zzcb zzcb0 = () -> {
                    String s;
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("app_name", this.zza.getPackageManager().getApplicationLabel(this.zza.getApplicationInfo()).toString());
                        Drawable drawable0 = this.zza.getPackageManager().getApplicationIcon(this.zza.getApplicationInfo());
                        if(drawable0 == null) {
                            s = null;
                        }
                        else {
                            Bitmap bitmap0 = Bitmap.createBitmap(drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas0 = new Canvas(bitmap0);
                            drawable0.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
                            drawable0.draw(canvas0);
                            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                            bitmap0.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream0);
                            s = "data:image/png;base64," + Base64.encodeToString(byteArrayOutputStream0.toByteArray(), 2);
                        }
                        jSONObject0.put("app_icon", s);
                        jSONObject0.put("stored_infos_map", this.zzh.zzc());
                    }
                    catch(JSONException unused_ex) {
                    }
                    this.zzg.zza().zzc("UMP_configureFormWithAppAssets", jSONObject0.toString());
                };
                this.zzd.execute(zzcb0);
                return true;
            }
            case "dismiss": {
                switch(jSONObject0.optString("status")) {
                    case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS": {
                        v = 3;
                        break;
                    }
                    case "CONSENT_SIGNAL_PERSONALIZED_ADS": {
                        v = 1;
                        break;
                    }
                    case "CONSENT_SIGNAL_SUFFICIENT": {
                        v = 4;
                        break;
                    }
                    case "non_personalized": {
                        v = 2;
                        break;
                    }
                    case "personalized": {
                        v = 0;
                    }
                }
                if(v != 0 && v != 1 && v != 2 && v != 3 && v != 4) {
                    zzi zzi0 = new zzi(1, "We are getting something wrong with the webview.");
                    this.zzg.zzd(zzi0);
                    return true;
                }
                this.zzg.zzc(3);
                return true;
            }
            case "load_complete": {
                this.zzg.zze();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    // 检测为 Lambda 实现
    final void zzc() [...]

    final void zzd(String s) {
        Log.d("UserMessagingPlatform", "Receive consent action: " + s);
        Uri uri0 = Uri.parse(s);
        String s1 = uri0.getQueryParameter("action");
        String s2 = uri0.getQueryParameter("args");
        this.zze.zzb(s1, s2, new zzf[]{this, this.zzf});
    }

    final void zze(int v, String s, String s1) {
        zzi zzi0 = new zzi(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", v, s1, s));
        this.zzg.zzf(zzi0);
    }

    private final void zzf(JSONObject jSONObject0) {
        String s = jSONObject0.optString("url");
        if(TextUtils.isEmpty(s)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri uri0 = Uri.parse(s);
        if(uri0.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: " + s);
        }
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW", uri0);
            this.zzb.startActivity(intent0);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: " + s, activityNotFoundException0);
        }
    }
}

