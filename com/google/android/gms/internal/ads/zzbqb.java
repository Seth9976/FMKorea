package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbqb extends zzatw implements zzbqc {
    public zzbqb() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbqc zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterface0 instanceof zzbqc ? ((zzbqc)iInterface0) : new zzbqa(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzbqf zzbqf0 = null;
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                String s = parcel0.readString();
                Parcelable.Creator parcelable$Creator0 = Bundle.CREATOR;
                Bundle bundle0 = (Bundle)zzatx.zza(parcel0, parcelable$Creator0);
                Parcelable parcelable0 = zzatx.zza(parcel0, parcelable$Creator0);
                Parcelable parcelable1 = zzatx.zza(parcel0, zzq.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                    zzbqf0 = iInterface0 instanceof zzbqf ? ((zzbqf)iInterface0) : new zzbqd(iBinder0);
                }
                zzatx.zzc(parcel0);
                this.zzh(iObjectWrapper0, s, bundle0, ((Bundle)parcelable0), ((zzq)parcelable1), zzbqf0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                zzbqq zzbqq0 = this.zzf();
                parcel1.writeNoException();
                zzatx.zze(parcel1, zzbqq0);
                return true;
            }
            case 3: {
                zzbqq zzbqq1 = this.zzg();
                parcel1.writeNoException();
                zzatx.zze(parcel1, zzbqq1);
                return true;
            }
            case 5: {
                zzdq zzdq0 = this.zze();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzdq0);
                return true;
            }
            case 10: {
                Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                parcel0.createStringArray();
                Bundle[] arr_bundle = (Bundle[])parcel0.createTypedArray(Bundle.CREATOR);
                zzatx.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                Parcelable parcelable2 = zzatx.zza(parcel0, zzl.CREATOR);
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    zzbqf0 = iInterface1 instanceof zzbpq ? ((zzbpq)iInterface1) : new zzbpo(iBinder1);
                }
                zzbol zzbol0 = zzbok.zzb(parcel0.readStrongBinder());
                Parcelable parcelable3 = zzatx.zza(parcel0, zzq.CREATOR);
                zzatx.zzc(parcel0);
                this.zzj(s1, s2, ((zzl)parcelable2), iObjectWrapper1, ((zzbpq)zzbqf0), zzbol0, ((zzq)parcelable3));
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                String s3 = parcel0.readString();
                String s4 = parcel0.readString();
                Parcelable parcelable4 = zzatx.zza(parcel0, zzl.CREATOR);
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    zzbqf0 = iInterface2 instanceof zzbpt ? ((zzbpt)iInterface2) : new zzbpr(iBinder2);
                }
                zzbol zzbol1 = zzbok.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzl(s3, s4, ((zzl)parcelable4), iObjectWrapper2, ((zzbpt)zzbqf0), zzbol1);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                boolean z = this.zzs(iObjectWrapper3);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 16: {
                String s5 = parcel0.readString();
                String s6 = parcel0.readString();
                Parcelable parcelable5 = zzatx.zza(parcel0, zzl.CREATOR);
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    zzbqf0 = iInterface3 instanceof zzbpz ? ((zzbpz)iInterface3) : new zzbpx(iBinder3);
                }
                zzbol zzbol2 = zzbok.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzp(s5, s6, ((zzl)parcelable5), iObjectWrapper4, ((zzbpz)zzbqf0), zzbol2);
                parcel1.writeNoException();
                return true;
            }
            case 17: {
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                boolean z1 = this.zzt(iObjectWrapper5);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 18: {
                String s7 = parcel0.readString();
                String s8 = parcel0.readString();
                Parcelable parcelable6 = zzatx.zza(parcel0, zzl.CREATOR);
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    zzbqf0 = iInterface4 instanceof zzbpw ? ((zzbpw)iInterface4) : new zzbpu(iBinder4);
                }
                zzbol zzbol3 = zzbok.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzm(s7, s8, ((zzl)parcelable6), iObjectWrapper6, ((zzbpw)zzbqf0), zzbol3);
                parcel1.writeNoException();
                return true;
            }
            case 19: {
                String s9 = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzq(s9);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                String s10 = parcel0.readString();
                String s11 = parcel0.readString();
                Parcelable parcelable7 = zzatx.zza(parcel0, zzl.CREATOR);
                IObjectWrapper iObjectWrapper7 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    zzbqf0 = iInterface5 instanceof zzbpz ? ((zzbpz)iInterface5) : new zzbpx(iBinder5);
                }
                zzbol zzbol4 = zzbok.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzo(s10, s11, ((zzl)parcelable7), iObjectWrapper7, ((zzbpz)zzbqf0), zzbol4);
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                String s12 = parcel0.readString();
                String s13 = parcel0.readString();
                Parcelable parcelable8 = zzatx.zza(parcel0, zzl.CREATOR);
                IObjectWrapper iObjectWrapper8 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    zzbqf0 = iInterface6 instanceof zzbpq ? ((zzbpq)iInterface6) : new zzbpo(iBinder6);
                }
                zzbol zzbol5 = zzbok.zzb(parcel0.readStrongBinder());
                Parcelable parcelable9 = zzatx.zza(parcel0, zzq.CREATOR);
                zzatx.zzc(parcel0);
                this.zzk(s12, s13, ((zzl)parcelable8), iObjectWrapper8, ((zzbpq)zzbqf0), zzbol5, ((zzq)parcelable9));
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                String s14 = parcel0.readString();
                String s15 = parcel0.readString();
                Parcelable parcelable10 = zzatx.zza(parcel0, zzl.CREATOR);
                IObjectWrapper iObjectWrapper9 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    zzbqf0 = iInterface7 instanceof zzbpw ? ((zzbpw)iInterface7) : new zzbpu(iBinder7);
                }
                zzbol zzbol6 = zzbok.zzb(parcel0.readStrongBinder());
                Parcelable parcelable11 = zzatx.zza(parcel0, zzbek.CREATOR);
                zzatx.zzc(parcel0);
                this.zzn(s14, s15, ((zzl)parcelable10), iObjectWrapper9, ((zzbpw)zzbqf0), zzbol6, ((zzbek)parcelable11));
                parcel1.writeNoException();
                return true;
            }
            case 23: {
                String s16 = parcel0.readString();
                String s17 = parcel0.readString();
                Parcelable parcelable12 = zzatx.zza(parcel0, zzl.CREATOR);
                IObjectWrapper iObjectWrapper10 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    zzbqf0 = iInterface8 instanceof zzbpn ? ((zzbpn)iInterface8) : new zzbpl(iBinder8);
                }
                zzbol zzbol7 = zzbok.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzi(s16, s17, ((zzl)parcelable12), iObjectWrapper10, ((zzbpn)zzbqf0), zzbol7);
                parcel1.writeNoException();
                return true;
            }
            case 24: {
                IObjectWrapper iObjectWrapper11 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                boolean z2 = this.zzr(iObjectWrapper11);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z2));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

