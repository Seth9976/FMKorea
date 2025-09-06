package com.google.android.gms.internal.ads;

import android.os.IBinder;

final class zzfot extends zzfpm {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    zzfot(IBinder iBinder0, boolean z, String s, int v, float f, int v1, String s1, int v2, String s2, zzfos zzfos0) {
        this.zza = iBinder0;
        this.zzb = s;
        this.zzc = v;
        this.zzd = f;
        this.zze = v2;
        this.zzf = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzfpm) {
            IBinder iBinder0 = ((zzfpm)object0).zze();
            if(this.zza.equals(iBinder0)) {
                ((zzfpm)object0).zzi();
                String s = this.zzb;
                if(s != null) {
                    if(s.equals(((zzfpm)object0).zzg())) {
                    label_11:
                        int v = ((zzfpm)object0).zzc();
                        if(this.zzc == v) {
                            int v1 = Float.floatToIntBits(((zzfpm)object0).zza());
                            if(Float.floatToIntBits(this.zzd) == v1) {
                                ((zzfpm)object0).zzb();
                                ((zzfpm)object0).zzh();
                                int v2 = ((zzfpm)object0).zzd();
                                if(this.zze == v2) {
                                    return this.zzf == null ? ((zzfpm)object0).zzf() == null : this.zzf.equals(((zzfpm)object0).zzf());
                                }
                            }
                        }
                    }
                }
                else if(((zzfpm)object0).zzg() == null) {
                    goto label_11;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((((((this.zza.hashCode() ^ 1000003) * 1000003 ^ 0x4D5) * 1000003 ^ (this.zzb == null ? 0 : this.zzb.hashCode())) * 1000003 ^ this.zzc) * 1000003 ^ Float.floatToIntBits(this.zzd)) * 0x22CD8CDB ^ this.zze) * 1000003;
        String s = this.zzf;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.zza.toString() + ", stableSessionToken=false, appId=" + this.zzb + ", layoutGravity=" + this.zzc + ", layoutVerticalMargin=" + this.zzd + ", displayMode=0, sessionToken=null, windowWidthPx=" + this.zze + ", adFieldEnifd=" + this.zzf + "}";
    }

    @Override  // com.google.android.gms.internal.ads.zzfpm
    public final float zza() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpm
    public final int zzb() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpm
    public final int zzc() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpm
    public final int zzd() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpm
    public final IBinder zze() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpm
    public final String zzf() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpm
    public final String zzg() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpm
    public final String zzh() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpm
    public final boolean zzi() {
        return false;
    }
}

