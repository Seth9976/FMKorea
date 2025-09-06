package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;

public abstract class zzds extends zzatw implements zzdt {
    public zzds() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                this.zzi();
                break;
            }
            case 2: {
                this.zzh();
                break;
            }
            case 3: {
                this.zzg();
                break;
            }
            case 4: {
                this.zze();
                break;
            }
            case 5: {
                boolean z = zzatx.zzg(parcel0);
                zzatx.zzc(parcel0);
                this.zzf(z);
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

