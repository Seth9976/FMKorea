package com.facebook.referrals;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.F;
import com.facebook.internal.e;
import com.facebook.internal.f;

class a {
    private Fragment a;
    private String b;
    protected String c;

    a(Fragment fragment0) {
        this.a = fragment0;
    }

    private void a(int v, Intent intent0) {
        if(this.a.isAdded()) {
            h h0 = this.a.getActivity();
            if(h0 != null) {
                h0.setResult(v, intent0);
                h0.finish();
            }
        }
    }

    private String b() {
        if(this.b == null) {
            this.b = f.a();
        }
        return this.b;
    }

    static String c() {
        return "fb" + com.facebook.h.f() + "://authorize";
    }

    private Bundle d() {
        Bundle bundle0 = new Bundle();
        this.c = "49njid4899s3kvld719e";
        bundle0.putString("redirect_uri", f.c(a.c()));
        bundle0.putString("app_id", com.facebook.h.f());
        bundle0.putString("state", this.c);
        return bundle0;
    }

    private boolean e() {
        return this.b() != null;
    }

    void f(int v, int v1, Intent intent0) {
        if(v != 1) {
            return;
        }
        if(intent0 != null) {
            String s = intent0.getStringExtra("CustomTabMainActivity.extra_url");
            if(s != null && s.startsWith(f.c(a.c()))) {
                Bundle bundle0 = F.a0(Uri.parse(s).getQuery());
                if(this.i(bundle0)) {
                    intent0.putExtras(bundle0);
                }
                else {
                    intent0.putExtra("error_message", "The referral response was missing a valid challenge string.");
                    v1 = 0;
                }
            }
        }
        this.a(v1, intent0);
    }

    void g() {
        if(!this.h()) {
            Intent intent0 = new Intent();
            intent0.putExtra("error_message", "Failed to open Referral dialog: Chrome custom tab could not be started. Please make sure internet permission is granted and Chrome is installed");
            this.a(0, intent0);
        }
    }

    private boolean h() {
        if(this.a.getActivity() != null && this.a.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") == 0 && this.e()) {
            Bundle bundle0 = this.d();
            if(com.facebook.h.q) {
                com.facebook.login.a.b(e.a("share_referral", bundle0));
            }
            Intent intent0 = new Intent(this.a.getActivity(), CustomTabMainActivity.class);
            intent0.putExtra("CustomTabMainActivity.extra_action", "share_referral");
            intent0.putExtra("CustomTabMainActivity.extra_params", bundle0);
            intent0.putExtra("CustomTabMainActivity.extra_chromePackage", this.b());
            this.a.startActivityForResult(intent0, 1);
            return true;
        }
        return false;
    }

    private boolean i(Bundle bundle0) {
        if(this.c != null) {
            String s = bundle0.getString("state");
            boolean z = this.c.equals(s);
            this.c = null;
            return z;
        }
        return true;
    }
}

