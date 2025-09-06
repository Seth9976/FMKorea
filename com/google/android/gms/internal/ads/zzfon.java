package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zzfon {
    public static final int zza;
    public static final ClipData zzb;

    static {
        zzfon.zza = 0x4000000;
        zzfon.zzb = ClipData.newIntent("", new Intent());
    }

    public static PendingIntent zza(Context context0, int v, Intent intent0, int v1, int v2) {
        zzfri.zzf((v1 & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        zzfri.zzf((v1 & 1) == 0, "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        zzfri.zzf((v1 & 2) == 0, "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        zzfri.zzf((v1 & 4) == 0, "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        zzfri.zzf((v1 & 0x80) == 0, "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        zzfri.zzf(intent0.getComponent() != null, "Must set component on Intent.");
        zzfri.zzf(zzfon.zzb(v1, 0x4000000), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        Intent intent1 = new Intent(intent0);
        if(!zzfon.zzb(v1, 0x4000000)) {
            if(intent1.getPackage() == null) {
                intent1.setPackage(intent1.getComponent().getPackageName());
            }
            if(intent1.getAction() == null) {
                intent1.setAction("");
            }
            if(intent1.getCategories() == null) {
                intent1.addCategory("");
            }
            if(intent1.getData() == null) {
                intent1.setDataAndType(Uri.EMPTY, "*/*");
            }
            if(intent1.getClipData() == null) {
                intent1.setClipData(zzfon.zzb);
            }
        }
        return PendingIntent.getService(context0, 0, intent1, v1);
    }

    private static boolean zzb(int v, int v1) [...] // 潜在的解密器
}

