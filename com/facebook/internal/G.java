package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import com.facebook.e;

public class g extends c {
    private Dialog f;

    @Override  // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        if(this.f instanceof H && this.isResumed()) {
            ((H)this.f).s();
        }
    }

    @Override  // androidx.fragment.app.c
    public void onCreate(Bundle bundle0) {
        class a implements com.facebook.internal.H.g {
            final g a;

            @Override  // com.facebook.internal.H$g
            public void a(Bundle bundle0, e e0) {
                g.this.q(bundle0, e0);
            }
        }


        class b implements com.facebook.internal.H.g {
            final g a;

            @Override  // com.facebook.internal.H$g
            public void a(Bundle bundle0, e e0) {
                g.this.r(bundle0);
            }
        }

        H h1;
        super.onCreate(bundle0);
        if(this.f == null) {
            h h0 = this.getActivity();
            Bundle bundle1 = w.u(h0.getIntent());
            if(bundle1.getBoolean("is_fallback", false)) {
                String s1 = bundle1.getString("url");
                if(F.P(s1)) {
                    F.V("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing \'url\'");
                    h0.finish();
                    return;
                }
                h1 = k.A(h0, s1, String.format("fb%s://bridge/", com.facebook.h.f()));
                h1.w((Bundle bundle0, /* 缺少LAMBDA参数 */) -> {
                    h h0 = g.this.getActivity();
                    Intent intent0 = new Intent();
                    if(bundle0 == null) {
                        bundle0 = new Bundle();
                    }
                    intent0.putExtras(bundle0);
                    h0.setResult(-1, intent0);
                    h0.finish();
                });
            }
            else {
                String s = bundle1.getString("action");
                Bundle bundle2 = bundle1.getBundle("params");
                if(F.P(s)) {
                    F.V("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing \'actionName\'");
                    h0.finish();
                    return;
                }
                h1 = new com.facebook.internal.H.e(h0, s, bundle2).h((Bundle bundle0, e e0) -> {
                    h h0 = g.this.getActivity();
                    h0.setResult((e0 == null ? -1 : 0), w.m(h0.getIntent(), bundle0, e0));
                    h0.finish();
                }).a();
            }
            this.f = h1;
        }
    }

    @Override  // androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle0) {
        if(this.f == null) {
            this.q(null, null);
            this.setShowsDialog(false);
        }
        return this.f;
    }

    @Override  // androidx.fragment.app.c
    public void onDestroyView() {
        if(this.getDialog() != null && this.getRetainInstance()) {
            this.getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog0 = this.f;
        if(dialog0 instanceof H) {
            ((H)dialog0).s();
        }
    }

    // 检测为 Lambda 实现
    private void q(Bundle bundle0, e e0) [...]

    // 检测为 Lambda 实现
    private void r(Bundle bundle0) [...]

    public void s(Dialog dialog0) {
        this.f = dialog0;
    }
}

