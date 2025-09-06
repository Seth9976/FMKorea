package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;
import androidx.appcompat.view.c;
import androidx.core.view.Y;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements c {
    static class SavedState extends AbsSavedState {
        class a implements Parcelable.ClassLoaderCreator {
            a() {
                super();
            }

            public SavedState a(Parcel parcel0) {
                return new SavedState(parcel0, null);
            }

            public SavedState b(Parcel parcel0, ClassLoader classLoader0) {
                return new SavedState(parcel0, classLoader0);
            }

            public SavedState[] c(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                return this.b(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.c(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        boolean h;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.h = ((Boolean)parcel0.readValue(null)).booleanValue();
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override
        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.h + "}";
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeValue(Boolean.valueOf(this.h));
        }
    }

    public static class SearchAutoComplete extends androidx.appcompat.widget.c {
        class androidx.appcompat.widget.SearchView.SearchAutoComplete.a implements Runnable {
            final SearchAutoComplete f;

            @Override
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        private int j;
        private SearchView k;
        private boolean l;
        final Runnable m;

        public SearchAutoComplete(Context context0, AttributeSet attributeSet0) {
            this(context0, attributeSet0, e.a.m);
        }

        public SearchAutoComplete(Context context0, AttributeSet attributeSet0, int v) {
            super(context0, attributeSet0, v);
            this.m = () -> if(SearchAutoComplete.this.l) {
                ((InputMethodManager)SearchAutoComplete.this.getContext().getSystemService("input_method")).showSoftInput(SearchAutoComplete.this, 0);
                SearchAutoComplete.this.l = false;
            };
            this.j = this.getThreshold();
        }

        void b() {
            if(Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if(this.enoughToFilter()) {
                    this.showDropDown();
                }
            }
            else {
                SearchView.t0.c(this);
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(this.getText()) == 0;
        }

        // 检测为 Lambda 实现
        void d() [...]

        @Override  // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.j <= 0 || super.enoughToFilter();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration0 = this.getResources().getConfiguration();
            int v = configuration0.screenWidthDp;
            int v1 = configuration0.screenHeightDp;
            if(v >= 960 && v1 >= 720 && configuration0.orientation == 2) {
                return 0x100;
            }
            return v >= 600 || v >= 640 && v1 >= 480 ? 0xC0 : 0xA0;
        }

        @Override  // androidx.appcompat.widget.c
        public InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
            InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
            if(this.l) {
                this.removeCallbacks(this.m);
                this.post(this.m);
            }
            return inputConnection0;
        }

        @Override  // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
            this.setMinWidth(((int)TypedValue.applyDimension(1, ((float)this.getSearchViewTextMinWidthDp()), displayMetrics0)));
        }

        @Override  // android.widget.AutoCompleteTextView
        protected void onFocusChanged(boolean z, int v, Rect rect0) {
            super.onFocusChanged(z, v, rect0);
            this.k.Z();
        }

        @Override  // android.widget.AutoCompleteTextView
        public boolean onKeyPreIme(int v, KeyEvent keyEvent0) {
            if(v == 4) {
                if(keyEvent0.getAction() == 0 && keyEvent0.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyEvent$DispatcherState0 = this.getKeyDispatcherState();
                    if(keyEvent$DispatcherState0 != null) {
                        keyEvent$DispatcherState0.startTracking(keyEvent0, this);
                    }
                    return true;
                }
                if(keyEvent0.getAction() == 1) {
                    KeyEvent.DispatcherState keyEvent$DispatcherState1 = this.getKeyDispatcherState();
                    if(keyEvent$DispatcherState1 != null) {
                        keyEvent$DispatcherState1.handleUpEvent(keyEvent0);
                    }
                    if(keyEvent0.isTracking() && !keyEvent0.isCanceled()) {
                        this.k.clearFocus();
                        this.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(v, keyEvent0);
        }

        @Override  // android.widget.AutoCompleteTextView
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if(z && this.k.hasFocus() && this.getVisibility() == 0) {
                this.l = true;
                if(SearchView.M(this.getContext())) {
                    this.b();
                }
            }
        }

        @Override  // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override  // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence0) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager0 = (InputMethodManager)this.getContext().getSystemService("input_method");
            if(!z) {
                this.l = false;
                this.removeCallbacks(this.m);
                inputMethodManager0.hideSoftInputFromWindow(this.getWindowToken(), 0);
                return;
            }
            if(inputMethodManager0.isActive(this)) {
                this.l = false;
                this.removeCallbacks(this.m);
                inputMethodManager0.showSoftInput(this, 0);
                return;
            }
            this.l = true;
        }

        void setSearchView(SearchView searchView0) {
            this.k = searchView0;
        }

        @Override  // android.widget.AutoCompleteTextView
        public void setThreshold(int v) {
            super.setThreshold(v);
            this.j = v;
        }
    }

    class androidx.appcompat.widget.SearchView.a implements TextWatcher {
        final SearchView f;

        @Override  // android.text.TextWatcher
        public void afterTextChanged(Editable editable0) {
        }

        @Override  // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        }

        @Override  // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            SearchView.this.Y(charSequence0);
        }
    }

    class b implements Runnable {
        final SearchView f;

        @Override
        public void run() {
            SearchView.this.f0();
        }
    }

    class androidx.appcompat.widget.SearchView.c implements Runnable {
        final SearchView f;

        @Override
        public void run() {
            G.a a0 = SearchView.this.U;
            if(a0 instanceof X) {
                a0.a(null);
            }
        }
    }

    class f implements View.OnClickListener {
        final SearchView f;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            SearchView searchView0 = SearchView.this;
            if(view0 == searchView0.y) {
                searchView0.V();
                return;
            }
            if(view0 == searchView0.A) {
                searchView0.R();
                return;
            }
            if(view0 == searchView0.z) {
                searchView0.W();
                return;
            }
            if(view0 == searchView0.B) {
                searchView0.a0();
                return;
            }
            if(view0 == searchView0.u) {
                searchView0.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        final SearchView f;

        @Override  // android.view.View$OnKeyListener
        public boolean onKey(View view0, int v, KeyEvent keyEvent0) {
            SearchView searchView0 = SearchView.this;
            if(searchView0.i0 == null) {
                return false;
            }
            if(searchView0.u.isPopupShowing() && SearchView.this.u.getListSelection() != -1) {
                return SearchView.this.X(view0, v, keyEvent0);
            }
            if(!SearchView.this.u.c() && keyEvent0.hasNoModifiers() && keyEvent0.getAction() == 1 && v == 66) {
                view0.cancelLongPress();
                String s = SearchView.this.u.getText().toString();
                SearchView.this.P(0, null, s);
                return true;
            }
            return false;
        }
    }

    class h implements TextView.OnEditorActionListener {
        final SearchView a;

        @Override  // android.widget.TextView$OnEditorActionListener
        public boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        final SearchView f;

        @Override  // android.widget.AdapterView$OnItemClickListener
        public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
            SearchView.this.S(v, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        final SearchView f;

        @Override  // android.widget.AdapterView$OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
            SearchView.this.T(v);
        }

        @Override  // android.widget.AdapterView$OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView0) {
        }
    }

    static abstract class k {
        static void a(AutoCompleteTextView autoCompleteTextView0) {
            autoCompleteTextView0.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchView$SearchAutoComplete0, int v) {
            searchView$SearchAutoComplete0.setInputMethodMode(v);
        }
    }

    public interface l {
    }

    public interface m {
        boolean a(String arg1);

        boolean b(String arg1);
    }

    public interface n {
    }

    static class o {
        private Method a;
        private Method b;
        private Method c;

        o() {
            Class class0 = AutoCompleteTextView.class;
            super();
            this.a = null;
            this.b = null;
            this.c = null;
            o.d();
            try {
                Method method0 = class0.getDeclaredMethod("doBeforeTextChanged", null);
                this.a = method0;
                method0.setAccessible(true);
            }
            catch(NoSuchMethodException unused_ex) {
            }
            try {
                Method method1 = class0.getDeclaredMethod("doAfterTextChanged", null);
                this.b = method1;
                method1.setAccessible(true);
            }
            catch(NoSuchMethodException unused_ex) {
            }
            try {
                Method method2 = class0.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method2;
                method2.setAccessible(true);
            }
            catch(NoSuchMethodException unused_ex) {
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView0) {
            o.d();
            Method method0 = this.b;
            if(method0 != null) {
                try {
                    method0.invoke(autoCompleteTextView0, null);
                }
                catch(Exception unused_ex) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView0) {
            o.d();
            Method method0 = this.a;
            if(method0 != null) {
                try {
                    method0.invoke(autoCompleteTextView0, null);
                }
                catch(Exception unused_ex) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView0) {
            o.d();
            Method method0 = this.c;
            if(method0 != null) {
                try {
                    method0.invoke(autoCompleteTextView0, Boolean.TRUE);
                }
                catch(Exception unused_ex) {
                }
            }
        }

        private static void d() {
            if(Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    static class p extends TouchDelegate {
        private final View a;
        private final Rect b;
        private final Rect c;
        private final Rect d;
        private final int e;
        private boolean f;

        public p(Rect rect0, Rect rect1, View view0) {
            super(rect0, view0);
            this.e = ViewConfiguration.get(view0.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            this.a(rect0, rect1);
            this.a = view0;
        }

        public void a(Rect rect0, Rect rect1) {
            this.b.set(rect0);
            this.d.set(rect0);
            this.d.inset(-this.e, -this.e);
            this.c.set(rect1);
        }

        @Override  // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent0) {
            boolean z2;
            boolean z1;
            int v = (int)motionEvent0.getX();
            int v1 = (int)motionEvent0.getY();
            int v2 = motionEvent0.getAction();
            boolean z = true;
            switch(v2) {
                case 0: {
                    if(this.b.contains(v, v1)) {
                        this.f = true;
                        z2 = true;
                    }
                    else {
                        z2 = true;
                        z = false;
                    }
                    break;
                }
                case 1: 
                case 2: {
                    z1 = this.f;
                    if(!z1 || this.d.contains(v, v1)) {
                        z = z1;
                        z2 = true;
                    }
                    else {
                        z2 = false;
                    }
                    break;
                }
                default: {
                    if(v2 == 3) {
                        z1 = this.f;
                        this.f = false;
                        z = z1;
                        z2 = true;
                    }
                    else {
                        z2 = true;
                        z = false;
                    }
                }
            }
            if(z) {
                if(z2 && !this.c.contains(v, v1)) {
                    motionEvent0.setLocation(((float)(this.a.getWidth() / 2)), ((float)(this.a.getHeight() / 2)));
                    return this.a.dispatchTouchEvent(motionEvent0);
                }
                motionEvent0.setLocation(((float)(v - this.c.left)), ((float)(v1 - this.c.top)));
                return this.a.dispatchTouchEvent(motionEvent0);
            }
            return false;
        }
    }

    final ImageView A;
    final ImageView B;
    private final View C;
    private p D;
    private Rect E;
    private Rect F;
    private int[] G;
    private int[] H;
    private final ImageView I;
    private final Drawable J;
    private final int K;
    private final int L;
    private final Intent M;
    private final Intent N;
    private final CharSequence O;
    private m P;
    View.OnFocusChangeListener Q;
    private View.OnClickListener R;
    private boolean S;
    private boolean T;
    G.a U;
    private boolean V;
    private CharSequence W;
    private boolean a0;
    private boolean b0;
    private int c0;
    private boolean d0;
    private CharSequence e0;
    private CharSequence f0;
    private boolean g0;
    private int h0;
    SearchableInfo i0;
    private Bundle j0;
    private final Runnable k0;
    private Runnable l0;
    private final WeakHashMap m0;
    private final View.OnClickListener n0;
    View.OnKeyListener o0;
    private final TextView.OnEditorActionListener p0;
    private final AdapterView.OnItemClickListener q0;
    private final AdapterView.OnItemSelectedListener r0;
    private TextWatcher s0;
    static final o t0;
    final SearchAutoComplete u;
    private final View v;
    private final View w;
    private final View x;
    final ImageView y;
    final ImageView z;

    static {
        SearchView.t0 = Build.VERSION.SDK_INT >= 29 ? null : new o();
    }

    public SearchView(Context context0) {
        this(context0, null);
    }

    public SearchView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, e.a.I);
    }

    public SearchView(Context context0, AttributeSet attributeSet0, int v) {
        class d implements View.OnFocusChangeListener {
            final SearchView a;

            @Override  // android.view.View$OnFocusChangeListener
            public void onFocusChange(View view0, boolean z) {
                SearchView searchView0 = SearchView.this;
                View.OnFocusChangeListener view$OnFocusChangeListener0 = searchView0.Q;
                if(view$OnFocusChangeListener0 != null) {
                    view$OnFocusChangeListener0.onFocusChange(searchView0, z);
                }
            }
        }


        class e implements View.OnLayoutChangeListener {
            final SearchView a;

            @Override  // android.view.View$OnLayoutChangeListener
            public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                SearchView.this.B();
            }
        }

        super(context0, attributeSet0, v);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new int[2];
        this.H = new int[2];
        this.k0 = () -> {
            int[] arr_v = SearchView.this.u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
            Drawable drawable0 = SearchView.this.w.getBackground();
            if(drawable0 != null) {
                drawable0.setState(arr_v);
            }
            Drawable drawable1 = SearchView.this.x.getBackground();
            if(drawable1 != null) {
                drawable1.setState(arr_v);
            }
            SearchView.this.invalidate();
        };
        this.l0 = new androidx.appcompat.widget.SearchView.c(this);
        this.m0 = new WeakHashMap();
        f searchView$f0 = new f(this);
        this.n0 = searchView$f0;
        this.o0 = new g(this);
        h searchView$h0 = new h(this);
        this.p0 = searchView$h0;
        i searchView$i0 = (/* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, int v, /* 缺少LAMBDA参数 */) -> {
            SearchView.this.Q(v, 0, null);
            SearchView.this.u.setImeVisibility(false);
            SearchView.this.G();
            return true;
        };
        this.q0 = searchView$i0;
        j searchView$j0 = new j(this);
        this.r0 = searchView$j0;
        this.s0 = new androidx.appcompat.widget.SearchView.a(this);
        c0 c00 = c0.v(context0, attributeSet0, e.j.n2, v, 0);
        Y.m0(this, context0, e.j.n2, attributeSet0, c00.r(), v, 0);
        LayoutInflater.from(context0).inflate(c00.n(e.j.x2, e.g.r), this, true);
        SearchAutoComplete searchView$SearchAutoComplete0 = (SearchAutoComplete)this.findViewById(e.f.D);
        this.u = searchView$SearchAutoComplete0;
        searchView$SearchAutoComplete0.setSearchView(this);
        this.v = this.findViewById(e.f.z);
        View view0 = this.findViewById(e.f.C);
        this.w = view0;
        View view1 = this.findViewById(e.f.J);
        this.x = view1;
        ImageView imageView0 = (ImageView)this.findViewById(e.f.x);
        this.y = imageView0;
        ImageView imageView1 = (ImageView)this.findViewById(e.f.A);
        this.z = imageView1;
        ImageView imageView2 = (ImageView)this.findViewById(e.f.y);
        this.A = imageView2;
        ImageView imageView3 = (ImageView)this.findViewById(e.f.E);
        this.B = imageView3;
        ImageView imageView4 = (ImageView)this.findViewById(e.f.B);
        this.I = imageView4;
        Y.s0(view0, c00.g(e.j.y2));
        Y.s0(view1, c00.g(e.j.C2));
        imageView0.setImageDrawable(c00.g(e.j.B2));
        imageView1.setImageDrawable(c00.g(e.j.v2));
        imageView2.setImageDrawable(c00.g(e.j.s2));
        imageView3.setImageDrawable(c00.g(e.j.E2));
        imageView4.setImageDrawable(c00.g(e.j.B2));
        this.J = c00.g(e.j.A2);
        h0.a(imageView0, this.getResources().getString(e.h.n));
        this.K = c00.n(e.j.D2, e.g.q);
        this.L = c00.n(e.j.t2, 0);
        imageView0.setOnClickListener(searchView$f0);
        imageView2.setOnClickListener(searchView$f0);
        imageView1.setOnClickListener(searchView$f0);
        imageView3.setOnClickListener(searchView$f0);
        searchView$SearchAutoComplete0.setOnClickListener(searchView$f0);
        searchView$SearchAutoComplete0.addTextChangedListener(this.s0);
        searchView$SearchAutoComplete0.setOnEditorActionListener(searchView$h0);
        searchView$SearchAutoComplete0.setOnItemClickListener(searchView$i0);
        searchView$SearchAutoComplete0.setOnItemSelectedListener(searchView$j0);
        searchView$SearchAutoComplete0.setOnKeyListener(this.o0);
        searchView$SearchAutoComplete0.setOnFocusChangeListener(new d(this));
        this.setIconifiedByDefault(c00.a(e.j.w2, true));
        int v1 = c00.f(e.j.p2, -1);
        if(v1 != -1) {
            this.setMaxWidth(v1);
        }
        this.O = c00.p(e.j.u2);
        this.W = c00.p(e.j.z2);
        int v2 = c00.k(e.j.r2, -1);
        if(v2 != -1) {
            this.setImeOptions(v2);
        }
        int v3 = c00.k(e.j.q2, -1);
        if(v3 != -1) {
            this.setInputType(v3);
        }
        this.setFocusable(c00.a(e.j.o2, true));
        c00.x();
        Intent intent0 = new Intent("android.speech.action.WEB_SEARCH");
        this.M = intent0;
        intent0.addFlags(0x10000000);
        intent0.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent1 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.N = intent1;
        intent1.addFlags(0x10000000);
        View view2 = this.findViewById(searchView$SearchAutoComplete0.getDropDownAnchor());
        this.C = view2;
        if(view2 != null) {
            view2.addOnLayoutChangeListener((/* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */) -> if(SearchView.this.C.getWidth() > 1) {
                Resources resources0 = SearchView.this.getContext().getResources();
                int v = SearchView.this.w.getPaddingLeft();
                Rect rect0 = new Rect();
                boolean z = n0.b(SearchView.this);
                int v1 = SearchView.this.S ? resources0.getDimensionPixelSize(e.d.c) + resources0.getDimensionPixelSize(e.d.d) : 0;
                SearchView.this.u.getDropDownBackground().getPadding(rect0);
                SearchView.this.u.setDropDownHorizontalOffset((z ? -rect0.left : v - (rect0.left + v1)));
                int v2 = SearchView.this.C.getWidth();
                SearchView.this.u.setDropDownWidth(v2 + rect0.left + rect0.right + v1 - v);
            });
        }
        this.k0(this.S);
        this.g0();
    }

    // 检测为 Lambda 实现
    void B() [...]

    private Intent C(String s, Uri uri0, String s1, String s2, int v, String s3) {
        Intent intent0 = new Intent(s);
        intent0.addFlags(0x10000000);
        if(uri0 != null) {
            intent0.setData(uri0);
        }
        intent0.putExtra("user_query", this.f0);
        if(s2 != null) {
            intent0.putExtra("query", s2);
        }
        if(s1 != null) {
            intent0.putExtra("intent_extra_data_key", s1);
        }
        Bundle bundle0 = this.j0;
        if(bundle0 != null) {
            intent0.putExtra("app_data", bundle0);
        }
        if(v != 0) {
            intent0.putExtra("action_key", v);
            intent0.putExtra("action_msg", s3);
        }
        intent0.setComponent(this.i0.getSearchActivity());
        return intent0;
    }

    private Intent D(Cursor cursor0, int v, String s) {
        int v1;
        try {
            String s1 = X.o(cursor0, "suggest_intent_action");
            if(s1 == null) {
                s1 = this.i0.getSuggestIntentAction();
            }
            if(s1 == null) {
                s1 = "android.intent.action.SEARCH";
            }
            String s2 = X.o(cursor0, "suggest_intent_data");
            if(s2 == null) {
                s2 = this.i0.getSuggestIntentData();
            }
            if(s2 != null) {
                String s3 = X.o(cursor0, "suggest_intent_data_id");
                if(s3 != null) {
                    s2 = s2 + "/" + Uri.encode(s3);
                }
            }
            Uri uri0 = s2 == null ? null : Uri.parse(s2);
            String s4 = X.o(cursor0, "suggest_intent_query");
            return this.C(s1, uri0, X.o(cursor0, "suggest_intent_extra_data"), s4, v, s);
        }
        catch(RuntimeException runtimeException0) {
        }
        try {
            v1 = -1;
            v1 = cursor0.getPosition();
        }
        catch(RuntimeException unused_ex) {
        }
        Log.w("SearchView", "Search suggestions cursor at row " + v1 + " returned exception.", runtimeException0);
        return null;
    }

    private Intent E(Intent intent0, SearchableInfo searchableInfo0) {
        ComponentName componentName0 = searchableInfo0.getSearchActivity();
        Intent intent1 = new Intent("android.intent.action.SEARCH");
        intent1.setComponent(componentName0);
        PendingIntent pendingIntent0 = PendingIntent.getActivity(this.getContext(), 0, intent1, 0x42000000);
        Bundle bundle0 = new Bundle();
        Bundle bundle1 = this.j0;
        if(bundle1 != null) {
            bundle0.putParcelable("app_data", bundle1);
        }
        Intent intent2 = new Intent(intent0);
        Resources resources0 = this.getResources();
        String s = searchableInfo0.getVoiceLanguageModeId() == 0 ? "free_form" : resources0.getString(searchableInfo0.getVoiceLanguageModeId());
        String s1 = null;
        String s2 = searchableInfo0.getVoicePromptTextId() == 0 ? null : resources0.getString(searchableInfo0.getVoicePromptTextId());
        String s3 = searchableInfo0.getVoiceLanguageId() == 0 ? null : resources0.getString(searchableInfo0.getVoiceLanguageId());
        int v = searchableInfo0.getVoiceMaxResults() == 0 ? 1 : searchableInfo0.getVoiceMaxResults();
        intent2.putExtra("android.speech.extra.LANGUAGE_MODEL", s);
        intent2.putExtra("android.speech.extra.PROMPT", s2);
        intent2.putExtra("android.speech.extra.LANGUAGE", s3);
        intent2.putExtra("android.speech.extra.MAX_RESULTS", v);
        if(componentName0 != null) {
            s1 = componentName0.flattenToShortString();
        }
        intent2.putExtra("calling_package", s1);
        intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", pendingIntent0);
        intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle0);
        return intent2;
    }

    private Intent F(Intent intent0, SearchableInfo searchableInfo0) {
        Intent intent1 = new Intent(intent0);
        ComponentName componentName0 = searchableInfo0.getSearchActivity();
        intent1.putExtra("calling_package", (componentName0 == null ? null : componentName0.flattenToShortString()));
        return intent1;
    }

    private void G() {
        this.u.dismissDropDown();
    }

    void H() {
        if(Build.VERSION.SDK_INT >= 29) {
            k.a(this.u);
            return;
        }
        SearchView.t0.b(this.u);
        SearchView.t0.a(this.u);
    }

    private void I(View view0, Rect rect0) {
        view0.getLocationInWindow(this.G);
        this.getLocationInWindow(this.H);
        int[] arr_v = this.G;
        int[] arr_v1 = this.H;
        int v = arr_v[1] - arr_v1[1];
        int v1 = arr_v[0] - arr_v1[0];
        rect0.set(v1, v, view0.getWidth() + v1, view0.getHeight() + v);
    }

    private CharSequence J(CharSequence charSequence0) {
        if(this.S && this.J != null) {
            int v = (int)(((double)this.u.getTextSize()) * 1.25);
            this.J.setBounds(0, 0, v, v);
            CharSequence charSequence1 = new SpannableStringBuilder("   ");
            ((SpannableStringBuilder)charSequence1).setSpan(new ImageSpan(this.J), 1, 2, 33);
            ((SpannableStringBuilder)charSequence1).append(charSequence0);
            return charSequence1;
        }
        return charSequence0;
    }

    private boolean K() {
        if(this.i0 != null && this.i0.getVoiceSearchEnabled()) {
            if(this.i0.getVoiceSearchLaunchWebSearch()) {
                return this.M != null && this.getContext().getPackageManager().resolveActivity(this.M, 0x10000) != null;
            }
            Intent intent0 = this.i0.getVoiceSearchLaunchRecognizer() ? this.N : null;
            return intent0 != null && this.getContext().getPackageManager().resolveActivity(intent0, 0x10000) != null;
        }
        return false;
    }

    public boolean L() {
        return this.T;
    }

    static boolean M(Context context0) {
        return context0.getResources().getConfiguration().orientation == 2;
    }

    // 去混淆评级： 低(30)
    private boolean N() {
        return (this.V || this.d0) && !this.L();
    }

    private void O(Intent intent0) {
        if(intent0 == null) {
            return;
        }
        try {
            this.getContext().startActivity(intent0);
        }
        catch(RuntimeException runtimeException0) {
            Log.e("SearchView", "Failed launch activity: " + intent0, runtimeException0);
        }
    }

    void P(int v, String s, String s1) {
        Intent intent0 = this.C("android.intent.action.SEARCH", null, null, s1, v, s);
        this.getContext().startActivity(intent0);
    }

    private boolean Q(int v, int v1, String s) {
        Cursor cursor0 = this.U.b();
        if(cursor0 != null && cursor0.moveToPosition(v)) {
            this.O(this.D(cursor0, v1, s));
            return true;
        }
        return false;
    }

    void R() {
        if(!TextUtils.isEmpty(this.u.getText())) {
            this.u.setText("");
            this.u.requestFocus();
            this.u.setImeVisibility(true);
        }
        else if(this.S) {
            this.clearFocus();
            this.k0(true);
        }
    }

    // 检测为 Lambda 实现
    boolean S(int v, int v1, String s) [...]

    boolean T(int v) {
        this.c0(v);
        return true;
    }

    protected void U(CharSequence charSequence0) {
        this.setQuery(charSequence0);
    }

    void V() {
        this.k0(false);
        this.u.requestFocus();
        this.u.setImeVisibility(true);
        View.OnClickListener view$OnClickListener0 = this.R;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(this);
        }
    }

    void W() {
        Editable editable0 = this.u.getText();
        if(editable0 != null && TextUtils.getTrimmedLength(editable0) > 0 && (this.P == null || !this.P.b(editable0.toString()))) {
            if(this.i0 != null) {
                this.P(0, null, editable0.toString());
            }
            this.u.setImeVisibility(false);
            this.G();
        }
    }

    boolean X(View view0, int v, KeyEvent keyEvent0) {
        if(this.i0 == null) {
            return false;
        }
        if(this.U == null) {
            return false;
        }
        if(keyEvent0.getAction() == 0 && keyEvent0.hasNoModifiers()) {
            switch(v) {
                case 19: {
                    this.u.getListSelection();
                    return false;
                }
                case 21: 
                case 22: {
                    int v1 = v == 21 ? 0 : this.u.length();
                    this.u.setSelection(v1);
                    this.u.setListSelection(0);
                    this.u.clearListSelection();
                    this.u.b();
                    return true;
                }
                case 61: 
                case 66: 
                case 84: {
                    return this.S(this.u.getListSelection(), 0, null);
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    void Y(CharSequence charSequence0) {
        Editable editable0 = this.u.getText();
        this.f0 = editable0;
        boolean z = TextUtils.isEmpty(editable0);
        this.j0(!z);
        this.l0(z);
        this.e0();
        this.i0();
        if(this.P != null && !TextUtils.equals(charSequence0, this.e0)) {
            this.P.a(charSequence0.toString());
        }
        this.e0 = charSequence0.toString();
    }

    void Z() {
        this.k0(this.L());
        this.b0();
        if(this.u.hasFocus()) {
            this.H();
        }
    }

    void a0() {
        try {
            SearchableInfo searchableInfo0 = this.i0;
            if(searchableInfo0 == null) {
                return;
            }
            if(searchableInfo0.getVoiceSearchLaunchWebSearch()) {
                Intent intent0 = this.F(this.M, searchableInfo0);
                this.getContext().startActivity(intent0);
                return;
            }
            if(searchableInfo0.getVoiceSearchLaunchRecognizer()) {
                Intent intent1 = this.E(this.N, searchableInfo0);
                this.getContext().startActivity(intent1);
            }
        }
        catch(ActivityNotFoundException unused_ex) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    private void b0() {
        this.post(this.k0);
    }

    @Override  // androidx.appcompat.view.c
    public void c() {
        if(this.g0) {
            return;
        }
        this.g0 = true;
        int v = this.u.getImeOptions();
        this.h0 = v;
        this.u.setImeOptions(v | 0x2000000);
        this.u.setText("");
        this.setIconified(false);
    }

    private void c0(int v) {
        Editable editable0 = this.u.getText();
        Cursor cursor0 = this.U.b();
        if(cursor0 == null) {
            return;
        }
        if(cursor0.moveToPosition(v)) {
            CharSequence charSequence0 = this.U.c(cursor0);
            if(charSequence0 != null) {
                this.setQuery(charSequence0);
                return;
            }
            this.setQuery(editable0);
            return;
        }
        this.setQuery(editable0);
    }

    @Override  // android.view.ViewGroup
    public void clearFocus() {
        this.b0 = true;
        super.clearFocus();
        this.u.clearFocus();
        this.u.setImeVisibility(false);
        this.b0 = false;
    }

    public void d0(CharSequence charSequence0, boolean z) {
        this.u.setText(charSequence0);
        if(charSequence0 != null) {
            int v = this.u.length();
            this.u.setSelection(v);
            this.f0 = charSequence0;
        }
        if(z && !TextUtils.isEmpty(charSequence0)) {
            this.W();
        }
    }

    private void e0() {
        boolean z = TextUtils.isEmpty(this.u.getText());
        int v = 0;
        ImageView imageView0 = this.A;
        if(z && (!this.S || this.g0)) {
            v = 8;
        }
        imageView0.setVisibility(v);
        Drawable drawable0 = this.A.getDrawable();
        if(drawable0 != null) {
            drawable0.setState((z ? ViewGroup.EMPTY_STATE_SET : ViewGroup.ENABLED_STATE_SET));
        }
    }

    @Override  // androidx.appcompat.view.c
    public void f() {
        this.d0("", false);
        this.clearFocus();
        this.k0(true);
        this.u.setImeOptions(this.h0);
        this.g0 = false;
    }

    // 检测为 Lambda 实现
    void f0() [...]

    private void g0() {
        CharSequence charSequence0 = this.getQueryHint();
        SearchAutoComplete searchView$SearchAutoComplete0 = this.u;
        if(charSequence0 == null) {
            charSequence0 = "";
        }
        searchView$SearchAutoComplete0.setHint(this.J(charSequence0));
    }

    public int getImeOptions() {
        return this.u.getImeOptions();
    }

    public int getInputType() {
        return this.u.getInputType();
    }

    public int getMaxWidth() {
        return this.c0;
    }

    private int getPreferredHeight() {
        return this.getContext().getResources().getDimensionPixelSize(e.d.e);
    }

    private int getPreferredWidth() {
        return this.getContext().getResources().getDimensionPixelSize(e.d.f);
    }

    public CharSequence getQuery() {
        return this.u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence0 = this.W;
        if(charSequence0 == null) {
            return this.i0 == null || this.i0.getHintId() == 0 ? this.O : this.getContext().getText(this.i0.getHintId());
        }
        return charSequence0;
    }

    int getSuggestionCommitIconResId() {
        return this.L;
    }

    int getSuggestionRowLayout() {
        return this.K;
    }

    public G.a getSuggestionsAdapter() {
        return this.U;
    }

    private void h0() {
        int v = this.i0.getSuggestThreshold();
        this.u.setThreshold(v);
        int v1 = this.i0.getImeOptions();
        this.u.setImeOptions(v1);
        int v2 = this.i0.getInputType();
        int v3 = 1;
        if((v2 & 15) == 1) {
            v2 &= 0xFFFEFFFF;
            if(this.i0.getSuggestAuthority() != null) {
                v2 |= 0x90000;
            }
        }
        this.u.setInputType(v2);
        G.a a0 = this.U;
        if(a0 != null) {
            a0.a(null);
        }
        if(this.i0.getSuggestAuthority() != null) {
            X x0 = new X(this.getContext(), this, this.i0, this.m0);
            this.U = x0;
            this.u.setAdapter(x0);
            X x1 = (X)this.U;
            if(this.a0) {
                v3 = 2;
            }
            x1.x(v3);
        }
    }

    private void i0() {
        int v = !this.N() || this.z.getVisibility() != 0 && this.B.getVisibility() != 0 ? 8 : 0;
        this.x.setVisibility(v);
    }

    private void j0(boolean z) {
        int v = !this.V || !this.N() || !this.hasFocus() || !z && this.d0 ? 8 : 0;
        this.z.setVisibility(v);
    }

    private void k0(boolean z) {
        this.T = z;
        int v = 8;
        boolean z1 = TextUtils.isEmpty(this.u.getText());
        this.y.setVisibility((z ? 0 : 8));
        this.j0(!z1);
        this.v.setVisibility((z ? 8 : 0));
        if(this.I.getDrawable() != null && !this.S) {
            v = 0;
        }
        this.I.setVisibility(v);
        this.e0();
        this.l0(z1);
        this.i0();
    }

    private void l0(boolean z) {
        int v = 8;
        if(this.d0 && !this.L() && z) {
            this.z.setVisibility(8);
            v = 0;
        }
        this.B.setVisibility(v);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.k0);
        this.post(this.l0);
        super.onDetachedFromWindow();
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(z) {
            this.I(this.u, this.E);
            this.F.set(this.E.left, 0, this.E.right, v3 - v1);
            p searchView$p0 = this.D;
            if(searchView$p0 == null) {
                p searchView$p1 = new p(this.F, this.E, this.u);
                this.D = searchView$p1;
                this.setTouchDelegate(searchView$p1);
                return;
            }
            searchView$p0.a(this.F, this.E);
        }
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    protected void onMeasure(int v, int v1) {
        if(this.L()) {
            super.onMeasure(v, v1);
            return;
        }
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getSize(v);
        switch(v2) {
            case 0x80000000: {
                int v4 = this.c0;
                v3 = v4 <= 0 ? Math.min(this.getPreferredWidth(), v3) : Math.min(v4, v3);
                break;
            }
            case 0: {
                v3 = this.c0;
                if(v3 <= 0) {
                    v3 = this.getPreferredWidth();
                }
                break;
            }
            case 0x40000000: {
                int v5 = this.c0;
                if(v5 > 0) {
                    v3 = Math.min(v5, v3);
                }
            }
        }
        int v6 = View.MeasureSpec.getMode(v1);
        int v7 = View.MeasureSpec.getSize(v1);
        switch(v6) {
            case 0x80000000: {
                v7 = Math.min(this.getPreferredHeight(), v7);
                break;
            }
            case 0: {
                v7 = this.getPreferredHeight();
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(v3, 0x40000000), View.MeasureSpec.makeMeasureSpec(v7, 0x40000000));
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.k0(((SavedState)parcelable0).h);
        this.requestLayout();
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.h = this.L();
        return parcelable0;
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.b0();
    }

    @Override  // android.view.ViewGroup
    public boolean requestFocus(int v, Rect rect0) {
        if(this.b0) {
            return false;
        }
        if(!this.isFocusable()) {
            return false;
        }
        if(!this.L()) {
            boolean z = this.u.requestFocus(v, rect0);
            if(z) {
                this.k0(false);
            }
            return z;
        }
        return super.requestFocus(v, rect0);
    }

    public void setAppSearchData(Bundle bundle0) {
        this.j0 = bundle0;
    }

    public void setIconified(boolean z) {
        if(z) {
            this.R();
            return;
        }
        this.V();
    }

    public void setIconifiedByDefault(boolean z) {
        if(this.S == z) {
            return;
        }
        this.S = z;
        this.k0(z);
        this.g0();
    }

    public void setImeOptions(int v) {
        this.u.setImeOptions(v);
    }

    public void setInputType(int v) {
        this.u.setInputType(v);
    }

    public void setMaxWidth(int v) {
        this.c0 = v;
        this.requestLayout();
    }

    public void setOnCloseListener(l searchView$l0) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener view$OnFocusChangeListener0) {
        this.Q = view$OnFocusChangeListener0;
    }

    public void setOnQueryTextListener(m searchView$m0) {
        this.P = searchView$m0;
    }

    public void setOnSearchClickListener(View.OnClickListener view$OnClickListener0) {
        this.R = view$OnClickListener0;
    }

    public void setOnSuggestionListener(n searchView$n0) {
    }

    private void setQuery(CharSequence charSequence0) {
        this.u.setText(charSequence0);
        int v = TextUtils.isEmpty(charSequence0) ? 0 : charSequence0.length();
        this.u.setSelection(v);
    }

    public void setQueryHint(CharSequence charSequence0) {
        this.W = charSequence0;
        this.g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.a0 = z;
        G.a a0 = this.U;
        if(a0 instanceof X) {
            ((X)a0).x((z ? 2 : 1));
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo0) {
        this.i0 = searchableInfo0;
        if(searchableInfo0 != null) {
            this.h0();
            this.g0();
        }
        boolean z = this.K();
        this.d0 = z;
        if(z) {
            this.u.setPrivateImeOptions("nm");
        }
        this.k0(this.L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.V = z;
        this.k0(this.L());
    }

    public void setSuggestionsAdapter(G.a a0) {
        this.U = a0;
        this.u.setAdapter(a0);
    }
}

