package com.google.android.gms.internal.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzbrc extends zzbrf {
    private final Map zza;
    private final Context zzb;

    public zzbrc(zzcfi zzcfi0, Map map0) {
        super(zzcfi0, "storePicture");
        this.zza = map0;
        this.zzb = zzcfi0.zzi();
    }

    public final void zzb() {
        if(this.zzb == null) {
            this.zzg("Activity context is not available");
            return;
        }
        if(!new zzbbb(this.zzb).zzc()) {
            this.zzg("Feature is not supported by the device.");
            return;
        }
        String s = (String)this.zza.get("iurl");
        if(TextUtils.isEmpty(s)) {
            this.zzg("Image url cannot be empty.");
            return;
        }
        if(URLUtil.isValidUrl(s)) {
            String s1 = Uri.parse(s).getLastPathSegment();
            if(!TextUtils.isEmpty(s1) && s1.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources resources0 = zzt.zzo().zzd();
                AlertDialog.Builder alertDialog$Builder0 = zzs.zzH(this.zzb);
                alertDialog$Builder0.setTitle((resources0 == null ? "Save image" : resources0.getString(string.s1)));
                alertDialog$Builder0.setMessage((resources0 == null ? "Allow Ad to store image in Picture gallery?" : resources0.getString(string.s2)));
                alertDialog$Builder0.setPositiveButton((resources0 == null ? "Accept" : resources0.getString(string.s3)), new zzbra(this, s, s1));
                alertDialog$Builder0.setNegativeButton((resources0 == null ? "Decline" : resources0.getString(string.s4)), new zzbrb(this));
                alertDialog$Builder0.create().show();
                return;
            }
            this.zzg("Image type not recognized: " + s1);
            return;
        }
        this.zzg("Invalid image url: " + s);
    }
}

