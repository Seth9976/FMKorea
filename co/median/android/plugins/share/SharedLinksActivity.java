package co.median.android.plugins.share;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.d;
import co.median.android.MainActivity;

public class SharedLinksActivity extends d {
    private static final String G = "co.median.android.plugins.share.SharedLinksActivity";

    static {
    }

    private void n1() {
        try {
            Intent intent0 = this.getIntent();
            Intent intent1 = new Intent(this, MainActivity.class);
            intent1.setFlags(0x24000000);
            intent1.setAction(intent0.getAction());
            intent1.setDataAndType(intent0.getData(), intent0.getType());
            intent1.putExtras(intent0.getExtras());
            this.startActivity(intent1);
            this.finish();
        }
        catch(ClassNotFoundException classNotFoundException0) {
            Log.e("co.median.android.plugins.share.SharedLinksActivity", "launchApp: ", classNotFoundException0);
        }
    }

    @Override  // androidx.fragment.app.h
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.n1();
    }
}

