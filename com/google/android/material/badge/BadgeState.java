package com.google.android.material.badge;

import P1.d;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.q;
import java.util.Locale.Category;
import java.util.Locale;
import z1.c;
import z1.h;
import z1.i;
import z1.j;
import z1.k;

public final class BadgeState {
    public static final class State implements Parcelable {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            public State a(Parcel parcel0) {
                return new State(parcel0);
            }

            public State[] b(int v) {
                return new State[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        private Integer A;
        private Integer B;
        private Integer C;
        public static final Parcelable.Creator CREATOR;
        private Integer D;
        private Integer E;
        private Integer F;
        private Integer G;
        private Integer H;
        private Boolean I;
        private int f;
        private Integer g;
        private Integer h;
        private Integer i;
        private Integer j;
        private Integer k;
        private Integer l;
        private Integer m;
        private int n;
        private String o;
        private int p;
        private int q;
        private int r;
        private Locale s;
        private CharSequence t;
        private CharSequence u;
        private int v;
        private int w;
        private Integer x;
        private Boolean y;
        private Integer z;

        static {
            State.CREATOR = new a();
        }

        public State() {
            this.n = 0xFF;
            this.p = -2;
            this.q = -2;
            this.r = -2;
            this.y = Boolean.TRUE;
        }

        State(Parcel parcel0) {
            this.n = 0xFF;
            this.p = -2;
            this.q = -2;
            this.r = -2;
            this.y = Boolean.TRUE;
            this.f = parcel0.readInt();
            this.g = (Integer)parcel0.readSerializable();
            this.h = (Integer)parcel0.readSerializable();
            this.i = (Integer)parcel0.readSerializable();
            this.j = (Integer)parcel0.readSerializable();
            this.k = (Integer)parcel0.readSerializable();
            this.l = (Integer)parcel0.readSerializable();
            this.m = (Integer)parcel0.readSerializable();
            this.n = parcel0.readInt();
            this.o = parcel0.readString();
            this.p = parcel0.readInt();
            this.q = parcel0.readInt();
            this.r = parcel0.readInt();
            this.t = parcel0.readString();
            this.u = parcel0.readString();
            this.v = parcel0.readInt();
            this.x = (Integer)parcel0.readSerializable();
            this.z = (Integer)parcel0.readSerializable();
            this.A = (Integer)parcel0.readSerializable();
            this.B = (Integer)parcel0.readSerializable();
            this.C = (Integer)parcel0.readSerializable();
            this.D = (Integer)parcel0.readSerializable();
            this.E = (Integer)parcel0.readSerializable();
            this.H = (Integer)parcel0.readSerializable();
            this.F = (Integer)parcel0.readSerializable();
            this.G = (Integer)parcel0.readSerializable();
            this.y = (Boolean)parcel0.readSerializable();
            this.s = (Locale)parcel0.readSerializable();
            this.I = (Boolean)parcel0.readSerializable();
        }

        static int A(State badgeState$State0) {
            return badgeState$State0.p;
        }

        static Integer B(State badgeState$State0) {
            return badgeState$State0.A;
        }

        static Integer C(State badgeState$State0, Integer integer0) {
            badgeState$State0.A = integer0;
            return integer0;
        }

        static int D(State badgeState$State0, int v) {
            badgeState$State0.p = v;
            return v;
        }

        static Integer E(State badgeState$State0) {
            return badgeState$State0.B;
        }

        static Integer F(State badgeState$State0, Integer integer0) {
            badgeState$State0.B = integer0;
            return integer0;
        }

        static Integer G(State badgeState$State0) {
            return badgeState$State0.C;
        }

        static Integer H(State badgeState$State0, Integer integer0) {
            badgeState$State0.C = integer0;
            return integer0;
        }

        static Integer I(State badgeState$State0) {
            return badgeState$State0.D;
        }

        static Integer J(State badgeState$State0, Integer integer0) {
            badgeState$State0.D = integer0;
            return integer0;
        }

        static Integer K(State badgeState$State0) {
            return badgeState$State0.E;
        }

        static Integer L(State badgeState$State0, Integer integer0) {
            badgeState$State0.E = integer0;
            return integer0;
        }

        static Integer M(State badgeState$State0) {
            return badgeState$State0.H;
        }

        static Integer N(State badgeState$State0, Integer integer0) {
            badgeState$State0.H = integer0;
            return integer0;
        }

        static Integer O(State badgeState$State0) {
            return badgeState$State0.F;
        }

        static Integer P(State badgeState$State0, Integer integer0) {
            badgeState$State0.F = integer0;
            return integer0;
        }

        static Integer Q(State badgeState$State0) {
            return badgeState$State0.G;
        }

        static Integer R(State badgeState$State0, Integer integer0) {
            badgeState$State0.G = integer0;
            return integer0;
        }

        static Boolean S(State badgeState$State0) {
            return badgeState$State0.I;
        }

        static Boolean T(State badgeState$State0, Boolean boolean0) {
            badgeState$State0.I = boolean0;
            return boolean0;
        }

        static Locale U(State badgeState$State0) {
            return badgeState$State0.s;
        }

        static Locale V(State badgeState$State0, Locale locale0) {
            badgeState$State0.s = locale0;
            return locale0;
        }

        static String W(State badgeState$State0) {
            return badgeState$State0.o;
        }

        static String X(State badgeState$State0, String s) {
            badgeState$State0.o = s;
            return s;
        }

        static CharSequence Y(State badgeState$State0) {
            return badgeState$State0.t;
        }

        static CharSequence Z(State badgeState$State0, CharSequence charSequence0) {
            badgeState$State0.t = charSequence0;
            return charSequence0;
        }

        static int a(State badgeState$State0) {
            return badgeState$State0.f;
        }

        static CharSequence a0(State badgeState$State0) {
            return badgeState$State0.u;
        }

        static int b(State badgeState$State0, int v) {
            badgeState$State0.f = v;
            return v;
        }

        static CharSequence b0(State badgeState$State0, CharSequence charSequence0) {
            badgeState$State0.u = charSequence0;
            return charSequence0;
        }

        static int c(State badgeState$State0) {
            return badgeState$State0.n;
        }

        static int c0(State badgeState$State0) {
            return badgeState$State0.v;
        }

        static int d(State badgeState$State0) {
            return badgeState$State0.r;
        }

        static int d0(State badgeState$State0, int v) {
            badgeState$State0.v = v;
            return v;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        static int e(State badgeState$State0, int v) {
            badgeState$State0.r = v;
            return v;
        }

        static int e0(State badgeState$State0) {
            return badgeState$State0.w;
        }

        static int f(State badgeState$State0, int v) {
            badgeState$State0.n = v;
            return v;
        }

        static int f0(State badgeState$State0, int v) {
            badgeState$State0.w = v;
            return v;
        }

        static Integer g(State badgeState$State0) {
            return badgeState$State0.j;
        }

        static Boolean g0(State badgeState$State0) {
            return badgeState$State0.y;
        }

        static Integer h(State badgeState$State0, Integer integer0) {
            badgeState$State0.j = integer0;
            return integer0;
        }

        static Boolean h0(State badgeState$State0, Boolean boolean0) {
            badgeState$State0.y = boolean0;
            return boolean0;
        }

        static Integer i(State badgeState$State0) {
            return badgeState$State0.k;
        }

        static int i0(State badgeState$State0) {
            return badgeState$State0.q;
        }

        static Integer j(State badgeState$State0, Integer integer0) {
            badgeState$State0.k = integer0;
            return integer0;
        }

        static int j0(State badgeState$State0, int v) {
            badgeState$State0.q = v;
            return v;
        }

        static Integer k(State badgeState$State0) {
            return badgeState$State0.l;
        }

        static Integer l(State badgeState$State0, Integer integer0) {
            badgeState$State0.l = integer0;
            return integer0;
        }

        static Integer m(State badgeState$State0) {
            return badgeState$State0.m;
        }

        static Integer n(State badgeState$State0, Integer integer0) {
            badgeState$State0.m = integer0;
            return integer0;
        }

        static Integer o(State badgeState$State0) {
            return badgeState$State0.g;
        }

        static Integer p(State badgeState$State0, Integer integer0) {
            badgeState$State0.g = integer0;
            return integer0;
        }

        static Integer q(State badgeState$State0) {
            return badgeState$State0.i;
        }

        static Integer r(State badgeState$State0, Integer integer0) {
            badgeState$State0.i = integer0;
            return integer0;
        }

        static Integer s(State badgeState$State0) {
            return badgeState$State0.h;
        }

        static Integer u(State badgeState$State0, Integer integer0) {
            badgeState$State0.h = integer0;
            return integer0;
        }

        static Integer w(State badgeState$State0) {
            return badgeState$State0.x;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.f);
            parcel0.writeSerializable(this.g);
            parcel0.writeSerializable(this.h);
            parcel0.writeSerializable(this.i);
            parcel0.writeSerializable(this.j);
            parcel0.writeSerializable(this.k);
            parcel0.writeSerializable(this.l);
            parcel0.writeSerializable(this.m);
            parcel0.writeInt(this.n);
            parcel0.writeString(this.o);
            parcel0.writeInt(this.p);
            parcel0.writeInt(this.q);
            parcel0.writeInt(this.r);
            String s = null;
            parcel0.writeString((this.t == null ? null : this.t.toString()));
            CharSequence charSequence0 = this.u;
            if(charSequence0 != null) {
                s = charSequence0.toString();
            }
            parcel0.writeString(s);
            parcel0.writeInt(this.v);
            parcel0.writeSerializable(this.x);
            parcel0.writeSerializable(this.z);
            parcel0.writeSerializable(this.A);
            parcel0.writeSerializable(this.B);
            parcel0.writeSerializable(this.C);
            parcel0.writeSerializable(this.D);
            parcel0.writeSerializable(this.E);
            parcel0.writeSerializable(this.H);
            parcel0.writeSerializable(this.F);
            parcel0.writeSerializable(this.G);
            parcel0.writeSerializable(this.y);
            parcel0.writeSerializable(this.s);
            parcel0.writeSerializable(this.I);
        }

        static Integer x(State badgeState$State0, Integer integer0) {
            badgeState$State0.x = integer0;
            return integer0;
        }

        static Integer y(State badgeState$State0) {
            return badgeState$State0.z;
        }

        static Integer z(State badgeState$State0, Integer integer0) {
            badgeState$State0.z = integer0;
            return integer0;
        }
    }

    private final State a;
    private final State b;
    final float c;
    final float d;
    final float e;
    final float f;
    final float g;
    final float h;
    final int i;
    final int j;
    int k;

    BadgeState(Context context0, int v, int v1, int v2, State badgeState$State0) {
        int v6;
        int v4;
        State badgeState$State1 = new State();
        this.b = badgeState$State1;
        if(badgeState$State0 == null) {
            badgeState$State0 = new State();
        }
        if(v != 0) {
            State.b(badgeState$State0, v);
        }
        TypedArray typedArray0 = this.a(context0, State.a(badgeState$State0), v1, v2);
        Resources resources0 = context0.getResources();
        this.c = (float)typedArray0.getDimensionPixelSize(k.K, -1);
        this.i = context0.getResources().getDimensionPixelSize(c.W);
        this.j = context0.getResources().getDimensionPixelSize(c.Y);
        this.d = (float)typedArray0.getDimensionPixelSize(k.U, -1);
        float f = resources0.getDimension(c.s);
        this.e = typedArray0.getDimension(k.S, f);
        float f1 = resources0.getDimension(c.t);
        this.g = typedArray0.getDimension(k.X, f1);
        float f2 = resources0.getDimension(c.s);
        this.f = typedArray0.getDimension(k.J, f2);
        float f3 = resources0.getDimension(c.t);
        this.h = typedArray0.getDimension(k.T, f3);
        boolean z = true;
        this.k = typedArray0.getInt(k.e0, 1);
        State.f(badgeState$State1, (State.c(badgeState$State0) == -2 ? 0xFF : State.c(badgeState$State0)));
        if(State.A(badgeState$State0) != -2) {
            State.D(badgeState$State1, State.A(badgeState$State0));
        }
        else if(typedArray0.hasValue(k.d0)) {
            State.D(badgeState$State1, typedArray0.getInt(23, 0));
        }
        else {
            State.D(badgeState$State1, -1);
        }
        if(State.W(badgeState$State0) != null) {
            State.X(badgeState$State1, State.W(badgeState$State0));
        }
        else if(typedArray0.hasValue(k.N)) {
            State.X(badgeState$State1, typedArray0.getString(7));
        }
        State.Z(badgeState$State1, State.Y(badgeState$State0));
        CharSequence charSequence0 = State.a0(badgeState$State0) == null ? context0.getString(i.j) : State.a0(badgeState$State0);
        State.b0(badgeState$State1, charSequence0);
        State.d0(badgeState$State1, (State.c0(badgeState$State0) == 0 ? h.a : State.c0(badgeState$State0)));
        State.f0(badgeState$State1, (State.e0(badgeState$State0) == 0 ? i.o : State.e0(badgeState$State0)));
        if(State.g0(badgeState$State0) != null && !State.g0(badgeState$State0).booleanValue()) {
            z = false;
        }
        State.h0(badgeState$State1, Boolean.valueOf(z));
        State.j0(badgeState$State1, (State.i0(badgeState$State0) == -2 ? typedArray0.getInt(k.b0, -2) : State.i0(badgeState$State0)));
        State.e(badgeState$State1, (State.d(badgeState$State0) == -2 ? typedArray0.getInt(k.c0, -2) : State.d(badgeState$State0)));
        State.h(badgeState$State1, ((int)(State.g(badgeState$State0) == null ? typedArray0.getResourceId(k.L, j.b) : ((int)State.g(badgeState$State0)))));
        State.j(badgeState$State1, ((int)(State.i(badgeState$State0) == null ? typedArray0.getResourceId(k.M, 0) : ((int)State.i(badgeState$State0)))));
        State.l(badgeState$State1, ((int)(State.k(badgeState$State0) == null ? typedArray0.getResourceId(k.V, j.b) : ((int)State.k(badgeState$State0)))));
        State.n(badgeState$State1, ((int)(State.m(badgeState$State0) == null ? typedArray0.getResourceId(k.W, 0) : ((int)State.m(badgeState$State0)))));
        State.p(badgeState$State1, ((int)(State.o(badgeState$State0) == null ? BadgeState.H(context0, typedArray0, k.H) : ((int)State.o(badgeState$State0)))));
        State.r(badgeState$State1, ((int)(State.q(badgeState$State0) == null ? typedArray0.getResourceId(k.O, j.d) : ((int)State.q(badgeState$State0)))));
        if(State.s(badgeState$State0) != null) {
            State.u(badgeState$State1, State.s(badgeState$State0));
        }
        else if(typedArray0.hasValue(k.P)) {
            State.u(badgeState$State1, BadgeState.H(context0, typedArray0, 9));
        }
        else {
            State.u(badgeState$State1, new d(context0, ((int)State.q(badgeState$State1))).i().getDefaultColor());
        }
        State.x(badgeState$State1, ((int)(State.w(badgeState$State0) == null ? typedArray0.getInt(k.I, 0x800035) : ((int)State.w(badgeState$State0)))));
        if(State.y(badgeState$State0) == null) {
            int v3 = resources0.getDimensionPixelSize(c.X);
            v4 = typedArray0.getDimensionPixelSize(k.R, v3);
        }
        else {
            v4 = (int)State.y(badgeState$State0);
        }
        State.z(badgeState$State1, v4);
        if(State.B(badgeState$State0) == null) {
            int v5 = resources0.getDimensionPixelSize(c.u);
            v6 = typedArray0.getDimensionPixelSize(k.Q, v5);
        }
        else {
            v6 = (int)State.B(badgeState$State0);
        }
        State.C(badgeState$State1, v6);
        State.F(badgeState$State1, ((int)(State.E(badgeState$State0) == null ? typedArray0.getDimensionPixelOffset(k.Y, 0) : ((int)State.E(badgeState$State0)))));
        State.H(badgeState$State1, ((int)(State.G(badgeState$State0) == null ? typedArray0.getDimensionPixelOffset(k.f0, 0) : ((int)State.G(badgeState$State0)))));
        State.J(badgeState$State1, ((int)(State.I(badgeState$State0) == null ? typedArray0.getDimensionPixelOffset(k.Z, ((int)State.E(badgeState$State1))) : ((int)State.I(badgeState$State0)))));
        State.L(badgeState$State1, ((int)(State.K(badgeState$State0) == null ? typedArray0.getDimensionPixelOffset(k.g0, ((int)State.G(badgeState$State1))) : ((int)State.K(badgeState$State0)))));
        State.N(badgeState$State1, ((int)(State.M(badgeState$State0) == null ? typedArray0.getDimensionPixelOffset(k.a0, 0) : ((int)State.M(badgeState$State0)))));
        State.P(badgeState$State1, ((int)(State.O(badgeState$State0) == null ? 0 : ((int)State.O(badgeState$State0)))));
        State.R(badgeState$State1, ((int)(State.Q(badgeState$State0) == null ? 0 : ((int)State.Q(badgeState$State0)))));
        State.T(badgeState$State1, Boolean.valueOf((State.S(badgeState$State0) == null ? typedArray0.getBoolean(k.G, false) : State.S(badgeState$State0).booleanValue())));
        typedArray0.recycle();
        if(State.U(badgeState$State0) == null) {
            State.V(badgeState$State1, (Build.VERSION.SDK_INT < 24 ? Locale.getDefault() : Locale.getDefault(Locale.Category.FORMAT)));
        }
        else {
            State.V(badgeState$State1, State.U(badgeState$State0));
        }
        this.a = badgeState$State0;
    }

    int A() {
        return (int)State.q(this.b);
    }

    int B() {
        return (int)State.K(this.b);
    }

    int C() {
        return (int)State.G(this.b);
    }

    boolean D() {
        return State.A(this.b) != -1;
    }

    boolean E() {
        return State.W(this.b) != null;
    }

    boolean F() {
        return State.S(this.b).booleanValue();
    }

    boolean G() {
        return State.g0(this.b).booleanValue();
    }

    private static int H(Context context0, TypedArray typedArray0, int v) {
        return P1.c.a(context0, typedArray0, v).getDefaultColor();
    }

    void I(int v) {
        State.f(this.a, v);
        State.f(this.b, v);
    }

    private TypedArray a(Context context0, int v, int v1, int v2) {
        if(v != 0) {
            AttributeSet attributeSet0 = com.google.android.material.drawable.d.i(context0, v, "badge");
            int v3 = attributeSet0.getStyleAttribute();
            return v3 == 0 ? q.i(context0, attributeSet0, k.F, v1, v2, new int[0]) : q.i(context0, attributeSet0, k.F, v1, v3, new int[0]);
        }
        return q.i(context0, null, k.F, v1, v2, new int[0]);
    }

    int b() {
        return (int)State.O(this.b);
    }

    int c() {
        return (int)State.Q(this.b);
    }

    int d() {
        return State.c(this.b);
    }

    int e() {
        return (int)State.o(this.b);
    }

    int f() {
        return (int)State.w(this.b);
    }

    int g() {
        return (int)State.y(this.b);
    }

    int h() {
        return (int)State.i(this.b);
    }

    int i() {
        return (int)State.g(this.b);
    }

    int j() {
        return (int)State.s(this.b);
    }

    int k() {
        return (int)State.B(this.b);
    }

    int l() {
        return (int)State.m(this.b);
    }

    int m() {
        return (int)State.k(this.b);
    }

    int n() {
        return State.e0(this.b);
    }

    CharSequence o() {
        return State.Y(this.b);
    }

    CharSequence p() {
        return State.a0(this.b);
    }

    int q() {
        return State.c0(this.b);
    }

    int r() {
        return (int)State.I(this.b);
    }

    int s() {
        return (int)State.E(this.b);
    }

    int t() {
        return (int)State.M(this.b);
    }

    int u() {
        return State.i0(this.b);
    }

    int v() {
        return State.d(this.b);
    }

    int w() {
        return State.A(this.b);
    }

    Locale x() {
        return State.U(this.b);
    }

    State y() {
        return this.a;
    }

    String z() {
        return State.W(this.b);
    }
}

