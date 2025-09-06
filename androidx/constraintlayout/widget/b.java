package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class b {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[androidx.constraintlayout.widget.b.b.values().length];
            a.a = arr_v;
            try {
                arr_v[androidx.constraintlayout.widget.b.b.h.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[androidx.constraintlayout.widget.b.b.i.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[androidx.constraintlayout.widget.b.b.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[androidx.constraintlayout.widget.b.b.g.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[androidx.constraintlayout.widget.b.b.j.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[androidx.constraintlayout.widget.b.b.k.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[androidx.constraintlayout.widget.b.b.l.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum androidx.constraintlayout.widget.b.b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE;

    }

    String a;
    private androidx.constraintlayout.widget.b.b b;
    private int c;
    private float d;
    private String e;
    boolean f;
    private int g;

    public b(b b0, Object object0) {
        this.a = b0.a;
        this.b = b0.b;
        this.d(object0);
    }

    public b(String s, androidx.constraintlayout.widget.b.b b$b0, Object object0) {
        this.a = s;
        this.b = b$b0;
        this.d(object0);
    }

    public static HashMap a(HashMap hashMap0, View view0) {
        HashMap hashMap1 = new HashMap();
        Class class0 = view0.getClass();
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            b b0 = (b)hashMap0.get(s);
            try {
                if(s.equals("BackgroundColor")) {
                    hashMap1.put(s, new b(b0, ((ColorDrawable)view0.getBackground()).getColor()));
                    continue;
                }
                hashMap1.put(s, new b(b0, class0.getMethod("getMap" + s, null).invoke(view0, null)));
                continue;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
            }
            catch(IllegalAccessException illegalAccessException0) {
                illegalAccessException0.printStackTrace();
                continue;
            }
            catch(InvocationTargetException invocationTargetException0) {
                goto label_21;
            }
            noSuchMethodException0.printStackTrace();
            continue;
        label_21:
            invocationTargetException0.printStackTrace();
        }
        return hashMap1;
    }

    public static void b(Context context0, XmlPullParser xmlPullParser0, HashMap hashMap0) {
        Integer integer0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), i.O2);
        int v = typedArray0.getIndexCount();
        String s = null;
        Boolean boolean0 = null;
        androidx.constraintlayout.widget.b.b b$b0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == i.P2) {
                s = typedArray0.getString(v2);
                if(s != null && s.length() > 0) {
                    s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
                }
            }
            else if(v2 == i.Q2) {
                boolean0 = Boolean.valueOf(typedArray0.getBoolean(v2, false));
                b$b0 = androidx.constraintlayout.widget.b.b.k;
            }
            else if(v2 == i.S2) {
                integer0 = typedArray0.getColor(v2, 0);
                b$b0 = androidx.constraintlayout.widget.b.b.h;
                boolean0 = integer0;
            }
            else if(v2 == i.R2) {
                integer0 = typedArray0.getColor(v2, 0);
                b$b0 = androidx.constraintlayout.widget.b.b.i;
                boolean0 = integer0;
            }
            else if(v2 == i.W2) {
                integer0 = TypedValue.applyDimension(1, typedArray0.getDimension(v2, 0.0f), context0.getResources().getDisplayMetrics());
                b$b0 = androidx.constraintlayout.widget.b.b.l;
                boolean0 = integer0;
            }
            else if(v2 == i.T2) {
                integer0 = typedArray0.getDimension(v2, 0.0f);
                b$b0 = androidx.constraintlayout.widget.b.b.l;
                boolean0 = integer0;
            }
            else if(v2 == i.U2) {
                integer0 = typedArray0.getFloat(v2, NaNf);
                b$b0 = androidx.constraintlayout.widget.b.b.g;
                boolean0 = integer0;
            }
            else if(v2 == i.V2) {
                integer0 = typedArray0.getInteger(v2, -1);
                b$b0 = androidx.constraintlayout.widget.b.b.f;
                boolean0 = integer0;
            }
            else if(v2 == i.X2) {
                integer0 = typedArray0.getString(v2);
                b$b0 = androidx.constraintlayout.widget.b.b.j;
                boolean0 = integer0;
            }
        }
        if(s != null && boolean0 != null) {
            hashMap0.put(s, new b(s, b$b0, boolean0));
        }
        typedArray0.recycle();
    }

    public static void c(View view0, HashMap hashMap0) {
        Class class0 = view0.getClass();
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            b b0 = (b)hashMap0.get(s);
            String s1 = "set" + s;
            try {
                switch(b0.b) {
                    case 1: {
                        class0.getMethod(s1, Integer.TYPE).invoke(view0, b0.g);
                        continue;
                    }
                    case 2: {
                        Method method0 = class0.getMethod(s1, Drawable.class);
                        ColorDrawable colorDrawable0 = new ColorDrawable();
                        colorDrawable0.setColor(b0.g);
                        method0.invoke(view0, colorDrawable0);
                        continue;
                    }
                    case 3: {
                        class0.getMethod(s1, Integer.TYPE).invoke(view0, b0.c);
                        continue;
                    }
                    case 4: {
                        class0.getMethod(s1, Float.TYPE).invoke(view0, b0.d);
                        continue;
                    }
                    case 5: {
                        class0.getMethod(s1, CharSequence.class).invoke(view0, b0.e);
                        continue;
                    }
                    case 6: {
                        class0.getMethod(s1, Boolean.TYPE).invoke(view0, Boolean.valueOf(b0.f));
                        continue;
                    }
                    case 7: {
                        class0.getMethod(s1, Float.TYPE).invoke(view0, b0.d);
                        continue;
                    }
                    default: {
                        continue;
                    }
                }
            }
            catch(NoSuchMethodException noSuchMethodException0) {
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("TransitionLayout", " Custom Attribute \"" + s + "\" not found on " + class0.getName());
                illegalAccessException0.printStackTrace();
                continue;
            }
            catch(InvocationTargetException invocationTargetException0) {
                goto label_39;
            }
            Log.e("TransitionLayout", noSuchMethodException0.getMessage());
            Log.e("TransitionLayout", " Custom Attribute \"" + s + "\" not found on " + class0.getName());
            Log.e("TransitionLayout", class0.getName() + " must have a method " + s1);
            continue;
        label_39:
            Log.e("TransitionLayout", " Custom Attribute \"" + s + "\" not found on " + class0.getName());
            invocationTargetException0.printStackTrace();
        }
    }

    public void d(Object object0) {
        switch(a.a[this.b.ordinal()]) {
            case 1: 
            case 2: {
                this.g = (int)(((Integer)object0));
                return;
            }
            case 3: {
                this.c = (int)(((Integer)object0));
                return;
            }
            case 4: {
                this.d = (float)(((Float)object0));
                return;
            }
            case 5: {
                this.e = (String)object0;
                return;
            }
            case 6: {
                this.f = ((Boolean)object0).booleanValue();
                return;
            }
            case 7: {
                this.d = (float)(((Float)object0));
            }
        }
    }
}

