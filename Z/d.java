package z;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;

public abstract class d {
    public static a a(Context context0, Uri uri0) {
        return Build.VERSION.SDK_INT < 24 ? new b(context0, uri0) : new c(context0, uri0);
    }
}

