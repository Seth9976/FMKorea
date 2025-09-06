package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

public final class zzbts implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        ApplicationInfo applicationInfo0 = null;
        String s = null;
        PackageInfo packageInfo0 = null;
        String s1 = null;
        String s2 = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v2)) {
                case 1: {
                    applicationInfo0 = (ApplicationInfo)SafeParcelReader.createParcelable(parcel0, v2, ApplicationInfo.CREATOR);
                    break;
                }
                case 2: {
                    s = SafeParcelReader.createString(parcel0, v2);
                    break;
                }
                case 3: {
                    packageInfo0 = (PackageInfo)SafeParcelReader.createParcelable(parcel0, v2, PackageInfo.CREATOR);
                    break;
                }
                case 4: {
                    s1 = SafeParcelReader.createString(parcel0, v2);
                    break;
                }
                case 5: {
                    v1 = SafeParcelReader.readInt(parcel0, v2);
                    break;
                }
                case 6: {
                    s2 = SafeParcelReader.createString(parcel0, v2);
                    break;
                }
                case 7: {
                    list0 = SafeParcelReader.createStringList(parcel0, v2);
                    break;
                }
                case 8: {
                    z = SafeParcelReader.readBoolean(parcel0, v2);
                    break;
                }
                case 9: {
                    z1 = SafeParcelReader.readBoolean(parcel0, v2);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v2);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzbtr(applicationInfo0, s, packageInfo0, s1, v1, s2, list0, z, z1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzbtr[v];
    }
}

