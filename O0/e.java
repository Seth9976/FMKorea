package O0;

import android.util.Log;

public abstract class e {
    private static final String a = "O0.e";
    private static Class b;

    static {
    }

    public static void a() {
        e.c("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    public static void b(String s) {
        e.c("UnityFacebookSDKPlugin", "OnReceiveMapping", s);
    }

    public static void c(String s, String s1, String s2) {
        try {
            if(e.b == null) {
                e.b = Class.forName("com.unity3d.player.UnityPlayer");
            }
            e.b.getMethod("UnitySendMessage", String.class, String.class, String.class).invoke(e.b, s, s1, s2);
            return;
        }
        catch(Exception exception0) {
        }
        Log.e("O0.e", "Failed to send message to Unity", exception0);
    }
}

