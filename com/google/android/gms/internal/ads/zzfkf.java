package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzfkf {
    public static float zza(View view0) {
        return view0.getZ();
    }

    public static String zzb(View view0) {
        if(view0.isAttachedToWindow()) {
            int v = view0.getVisibility();
            if(v == 8) {
                return "viewGone";
            }
            switch(v) {
                case 0: {
                    return view0.getAlpha() == 0.0f ? "viewAlphaZero" : null;
                }
                case 4: {
                    return "viewInvisible";
                }
                default: {
                    return "viewNotVisible";
                }
            }
        }
        return "notAttached";
    }
}

