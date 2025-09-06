package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class v implements Iterable {
    public interface a {
        Intent E();
    }

    private final ArrayList f;
    private final Context g;

    private v(Context context0) {
        this.f = new ArrayList();
        this.g = context0;
    }

    public v a(Intent intent0) {
        this.f.add(intent0);
        return this;
    }

    public v c(Activity activity0) {
        Intent intent0 = activity0 instanceof a ? ((a)activity0).E() : null;
        if(intent0 == null) {
            intent0 = k.a(activity0);
        }
        if(intent0 != null) {
            ComponentName componentName0 = intent0.getComponent();
            if(componentName0 == null) {
                componentName0 = intent0.resolveActivity(this.g.getPackageManager());
            }
            this.d(componentName0);
            this.a(intent0);
        }
        return this;
    }

    public v d(ComponentName componentName0) {
        int v = this.f.size();
        try {
            for(Intent intent0 = k.b(this.g, componentName0); intent0 != null; intent0 = k.b(this.g, componentName1)) {
                this.f.add(v, intent0);
                ComponentName componentName1 = intent0.getComponent();
            }
            return this;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(packageManager$NameNotFoundException0);
        }
    }

    public static v e(Context context0) {
        return new v(context0);
    }

    public void h() {
        this.i(null);
    }

    public void i(Bundle bundle0) {
        if(this.f.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] arr_intent = (Intent[])this.f.toArray(new Intent[0]);
        arr_intent[0] = new Intent(arr_intent[0]).addFlags(0x1000C000);
        if(!androidx.core.content.a.startActivities(this.g, arr_intent, bundle0)) {
            Intent intent0 = new Intent(arr_intent[arr_intent.length - 1]);
            intent0.addFlags(0x10000000);
            this.g.startActivity(intent0);
        }
    }

    @Override
    public Iterator iterator() {
        return this.f.iterator();
    }
}

