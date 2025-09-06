package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;

public final class zzdto {
    private final Context zza;
    private final ApplicationInfo zzb;
    private final int zzc;
    private final int zzd;
    private String zze;

    public zzdto(Context context0) {
        this.zze = "";
        this.zza = context0;
        this.zzb = context0.getApplicationInfo();
        this.zzc = (int)(((Integer)zzba.zzc().zzb(zzbbr.zziM)));
        this.zzd = (int)(((Integer)zzba.zzc().zzb(zzbbr.zziN)));
    }

    public final JSONObject zza() {
        String s;
        Drawable drawable0;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("name", Wrappers.packageManager(this.zza).getApplicationLabel(this.zzb.packageName));
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        jSONObject0.put("packageName", this.zzb.packageName);
        jSONObject0.put("adMobAppId", zzs.zzn(this.zza));
        if(this.zze.isEmpty()) {
            try {
                drawable0 = null;
                drawable0 = (Drawable)Wrappers.packageManager(this.zza).getApplicationLabelAndIcon(this.zzb.packageName).b;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            if(drawable0 == null) {
                s = "";
            }
            else {
                drawable0.setBounds(0, 0, this.zzc, this.zzd);
                Bitmap bitmap0 = Bitmap.createBitmap(this.zzc, this.zzd, Bitmap.Config.ARGB_8888);
                drawable0.draw(new Canvas(bitmap0));
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                bitmap0.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream0);
                s = Base64.encodeToString(byteArrayOutputStream0.toByteArray(), 2);
            }
            this.zze = s;
        }
        if(!this.zze.isEmpty()) {
            jSONObject0.put("icon", this.zze);
            jSONObject0.put("iconWidthPx", this.zzc);
            jSONObject0.put("iconHeightPx", this.zzd);
        }
        return jSONObject0;
    }
}

