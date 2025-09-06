package B0;

import android.webkit.ValueCallback;
import co.median.android.MainActivity;

public final class m0 implements ValueCallback {
    @Override  // android.webkit.ValueCallback
    public final void onReceiveValue(Object object0) {
        MainActivity.z2(((Boolean)object0));
    }
}

