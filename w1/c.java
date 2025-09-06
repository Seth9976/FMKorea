package W1;

import android.app.Activity;

public interface c {
    public interface a {
        void onConsentInfoUpdateFailure(e arg1);
    }

    public interface b {
        void onConsentInfoUpdateSuccess();
    }

    public static enum W1.c.c {
        UNKNOWN,
        NOT_REQUIRED,
        REQUIRED;

    }

    void requestConsentInfoUpdate(Activity arg1, d arg2, b arg3, a arg4);
}

