package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzbft;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbgh;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzbli;
import com.google.android.gms.internal.ads.zzblj;

public abstract class zzbp extends zzatw implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzbh zzbh0 = null;
        switch(v) {
            case 1: {
                zzbn zzbn0 = this.zze();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbn0);
                return true;
            }
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbh0 = iInterface0 instanceof zzbh ? ((zzbh)iInterface0) : new zzbf(iBinder0);
                }
                zzatx.zzc(parcel0);
                this.zzl(zzbh0);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                zzbfu zzbfu0 = zzbft.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzf(zzbfu0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                zzbfx zzbfx0 = zzbfw.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzg(zzbfx0);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                String s = parcel0.readString();
                zzbgd zzbgd0 = zzbgc.zzb(parcel0.readStrongBinder());
                zzbga zzbga0 = zzbfz.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzh(s, zzbgd0, zzbga0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                zzbek zzbek0 = (zzbek)zzatx.zza(parcel0, zzbek.CREATOR);
                zzatx.zzc(parcel0);
                this.zzo(zzbek0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzbh0 = iInterface1 instanceof zzcf ? ((zzcf)iInterface1) : new zzcf(iBinder1);
                }
                zzatx.zzc(parcel0);
                this.zzq(((zzcf)zzbh0));
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                zzbgh zzbgh0 = zzbgg.zzb(parcel0.readStrongBinder());
                zzq zzq0 = (zzq)zzatx.zza(parcel0, zzq.CREATOR);
                zzatx.zzc(parcel0);
                this.zzj(zzbgh0, zzq0);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                PublisherAdViewOptions publisherAdViewOptions0 = (PublisherAdViewOptions)zzatx.zza(parcel0, PublisherAdViewOptions.CREATOR);
                zzatx.zzc(parcel0);
                this.zzp(publisherAdViewOptions0);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                zzbgk zzbgk0 = zzbgj.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzk(zzbgk0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                zzbla zzbla0 = (zzbla)zzatx.zza(parcel0, zzbla.CREATOR);
                zzatx.zzc(parcel0);
                this.zzn(zzbla0);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                zzblj zzblj0 = zzbli.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzi(zzblj0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                AdManagerAdViewOptions adManagerAdViewOptions0 = (AdManagerAdViewOptions)zzatx.zza(parcel0, AdManagerAdViewOptions.CREATOR);
                zzatx.zzc(parcel0);
                this.zzm(adManagerAdViewOptions0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

