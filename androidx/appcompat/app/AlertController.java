package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.core.view.Y;
import androidx.core.widget.NestedScrollView;
import e.f;
import e.j;
import java.lang.ref.WeakReference;

class AlertController {
    public static class RecycleListView extends ListView {
        private final int f;
        private final int g;

        public RecycleListView(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, j.k2);
            this.g = typedArray0.getDimensionPixelOffset(j.l2, -1);
            this.f = typedArray0.getDimensionPixelOffset(j.m2, -1);
        }

        // 去混淆评级： 低(20)
        public void a(boolean z, boolean z1) {
            if(!z1 || !z) {
                this.setPadding(this.getPaddingLeft(), (z ? this.getPaddingTop() : this.f), this.getPaddingRight(), (z1 ? this.getPaddingBottom() : this.g));
            }
        }
    }

    class a implements View.OnClickListener {
        final AlertController f;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            Message message1;
            AlertController alertController0 = AlertController.this;
            if(view0 == alertController0.o) {
                Message message0 = alertController0.q;
                if(message0 != null) {
                    message1 = Message.obtain(message0);
                    goto label_19;
                }
                goto label_6;
            }
            else {
            label_6:
                if(view0 == alertController0.s) {
                    Message message2 = alertController0.u;
                    if(message2 != null) {
                        message1 = Message.obtain(message2);
                        goto label_19;
                    }
                    goto label_11;
                }
                else {
                label_11:
                    if(view0 == alertController0.w) {
                        Message message3 = alertController0.y;
                        message1 = message3 == null ? null : Message.obtain(message3);
                    }
                    else {
                        message1 = null;
                    }
                }
            }
        label_19:
            if(message1 != null) {
                message1.sendToTarget();
            }
            AlertController.this.R.obtainMessage(1, AlertController.this.b).sendToTarget();
        }
    }

    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public boolean O;
        public final Context a;
        public final LayoutInflater b;
        public int c;
        public Drawable d;
        public int e;
        public CharSequence f;
        public View g;
        public CharSequence h;
        public CharSequence i;
        public Drawable j;
        public DialogInterface.OnClickListener k;
        public CharSequence l;
        public Drawable m;
        public DialogInterface.OnClickListener n;
        public CharSequence o;
        public Drawable p;
        public DialogInterface.OnClickListener q;
        public boolean r;
        public DialogInterface.OnCancelListener s;
        public DialogInterface.OnDismissListener t;
        public DialogInterface.OnKeyListener u;
        public CharSequence[] v;
        public ListAdapter w;
        public DialogInterface.OnClickListener x;
        public int y;
        public View z;

        public b(Context context0) {
            this.c = 0;
            this.e = 0;
            this.E = false;
            this.I = -1;
            this.O = true;
            this.a = context0;
            this.r = true;
            this.b = (LayoutInflater)context0.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController0) {
            View view0 = this.g;
            if(view0 == null) {
                CharSequence charSequence0 = this.f;
                if(charSequence0 != null) {
                    alertController0.p(charSequence0);
                }
                Drawable drawable0 = this.d;
                if(drawable0 != null) {
                    alertController0.m(drawable0);
                }
                int v = this.c;
                if(v != 0) {
                    alertController0.l(v);
                }
                int v1 = this.e;
                if(v1 != 0) {
                    alertController0.l(alertController0.c(v1));
                }
            }
            else {
                alertController0.k(view0);
            }
            CharSequence charSequence1 = this.h;
            if(charSequence1 != null) {
                alertController0.n(charSequence1);
            }
            CharSequence charSequence2 = this.i;
            if(charSequence2 != null || this.j != null) {
                alertController0.j(-1, charSequence2, this.k, null, this.j);
            }
            CharSequence charSequence3 = this.l;
            if(charSequence3 != null || this.m != null) {
                alertController0.j(-2, charSequence3, this.n, null, this.m);
            }
            CharSequence charSequence4 = this.o;
            if(charSequence4 != null || this.p != null) {
                alertController0.j(-3, charSequence4, this.q, null, this.p);
            }
            if(this.v != null || this.K != null || this.w != null) {
                this.b(alertController0);
            }
            View view1 = this.z;
            if(view1 != null) {
                if(this.E) {
                    alertController0.s(view1, this.A, this.B, this.C, this.D);
                    return;
                }
                alertController0.r(view1);
                return;
            }
            int v2 = this.y;
            if(v2 != 0) {
                alertController0.q(v2);
            }
        }

        private void b(AlertController alertController0) {
            class androidx.appcompat.app.AlertController.b.a extends ArrayAdapter {
                final RecycleListView f;
                final b g;

                androidx.appcompat.app.AlertController.b.a(Context context0, int v, int v1, CharSequence[] arr_charSequence, RecycleListView alertController$RecycleListView0) {
                    this.f = alertController$RecycleListView0;
                    super(context0, v, v1, arr_charSequence);
                }

                @Override  // android.widget.ArrayAdapter
                public View getView(int v, View view0, ViewGroup viewGroup0) {
                    View view1 = super.getView(v, view0, viewGroup0);
                    boolean[] arr_z = b.this.F;
                    if(arr_z != null && arr_z[v]) {
                        this.f.setItemChecked(v, true);
                    }
                    return view1;
                }
            }


            class androidx.appcompat.app.AlertController.b.b extends CursorAdapter {
                private final int f;
                private final int g;
                final RecycleListView h;
                final AlertController i;
                final b j;

                androidx.appcompat.app.AlertController.b.b(Context context0, Cursor cursor0, boolean z, RecycleListView alertController$RecycleListView0, AlertController alertController0) {
                    this.h = alertController$RecycleListView0;
                    this.i = alertController0;
                    super(context0, cursor0, z);
                    Cursor cursor1 = this.getCursor();
                    this.f = cursor1.getColumnIndexOrThrow(alertController$b0.L);
                    this.g = cursor1.getColumnIndexOrThrow(alertController$b0.M);
                }

                @Override  // android.widget.CursorAdapter
                public void bindView(View view0, Context context0, Cursor cursor0) {
                    ((CheckedTextView)view0.findViewById(0x1020014)).setText(cursor0.getString(this.f));
                    int v = cursor0.getPosition();
                    boolean z = cursor0.getInt(this.g) == 1;
                    this.h.setItemChecked(v, z);
                }

                @Override  // android.widget.CursorAdapter
                public View newView(Context context0, Cursor cursor0, ViewGroup viewGroup0) {
                    return b.this.b.inflate(this.i.M, viewGroup0, false);
                }
            }


            class c implements AdapterView.OnItemClickListener {
                final AlertController f;
                final b g;

                c(AlertController alertController0) {
                    this.f = alertController0;
                    super();
                }

                @Override  // android.widget.AdapterView$OnItemClickListener
                public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
                    b.this.x.onClick(this.f.b, v);
                    if(!b.this.H) {
                        this.f.b.dismiss();
                    }
                }
            }


            class d implements AdapterView.OnItemClickListener {
                final RecycleListView f;
                final AlertController g;
                final b h;

                d(RecycleListView alertController$RecycleListView0, AlertController alertController0) {
                    this.f = alertController$RecycleListView0;
                    this.g = alertController0;
                    super();
                }

                @Override  // android.widget.AdapterView$OnItemClickListener
                public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
                    boolean[] arr_z = b.this.F;
                    if(arr_z != null) {
                        arr_z[v] = this.f.isItemChecked(v);
                    }
                    DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0 = b.this.J;
                    boolean z = this.f.isItemChecked(v);
                    dialogInterface$OnMultiChoiceClickListener0.onClick(this.g.b, v, z);
                }
            }

            ListAdapter listAdapter0;
            RecycleListView alertController$RecycleListView0 = (RecycleListView)this.b.inflate(alertController0.L, null);
            if(!this.G) {
                int v = this.H ? alertController0.N : alertController0.O;
                if(this.K == null) {
                    listAdapter0 = this.w;
                    if(listAdapter0 == null) {
                        listAdapter0 = new androidx.appcompat.app.AlertController.d(this.a, v, 0x1020014, this.v);
                    }
                }
                else {
                    listAdapter0 = new SimpleCursorAdapter(this.a, v, this.K, new String[]{this.L}, new int[]{0x1020014});
                }
            }
            else if(this.K == null) {
                listAdapter0 = new androidx.appcompat.app.AlertController.b.a(this, this.a, alertController0.M, 0x1020014, this.v, alertController$RecycleListView0);
            }
            else {
                listAdapter0 = new androidx.appcompat.app.AlertController.b.b(this, this.a, this.K, false, alertController$RecycleListView0, alertController0);
            }
            alertController0.H = listAdapter0;
            alertController0.I = this.I;
            if(this.x != null) {
                alertController$RecycleListView0.setOnItemClickListener(new c(this, alertController0));
            }
            else if(this.J != null) {
                alertController$RecycleListView0.setOnItemClickListener(new d(this, alertController$RecycleListView0, alertController0));
            }
            AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0 = this.N;
            if(adapterView$OnItemSelectedListener0 != null) {
                alertController$RecycleListView0.setOnItemSelectedListener(adapterView$OnItemSelectedListener0);
            }
            if(this.H) {
                alertController$RecycleListView0.setChoiceMode(1);
            }
            else if(this.G) {
                alertController$RecycleListView0.setChoiceMode(2);
            }
            alertController0.g = alertController$RecycleListView0;
        }
    }

    static final class androidx.appcompat.app.AlertController.c extends Handler {
        private WeakReference a;

        public androidx.appcompat.app.AlertController.c(DialogInterface dialogInterface0) {
            this.a = new WeakReference(dialogInterface0);
        }

        @Override  // android.os.Handler
        public void handleMessage(Message message0) {
            switch(message0.what) {
                case -3: 
                case -2: 
                case -1: {
                    ((DialogInterface.OnClickListener)message0.obj).onClick(((DialogInterface)this.a.get()), message0.what);
                    return;
                }
                case 1: {
                    ((DialogInterface)message0.obj).dismiss();
                }
            }
        }
    }

    static class androidx.appcompat.app.AlertController.d extends ArrayAdapter {
        public androidx.appcompat.app.AlertController.d(Context context0, int v, int v1, CharSequence[] arr_charSequence) {
            super(context0, v, v1, arr_charSequence);
        }

        @Override  // android.widget.ArrayAdapter
        public long getItemId(int v) {
            return (long)v;
        }

        @Override  // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    NestedScrollView A;
    private int B;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    int I;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    private int Q;
    Handler R;
    private final View.OnClickListener S;
    private final Context a;
    final y b;
    private final Window c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    ListView g;
    private View h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    Button o;
    private CharSequence p;
    Message q;
    private Drawable r;
    Button s;
    private CharSequence t;
    Message u;
    private Drawable v;
    Button w;
    private CharSequence x;
    Message y;
    private Drawable z;

    public AlertController(Context context0, y y0, Window window0) {
        this.n = false;
        this.B = 0;
        this.I = -1;
        this.Q = 0;
        this.S = new a(this);
        this.a = context0;
        this.b = y0;
        this.c = window0;
        this.R = new androidx.appcompat.app.AlertController.c(y0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, j.F, e.a.k, 0);
        this.J = typedArray0.getResourceId(j.G, 0);
        this.K = typedArray0.getResourceId(j.I, 0);
        this.L = typedArray0.getResourceId(j.K, 0);
        this.M = typedArray0.getResourceId(j.L, 0);
        this.N = typedArray0.getResourceId(j.N, 0);
        this.O = typedArray0.getResourceId(j.J, 0);
        this.P = typedArray0.getBoolean(j.M, true);
        this.d = typedArray0.getDimensionPixelSize(j.H, 0);
        typedArray0.recycle();
        y0.j(1);
    }

    static boolean a(View view0) {
        if(view0.onCheckIsTextEditor()) {
            return true;
        }
        if(!(view0 instanceof ViewGroup)) {
            return false;
        }
        int v = ((ViewGroup)view0).getChildCount();
        while(v > 0) {
            --v;
            if(AlertController.a(((ViewGroup)view0).getChildAt(v))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    private void b(Button button0) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)button0.getLayoutParams();
        linearLayout$LayoutParams0.gravity = 1;
        linearLayout$LayoutParams0.weight = 0.5f;
        button0.setLayoutParams(linearLayout$LayoutParams0);
    }

    public int c(int v) {
        TypedValue typedValue0 = new TypedValue();
        this.a.getTheme().resolveAttribute(v, typedValue0, true);
        return typedValue0.resourceId;
    }

    public ListView d() {
        return this.g;
    }

    public void e() {
        int v = this.i();
        this.b.setContentView(v);
        this.x();
    }

    public boolean f(int v, KeyEvent keyEvent0) {
        return this.A != null && this.A.t(keyEvent0);
    }

    public boolean g(int v, KeyEvent keyEvent0) {
        return this.A != null && this.A.t(keyEvent0);
    }

    private ViewGroup h(View view0, View view1) {
        if(view0 == null) {
            if(view1 instanceof ViewStub) {
                view1 = ((ViewStub)view1).inflate();
            }
            return (ViewGroup)view1;
        }
        if(view1 != null) {
            ViewParent viewParent0 = view1.getParent();
            if(viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(view1);
            }
        }
        if(view0 instanceof ViewStub) {
            view0 = ((ViewStub)view0).inflate();
        }
        return (ViewGroup)view0;
    }

    private int i() {
        int v = this.K;
        if(v == 0) {
            return this.J;
        }
        return this.Q == 1 ? v : this.J;
    }

    public void j(int v, CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0, Message message0, Drawable drawable0) {
        if(message0 == null && dialogInterface$OnClickListener0 != null) {
            message0 = this.R.obtainMessage(v, dialogInterface$OnClickListener0);
        }
        switch(v) {
            case -3: {
                this.x = charSequence0;
                this.y = message0;
                this.z = drawable0;
                return;
            }
            case -2: {
                this.t = charSequence0;
                this.u = message0;
                this.v = drawable0;
                return;
            }
            case -1: {
                this.p = charSequence0;
                this.q = message0;
                this.r = drawable0;
                return;
            }
            default: {
                throw new IllegalArgumentException("Button does not exist");
            }
        }
    }

    public void k(View view0) {
        this.G = view0;
    }

    public void l(int v) {
        this.C = null;
        this.B = v;
        ImageView imageView0 = this.D;
        if(imageView0 != null) {
            if(v != 0) {
                imageView0.setVisibility(0);
                this.D.setImageResource(this.B);
                return;
            }
            imageView0.setVisibility(8);
        }
    }

    public void m(Drawable drawable0) {
        this.C = drawable0;
        this.B = 0;
        ImageView imageView0 = this.D;
        if(imageView0 != null) {
            if(drawable0 != null) {
                imageView0.setVisibility(0);
                this.D.setImageDrawable(drawable0);
                return;
            }
            imageView0.setVisibility(8);
        }
    }

    public void n(CharSequence charSequence0) {
        this.f = charSequence0;
        TextView textView0 = this.F;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
    }

    private void o(ViewGroup viewGroup0, View view0, int v, int v1) {
        View view1 = this.c.findViewById(f.v);
        View view2 = this.c.findViewById(f.u);
        Y.F0(view0, v, v1);
        if(view1 != null) {
            viewGroup0.removeView(view1);
        }
        if(view2 != null) {
            viewGroup0.removeView(view2);
        }
    }

    public void p(CharSequence charSequence0) {
        this.e = charSequence0;
        TextView textView0 = this.E;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
    }

    public void q(int v) {
        this.h = null;
        this.i = v;
        this.n = false;
    }

    public void r(View view0) {
        this.h = view0;
        this.i = 0;
        this.n = false;
    }

    public void s(View view0, int v, int v1, int v2, int v3) {
        this.h = view0;
        this.i = 0;
        this.n = true;
        this.j = v;
        this.k = v1;
        this.l = v2;
        this.m = v3;
    }

    private void t(ViewGroup viewGroup0) {
        int v;
        Button button0 = (Button)viewGroup0.findViewById(0x1020019);
        this.o = button0;
        button0.setOnClickListener(this.S);
        if(!TextUtils.isEmpty(this.p) || this.r != null) {
            this.o.setText(this.p);
            Drawable drawable0 = this.r;
            if(drawable0 != null) {
                drawable0.setBounds(0, 0, this.d, this.d);
                this.o.setCompoundDrawables(this.r, null, null, null);
            }
            this.o.setVisibility(0);
            v = 1;
        }
        else {
            this.o.setVisibility(8);
            v = 0;
        }
        Button button1 = (Button)viewGroup0.findViewById(0x102001A);
        this.s = button1;
        button1.setOnClickListener(this.S);
        if(!TextUtils.isEmpty(this.t) || this.v != null) {
            this.s.setText(this.t);
            Drawable drawable1 = this.v;
            if(drawable1 != null) {
                drawable1.setBounds(0, 0, this.d, this.d);
                this.s.setCompoundDrawables(this.v, null, null, null);
            }
            this.s.setVisibility(0);
            v |= 2;
        }
        else {
            this.s.setVisibility(8);
        }
        Button button2 = (Button)viewGroup0.findViewById(0x102001B);
        this.w = button2;
        button2.setOnClickListener(this.S);
        if(!TextUtils.isEmpty(this.x) || this.z != null) {
            this.w.setText(this.x);
            Drawable drawable2 = this.z;
            if(drawable2 != null) {
                drawable2.setBounds(0, 0, this.d, this.d);
                this.w.setCompoundDrawables(this.z, null, null, null);
            }
            this.w.setVisibility(0);
            v |= 4;
        }
        else {
            this.w.setVisibility(8);
        }
        if(AlertController.y(this.a)) {
            if(v == 1) {
                this.b(this.o);
            }
            else {
                switch(v) {
                    case 2: {
                        this.b(this.s);
                        break;
                    }
                    case 4: {
                        this.b(this.w);
                    }
                }
            }
        }
        if(v == 0) {
            viewGroup0.setVisibility(8);
        }
    }

    private void u(ViewGroup viewGroup0) {
        NestedScrollView nestedScrollView0 = (NestedScrollView)this.c.findViewById(f.w);
        this.A = nestedScrollView0;
        nestedScrollView0.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView0 = (TextView)viewGroup0.findViewById(0x102000B);
        this.F = textView0;
        if(textView0 == null) {
            return;
        }
        CharSequence charSequence0 = this.f;
        if(charSequence0 != null) {
            textView0.setText(charSequence0);
            return;
        }
        textView0.setVisibility(8);
        this.A.removeView(this.F);
        if(this.g != null) {
            ViewGroup viewGroup1 = (ViewGroup)this.A.getParent();
            int v = viewGroup1.indexOfChild(this.A);
            viewGroup1.removeViewAt(v);
            viewGroup1.addView(this.g, v, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup0.setVisibility(8);
    }

    private void v(ViewGroup viewGroup0) {
        View view0 = this.h;
        boolean z = false;
        if(view0 == null) {
            view0 = this.i == 0 ? null : LayoutInflater.from(this.a).inflate(this.i, viewGroup0, false);
        }
        if(view0 == null) {
            this.c.setFlags(0x20000, 0x20000);
        }
        else {
            z = true;
            if(!AlertController.a(view0)) {
                this.c.setFlags(0x20000, 0x20000);
            }
        }
        if(z) {
            FrameLayout frameLayout0 = (FrameLayout)this.c.findViewById(f.n);
            frameLayout0.addView(view0, new ViewGroup.LayoutParams(-1, -1));
            if(this.n) {
                frameLayout0.setPadding(this.j, this.k, this.l, this.m);
            }
            if(this.g != null) {
                ((androidx.appcompat.widget.LinearLayoutCompat.a)viewGroup0.getLayoutParams()).weight = 0.0f;
            }
        }
        else {
            viewGroup0.setVisibility(8);
        }
    }

    private void w(ViewGroup viewGroup0) {
        if(this.G != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -2);
            viewGroup0.addView(this.G, 0, viewGroup$LayoutParams0);
            this.c.findViewById(f.O).setVisibility(8);
            return;
        }
        this.D = (ImageView)this.c.findViewById(0x1020006);
        if(!TextUtils.isEmpty(this.e) && this.P) {
            TextView textView0 = (TextView)this.c.findViewById(f.j);
            this.E = textView0;
            textView0.setText(this.e);
            int v = this.B;
            if(v != 0) {
                this.D.setImageResource(v);
                return;
            }
            Drawable drawable0 = this.C;
            if(drawable0 != null) {
                this.D.setImageDrawable(drawable0);
                return;
            }
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
            return;
        }
        this.c.findViewById(f.O).setVisibility(8);
        this.D.setVisibility(8);
        viewGroup0.setVisibility(8);
    }

    private void x() {
        View view0 = this.c.findViewById(f.t);
        View view1 = view0.findViewById(f.P);
        View view2 = view0.findViewById(f.m);
        View view3 = view0.findViewById(f.k);
        ViewGroup viewGroup0 = (ViewGroup)view0.findViewById(f.o);
        this.v(viewGroup0);
        View view4 = viewGroup0.findViewById(f.P);
        View view5 = viewGroup0.findViewById(f.m);
        View view6 = viewGroup0.findViewById(f.k);
        ViewGroup viewGroup1 = this.h(view4, view1);
        ViewGroup viewGroup2 = this.h(view5, view2);
        ViewGroup viewGroup3 = this.h(view6, view3);
        this.u(viewGroup2);
        this.t(viewGroup3);
        this.w(viewGroup1);
        boolean z = viewGroup0.getVisibility() != 8;
        boolean z1 = viewGroup1 != null && viewGroup1.getVisibility() != 8;
        boolean z2 = viewGroup3 != null && viewGroup3.getVisibility() != 8;
        if(!z2 && viewGroup2 != null) {
            View view7 = viewGroup2.findViewById(f.K);
            if(view7 != null) {
                view7.setVisibility(0);
            }
        }
        if(z1) {
            NestedScrollView nestedScrollView0 = this.A;
            if(nestedScrollView0 != null) {
                nestedScrollView0.setClipToPadding(true);
            }
            View view8 = this.f != null || this.g != null ? viewGroup1.findViewById(f.N) : null;
            if(view8 != null) {
                view8.setVisibility(0);
            }
        }
        else if(viewGroup2 != null) {
            View view9 = viewGroup2.findViewById(f.L);
            if(view9 != null) {
                view9.setVisibility(0);
            }
        }
        ListView listView0 = this.g;
        if(listView0 instanceof RecycleListView) {
            ((RecycleListView)listView0).a(z1, z2);
        }
        if(!z) {
            ListView listView1 = this.g;
            if(listView1 == null) {
                listView1 = this.A;
            }
            if(listView1 != null) {
                this.o(viewGroup2, listView1, z1, 3);
            }
        }
        ListView listView2 = this.g;
        if(listView2 != null) {
            ListAdapter listAdapter0 = this.H;
            if(listAdapter0 != null) {
                listView2.setAdapter(listAdapter0);
                int v = this.I;
                if(v > -1) {
                    listView2.setItemChecked(v, true);
                    listView2.setSelection(v);
                }
            }
        }
    }

    private static boolean y(Context context0) {
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(e.a.j, typedValue0, true);
        return typedValue0.data != 0;
    }
}

