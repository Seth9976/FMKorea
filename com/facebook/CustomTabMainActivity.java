package com.facebook;

import X.a;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.F;
import com.facebook.internal.e;
import com.facebook.internal.w;

public class CustomTabMainActivity extends Activity {
    private boolean f;
    private BroadcastReceiver g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;

    // 去混淆评级： 低(34)
    static {
        CustomTabMainActivity.h = "CustomTabMainActivity.extra_action";
        CustomTabMainActivity.i = "CustomTabMainActivity.extra_params";
        CustomTabMainActivity.j = "CustomTabMainActivity.extra_chromePackage";
        CustomTabMainActivity.k = "CustomTabMainActivity.extra_url";
        CustomTabMainActivity.l = "CustomTabMainActivity.action_refresh";
        CustomTabMainActivity.m = "CustomTabMainActivity.no_activity_exception";
    }

    public CustomTabMainActivity() {
        this.f = true;
    }

    private static Bundle a(String s) {
        Uri uri0 = Uri.parse(s);
        Bundle bundle0 = F.a0(uri0.getQuery());
        bundle0.putAll(F.a0(uri0.getFragment()));
        return bundle0;
    }

    private void b(int v, Intent intent0) {
        a.b(this).e(this.g);
        if(intent0 == null) {
            this.setResult(v, w.m(this.getIntent(), null, null));
        }
        else {
            String s = intent0.getStringExtra("CustomTabMainActivity.extra_url");
            Bundle bundle0 = s == null ? new Bundle() : CustomTabMainActivity.a(s);
            Intent intent1 = w.m(this.getIntent(), bundle0, null);
            if(intent1 != null) {
                intent0 = intent1;
            }
            this.setResult(v, intent0);
        }
        this.finish();
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        class com.facebook.CustomTabMainActivity.a extends BroadcastReceiver {
            final CustomTabMainActivity a;

            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                Intent intent1 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
                intent1.setAction("CustomTabMainActivity.action_refresh");
                intent1.putExtra("CustomTabMainActivity.extra_url", intent0.getStringExtra("CustomTabMainActivity.extra_url"));
                intent1.addFlags(0x24000000);
                CustomTabMainActivity.this.startActivity(intent1);
            }
        }

        super.onCreate(bundle0);
        if("CustomTabActivity.action_customTabRedirect".equals(this.getIntent().getAction())) {
            this.setResult(0);
            this.finish();
            return;
        }
        if(bundle0 == null) {
            String s = this.getIntent().getStringExtra("CustomTabMainActivity.extra_action");
            Bundle bundle1 = this.getIntent().getBundleExtra("CustomTabMainActivity.extra_params");
            String s1 = this.getIntent().getStringExtra("CustomTabMainActivity.extra_chromePackage");
            boolean z = new e(s, bundle1).b(this, s1);
            this.f = false;
            if(!z) {
                this.setResult(0, this.getIntent().putExtra("CustomTabMainActivity.no_activity_exception", true));
                this.finish();
                return;
            }
            this.g = new com.facebook.CustomTabMainActivity.a(this);
            a.b(this).c(this.g, new IntentFilter("CustomTabActivity.action_customTabRedirect"));
        }
    }

    @Override  // android.app.Activity
    protected void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        if("CustomTabMainActivity.action_refresh".equals(intent0.getAction())) {
            Intent intent1 = new Intent("CustomTabActivity.action_destroy");
            a.b(this).d(intent1);
            this.b(-1, intent0);
            return;
        }
        if("CustomTabActivity.action_customTabRedirect".equals(intent0.getAction())) {
            this.b(-1, intent0);
        }
    }

    @Override  // android.app.Activity
    protected void onResume() {
        super.onResume();
        if(this.f) {
            this.b(0, null);
        }
        this.f = true;
    }
}

