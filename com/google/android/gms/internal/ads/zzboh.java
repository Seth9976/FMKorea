package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

public abstract class zzboh extends zzatw implements zzboi {
    public zzboh() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzbol zzbol0 = null;
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable0 = zzatx.zza(parcel0, zzq.CREATOR);
                Parcelable parcelable1 = zzatx.zza(parcel0, zzl.CREATOR);
                String s = parcel0.readString();
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbol0 = iInterface0 instanceof zzbol ? ((zzbol)iInterface0) : new zzboj(iBinder0);
                }
                zzatx.zzc(parcel0);
                this.zzu(iObjectWrapper0, ((zzq)parcelable0), ((zzl)parcelable1), s, zzbol0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                IObjectWrapper iObjectWrapper1 = this.zzn();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, iObjectWrapper1);
                return true;
            }
            case 3: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzl zzl0 = (zzl)zzatx.zza(parcel0, zzl.CREATOR);
                String s1 = parcel0.readString();
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbol0 = iInterface1 instanceof zzbol ? ((zzbol)iInterface1) : new zzboj(iBinder1);
                }
                zzatx.zzc(parcel0);
                this.zzx(iObjectWrapper2, zzl0, s1, zzbol0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                this.zzI();
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                this.zzo();
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable2 = zzatx.zza(parcel0, zzq.CREATOR);
                Parcelable parcelable3 = zzatx.zza(parcel0, zzl.CREATOR);
                String s2 = parcel0.readString();
                String s3 = parcel0.readString();
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbol0 = iInterface2 instanceof zzbol ? ((zzbol)iInterface2) : new zzboj(iBinder2);
                }
                zzatx.zzc(parcel0);
                this.zzv(iObjectWrapper3, ((zzq)parcelable2), ((zzl)parcelable3), s2, s3, zzbol0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable4 = zzatx.zza(parcel0, zzl.CREATOR);
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbol0 = iInterface3 instanceof zzbol ? ((zzbol)iInterface3) : new zzboj(iBinder3);
                }
                zzatx.zzc(parcel0);
                this.zzy(iObjectWrapper4, ((zzl)parcelable4), s4, s5, zzbol0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                this.zzE();
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                this.zzF();
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable5 = zzatx.zza(parcel0, zzl.CREATOR);
                String s6 = parcel0.readString();
                zzbvo zzbvo0 = zzbvn.zzb(parcel0.readStrongBinder());
                String s7 = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzp(iObjectWrapper5, ((zzl)parcelable5), s6, zzbvo0, s7);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                zzl zzl1 = (zzl)zzatx.zza(parcel0, zzl.CREATOR);
                String s8 = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzs(zzl1, s8);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                this.zzL();
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                boolean z = this.zzN();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 14: {
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable6 = zzatx.zza(parcel0, zzl.CREATOR);
                String s9 = parcel0.readString();
                String s10 = parcel0.readString();
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbol0 = iInterface4 instanceof zzbol ? ((zzbol)iInterface4) : new zzboj(iBinder4);
                }
                Parcelable parcelable7 = zzatx.zza(parcel0, zzbek.CREATOR);
                ArrayList arrayList0 = parcel0.createStringArrayList();
                zzatx.zzc(parcel0);
                this.zzz(iObjectWrapper6, ((zzl)parcelable6), s9, s10, zzbol0, ((zzbek)parcelable7), arrayList0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                parcel1.writeNoException();
                zzatx.zzf(parcel1, null);
                return true;
            }
            case 16: {
                parcel1.writeNoException();
                zzatx.zzf(parcel1, null);
                return true;
            }
            case 17: {
                Bundle bundle0 = this.zze();
                parcel1.writeNoException();
                zzatx.zze(parcel1, bundle0);
                return true;
            }
            case 18: {
                Bundle bundle1 = this.zzf();
                parcel1.writeNoException();
                zzatx.zze(parcel1, bundle1);
                return true;
            }
            case 19: {
                Bundle bundle2 = this.zzg();
                parcel1.writeNoException();
                zzatx.zze(parcel1, bundle2);
                return true;
            }
            case 20: {
                zzl zzl2 = (zzl)zzatx.zza(parcel0, zzl.CREATOR);
                String s11 = parcel0.readString();
                String s12 = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzB(zzl2, s11, s12);
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                IObjectWrapper iObjectWrapper7 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzD(iObjectWrapper7);
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 23: {
                IObjectWrapper iObjectWrapper8 = Stub.asInterface(parcel0.readStrongBinder());
                zzbvo zzbvo1 = zzbvn.zzb(parcel0.readStrongBinder());
                ArrayList arrayList1 = parcel0.createStringArrayList();
                zzatx.zzc(parcel0);
                this.zzr(iObjectWrapper8, zzbvo1, arrayList1);
                parcel1.writeNoException();
                return true;
            }
            case 24: {
                zzbfq zzbfq0 = this.zzi();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbfq0);
                return true;
            }
            case 25: {
                boolean z1 = zzatx.zzg(parcel0);
                zzatx.zzc(parcel0);
                this.zzG(z1);
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                zzdq zzdq0 = this.zzh();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzdq0);
                return true;
            }
            case 27: {
                zzbou zzbou0 = this.zzk();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbou0);
                return true;
            }
            case 28: {
                IObjectWrapper iObjectWrapper9 = Stub.asInterface(parcel0.readStrongBinder());
                zzl zzl3 = (zzl)zzatx.zza(parcel0, zzl.CREATOR);
                String s13 = parcel0.readString();
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbol0 = iInterface5 instanceof zzbol ? ((zzbol)iInterface5) : new zzboj(iBinder5);
                }
                zzatx.zzc(parcel0);
                this.zzA(iObjectWrapper9, zzl3, s13, zzbol0);
                parcel1.writeNoException();
                return true;
            }
            case 30: {
                IObjectWrapper iObjectWrapper10 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzK(iObjectWrapper10);
                parcel1.writeNoException();
                return true;
            }
            case 0x1F: {
                IObjectWrapper iObjectWrapper11 = Stub.asInterface(parcel0.readStrongBinder());
                zzbks zzbks0 = zzbkr.zzb(parcel0.readStrongBinder());
                ArrayList arrayList2 = parcel0.createTypedArrayList(zzbky.CREATOR);
                zzatx.zzc(parcel0);
                this.zzq(iObjectWrapper11, zzbks0, arrayList2);
                parcel1.writeNoException();
                return true;
            }
            case 0x20: {
                IObjectWrapper iObjectWrapper12 = Stub.asInterface(parcel0.readStrongBinder());
                zzl zzl4 = (zzl)zzatx.zza(parcel0, zzl.CREATOR);
                String s14 = parcel0.readString();
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbol0 = iInterface6 instanceof zzbol ? ((zzbol)iInterface6) : new zzboj(iBinder6);
                }
                zzatx.zzc(parcel0);
                this.zzC(iObjectWrapper12, zzl4, s14, zzbol0);
                parcel1.writeNoException();
                return true;
            }
            case 33: {
                zzbqq zzbqq0 = this.zzl();
                parcel1.writeNoException();
                zzatx.zze(parcel1, zzbqq0);
                return true;
            }
            case 34: {
                zzbqq zzbqq1 = this.zzm();
                parcel1.writeNoException();
                zzatx.zze(parcel1, zzbqq1);
                return true;
            }
            case 35: {
                IObjectWrapper iObjectWrapper13 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable8 = zzatx.zza(parcel0, zzq.CREATOR);
                Parcelable parcelable9 = zzatx.zza(parcel0, zzl.CREATOR);
                String s15 = parcel0.readString();
                String s16 = parcel0.readString();
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbol0 = iInterface7 instanceof zzbol ? ((zzbol)iInterface7) : new zzboj(iBinder7);
                }
                zzatx.zzc(parcel0);
                this.zzw(iObjectWrapper13, ((zzq)parcelable8), ((zzl)parcelable9), s15, s16, zzbol0);
                parcel1.writeNoException();
                return true;
            }
            case 36: {
                zzboo zzboo0 = this.zzj();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzboo0);
                return true;
            }
            case 37: {
                IObjectWrapper iObjectWrapper14 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzJ(iObjectWrapper14);
                parcel1.writeNoException();
                return true;
            }
            case 38: {
                IObjectWrapper iObjectWrapper15 = Stub.asInterface(parcel0.readStrongBinder());
                zzl zzl5 = (zzl)zzatx.zza(parcel0, zzl.CREATOR);
                String s17 = parcel0.readString();
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbol0 = iInterface8 instanceof zzbol ? ((zzbol)iInterface8) : new zzboj(iBinder8);
                }
                zzatx.zzc(parcel0);
                this.zzt(iObjectWrapper15, zzl5, s17, zzbol0);
                parcel1.writeNoException();
                return true;
            }
            case 39: {
                IObjectWrapper iObjectWrapper16 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzH(iObjectWrapper16);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

