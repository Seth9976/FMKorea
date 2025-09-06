package P1;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import x.a;

public abstract class j {
    public static Typeface a(Context context0, Typeface typeface0) {
        return j.b(context0.getResources().getConfiguration(), typeface0);
    }

    public static Typeface b(Configuration configuration0, Typeface typeface0) {
        if(Build.VERSION.SDK_INT >= 0x1F && (configuration0.fontWeightAdjustment != 0 && configuration0.fontWeightAdjustment != 0x7FFFFFFF)) {
            return typeface0 == null ? null : Typeface.create(typeface0, a.b(typeface0.getWeight() + configuration0.fontWeightAdjustment, 1, 1000), typeface0.isItalic());
        }
        return null;
    }
}

