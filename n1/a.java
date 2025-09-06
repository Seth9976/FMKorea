package N1;

import android.content.ContentResolver;
import android.provider.Settings.Global;

public class a {
    static {
    }

    public float a(ContentResolver contentResolver0) {
        return Settings.Global.getFloat(contentResolver0, "animator_duration_scale", 1.0f);
    }
}

