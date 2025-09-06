package com.google.android.gms.stats;

import U.a;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@KeepForSdk
@ShowFirstParty
public abstract class GCoreWakefulBroadcastReceiver extends a {
    @KeepForSdk
    public static boolean completeWakefulIntent(Context context0, Intent intent0) {
        return intent0 == null ? false : a.completeWakefulIntent(intent0);
    }
}

