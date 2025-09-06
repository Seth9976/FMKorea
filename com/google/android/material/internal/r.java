package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class r {
    class a implements Comparator {
        a() {
            super();
        }

        public int a(View view0, View view1) {
            return view0.getTop() - view1.getTop();
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.a(((View)object0), ((View)object1));
        }
    }

    private static final Comparator a;

    static {
        r.a = new a();
    }

    private static ImageView a(Toolbar toolbar0, Drawable drawable0) {
        if(drawable0 == null) {
            return null;
        }
        for(int v = 0; v < toolbar0.getChildCount(); ++v) {
            View view0 = toolbar0.getChildAt(v);
            if(view0 instanceof ImageView) {
                Drawable drawable1 = ((ImageView)view0).getDrawable();
                if(drawable1 != null && drawable1.getConstantState() != null && drawable1.getConstantState().equals(drawable0.getConstantState())) {
                    return (ImageView)view0;
                }
            }
        }
        return null;
    }

    public static ImageView b(Toolbar toolbar0) {
        return r.a(toolbar0, toolbar0.getLogo());
    }

    public static TextView c(Toolbar toolbar0) {
        List list0 = r.d(toolbar0, toolbar0.getSubtitle());
        return list0.isEmpty() ? null : ((TextView)Collections.max(list0, r.a));
    }

    private static List d(Toolbar toolbar0, CharSequence charSequence0) {
        List list0 = new ArrayList();
        for(int v = 0; v < toolbar0.getChildCount(); ++v) {
            View view0 = toolbar0.getChildAt(v);
            if(view0 instanceof TextView && TextUtils.equals(((TextView)view0).getText(), charSequence0)) {
                list0.add(((TextView)view0));
            }
        }
        return list0;
    }

    public static TextView e(Toolbar toolbar0) {
        List list0 = r.d(toolbar0, toolbar0.getTitle());
        return list0.isEmpty() ? null : ((TextView)Collections.min(list0, r.a));
    }
}

