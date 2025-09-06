package androidx.fragment.app;

import R.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater.Factory2;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;

class n implements LayoutInflater.Factory2 {
    final FragmentManager f;

    n(FragmentManager fragmentManager0) {
        this.f = fragmentManager0;
    }

    @Override  // android.view.LayoutInflater$Factory2
    public View onCreateView(View view0, String s, Context context0, AttributeSet attributeSet0) {
        class a implements View.OnAttachStateChangeListener {
            final x f;
            final n g;

            a(x x0) {
                this.f = x0;
                super();
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                this.f.m();
                F.n(((ViewGroup)this.f.k().mView.getParent()), n.this.f).j();
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
            }
        }

        x x0;
        Fragment fragment0 = null;
        if("androidx.fragment.app.FragmentContainerView".equals(s)) {
            return new FragmentContainerView(context0, attributeSet0, this.f);
        }
        if(!"fragment".equals(s)) {
            return null;
        }
        String s1 = attributeSet0.getAttributeValue(null, "class");
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, c.a);
        if(s1 == null) {
            s1 = typedArray0.getString(c.b);
        }
        int v = typedArray0.getResourceId(c.c, -1);
        String s2 = typedArray0.getString(c.d);
        typedArray0.recycle();
        if(s1 != null && l.b(context0.getClassLoader(), s1)) {
            int v1 = view0 == null ? 0 : view0.getId();
            if(v1 == -1 && v == -1 && s2 == null) {
                throw new IllegalArgumentException(attributeSet0.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + s1);
            }
            if(v != -1) {
                fragment0 = this.f.h0(v);
            }
            if(fragment0 == null && s2 != null) {
                fragment0 = this.f.i0(s2);
            }
            if(fragment0 == null && v1 != -1) {
                fragment0 = this.f.h0(v1);
            }
            if(fragment0 == null) {
                fragment0 = this.f.s0().a(context0.getClassLoader(), s1);
                fragment0.mFromLayout = true;
                fragment0.mFragmentId = v == 0 ? v1 : v;
                fragment0.mContainerId = v1;
                fragment0.mTag = s2;
                fragment0.mInLayout = true;
                fragment0.mFragmentManager = this.f;
                fragment0.mHost = this.f.u0();
                fragment0.onInflate(this.f.u0().g(), attributeSet0, fragment0.mSavedFragmentState);
                x0 = this.f.j(fragment0);
                if(!FragmentManager.H0(2)) {
                    goto label_44;
                }
                Log.v("FragmentManager", "Fragment " + fragment0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(v));
            }
            else if(!fragment0.mInLayout) {
                fragment0.mInLayout = true;
                fragment0.mFragmentManager = this.f;
                fragment0.mHost = this.f.u0();
                fragment0.onInflate(this.f.u0().g(), attributeSet0, fragment0.mSavedFragmentState);
                x0 = this.f.w(fragment0);
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "Retained Fragment " + fragment0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(v));
                }
            }
            else {
                throw new IllegalArgumentException(attributeSet0.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(v) + ", tag " + s2 + ", or parent id 0x" + Integer.toHexString(v1) + " with another fragment for " + s1);
            }
        label_44:
            S.c.g(fragment0, ((ViewGroup)view0));
            fragment0.mContainer = (ViewGroup)view0;
            x0.m();
            x0.j();
            View view1 = fragment0.mView;
            if(view1 == null) {
                throw new IllegalStateException("Fragment " + s1 + " did not create a view.");
            }
            if(v != 0) {
                view1.setId(v);
            }
            if(fragment0.mView.getTag() == null) {
                fragment0.mView.setTag(s2);
            }
            fragment0.mView.addOnAttachStateChangeListener(new a(this, x0));
            return fragment0.mView;
        }
        return null;
    }

    @Override  // android.view.LayoutInflater$Factory
    public View onCreateView(String s, Context context0, AttributeSet attributeSet0) {
        return this.onCreateView(null, s, context0, attributeSet0);
    }
}

