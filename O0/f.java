package O0;

import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import b1.a;
import com.facebook.internal.F;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class f {
    private static final String a = "O0.f";
    private static WeakReference b;
    private static Method c;

    static {
        f.b = new WeakReference(null);
        f.c = null;
    }

    public static View a(View view0) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return null;
        }
        while(view0 != null) {
            try {
                if(f.q(view0)) {
                    return view0;
                }
                ViewParent viewParent0 = view0.getParent();
                if(!(viewParent0 instanceof View)) {
                    break;
                }
                view0 = (View)viewParent0;
            }
            catch(Throwable throwable0) {
                a.b(throwable0, class0);
                if(true) {
                    break;
                }
            }
        }
        return null;
    }

    public static List b(View view0) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            List list0 = new ArrayList();
            if(view0 instanceof ViewGroup) {
                int v = ((ViewGroup)view0).getChildCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((ArrayList)list0).add(((ViewGroup)view0).getChildAt(v1));
                }
            }
            return list0;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    public static int c(View view0) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return 0;
        }
        try {
            int v = view0 instanceof ImageView ? 2 : 0;
            if(view0.isClickable()) {
                v |= 0x20;
            }
            if(f.o(view0)) {
                v |= 0x200;
            }
            if(view0 instanceof TextView) {
                if(view0 instanceof Button) {
                    if(!(view0 instanceof Switch)) {
                        if(view0 instanceof CheckBox) {
                            v |= 0x8405;
                            return view0 instanceof EditText ? v | 0x800 : v;
                        }
                        v |= 0x405;
                        return view0 instanceof EditText ? v | 0x800 : v;
                    }
                    v |= 0x2405;
                    return view0 instanceof EditText ? v | 0x800 : v;
                }
                v |= 0x401;
                return view0 instanceof EditText ? v | 0x800 : v;
            }
            if(view0 instanceof Spinner || view0 instanceof DatePicker) {
                return v | 0x1000;
            }
            if(view0 instanceof RatingBar) {
                return v | 0x10000;
            }
            if(view0 instanceof RadioGroup) {
                return v | 0x4000;
            }
            return !(view0 instanceof ViewGroup) || !f.p(view0, ((View)f.b.get())) ? v : v | 0x40;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return 0;
        }
    }

    public static JSONObject d(View view0) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            if(view0.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                f.b = new WeakReference(view0);
            }
            JSONObject jSONObject0 = new JSONObject();
            try {
                f.s(view0, jSONObject0);
                JSONArray jSONArray0 = new JSONArray();
                List list0 = f.b(view0);
                for(int v = 0; v < list0.size(); ++v) {
                    jSONArray0.put(f.d(((View)list0.get(v))));
                }
                jSONObject0.put("childviews", jSONArray0);
                return jSONObject0;
            }
            catch(JSONException jSONException0) {
            }
            Log.e("O0.f", "Failed to create JSONObject for view.", jSONException0);
            return jSONObject0;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    private static JSONObject e(View view0) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("top", view0.getTop());
                jSONObject0.put("left", view0.getLeft());
                jSONObject0.put("width", view0.getWidth());
                jSONObject0.put("height", view0.getHeight());
                jSONObject0.put("scrollx", view0.getScrollX());
                jSONObject0.put("scrolly", view0.getScrollY());
                jSONObject0.put("visibility", view0.getVisibility());
            }
            catch(JSONException jSONException0) {
                Log.e("O0.f", "Failed to create JSONObject for dimension.", jSONException0);
            }
            return jSONObject0;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    private static Class f(String s) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            return Class.forName(s);
        }
        catch(ClassNotFoundException throwable0) {
            a.b(throwable0, class0);
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public static View.OnClickListener g(View view0) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            Field field0 = View.class.getDeclaredField("mListenerInfo");
            if(field0 != null) {
                field0.setAccessible(true);
            }
            Object object0 = field0.get(view0);
            if(object0 == null) {
                return null;
            }
            Field field1 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            if(field1 != null) {
                field1.setAccessible(true);
                return (View.OnClickListener)field1.get(object0);
            }
            return null;
        }
        catch(NoSuchFieldException | ClassNotFoundException | IllegalAccessException unused_ex) {
            return null;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    public static View.OnTouchListener h(View view0) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            try {
                Field field0 = View.class.getDeclaredField("mListenerInfo");
                if(field0 != null) {
                    field0.setAccessible(true);
                }
                Object object0 = field0.get(view0);
                if(object0 == null) {
                    return null;
                }
                Field field1 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                if(field1 != null) {
                    field1.setAccessible(true);
                    return (View.OnTouchListener)field1.get(object0);
                }
                return null;
            }
            catch(NoSuchFieldException noSuchFieldException0) {
            }
            catch(ClassNotFoundException classNotFoundException0) {
                F.U("O0.f", classNotFoundException0);
                return null;
            }
            catch(IllegalAccessException illegalAccessException0) {
                F.U("O0.f", illegalAccessException0);
                return null;
            }
            F.U("O0.f", noSuchFieldException0);
            return null;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    public static String i(View view0) {
        CharSequence charSequence0;
        Class class0 = f.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            if(view0 instanceof EditText) {
                charSequence0 = ((EditText)view0).getHint();
            }
            else {
                charSequence0 = view0 instanceof TextView ? ((TextView)view0).getHint() : null;
            }
            return charSequence0 == null ? "" : charSequence0.toString();
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    public static ViewGroup j(View view0) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return null;
        }
        if(view0 == null) {
            return null;
        }
        try {
            ViewParent viewParent0 = view0.getParent();
            return viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    public static String k(View view0) {
        CharSequence charSequence0 = null;
        Class class0 = f.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            if(view0 instanceof TextView) {
                charSequence0 = ((TextView)view0).getText();
                if(view0 instanceof Switch) {
                    charSequence0 = ((Switch)view0).isChecked() ? "1" : "0";
                }
            }
            else if(!(view0 instanceof Spinner)) {
                if(view0 instanceof DatePicker) {
                    charSequence0 = String.format("%04d-%02d-%02d", ((DatePicker)view0).getYear(), ((DatePicker)view0).getMonth(), ((DatePicker)view0).getDayOfMonth());
                }
                else if(view0 instanceof TimePicker) {
                    Integer integer0 = ((TimePicker)view0).getCurrentHour();
                    integer0.intValue();
                    Integer integer1 = ((TimePicker)view0).getCurrentMinute();
                    integer1.intValue();
                    charSequence0 = String.format("%02d:%02d", integer0, integer1);
                }
                else if(view0 instanceof RadioGroup) {
                    int v1 = ((RadioGroup)view0).getCheckedRadioButtonId();
                    int v2 = ((RadioGroup)view0).getChildCount();
                    for(int v = 0; v < v2; ++v) {
                        View view1 = ((RadioGroup)view0).getChildAt(v);
                        if(view1.getId() == v1 && view1 instanceof RadioButton) {
                            charSequence0 = ((RadioButton)view1).getText();
                            break;
                        }
                    }
                }
                else if(view0 instanceof RatingBar) {
                    charSequence0 = String.valueOf(((RatingBar)view0).getRating());
                }
            }
            else if(((Spinner)view0).getCount() > 0) {
                Object object0 = ((Spinner)view0).getSelectedItem();
                if(object0 != null) {
                    charSequence0 = object0.toString();
                }
            }
            return charSequence0 == null ? "" : charSequence0.toString();
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    public static View l(float[] arr_f, View view0) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            f.n();
            Method method0 = f.c;
            if(method0 != null && view0 != null) {
                try {
                    View view1 = (View)method0.invoke(null, arr_f, view0);
                    if(view1 != null && view1.getId() > 0) {
                        View view2 = (View)view1.getParent();
                        return view2 == null ? null : view2;
                    }
                }
                catch(IllegalAccessException illegalAccessException0) {
                    F.U("O0.f", illegalAccessException0);
                    return null;
                }
                catch(InvocationTargetException invocationTargetException0) {
                    F.U("O0.f", invocationTargetException0);
                    return null;
                }
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
        return null;
    }

    private static float[] m(View view0) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            int[] arr_v = new int[2];
            view0.getLocationOnScreen(arr_v);
            return new float[]{((float)arr_v[0]), ((float)arr_v[1])};
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    private static void n() {
        Class class0 = f.class;
        if(a.d(class0)) {
            return;
        }
        if(f.c != null) {
            return;
        }
        try {
            try {
                Method method0 = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f.c = method0;
                method0.setAccessible(true);
            }
            catch(ClassNotFoundException classNotFoundException0) {
                F.U("O0.f", classNotFoundException0);
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                F.U("O0.f", noSuchMethodException0);
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
    }

    private static boolean o(View view0) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof AdapterView) {
                return true;
            }
            Class class1 = f.f("android.support.v4.view.NestedScrollingChild");
            if(class1 != null && class1.isInstance(viewParent0)) {
                return true;
            }
            Class class2 = f.f("androidx.core.view.NestedScrollingChild");
            return class2 != null && class2.isInstance(viewParent0);
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return false;
    }

    public static boolean p(View view0, View view1) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            if(!view0.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            View view2 = f.l(f.m(view0), view1);
            return view2 == null || view2.getId() != view0.getId() ? false : true;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return false;
        }
    }

    public static boolean q(View view0) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            return view0.getClass().getName().equals("com.facebook.react.ReactRootView");
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return false;
        }
    }

    public static void r(View view0, View.OnClickListener view$OnClickListener0) {
        Field field1;
        Field field0;
        Object object0;
        Class class0 = f.class;
        if(a.d(class0)) {
            return;
        }
        try {
            try {
                object0 = null;
                field0 = View.class.getDeclaredField("mListenerInfo");
            }
            catch(ClassNotFoundException | NoSuchFieldException unused_ex) {
                field0 = null;
                goto label_10;
            }
            try {
                field1 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                goto label_11;
            }
            catch(ClassNotFoundException | NoSuchFieldException unused_ex) {
            }
        label_10:
            field1 = null;
        label_11:
            if(field0 == null || field1 == null) {
                view0.setOnClickListener(view$OnClickListener0);
                return;
            }
            field0.setAccessible(true);
            field1.setAccessible(true);
            try {
                field0.setAccessible(true);
                object0 = field0.get(view0);
            }
            catch(IllegalAccessException unused_ex) {
            }
            if(object0 == null) {
                view0.setOnClickListener(view$OnClickListener0);
                return;
            }
            field1.set(object0, view$OnClickListener0);
        }
        catch(Exception throwable0) {
            a.b(throwable0, class0);
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void s(View view0, JSONObject jSONObject0) {
        Class class0 = f.class;
        if(a.d(class0)) {
            return;
        }
        try {
            try {
                String s = f.k(view0);
                String s1 = f.i(view0);
                Object object0 = view0.getTag();
                CharSequence charSequence0 = view0.getContentDescription();
                jSONObject0.put("classname", view0.getClass().getCanonicalName());
                jSONObject0.put("classtypebitmask", f.c(view0));
                jSONObject0.put("id", view0.getId());
                if(d.g(view0)) {
                    jSONObject0.put("text", "");
                    jSONObject0.put("is_user_input", true);
                }
                else {
                    jSONObject0.put("text", F.h(F.q0(s), ""));
                }
                jSONObject0.put("hint", F.h(F.q0(s1), ""));
                if(object0 != null) {
                    jSONObject0.put("tag", F.h(F.q0(object0.toString()), ""));
                }
                if(charSequence0 != null) {
                    jSONObject0.put("description", F.h(F.q0(charSequence0.toString()), ""));
                }
                jSONObject0.put("dimension", f.e(view0));
                return;
            }
            catch(JSONException jSONException0) {
            }
            F.U("O0.f", jSONException0);
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
    }
}

