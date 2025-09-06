package co.median.android;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.d;

public class AppLinksActivity extends d {
    private void n1() {
        Intent intent0 = new Intent(this, LaunchActivity.class);
        if(this.getIntent().getData() != null) {
            intent0.setData(this.getIntent().getData());
            intent0.setAction("android.intent.action.VIEW");
            intent0.setFlags(0x34000000);
            intent0.putExtra("source", "app_links");
        }
        this.startActivity(intent0);
        this.finish();
    }

    @Override  // androidx.fragment.app.h
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.n1();
    }
}

