package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import java.lang.ref.WeakReference;

public final class zzgzi extends e {
    private final WeakReference zza;

    public zzgzi(zzbcs zzbcs0) {
        this.zza = new WeakReference(zzbcs0);
    }

    @Override  // androidx.browser.customtabs.e
    public final void onCustomTabsServiceConnected(ComponentName componentName0, c c0) {
        zzbcs zzbcs0 = (zzbcs)this.zza.get();
        if(zzbcs0 != null) {
            zzbcs0.zzc(c0);
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        zzbcs zzbcs0 = (zzbcs)this.zza.get();
        if(zzbcs0 != null) {
            zzbcs0.zzd();
        }
    }
}

