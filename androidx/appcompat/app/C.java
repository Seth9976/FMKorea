package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

public class c extends y implements DialogInterface {
    public static class a {
        private final b a;
        private final int b;

        public a(Context context0) {
            this(context0, c.l(context0, 0));
        }

        public a(Context context0, int v) {
            this.a = new b(new ContextThemeWrapper(context0, c.l(context0, v)));
            this.b = v;
        }

        public c a() {
            c c0 = new c(this.a.a, this.b);
            this.a.a(c0.k);
            c0.setCancelable(this.a.r);
            if(this.a.r) {
                c0.setCanceledOnTouchOutside(true);
            }
            c0.setOnCancelListener(this.a.s);
            c0.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener dialogInterface$OnKeyListener0 = this.a.u;
            if(dialogInterface$OnKeyListener0 != null) {
                c0.setOnKeyListener(dialogInterface$OnKeyListener0);
            }
            return c0;
        }

        public Context b() {
            return this.a.a;
        }

        public a c(ListAdapter listAdapter0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.w = listAdapter0;
            this.a.x = dialogInterface$OnClickListener0;
            return this;
        }

        public a d(View view0) {
            this.a.g = view0;
            return this;
        }

        public a e(Drawable drawable0) {
            this.a.d = drawable0;
            return this;
        }

        public a f(CharSequence charSequence0) {
            this.a.h = charSequence0;
            return this;
        }

        public a g(CharSequence[] arr_charSequence, boolean[] arr_z, DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
            this.a.v = arr_charSequence;
            this.a.J = dialogInterface$OnMultiChoiceClickListener0;
            this.a.F = arr_z;
            this.a.G = true;
            return this;
        }

        public a h(int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.l = this.a.a.getText(v);
            this.a.n = dialogInterface$OnClickListener0;
            return this;
        }

        public a i(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.l = charSequence0;
            this.a.n = dialogInterface$OnClickListener0;
            return this;
        }

        public a j(DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
            this.a.t = dialogInterface$OnDismissListener0;
            return this;
        }

        public a k(DialogInterface.OnKeyListener dialogInterface$OnKeyListener0) {
            this.a.u = dialogInterface$OnKeyListener0;
            return this;
        }

        public a l(int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.i = this.a.a.getText(v);
            this.a.k = dialogInterface$OnClickListener0;
            return this;
        }

        public a m(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.i = charSequence0;
            this.a.k = dialogInterface$OnClickListener0;
            return this;
        }

        public a n(ListAdapter listAdapter0, int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.w = listAdapter0;
            this.a.x = dialogInterface$OnClickListener0;
            this.a.I = v;
            this.a.H = true;
            return this;
        }

        public a o(CharSequence[] arr_charSequence, int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.v = arr_charSequence;
            this.a.x = dialogInterface$OnClickListener0;
            this.a.I = v;
            this.a.H = true;
            return this;
        }

        public a p(int v) {
            this.a.f = this.a.a.getText(v);
            return this;
        }

        public a q(CharSequence charSequence0) {
            this.a.f = charSequence0;
            return this;
        }

        public a r(View view0) {
            this.a.z = view0;
            this.a.y = 0;
            this.a.E = false;
            return this;
        }

        public c s() {
            c c0 = this.a();
            c0.show();
            return c0;
        }
    }

    final AlertController k;

    protected c(Context context0, int v) {
        super(context0, c.l(context0, v));
        this.k = new AlertController(this.getContext(), this, this.getWindow());
    }

    public ListView k() {
        return this.k.d();
    }

    static int l(Context context0, int v) {
        if((v >>> 24 & 0xFF) >= 1) {
            return v;
        }
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(e.a.l, typedValue0, true);
        return typedValue0.resourceId;
    }

    @Override  // androidx.appcompat.app.y
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.k.e();
    }

    // 去混淆评级： 低(20)
    @Override  // android.app.Dialog
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        return this.k.f(v, keyEvent0) ? true : super.onKeyDown(v, keyEvent0);
    }

    // 去混淆评级： 低(20)
    @Override  // android.app.Dialog
    public boolean onKeyUp(int v, KeyEvent keyEvent0) {
        return this.k.g(v, keyEvent0) ? true : super.onKeyUp(v, keyEvent0);
    }

    @Override  // androidx.appcompat.app.y
    public void setTitle(CharSequence charSequence0) {
        super.setTitle(charSequence0);
        this.k.p(charSequence0);
    }
}

