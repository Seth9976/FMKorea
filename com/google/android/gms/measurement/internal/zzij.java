package com.google.android.gms.measurement.internal;

public final class zzij {
    public static final String[] zza;
    public static final String[] zzb;

    static {
        zzij.zza = new String[]{"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "gbraid", "session_number", "session_id"};
        zzij.zzb = new String[]{"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_gbraid", "_sno", "_sid"};
    }

    public static String zza(String s) {
        return zzkf.zza(s, zzij.zza, zzij.zzb);
    }
}

