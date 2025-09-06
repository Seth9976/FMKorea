package com.facebook.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@SuppressLint({"MissingSuperCall"})
@Keep
public class AudienceNetworkActivity extends Activity {
    class a implements AudienceNetworkActivityApi {
        final AudienceNetworkActivity a;

        @Override  // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
            AudienceNetworkActivity.this.super.dump(s, fileDescriptor0, printWriter0, arr_s);
        }

        @Override  // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void finish(int v) {
            AudienceNetworkActivity.this.super.finish();
        }

        @Override  // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onActivityResult(int v, int v1, Intent intent0) {
            AudienceNetworkActivity.this.super.onActivityResult(v, v1, intent0);
        }

        @Override  // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onBackPressed() {
            AudienceNetworkActivity.this.super.onBackPressed();
        }

        @Override  // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onConfigurationChanged(Configuration configuration0) {
            AudienceNetworkActivity.this.super.onConfigurationChanged(configuration0);
        }

        @Override  // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onCreate(Bundle bundle0) {
            AudienceNetworkActivity.this.super.onCreate(bundle0);
        }

        @Override  // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onDestroy() {
            AudienceNetworkActivity.this.super.onDestroy();
        }

        @Override  // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onPause() {
            AudienceNetworkActivity.this.super.onPause();
        }

        @Override  // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onResume() {
            AudienceNetworkActivity.this.super.onResume();
        }

        @Override  // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onSaveInstanceState(Bundle bundle0) {
            AudienceNetworkActivity.this.super.onSaveInstanceState(bundle0);
        }

        @Override  // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onStart() {
            AudienceNetworkActivity.this.super.onStart();
        }

        @Override  // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onStop() {
            AudienceNetworkActivity.this.super.onStop();
        }

        @Override  // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public boolean onTouchEvent(MotionEvent motionEvent0) {
            return AudienceNetworkActivity.this.super.onTouchEvent(motionEvent0);
        }
    }

    private AudienceNetworkActivityApi mAudienceNetworkActivityApi;
    private final AudienceNetworkActivityApi mAudienceNetworkActivityParentApi;

    public AudienceNetworkActivity() {
        this.mAudienceNetworkActivityParentApi = new a(this);
    }

    @Override  // android.app.Activity
    public void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        this.mAudienceNetworkActivityApi.dump(s, fileDescriptor0, printWriter0, arr_s);
    }

    @Override  // android.app.Activity
    public void finish() {
        this.mAudienceNetworkActivityApi.finish(0);
    }

    @Override  // android.app.Activity
    protected void onActivityResult(int v, int v1, Intent intent0) {
        this.mAudienceNetworkActivityApi.onActivityResult(v, v1, intent0);
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        this.mAudienceNetworkActivityApi.onBackPressed();
    }

    @Override  // android.app.Activity
    public void onConfigurationChanged(Configuration configuration0) {
        this.mAudienceNetworkActivityApi.onConfigurationChanged(configuration0);
    }

    @Override  // android.app.Activity
    public void onCreate(Bundle bundle0) {
        AudienceNetworkActivityApi audienceNetworkActivityApi0 = DynamicLoaderFactory.makeLoader(this).createAudienceNetworkActivity(this, this.mAudienceNetworkActivityParentApi);
        this.mAudienceNetworkActivityApi = audienceNetworkActivityApi0;
        audienceNetworkActivityApi0.onCreate(bundle0);
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        this.mAudienceNetworkActivityApi.onDestroy();
    }

    @Override  // android.app.Activity
    public void onPause() {
        this.mAudienceNetworkActivityApi.onPause();
    }

    @Override  // android.app.Activity
    public void onResume() {
        this.mAudienceNetworkActivityApi.onResume();
    }

    @Override  // android.app.Activity
    public void onSaveInstanceState(Bundle bundle0) {
        this.mAudienceNetworkActivityApi.onSaveInstanceState(bundle0);
    }

    @Override  // android.app.Activity
    public void onStart() {
        this.mAudienceNetworkActivityApi.onStart();
    }

    @Override  // android.app.Activity
    protected void onStop() {
        this.mAudienceNetworkActivityApi.onStop();
    }

    @Override  // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        return this.mAudienceNetworkActivityApi.onTouchEvent(motionEvent0);
    }
}

