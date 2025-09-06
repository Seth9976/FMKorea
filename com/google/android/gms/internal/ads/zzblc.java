package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzblc extends zzatw implements zzbld {
    public zzblc() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzblg zzblg0;
        switch(v) {
            case 3: {
                zzdq zzdq0 = this.zzb();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzdq0);
                return true;
            }
            case 4: {
                this.zzd();
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzblg0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    zzblg0 = iInterface0 instanceof zzblg ? ((zzblg)iInterface0) : new zzble(iBinder0);
                }
                zzatx.zzc(parcel0);
                this.zzf(iObjectWrapper1, zzblg0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zze(iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzbet zzbet0 = this.zzc();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbet0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

