package com.google.android.gms.measurement.internal;

enum zzaj {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    FAILSAFE('9');

    private final char zzj;

    private zzaj(char c) {
        this.zzj = c;
    }

    public static zzaj zza(char c) {
        zzaj[] arr_zzaj = zzaj.values();
        for(int v = 0; v < arr_zzaj.length; ++v) {
            zzaj zzaj0 = arr_zzaj[v];
            if(zzaj0.zzj == c) {
                return zzaj0;
            }
        }
        return zzaj.zza;
    }
}

