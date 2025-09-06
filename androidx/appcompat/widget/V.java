package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.Y;

abstract class v {
    static abstract class a {
        static boolean a(DragEvent dragEvent0, TextView textView0, Activity activity0) {
            activity0.requestDragAndDropPermissions(dragEvent0);
            int v = textView0.getOffsetForPosition(dragEvent0.getX(), dragEvent0.getY());
            textView0.beginBatchEdit();
            try {
                Selection.setSelection(((Spannable)textView0.getText()), v);
                Y.e0(textView0, new androidx.core.view.d.a(dragEvent0.getClipData(), 3).a());
                return true;
            }
            finally {
                textView0.endBatchEdit();
            }
        }

        static boolean b(DragEvent dragEvent0, View view0, Activity activity0) {
            activity0.requestDragAndDropPermissions(dragEvent0);
            Y.e0(view0, new androidx.core.view.d.a(dragEvent0.getClipData(), 3).a());
            return true;
        }
    }

    static boolean a(View view0, DragEvent dragEvent0) {
        if(Build.VERSION.SDK_INT < 0x1F && Build.VERSION.SDK_INT >= 24 && dragEvent0.getLocalState() == null && Y.C(view0) != null) {
            Activity activity0 = v.c(view0);
            if(activity0 == null) {
                Log.i("ReceiveContent", "Can\'t handle drop: no activity: view=" + view0);
                return false;
            }
            switch(dragEvent0.getAction()) {
                case 1: {
                    return !(view0 instanceof TextView);
                }
                case 3: {
                    return view0 instanceof TextView ? a.a(dragEvent0, ((TextView)view0), activity0) : a.b(dragEvent0, view0, activity0);
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    static boolean b(TextView textView0, int v) {
        int v1 = 0;
        if(Build.VERSION.SDK_INT < 0x1F && Y.C(textView0) != null && (v == 0x1020022 || v == 0x1020031)) {
            ClipboardManager clipboardManager0 = (ClipboardManager)textView0.getContext().getSystemService("clipboard");
            ClipData clipData0 = clipboardManager0 == null ? null : clipboardManager0.getPrimaryClip();
            if(clipData0 != null && clipData0.getItemCount() > 0) {
                androidx.core.view.d.a d$a0 = new androidx.core.view.d.a(clipData0, 1);
                if(v != 0x1020022) {
                    v1 = 1;
                }
                Y.e0(textView0, d$a0.c(v1).a());
            }
            return true;
        }
        return false;
    }

    static Activity c(View view0) {
        for(Context context0 = view0.getContext(); context0 instanceof ContextWrapper; context0 = ((ContextWrapper)context0).getBaseContext()) {
            if(context0 instanceof Activity) {
                return (Activity)context0;
            }
        }
        return null;
    }
}

