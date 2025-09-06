package com.google.android.gms.internal.ads;

final class zzflg extends zzfld {
    private String zza;
    private boolean zzb;
    private boolean zzc;
    private byte zzd;

    @Override  // com.google.android.gms.internal.ads.zzfld
    public final zzfld zza(String s) {
        if(s == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.zza = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfld
    public final zzfld zzb(boolean z) {
        this.zzc = true;
        this.zzd = (byte)(this.zzd | 2);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfld
    public final zzfld zzc(boolean z) {
        this.zzb = z;
        this.zzd = (byte)(this.zzd | 1);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfld
    public final zzfle zzd() {
        if(this.zzd == 3) {
            String s = this.zza;
            if(s != null) {
                return new zzfli(s, this.zzb, this.zzc, null);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.zza == null) {
            stringBuilder0.append(" clientVersion");
        }
        if((this.zzd & 1) == 0) {
            stringBuilder0.append(" shouldGetAdvertisingId");
        }
        if((this.zzd & 2) == 0) {
            stringBuilder0.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }
}

