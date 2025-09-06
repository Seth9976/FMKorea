package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

public final class zzn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        Bundle bundle0 = null;
        List list0 = null;
        String s = null;
        zzfh zzfh0 = null;
        Location location0 = null;
        String s1 = null;
        Bundle bundle1 = null;
        Bundle bundle2 = null;
        List list1 = null;
        String s2 = null;
        String s3 = null;
        zzc zzc0 = null;
        String s4 = null;
        List list2 = null;
        String s5 = null;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        int v3 = 0;
        boolean z1 = false;
        boolean z2 = false;
        int v4 = 0;
        int v5 = 0;
        long v6 = 0L;
        while(parcel0.dataPosition() < v) {
            int v7 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v7)) {
                case 1: {
                    v1 = SafeParcelReader.readInt(parcel0, v7);
                    break;
                }
                case 2: {
                    v6 = SafeParcelReader.readLong(parcel0, v7);
                    break;
                }
                case 3: {
                    bundle0 = SafeParcelReader.createBundle(parcel0, v7);
                    break;
                }
                case 4: {
                    v2 = SafeParcelReader.readInt(parcel0, v7);
                    break;
                }
                case 5: {
                    list0 = SafeParcelReader.createStringList(parcel0, v7);
                    break;
                }
                case 6: {
                    z = SafeParcelReader.readBoolean(parcel0, v7);
                    break;
                }
                case 7: {
                    v3 = SafeParcelReader.readInt(parcel0, v7);
                    break;
                }
                case 8: {
                    z1 = SafeParcelReader.readBoolean(parcel0, v7);
                    break;
                }
                case 9: {
                    s = SafeParcelReader.createString(parcel0, v7);
                    break;
                }
                case 10: {
                    zzfh0 = (zzfh)SafeParcelReader.createParcelable(parcel0, v7, zzfh.CREATOR);
                    break;
                }
                case 11: {
                    location0 = (Location)SafeParcelReader.createParcelable(parcel0, v7, Location.CREATOR);
                    break;
                }
                case 12: {
                    s1 = SafeParcelReader.createString(parcel0, v7);
                    break;
                }
                case 13: {
                    bundle1 = SafeParcelReader.createBundle(parcel0, v7);
                    break;
                }
                case 14: {
                    bundle2 = SafeParcelReader.createBundle(parcel0, v7);
                    break;
                }
                case 15: {
                    list1 = SafeParcelReader.createStringList(parcel0, v7);
                    break;
                }
                case 16: {
                    s2 = SafeParcelReader.createString(parcel0, v7);
                    break;
                }
                case 17: {
                    s3 = SafeParcelReader.createString(parcel0, v7);
                    break;
                }
                case 18: {
                    z2 = SafeParcelReader.readBoolean(parcel0, v7);
                    break;
                }
                case 19: {
                    zzc0 = (zzc)SafeParcelReader.createParcelable(parcel0, v7, zzc.CREATOR);
                    break;
                }
                case 20: {
                    v4 = SafeParcelReader.readInt(parcel0, v7);
                    break;
                }
                case 21: {
                    s4 = SafeParcelReader.createString(parcel0, v7);
                    break;
                }
                case 22: {
                    list2 = SafeParcelReader.createStringList(parcel0, v7);
                    break;
                }
                case 23: {
                    v5 = SafeParcelReader.readInt(parcel0, v7);
                    break;
                }
                case 24: {
                    s5 = SafeParcelReader.createString(parcel0, v7);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v7);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzl(v1, v6, bundle0, v2, list0, z, v3, z1, s, zzfh0, location0, s1, bundle1, bundle2, list1, s2, s3, z2, zzc0, v4, s4, list2, v5, s5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzl[v];
    }
}

