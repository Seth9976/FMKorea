package F;

import B.h;
import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.Y;
import androidx.core.view.d.a;

public abstract class e {
    public interface c {
        boolean a(f arg1, int arg2, Bundle arg3);
    }

    private static c b(View view0) {
        h.g(view0);
        return (f f0, int v, Bundle bundle0) -> {
            if(Build.VERSION.SDK_INT >= 25 && (v & 1) != 0) {
                try {
                    f0.d();
                }
                catch(Exception exception0) {
                    Log.w("InputConnectionCompat", "Can\'t insert content from IME; requestPermission() failed", exception0);
                    return false;
                }
                Parcelable parcelable0 = (Parcelable)f0.e();
                bundle0 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
                bundle0.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable0);
                return Y.e0(view0, new a(new ClipData(f0.b(), new ClipData.Item(f0.a())), 2).d(f0.c()).b(bundle0).a()) == null;
            }
            return Y.e0(view0, new a(new ClipData(f0.b(), new ClipData.Item(f0.a())), 2).d(f0.c()).b(bundle0).a()) == null;
        };
    }

    public static InputConnection c(View view0, InputConnection inputConnection0, EditorInfo editorInfo0) {
        return e.d(inputConnection0, editorInfo0, e.b(view0));
    }

    public static InputConnection d(InputConnection inputConnection0, EditorInfo editorInfo0, c e$c0) {
        class F.e.a extends InputConnectionWrapper {
            final c a;

            F.e.a(InputConnection inputConnection0, boolean z, c e$c0) {
                this.a = e$c0;
                super(inputConnection0, z);
            }

            @Override  // android.view.inputmethod.InputConnectionWrapper
            public boolean commitContent(InputContentInfo inputContentInfo0, int v, Bundle bundle0) {
                f f0 = f.f(inputContentInfo0);
                return this.a.a(f0, v, bundle0) ? true : super.commitContent(inputContentInfo0, v, bundle0);
            }
        }


        class b extends InputConnectionWrapper {
            final c a;

            b(InputConnection inputConnection0, boolean z, c e$c0) {
                this.a = e$c0;
                super(inputConnection0, z);
            }

            // 去混淆评级： 低(20)
            @Override  // android.view.inputmethod.InputConnectionWrapper
            public boolean performPrivateCommand(String s, Bundle bundle0) {
                return e.e(s, bundle0, this.a) ? true : super.performPrivateCommand(s, bundle0);
            }
        }

        B.c.d(inputConnection0, "inputConnection must be non-null");
        B.c.d(editorInfo0, "editorInfo must be non-null");
        B.c.d(e$c0, "onCommitContentListener must be non-null");
        if(Build.VERSION.SDK_INT >= 25) {
            return new F.e.a(inputConnection0, false, e$c0);
        }
        return F.c.a(editorInfo0).length == 0 ? inputConnection0 : new b(inputConnection0, false, e$c0);
    }

    static boolean e(String s, Bundle bundle0, c e$c0) {
        ResultReceiver resultReceiver0;
        boolean z1;
        boolean z = false;
        if(bundle0 == null) {
            return false;
        }
        if(TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", s)) {
            z1 = false;
            goto label_8;
        }
        if(TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", s)) {
            z1 = true;
            try {
            label_8:
                resultReceiver0 = null;
                resultReceiver0 = (ResultReceiver)bundle0.getParcelable((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"));
                Uri uri0 = (Uri)bundle0.getParcelable((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"));
                ClipDescription clipDescription0 = (ClipDescription)bundle0.getParcelable((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"));
                Uri uri1 = (Uri)bundle0.getParcelable((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"));
                int v = bundle0.getInt((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"));
                Bundle bundle1 = (Bundle)bundle0.getParcelable((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"));
                if(uri0 != null && clipDescription0 != null) {
                    z = e$c0.a(new f(uri0, clipDescription0, uri1), v, bundle1);
                    goto label_22;
                label_19:
                    if(resultReceiver0 == null) {
                        throw throwable0;
                    }
                    goto label_20;
                }
                goto label_22;
            }
            catch(Throwable throwable0) {
                goto label_19;
            }
        label_20:
            resultReceiver0.send(0, null);
            throw throwable0;
        label_22:
            if(resultReceiver0 != null) {
                resultReceiver0.send(((int)z), null);
            }
            return z;
        }
        return false;
    }

    // 检测为 Lambda 实现
    private static boolean f(View view0, f f0, int v, Bundle bundle0) [...]
}

