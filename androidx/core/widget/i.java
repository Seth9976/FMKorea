package androidx.core.widget;

import B.h;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.core.text.n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class i {
    static abstract class a {
        static int a(TextView textView0) {
            return textView0.getBreakStrategy();
        }

        static ColorStateList b(TextView textView0) {
            return textView0.getCompoundDrawableTintList();
        }

        static PorterDuff.Mode c(TextView textView0) {
            return textView0.getCompoundDrawableTintMode();
        }

        static int d(TextView textView0) {
            return textView0.getHyphenationFrequency();
        }

        static void e(TextView textView0, int v) {
            textView0.setBreakStrategy(v);
        }

        static void f(TextView textView0, ColorStateList colorStateList0) {
            textView0.setCompoundDrawableTintList(colorStateList0);
        }

        static void g(TextView textView0, PorterDuff.Mode porterDuff$Mode0) {
            textView0.setCompoundDrawableTintMode(porterDuff$Mode0);
        }

        static void h(TextView textView0, int v) {
            textView0.setHyphenationFrequency(v);
        }
    }

    static abstract class b {
        static DecimalFormatSymbols a(Locale locale0) {
            return DecimalFormatSymbols.getInstance(locale0);
        }
    }

    static abstract class c {
        static CharSequence a(PrecomputedText precomputedText0) {
            return precomputedText0;
        }

        static String[] b(DecimalFormatSymbols decimalFormatSymbols0) {
            return decimalFormatSymbols0.getDigitStrings();
        }

        static PrecomputedText.Params c(TextView textView0) {
            return textView0.getTextMetricsParams();
        }

        static void d(TextView textView0, int v) {
            textView0.setFirstBaselineToTopHeight(v);
        }
    }

    static abstract class d {
        public static void a(TextView textView0, int v, float f) {
            textView0.setLineHeight(v, f);
        }
    }

    static class e implements ActionMode.Callback {
        private final ActionMode.Callback a;
        private final TextView b;
        private Class c;
        private Method d;
        private boolean e;
        private boolean f;

        e(ActionMode.Callback actionMode$Callback0, TextView textView0) {
            this.a = actionMode$Callback0;
            this.b = textView0;
            this.f = false;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo0, TextView textView0) {
            return this.a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !this.e(textView0)).setClassName(resolveInfo0.activityInfo.packageName, resolveInfo0.activityInfo.name);
        }

        private List c(Context context0, PackageManager packageManager0) {
            List list0 = new ArrayList();
            if(!(context0 instanceof Activity)) {
                return list0;
            }
            for(Object object0: packageManager0.queryIntentActivities(this.a(), 0)) {
                ResolveInfo resolveInfo0 = (ResolveInfo)object0;
                if(this.f(resolveInfo0, context0)) {
                    list0.add(resolveInfo0);
                }
            }
            return list0;
        }

        ActionMode.Callback d() {
            return this.a;
        }

        // 去混淆评级： 低(30)
        private boolean e(TextView textView0) {
            return textView0 instanceof Editable && textView0.onCheckIsTextEditor() && textView0.isEnabled();
        }

        private boolean f(ResolveInfo resolveInfo0, Context context0) {
            if("com.fmkorea.m.fmk".equals(resolveInfo0.activityInfo.packageName)) {
                return true;
            }
            return resolveInfo0.activityInfo.exported ? resolveInfo0.activityInfo.permission == null || context0.checkSelfPermission(resolveInfo0.activityInfo.permission) == 0 : false;
        }

        private void g(Menu menu0) {
            Context context0 = this.b.getContext();
            PackageManager packageManager0 = context0.getPackageManager();
            if(!this.f) {
                try {
                    this.f = true;
                    Class class0 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.c = class0;
                    this.d = class0.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.e = true;
                }
                catch(ClassNotFoundException | NoSuchMethodException unused_ex) {
                    this.c = null;
                    this.d = null;
                    this.e = false;
                }
            }
            try {
                Method method0 = !this.e || !this.c.isInstance(menu0) ? menu0.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE) : this.d;
                for(int v = menu0.size() - 1; v >= 0; --v) {
                    MenuItem menuItem0 = menu0.getItem(v);
                    if(menuItem0.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(menuItem0.getIntent().getAction())) {
                        method0.invoke(menu0, v);
                    }
                }
            }
            catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException unused_ex) {
                return;
            }
            List list0 = this.c(context0, packageManager0);
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                ResolveInfo resolveInfo0 = (ResolveInfo)list0.get(v1);
                menu0.add(0, 0, v1 + 100, resolveInfo0.loadLabel(packageManager0)).setIntent(this.b(resolveInfo0, this.b)).setShowAsAction(1);
            }
        }

        @Override  // android.view.ActionMode$Callback
        public boolean onActionItemClicked(ActionMode actionMode0, MenuItem menuItem0) {
            return this.a.onActionItemClicked(actionMode0, menuItem0);
        }

        @Override  // android.view.ActionMode$Callback
        public boolean onCreateActionMode(ActionMode actionMode0, Menu menu0) {
            return this.a.onCreateActionMode(actionMode0, menu0);
        }

        @Override  // android.view.ActionMode$Callback
        public void onDestroyActionMode(ActionMode actionMode0) {
            this.a.onDestroyActionMode(actionMode0);
        }

        @Override  // android.view.ActionMode$Callback
        public boolean onPrepareActionMode(ActionMode actionMode0, Menu menu0) {
            this.g(menu0);
            return this.a.onPrepareActionMode(actionMode0, menu0);
        }
    }

    public static Drawable[] a(TextView textView0) {
        return textView0.getCompoundDrawablesRelative();
    }

    public static int b(TextView textView0) {
        return textView0.getPaddingTop() - textView0.getPaint().getFontMetricsInt().top;
    }

    public static int c(TextView textView0) {
        return textView0.getPaddingBottom() + textView0.getPaint().getFontMetricsInt().bottom;
    }

    private static int d(TextDirectionHeuristic textDirectionHeuristic0) {
        TextDirectionHeuristic textDirectionHeuristic1 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if(textDirectionHeuristic0 == textDirectionHeuristic1) {
            return 1;
        }
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if(textDirectionHeuristic0 == textDirectionHeuristic2) {
            return 1;
        }
        if(textDirectionHeuristic0 == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if(textDirectionHeuristic0 == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if(textDirectionHeuristic0 == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if(textDirectionHeuristic0 == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if(textDirectionHeuristic0 == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic0 == textDirectionHeuristic1 ? 7 : 1;
    }

    private static TextDirectionHeuristic e(TextView textView0) {
        boolean z = true;
        if(textView0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if(Build.VERSION.SDK_INT >= 28 && (textView0.getInputType() & 15) == 3) {
            switch(Character.getDirectionality(c.b(b.a(textView0.getTextLocale()))[0].codePointAt(0))) {
                case 1: 
                case 2: {
                    return TextDirectionHeuristics.RTL;
                }
                default: {
                    return TextDirectionHeuristics.LTR;
                }
            }
        }
        if(textView0.getLayoutDirection() != 1) {
            z = false;
        }
        switch(textView0.getTextDirection()) {
            case 2: {
                return TextDirectionHeuristics.ANYRTL_LTR;
            }
            case 3: {
                return TextDirectionHeuristics.LTR;
            }
            case 4: {
                return TextDirectionHeuristics.RTL;
            }
            case 5: {
                return TextDirectionHeuristics.LOCALE;
            }
            case 6: {
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            case 7: {
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            }
            default: {
                return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        }
    }

    public static androidx.core.text.n.a f(TextView textView0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return new androidx.core.text.n.a(c.c(textView0));
        }
        androidx.core.text.n.a.a n$a$a0 = new androidx.core.text.n.a.a(new TextPaint(textView0.getPaint()));
        n$a$a0.b(a.a(textView0));
        n$a$a0.c(a.d(textView0));
        n$a$a0.d(i.e(textView0));
        return n$a$a0.a();
    }

    public static void g(TextView textView0, ColorStateList colorStateList0) {
        h.g(textView0);
        if(Build.VERSION.SDK_INT >= 24) {
            a.f(textView0, colorStateList0);
            return;
        }
        if(textView0 instanceof l) {
            ((l)textView0).setSupportCompoundDrawablesTintList(colorStateList0);
        }
    }

    public static void h(TextView textView0, PorterDuff.Mode porterDuff$Mode0) {
        h.g(textView0);
        if(Build.VERSION.SDK_INT >= 24) {
            a.g(textView0, porterDuff$Mode0);
            return;
        }
        if(textView0 instanceof l) {
            ((l)textView0).setSupportCompoundDrawablesTintMode(porterDuff$Mode0);
        }
    }

    public static void i(TextView textView0, Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        textView0.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
    }

    public static void j(TextView textView0, int v) {
        h.d(v);
        if(Build.VERSION.SDK_INT >= 28) {
            c.d(textView0, v);
            return;
        }
        Paint.FontMetricsInt paint$FontMetricsInt0 = textView0.getPaint().getFontMetricsInt();
        int v1 = textView0.getIncludeFontPadding() ? paint$FontMetricsInt0.top : paint$FontMetricsInt0.ascent;
        if(v > Math.abs(v1)) {
            textView0.setPadding(textView0.getPaddingLeft(), v + v1, textView0.getPaddingRight(), textView0.getPaddingBottom());
        }
    }

    public static void k(TextView textView0, int v) {
        h.d(v);
        Paint.FontMetricsInt paint$FontMetricsInt0 = textView0.getPaint().getFontMetricsInt();
        int v1 = textView0.getIncludeFontPadding() ? paint$FontMetricsInt0.bottom : paint$FontMetricsInt0.descent;
        if(v > Math.abs(v1)) {
            textView0.setPadding(textView0.getPaddingLeft(), textView0.getPaddingTop(), textView0.getPaddingRight(), v - v1);
        }
    }

    public static void l(TextView textView0, int v) {
        h.d(v);
        int v1 = textView0.getPaint().getFontMetricsInt(null);
        if(v != v1) {
            textView0.setLineSpacing(((float)(v - v1)), 1.0f);
        }
    }

    public static void m(TextView textView0, int v, float f) {
        if(Build.VERSION.SDK_INT >= 34) {
            d.a(textView0, v, f);
            return;
        }
        i.l(textView0, Math.round(TypedValue.applyDimension(v, f, textView0.getResources().getDisplayMetrics())));
    }

    public static void n(TextView textView0, n n0) {
        if(Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        i.f(textView0);
        throw null;
    }

    public static void o(TextView textView0, int v) {
        textView0.setTextAppearance(v);
    }

    public static void p(TextView textView0, androidx.core.text.n.a n$a0) {
        textView0.setTextDirection(i.d(n$a0.d()));
        textView0.getPaint().set(n$a0.e());
        a.e(textView0, n$a0.b());
        a.h(textView0, n$a0.c());
    }

    public static ActionMode.Callback q(ActionMode.Callback actionMode$Callback0) {
        return !(actionMode$Callback0 instanceof e) || Build.VERSION.SDK_INT < 26 ? actionMode$Callback0 : ((e)actionMode$Callback0).d();
    }

    public static ActionMode.Callback r(TextView textView0, ActionMode.Callback actionMode$Callback0) {
        return Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT <= 27 && !(actionMode$Callback0 instanceof e) && actionMode$Callback0 != null ? new e(actionMode$Callback0, textView0) : actionMode$Callback0;
    }
}

