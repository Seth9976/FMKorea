package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import java.util.List;

public abstract class zzfj extends zzbx implements zzfk {
    public zzfj() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override  // com.google.android.gms.internal.measurement.zzbx
    protected final boolean zza(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                zzbg zzbg0 = (zzbg)zzbw.zza(parcel0, zzbg.CREATOR);
                zzo zzo0 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zza(zzbg0, zzo0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                zznc zznc0 = (zznc)zzbw.zza(parcel0, zznc.CREATOR);
                zzo zzo1 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zza(zznc0, zzo1);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                zzo zzo2 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zzc(zzo2);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                zzbg zzbg1 = (zzbg)zzbw.zza(parcel0, zzbg.CREATOR);
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                zzbw.zzb(parcel0);
                this.zza(zzbg1, s, s1);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                zzo zzo3 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zzf(zzo3);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzo zzo4 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                boolean z = zzbw.zzc(parcel0);
                zzbw.zzb(parcel0);
                List list0 = this.zza(zzo4, z);
                parcel1.writeNoException();
                parcel1.writeTypedList(list0);
                return true;
            }
            case 9: {
                zzbg zzbg2 = (zzbg)zzbw.zza(parcel0, zzbg.CREATOR);
                String s2 = parcel0.readString();
                zzbw.zzb(parcel0);
                byte[] arr_b = this.zza(zzbg2, s2);
                parcel1.writeNoException();
                parcel1.writeByteArray(arr_b);
                return true;
            }
            case 10: {
                long v2 = parcel0.readLong();
                String s3 = parcel0.readString();
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                zzbw.zzb(parcel0);
                this.zza(v2, s3, s4, s5);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                zzo zzo5 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                String s6 = this.zzb(zzo5);
                parcel1.writeNoException();
                parcel1.writeString(s6);
                return true;
            }
            case 12: {
                zzad zzad0 = (zzad)zzbw.zza(parcel0, zzad.CREATOR);
                zzo zzo6 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zza(zzad0, zzo6);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                zzad zzad1 = (zzad)zzbw.zza(parcel0, zzad.CREATOR);
                zzbw.zzb(parcel0);
                this.zza(zzad1);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                String s7 = parcel0.readString();
                String s8 = parcel0.readString();
                boolean z1 = zzbw.zzc(parcel0);
                zzo zzo7 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                List list1 = this.zza(s7, s8, z1, zzo7);
                parcel1.writeNoException();
                parcel1.writeTypedList(list1);
                return true;
            }
            case 15: {
                String s9 = parcel0.readString();
                String s10 = parcel0.readString();
                String s11 = parcel0.readString();
                boolean z2 = zzbw.zzc(parcel0);
                zzbw.zzb(parcel0);
                List list2 = this.zza(s9, s10, s11, z2);
                parcel1.writeNoException();
                parcel1.writeTypedList(list2);
                return true;
            }
            case 16: {
                String s12 = parcel0.readString();
                String s13 = parcel0.readString();
                zzo zzo8 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                List list3 = this.zza(s12, s13, zzo8);
                parcel1.writeNoException();
                parcel1.writeTypedList(list3);
                return true;
            }
            case 17: {
                String s14 = parcel0.readString();
                String s15 = parcel0.readString();
                String s16 = parcel0.readString();
                zzbw.zzb(parcel0);
                List list4 = this.zza(s14, s15, s16);
                parcel1.writeNoException();
                parcel1.writeTypedList(list4);
                return true;
            }
            case 18: {
                zzo zzo9 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zzd(zzo9);
                parcel1.writeNoException();
                return true;
            }
            case 19: {
                Bundle bundle0 = (Bundle)zzbw.zza(parcel0, Bundle.CREATOR);
                zzo zzo10 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zza(bundle0, zzo10);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                zzo zzo11 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zze(zzo11);
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                zzo zzo12 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                zzam zzam0 = this.zza(zzo12);
                parcel1.writeNoException();
                zzbw.zzb(parcel1, zzam0);
                return true;
            }
            case 24: {
                zzo zzo13 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                Bundle bundle1 = (Bundle)zzbw.zza(parcel0, Bundle.CREATOR);
                zzbw.zzb(parcel0);
                List list5 = this.zza(zzo13, bundle1);
                parcel1.writeNoException();
                parcel1.writeTypedList(list5);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

