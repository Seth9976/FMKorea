package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzbty extends zzatw implements zzbtz {
    public zzbty() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzbuj zzbuj0 = null;
        switch(v) {
            case 1: {
                zzbto zzbto1 = (zzbto)zzatx.zza(parcel0, zzbto.CREATOR);
                zzatx.zzc(parcel0);
                parcel1.writeNoException();
                zzatx.zze(parcel1, null);
                return true;
            }
            case 2: {
                zzbto zzbto0 = (zzbto)zzatx.zza(parcel0, zzbto.CREATOR);
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if(iInterface4 instanceof zzbua) {
                        zzbua zzbua0 = (zzbua)iInterface4;
                    }
                }
                zzatx.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                zzbun zzbun2 = (zzbun)zzatx.zza(parcel0, zzbun.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbuj0 = iInterface3 instanceof zzbuj ? ((zzbuj)iInterface3) : new zzbuh(iBinder3);
                }
                zzatx.zzc(parcel0);
                this.zzg(zzbun2, zzbuj0);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                zzbun zzbun1 = (zzbun)zzatx.zza(parcel0, zzbun.CREATOR);
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbuj0 = iInterface2 instanceof zzbuj ? ((zzbuj)iInterface2) : new zzbuh(iBinder2);
                }
                zzatx.zzc(parcel0);
                this.zzf(zzbun1, zzbuj0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                zzbun zzbun0 = (zzbun)zzatx.zza(parcel0, zzbun.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbuj0 = iInterface1 instanceof zzbuj ? ((zzbuj)iInterface1) : new zzbuh(iBinder1);
                }
                zzatx.zzc(parcel0);
                this.zze(zzbun0, zzbuj0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                String s = parcel0.readString();
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbuj0 = iInterface0 instanceof zzbuj ? ((zzbuj)iInterface0) : new zzbuh(iBinder0);
                }
                zzatx.zzc(parcel0);
                this.zzh(s, zzbuj0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

