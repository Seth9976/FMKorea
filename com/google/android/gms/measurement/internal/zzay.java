package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Map.Entry;

public final class zzay {
    public static final zzay zza;
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap zzf;

    static {
        zzay.zza = new zzay(null, 100);
    }

    zzay(Boolean boolean0, int v) {
        this(boolean0, v, null, null);
    }

    zzay(Boolean boolean0, int v, Boolean boolean1, String s) {
        EnumMap enumMap0 = new EnumMap(zza.class);
        this.zzf = enumMap0;
        enumMap0.put(zza.zzc, boolean0);
        this.zzb = v;
        this.zzc = this.zzh();
        this.zzd = boolean1;
        this.zze = s;
    }

    private zzay(EnumMap enumMap0, int v) {
        this(enumMap0, v, null, null);
    }

    private zzay(EnumMap enumMap0, int v, Boolean boolean0, String s) {
        EnumMap enumMap1 = new EnumMap(zza.class);
        this.zzf = enumMap1;
        enumMap1.putAll(enumMap0);
        this.zzb = v;
        this.zzc = this.zzh();
        this.zzd = boolean0;
        this.zze = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof zzay)) {
            return false;
        }
        if(!this.zzc.equalsIgnoreCase(((zzay)object0).zzc)) {
            return false;
        }
        return zzax.zza(this.zzd, ((zzay)object0).zzd) ? zzax.zza(this.zze, ((zzay)object0).zze) : false;
    }

    @Override
    public final int hashCode() {
        Boolean boolean0 = this.zzd;
        if(boolean0 == null) {
            return this.zze == null ? this.zzc.hashCode() + 0x970 : this.zzc.hashCode() + 87 + this.zze.hashCode() * 0x89;
        }
        int v = boolean0 == Boolean.TRUE ? 7 : 13;
        return this.zze == null ? this.zzc.hashCode() + v * 29 + 0x919 : this.zzc.hashCode() + v * 29 + this.zze.hashCode() * 0x89;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("source=");
        stringBuilder0.append(zzih.zza(this.zzb));
        zza[] arr_zzih$zza = zzig.zzb.zza();
        for(int v = 0; v < arr_zzih$zza.length; ++v) {
            zza zzih$zza0 = arr_zzih$zza[v];
            stringBuilder0.append(",");
            stringBuilder0.append(zzih$zza0.zze);
            stringBuilder0.append("=");
            Boolean boolean0 = (Boolean)this.zzf.get(zzih$zza0);
            if(boolean0 == null) {
                stringBuilder0.append("uninitialized");
            }
            else {
                stringBuilder0.append((boolean0.booleanValue() ? "granted" : "denied"));
            }
        }
        if(this.zzd != null) {
            stringBuilder0.append(",isDmaRegion=");
            stringBuilder0.append(this.zzd);
        }
        if(this.zze != null) {
            stringBuilder0.append(",cpsDisplayStr=");
            stringBuilder0.append(this.zze);
        }
        return stringBuilder0.toString();
    }

    public static zzay zza(Bundle bundle0, int v) {
        Boolean boolean0 = null;
        if(bundle0 == null) {
            return new zzay(null, v);
        }
        EnumMap enumMap0 = new EnumMap(zza.class);
        zza[] arr_zzih$zza = zzig.zzb.zza();
        for(int v1 = 0; v1 < arr_zzih$zza.length; ++v1) {
            zza zzih$zza0 = arr_zzih$zza[v1];
            enumMap0.put(zzih$zza0, zzih.zzb(bundle0.getString(zzih$zza0.zze)));
        }
        if(bundle0.containsKey("is_dma_region")) {
            boolean0 = Boolean.valueOf(bundle0.getString("is_dma_region"));
        }
        return new zzay(enumMap0, v, boolean0, bundle0.getString("cps_display_str"));
    }

    public static zzay zza(String s) {
        if(s != null && s.length() > 0) {
            String[] arr_s = s.split(":");
            int v = Integer.parseInt(arr_s[0]);
            EnumMap enumMap0 = new EnumMap(zza.class);
            zza[] arr_zzih$zza = zzig.zzb.zza();
            int v2 = 0;
            for(int v1 = 1; v2 < arr_zzih$zza.length; ++v1) {
                enumMap0.put(arr_zzih$zza[v2], zzih.zza(arr_s[v1].charAt(0)));
                ++v2;
            }
            return new zzay(enumMap0, v);
        }
        return zzay.zza;
    }

    public static Boolean zza(Bundle bundle0) {
        return bundle0 == null ? null : zzih.zzb(bundle0.getString("ad_personalization"));
    }

    public final int zza() {
        return this.zzb;
    }

    public final Bundle zzb() {
        Bundle bundle0 = new Bundle();
        for(Object object0: this.zzf.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Boolean boolean0 = (Boolean)map$Entry0.getValue();
            if(boolean0 != null) {
                bundle0.putString(((zza)map$Entry0.getKey()).zze, zzih.zza(boolean0.booleanValue()));
            }
        }
        Boolean boolean1 = this.zzd;
        if(boolean1 != null) {
            bundle0.putString("is_dma_region", boolean1.toString());
        }
        String s = this.zze;
        if(s != null) {
            bundle0.putString("cps_display_str", s);
        }
        return bundle0;
    }

    public final Boolean zzc() {
        return (Boolean)this.zzf.get(zza.zzc);
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for(Object object0: this.zzf.values()) {
            if(((Boolean)object0) != null) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    private final String zzh() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.zzb);
        zza[] arr_zzih$zza = zzig.zzb.zza();
        for(int v = 0; v < arr_zzih$zza.length; ++v) {
            zza zzih$zza0 = arr_zzih$zza[v];
            stringBuilder0.append(":");
            stringBuilder0.append(zzih.zza(((Boolean)this.zzf.get(zzih$zza0))));
        }
        return stringBuilder0.toString();
    }
}

