package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;

public abstract class zzbm extends zzatw implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                zzl zzl1 = (zzl)zzatx.zza(parcel0, zzl.CREATOR);
                zzatx.zzc(parcel0);
                this.zzg(zzl1);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                String s1 = this.zze();
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 3: {
                boolean z = this.zzi();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 4: {
                String s = this.zzf();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 5: {
                zzl zzl0 = (zzl)zzatx.zza(parcel0, zzl.CREATOR);
                int v2 = parcel0.readInt();
                zzatx.zzc(parcel0);
                this.zzh(zzl0, v2);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

