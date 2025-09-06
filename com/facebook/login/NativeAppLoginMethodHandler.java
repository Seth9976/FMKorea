package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.c;
import com.facebook.e;
import com.facebook.internal.F;
import com.facebook.internal.z;

abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    NativeAppLoginMethodHandler(Parcel parcel0) {
        super(parcel0);
    }

    NativeAppLoginMethodHandler(LoginClient loginClient0) {
        super(loginClient0);
    }

    @Override  // com.facebook.login.LoginMethodHandler
    boolean j(int v, int v1, Intent intent0) {
        Result loginClient$Result0;
        Request loginClient$Request0 = this.g.q();
        if(intent0 == null) {
            loginClient$Result0 = Result.a(loginClient$Request0, "Operation canceled");
        }
        else if(v1 == 0) {
            loginClient$Result0 = this.q(loginClient$Request0, intent0);
        }
        else {
            loginClient$Result0 = v1 == -1 ? this.r(loginClient$Request0, intent0) : Result.b(loginClient$Request0, "Unexpected resultCode from authorization.", null);
        }
        if(loginClient$Result0 != null) {
            this.g.g(loginClient$Result0);
            return true;
        }
        this.g.E();
        return true;
    }

    private String o(Bundle bundle0) {
        String s = bundle0.getString("error");
        return s == null ? bundle0.getString("error_type") : s;
    }

    private String p(Bundle bundle0) {
        String s = bundle0.getString("error_message");
        return s == null ? bundle0.getString("error_description") : s;
    }

    private Result q(Request loginClient$Request0, Intent intent0) {
        Bundle bundle0 = intent0.getExtras();
        String s = this.o(bundle0);
        String s1 = bundle0.get("error_code") == null ? null : bundle0.get("error_code").toString();
        return "CONNECTION_FAILURE".equals(s1) ? Result.c(loginClient$Request0, s, this.p(bundle0), s1) : Result.a(loginClient$Request0, s);
    }

    private Result r(Request loginClient$Request0, Intent intent0) {
        Bundle bundle0 = intent0.getExtras();
        String s = this.o(bundle0);
        String s1 = bundle0.get("error_code") == null ? null : bundle0.get("error_code").toString();
        String s2 = this.p(bundle0);
        String s3 = bundle0.getString("e2e");
        if(!F.P(s3)) {
            this.h(s3);
        }
        if(s == null && s1 == null && s2 == null) {
            try {
                return Result.d(loginClient$Request0, LoginMethodHandler.d(loginClient$Request0.h(), bundle0, c.h, loginClient$Request0.a()));
            }
            catch(e e0) {
                return Result.b(loginClient$Request0, null, e0.getMessage());
            }
        }
        if(s.equals("logged_out")) {
            CustomTabLoginMethodHandler.l = true;
            return null;
        }
        if(z.d().contains(s)) {
            return null;
        }
        return z.e().contains(s) ? Result.a(loginClient$Request0, null) : Result.c(loginClient$Request0, s, s2, s1);
    }

    protected boolean s(Intent intent0, int v) {
        if(intent0 == null) {
            return false;
        }
        try {
            this.g.l().startActivityForResult(intent0, v);
            return true;
        }
        catch(ActivityNotFoundException unused_ex) {
            return false;
        }
    }
}

