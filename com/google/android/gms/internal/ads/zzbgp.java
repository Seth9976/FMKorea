package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzbgp extends zzatw implements zzbgq {
    public zzbgp() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzf(s);
                break;
            }
            case 2: {
                this.zze();
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

