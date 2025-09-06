package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.k;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class c extends g implements Animatable {
    class a implements Drawable.Callback {
        final c f;

        @Override  // android.graphics.drawable.Drawable$Callback
        public void invalidateDrawable(Drawable drawable0) {
            c.this.invalidateSelf();
        }

        @Override  // android.graphics.drawable.Drawable$Callback
        public void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
            c.this.scheduleSelf(runnable0, v);
        }

        @Override  // android.graphics.drawable.Drawable$Callback
        public void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
            c.this.unscheduleSelf(runnable0);
        }
    }

    static class androidx.vectordrawable.graphics.drawable.c.c extends Drawable.ConstantState {
        int a;
        h b;
        AnimatorSet c;
        ArrayList d;
        androidx.collection.a e;

        public androidx.vectordrawable.graphics.drawable.c.c(Context context0, androidx.vectordrawable.graphics.drawable.c.c c$c0, Drawable.Callback drawable$Callback0, Resources resources0) {
            if(c$c0 != null) {
                this.a = c$c0.a;
                h h0 = c$c0.b;
                if(h0 != null) {
                    Drawable.ConstantState drawable$ConstantState0 = h0.getConstantState();
                    this.b = resources0 == null ? ((h)drawable$ConstantState0.newDrawable()) : ((h)drawable$ConstantState0.newDrawable(resources0));
                    h h1 = (h)this.b.mutate();
                    this.b = h1;
                    h1.setCallback(drawable$Callback0);
                    this.b.setBounds(c$c0.b.getBounds());
                    this.b.h(false);
                }
                ArrayList arrayList0 = c$c0.d;
                if(arrayList0 != null) {
                    int v1 = arrayList0.size();
                    this.d = new ArrayList(v1);
                    this.e = new androidx.collection.a(v1);
                    for(int v = 0; v < v1; ++v) {
                        Animator animator0 = (Animator)c$c0.d.get(v);
                        Animator animator1 = animator0.clone();
                        String s = (String)c$c0.e.get(animator0);
                        animator1.setTarget(this.b.d(s));
                        this.d.add(animator1);
                        this.e.put(animator1, s);
                    }
                    this.a();
                }
            }
        }

        public void a() {
            if(this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether(this.d);
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable(Resources resources0) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    static class d extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public d(Drawable.ConstantState drawable$ConstantState0) {
            this.a = drawable$ConstantState0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable() {
            Drawable drawable0 = new c();
            Drawable drawable1 = this.a.newDrawable();
            drawable0.f = drawable1;
            drawable1.setCallback(drawable0.m);
            return drawable0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable(Resources resources0) {
            Drawable drawable0 = new c();
            Drawable drawable1 = this.a.newDrawable(resources0);
            drawable0.f = drawable1;
            drawable1.setCallback(drawable0.m);
            return drawable0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable(Resources resources0, Resources.Theme resources$Theme0) {
            Drawable drawable0 = new c();
            Drawable drawable1 = this.a.newDrawable(resources0, resources$Theme0);
            drawable0.f = drawable1;
            drawable1.setCallback(drawable0.m);
            return drawable0;
        }
    }

    private androidx.vectordrawable.graphics.drawable.c.c g;
    private Context h;
    private ArgbEvaluator i;
    d j;
    private Animator.AnimatorListener k;
    ArrayList l;
    final Drawable.Callback m;

    c() {
        this(null, null, null);
    }

    private c(Context context0) {
        this(context0, null, null);
    }

    private c(Context context0, androidx.vectordrawable.graphics.drawable.c.c c$c0, Resources resources0) {
        this.i = null;
        this.k = null;
        this.l = null;
        a c$a0 = new a(this);
        this.m = c$a0;
        this.h = context0;
        if(c$c0 != null) {
            this.g = c$c0;
            return;
        }
        this.g = new androidx.vectordrawable.graphics.drawable.c.c(context0, null, c$a0, resources0);
    }

    public static c a(Context context0, int v) {
        if(Build.VERSION.SDK_INT >= 24) {
            c c0 = new c(context0);
            Drawable drawable0 = androidx.core.content.res.h.f(context0.getResources(), v, context0.getTheme());
            c0.f = drawable0;
            drawable0.setCallback(c0.m);
            c0.j = new d(c0.f.getConstantState());
            return c0;
        }
        Resources resources0 = context0.getResources();
        try {
            XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
            AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
            do {
                int v1 = xmlResourceParser0.next();
            }
            while(v1 != 1 && v1 != 2);
            if(v1 != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return c.b(context0, context0.getResources(), xmlResourceParser0, attributeSet0, context0.getTheme());
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            Log.e("AnimatedVDCompat", "parser error", iOException0);
            return null;
        }
        Log.e("AnimatedVDCompat", "parser error", xmlPullParserException0);
        return null;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public void applyTheme(Resources.Theme resources$Theme0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            androidx.core.graphics.drawable.a.a(drawable0, resources$Theme0);
        }
    }

    public static c b(Context context0, Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) {
        c c0 = new c(context0);
        c0.inflate(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        return c0;
    }

    public void c(b b0) {
        class androidx.vectordrawable.graphics.drawable.c.b extends AnimatorListenerAdapter {
            final c a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                ArrayList arrayList0 = new ArrayList(c.this.l);
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((b)arrayList0.get(v1)).b(c.this);
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                ArrayList arrayList0 = new ArrayList(c.this.l);
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((b)arrayList0.get(v1)).c(c.this);
                }
            }
        }

        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            c.d(((AnimatedVectorDrawable)drawable0), b0);
            return;
        }
        if(b0 == null) {
            return;
        }
        if(this.l == null) {
            this.l = new ArrayList();
        }
        if(this.l.contains(b0)) {
            return;
        }
        this.l.add(b0);
        if(this.k == null) {
            this.k = new androidx.vectordrawable.graphics.drawable.c.b(this);
        }
        this.g.c.addListener(this.k);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f == null ? false : androidx.core.graphics.drawable.a.b(this.f);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public void clearColorFilter() {
        super.clearColorFilter();
    }

    private static void d(AnimatedVectorDrawable animatedVectorDrawable0, b b0) {
        animatedVectorDrawable0.registerAnimationCallback(b0.a());
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.draw(canvas0);
            return;
        }
        this.g.b.draw(canvas0);
        if(this.g.c.isStarted()) {
            this.invalidateSelf();
        }
    }

    private void e() {
        Animator.AnimatorListener animator$AnimatorListener0 = this.k;
        if(animator$AnimatorListener0 != null) {
            this.g.c.removeListener(animator$AnimatorListener0);
            this.k = null;
        }
    }

    private void f(String s, Animator animator0) {
        animator0.setTarget(this.g.b.d(s));
        androidx.vectordrawable.graphics.drawable.c.c c$c0 = this.g;
        if(c$c0.d == null) {
            c$c0.d = new ArrayList();
            androidx.vectordrawable.graphics.drawable.c.c c$c1 = this.g;
            c$c1.e = new androidx.collection.a();
        }
        this.g.d.add(animator0);
        this.g.e.put(animator0, s);
    }

    public boolean g(b b0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            c.h(((AnimatedVectorDrawable)drawable0), b0);
        }
        ArrayList arrayList0 = this.l;
        if(arrayList0 != null && b0 != null) {
            boolean z = arrayList0.remove(b0);
            if(this.l.size() == 0) {
                this.e();
            }
            return z;
        }
        return false;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable0 = this.f;
        return drawable0 == null ? this.g.b.getAlpha() : androidx.core.graphics.drawable.a.d(drawable0);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable0 = this.f;
        return drawable0 == null ? super.getChangingConfigurations() | this.g.a : drawable0.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable0 = this.f;
        return drawable0 == null ? this.g.b.getColorFilter() : androidx.core.graphics.drawable.a.e(drawable0);
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f != null && Build.VERSION.SDK_INT >= 24 ? new d(this.f.getConstantState()) : null;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable0 = this.f;
        return drawable0 == null ? this.g.b.getIntrinsicHeight() : drawable0.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable0 = this.f;
        return drawable0 == null ? this.g.b.getIntrinsicWidth() : drawable0.getIntrinsicWidth();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable0 = this.f;
        return drawable0 == null ? this.g.b.getOpacity() : drawable0.getOpacity();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public boolean getPadding(Rect rect0) {
        return super.getPadding(rect0);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public int[] getState() {
        return super.getState();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    private static boolean h(AnimatedVectorDrawable animatedVectorDrawable0, b b0) {
        return animatedVectorDrawable0.unregisterAnimationCallback(b0.a());
    }

    @Override  // android.graphics.drawable.Drawable
    public void inflate(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0) {
        this.inflate(resources0, xmlPullParser0, attributeSet0, null);
    }

    @Override  // android.graphics.drawable.Drawable
    public void inflate(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            androidx.core.graphics.drawable.a.g(drawable0, resources0, xmlPullParser0, attributeSet0, resources$Theme0);
            return;
        }
        int v = xmlPullParser0.getEventType();
        int v1 = xmlPullParser0.getDepth();
        while(v != 1 && (xmlPullParser0.getDepth() >= v1 + 1 || v != 3)) {
            if(v == 2) {
                String s = xmlPullParser0.getName();
                if("animated-vector".equals(s)) {
                    TypedArray typedArray0 = k.s(resources0, resources$Theme0, attributeSet0, androidx.vectordrawable.graphics.drawable.a.e);
                    int v2 = typedArray0.getResourceId(0, 0);
                    if(v2 != 0) {
                        h h0 = h.b(resources0, v2, resources$Theme0);
                        h0.h(false);
                        h0.setCallback(this.m);
                        h h1 = this.g.b;
                        if(h1 != null) {
                            h1.setCallback(null);
                        }
                        this.g.b = h0;
                    }
                    typedArray0.recycle();
                }
                else if("target".equals(s)) {
                    TypedArray typedArray1 = resources0.obtainAttributes(attributeSet0, androidx.vectordrawable.graphics.drawable.a.f);
                    String s1 = typedArray1.getString(0);
                    int v3 = typedArray1.getResourceId(1, 0);
                    if(v3 != 0) {
                        Context context0 = this.h;
                        if(context0 != null) {
                            this.f(s1, e.i(context0, v3));
                            goto label_33;
                        }
                        typedArray1.recycle();
                        throw new IllegalStateException("Context can\'t be null when inflating animators");
                    }
                label_33:
                    typedArray1.recycle();
                }
            }
            v = xmlPullParser0.next();
        }
        this.g.a();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable0 = this.f;
        return drawable0 == null ? this.g.b.isAutoMirrored() : androidx.core.graphics.drawable.a.h(drawable0);
    }

    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable0 = this.f;
        return drawable0 == null ? this.g.c.isRunning() : ((AnimatedVectorDrawable)drawable0).isRunning();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable0 = this.f;
        return drawable0 == null ? this.g.b.isStateful() : drawable0.isStateful();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.mutate();
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
            return;
        }
        this.g.b.setBounds(rect0);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    protected boolean onLevelChange(int v) {
        Drawable drawable0 = this.f;
        return drawable0 == null ? this.g.b.setLevel(v) : drawable0.setLevel(v);
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        Drawable drawable0 = this.f;
        return drawable0 == null ? this.g.b.setState(arr_v) : drawable0.setState(arr_v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.setAlpha(v);
            return;
        }
        this.g.b.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            androidx.core.graphics.drawable.a.j(drawable0, z);
            return;
        }
        this.g.b.setAutoMirrored(z);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public void setChangingConfigurations(int v) {
        super.setChangingConfigurations(v);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public void setColorFilter(int v, PorterDuff.Mode porterDuff$Mode0) {
        super.setColorFilter(v, porterDuff$Mode0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.setColorFilter(colorFilter0);
            return;
        }
        this.g.b.setColorFilter(colorFilter0);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public void setHotspot(float f, float f1) {
        super.setHotspot(f, f1);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public void setHotspotBounds(int v, int v1, int v2, int v3) {
        super.setHotspotBounds(v, v1, v2, v3);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public boolean setState(int[] arr_v) {
        return super.setState(arr_v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTint(int v) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            androidx.core.graphics.drawable.a.n(drawable0, v);
            return;
        }
        this.g.b.setTint(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            androidx.core.graphics.drawable.a.o(drawable0, colorStateList0);
            return;
        }
        this.g.b.setTintList(colorStateList0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            androidx.core.graphics.drawable.a.p(drawable0, porterDuff$Mode0);
            return;
        }
        this.g.b.setTintMode(porterDuff$Mode0);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            return drawable0.setVisible(z, z1);
        }
        this.g.b.setVisible(z, z1);
        return super.setVisible(z, z1);
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            ((AnimatedVectorDrawable)drawable0).start();
            return;
        }
        if(this.g.c.isStarted()) {
            return;
        }
        this.g.c.start();
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            ((AnimatedVectorDrawable)drawable0).stop();
            return;
        }
        this.g.c.end();
    }
}

