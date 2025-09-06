package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.d;
import b1.a;

public class e {
    private Uri a;

    public e(String s, Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        this.a = e.a(s, bundle0);
    }

    public static Uri a(String s, Bundle bundle0) {
        Class class0 = e.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            return F.d("m.facebook.com", "v9.0/dialog/" + s, bundle0);
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    public boolean b(Activity activity0, String s) {
        if(a.d(this)) {
            return false;
        }
        try {
            d d0 = new androidx.browser.customtabs.d.d(com.facebook.login.a.a()).a();
            d0.a.setPackage(s);
            d0.a.addFlags(0x40000000);
            try {
                d0.a(activity0, this.a);
                return true;
            }
            catch(ActivityNotFoundException unused_ex) {
                return false;
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
            return false;
        }
    }
}

