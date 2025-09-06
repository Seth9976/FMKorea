package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public abstract class zzbgs extends zzatw implements zzbgt {
    public zzbgs() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzbgq zzbgq0;
        switch(v) {
            case 2: {
                String s = this.zzq();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 3: {
                List list0 = this.zzu();
                parcel1.writeNoException();
                parcel1.writeList(list0);
                return true;
            }
            case 4: {
                String s1 = this.zzo();
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 5: {
                zzbew zzbew0 = this.zzk();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbew0);
                return true;
            }
            case 6: {
                String s2 = this.zzp();
                parcel1.writeNoException();
                parcel1.writeString(s2);
                return true;
            }
            case 7: {
                String s3 = this.zzn();
                parcel1.writeNoException();
                parcel1.writeString(s3);
                return true;
            }
            case 8: {
                double f = this.zze();
                parcel1.writeNoException();
                parcel1.writeDouble(f);
                return true;
            }
            case 9: {
                String s4 = this.zzt();
                parcel1.writeNoException();
                parcel1.writeString(s4);
                return true;
            }
            case 10: {
                String s5 = this.zzs();
                parcel1.writeNoException();
                parcel1.writeString(s5);
                return true;
            }
            case 11: {
                zzdq zzdq0 = this.zzh();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzdq0);
                return true;
            }
            case 12: {
                String s6 = this.zzr();
                parcel1.writeNoException();
                parcel1.writeString(s6);
                return true;
            }
            case 13: {
                this.zzx();
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                zzbeo zzbeo0 = this.zzi();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbeo0);
                return true;
            }
            case 15: {
                Bundle bundle0 = (Bundle)zzatx.zza(parcel0, Bundle.CREATOR);
                zzatx.zzc(parcel0);
                this.zzz(bundle0);
                parcel1.writeNoException();
                return true;
            }
            case 16: {
                Bundle bundle1 = (Bundle)zzatx.zza(parcel0, Bundle.CREATOR);
                zzatx.zzc(parcel0);
                boolean z = this.zzI(bundle1);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 17: {
                Bundle bundle2 = (Bundle)zzatx.zza(parcel0, Bundle.CREATOR);
                zzatx.zzc(parcel0);
                this.zzB(bundle2);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                IObjectWrapper iObjectWrapper0 = this.zzm();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, iObjectWrapper0);
                return true;
            }
            case 19: {
                IObjectWrapper iObjectWrapper1 = this.zzl();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, iObjectWrapper1);
                return true;
            }
            case 20: {
                Bundle bundle3 = this.zzf();
                parcel1.writeNoException();
                zzatx.zze(parcel1, bundle3);
                return true;
            }
            case 21: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzbgq0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbgq0 = iInterface0 instanceof zzbgq ? ((zzbgq)iInterface0) : new zzbgo(iBinder0);
                }
                zzatx.zzc(parcel0);
                this.zzF(zzbgq0);
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                this.zzw();
                parcel1.writeNoException();
                return true;
            }
            case 23: {
                List list1 = this.zzv();
                parcel1.writeNoException();
                parcel1.writeList(list1);
                return true;
            }
            case 24: {
                boolean z1 = this.zzH();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 25: {
                zzcw zzcw0 = zzcv.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzy(zzcw0);
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                zzcs zzcs0 = zzcr.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzD(zzcs0);
                parcel1.writeNoException();
                return true;
            }
            case 27: {
                this.zzC();
                parcel1.writeNoException();
                return true;
            }
            case 28: {
                this.zzA();
                parcel1.writeNoException();
                return true;
            }
            case 29: {
                zzbet zzbet0 = this.zzj();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbet0);
                return true;
            }
            case 30: {
                boolean z2 = this.zzG();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z2));
                return true;
            }
            case 0x1F: {
                zzdn zzdn0 = this.zzg();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzdn0);
                return true;
            }
            case 0x20: {
                zzdg zzdg0 = zzdf.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzE(zzdg0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

