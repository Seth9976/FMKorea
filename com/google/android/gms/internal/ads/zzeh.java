package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLU;

public final class zzeh {
    public static void zza() {
        StringBuilder stringBuilder0 = new StringBuilder();
        boolean z = false;
        int v;
        while((v = GLES20.glGetError()) != 0) {
            if(z) {
                stringBuilder0.append('\n');
            }
            String s = GLU.gluErrorString(v);
            if(s == null) {
                s = "error code: 0x" + Integer.toHexString(v);
            }
            stringBuilder0.append("glError: ");
            stringBuilder0.append(s);
            z = true;
        }
        if(z) {
            throw new zzeg(stringBuilder0.toString());
        }
    }

    public static void zzb(boolean z, String s) {
        if(!z) {
            throw new zzeg(s);
        }
    }

    public static boolean zzc(Context context0) {
        int v = zzfk.zza;
        if(v < 24) {
            return false;
        }
        if(v < 26 && ("samsung".equals(zzfk.zzc) || "XT1650".equals(zzfk.zzd))) {
            return false;
        }
        return v >= 26 || context0.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance") ? zzef.zzk("EGL_EXT_protected_content") : false;
    }

    public static boolean zzd() {
        return zzef.zzk("EGL_KHR_surfaceless_context");
    }
}

