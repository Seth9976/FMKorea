package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.c0;
import androidx.core.view.y;
import e.j;
import j.c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends MenuInflater {
    static class a implements MenuItem.OnMenuItemClickListener {
        private Object f;
        private Method g;
        private static final Class[] h;

        static {
            a.h = new Class[]{MenuItem.class};
        }

        public a(Object object0, String s) {
            this.f = object0;
            Class class0 = object0.getClass();
            try {
                this.g = class0.getMethod(s, a.h);
            }
            catch(Exception exception0) {
                InflateException inflateException0 = new InflateException("Couldn\'t resolve menu item onClick handler " + s + " in class " + class0.getName());
                inflateException0.initCause(exception0);
                throw inflateException0;
            }
        }

        @Override  // android.view.MenuItem$OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem0) {
            try {
                if(this.g.getReturnType() == Boolean.TYPE) {
                    return ((Boolean)this.g.invoke(this.f, menuItem0)).booleanValue();
                }
                this.g.invoke(this.f, menuItem0);
                return true;
            }
            catch(Exception exception0) {
            }
            throw new RuntimeException(exception0);
        }
    }

    class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D;
        private PorterDuff.Mode E;
        final g F;
        private Menu a;
        private int b;
        private int c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu0) {
            this.D = null;
            this.E = null;
            this.a = menu0;
            this.h();
        }

        public void a() {
            this.h = true;
            this.i(this.a.add(this.b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu subMenu0 = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            this.i(subMenu0.getItem());
            return subMenu0;
        }

        private char c(String s) {
            return s == null ? '\u0000' : s.charAt(0);
        }

        public boolean d() {
            return this.h;
        }

        private Object e(String s, Class[] arr_class, Object[] arr_object) {
            try {
                Constructor constructor0 = Class.forName(s, false, g.this.c.getClassLoader()).getConstructor(arr_class);
                constructor0.setAccessible(true);
                return constructor0.newInstance(arr_object);
            }
            catch(Exception exception0) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + s, exception0);
                return null;
            }
        }

        public void f(AttributeSet attributeSet0) {
            TypedArray typedArray0 = g.this.c.obtainStyledAttributes(attributeSet0, j.w1);
            this.b = typedArray0.getResourceId(j.y1, 0);
            this.c = typedArray0.getInt(j.A1, 0);
            this.d = typedArray0.getInt(j.B1, 0);
            this.e = typedArray0.getInt(j.C1, 0);
            this.f = typedArray0.getBoolean(j.z1, true);
            this.g = typedArray0.getBoolean(j.x1, true);
            typedArray0.recycle();
        }

        public void g(AttributeSet attributeSet0) {
            c0 c00 = c0.u(g.this.c, attributeSet0, j.D1);
            this.i = c00.n(j.G1, 0);
            this.j = c00.k(j.J1, this.c) & 0xFFFF0000 | c00.k(j.K1, this.d) & 0xFFFF;
            this.k = c00.p(j.L1);
            this.l = c00.p(j.M1);
            this.m = c00.n(j.E1, 0);
            this.n = this.c(c00.o(j.N1));
            this.o = c00.k(j.U1, 0x1000);
            this.p = this.c(c00.o(j.O1));
            this.q = c00.k(j.Y1, 0x1000);
            this.r = c00.s(j.P1) ? c00.a(11, false) : this.e;
            this.s = c00.a(j.H1, false);
            this.t = c00.a(j.I1, this.f);
            this.u = c00.a(j.F1, this.g);
            this.v = c00.k(j.Z1, -1);
            this.z = c00.o(j.Q1);
            this.w = c00.n(j.R1, 0);
            this.x = c00.o(j.T1);
            String s = c00.o(j.S1);
            this.y = s;
            if(s == null || this.w != 0 || this.x != null) {
                if(s != null) {
                    Log.w("SupportMenuInflater", "Ignoring attribute \'actionProviderClass\'. Action view already specified.");
                }
                this.A = null;
            }
            else {
                this.A = (androidx.core.view.b)this.e(s, g.f, g.this.b);
            }
            this.B = c00.p(j.V1);
            this.C = c00.p(j.a2);
            this.E = c00.s(j.X1) ? L.e(c00.k(19, -1), this.E) : null;
            this.D = c00.s(j.W1) ? c00.c(18) : null;
            c00.x();
            this.h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }

        private void i(MenuItem menuItem0) {
            boolean z = false;
            menuItem0.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int v = this.v;
            if(v >= 0) {
                menuItem0.setShowAsAction(v);
            }
            if(this.z != null) {
                if(g.this.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem0.setOnMenuItemClickListener(new a(g.this.b(), this.z));
            }
            if(this.r >= 2) {
                if(menuItem0 instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g)menuItem0).t(true);
                }
                else if(menuItem0 instanceof c) {
                    ((c)menuItem0).h(true);
                }
            }
            String s = this.x;
            if(s != null) {
                menuItem0.setActionView(((View)this.e(s, g.e, g.this.a)));
                z = true;
            }
            int v1 = this.w;
            if(v1 > 0) {
                if(z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute \'itemActionViewLayout\'. Action view already specified.");
                }
                else {
                    menuItem0.setActionView(v1);
                }
            }
            androidx.core.view.b b0 = this.A;
            if(b0 != null) {
                y.a(menuItem0, b0);
            }
            y.c(menuItem0, this.B);
            y.g(menuItem0, this.C);
            y.b(menuItem0, this.n, this.o);
            y.f(menuItem0, this.p, this.q);
            PorterDuff.Mode porterDuff$Mode0 = this.E;
            if(porterDuff$Mode0 != null) {
                y.e(menuItem0, porterDuff$Mode0);
            }
            ColorStateList colorStateList0 = this.D;
            if(colorStateList0 != null) {
                y.d(menuItem0, colorStateList0);
            }
        }
    }

    final Object[] a;
    final Object[] b;
    Context c;
    private Object d;
    static final Class[] e;
    static final Class[] f;

    static {
        Class[] arr_class = {Context.class};
        g.e = arr_class;
        g.f = arr_class;
    }

    public g(Context context0) {
        super(context0);
        this.c = context0;
        Object[] arr_object = {context0};
        this.a = arr_object;
        this.b = arr_object;
    }

    private Object a(Object object0) {
        if(object0 instanceof Activity) {
            return object0;
        }
        return object0 instanceof ContextWrapper ? this.a(((ContextWrapper)object0).getBaseContext()) : object0;
    }

    Object b() {
        if(this.d == null) {
            this.d = this.a(this.c);
        }
        return this.d;
    }

    private void c(XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Menu menu0) {
        b g$b0 = new b(this, menu0);
        int v = xmlPullParser0.getEventType();
        do {
            if(v == 2) {
                String s = xmlPullParser0.getName();
                if(!s.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + s);
                }
                v = xmlPullParser0.next();
                break;
            }
            v = xmlPullParser0.next();
        }
        while(v != 1);
        boolean z = false;
        String s1 = null;
        boolean z1 = false;
        while(!z1) {
            switch(v) {
                case 1: {
                    throw new RuntimeException("Unexpected end of document");
                }
                case 2: {
                    if(!z) {
                        String s2 = xmlPullParser0.getName();
                        if(s2.equals("group")) {
                            g$b0.f(attributeSet0);
                        }
                        else if(s2.equals("item")) {
                            g$b0.g(attributeSet0);
                        }
                        else if(s2.equals("menu")) {
                            this.c(xmlPullParser0, attributeSet0, g$b0.b());
                        }
                        else {
                            s1 = s2;
                            z = true;
                        }
                    }
                    break;
                }
                case 3: {
                    String s3 = xmlPullParser0.getName();
                    if(z && s3.equals(s1)) {
                        z = false;
                        s1 = null;
                    }
                    else if(s3.equals("group")) {
                        g$b0.h();
                    }
                    else if(!s3.equals("item")) {
                        if(s3.equals("menu")) {
                            z1 = true;
                        }
                    }
                    else if(!g$b0.d()) {
                        if(g$b0.A == null || !g$b0.A.a()) {
                            g$b0.a();
                        }
                        else {
                            g$b0.b();
                        }
                    }
                }
            }
            v = xmlPullParser0.next();
        }
    }

    @Override  // android.view.MenuInflater
    public void inflate(int v, Menu menu0) {
        XmlResourceParser xmlResourceParser0;
        if(!(menu0 instanceof w.a)) {
            super.inflate(v, menu0);
            return;
        }
        try {
            try {
                xmlResourceParser0 = null;
                boolean z = false;
                xmlResourceParser0 = this.c.getResources().getLayout(v);
                AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
                if(menu0 instanceof e && ((e)menu0).H()) {
                    ((e)menu0).i0();
                    z = true;
                }
                this.c(xmlResourceParser0, attributeSet0, menu0);
                goto label_24;
            }
            catch(XmlPullParserException xmlPullParserException0) {
            }
            catch(IOException iOException0) {
                throw new InflateException("Error inflating menu XML", iOException0);
            }
            throw new InflateException("Error inflating menu XML", xmlPullParserException0);
        }
        catch(Throwable throwable0) {
        }
        if(z) {
            ((e)menu0).h0();
        }
        if(xmlResourceParser0 != null) {
            xmlResourceParser0.close();
        }
        throw throwable0;
    label_24:
        if(z) {
            ((e)menu0).h0();
        }
        if(xmlResourceParser0 != null) {
            xmlResourceParser0.close();
        }
    }
}

