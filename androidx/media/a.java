package androidx.media;

import android.os.Bundle;

public abstract class a {
    public static boolean a(Bundle bundle0, Bundle bundle1) {
        if(bundle0 == bundle1) {
            return true;
        }
        if(bundle0 == null) {
            return bundle1.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
        }
        return bundle1 == null ? bundle0.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle0.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle0.getInt("android.media.browse.extra.PAGE", -1) == bundle1.getInt("android.media.browse.extra.PAGE", -1) && bundle0.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }
}

