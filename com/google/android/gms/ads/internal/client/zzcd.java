package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbjo;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzbyr;

public abstract class zzcd extends zzatw implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable0 = zzatx.zza(parcel0, zzq.CREATOR);
                String s = parcel0.readString();
                zzbof zzbof0 = zzboe.zzf(parcel0.readStrongBinder());
                int v2 = parcel0.readInt();
                zzatx.zzc(parcel0);
                zzbu zzbu0 = this.zzd(iObjectWrapper0, ((zzq)parcelable0), s, zzbof0, v2);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbu0);
                return true;
            }
            case 2: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable1 = zzatx.zza(parcel0, zzq.CREATOR);
                String s1 = parcel0.readString();
                zzbof zzbof1 = zzboe.zzf(parcel0.readStrongBinder());
                int v3 = parcel0.readInt();
                zzatx.zzc(parcel0);
                zzbu zzbu1 = this.zze(iObjectWrapper1, ((zzq)parcelable1), s1, zzbof1, v3);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbu1);
                return true;
            }
            case 3: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                String s2 = parcel0.readString();
                zzbof zzbof2 = zzboe.zzf(parcel0.readStrongBinder());
                int v4 = parcel0.readInt();
                zzatx.zzc(parcel0);
                zzbq zzbq0 = this.zzb(iObjectWrapper2, s2, zzbof2, v4);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbq0);
                return true;
            }
            case 4: {
                Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, null);
                return true;
            }
            case 5: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                zzbfa zzbfa0 = this.zzi(iObjectWrapper3, iObjectWrapper4);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbfa0);
                return true;
            }
            case 6: {
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                zzbof zzbof3 = zzboe.zzf(parcel0.readStrongBinder());
                int v5 = parcel0.readInt();
                zzatx.zzc(parcel0);
                zzbvg zzbvg0 = this.zzn(iObjectWrapper5, zzbof3, v5);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbvg0);
                return true;
            }
            case 7: {
                Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, null);
                return true;
            }
            case 8: {
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                zzbsc zzbsc0 = this.zzm(iObjectWrapper6);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbsc0);
                return true;
            }
            case 9: {
                IObjectWrapper iObjectWrapper7 = Stub.asInterface(parcel0.readStrongBinder());
                int v6 = parcel0.readInt();
                zzatx.zzc(parcel0);
                zzco zzco0 = this.zzg(iObjectWrapper7, v6);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzco0);
                return true;
            }
            case 10: {
                IObjectWrapper iObjectWrapper8 = Stub.asInterface(parcel0.readStrongBinder());
                zzq zzq0 = (zzq)zzatx.zza(parcel0, zzq.CREATOR);
                String s3 = parcel0.readString();
                int v7 = parcel0.readInt();
                zzatx.zzc(parcel0);
                zzbu zzbu2 = this.zzf(iObjectWrapper8, zzq0, s3, v7);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbu2);
                return true;
            }
            case 11: {
                IObjectWrapper iObjectWrapper9 = Stub.asInterface(parcel0.readStrongBinder());
                IObjectWrapper iObjectWrapper10 = Stub.asInterface(parcel0.readStrongBinder());
                IObjectWrapper iObjectWrapper11 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                zzbfg zzbfg0 = this.zzj(iObjectWrapper9, iObjectWrapper10, iObjectWrapper11);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbfg0);
                return true;
            }
            case 12: {
                IObjectWrapper iObjectWrapper12 = Stub.asInterface(parcel0.readStrongBinder());
                String s4 = parcel0.readString();
                zzbof zzbof4 = zzboe.zzf(parcel0.readStrongBinder());
                int v8 = parcel0.readInt();
                zzatx.zzc(parcel0);
                zzbvw zzbvw0 = this.zzo(iObjectWrapper12, s4, zzbof4, v8);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbvw0);
                return true;
            }
            case 13: {
                IObjectWrapper iObjectWrapper13 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable2 = zzatx.zza(parcel0, zzq.CREATOR);
                String s5 = parcel0.readString();
                zzbof zzbof5 = zzboe.zzf(parcel0.readStrongBinder());
                int v9 = parcel0.readInt();
                zzatx.zzc(parcel0);
                zzbu zzbu3 = this.zzc(iObjectWrapper13, ((zzq)parcelable2), s5, zzbof5, v9);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbu3);
                return true;
            }
            case 14: {
                IObjectWrapper iObjectWrapper14 = Stub.asInterface(parcel0.readStrongBinder());
                zzbof zzbof6 = zzboe.zzf(parcel0.readStrongBinder());
                int v10 = parcel0.readInt();
                zzatx.zzc(parcel0);
                zzbyr zzbyr0 = this.zzp(iObjectWrapper14, zzbof6, v10);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbyr0);
                return true;
            }
            case 15: {
                IObjectWrapper iObjectWrapper15 = Stub.asInterface(parcel0.readStrongBinder());
                zzbof zzbof7 = zzboe.zzf(parcel0.readStrongBinder());
                int v11 = parcel0.readInt();
                zzatx.zzc(parcel0);
                zzbrv zzbrv0 = this.zzl(iObjectWrapper15, zzbof7, v11);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbrv0);
                return true;
            }
            case 16: {
                IObjectWrapper iObjectWrapper16 = Stub.asInterface(parcel0.readStrongBinder());
                zzbof zzbof8 = zzboe.zzf(parcel0.readStrongBinder());
                int v12 = parcel0.readInt();
                zzbjp zzbjp0 = zzbjo.zzc(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                zzbjs zzbjs0 = this.zzk(iObjectWrapper16, zzbof8, v12, zzbjp0);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbjs0);
                return true;
            }
            case 17: {
                IObjectWrapper iObjectWrapper17 = Stub.asInterface(parcel0.readStrongBinder());
                zzbof zzbof9 = zzboe.zzf(parcel0.readStrongBinder());
                int v13 = parcel0.readInt();
                zzatx.zzc(parcel0);
                zzdj zzdj0 = this.zzh(iObjectWrapper17, zzbof9, v13);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzdj0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

