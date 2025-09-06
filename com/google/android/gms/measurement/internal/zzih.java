package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Map.Entry;

public final class zzih {
    public static enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String zze;

        private zza(String s1) {
            this.zze = s1;
        }
    }

    public static final zzih zza;
    private final EnumMap zzb;
    private final int zzc;

    static {
        zzih.zza = new zzih(null, null, 100);
    }

    public zzih(Boolean boolean0, Boolean boolean1, int v) {
        EnumMap enumMap0 = new EnumMap(zza.class);
        this.zzb = enumMap0;
        enumMap0.put(zza.zza, boolean0);
        enumMap0.put(zza.zzb, boolean1);
        this.zzc = v;
    }

    private zzih(EnumMap enumMap0, int v) {
        EnumMap enumMap1 = new EnumMap(zza.class);
        this.zzb = enumMap1;
        enumMap1.putAll(enumMap0);
        this.zzc = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof zzih)) {
            return false;
        }
        zza[] arr_zzih$zza = zzig.zza.zzd;
        for(int v = 0; v < arr_zzih$zza.length; ++v) {
            zza zzih$zza0 = arr_zzih$zza[v];
            if(zzih.zzb(((Boolean)this.zzb.get(zzih$zza0))) != zzih.zzb(((Boolean)((zzih)object0).zzb.get(zzih$zza0)))) {
                return false;
            }
        }
        return this.zzc == ((zzih)object0).zzc;
    }

    @Override
    public final int hashCode() {
        int v = this.zzc * 17;
        for(Object object0: this.zzb.values()) {
            v = v * 0x1F + zzih.zzb(((Boolean)object0));
        }
        return v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("source=");
        stringBuilder0.append(zzih.zza(this.zzc));
        zza[] arr_zzih$zza = zzig.zza.zzd;
        for(int v = 0; v < arr_zzih$zza.length; ++v) {
            zza zzih$zza0 = arr_zzih$zza[v];
            stringBuilder0.append(",");
            stringBuilder0.append(zzih$zza0.zze);
            stringBuilder0.append("=");
            Boolean boolean0 = (Boolean)this.zzb.get(zzih$zza0);
            if(boolean0 == null) {
                stringBuilder0.append("uninitialized");
            }
            else {
                stringBuilder0.append((boolean0.booleanValue() ? "granted" : "denied"));
            }
        }
        return stringBuilder0.toString();
    }

    static char zza(Boolean boolean0) {
        if(boolean0 == null) {
            return '-';
        }
        return boolean0.booleanValue() ? '1' : '0';
    }

    public static zzih zza(Bundle bundle0, int v) {
        if(bundle0 == null) {
            return new zzih(null, null, v);
        }
        EnumMap enumMap0 = new EnumMap(zza.class);
        zza[] arr_zzih$zza = zzig.zza.zzd;
        for(int v1 = 0; v1 < arr_zzih$zza.length; ++v1) {
            zza zzih$zza0 = arr_zzih$zza[v1];
            enumMap0.put(zzih$zza0, zzih.zzb(bundle0.getString(zzih$zza0.zze)));
        }
        return new zzih(enumMap0, v);
    }

    public static zzih zza(String s) {
        return zzih.zza(s, 100);
    }

    public static zzih zza(String s, int v) {
        EnumMap enumMap0 = new EnumMap(zza.class);
        if(s != null) {
            zza[] arr_zzih$zza = zzig.zza.zza();
            for(int v1 = 0; v1 < arr_zzih$zza.length; ++v1) {
                zza zzih$zza0 = arr_zzih$zza[v1];
                if(v1 + 2 < s.length()) {
                    enumMap0.put(zzih$zza0, zzih.zza(s.charAt(v1 + 2)));
                }
            }
        }
        return new zzih(enumMap0, v);
    }

    static Boolean zza(char c) {
        switch(c) {
            case 0x30: {
                return false;
            }
            case 49: {
                return true;
            }
            default: {
                return null;
            }
        }
    }

    static String zza(int v) {
        if(v != -20) {
            switch(v) {
                case -10: {
                    return "MANIFEST";
                }
                case 0: {
                    return "1P_API";
                }
                case 30: {
                    return "1P_INIT";
                }
                case 90: {
                    return "REMOTE_CONFIG";
                }
                case 100: {
                    return "UNKNOWN";
                }
                default: {
                    return "OTHER";
                }
            }
        }
        return "API";
    }

    public static String zza(Bundle bundle0) {
        zza[] arr_zzih$zza = zzig.zza.zzd;
        for(int v = 0; v < arr_zzih$zza.length; ++v) {
            zza zzih$zza0 = arr_zzih$zza[v];
            if(bundle0.containsKey(zzih$zza0.zze)) {
                String s = bundle0.getString(zzih$zza0.zze);
                if(s != null && zzih.zzb(s) == null) {
                    return s;
                }
            }
        }
        return null;
    }

    // 去混淆评级： 低(20)
    static String zza(boolean z) {
        return z ? "granted" : "denied";
    }

    public static boolean zza(int v, int v1) {
        return v <= v1;
    }

    public final int zza() {
        return this.zzc;
    }

    public final zzih zza(zzih zzih0) {
        EnumMap enumMap0 = new EnumMap(zza.class);
        zza[] arr_zzih$zza = zzig.zza.zzd;
        for(int v = 0; v < arr_zzih$zza.length; ++v) {
            zza zzih$zza0 = arr_zzih$zza[v];
            Boolean boolean0 = (Boolean)this.zzb.get(zzih$zza0);
            Boolean boolean1 = (Boolean)zzih0.zzb.get(zzih$zza0);
            if(boolean0 == null) {
                boolean0 = boolean1;
            }
            else if(boolean1 != null) {
                boolean0 = Boolean.valueOf(boolean0.booleanValue() && boolean1.booleanValue());
            }
            enumMap0.put(zzih$zza0, boolean0);
        }
        return new zzih(enumMap0, 100);
    }

    public final boolean zza(zza zzih$zza0) {
        Boolean boolean0 = (Boolean)this.zzb.get(zzih$zza0);
        return boolean0 == null || boolean0.booleanValue();
    }

    public final boolean zza(zzih zzih0, zza[] arr_zzih$zza) {
        for(int v = 0; v < arr_zzih$zza.length; ++v) {
            zza zzih$zza0 = arr_zzih$zza[v];
            if(!zzih0.zza(zzih$zza0) && this.zza(zzih$zza0)) {
                return true;
            }
        }
        return false;
    }

    private static int zzb(Boolean boolean0) {
        if(boolean0 == null) {
            return 0;
        }
        return boolean0.booleanValue() ? 1 : 2;
    }

    static Boolean zzb(String s) {
        if(s == null) {
            return null;
        }
        if(s.equals("granted")) {
            return true;
        }
        return s.equals("denied") ? false : null;
    }

    public final Bundle zzb() {
        Bundle bundle0 = new Bundle();
        for(Object object0: this.zzb.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Boolean boolean0 = (Boolean)map$Entry0.getValue();
            if(boolean0 != null) {
                bundle0.putString(((zza)map$Entry0.getKey()).zze, zzih.zza(boolean0.booleanValue()));
            }
        }
        return bundle0;
    }

    public final zzih zzb(zzih zzih0) {
        EnumMap enumMap0 = new EnumMap(zza.class);
        zza[] arr_zzih$zza = zzig.zza.zzd;
        for(int v = 0; v < arr_zzih$zza.length; ++v) {
            zza zzih$zza0 = arr_zzih$zza[v];
            Boolean boolean0 = (Boolean)this.zzb.get(zzih$zza0);
            if(boolean0 == null) {
                boolean0 = (Boolean)zzih0.zzb.get(zzih$zza0);
            }
            enumMap0.put(zzih$zza0, boolean0);
        }
        return new zzih(enumMap0, this.zzc);
    }

    public final boolean zzb(zzih zzih0, zza[] arr_zzih$zza) {
        for(int v = 0; v < arr_zzih$zza.length; ++v) {
            zza zzih$zza0 = arr_zzih$zza[v];
            Boolean boolean0 = (Boolean)this.zzb.get(zzih$zza0);
            Boolean boolean1 = (Boolean)zzih0.zzb.get(zzih$zza0);
            if(boolean0 == Boolean.FALSE && boolean1 != Boolean.FALSE) {
                return true;
            }
        }
        return false;
    }

    public final Boolean zzc() {
        return (Boolean)this.zzb.get(zza.zza);
    }

    public final boolean zzc(zzih zzih0) {
        return this.zzb(zzih0, ((zza[])this.zzb.keySet().toArray(new zza[0])));
    }

    public final Boolean zzd() {
        return (Boolean)this.zzb.get(zza.zzb);
    }

    public final String zze() {
        StringBuilder stringBuilder0 = new StringBuilder("G1");
        zza[] arr_zzih$zza = zzig.zza.zza();
        for(int v = 0; v < arr_zzih$zza.length; ++v) {
            stringBuilder0.append(zzih.zza(((Boolean)this.zzb.get(arr_zzih$zza[v]))));
        }
        return stringBuilder0.toString();
    }

    public final String zzf() {
        int v1;
        StringBuilder stringBuilder0 = new StringBuilder("G2");
        zza[] arr_zzih$zza = zzig.zza.zza();
        for(int v = 0; v < arr_zzih$zza.length; ++v) {
            Boolean boolean0 = (Boolean)this.zzb.get(arr_zzih$zza[v]);
            if(boolean0 == null) {
                v1 = 103;
            }
            else {
                v1 = boolean0.booleanValue() ? 71 : 68;
            }
            stringBuilder0.append(((char)v1));
        }
        return stringBuilder0.toString();
    }

    public final boolean zzg() {
        return this.zza(zza.zza);
    }

    public final boolean zzh() {
        return this.zza(zza.zzb);
    }

    public final boolean zzi() {
        for(Object object0: this.zzb.values()) {
            if(((Boolean)object0) != null) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

