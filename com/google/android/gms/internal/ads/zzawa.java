package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzawa extends zzatw implements zzawb {
    public zzawa() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzavy zzavy0;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzavy0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                    zzavy0 = iInterface0 instanceof zzavy ? ((zzavy)iInterface0) : new zzavw(iBinder0);
                }
                zzatx.zzc(parcel0);
                this.zzd(zzavy0);
                break;
            }
            case 2: {
                parcel0.readInt();
                zzatx.zzc(parcel0);
                break;
            }
            case 3: {
                zze zze0 = (zze)zzatx.zza(parcel0, zze.CREATOR);
                zzatx.zzc(parcel0);
                this.zzc(zze0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    public static zzawb zze(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterface0 instanceof zzawb ? ((zzawb)iInterface0) : new zzavz(iBinder0);
    }
}

