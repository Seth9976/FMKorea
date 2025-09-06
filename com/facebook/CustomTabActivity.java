package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class CustomTabActivity extends Activity {
    private BroadcastReceiver f;
    public static final String g;
    public static final String h;

    // 去混淆评级： 低(26)
    static {
        CustomTabActivity.g = "CustomTabActivity.action_customTabRedirect";
        CustomTabActivity.h = "CustomTabActivity.action_destroy";
    }

    @Override  // android.app.Activity
    protected void onActivityResult(int v, int v1, Intent intent0) {
        class a extends BroadcastReceiver {
            final CustomTabActivity a;

            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                CustomTabActivity.this.finish();
            }
        }

        super.onActivityResult(v, v1, intent0);
        if(v1 == 0) {
            Intent intent1 = new Intent("CustomTabActivity.action_customTabRedirect");
            intent1.putExtra("CustomTabMainActivity.extra_url", this.getIntent().getDataString());
            X.a.b(this).d(intent1);
            this.f = new a(this);
            X.a.b(this).c(this.f, new IntentFilter("CustomTabActivity.action_destroy"));
        }
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Intent intent0 = new Intent(this, CustomTabMainActivity.class);
        intent0.setAction("CustomTabActivity.action_customTabRedirect");
        intent0.putExtra("CustomTabMainActivity.extra_url", this.getIntent().getDataString());
        intent0.addFlags(0x24000000);
        this.startActivityForResult(intent0, 2);
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        X.a.b(this).e(this.f);
        super.onDestroy();
    }
}

