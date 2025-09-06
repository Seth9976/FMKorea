package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzbod extends zzatv implements zzbof {
    zzbod(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override  // com.google.android.gms.internal.ads.zzbof
    public final zzboi zzb(String s) {
        zzboi zzboi0;
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzbg(1, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzboi0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzboi0 = iInterface0 instanceof zzboi ? ((zzboi)iInterface0) : new zzbog(iBinder0);
        }
        parcel1.recycle();
        return zzboi0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbof
    public final zzbqc zzc(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzbg(3, parcel0);
        zzbqc zzbqc0 = zzbqb.zzb(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbqc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbof
    public final boolean zzd(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzbg(4, parcel0);
        boolean z = zzatx.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbof
    public final boolean zze(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzbg(2, parcel0);
        boolean z = zzatx.zzg(parcel1);
        parcel1.recycle();
        return z;
    }
}

