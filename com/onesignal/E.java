package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import java.util.Arrays;
import z3.k;

public final class e {
    public interface a {
        void a();

        void b();
    }

    public static final e a;

    static {
        e.a = new e();
    }

    // 检测为 Lambda 实现
    public static void a(a e$a0, DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    public static void b(a e$a0, DialogInterface dialogInterface0, int v) [...]

    public final void c(Activity activity0, String s, String s1, a e$a0) {
        k.e(activity0, "activity");
        k.e(s, "titlePrefix");
        k.e(s1, "previouslyDeniedPostfix");
        k.e(e$a0, "callback");
        String s2 = activity0.getString(h2.i);
        k.d(s2, "activity.getString(R.str…sion_not_available_title)");
        String s3 = String.format(s2, Arrays.copyOf(new Object[]{s}, 1));
        k.d(s3, "java.lang.String.format(this, *args)");
        String s4 = activity0.getString(h2.g);
        k.d(s4, "activity.getString(R.str…on_not_available_message)");
        String s5 = String.format(s4, Arrays.copyOf(new Object[]{s1}, 1));
        k.d(s5, "java.lang.String.format(this, *args)");
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(activity0).setTitle(s3).setMessage(s5);
        c c0 = (DialogInterface dialogInterface0, int v) -> e.d(e$a0, dialogInterface0, v);
        alertDialog$Builder0.setPositiveButton(h2.h, c0).setNegativeButton(0x1040009, (DialogInterface dialogInterface0, int v) -> e.e(e$a0, dialogInterface0, v)).show();
    }

    private static final void d(a e$a0, DialogInterface dialogInterface0, int v) {
        k.e(e$a0, "$callback");
        e$a0.a();
    }

    private static final void e(a e$a0, DialogInterface dialogInterface0, int v) {
        k.e(e$a0, "$callback");
        e$a0.b();
    }
}

