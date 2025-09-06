package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

public final class zzbuo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        boolean z = false;
        boolean z1 = false;
        Bundle bundle0 = null;
        zzcag zzcag0 = null;
        ApplicationInfo applicationInfo0 = null;
        String s = null;
        List list0 = null;
        PackageInfo packageInfo0 = null;
        String s1 = null;
        String s2 = null;
        zzfdu zzfdu0 = null;
        String s3 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v1)) {
                case 1: {
                    bundle0 = SafeParcelReader.createBundle(parcel0, v1);
                    break;
                }
                case 2: {
                    zzcag0 = (zzcag)SafeParcelReader.createParcelable(parcel0, v1, zzcag.CREATOR);
                    break;
                }
                case 3: {
                    applicationInfo0 = (ApplicationInfo)SafeParcelReader.createParcelable(parcel0, v1, ApplicationInfo.CREATOR);
                    break;
                }
                case 4: {
                    s = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 5: {
                    list0 = SafeParcelReader.createStringList(parcel0, v1);
                    break;
                }
                case 6: {
                    packageInfo0 = (PackageInfo)SafeParcelReader.createParcelable(parcel0, v1, PackageInfo.CREATOR);
                    break;
                }
                case 7: {
                    s1 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 9: {
                    s2 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 10: {
                    zzfdu0 = (zzfdu)SafeParcelReader.createParcelable(parcel0, v1, zzfdu.CREATOR);
                    break;
                }
                case 11: {
                    s3 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 12: {
                    z = SafeParcelReader.readBoolean(parcel0, v1);
                    break;
                }
                case 13: {
                    z1 = SafeParcelReader.readBoolean(parcel0, v1);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v1);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzbun(bundle0, zzcag0, applicationInfo0, s, list0, packageInfo0, s1, s2, zzfdu0, s3, z, z1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzbun[v];
    }
}

