package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import s.e.b;
import s.e;
import s.f;
import s.h;
import s.l;

public class ConstraintLayout extends ViewGroup {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.f.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.h.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static class androidx.constraintlayout.widget.ConstraintLayout.b extends ViewGroup.MarginLayoutParams {
        static abstract class androidx.constraintlayout.widget.ConstraintLayout.b.a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray0 = new SparseIntArray();
                androidx.constraintlayout.widget.ConstraintLayout.b.a.a = sparseIntArray0;
                sparseIntArray0.append(i.l2, 8);
                sparseIntArray0.append(i.m2, 9);
                sparseIntArray0.append(i.o2, 10);
                sparseIntArray0.append(i.p2, 11);
                sparseIntArray0.append(i.v2, 12);
                sparseIntArray0.append(i.u2, 13);
                sparseIntArray0.append(i.T1, 14);
                sparseIntArray0.append(i.S1, 15);
                sparseIntArray0.append(i.Q1, 16);
                sparseIntArray0.append(i.U1, 2);
                sparseIntArray0.append(i.W1, 3);
                sparseIntArray0.append(i.V1, 4);
                sparseIntArray0.append(i.D2, 49);
                sparseIntArray0.append(i.E2, 50);
                sparseIntArray0.append(i.a2, 5);
                sparseIntArray0.append(i.b2, 6);
                sparseIntArray0.append(i.c2, 7);
                sparseIntArray0.append(i.b1, 1);
                sparseIntArray0.append(i.q2, 17);
                sparseIntArray0.append(i.r2, 18);
                sparseIntArray0.append(i.Z1, 19);
                sparseIntArray0.append(i.Y1, 20);
                sparseIntArray0.append(i.H2, 21);
                sparseIntArray0.append(i.K2, 22);
                sparseIntArray0.append(i.I2, 23);
                sparseIntArray0.append(i.F2, 24);
                sparseIntArray0.append(i.J2, 25);
                sparseIntArray0.append(i.G2, 26);
                sparseIntArray0.append(i.h2, 29);
                sparseIntArray0.append(i.w2, 30);
                sparseIntArray0.append(i.X1, 44);
                sparseIntArray0.append(i.j2, 45);
                sparseIntArray0.append(i.y2, 46);
                sparseIntArray0.append(i.i2, 0x2F);
                sparseIntArray0.append(i.x2, 0x30);
                sparseIntArray0.append(i.O1, 27);
                sparseIntArray0.append(i.N1, 28);
                sparseIntArray0.append(i.z2, 0x1F);
                sparseIntArray0.append(i.d2, 0x20);
                sparseIntArray0.append(i.B2, 33);
                sparseIntArray0.append(i.A2, 34);
                sparseIntArray0.append(i.C2, 35);
                sparseIntArray0.append(i.f2, 36);
                sparseIntArray0.append(i.e2, 37);
                sparseIntArray0.append(i.g2, 38);
                sparseIntArray0.append(i.k2, 39);
                sparseIntArray0.append(i.t2, 40);
                sparseIntArray0.append(i.n2, 41);
                sparseIntArray0.append(i.R1, 42);
                sparseIntArray0.append(i.P1, 43);
                sparseIntArray0.append(i.s2, 51);
            }
        }

        public float A;
        public String B;
        float C;
        int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        public String V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;
        public int a;
        boolean a0;
        public int b;
        boolean b0;
        public float c;
        boolean c0;
        public int d;
        int d0;
        public int e;
        int e0;
        public int f;
        int f0;
        public int g;
        int g0;
        public int h;
        int h0;
        public int i;
        int i0;
        public int j;
        float j0;
        public int k;
        int k0;
        public int l;
        int l0;
        public int m;
        float m0;
        public int n;
        e n0;
        public float o;
        public boolean o0;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public float z;

        public androidx.constraintlayout.widget.ConstraintLayout.b(int v, int v1) {
            super(v, v1);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new e();
            this.o0 = false;
        }

        public androidx.constraintlayout.widget.ConstraintLayout.b(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            int v21;
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new e();
            this.o0 = false;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, i.a1);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(androidx.constraintlayout.widget.ConstraintLayout.b.a.a.get(v2)) {
                    case 1: {
                        this.S = typedArray0.getInt(v2, this.S);
                        break;
                    }
                    case 2: {
                        int v3 = typedArray0.getResourceId(v2, this.m);
                        this.m = v3;
                        if(v3 == -1) {
                            this.m = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 3: {
                        this.n = typedArray0.getDimensionPixelSize(v2, this.n);
                        break;
                    }
                    case 4: {
                        float f = typedArray0.getFloat(v2, this.o) % 360.0f;
                        this.o = f;
                        if(f < 0.0f) {
                            this.o = (360.0f - f) % 360.0f;
                        }
                        break;
                    }
                    case 5: {
                        this.a = typedArray0.getDimensionPixelOffset(v2, this.a);
                        break;
                    }
                    case 6: {
                        this.b = typedArray0.getDimensionPixelOffset(v2, this.b);
                        break;
                    }
                    case 7: {
                        this.c = typedArray0.getFloat(v2, this.c);
                        break;
                    }
                    case 8: {
                        int v4 = typedArray0.getResourceId(v2, this.d);
                        this.d = v4;
                        if(v4 == -1) {
                            this.d = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 9: {
                        int v5 = typedArray0.getResourceId(v2, this.e);
                        this.e = v5;
                        if(v5 == -1) {
                            this.e = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 10: {
                        int v6 = typedArray0.getResourceId(v2, this.f);
                        this.f = v6;
                        if(v6 == -1) {
                            this.f = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 11: {
                        int v7 = typedArray0.getResourceId(v2, this.g);
                        this.g = v7;
                        if(v7 == -1) {
                            this.g = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 12: {
                        int v8 = typedArray0.getResourceId(v2, this.h);
                        this.h = v8;
                        if(v8 == -1) {
                            this.h = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 13: {
                        int v9 = typedArray0.getResourceId(v2, this.i);
                        this.i = v9;
                        if(v9 == -1) {
                            this.i = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 14: {
                        int v10 = typedArray0.getResourceId(v2, this.j);
                        this.j = v10;
                        if(v10 == -1) {
                            this.j = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 15: {
                        int v11 = typedArray0.getResourceId(v2, this.k);
                        this.k = v11;
                        if(v11 == -1) {
                            this.k = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 16: {
                        int v12 = typedArray0.getResourceId(v2, this.l);
                        this.l = v12;
                        if(v12 == -1) {
                            this.l = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 17: {
                        int v13 = typedArray0.getResourceId(v2, this.p);
                        this.p = v13;
                        if(v13 == -1) {
                            this.p = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 18: {
                        int v14 = typedArray0.getResourceId(v2, this.q);
                        this.q = v14;
                        if(v14 == -1) {
                            this.q = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 19: {
                        int v15 = typedArray0.getResourceId(v2, this.r);
                        this.r = v15;
                        if(v15 == -1) {
                            this.r = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 20: {
                        int v16 = typedArray0.getResourceId(v2, this.s);
                        this.s = v16;
                        if(v16 == -1) {
                            this.s = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 21: {
                        this.t = typedArray0.getDimensionPixelSize(v2, this.t);
                        break;
                    }
                    case 22: {
                        this.u = typedArray0.getDimensionPixelSize(v2, this.u);
                        break;
                    }
                    case 23: {
                        this.v = typedArray0.getDimensionPixelSize(v2, this.v);
                        break;
                    }
                    case 24: {
                        this.w = typedArray0.getDimensionPixelSize(v2, this.w);
                        break;
                    }
                    case 25: {
                        this.x = typedArray0.getDimensionPixelSize(v2, this.x);
                        break;
                    }
                    case 26: {
                        this.y = typedArray0.getDimensionPixelSize(v2, this.y);
                        break;
                    }
                    case 27: {
                        this.T = typedArray0.getBoolean(v2, this.T);
                        break;
                    }
                    case 28: {
                        this.U = typedArray0.getBoolean(v2, this.U);
                        break;
                    }
                    case 29: {
                        this.z = typedArray0.getFloat(v2, this.z);
                        break;
                    }
                    case 30: {
                        this.A = typedArray0.getFloat(v2, this.A);
                        break;
                    }
                    case 0x1F: {
                        int v17 = typedArray0.getInt(v2, 0);
                        this.I = v17;
                        if(v17 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    }
                    case 0x20: {
                        int v18 = typedArray0.getInt(v2, 0);
                        this.J = v18;
                        if(v18 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    }
                    case 33: {
                        try {
                            this.K = typedArray0.getDimensionPixelSize(v2, this.K);
                        }
                        catch(Exception unused_ex) {
                            if(typedArray0.getInt(v2, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                        break;
                    }
                    case 34: {
                        try {
                            this.M = typedArray0.getDimensionPixelSize(v2, this.M);
                        }
                        catch(Exception unused_ex) {
                            if(typedArray0.getInt(v2, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                        break;
                    }
                    case 35: {
                        this.O = Math.max(0.0f, typedArray0.getFloat(v2, this.O));
                        this.I = 2;
                        break;
                    }
                    case 36: {
                        try {
                            this.L = typedArray0.getDimensionPixelSize(v2, this.L);
                        }
                        catch(Exception unused_ex) {
                            if(typedArray0.getInt(v2, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                        break;
                    }
                    case 37: {
                        try {
                            this.N = typedArray0.getDimensionPixelSize(v2, this.N);
                        }
                        catch(Exception unused_ex) {
                            if(typedArray0.getInt(v2, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                        break;
                    }
                    case 38: {
                        this.P = Math.max(0.0f, typedArray0.getFloat(v2, this.P));
                        this.J = 2;
                        break;
                    }
                    case 44: {
                        String s = typedArray0.getString(v2);
                        this.B = s;
                        this.C = NaNf;
                        this.D = -1;
                        if(s != null) {
                            int v19 = s.length();
                            int v20 = this.B.indexOf(44);
                            if(v20 <= 0 || v20 >= v19 - 1) {
                                v21 = 0;
                            }
                            else {
                                String s1 = this.B.substring(0, v20);
                                if(s1.equalsIgnoreCase("W")) {
                                    this.D = 0;
                                }
                                else if(s1.equalsIgnoreCase("H")) {
                                    this.D = 1;
                                }
                                v21 = v20 + 1;
                            }
                            int v22 = this.B.indexOf(58);
                            if(v22 < 0 || v22 >= v19 - 1) {
                                String s4 = this.B.substring(v21);
                                if(s4.length() > 0) {
                                    try {
                                        this.C = Float.parseFloat(s4);
                                    }
                                    catch(NumberFormatException unused_ex) {
                                    }
                                }
                            }
                            else {
                                String s2 = this.B.substring(v21, v22);
                                String s3 = this.B.substring(v22 + 1);
                                if(s2.length() > 0 && s3.length() > 0) {
                                    try {
                                        float f1 = Float.parseFloat(s2);
                                        float f2 = Float.parseFloat(s3);
                                        if(f1 > 0.0f && f2 > 0.0f) {
                                            this.C = this.D == 1 ? Math.abs(f2 / f1) : Math.abs(f1 / f2);
                                        }
                                    }
                                    catch(NumberFormatException unused_ex) {
                                    }
                                }
                            }
                        }
                        break;
                    }
                    case 45: {
                        this.E = typedArray0.getFloat(v2, this.E);
                        break;
                    }
                    case 46: {
                        this.F = typedArray0.getFloat(v2, this.F);
                        break;
                    }
                    case 0x2F: {
                        this.G = typedArray0.getInt(v2, 0);
                        break;
                    }
                    case 0x30: {
                        this.H = typedArray0.getInt(v2, 0);
                        break;
                    }
                    case 49: {
                        this.Q = typedArray0.getDimensionPixelOffset(v2, this.Q);
                        break;
                    }
                    case 50: {
                        this.R = typedArray0.getDimensionPixelOffset(v2, this.R);
                        break;
                    }
                    case 51: {
                        this.V = typedArray0.getString(v2);
                    }
                }
            }
            typedArray0.recycle();
            this.a();
        }

        public androidx.constraintlayout.widget.ConstraintLayout.b(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new e();
            this.o0 = false;
        }

        public void a() {
            this.Z = false;
            this.W = true;
            this.X = true;
            int v = this.width;
            if(v == -2 && this.T) {
                this.W = false;
                if(this.I == 0) {
                    this.I = 1;
                }
            }
            int v1 = this.height;
            if(v1 == -2 && this.U) {
                this.X = false;
                if(this.J == 0) {
                    this.J = 1;
                }
            }
            if(v == -1 || v == 0) {
                this.W = false;
                if(v == 0 && this.I == 1) {
                    this.width = -2;
                    this.T = true;
                }
            }
            if(v1 == -1 || v1 == 0) {
                this.X = false;
                if(v1 == 0 && this.J == 1) {
                    this.height = -2;
                    this.U = true;
                }
            }
            if(this.c != -1.0f || this.a != -1 || this.b != -1) {
                this.Z = true;
                this.W = true;
                this.X = true;
                if(!(this.n0 instanceof h)) {
                    this.n0 = new h();
                }
                ((h)this.n0).R0(this.S);
            }
        }

        @Override  // android.view.ViewGroup$MarginLayoutParams
        public void resolveLayoutDirection(int v) {
            int v1 = this.leftMargin;
            int v2 = this.rightMargin;
            super.resolveLayoutDirection(v);
            boolean z = false;
            boolean z1 = 1 == this.getLayoutDirection();
            this.f0 = -1;
            this.g0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.h0 = this.t;
            this.i0 = this.v;
            float f = this.z;
            this.j0 = f;
            int v3 = this.a;
            this.k0 = v3;
            int v4 = this.b;
            this.l0 = v4;
            float f1 = this.c;
            this.m0 = f1;
            if(z1) {
                int v5 = this.p;
                if(v5 == -1) {
                    int v6 = this.q;
                    if(v6 != -1) {
                        this.g0 = v6;
                        z = true;
                    }
                }
                else {
                    this.f0 = v5;
                    z = true;
                }
                int v7 = this.r;
                if(v7 != -1) {
                    this.e0 = v7;
                    z = true;
                }
                int v8 = this.s;
                if(v8 != -1) {
                    this.d0 = v8;
                    z = true;
                }
                int v9 = this.x;
                if(v9 != -1) {
                    this.i0 = v9;
                }
                int v10 = this.y;
                if(v10 != -1) {
                    this.h0 = v10;
                }
                if(z) {
                    this.j0 = 1.0f - f;
                }
                if(this.Z && this.S == 1) {
                    if(f1 != -1.0f) {
                        this.m0 = 1.0f - f1;
                        this.k0 = -1;
                        this.l0 = -1;
                    }
                    else if(v3 != -1) {
                        this.l0 = v3;
                        this.k0 = -1;
                        this.m0 = -1.0f;
                    }
                    else if(v4 != -1) {
                        this.k0 = v4;
                        this.l0 = -1;
                        this.m0 = -1.0f;
                    }
                }
            }
            else {
                int v11 = this.p;
                if(v11 != -1) {
                    this.e0 = v11;
                }
                int v12 = this.q;
                if(v12 != -1) {
                    this.d0 = v12;
                }
                int v13 = this.r;
                if(v13 != -1) {
                    this.f0 = v13;
                }
                int v14 = this.s;
                if(v14 != -1) {
                    this.g0 = v14;
                }
                int v15 = this.x;
                if(v15 != -1) {
                    this.h0 = v15;
                }
                int v16 = this.y;
                if(v16 != -1) {
                    this.i0 = v16;
                }
            }
            if(this.r == -1 && this.s == -1 && this.q == -1 && this.p == -1) {
                int v17 = this.f;
                if(v17 == -1) {
                    int v18 = this.g;
                    if(v18 != -1) {
                        this.g0 = v18;
                        if(this.rightMargin <= 0 && v2 > 0) {
                            this.rightMargin = v2;
                        }
                    }
                }
                else {
                    this.f0 = v17;
                    if(this.rightMargin <= 0 && v2 > 0) {
                        this.rightMargin = v2;
                    }
                }
                int v19 = this.d;
                if(v19 == -1) {
                    int v20 = this.e;
                    if(v20 != -1) {
                        this.e0 = v20;
                        if(this.leftMargin <= 0 && v1 > 0) {
                            this.leftMargin = v1;
                        }
                    }
                }
                else {
                    this.d0 = v19;
                    if(this.leftMargin <= 0 && v1 > 0) {
                        this.leftMargin = v1;
                    }
                }
            }
        }
    }

    class c implements t.b.b {
        ConstraintLayout a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        final ConstraintLayout h;

        public c(ConstraintLayout constraintLayout1) {
            this.a = constraintLayout1;
        }

        @Override  // t.b$b
        public final void a() {
            int v = this.a.getChildCount();
            for(int v2 = 0; v2 < v; ++v2) {
                this.a.getChildAt(v2);
            }
            int v3 = this.a.g.size();
            if(v3 > 0) {
                for(int v1 = 0; v1 < v3; ++v1) {
                    ((androidx.constraintlayout.widget.c)this.a.g.get(v1)).j(this.a);
                }
            }
        }

        @Override  // t.b$b
        public final void b(e e0, t.b.a b$a0) {
            int v12;
            int v11;
            int v10;
            int v7;
            boolean z2;
            int v8;
            boolean z;
            int v4;
            if(e0 == null) {
                return;
            }
            if(e0.O() == 8 && !e0.W()) {
                b$a0.e = 0;
                b$a0.f = 0;
                b$a0.g = 0;
                return;
            }
            b e$b0 = b$a0.a;
            b e$b1 = b$a0.b;
            int v = b$a0.c;
            int v1 = b$a0.d;
            int v2 = this.b + this.c;
            int v3 = this.d;
            View view0 = (View)e0.q();
            int[] arr_v = a.a;
            switch(arr_v[e$b0.ordinal()]) {
                case 1: {
                    int v5 = View.MeasureSpec.makeMeasureSpec(v, 0x40000000);
                    e0.h[2] = v;
                    v4 = v5;
                    z = false;
                    break;
                }
                case 2: {
                    v4 = ViewGroup.getChildMeasureSpec(this.f, v3, -2);
                    e0.h[2] = -2;
                    z = true;
                    break;
                }
                case 3: {
                    v4 = ViewGroup.getChildMeasureSpec(this.f, v3 + e0.z(), -1);
                    e0.h[2] = -1;
                    z = false;
                    break;
                }
                case 4: {
                    v4 = ViewGroup.getChildMeasureSpec(this.f, v3, -2);
                    boolean z1 = e0.l == 1;
                    int[] arr_v1 = e0.h;
                    arr_v1[2] = 0;
                    if(!b$a0.j || z1 && (!z1 || arr_v1[3] == 0 || arr_v1[0] == e0.P())) {
                        z = true;
                    }
                    else {
                        v4 = View.MeasureSpec.makeMeasureSpec(e0.P(), 0x40000000);
                        z = false;
                    }
                    break;
                }
                default: {
                    v4 = 0;
                    z = false;
                }
            }
            int v6 = arr_v[e$b1.ordinal()];
            switch(v6) {
                case 1: {
                    v7 = View.MeasureSpec.makeMeasureSpec(v1, 0x40000000);
                    e0.h[3] = v1;
                    z2 = false;
                    break;
                }
                case 2: {
                    v8 = ViewGroup.getChildMeasureSpec(this.g, v2, -2);
                    e0.h[3] = -2;
                    v7 = v8;
                    z2 = true;
                    break;
                }
                case 3: {
                    int v9 = ViewGroup.getChildMeasureSpec(this.g, v2 + e0.N(), -1);
                    e0.h[3] = -1;
                    v7 = v9;
                    z2 = false;
                    break;
                }
                default: {
                    if(v6 == 4) {
                        v8 = ViewGroup.getChildMeasureSpec(this.g, v2, -2);
                        boolean z3 = e0.m == 1;
                        int[] arr_v2 = e0.h;
                        arr_v2[3] = 0;
                        if(!b$a0.j || z3 && (!z3 || arr_v2[2] == 0 || arr_v2[1] == e0.v())) {
                            v7 = v8;
                            z2 = true;
                        }
                        else {
                            v7 = View.MeasureSpec.makeMeasureSpec(e0.v(), 0x40000000);
                            z2 = false;
                        }
                    }
                    else {
                        z2 = false;
                        v7 = 0;
                    }
                }
            }
            boolean z4 = e$b1 == b.i || e$b1 == b.f;
            boolean z5 = e$b0 == b.i || e$b0 == b.f;
            boolean z6 = e$b0 == b.h && e0.Q > 0.0f;
            boolean z7 = e$b1 == b.h && e0.Q > 0.0f;
            androidx.constraintlayout.widget.ConstraintLayout.b constraintLayout$b0 = (androidx.constraintlayout.widget.ConstraintLayout.b)view0.getLayoutParams();
            if(b$a0.j || e$b0 != b.h || e0.l != 0 || e$b1 != b.h || e0.m != 0) {
                if(!(view0 instanceof j) || !(e0 instanceof l)) {
                    view0.measure(v4, v7);
                }
                else {
                    ((j)view0).n(((l)e0), v4, v7);
                }
                int v13 = view0.getMeasuredWidth();
                int v14 = view0.getMeasuredHeight();
                int v15 = view0.getBaseline();
                if(z) {
                    int[] arr_v3 = e0.h;
                    arr_v3[0] = v13;
                    arr_v3[2] = v14;
                }
                else {
                    int[] arr_v4 = e0.h;
                    arr_v4[0] = 0;
                    arr_v4[2] = 0;
                }
                if(z2) {
                    int[] arr_v5 = e0.h;
                    arr_v5[1] = v14;
                    arr_v5[3] = v13;
                }
                else {
                    int[] arr_v6 = e0.h;
                    arr_v6[1] = 0;
                    arr_v6[3] = 0;
                }
                int v16 = e0.o <= 0 ? v13 : Math.max(e0.o, v13);
                int v17 = e0.p;
                if(v17 > 0) {
                    v16 = Math.min(v17, v16);
                }
                int v18 = e0.r <= 0 ? v14 : Math.max(e0.r, v14);
                int v19 = e0.s;
                if(v19 > 0) {
                    v18 = Math.min(v19, v18);
                }
                if(z6 && z4) {
                    v16 = (int)(((float)v18) * e0.Q + 0.5f);
                }
                else if(z7 && z5) {
                    v18 = (int)(((float)v16) / e0.Q + 0.5f);
                }
                if(v13 != v16 || v14 != v18) {
                    if(v13 != v16) {
                        v4 = View.MeasureSpec.makeMeasureSpec(v16, 0x40000000);
                    }
                    if(v14 != v18) {
                        v7 = View.MeasureSpec.makeMeasureSpec(v18, 0x40000000);
                    }
                    view0.measure(v4, v7);
                    v10 = view0.getMeasuredWidth();
                    v11 = view0.getMeasuredHeight();
                    v12 = view0.getBaseline();
                }
                else {
                    v10 = v16;
                    v11 = v18;
                    v12 = v15;
                }
            }
            else {
                v10 = 0;
                v11 = 0;
                v12 = 0;
            }
            b$a0.i = v10 != b$a0.c || v11 != b$a0.d;
            boolean z8 = constraintLayout$b0.Y ? true : v12 != -1;
            if(z8 && v12 != -1 && e0.n() != v12) {
                b$a0.i = true;
            }
            b$a0.e = v10;
            b$a0.f = v11;
            b$a0.h = z8;
            b$a0.g = v12;
        }

        public void c(int v, int v1, int v2, int v3, int v4, int v5) {
            this.b = v2;
            this.c = v3;
            this.d = v4;
            this.e = v5;
            this.f = v;
            this.g = v1;
        }
    }

    private int A;
    private int B;
    SparseArray f;
    private ArrayList g;
    protected f h;
    private int i;
    private int j;
    private int k;
    private int l;
    protected boolean m;
    private int n;
    private androidx.constraintlayout.widget.e o;
    protected d p;
    private int q;
    private HashMap r;
    private int s;
    private int t;
    int u;
    int v;
    int w;
    int x;
    private SparseArray y;
    c z;

    public ConstraintLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new f();
        this.i = 0;
        this.j = 0;
        this.k = 0x7FFFFFFF;
        this.l = 0x7FFFFFFF;
        this.m = true;
        this.n = 0x107;
        this.o = null;
        this.p = null;
        this.q = -1;
        this.r = new HashMap();
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.y = new SparseArray();
        this.z = new c(this, this);
        this.A = 0;
        this.B = 0;
        this.j(attributeSet0, 0, 0);
    }

    public ConstraintLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new f();
        this.i = 0;
        this.j = 0;
        this.k = 0x7FFFFFFF;
        this.l = 0x7FFFFFFF;
        this.m = true;
        this.n = 0x107;
        this.o = null;
        this.p = null;
        this.q = -1;
        this.r = new HashMap();
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.y = new SparseArray();
        this.z = new c(this, this);
        this.A = 0;
        this.B = 0;
        this.j(attributeSet0, v, 0);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    protected void c(boolean z, View view0, e e0, androidx.constraintlayout.widget.ConstraintLayout.b constraintLayout$b0, SparseArray sparseArray0) {
        float f2;
        constraintLayout$b0.a();
        constraintLayout$b0.o0 = false;
        e0.D0(view0.getVisibility());
        if(constraintLayout$b0.b0) {
            e0.p0(true);
            e0.D0(8);
        }
        e0.c0(view0);
        if(view0 instanceof androidx.constraintlayout.widget.c) {
            ((androidx.constraintlayout.widget.c)view0).h(e0, this.h.a1());
        }
        if(constraintLayout$b0.Z) {
            int v = constraintLayout$b0.k0;
            int v1 = constraintLayout$b0.l0;
            float f = constraintLayout$b0.m0;
            if(f != -1.0f) {
                ((h)e0).Q0(f);
                return;
            }
            if(v != -1) {
                ((h)e0).O0(v);
                return;
            }
            if(v1 != -1) {
                ((h)e0).P0(v1);
            }
        }
        else {
            int v2 = constraintLayout$b0.d0;
            int v3 = constraintLayout$b0.e0;
            int v4 = constraintLayout$b0.f0;
            int v5 = constraintLayout$b0.g0;
            int v6 = constraintLayout$b0.h0;
            int v7 = constraintLayout$b0.i0;
            float f1 = constraintLayout$b0.j0;
            int v8 = constraintLayout$b0.m;
            if(v8 == -1) {
                if(v2 == -1) {
                    f2 = f1;
                    if(v3 != -1) {
                        Object object1 = sparseArray0.get(v3);
                        if(((e)object1) != null) {
                            e0.T(s.d.b.g, ((e)object1), s.d.b.i, constraintLayout$b0.leftMargin, v6);
                        }
                    }
                }
                else {
                    Object object0 = sparseArray0.get(v2);
                    if(((e)object0) == null) {
                        f2 = f1;
                    }
                    else {
                        f2 = f1;
                        e0.T(s.d.b.g, ((e)object0), s.d.b.g, constraintLayout$b0.leftMargin, v6);
                    }
                }
                if(v4 != -1) {
                    Object object2 = sparseArray0.get(v4);
                    if(((e)object2) != null) {
                        e0.T(s.d.b.i, ((e)object2), s.d.b.g, constraintLayout$b0.rightMargin, v7);
                    }
                }
                else if(v5 != -1) {
                    Object object3 = sparseArray0.get(v5);
                    if(((e)object3) != null) {
                        e0.T(s.d.b.i, ((e)object3), s.d.b.i, constraintLayout$b0.rightMargin, v7);
                    }
                }
                int v9 = constraintLayout$b0.h;
                if(v9 == -1) {
                    int v10 = constraintLayout$b0.i;
                    if(v10 != -1) {
                        Object object5 = sparseArray0.get(v10);
                        if(((e)object5) != null) {
                            e0.T(s.d.b.h, ((e)object5), s.d.b.j, constraintLayout$b0.topMargin, constraintLayout$b0.u);
                        }
                    }
                }
                else {
                    Object object4 = sparseArray0.get(v9);
                    if(((e)object4) != null) {
                        e0.T(s.d.b.h, ((e)object4), s.d.b.h, constraintLayout$b0.topMargin, constraintLayout$b0.u);
                    }
                }
                int v11 = constraintLayout$b0.j;
                if(v11 == -1) {
                    int v12 = constraintLayout$b0.k;
                    if(v12 != -1) {
                        Object object7 = sparseArray0.get(v12);
                        if(((e)object7) != null) {
                            e0.T(s.d.b.j, ((e)object7), s.d.b.j, constraintLayout$b0.bottomMargin, constraintLayout$b0.w);
                        }
                    }
                }
                else {
                    Object object6 = sparseArray0.get(v11);
                    if(((e)object6) != null) {
                        e0.T(s.d.b.j, ((e)object6), s.d.b.h, constraintLayout$b0.bottomMargin, constraintLayout$b0.w);
                    }
                }
                int v13 = constraintLayout$b0.l;
                if(v13 != -1) {
                    View view1 = (View)this.f.get(v13);
                    e e2 = (e)sparseArray0.get(constraintLayout$b0.l);
                    if(e2 != null && view1 != null && view1.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.b) {
                        androidx.constraintlayout.widget.ConstraintLayout.b constraintLayout$b1 = (androidx.constraintlayout.widget.ConstraintLayout.b)view1.getLayoutParams();
                        constraintLayout$b0.Y = true;
                        constraintLayout$b1.Y = true;
                        e0.m(s.d.b.k).b(e2.m(s.d.b.k), 0, -1, true);
                        e0.g0(true);
                        constraintLayout$b1.n0.g0(true);
                        e0.m(s.d.b.h).l();
                        e0.m(s.d.b.j).l();
                    }
                }
                if(f2 >= 0.0f) {
                    e0.i0(f2);
                }
                float f3 = constraintLayout$b0.A;
                if(f3 >= 0.0f) {
                    e0.x0(f3);
                }
            }
            else {
                e e1 = (e)sparseArray0.get(v8);
                if(e1 != null) {
                    e0.k(e1, constraintLayout$b0.o, constraintLayout$b0.n);
                }
            }
            if(z) {
                int v14 = constraintLayout$b0.Q;
                if(v14 != -1 || constraintLayout$b0.R != -1) {
                    e0.v0(v14, constraintLayout$b0.R);
                }
            }
            if(constraintLayout$b0.W) {
                e0.l0(b.f);
                e0.E0(constraintLayout$b0.width);
                if(constraintLayout$b0.width == -2) {
                    e0.l0(b.g);
                }
            }
            else if(constraintLayout$b0.width == -1) {
                if(constraintLayout$b0.T) {
                    e0.l0(b.h);
                }
                else {
                    e0.l0(b.i);
                }
                s.d d0 = e0.m(s.d.b.g);
                d0.e = constraintLayout$b0.leftMargin;
                s.d d1 = e0.m(s.d.b.i);
                d1.e = constraintLayout$b0.rightMargin;
            }
            else {
                e0.l0(b.h);
                e0.E0(0);
            }
            if(constraintLayout$b0.X) {
                e0.A0(b.f);
                e0.h0(constraintLayout$b0.height);
                if(constraintLayout$b0.height == -2) {
                    e0.A0(b.g);
                }
            }
            else if(constraintLayout$b0.height == -1) {
                if(constraintLayout$b0.U) {
                    e0.A0(b.h);
                }
                else {
                    e0.A0(b.i);
                }
                s.d d2 = e0.m(s.d.b.h);
                d2.e = constraintLayout$b0.topMargin;
                s.d d3 = e0.m(s.d.b.j);
                d3.e = constraintLayout$b0.bottomMargin;
            }
            else {
                e0.A0(b.h);
                e0.h0(0);
            }
            e0.e0(constraintLayout$b0.B);
            e0.n0(constraintLayout$b0.E);
            e0.C0(constraintLayout$b0.F);
            e0.j0(constraintLayout$b0.G);
            e0.y0(constraintLayout$b0.H);
            e0.m0(constraintLayout$b0.I, constraintLayout$b0.K, constraintLayout$b0.M, constraintLayout$b0.O);
            e0.B0(constraintLayout$b0.J, constraintLayout$b0.L, constraintLayout$b0.N, constraintLayout$b0.P);
        }
    }

    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof androidx.constraintlayout.widget.ConstraintLayout.b;
    }

    protected androidx.constraintlayout.widget.ConstraintLayout.b d() {
        return new androidx.constraintlayout.widget.ConstraintLayout.b(-2, -2);
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(Canvas canvas0) {
        ArrayList arrayList0 = this.g;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            if(v > 0) {
                for(int v1 = 0; v1 < v; ++v1) {
                    ((androidx.constraintlayout.widget.c)this.g.get(v1)).k(this);
                }
            }
        }
        super.dispatchDraw(canvas0);
        if(this.isInEditMode()) {
            int v2 = this.getChildCount();
            float f = (float)this.getWidth();
            float f1 = (float)this.getHeight();
            for(int v3 = 0; v3 < v2; ++v3) {
                View view0 = this.getChildAt(v3);
                if(view0.getVisibility() != 8) {
                    Object object0 = view0.getTag();
                    if(object0 != null && object0 instanceof String) {
                        String[] arr_s = ((String)object0).split(",");
                        if(arr_s.length == 4) {
                            int v4 = Integer.parseInt(arr_s[0]);
                            int v5 = Integer.parseInt(arr_s[1]);
                            int v6 = Integer.parseInt(arr_s[2]);
                            int v7 = (int)(((float)v4) / 1080.0f * f);
                            int v8 = (int)(((float)v5) / 1920.0f * f1);
                            int v9 = (int)(((float)Integer.parseInt(arr_s[3])) / 1920.0f * f1);
                            Paint paint0 = new Paint();
                            paint0.setColor(0xFFFF0000);
                            float f2 = (float)(v7 + ((int)(((float)v6) / 1080.0f * f)));
                            canvas0.drawLine(((float)v7), ((float)v8), f2, ((float)v8), paint0);
                            float f3 = (float)(v8 + v9);
                            canvas0.drawLine(f2, ((float)v8), f2, f3, paint0);
                            canvas0.drawLine(f2, f3, ((float)v7), f3, paint0);
                            canvas0.drawLine(((float)v7), f3, ((float)v7), ((float)v8), paint0);
                            paint0.setColor(0xFF00FF00);
                            canvas0.drawLine(((float)v7), ((float)v8), f2, f3, paint0);
                            canvas0.drawLine(((float)v7), f3, f2, ((float)v8), paint0);
                        }
                    }
                }
            }
        }
    }

    public androidx.constraintlayout.widget.ConstraintLayout.b e(AttributeSet attributeSet0) {
        return new androidx.constraintlayout.widget.ConstraintLayout.b(this.getContext(), attributeSet0);
    }

    // 去混淆评级： 低(20)
    public Object f(int v, Object object0) {
        return v != 0 || !(object0 instanceof String) || (this.r == null || !this.r.containsKey(((String)object0))) ? null : this.r.get(((String)object0));
    }

    @Override  // android.view.View
    public void forceLayout() {
        this.l();
        super.forceLayout();
    }

    private final e g(int v) {
        if(v == 0) {
            return this.h;
        }
        View view0 = (View)this.f.get(v);
        if(view0 == null) {
            view0 = this.findViewById(v);
            if(view0 != null && view0 != this && view0.getParent() == this) {
                this.onViewAdded(view0);
            }
        }
        if(view0 == this) {
            return this.h;
        }
        return view0 == null ? null : ((androidx.constraintlayout.widget.ConstraintLayout.b)view0.getLayoutParams()).n0;
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.d();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.e(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new androidx.constraintlayout.widget.ConstraintLayout.b(viewGroup$LayoutParams0);
    }

    public int getMaxHeight() {
        return this.l;
    }

    public int getMaxWidth() {
        return this.k;
    }

    public int getMinHeight() {
        return this.j;
    }

    public int getMinWidth() {
        return this.i;
    }

    public int getOptimizationLevel() {
        return this.h.V0();
    }

    private int getPaddingWidth() {
        int v = Math.max(0, this.getPaddingLeft()) + Math.max(0, this.getPaddingRight());
        int v1 = Math.max(0, this.getPaddingStart()) + Math.max(0, this.getPaddingEnd());
        return v1 <= 0 ? v : v1;
    }

    public View h(int v) {
        return (View)this.f.get(v);
    }

    public final e i(View view0) {
        if(view0 == this) {
            return this.h;
        }
        return view0 == null ? null : ((androidx.constraintlayout.widget.ConstraintLayout.b)view0.getLayoutParams()).n0;
    }

    private void j(AttributeSet attributeSet0, int v, int v1) {
        this.h.c0(this);
        this.h.f1(this.z);
        this.f.put(this.getId(), this);
        this.o = null;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, i.a1, v, v1);
            int v2 = typedArray0.getIndexCount();
            for(int v3 = 0; v3 < v2; ++v3) {
                int v4 = typedArray0.getIndex(v3);
                if(v4 == i.k1) {
                    this.i = typedArray0.getDimensionPixelOffset(v4, this.i);
                }
                else if(v4 == i.l1) {
                    this.j = typedArray0.getDimensionPixelOffset(v4, this.j);
                }
                else if(v4 == i.i1) {
                    this.k = typedArray0.getDimensionPixelOffset(v4, this.k);
                }
                else if(v4 == i.j1) {
                    this.l = typedArray0.getDimensionPixelOffset(v4, this.l);
                }
                else if(v4 == i.L2) {
                    this.n = typedArray0.getInt(v4, this.n);
                }
                else if(v4 == i.M1) {
                    int v5 = typedArray0.getResourceId(v4, 0);
                    if(v5 != 0) {
                        try {
                            this.m(v5);
                        }
                        catch(Resources.NotFoundException unused_ex) {
                            this.p = null;
                        }
                    }
                }
                else if(v4 == i.s1) {
                    int v6 = typedArray0.getResourceId(v4, 0);
                    try {
                        androidx.constraintlayout.widget.e e0 = new androidx.constraintlayout.widget.e();
                        this.o = e0;
                        e0.k(this.getContext(), v6);
                    }
                    catch(Resources.NotFoundException unused_ex) {
                        this.o = null;
                    }
                    this.q = v6;
                }
            }
            typedArray0.recycle();
        }
        this.h.g1(this.n);
    }

    protected boolean k() {
        return (this.getContext().getApplicationInfo().flags & 0x400000) != 0 && 1 == this.getLayoutDirection();
    }

    private void l() {
        this.m = true;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0;
        this.x = 0;
    }

    protected void m(int v) {
        this.p = new d(this.getContext(), this, v);
    }

    protected void n(int v, int v1, int v2, int v3, boolean z, boolean z1) {
        int v4 = v3 + this.z.e;
        int v5 = View.resolveSizeAndState(v2 + this.z.d, v, 0);
        int v6 = View.resolveSizeAndState(v4, v1, 0);
        int v7 = Math.min(this.k, v5 & 0xFFFFFF);
        int v8 = Math.min(this.l, v6 & 0xFFFFFF);
        if(z) {
            v7 |= 0x1000000;
        }
        if(z1) {
            v8 |= 0x1000000;
        }
        this.setMeasuredDimension(v7, v8);
        this.s = v7;
        this.t = v8;
    }

    protected void o(f f0, int v, int v1, int v2) {
        int v13;
        int v3 = View.MeasureSpec.getMode(v1);
        int v4 = View.MeasureSpec.getSize(v1);
        int v5 = View.MeasureSpec.getMode(v2);
        int v6 = View.MeasureSpec.getSize(v2);
        int v7 = Math.max(0, this.getPaddingTop());
        int v8 = Math.max(0, this.getPaddingBottom());
        int v9 = v7 + v8;
        int v10 = this.getPaddingWidth();
        this.z.c(v1, v2, v7, v8, v10, v9);
        int v11 = Math.max(0, this.getPaddingStart());
        int v12 = Math.max(0, this.getPaddingEnd());
        if(v11 > 0 || v12 > 0) {
            v13 = this.k() ? v12 : v11;
        }
        else {
            v13 = Math.max(0, this.getPaddingLeft());
        }
        int v14 = v4 - v10;
        int v15 = v6 - v9;
        this.r(f0, v3, v14, v5, v15);
        f0.c1(v, v3, v14, v5, v15, this.s, this.t, v13, v7);
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.getChildCount();
        boolean z1 = this.isInEditMode();
        for(int v6 = 0; v6 < v4; ++v6) {
            View view0 = this.getChildAt(v6);
            androidx.constraintlayout.widget.ConstraintLayout.b constraintLayout$b0 = (androidx.constraintlayout.widget.ConstraintLayout.b)view0.getLayoutParams();
            e e0 = constraintLayout$b0.n0;
            if((view0.getVisibility() != 8 || constraintLayout$b0.Z || constraintLayout$b0.a0 || constraintLayout$b0.c0 || z1) && !constraintLayout$b0.b0) {
                int v7 = e0.Q();
                int v8 = e0.R();
                view0.layout(v7, v8, e0.P() + v7, e0.v() + v8);
            }
        }
        int v9 = this.g.size();
        if(v9 > 0) {
            for(int v5 = 0; v5 < v9; ++v5) {
                ((androidx.constraintlayout.widget.c)this.g.get(v5)).i(this);
            }
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        this.A = v;
        this.B = v1;
        this.h.h1(this.k());
        if(this.m) {
            this.m = false;
            if(this.s()) {
                this.h.j1();
            }
        }
        this.o(this.h, this.n, v, v1);
        this.n(v, v1, this.h.P(), this.h.v(), this.h.b1(), this.h.Z0());
    }

    @Override  // android.view.ViewGroup
    public void onViewAdded(View view0) {
        super.onViewAdded(view0);
        if(view0 instanceof g && !(this.i(view0) instanceof h)) {
            androidx.constraintlayout.widget.ConstraintLayout.b constraintLayout$b0 = (androidx.constraintlayout.widget.ConstraintLayout.b)view0.getLayoutParams();
            h h0 = new h();
            constraintLayout$b0.n0 = h0;
            constraintLayout$b0.Z = true;
            h0.R0(constraintLayout$b0.S);
        }
        if(view0 instanceof androidx.constraintlayout.widget.c) {
            ((androidx.constraintlayout.widget.c)view0).m();
            ((androidx.constraintlayout.widget.ConstraintLayout.b)view0.getLayoutParams()).a0 = true;
            if(!this.g.contains(((androidx.constraintlayout.widget.c)view0))) {
                this.g.add(((androidx.constraintlayout.widget.c)view0));
            }
        }
        this.f.put(view0.getId(), view0);
        this.m = true;
    }

    @Override  // android.view.ViewGroup
    public void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        this.f.remove(view0.getId());
        e e0 = this.i(view0);
        this.h.L0(e0);
        this.g.remove(view0);
        this.m = true;
    }

    private void p() {
        boolean z = this.isInEditMode();
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            e e0 = this.i(this.getChildAt(v1));
            if(e0 != null) {
                e0.Y();
            }
        }
        if(z) {
            for(int v2 = 0; v2 < v; ++v2) {
                View view0 = this.getChildAt(v2);
                try {
                    String s = this.getResources().getResourceName(view0.getId());
                    this.q(0, s, view0.getId());
                    int v3 = s.indexOf(0x2F);
                    if(v3 != -1) {
                        s = s.substring(v3 + 1);
                    }
                    this.g(view0.getId()).d0(s);
                }
                catch(Resources.NotFoundException unused_ex) {
                }
            }
        }
        if(this.q != -1) {
            for(int v4 = 0; v4 < v; ++v4) {
                this.getChildAt(v4).getId();
            }
        }
        androidx.constraintlayout.widget.e e1 = this.o;
        if(e1 != null) {
            e1.d(this, true);
        }
        this.h.M0();
        int v5 = this.g.size();
        if(v5 > 0) {
            for(int v6 = 0; v6 < v5; ++v6) {
                ((androidx.constraintlayout.widget.c)this.g.get(v6)).l(this);
            }
        }
        for(int v7 = 0; v7 < v; ++v7) {
            this.getChildAt(v7);
        }
        this.y.clear();
        this.y.put(0, this.h);
        this.y.put(this.getId(), this.h);
        for(int v8 = 0; v8 < v; ++v8) {
            View view1 = this.getChildAt(v8);
            e e2 = this.i(view1);
            this.y.put(view1.getId(), e2);
        }
        for(int v9 = 0; v9 < v; ++v9) {
            View view2 = this.getChildAt(v9);
            e e3 = this.i(view2);
            if(e3 != null) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view2.getLayoutParams();
                this.h.a(e3);
                this.c(z, view2, e3, ((androidx.constraintlayout.widget.ConstraintLayout.b)viewGroup$LayoutParams0), this.y);
            }
        }
    }

    public void q(int v, Object object0, Object object1) {
        if(v == 0 && object0 instanceof String && object1 instanceof Integer) {
            if(this.r == null) {
                this.r = new HashMap();
            }
            String s = (String)object0;
            int v1 = s.indexOf("/");
            if(v1 != -1) {
                s = s.substring(v1 + 1);
            }
            ((Integer)object1).intValue();
            this.r.put(s, ((Integer)object1));
        }
    }

    protected void r(f f0, int v, int v1, int v2, int v3) {
        b e$b1;
        int v4 = this.z.e;
        int v5 = this.z.d;
        b e$b0 = b.f;
        int v6 = this.getChildCount();
        switch(v) {
            case 0x80000000: {
                e$b1 = b.g;
                if(v6 == 0) {
                    v1 = Math.max(0, this.i);
                }
                break;
            }
            case 0: {
                e$b1 = b.g;
                v1 = v6 == 0 ? Math.max(0, this.i) : 0;
                break;
            }
            case 0x40000000: {
                v1 = Math.min(this.k - v5, v1);
                e$b1 = e$b0;
                break;
            }
            default: {
                e$b1 = e$b0;
                v1 = 0;
            }
        }
        switch(v2) {
            case 0x80000000: {
                e$b0 = b.g;
                if(v6 == 0) {
                    v3 = Math.max(0, this.j);
                }
                break;
            }
            case 0: {
                e$b0 = b.g;
                v3 = v6 == 0 ? Math.max(0, this.j) : 0;
                break;
            }
            case 0x40000000: {
                v3 = Math.min(this.l - v4, v3);
                break;
            }
            default: {
                v3 = 0;
            }
        }
        if(v1 != f0.P() || v3 != f0.v()) {
            f0.Y0();
        }
        f0.F0(0);
        f0.G0(0);
        f0.s0(this.k - v5);
        f0.r0(this.l - v4);
        f0.u0(0);
        f0.t0(0);
        f0.l0(e$b1);
        f0.E0(v1);
        f0.A0(e$b0);
        f0.h0(v3);
        f0.u0(this.i - v5);
        f0.t0(this.j - v4);
    }

    @Override  // android.view.ViewGroup
    public void removeView(View view0) {
        super.removeView(view0);
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.l();
        super.requestLayout();
    }

    private boolean s() {
        int v = this.getChildCount();
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.getChildAt(v1).isLayoutRequested()) {
                z = true;
                break;
            }
        }
        if(z) {
            this.p();
        }
        return z;
    }

    public void setConstraintSet(androidx.constraintlayout.widget.e e0) {
        this.o = e0;
    }

    @Override  // android.view.View
    public void setId(int v) {
        this.f.remove(this.getId());
        super.setId(v);
        this.f.put(this.getId(), this);
    }

    public void setMaxHeight(int v) {
        if(v == this.l) {
            return;
        }
        this.l = v;
        this.requestLayout();
    }

    public void setMaxWidth(int v) {
        if(v == this.k) {
            return;
        }
        this.k = v;
        this.requestLayout();
    }

    public void setMinHeight(int v) {
        if(v == this.j) {
            return;
        }
        this.j = v;
        this.requestLayout();
    }

    public void setMinWidth(int v) {
        if(v == this.i) {
            return;
        }
        this.i = v;
        this.requestLayout();
    }

    public void setOnConstraintsChanged(androidx.constraintlayout.widget.f f0) {
    }

    public void setOptimizationLevel(int v) {
        this.n = v;
        this.h.g1(v);
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

