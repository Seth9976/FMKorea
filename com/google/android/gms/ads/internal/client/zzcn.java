package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzbku;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbof;
import java.util.List;

public abstract class zzcn extends zzatw implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzda zzda0;
        switch(v) {
            case 1: {
                this.zzk();
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                float f = parcel0.readFloat();
                zzatx.zzc(parcel0);
                this.zzq(f);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                String s = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzr(s);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                boolean z = zzatx.zzg(parcel0);
                zzatx.zzc(parcel0);
                this.zzp(z);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                String s1 = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzn(iObjectWrapper0, s1);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                String s2 = parcel0.readString();
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzl(s2, iObjectWrapper1);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                float f1 = this.zze();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;
            }
            case 8: {
                boolean z1 = this.zzv();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 9: {
                String s3 = this.zzf();
                parcel1.writeNoException();
                parcel1.writeString(s3);
                return true;
            }
            case 10: {
                String s4 = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzh(s4);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                zzbof zzbof0 = zzboe.zzf(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzo(zzbof0);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                zzbkv zzbkv0 = zzbku.zzc(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzs(zzbkv0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                List list0 = this.zzg();
                parcel1.writeNoException();
                parcel1.writeTypedList(list0);
                return true;
            }
            case 14: {
                zzff zzff0 = (zzff)zzatx.zza(parcel0, zzff.CREATOR);
                zzatx.zzc(parcel0);
                this.zzu(zzff0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                this.zzi();
                parcel1.writeNoException();
                return true;
            }
            case 16: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzda0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzda0 = iInterface0 instanceof zzda ? ((zzda)iInterface0) : new zzcy(iBinder0);
                }
                zzatx.zzc(parcel0);
                this.zzm(zzda0);
                parcel1.writeNoException();
                return true;
            }
            case 17: {
                boolean z2 = zzatx.zzg(parcel0);
                zzatx.zzc(parcel0);
                this.zzj(z2);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                String s5 = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzt(s5);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

