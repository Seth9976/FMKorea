package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzavx extends zzatw implements zzavy {
    public zzavx() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzawf zzawf0;
        switch(v) {
            case 2: {
                zzbu zzbu0 = this.zze();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbu0);
                return true;
            }
            case 3: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if(iInterface0 instanceof zzawc) {
                        zzawc zzawc0 = (zzawc)iInterface0;
                    }
                }
                zzatx.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 == null) {
                    zzawf0 = null;
                }
                else {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzawf0 = iInterface1 instanceof zzawf ? ((zzawf)iInterface1) : new zzawd(iBinder1);
                }
                zzatx.zzc(parcel0);
                this.zzi(iObjectWrapper0, zzawf0);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                zzdn zzdn0 = this.zzf();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzdn0);
                return true;
            }
            case 6: {
                boolean z = zzatx.zzg(parcel0);
                zzatx.zzc(parcel0);
                this.zzg(z);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzdg zzdg0 = zzdf.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzh(zzdg0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

