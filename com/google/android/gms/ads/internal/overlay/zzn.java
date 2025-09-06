package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzcag;

public final class zzn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        zzc zzc0 = null;
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        String s = null;
        String s1 = null;
        IBinder iBinder4 = null;
        String s2 = null;
        zzcag zzcag0 = null;
        String s3 = null;
        zzj zzj0 = null;
        IBinder iBinder5 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        IBinder iBinder6 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        boolean z = false;
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v3)) {
                case 2: {
                    zzc0 = (zzc)SafeParcelReader.createParcelable(parcel0, v3, zzc.CREATOR);
                    break;
                }
                case 3: {
                    iBinder0 = SafeParcelReader.readIBinder(parcel0, v3);
                    break;
                }
                case 4: {
                    iBinder1 = SafeParcelReader.readIBinder(parcel0, v3);
                    break;
                }
                case 5: {
                    iBinder2 = SafeParcelReader.readIBinder(parcel0, v3);
                    break;
                }
                case 6: {
                    iBinder3 = SafeParcelReader.readIBinder(parcel0, v3);
                    break;
                }
                case 7: {
                    s = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 8: {
                    z = SafeParcelReader.readBoolean(parcel0, v3);
                    break;
                }
                case 9: {
                    s1 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 10: {
                    iBinder4 = SafeParcelReader.readIBinder(parcel0, v3);
                    break;
                }
                case 11: {
                    v1 = SafeParcelReader.readInt(parcel0, v3);
                    break;
                }
                case 12: {
                    v2 = SafeParcelReader.readInt(parcel0, v3);
                    break;
                }
                case 13: {
                    s2 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 14: {
                    zzcag0 = (zzcag)SafeParcelReader.createParcelable(parcel0, v3, zzcag.CREATOR);
                    break;
                }
                case 16: {
                    s3 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 17: {
                    zzj0 = (zzj)SafeParcelReader.createParcelable(parcel0, v3, zzj.CREATOR);
                    break;
                }
                case 18: {
                    iBinder5 = SafeParcelReader.readIBinder(parcel0, v3);
                    break;
                }
                case 19: {
                    s4 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 24: {
                    s5 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 25: {
                    s6 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 26: {
                    iBinder6 = SafeParcelReader.readIBinder(parcel0, v3);
                    break;
                }
                case 27: {
                    iBinder7 = SafeParcelReader.readIBinder(parcel0, v3);
                    break;
                }
                case 28: {
                    iBinder8 = SafeParcelReader.readIBinder(parcel0, v3);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v3);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new AdOverlayInfoParcel(zzc0, iBinder0, iBinder1, iBinder2, iBinder3, s, z, s1, iBinder4, v1, v2, s2, zzcag0, s3, zzj0, iBinder5, s4, s5, s6, iBinder6, iBinder7, iBinder8);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AdOverlayInfoParcel[v];
    }
}

