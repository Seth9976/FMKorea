package com.facebook.internal;

import G3.h;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import m3.L;
import m3.o;
import z3.k;

public final class j {
    private static final HashSet a;
    public static final j b;

    static {
        j.b = new j();
        j.a = L.f(new String[]{"8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "5e8f16062ea3cd2c4a0d547876baa6f38cabf625", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3"});
    }

    public static final boolean a(Context context0, String s) {
        k.e(context0, "context");
        k.e(s, "packageName");
        String s1 = Build.BRAND;
        int v = context0.getApplicationInfo().flags;
        k.d(s1, "brand");
        if(h.u(s1, "generic", false, 2, null) && (v & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo(s, 0x40);
            Signature[] arr_signature = packageInfo0.signatures;
            if(arr_signature != null) {
                k.d(arr_signature, "packageInfo.signatures");
                if(arr_signature.length != 0) {
                    Signature[] arr_signature1 = packageInfo0.signatures;
                    k.d(arr_signature1, "packageInfo.signatures");
                    for(int v1 = 0; v1 < arr_signature1.length; ++v1) {
                        byte[] arr_b = arr_signature1[v1].toByteArray();
                        k.d(arr_b, "it.toByteArray()");
                        String s2 = F.p0(arr_b);
                        if(!o.q(j.a, s2)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }
}

