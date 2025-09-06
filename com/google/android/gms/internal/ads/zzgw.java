package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;

final class zzgw {
    private static boolean zzb(Throwable throwable0) {
        return throwable0 instanceof ErrnoException && ((ErrnoException)throwable0).errno == OsConstants.EACCES;
    }
}

