package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzbuc extends zzatw implements zzbud {
    public zzbuc() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzbug zzbug0 = null;
        switch(v) {
            case 1: {
                zzbtr zzbtr0 = (zzbtr)zzatx.zza(parcel0, zzbtr.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                    zzbug0 = iInterface0 instanceof zzbug ? ((zzbug)iInterface0) : new zzbue(iBinder0);
                }
                zzatx.zzc(parcel0);
                this.zzf(zzbtr0, zzbug0);
                break;
            }
            case 2: {
                zzbtr zzbtr1 = (zzbtr)zzatx.zza(parcel0, zzbtr.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                    if(iInterface1 instanceof zzbug) {
                        zzbug zzbug1 = (zzbug)iInterface1;
                    }
                }
                zzatx.zzc(parcel0);
                break;
            }
            case 3: {
                zzbtv zzbtv0 = (zzbtv)zzatx.zza(parcel0, zzbtv.CREATOR);
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                    zzbug0 = iInterface2 instanceof zzbug ? ((zzbug)iInterface2) : new zzbue(iBinder2);
                }
                zzatx.zzc(parcel0);
                this.zze(zzbtv0, zzbug0);
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

