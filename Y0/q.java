package y0;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.k;

public abstract class q {
    private static final String a;

    static {
        q.a = "WM-PackageManagerHelper";
    }

    public static void a(Context context0, Class class0, boolean z) {
        String s = "disabled";
        try {
            context0.getPackageManager().setComponentEnabledSetting(new ComponentName(context0, class0.getName()), (z ? 1 : 2), 1);
            k.e().a("WM-PackageManagerHelper", class0.getName() + " " + (z ? "enabled" : "disabled"));
        }
        catch(Exception exception0) {
            k k0 = k.e();
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(class0.getName());
            stringBuilder0.append("could not be ");
            if(z) {
                s = "enabled";
            }
            stringBuilder0.append(s);
            k0.b("WM-PackageManagerHelper", stringBuilder0.toString(), exception0);
        }
    }
}

