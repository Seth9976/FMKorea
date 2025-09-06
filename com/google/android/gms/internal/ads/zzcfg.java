package com.google.android.gms.internal.ads;

import android.webkit.ConsoleMessage.MessageLevel;

final class zzcfg {
    static final int[] zza;

    static {
        int[] arr_v = new int[ConsoleMessage.MessageLevel.values().length];
        zzcfg.zza = arr_v;
        try {
            arr_v[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzcfg.zza[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzcfg.zza[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzcfg.zza[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzcfg.zza[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

