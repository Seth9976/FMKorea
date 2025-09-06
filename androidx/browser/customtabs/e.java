package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import b.b;

public abstract class e implements ServiceConnection {
    private Context mApplicationContext;

    Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName arg1, c arg2);

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        class a extends c {
            final e d;

            a(b b0, ComponentName componentName0, Context context0) {
                super(b0, componentName0, context0);
            }
        }

        if(this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        this.onCustomTabsServiceConnected(componentName0, new a(this, b.b.a.v(iBinder0), componentName0, this.mApplicationContext));
    }

    void setApplicationContext(Context context0) {
        this.mApplicationContext = context0;
    }
}

