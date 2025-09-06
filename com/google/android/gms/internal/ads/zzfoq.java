package com.google.android.gms.internal.ads;

final class zzfoq extends zzfpb {
    private final String zza;
    private final String zzb;

    zzfoq(String s, String s1, zzfop zzfop0) {
        this.zza = s;
        this.zzb = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzfpb) {
            String s = this.zza;
            if(s == null) {
                if(((zzfpb)object0).zzb() == null) {
                    return this.zzb == null ? ((zzfpb)object0).zza() == null : this.zzb.equals(((zzfpb)object0).zza());
                }
            }
            else if(s.equals(((zzfpb)object0).zzb())) {
                return this.zzb == null ? ((zzfpb)object0).zza() == null : this.zzb.equals(((zzfpb)object0).zza());
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
        return "OverlayDisplayDismissRequest{sessionToken=" + this.zza + ", appId=" + this.zzb + "}";
    }

    @Override  // com.google.android.gms.internal.ads.zzfpb
    public final String zza() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpb
    public final String zzb() {
        return this.zza;
    }
}

