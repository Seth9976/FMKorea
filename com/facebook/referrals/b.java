package com.facebook.referrals;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public class b extends Fragment {
    private a f;

    @Override  // androidx.fragment.app.Fragment
    public void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        this.f.f(v, v1, intent0);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.f = new a(this);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f.g();
    }
}

