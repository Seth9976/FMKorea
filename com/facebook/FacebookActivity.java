package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import b1.a;
import com.facebook.internal.F;
import com.facebook.internal.g;
import com.facebook.internal.w;
import com.facebook.login.e;
import com.facebook.referrals.b;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FacebookActivity extends h {
    private Fragment E;
    public static String F = "PassThrough";
    private static String G = "SingleFragment";
    private static final String H = "com.facebook.FacebookActivity";

    static {
    }

    public Fragment Z0() {
        return this.E;
    }

    protected Fragment a1() {
        Intent intent0 = this.getIntent();
        FragmentManager fragmentManager0 = this.P0();
        Fragment fragment0 = fragmentManager0.i0("SingleFragment");
        if(fragment0 == null) {
            if("FacebookDialogFragment".equals(intent0.getAction())) {
                fragment0 = new g();
                fragment0.setRetainInstance(true);
                ((c)fragment0).show(fragmentManager0, "SingleFragment");
                return fragment0;
            }
            if("DeviceShareDialogFragment".equals(intent0.getAction())) {
                fragment0 = new DeviceShareDialogFragment();
                fragment0.setRetainInstance(true);
                ((DeviceShareDialogFragment)fragment0).x(((ShareContent)intent0.getParcelableExtra("content")));
                ((c)fragment0).show(fragmentManager0, "SingleFragment");
                return fragment0;
            }
            if("ReferralFragment".equals(intent0.getAction())) {
                fragment0 = new b();
                fragment0.setRetainInstance(true);
                fragmentManager0.p().b(com.facebook.common.b.c, fragment0, "SingleFragment").g();
                return fragment0;
            }
            fragment0 = new e();
            fragment0.setRetainInstance(true);
            fragmentManager0.p().b(com.facebook.common.b.c, fragment0, "SingleFragment").g();
        }
        return fragment0;
    }

    private void b1() {
        com.facebook.e e0 = w.q(w.u(this.getIntent()));
        this.setResult(0, w.m(this.getIntent(), null, e0));
        this.finish();
    }

    @Override  // androidx.fragment.app.h
    public void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        if(a.d(this)) {
            return;
        }
        try {
            if(e1.b.j(s, printWriter0, arr_s)) {
                return;
            }
            super.dump(s, fileDescriptor0, printWriter0, arr_s);
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
        }
    }

    @Override  // androidx.activity.ComponentActivity
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        Fragment fragment0 = this.E;
        if(fragment0 != null) {
            fragment0.onConfigurationChanged(configuration0);
        }
    }

    @Override  // androidx.fragment.app.h
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        if(!com.facebook.h.v()) {
            F.V("com.facebook.FacebookActivity", "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application\'s onCreate method.");
            com.facebook.h.B(this.getApplicationContext());
        }
        this.setContentView(com.facebook.common.c.a);
        if("PassThrough".equals(intent0.getAction())) {
            this.b1();
            return;
        }
        this.E = this.a1();
    }
}

