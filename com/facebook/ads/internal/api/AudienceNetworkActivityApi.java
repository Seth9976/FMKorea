package com.facebook.ads.internal.api;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.Keep;
import com.facebook.proguard.annotations.DoNotStripAny;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@Keep
@DoNotStripAny
public interface AudienceNetworkActivityApi {
    public static final int EXTERNAL_FINISH_REASON;

    void dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4);

    void finish(int arg1);

    void onActivityResult(int arg1, int arg2, Intent arg3);

    void onBackPressed();

    void onConfigurationChanged(Configuration arg1);

    void onCreate(Bundle arg1);

    void onDestroy();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle arg1);

    void onStart();

    void onStop();

    boolean onTouchEvent(MotionEvent arg1);
}

