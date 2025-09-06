package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzbpv extends zzatw implements zzbpw {
    public zzbpv() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                zzbou zzbou0 = zzbot.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzg(zzbou0);
                break;
            }
            case 2: {
                String s = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zze(s);
                break;
            }
            case 3: {
                zze zze0 = (zze)zzatx.zza(parcel0, zze.CREATOR);
                zzatx.zzc(parcel0);
                this.zzf(zze0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

