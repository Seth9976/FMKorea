package com.onesignal;

import android.content.pm.PackageInfo;
import z3.k;

public final class z {
    private final boolean a;
    private final PackageInfo b;

    public z(boolean z, PackageInfo packageInfo0) {
        this.a = z;
        this.b = packageInfo0;
    }

    public final PackageInfo a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof z)) {
            return false;
        }
        return this.a == ((z)object0).a ? k.a(this.b, ((z)object0).b) : false;
    }

    @Override
    public int hashCode() {
        int v = this.a;
        if(v) {
            v = 1;
        }
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public String toString() {
        return "GetPackageInfoResult(successful=" + this.a + ", packageInfo=" + this.b + ')';
    }
}

