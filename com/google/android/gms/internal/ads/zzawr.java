package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzawr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        boolean z = false;
        int v1 = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Bundle bundle0 = null;
        String s4 = null;
        long v2 = 0L;
        long v3 = 0L;
        while(parcel0.dataPosition() < v) {
            int v4 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v4)) {
                case 2: {
                    s = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 3: {
                    v2 = SafeParcelReader.readLong(parcel0, v4);
                    break;
                }
                case 4: {
                    s1 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 5: {
                    s2 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 6: {
                    s3 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 7: {
                    bundle0 = SafeParcelReader.createBundle(parcel0, v4);
                    break;
                }
                case 8: {
                    z = SafeParcelReader.readBoolean(parcel0, v4);
                    break;
                }
                case 9: {
                    v3 = SafeParcelReader.readLong(parcel0, v4);
                    break;
                }
                case 10: {
                    s4 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 11: {
                    v1 = SafeParcelReader.readInt(parcel0, v4);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v4);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzawq(s, v2, s1, s2, s3, bundle0, z, v3, s4, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzawq[v];
    }
}

