package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

public class zzfw {
    private static UserManager zza;
    private static volatile boolean zzb;
    private static boolean zzc;

    static {
        zzfw.zzb = false;
        zzfw.zzc = false;
    }

    public static boolean zza() [...] // 潜在的解密器

    // 去混淆评级： 低(40)
    public static boolean zza(Context context0) {
        return !zzfw.zzc(context0);
    }

    // 去混淆评级： 低(40)
    public static boolean zzb(Context context0) {
        return zzfw.zzc(context0);
    }

    @TargetApi(24)
    private static boolean zzc(Context context0) {
        if(zzfw.zzb) {
            return true;
        }
        synchronized(zzfw.class) {
            if(zzfw.zzb) {
                return true;
            }
            boolean z = zzfw.zzd(context0);
            if(z) {
                zzfw.zzb = true;
            }
            return z;
        }
    }

    @TargetApi(24)
    private static boolean zzd(Context context0) {
        boolean z = true;
        int v = 1;
        while(true) {
            if(zzfw.zza == null) {
                zzfw.zza = (UserManager)context0.getSystemService(UserManager.class);
            }
            UserManager userManager0 = zzfw.zza;
            if(userManager0 == null) {
                return true;
            }
            try {
                if(userManager0.isUserUnlocked() || !userManager0.isUserRunning(Process.myUserHandle())) {
                    break;
                }
            }
            catch(NullPointerException nullPointerException0) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", nullPointerException0);
                zzfw.zza = null;
                ++v;
                continue;
            }
            z = false;
            break;
        }
        if(z) {
            zzfw.zza = null;
        }
        return z;
    }
}

