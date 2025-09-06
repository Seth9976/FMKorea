package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzbvc extends zzatw implements zzbvd {
    public zzbvc() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                String s = this.zzc();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 2: {
                int v2 = this.zzb();
                parcel1.writeNoException();
                parcel1.writeInt(v2);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

