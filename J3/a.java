package j3;

import android.content.Context;
import android.content.Intent;
import java.util.List;

public abstract class a {
    public static boolean a(Context context0, Intent intent0) {
        List list0 = context0.getPackageManager().queryBroadcastReceivers(intent0, 0);
        return list0 != null && list0.size() > 0;
    }
}

