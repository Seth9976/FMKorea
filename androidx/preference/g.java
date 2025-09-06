package androidx.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;

public abstract class g extends c implements DialogInterface.OnClickListener {
    static abstract class a {
        static void a(Window window0) {
            window0.getDecorView().getWindowInsetsController().show(8);
        }
    }

    private DialogPreference f;
    private CharSequence g;
    private CharSequence h;
    private CharSequence i;
    private CharSequence j;
    private int k;
    private BitmapDrawable l;
    private int m;

    public DialogPreference o() {
        if(this.f == null) {
            String s = this.requireArguments().getString("key");
            this.f = (DialogPreference)((androidx.preference.DialogPreference.a)this.getTargetFragment()).a(s);
        }
        return this.f;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface0, int v) {
        this.m = v;
    }

    @Override  // androidx.fragment.app.c
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Fragment fragment0 = this.getTargetFragment();
        if(!(fragment0 instanceof androidx.preference.DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        String s = this.requireArguments().getString("key");
        if(bundle0 == null) {
            DialogPreference dialogPreference0 = (DialogPreference)((androidx.preference.DialogPreference.a)fragment0).a(s);
            this.f = dialogPreference0;
            this.g = dialogPreference0.K0();
            this.h = this.f.M0();
            this.i = this.f.L0();
            this.j = this.f.J0();
            this.k = this.f.I0();
            Drawable drawable0 = this.f.H0();
            if(drawable0 != null && !(drawable0 instanceof BitmapDrawable)) {
                Bitmap bitmap0 = Bitmap.createBitmap(drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas0 = new Canvas(bitmap0);
                drawable0.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
                drawable0.draw(canvas0);
                this.l = new BitmapDrawable(this.getResources(), bitmap0);
                return;
            }
            this.l = (BitmapDrawable)drawable0;
            return;
        }
        this.g = bundle0.getCharSequence("PreferenceDialogFragment.title");
        this.h = bundle0.getCharSequence("PreferenceDialogFragment.positiveText");
        this.i = bundle0.getCharSequence("PreferenceDialogFragment.negativeText");
        this.j = bundle0.getCharSequence("PreferenceDialogFragment.message");
        this.k = bundle0.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap1 = (Bitmap)bundle0.getParcelable("PreferenceDialogFragment.icon");
        if(bitmap1 != null) {
            this.l = new BitmapDrawable(this.getResources(), bitmap1);
        }
    }

    @Override  // androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle0) {
        this.m = -2;
        androidx.appcompat.app.c.a c$a0 = new androidx.appcompat.app.c.a(this.requireContext()).q(this.g).e(this.l).m(this.h, this).i(this.i, this);
        View view0 = this.r(this.requireContext());
        if(view0 == null) {
            c$a0.f(this.j);
        }
        else {
            this.q(view0);
            c$a0.r(view0);
        }
        this.t(c$a0);
        Dialog dialog0 = c$a0.a();
        if(this.p()) {
            this.u(dialog0);
        }
        return dialog0;
    }

    @Override  // androidx.fragment.app.c
    public void onDismiss(DialogInterface dialogInterface0) {
        super.onDismiss(dialogInterface0);
        this.s(this.m == -1);
    }

    @Override  // androidx.fragment.app.c
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putCharSequence("PreferenceDialogFragment.title", this.g);
        bundle0.putCharSequence("PreferenceDialogFragment.positiveText", this.h);
        bundle0.putCharSequence("PreferenceDialogFragment.negativeText", this.i);
        bundle0.putCharSequence("PreferenceDialogFragment.message", this.j);
        bundle0.putInt("PreferenceDialogFragment.layout", this.k);
        BitmapDrawable bitmapDrawable0 = this.l;
        if(bitmapDrawable0 != null) {
            bundle0.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable0.getBitmap());
        }
    }

    protected boolean p() {
        return false;
    }

    protected void q(View view0) {
        int v;
        View view1 = view0.findViewById(0x102000B);
        if(view1 != null) {
            CharSequence charSequence0 = this.j;
            if(TextUtils.isEmpty(charSequence0)) {
                v = 8;
            }
            else {
                if(view1 instanceof TextView) {
                    ((TextView)view1).setText(charSequence0);
                }
                v = 0;
            }
            if(view1.getVisibility() != v) {
                view1.setVisibility(v);
            }
        }
    }

    protected View r(Context context0) {
        int v = this.k;
        return v == 0 ? null : this.getLayoutInflater().inflate(v, null);
    }

    public abstract void s(boolean arg1);

    protected void t(androidx.appcompat.app.c.a c$a0) {
    }

    private void u(Dialog dialog0) {
        Window window0 = dialog0.getWindow();
        if(Build.VERSION.SDK_INT >= 30) {
            a.a(window0);
            return;
        }
        this.v();
    }

    protected void v() {
    }
}

