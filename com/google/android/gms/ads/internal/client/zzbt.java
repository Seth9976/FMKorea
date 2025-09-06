package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzawa;
import com.google.android.gms.internal.ads.zzawb;
import com.google.android.gms.internal.ads.zzbco;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbvj;

public abstract class zzbt extends zzatw implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzac(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterface0 instanceof zzbu ? ((zzbu)iInterface0) : new zzbs(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzbh zzbh0 = null;
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = this.zzn();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, iObjectWrapper0);
                return true;
            }
            case 2: {
                this.zzx();
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                boolean z = this.zzZ();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 4: {
                zzl zzl0 = (zzl)zzatx.zza(parcel0, zzl.CREATOR);
                zzatx.zzc(parcel0);
                boolean z1 = this.zzaa(zzl0);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 5: {
                this.zzz();
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                this.zzB();
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbh0 = iInterface0 instanceof zzbh ? ((zzbh)iInterface0) : new zzbf(iBinder0);
                }
                zzatx.zzc(parcel0);
                this.zzD(zzbh0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzbh0 = iInterface1 instanceof zzcb ? ((zzcb)iInterface1) : new zzbz(iBinder1);
                }
                zzatx.zzc(parcel0);
                this.zzG(((zzcb)zzbh0));
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                this.zzX();
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                this.zzA();
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                zzq zzq0 = this.zzg();
                parcel1.writeNoException();
                zzatx.zze(parcel1, zzq0);
                return true;
            }
            case 13: {
                zzq zzq1 = (zzq)zzatx.zza(parcel0, zzq.CREATOR);
                zzatx.zzc(parcel0);
                this.zzF(zzq1);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                zzbsl zzbsl0 = zzbsk.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzM(zzbsl0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                zzbso zzbso0 = zzbsn.zzb(parcel0.readStrongBinder());
                String s = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzQ(zzbso0, s);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                String s1 = this.zzs();
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 19: {
                zzbcp zzbcp0 = zzbco.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzO(zzbcp0);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbh0 = iInterface2 instanceof zzbe ? ((zzbe)iInterface2) : new zzbc(iBinder2);
                }
                zzatx.zzc(parcel0);
                this.zzC(((zzbe)zzbh0));
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzbh0 = iInterface3 instanceof zzcf ? ((zzcf)iInterface3) : new zzcf(iBinder3);
                }
                zzatx.zzc(parcel0);
                this.zzab(((zzcf)zzbh0));
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                boolean z2 = zzatx.zzg(parcel0);
                zzatx.zzc(parcel0);
                this.zzN(z2);
                parcel1.writeNoException();
                return true;
            }
            case 23: {
                boolean z3 = this.zzY();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z3));
                return true;
            }
            case 24: {
                zzbvj zzbvj0 = zzbvi.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzS(zzbvj0);
                parcel1.writeNoException();
                return true;
            }
            case 25: {
                String s2 = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzT(s2);
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                zzdq zzdq0 = this.zzl();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzdq0);
                return true;
            }
            case 29: {
                zzfl zzfl0 = (zzfl)zzatx.zza(parcel0, zzfl.CREATOR);
                zzatx.zzc(parcel0);
                this.zzU(zzfl0);
                parcel1.writeNoException();
                return true;
            }
            case 30: {
                zzdu zzdu0 = (zzdu)zzatx.zza(parcel0, zzdu.CREATOR);
                zzatx.zzc(parcel0);
                this.zzK(zzdu0);
                parcel1.writeNoException();
                return true;
            }
            case 0x1F: {
                String s3 = this.zzr();
                parcel1.writeNoException();
                parcel1.writeString(s3);
                return true;
            }
            case 0x20: {
                zzcb zzcb0 = this.zzj();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzcb0);
                return true;
            }
            case 33: {
                zzbh zzbh1 = this.zzi();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbh1);
                return true;
            }
            case 34: {
                boolean z4 = zzatx.zzg(parcel0);
                zzatx.zzc(parcel0);
                this.zzL(z4);
                parcel1.writeNoException();
                return true;
            }
            case 35: {
                String s4 = this.zzt();
                parcel1.writeNoException();
                parcel1.writeString(s4);
                return true;
            }
            case 36: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbh0 = iInterface4 instanceof zzby ? ((zzby)iInterface4) : new zzbw(iBinder4);
                }
                zzatx.zzc(parcel0);
                this.zzE(((zzby)zzbh0));
                parcel1.writeNoException();
                return true;
            }
            case 37: {
                Bundle bundle0 = this.zzd();
                parcel1.writeNoException();
                zzatx.zze(parcel1, bundle0);
                return true;
            }
            case 38: {
                String s5 = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzR(s5);
                parcel1.writeNoException();
                return true;
            }
            case 39: {
                zzw zzw0 = (zzw)zzatx.zza(parcel0, zzw.CREATOR);
                zzatx.zzc(parcel0);
                this.zzI(zzw0);
                parcel1.writeNoException();
                return true;
            }
            case 40: {
                zzawb zzawb0 = zzawa.zze(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzH(zzawb0);
                parcel1.writeNoException();
                return true;
            }
            case 41: {
                zzdn zzdn0 = this.zzk();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzdn0);
                return true;
            }
            case 42: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzbh0 = iInterface5 instanceof zzdg ? ((zzdg)iInterface5) : new zzde(iBinder5);
                }
                zzatx.zzc(parcel0);
                this.zzP(((zzdg)zzbh0));
                parcel1.writeNoException();
                return true;
            }
            case 43: {
                zzl zzl1 = (zzl)zzatx.zza(parcel0, zzl.CREATOR);
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbh0 = iInterface6 instanceof zzbk ? ((zzbk)iInterface6) : new zzbi(iBinder6);
                }
                zzatx.zzc(parcel0);
                this.zzy(zzl1, ((zzbk)zzbh0));
                parcel1.writeNoException();
                return true;
            }
            case 44: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzW(iObjectWrapper1);
                parcel1.writeNoException();
                return true;
            }
            case 45: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzbh0 = iInterface7 instanceof zzci ? ((zzci)iInterface7) : new zzcg(iBinder7);
                }
                zzatx.zzc(parcel0);
                this.zzJ(((zzci)zzbh0));
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

