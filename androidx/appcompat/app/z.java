package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.appcompat.view.d;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.E;
import androidx.appcompat.widget.Z;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.k;
import androidx.appcompat.widget.o;
import androidx.appcompat.widget.q;
import androidx.appcompat.widget.t;
import androidx.appcompat.widget.u;
import androidx.appcompat.widget.w;
import androidx.collection.g;
import androidx.core.view.Y;
import e.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class z {
    static class a implements View.OnClickListener {
        private final View f;
        private final String g;
        private Method h;
        private Context i;

        public a(View view0, String s) {
            this.f = view0;
            this.g = s;
        }

        private void a(Context context0) {
            while(context0 != null) {
                try {
                    if(!context0.isRestricted()) {
                        Method method0 = context0.getClass().getMethod(this.g, View.class);
                        if(method0 != null) {
                            this.h = method0;
                            this.i = context0;
                            return;
                        }
                    }
                }
                catch(NoSuchMethodException unused_ex) {
                }
                context0 = context0 instanceof ContextWrapper ? ((ContextWrapper)context0).getBaseContext() : null;
            }
            int v = this.f.getId();
            String s = v == -1 ? "" : " with id \'" + this.f.getContext().getResources().getResourceEntryName(v) + "\'";
            throw new IllegalStateException("Could not find method " + this.g + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f.getClass() + s);
        }

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            if(this.h == null) {
                this.a(this.f.getContext());
            }
            try {
                this.h.invoke(this.i, view0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", illegalAccessException0);
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new IllegalStateException("Could not execute method for android:onClick", invocationTargetException0);
            }
        }
    }

    private final Object[] a;
    private static final Class[] b;
    private static final int[] c;
    private static final int[] d;
    private static final int[] e;
    private static final int[] f;
    private static final String[] g;
    private static final g h;

    static {
        z.b = new Class[]{Context.class, AttributeSet.class};
        z.c = new int[]{0x101026F};
        z.d = new int[]{0x1010580};
        z.e = new int[]{0x101057C};
        z.f = new int[]{0x1010574};
        z.g = new String[]{"android.widget.", "android.view.", "android.webkit."};
        z.h = new g();
    }

    public z() {
        this.a = new Object[2];
    }

    private void a(Context context0, View view0, AttributeSet attributeSet0) {
        if(Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, z.d);
        if(typedArray0.hasValue(0)) {
            Y.p0(view0, typedArray0.getBoolean(0, false));
        }
        typedArray0.recycle();
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, z.e);
        if(typedArray1.hasValue(0)) {
            Y.r0(view0, typedArray1.getString(0));
        }
        typedArray1.recycle();
        TypedArray typedArray2 = context0.obtainStyledAttributes(attributeSet0, z.f);
        if(typedArray2.hasValue(0)) {
            Y.E0(view0, typedArray2.getBoolean(0, false));
        }
        typedArray2.recycle();
    }

    private void b(View view0, AttributeSet attributeSet0) {
        Context context0 = view0.getContext();
        if(context0 instanceof ContextWrapper && view0.hasOnClickListeners()) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, z.c);
            String s = typedArray0.getString(0);
            if(s != null) {
                view0.setOnClickListener(new a(view0, s));
            }
            typedArray0.recycle();
        }
    }

    protected c c(Context context0, AttributeSet attributeSet0) {
        return new c(context0, attributeSet0);
    }

    protected e d(Context context0, AttributeSet attributeSet0) {
        return new e(context0, attributeSet0);
    }

    protected f e(Context context0, AttributeSet attributeSet0) {
        return new f(context0, attributeSet0);
    }

    protected androidx.appcompat.widget.g f(Context context0, AttributeSet attributeSet0) {
        return new androidx.appcompat.widget.g(context0, attributeSet0);
    }

    protected k g(Context context0, AttributeSet attributeSet0) {
        return new k(context0, attributeSet0);
    }

    protected o h(Context context0, AttributeSet attributeSet0) {
        return new o(context0, attributeSet0);
    }

    protected AppCompatImageView i(Context context0, AttributeSet attributeSet0) {
        return new AppCompatImageView(context0, attributeSet0);
    }

    protected q j(Context context0, AttributeSet attributeSet0) {
        return new q(context0, attributeSet0);
    }

    protected t k(Context context0, AttributeSet attributeSet0) {
        return new t(context0, attributeSet0);
    }

    protected u l(Context context0, AttributeSet attributeSet0) {
        return new u(context0, attributeSet0);
    }

    protected w m(Context context0, AttributeSet attributeSet0) {
        return new w(context0, attributeSet0);
    }

    protected AppCompatSpinner n(Context context0, AttributeSet attributeSet0) {
        return new AppCompatSpinner(context0, attributeSet0);
    }

    protected A o(Context context0, AttributeSet attributeSet0) {
        return new A(context0, attributeSet0);
    }

    protected E p(Context context0, AttributeSet attributeSet0) {
        return new E(context0, attributeSet0);
    }

    protected View q(Context context0, String s, AttributeSet attributeSet0) [...] // Inlined contents

    public final View r(View view0, String s, Context context0, AttributeSet attributeSet0, boolean z, boolean z1, boolean z2, boolean z3) {
        View view1;
        Context context1 = !z || view0 == null ? context0 : view0.getContext();
        if(z1 || z2) {
            context1 = z.u(context1, attributeSet0, z1, z2);
        }
        if(z3) {
            context1 = Z.b(context1);
        }
        s.hashCode();
        switch(s) {
            case "AutoCompleteTextView": {
                view1 = this.c(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "Button": {
                view1 = this.d(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "CheckBox": {
                view1 = this.e(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "CheckedTextView": {
                view1 = this.f(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "EditText": {
                view1 = this.g(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "ImageButton": {
                view1 = this.h(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "ImageView": {
                view1 = this.i(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "MultiAutoCompleteTextView": {
                view1 = this.j(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "RadioButton": {
                view1 = this.k(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "RatingBar": {
                view1 = this.l(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "SeekBar": {
                view1 = this.m(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "Spinner": {
                view1 = this.n(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "TextView": {
                view1 = this.o(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "ToggleButton": {
                view1 = this.p(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            default: {
                view1 = null;
            }
        }
        if(view1 == null && context0 != context1) {
            view1 = this.t(context1, s, attributeSet0);
        }
        if(view1 != null) {
            this.b(view1, attributeSet0);
            this.a(context1, view1, attributeSet0);
        }
        return view1;
    }

    private View s(Context context0, String s, String s1) {
        g g0 = z.h;
        Constructor constructor0 = (Constructor)g0.get(s);
        try {
            if(constructor0 == null) {
                constructor0 = Class.forName((s1 == null ? s : s1 + s), false, context0.getClassLoader()).asSubclass(View.class).getConstructor(z.b);
                g0.put(s, constructor0);
            }
            constructor0.setAccessible(true);
            return (View)constructor0.newInstance(this.a);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    private View t(Context context0, String s, AttributeSet attributeSet0) {
        View view0;
        if(s.equals("view")) {
            s = attributeSet0.getAttributeValue(null, "class");
        }
        try {
            this.a[0] = context0;
            this.a[1] = attributeSet0;
            if(-1 == s.indexOf(46)) {
                for(int v1 = 0; true; ++v1) {
                    String[] arr_s = z.g;
                    if(v1 >= arr_s.length) {
                        return null;
                    }
                    view0 = this.s(context0, s, arr_s[v1]);
                    if(view0 != null) {
                        break;
                    }
                }
                return view0;
            }
            return this.s(context0, s, null);
        }
        catch(Exception unused_ex) {
            return null;
        }
        finally {
            this.a[0] = null;
            this.a[1] = null;
        }
    }

    private static Context u(Context context0, AttributeSet attributeSet0, boolean z, boolean z1) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, j.P3, 0, 0);
        int v = z ? typedArray0.getResourceId(j.Q3, 0) : 0;
        if(z1 && v == 0) {
            v = typedArray0.getResourceId(j.R3, 0);
            if(v != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
            }
        }
        typedArray0.recycle();
        return v != 0 && (!(context0 instanceof d) || ((d)context0).c() != v) ? new d(context0, v) : context0;
    }

    private void v(View view0, String s) {
        if(view0 == null) {
            throw new IllegalStateException(this.getClass().getName() + " asked to inflate view for <" + s + ">, but returned null");
        }
    }
}

