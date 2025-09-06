package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzawe extends zzatw implements zzawf {
    public zzawe() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                this.zzf();
                break;
            }
            case 2: {
                this.zzc();
                break;
            }
            case 3: {
                zze zze0 = (zze)zzatx.zza(parcel0, zze.CREATOR);
                zzatx.zzc(parcel0);
                this.zzd(zze0);
                break;
            }
            case 4: {
                this.zze();
                break;
            }
            case 5: {
                this.zzb();
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

