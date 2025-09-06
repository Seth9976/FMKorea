package com.google.android.gms.internal.ads;

public final class zzvs {
    public static final zzvs zza;
    public static final zzn zzb;
    public final int zzc;
    private static final String zzd;
    private final zzfud zze;
    private int zzf;

    static {
        zzvs.zza = new zzvs(new zzcy[0]);
        zzvs.zzd = "0";
        zzvs.zzb = zzvr.zza;
    }

    public zzvs(zzcy[] arr_zzcy) {
        this.zze = zzfud.zzk(arr_zzcy);
        this.zzc = arr_zzcy.length;
        for(int v = 0; v < this.zze.size(); ++v) {
            for(int v1 = v + 1; v1 < this.zze.size(); ++v1) {
                if(((zzcy)this.zze.get(v)).equals(this.zze.get(v1))) {
                    zzes.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzvs.class == class0 && this.zzc == ((zzvs)object0).zzc && this.zze.equals(((zzvs)object0).zze);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzf;
        if(v == 0) {
            v = this.zze.hashCode();
            this.zzf = v;
        }
        return v;
    }

    public final int zza(zzcy zzcy0) {
        int v = this.zze.indexOf(zzcy0);
        return v < 0 ? -1 : v;
    }

    public final zzcy zzb(int v) {
        return (zzcy)this.zze.get(v);
    }
}

