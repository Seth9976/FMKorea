package com.google.android.gms.internal.ads;

final class zzfoz extends zzfpr {
    private final String zza;
    private final String zzb;

    zzfoz(String s, String s1, zzfoy zzfoy0) {
        this.zza = s;
        this.zzb = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzfpr) {
            String s = this.zza;
            if(s == null) {
                if(((zzfpr)object0).zzb() == null) {
                    return this.zzb == null ? ((zzfpr)object0).zza() == null : this.zzb.equals(((zzfpr)object0).zza());
                }
            }
            else if(s.equals(((zzfpr)object0).zzb())) {
                return this.zzb == null ? ((zzfpr)object0).zza() == null : this.zzb.equals(((zzfpr)object0).zza());
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.zza == null ? 0 : this.zza.hashCode();
        String s = this.zzb;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.zza + ", appId=" + this.zzb + "}";
    }

    @Override  // com.google.android.gms.internal.ads.zzfpr
    public final String zza() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpr
    public final String zzb() {
        return this.zza;
    }
}

