package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.d;
import androidx.core.content.res.k;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class h extends g {
    static abstract class a {
    }

    static class b extends f {
        b() {
        }

        b(b h$b0) {
            super(h$b0);
        }

        @Override  // androidx.vectordrawable.graphics.drawable.h$f
        public boolean c() {
            return true;
        }

        public void e(Resources resources0, AttributeSet attributeSet0, Resources.Theme resources$Theme0, XmlPullParser xmlPullParser0) {
            if(!k.r(xmlPullParser0, "pathData")) {
                return;
            }
            TypedArray typedArray0 = k.s(resources0, resources$Theme0, attributeSet0, androidx.vectordrawable.graphics.drawable.a.d);
            this.f(typedArray0, xmlPullParser0);
            typedArray0.recycle();
        }

        private void f(TypedArray typedArray0, XmlPullParser xmlPullParser0) {
            String s = typedArray0.getString(0);
            if(s != null) {
                this.b = s;
            }
            String s1 = typedArray0.getString(1);
            if(s1 != null) {
                this.a = androidx.core.graphics.g.d(s1);
            }
            this.c = k.k(typedArray0, xmlPullParser0, "fillType", 2, 0);
        }
    }

    static class c extends f {
        private int[] e;
        d f;
        float g;
        d h;
        float i;
        float j;
        float k;
        float l;
        float m;
        Paint.Cap n;
        Paint.Join o;
        float p;

        c() {
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        c(c h$c0) {
            super(h$c0);
            this.e = h$c0.e;
            this.f = h$c0.f;
            this.g = h$c0.g;
            this.i = h$c0.i;
            this.h = h$c0.h;
            this.c = h$c0.c;
            this.j = h$c0.j;
            this.k = h$c0.k;
            this.l = h$c0.l;
            this.m = h$c0.m;
            this.n = h$c0.n;
            this.o = h$c0.o;
            this.p = h$c0.p;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.vectordrawable.graphics.drawable.h$e
        public boolean a() {
            return this.h.i() || this.f.i();
        }

        @Override  // androidx.vectordrawable.graphics.drawable.h$e
        public boolean b(int[] arr_v) {
            boolean z = this.h.j(arr_v);
            return this.f.j(arr_v) | z;
        }

        private Paint.Cap e(int v, Paint.Cap paint$Cap0) {
            switch(v) {
                case 0: {
                    return Paint.Cap.BUTT;
                }
                case 1: {
                    return Paint.Cap.ROUND;
                }
                case 2: {
                    return Paint.Cap.SQUARE;
                }
                default: {
                    return paint$Cap0;
                }
            }
        }

        private Paint.Join f(int v, Paint.Join paint$Join0) {
            switch(v) {
                case 0: {
                    return Paint.Join.MITER;
                }
                case 1: {
                    return Paint.Join.ROUND;
                }
                case 2: {
                    return Paint.Join.BEVEL;
                }
                default: {
                    return paint$Join0;
                }
            }
        }

        public void g(Resources resources0, AttributeSet attributeSet0, Resources.Theme resources$Theme0, XmlPullParser xmlPullParser0) {
            TypedArray typedArray0 = k.s(resources0, resources$Theme0, attributeSet0, androidx.vectordrawable.graphics.drawable.a.c);
            this.h(typedArray0, xmlPullParser0, resources$Theme0);
            typedArray0.recycle();
        }

        float getFillAlpha() {
            return this.j;
        }

        int getFillColor() {
            return this.h.e();
        }

        float getStrokeAlpha() {
            return this.i;
        }

        int getStrokeColor() {
            return this.f.e();
        }

        float getStrokeWidth() {
            return this.g;
        }

        float getTrimPathEnd() {
            return this.l;
        }

        float getTrimPathOffset() {
            return this.m;
        }

        float getTrimPathStart() {
            return this.k;
        }

        private void h(TypedArray typedArray0, XmlPullParser xmlPullParser0, Resources.Theme resources$Theme0) {
            this.e = null;
            if(!k.r(xmlPullParser0, "pathData")) {
                return;
            }
            String s = typedArray0.getString(0);
            if(s != null) {
                this.b = s;
            }
            String s1 = typedArray0.getString(2);
            if(s1 != null) {
                this.a = androidx.core.graphics.g.d(s1);
            }
            this.h = k.i(typedArray0, xmlPullParser0, resources$Theme0, "fillColor", 1, 0);
            this.j = k.j(typedArray0, xmlPullParser0, "fillAlpha", 12, this.j);
            this.n = this.e(k.k(typedArray0, xmlPullParser0, "strokeLineCap", 8, -1), this.n);
            this.o = this.f(k.k(typedArray0, xmlPullParser0, "strokeLineJoin", 9, -1), this.o);
            this.p = k.j(typedArray0, xmlPullParser0, "strokeMiterLimit", 10, this.p);
            this.f = k.i(typedArray0, xmlPullParser0, resources$Theme0, "strokeColor", 3, 0);
            this.i = k.j(typedArray0, xmlPullParser0, "strokeAlpha", 11, this.i);
            this.g = k.j(typedArray0, xmlPullParser0, "strokeWidth", 4, this.g);
            this.l = k.j(typedArray0, xmlPullParser0, "trimPathEnd", 6, this.l);
            this.m = k.j(typedArray0, xmlPullParser0, "trimPathOffset", 7, this.m);
            this.k = k.j(typedArray0, xmlPullParser0, "trimPathStart", 5, this.k);
            this.c = k.k(typedArray0, xmlPullParser0, "fillType", 13, this.c);
        }

        void setFillAlpha(float f) {
            this.j = f;
        }

        void setFillColor(int v) {
            this.h.k(v);
        }

        void setStrokeAlpha(float f) {
            this.i = f;
        }

        void setStrokeColor(int v) {
            this.f.k(v);
        }

        void setStrokeWidth(float f) {
            this.g = f;
        }

        void setTrimPathEnd(float f) {
            this.l = f;
        }

        void setTrimPathOffset(float f) {
            this.m = f;
        }

        void setTrimPathStart(float f) {
            this.k = f;
        }
    }

    static class androidx.vectordrawable.graphics.drawable.h.d extends e {
        final Matrix a;
        final ArrayList b;
        float c;
        private float d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        final Matrix j;
        int k;
        private int[] l;
        private String m;

        public androidx.vectordrawable.graphics.drawable.h.d() {
            super(null);
            this.a = new Matrix();
            this.b = new ArrayList();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }

        public androidx.vectordrawable.graphics.drawable.h.d(androidx.vectordrawable.graphics.drawable.h.d h$d0, androidx.collection.a a0) {
            super(null);
            c h$c0;
            this.a = new Matrix();
            this.b = new ArrayList();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            Matrix matrix0 = new Matrix();
            this.j = matrix0;
            this.c = h$d0.c;
            this.d = h$d0.d;
            this.e = h$d0.e;
            this.f = h$d0.f;
            this.g = h$d0.g;
            this.h = h$d0.h;
            this.i = h$d0.i;
            this.l = h$d0.l;
            String s = h$d0.m;
            this.m = s;
            this.k = h$d0.k;
            if(s != null) {
                a0.put(s, this);
            }
            matrix0.set(h$d0.j);
            ArrayList arrayList0 = h$d0.b;
            for(int v = 0; v < arrayList0.size(); ++v) {
                Object object0 = arrayList0.get(v);
                if(object0 instanceof androidx.vectordrawable.graphics.drawable.h.d) {
                    androidx.vectordrawable.graphics.drawable.h.d h$d1 = new androidx.vectordrawable.graphics.drawable.h.d(((androidx.vectordrawable.graphics.drawable.h.d)object0), a0);
                    this.b.add(h$d1);
                }
                else {
                    if(object0 instanceof c) {
                        h$c0 = new c(((c)object0));
                    }
                    else {
                        if(!(object0 instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        h$c0 = new b(((b)object0));
                    }
                    this.b.add(h$c0);
                    String s1 = h$c0.b;
                    if(s1 != null) {
                        a0.put(s1, h$c0);
                    }
                }
            }
        }

        @Override  // androidx.vectordrawable.graphics.drawable.h$e
        public boolean a() {
            for(int v = 0; v < this.b.size(); ++v) {
                if(((e)this.b.get(v)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override  // androidx.vectordrawable.graphics.drawable.h$e
        public boolean b(int[] arr_v) {
            boolean z = false;
            for(int v = 0; v < this.b.size(); ++v) {
                z |= ((e)this.b.get(v)).b(arr_v);
            }
            return z;
        }

        public void c(Resources resources0, AttributeSet attributeSet0, Resources.Theme resources$Theme0, XmlPullParser xmlPullParser0) {
            TypedArray typedArray0 = k.s(resources0, resources$Theme0, attributeSet0, androidx.vectordrawable.graphics.drawable.a.b);
            this.e(typedArray0, xmlPullParser0);
            typedArray0.recycle();
        }

        private void d() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        private void e(TypedArray typedArray0, XmlPullParser xmlPullParser0) {
            this.l = null;
            this.c = k.j(typedArray0, xmlPullParser0, "rotation", 5, this.c);
            this.d = typedArray0.getFloat(1, this.d);
            this.e = typedArray0.getFloat(2, this.e);
            this.f = k.j(typedArray0, xmlPullParser0, "scaleX", 3, this.f);
            this.g = k.j(typedArray0, xmlPullParser0, "scaleY", 4, this.g);
            this.h = k.j(typedArray0, xmlPullParser0, "translateX", 6, this.h);
            this.i = k.j(typedArray0, xmlPullParser0, "translateY", 7, this.i);
            String s = typedArray0.getString(0);
            if(s != null) {
                this.m = s;
            }
            this.d();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if(f != this.d) {
                this.d = f;
                this.d();
            }
        }

        public void setPivotY(float f) {
            if(f != this.e) {
                this.e = f;
                this.d();
            }
        }

        public void setRotation(float f) {
            if(f != this.c) {
                this.c = f;
                this.d();
            }
        }

        public void setScaleX(float f) {
            if(f != this.f) {
                this.f = f;
                this.d();
            }
        }

        public void setScaleY(float f) {
            if(f != this.g) {
                this.g = f;
                this.d();
            }
        }

        public void setTranslateX(float f) {
            if(f != this.h) {
                this.h = f;
                this.d();
            }
        }

        public void setTranslateY(float f) {
            if(f != this.i) {
                this.i = f;
                this.d();
            }
        }
    }

    static abstract class e {
        private e() {
        }

        e(a h$a0) {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] arr_v) {
            return false;
        }
    }

    static abstract class f extends e {
        protected androidx.core.graphics.g.b[] a;
        String b;
        int c;
        int d;

        public f() {
            super(null);
            this.a = null;
            this.c = 0;
        }

        public f(f h$f0) {
            super(null);
            this.c = 0;
            this.b = h$f0.b;
            this.d = h$f0.d;
            this.a = androidx.core.graphics.g.f(h$f0.a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path0) {
            path0.reset();
            androidx.core.graphics.g.b[] arr_g$b = this.a;
            if(arr_g$b != null) {
                androidx.core.graphics.g.b.i(arr_g$b, path0);
            }
        }

        public androidx.core.graphics.g.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(androidx.core.graphics.g.b[] arr_g$b) {
            if(!androidx.core.graphics.g.b(this.a, arr_g$b)) {
                this.a = androidx.core.graphics.g.f(arr_g$b);
                return;
            }
            androidx.core.graphics.g.k(this.a, arr_g$b);
        }
    }

    static class androidx.vectordrawable.graphics.drawable.h.g {
        private final Path a;
        private final Path b;
        private final Matrix c;
        Paint d;
        Paint e;
        private PathMeasure f;
        private int g;
        final androidx.vectordrawable.graphics.drawable.h.d h;
        float i;
        float j;
        float k;
        float l;
        int m;
        String n;
        Boolean o;
        final androidx.collection.a p;
        private static final Matrix q;

        static {
            androidx.vectordrawable.graphics.drawable.h.g.q = new Matrix();
        }

        public androidx.vectordrawable.graphics.drawable.h.g() {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0xFF;
            this.n = null;
            this.o = null;
            this.p = new androidx.collection.a();
            this.h = new androidx.vectordrawable.graphics.drawable.h.d();
            this.a = new Path();
            this.b = new Path();
        }

        public androidx.vectordrawable.graphics.drawable.h.g(androidx.vectordrawable.graphics.drawable.h.g h$g0) {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0xFF;
            this.n = null;
            this.o = null;
            androidx.collection.a a0 = new androidx.collection.a();
            this.p = a0;
            this.h = new androidx.vectordrawable.graphics.drawable.h.d(h$g0.h, a0);
            this.a = new Path(h$g0.a);
            this.b = new Path(h$g0.b);
            this.i = h$g0.i;
            this.j = h$g0.j;
            this.k = h$g0.k;
            this.l = h$g0.l;
            this.g = h$g0.g;
            this.m = h$g0.m;
            this.n = h$g0.n;
            String s = h$g0.n;
            if(s != null) {
                a0.put(s, this);
            }
            this.o = h$g0.o;
        }

        private static float a(float f, float f1, float f2, float f3) [...] // Inlined contents

        public void b(Canvas canvas0, int v, int v1, ColorFilter colorFilter0) {
            this.c(this.h, androidx.vectordrawable.graphics.drawable.h.g.q, canvas0, v, v1, colorFilter0);
        }

        private void c(androidx.vectordrawable.graphics.drawable.h.d h$d0, Matrix matrix0, Canvas canvas0, int v, int v1, ColorFilter colorFilter0) {
            h$d0.a.set(matrix0);
            h$d0.a.preConcat(h$d0.j);
            canvas0.save();
            for(int v2 = 0; v2 < h$d0.b.size(); ++v2) {
                e h$e0 = (e)h$d0.b.get(v2);
                if(h$e0 instanceof androidx.vectordrawable.graphics.drawable.h.d) {
                    this.c(((androidx.vectordrawable.graphics.drawable.h.d)h$e0), h$d0.a, canvas0, v, v1, colorFilter0);
                }
                else if(h$e0 instanceof f) {
                    this.d(h$d0, ((f)h$e0), canvas0, v, v1, colorFilter0);
                }
            }
            canvas0.restore();
        }

        private void d(androidx.vectordrawable.graphics.drawable.h.d h$d0, f h$f0, Canvas canvas0, int v, int v1, ColorFilter colorFilter0) {
            float f = ((float)v) / this.k;
            float f1 = ((float)v1) / this.l;
            float f2 = Math.min(f, f1);
            this.c.set(h$d0.a);
            this.c.postScale(f, f1);
            float f3 = this.e(h$d0.a);
            if(f3 == 0.0f) {
                return;
            }
            h$f0.d(this.a);
            Path path0 = this.a;
            this.b.reset();
            if(h$f0.c()) {
                this.b.setFillType((h$f0.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD));
                this.b.addPath(path0, this.c);
                canvas0.clipPath(this.b);
                return;
            }
            float f4 = ((c)h$f0).k;
            if(Float.compare(f4, 0.0f) != 0 || ((c)h$f0).l != 1.0f) {
                float f5 = ((c)h$f0).m;
                float f6 = (((c)h$f0).l + f5) % 1.0f;
                if(this.f == null) {
                    this.f = new PathMeasure();
                }
                this.f.setPath(this.a, false);
                float f7 = this.f.getLength();
                float f8 = (f4 + f5) % 1.0f * f7;
                float f9 = f6 * f7;
                path0.reset();
                if(f8 > f9) {
                    this.f.getSegment(f8, f7, path0, true);
                    this.f.getSegment(0.0f, f9, path0, true);
                }
                else {
                    this.f.getSegment(f8, f9, path0, true);
                }
                path0.rLineTo(0.0f, 0.0f);
            }
            this.b.addPath(path0, this.c);
            if(((c)h$f0).h.l()) {
                d d0 = ((c)h$f0).h;
                if(this.e == null) {
                    Paint paint0 = new Paint(1);
                    this.e = paint0;
                    paint0.setStyle(Paint.Style.FILL);
                }
                Paint paint1 = this.e;
                if(d0.h()) {
                    Shader shader0 = d0.f();
                    shader0.setLocalMatrix(this.c);
                    paint1.setShader(shader0);
                    paint1.setAlpha(Math.round(((c)h$f0).j * 255.0f));
                }
                else {
                    paint1.setShader(null);
                    paint1.setAlpha(0xFF);
                    paint1.setColor(h.a(d0.e(), ((c)h$f0).j));
                }
                paint1.setColorFilter(colorFilter0);
                this.b.setFillType((((c)h$f0).c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD));
                canvas0.drawPath(this.b, paint1);
            }
            if(((c)h$f0).f.l()) {
                d d1 = ((c)h$f0).f;
                if(this.d == null) {
                    Paint paint2 = new Paint(1);
                    this.d = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                }
                Paint paint3 = this.d;
                Paint.Join paint$Join0 = ((c)h$f0).o;
                if(paint$Join0 != null) {
                    paint3.setStrokeJoin(paint$Join0);
                }
                Paint.Cap paint$Cap0 = ((c)h$f0).n;
                if(paint$Cap0 != null) {
                    paint3.setStrokeCap(paint$Cap0);
                }
                paint3.setStrokeMiter(((c)h$f0).p);
                if(d1.h()) {
                    Shader shader1 = d1.f();
                    shader1.setLocalMatrix(this.c);
                    paint3.setShader(shader1);
                    paint3.setAlpha(Math.round(((c)h$f0).i * 255.0f));
                }
                else {
                    paint3.setShader(null);
                    paint3.setAlpha(0xFF);
                    paint3.setColor(h.a(d1.e(), ((c)h$f0).i));
                }
                paint3.setColorFilter(colorFilter0);
                paint3.setStrokeWidth(((c)h$f0).g * (f2 * f3));
                canvas0.drawPath(this.b, paint3);
            }
        }

        private float e(Matrix matrix0) {
            float[] arr_f = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix0.mapVectors(arr_f);
            float f = Math.max(((float)Math.hypot(arr_f[0], arr_f[1])), ((float)Math.hypot(arr_f[2], arr_f[3])));
            return f > 0.0f ? Math.abs(arr_f[0] * arr_f[3] - arr_f[1] * arr_f[2]) / f : 0.0f;
        }

        public boolean f() {
            if(this.o == null) {
                this.o = Boolean.valueOf(this.h.a());
            }
            return this.o.booleanValue();
        }

        public boolean g(int[] arr_v) {
            return this.h.b(arr_v);
        }

        public float getAlpha() {
            return ((float)this.getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f) {
            this.setRootAlpha(((int)(f * 255.0f)));
        }

        public void setRootAlpha(int v) {
            this.m = v;
        }
    }

    static class androidx.vectordrawable.graphics.drawable.h.h extends Drawable.ConstantState {
        int a;
        androidx.vectordrawable.graphics.drawable.h.g b;
        ColorStateList c;
        PorterDuff.Mode d;
        boolean e;
        Bitmap f;
        ColorStateList g;
        PorterDuff.Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public androidx.vectordrawable.graphics.drawable.h.h() {
            this.c = null;
            this.d = h.p;
            this.b = new androidx.vectordrawable.graphics.drawable.h.g();
        }

        public androidx.vectordrawable.graphics.drawable.h.h(androidx.vectordrawable.graphics.drawable.h.h h$h0) {
            this.c = null;
            this.d = h.p;
            if(h$h0 != null) {
                this.a = h$h0.a;
                androidx.vectordrawable.graphics.drawable.h.g h$g0 = new androidx.vectordrawable.graphics.drawable.h.g(h$h0.b);
                this.b = h$g0;
                if(h$h0.b.e != null) {
                    h$g0.e = new Paint(h$h0.b.e);
                }
                if(h$h0.b.d != null) {
                    androidx.vectordrawable.graphics.drawable.h.g h$g1 = this.b;
                    h$g1.d = new Paint(h$h0.b.d);
                }
                this.c = h$h0.c;
                this.d = h$h0.d;
                this.e = h$h0.e;
            }
        }

        public boolean a(int v, int v1) {
            return v == this.f.getWidth() && v1 == this.f.getHeight();
        }

        public boolean b() {
            return !this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.getRootAlpha();
        }

        public void c(int v, int v1) {
            if(this.f == null || !this.a(v, v1)) {
                this.f = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public void d(Canvas canvas0, ColorFilter colorFilter0, Rect rect0) {
            Paint paint0 = this.e(colorFilter0);
            canvas0.drawBitmap(this.f, null, rect0, paint0);
        }

        public Paint e(ColorFilter colorFilter0) {
            if(!this.f() && colorFilter0 == null) {
                return null;
            }
            if(this.l == null) {
                Paint paint0 = new Paint();
                this.l = paint0;
                paint0.setFilterBitmap(true);
            }
            this.l.setAlpha(this.b.getRootAlpha());
            this.l.setColorFilter(colorFilter0);
            return this.l;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 0xFF;
        }

        public boolean g() {
            return this.b.f();
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] arr_v) {
            boolean z = this.b.g(arr_v);
            this.k |= z;
            return z;
        }

        public void i() {
            this.g = this.c;
            this.h = this.d;
            this.i = this.b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        public void j(int v, int v1) {
            this.f.eraseColor(0);
            Canvas canvas0 = new Canvas(this.f);
            this.b.b(canvas0, v, v1, null);
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable(Resources resources0) {
            return new h(this);
        }
    }

    static class i extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public i(Drawable.ConstantState drawable$ConstantState0) {
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
            Drawable drawable0 = new h();
            drawable0.f = (VectorDrawable)this.a.newDrawable();
            return drawable0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable(Resources resources0) {
            Drawable drawable0 = new h();
            drawable0.f = (VectorDrawable)this.a.newDrawable(resources0);
            return drawable0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable(Resources resources0, Resources.Theme resources$Theme0) {
            Drawable drawable0 = new h();
            drawable0.f = (VectorDrawable)this.a.newDrawable(resources0, resources$Theme0);
            return drawable0;
        }
    }

    private androidx.vectordrawable.graphics.drawable.h.h g;
    private PorterDuffColorFilter h;
    private ColorFilter i;
    private boolean j;
    private boolean k;
    private Drawable.ConstantState l;
    private final float[] m;
    private final Matrix n;
    private final Rect o;
    static final PorterDuff.Mode p;

    static {
        h.p = PorterDuff.Mode.SRC_IN;
    }

    h() {
        this.k = true;
        this.m = new float[9];
        this.n = new Matrix();
        this.o = new Rect();
        this.g = new androidx.vectordrawable.graphics.drawable.h.h();
    }

    h(androidx.vectordrawable.graphics.drawable.h.h h$h0) {
        this.k = true;
        this.m = new float[9];
        this.n = new Matrix();
        this.o = new Rect();
        this.g = h$h0;
        this.h = this.j(this.h, h$h0.c, h$h0.d);
    }

    static int a(int v, float f) {
        return v & 0xFFFFFF | ((int)(((float)Color.alpha(v)) * f)) << 24;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public void applyTheme(Resources.Theme resources$Theme0) {
        super.applyTheme(resources$Theme0);
    }

    public static h b(Resources resources0, int v, Resources.Theme resources$Theme0) {
        if(Build.VERSION.SDK_INT >= 24) {
            h h0 = new h();
            h0.f = androidx.core.content.res.h.f(resources0, v, resources$Theme0);
            h0.l = new i(h0.f.getConstantState());
            return h0;
        }
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
            return h.c(resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            Log.e("VectorDrawableCompat", "parser error", iOException0);
            return null;
        }
        Log.e("VectorDrawableCompat", "parser error", xmlPullParserException0);
        return null;
    }

    public static h c(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) {
        h h0 = new h();
        h0.inflate(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        return h0;
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            androidx.core.graphics.drawable.a.b(drawable0);
        }
        return false;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public void clearColorFilter() {
        super.clearColorFilter();
    }

    Object d(String s) {
        return this.g.b.p.get(s);
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.draw(canvas0);
            return;
        }
        this.copyBounds(this.o);
        if(this.o.width() > 0 && this.o.height() > 0) {
            ColorFilter colorFilter0 = this.i;
            if(colorFilter0 == null) {
                colorFilter0 = this.h;
            }
            canvas0.getMatrix(this.n);
            this.n.getValues(this.m);
            float f = Math.abs(this.m[0]);
            float f1 = Math.abs(this.m[4]);
            if(Float.compare(Math.abs(this.m[1]), 0.0f) != 0 || Math.abs(this.m[3]) != 0.0f) {
                f = 1.0f;
                f1 = 1.0f;
            }
            int v = Math.min(0x800, ((int)(((float)this.o.width()) * f)));
            int v1 = Math.min(0x800, ((int)(((float)this.o.height()) * f1)));
            if(v > 0 && v1 > 0) {
                int v2 = canvas0.save();
                canvas0.translate(((float)this.o.left), ((float)this.o.top));
                if(this.f()) {
                    canvas0.translate(((float)this.o.width()), 0.0f);
                    canvas0.scale(-1.0f, 1.0f);
                }
                this.o.offsetTo(0, 0);
                this.g.c(v, v1);
                if(!this.k) {
                    this.g.j(v, v1);
                }
                else if(!this.g.b()) {
                    this.g.j(v, v1);
                    this.g.i();
                }
                this.g.d(canvas0, colorFilter0, this.o);
                canvas0.restoreToCount(v2);
            }
        }
    }

    private void e(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) {
        androidx.vectordrawable.graphics.drawable.h.h h$h0 = this.g;
        androidx.vectordrawable.graphics.drawable.h.g h$g0 = h$h0.b;
        ArrayDeque arrayDeque0 = new ArrayDeque();
        arrayDeque0.push(h$g0.h);
        int v = xmlPullParser0.getEventType();
        int v1 = xmlPullParser0.getDepth();
        boolean z = true;
        while(v != 1 && (xmlPullParser0.getDepth() >= v1 + 1 || v != 3)) {
            switch(v) {
                case 2: {
                    String s = xmlPullParser0.getName();
                    androidx.vectordrawable.graphics.drawable.h.d h$d0 = (androidx.vectordrawable.graphics.drawable.h.d)arrayDeque0.peek();
                    if("path".equals(s)) {
                        c h$c0 = new c();
                        h$c0.g(resources0, attributeSet0, resources$Theme0, xmlPullParser0);
                        h$d0.b.add(h$c0);
                        if(h$c0.getPathName() != null) {
                            h$g0.p.put(h$c0.getPathName(), h$c0);
                        }
                        h$h0.a |= h$c0.d;
                        z = false;
                    }
                    else if("clip-path".equals(s)) {
                        b h$b0 = new b();
                        h$b0.e(resources0, attributeSet0, resources$Theme0, xmlPullParser0);
                        h$d0.b.add(h$b0);
                        if(h$b0.getPathName() != null) {
                            h$g0.p.put(h$b0.getPathName(), h$b0);
                        }
                        h$h0.a |= h$b0.d;
                    }
                    else if("group".equals(s)) {
                        androidx.vectordrawable.graphics.drawable.h.d h$d1 = new androidx.vectordrawable.graphics.drawable.h.d();
                        h$d1.c(resources0, attributeSet0, resources$Theme0, xmlPullParser0);
                        h$d0.b.add(h$d1);
                        arrayDeque0.push(h$d1);
                        if(h$d1.getGroupName() != null) {
                            h$g0.p.put(h$d1.getGroupName(), h$d1);
                        }
                        h$h0.a |= h$d1.k;
                    }
                    break;
                }
                case 3: {
                    if("group".equals(xmlPullParser0.getName())) {
                        arrayDeque0.pop();
                    }
                }
            }
            v = xmlPullParser0.next();
        }
        if(z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return this.isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int v, PorterDuff.Mode porterDuff$Mode0) {
        switch(v) {
            case 3: {
                return PorterDuff.Mode.SRC_OVER;
            }
            case 5: {
                return PorterDuff.Mode.SRC_IN;
            }
            case 9: {
                return PorterDuff.Mode.SRC_ATOP;
            }
            case 14: {
                return PorterDuff.Mode.MULTIPLY;
            }
            case 15: {
                return PorterDuff.Mode.SCREEN;
            }
            case 16: {
                return PorterDuff.Mode.ADD;
            }
            default: {
                return porterDuff$Mode0;
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f == null ? this.g.b.getRootAlpha() : androidx.core.graphics.drawable.a.d(this.f);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable0 = this.f;
        return drawable0 == null ? super.getChangingConfigurations() | this.g.getChangingConfigurations() : drawable0.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f == null ? this.i : androidx.core.graphics.drawable.a.e(this.f);
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if(this.f != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f.getConstantState());
        }
        androidx.vectordrawable.graphics.drawable.h.h h$h0 = this.g;
        h$h0.a = this.getChangingConfigurations();
        return this.g;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.g
    public Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f == null ? ((int)this.g.b.j) : this.f.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f == null ? ((int)this.g.b.i) : this.f.getIntrinsicWidth();
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
        return this.f == null ? -3 : this.f.getOpacity();
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

    void h(boolean z) {
        this.k = z;
    }

    private void i(TypedArray typedArray0, XmlPullParser xmlPullParser0, Resources.Theme resources$Theme0) {
        androidx.vectordrawable.graphics.drawable.h.h h$h0 = this.g;
        androidx.vectordrawable.graphics.drawable.h.g h$g0 = h$h0.b;
        h$h0.d = h.g(k.k(typedArray0, xmlPullParser0, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList0 = k.g(typedArray0, xmlPullParser0, resources$Theme0, "tint", 1);
        if(colorStateList0 != null) {
            h$h0.c = colorStateList0;
        }
        h$h0.e = k.e(typedArray0, xmlPullParser0, "autoMirrored", 5, h$h0.e);
        h$g0.k = k.j(typedArray0, xmlPullParser0, "viewportWidth", 7, h$g0.k);
        float f = k.j(typedArray0, xmlPullParser0, "viewportHeight", 8, h$g0.l);
        h$g0.l = f;
        if(h$g0.k <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if(f <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        h$g0.i = typedArray0.getDimension(3, h$g0.i);
        float f1 = typedArray0.getDimension(2, h$g0.j);
        h$g0.j = f1;
        if(h$g0.i <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if(f1 <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires height > 0");
        }
        h$g0.setAlpha(k.j(typedArray0, xmlPullParser0, "alpha", 4, h$g0.getAlpha()));
        String s = typedArray0.getString(0);
        if(s != null) {
            h$g0.n = s;
            h$g0.p.put(s, h$g0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void inflate(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.inflate(resources0, xmlPullParser0, attributeSet0);
            return;
        }
        this.inflate(resources0, xmlPullParser0, attributeSet0, null);
    }

    @Override  // android.graphics.drawable.Drawable
    public void inflate(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            androidx.core.graphics.drawable.a.g(drawable0, resources0, xmlPullParser0, attributeSet0, resources$Theme0);
            return;
        }
        androidx.vectordrawable.graphics.drawable.h.h h$h0 = this.g;
        h$h0.b = new androidx.vectordrawable.graphics.drawable.h.g();
        TypedArray typedArray0 = k.s(resources0, resources$Theme0, attributeSet0, androidx.vectordrawable.graphics.drawable.a.a);
        this.i(typedArray0, xmlPullParser0, resources$Theme0);
        typedArray0.recycle();
        h$h0.a = this.getChangingConfigurations();
        h$h0.k = true;
        this.e(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        this.h = this.j(this.h, h$h0.c, h$h0.d);
    }

    @Override  // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.invalidateSelf();
            return;
        }
        super.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f == null ? this.g.e : androidx.core.graphics.drawable.a.h(this.f);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            return drawable0.isStateful();
        }
        if(!super.isStateful()) {
            androidx.vectordrawable.graphics.drawable.h.h h$h0 = this.g;
            if(h$h0 == null) {
                return false;
            }
            if(!h$h0.g()) {
                ColorStateList colorStateList0 = this.g.c;
                return colorStateList0 != null && colorStateList0.isStateful();
            }
        }
        return true;
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter0, ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0) {
        return colorStateList0 == null || porterDuff$Mode0 == null ? null : new PorterDuffColorFilter(colorStateList0.getColorForState(this.getState(), 0), porterDuff$Mode0);
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
            return this;
        }
        if(!this.j && super.mutate() == this) {
            this.g = new androidx.vectordrawable.graphics.drawable.h.h(this.g);
            this.j = true;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        boolean z;
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            return drawable0.setState(arr_v);
        }
        androidx.vectordrawable.graphics.drawable.h.h h$h0 = this.g;
        ColorStateList colorStateList0 = h$h0.c;
        if(colorStateList0 == null) {
            z = false;
        }
        else {
            PorterDuff.Mode porterDuff$Mode0 = h$h0.d;
            if(porterDuff$Mode0 == null) {
                z = false;
            }
            else {
                this.h = this.j(this.h, colorStateList0, porterDuff$Mode0);
                this.invalidateSelf();
                z = true;
            }
        }
        if(h$h0.g() && h$h0.h(arr_v)) {
            this.invalidateSelf();
            return true;
        }
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable0, long v) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.scheduleSelf(runnable0, v);
            return;
        }
        super.scheduleSelf(runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.setAlpha(v);
            return;
        }
        if(this.g.b.getRootAlpha() != v) {
            this.g.b.setRootAlpha(v);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            androidx.core.graphics.drawable.a.j(drawable0, z);
            return;
        }
        this.g.e = z;
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
        this.i = colorFilter0;
        this.invalidateSelf();
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
        this.setTintList(ColorStateList.valueOf(v));
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            androidx.core.graphics.drawable.a.o(drawable0, colorStateList0);
            return;
        }
        androidx.vectordrawable.graphics.drawable.h.h h$h0 = this.g;
        if(h$h0.c != colorStateList0) {
            h$h0.c = colorStateList0;
            this.h = this.j(this.h, colorStateList0, h$h0.d);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            androidx.core.graphics.drawable.a.p(drawable0, porterDuff$Mode0);
            return;
        }
        androidx.vectordrawable.graphics.drawable.h.h h$h0 = this.g;
        if(h$h0.d != porterDuff$Mode0) {
            h$h0.d = porterDuff$Mode0;
            this.h = this.j(this.h, h$h0.c, porterDuff$Mode0);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        Drawable drawable0 = this.f;
        return drawable0 == null ? super.setVisible(z, z1) : drawable0.setVisible(z, z1);
    }

    @Override  // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.unscheduleSelf(runnable0);
            return;
        }
        super.unscheduleSelf(runnable0);
    }
}

