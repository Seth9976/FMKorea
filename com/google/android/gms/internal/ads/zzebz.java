package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzl;

final class zzebz extends zzecu {
    private final Activity zza;
    private final zzl zzb;
    private final String zzc;
    private final String zzd;

    zzebz(Activity activity0, zzl zzl0, String s, String s1, zzeby zzeby0) {
        this.zza = activity0;
        this.zzb = zzl0;
        this.zzc = s;
        this.zzd = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzecu) {
            Activity activity0 = ((zzecu)object0).zza();
            if(this.zza.equals(activity0)) {
                zzl zzl0 = this.zzb;
                if(zzl0 != null) {
                    if(zzl0.equals(((zzecu)object0).zzb())) {
                    label_10:
                        String s = this.zzc;
                        if(s == null) {
                            if(((zzecu)object0).zzc() == null) {
                                return this.zzd == null ? ((zzecu)object0).zzd() == null : this.zzd.equals(((zzecu)object0).zzd());
                            }
                        }
                        else if(s.equals(((zzecu)object0).zzc())) {
                            return this.zzd == null ? ((zzecu)object0).zzd() == null : this.zzd.equals(((zzecu)object0).zzd());
                        }
                    }
                }
                else if(((zzecu)object0).zzb() == null) {
                    goto label_10;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zza.hashCode();
        int v1 = 0;
        int v2 = this.zzb == null ? 0 : this.zzb.hashCode();
        int v3 = this.zzc == null ? 0 : this.zzc.hashCode();
        String s = this.zzd;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        return "OfflineUtilsParams{activity=" + this.zza.toString() + ", adOverlay=" + this.zzb + ", gwsQueryId=" + this.zzc + ", uri=" + this.zzd + "}";
    }

    @Override  // com.google.android.gms.internal.ads.zzecu
    public final Activity zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzecu
    public final zzl zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzecu
    public final String zzc() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzecu
    public final String zzd() {
        return this.zzd;
    }
}

