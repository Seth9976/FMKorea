package androidx.core.view;

import android.content.ClipData;
import android.view.ContentInfo.Builder;

public abstract class g {
    public static ContentInfo.Builder a(ClipData clipData0, int v) {
        return new ContentInfo.Builder(clipData0, v);
    }
}

