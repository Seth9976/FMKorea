package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

final class zzak {
    private final EnumMap zza;

    zzak() {
        this.zza = new EnumMap(zza.class);
    }

    private zzak(EnumMap enumMap0) {
        EnumMap enumMap1 = new EnumMap(zza.class);
        this.zza = enumMap1;
        enumMap1.putAll(enumMap0);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("1");
        zza[] arr_zzih$zza = zza.values();
        for(int v = 0; v < arr_zzih$zza.length; ++v) {
            zzaj zzaj0 = (zzaj)this.zza.get(arr_zzih$zza[v]);
            if(zzaj0 == null) {
                zzaj0 = zzaj.zza;
            }
            stringBuilder0.append(zzaj0.zzj);
        }
        return stringBuilder0.toString();
    }

    public static zzak zza(String s) {
        int v = 0;
        EnumMap enumMap0 = new EnumMap(zza.class);
        if(s.length() >= zza.values().length && s.charAt(0) == 49) {
            zza[] arr_zzih$zza = zza.values();
            for(int v1 = 1; v < arr_zzih$zza.length; ++v1) {
                enumMap0.put(arr_zzih$zza[v], zzaj.zza(s.charAt(v1)));
                ++v;
            }
            return new zzak(enumMap0);
        }
        return new zzak();
    }

    public final zzaj zza(zza zzih$zza0) {
        zzaj zzaj0 = (zzaj)this.zza.get(zzih$zza0);
        return zzaj0 == null ? zzaj.zza : zzaj0;
    }

    public final void zza(zza zzih$zza0, int v) {
        zzaj zzaj0 = zzaj.zza;
        if(v == -20) {
            zzaj0 = zzaj.zzf;
        }
        else {
            switch(v) {
                case -10: {
                    zzaj0 = zzaj.zzd;
                    break;
                }
                case 0: {
                    zzaj0 = zzaj.zzf;
                    break;
                }
                default: {
                    if(v == 30) {
                        zzaj0 = zzaj.zze;
                    }
                }
            }
        }
        this.zza.put(zzih$zza0, zzaj0);
    }

    public final void zza(zza zzih$zza0, zzaj zzaj0) {
        this.zza.put(zzih$zza0, zzaj0);
    }
}

