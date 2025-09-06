package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;

public class e extends Fragment {
    private String f;
    private LoginClient g;
    private Request h;

    protected LoginClient n() {
        return new LoginClient(this);
    }

    protected int o() [...] // 潜在的解密器

    @Override  // androidx.fragment.app.Fragment
    public void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        this.g.y(v, v1, intent0);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle0) {
        class a implements c {
            final e a;

            @Override  // com.facebook.login.LoginClient$c
            public void a(Result loginClient$Result0) {
                e.this.r(loginClient$Result0);
            }
        }

        super.onCreate(bundle0);
        if(bundle0 == null) {
            this.g = this.n();
        }
        else {
            LoginClient loginClient0 = (LoginClient)bundle0.getParcelable("loginClient");
            this.g = loginClient0;
            loginClient0.A(this);
        }
        this.g.B((Result loginClient$Result0) -> {
            e.this.h = null;
            int v = loginClient$Result0.f == b.h ? 0 : -1;
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("com.facebook.LoginFragment:Result", loginClient$Result0);
            Intent intent0 = new Intent();
            intent0.putExtras(bundle0);
            if(e.this.isAdded()) {
                e.this.getActivity().setResult(v, intent0);
                e.this.getActivity().finish();
            }
        });
        h h0 = this.getActivity();
        if(h0 == null) {
            return;
        }
        this.q(h0);
        Intent intent0 = h0.getIntent();
        if(intent0 != null) {
            Bundle bundle1 = intent0.getBundleExtra("com.facebook.LoginFragment:Request");
            if(bundle1 != null) {
                this.h = (Request)bundle1.getParcelable("request");
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        class com.facebook.login.e.b implements com.facebook.login.LoginClient.b {
            final View a;
            final e b;

            com.facebook.login.e.b(View view0) {
                this.a = view0;
                super();
            }

            @Override  // com.facebook.login.LoginClient$b
            public void a() {
                this.a.setVisibility(0);
            }

            @Override  // com.facebook.login.LoginClient$b
            public void b() {
                this.a.setVisibility(8);
            }
        }

        View view0 = layoutInflater0.inflate(0x7F0C0024, viewGroup0, false);  // layout:com_facebook_login_fragment
        View view1 = view0.findViewById(com.facebook.common.b.d);
        this.g.z(new com.facebook.login.e.b(this, view1));
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.g.c();
        super.onDestroy();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view0 = this.getView() == null ? null : this.getView().findViewById(com.facebook.common.b.d);
        if(view0 != null) {
            view0.setVisibility(8);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if(this.f == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            this.getActivity().finish();
            return;
        }
        this.g.C(this.h);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putParcelable("loginClient", this.g);
    }

    LoginClient p() {
        return this.g;
    }

    private void q(Activity activity0) {
        ComponentName componentName0 = activity0.getCallingActivity();
        if(componentName0 == null) {
            return;
        }
        this.f = componentName0.getPackageName();
    }

    // 检测为 Lambda 实现
    private void r(Result loginClient$Result0) [...]
}

