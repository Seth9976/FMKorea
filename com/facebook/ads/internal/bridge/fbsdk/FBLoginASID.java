package com.facebook.ads.internal.bridge.fbsdk;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.facebook.AccessToken;

@Keep
public class FBLoginASID {
    @SuppressLint({"CatchGeneralException"})
    public static String getFBLoginASID() {
        try {
            Object object0 = AccessToken.class.getDeclaredMethod("getCurrentAccessToken", null).invoke(null, null);
            return object0 == null ? null : ((String)AccessToken.class.getDeclaredMethod("getUserId", null).invoke(object0, null));
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }
}

