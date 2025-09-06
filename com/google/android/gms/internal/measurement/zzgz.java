package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;

public final class zzgz implements SharedPreferences.OnSharedPreferenceChangeListener {
    private zzgw zza;

    public zzgz(zzgw zzgw0) {
        this.zza = zzgw0;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        this.zza.zza(sharedPreferences0, s);
    }
}

