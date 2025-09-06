package com.google.android.gms.internal.ads;

import Z1.d;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

public final class zzdko {
    private final zzbo zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdko(zzbo zzbo0, Clock clock0, Executor executor0) {
        this.zza = zzbo0;
        this.zzb = clock0;
        this.zzc = executor0;
    }

    // 检测为 Lambda 实现
    final Bitmap zza(double f, boolean z, zzall zzall0) [...]

    public final d zzb(String s, double f, boolean z) {
        return zzfye.zzm(this.zza.zza(s), (zzall zzall0) -> {
            byte[] arr_b = zzall0.zzb;
            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
            bitmapFactory$Options0.inDensity = (int)(((long)f) * 0x4064000000000000L);
            if(!z) {
                bitmapFactory$Options0.inPreferredConfig = Bitmap.Config.RGB_565;
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzfY)).booleanValue()) {
                bitmapFactory$Options0.inJustDecodeBounds = true;
                this.zzc(arr_b, bitmapFactory$Options0);
                bitmapFactory$Options0.inJustDecodeBounds = false;
                int v = bitmapFactory$Options0.outWidth * bitmapFactory$Options0.outHeight;
                if(v > 0) {
                    bitmapFactory$Options0.inSampleSize = 1 << (33 - Integer.numberOfLeadingZeros((v - 1) / ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzfZ)))))) / 2;
                }
            }
            return this.zzc(arr_b, bitmapFactory$Options0);
        }, this.zzc);
    }

    private final Bitmap zzc(byte[] arr_b, BitmapFactory.Options bitmapFactory$Options0) {
        long v = this.zzb.elapsedRealtime();
        boolean z = false;
        Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
        long v1 = this.zzb.elapsedRealtime();
        if(bitmap0 != null) {
            int v2 = bitmap0.getWidth();
            int v3 = bitmap0.getHeight();
            int v4 = bitmap0.getAllocationByteCount();
            if(Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            zze.zza(("Decoded image w: " + v2 + " h:" + v3 + " bytes: " + v4 + " time: " + (v1 - v) + " on ui thread: " + z));
        }
        return bitmap0;
    }
}

