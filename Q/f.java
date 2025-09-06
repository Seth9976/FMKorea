package Q;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

public final class f {
    static class a extends b {
        private final TextView a;
        private final d b;
        private boolean c;

        a(TextView textView0) {
            this.a = textView0;
            this.c = true;
            this.b = new d(textView0);
        }

        @Override  // Q.f$b
        InputFilter[] a(InputFilter[] arr_inputFilter) {
            return this.c ? this.f(arr_inputFilter) : this.h(arr_inputFilter);
        }

        @Override  // Q.f$b
        public boolean b() {
            return this.c;
        }

        @Override  // Q.f$b
        void c(boolean z) {
            if(z) {
                this.l();
            }
        }

        @Override  // Q.f$b
        void d(boolean z) {
            this.c = z;
            this.l();
            this.k();
        }

        // 去混淆评级： 低(20)
        @Override  // Q.f$b
        TransformationMethod e(TransformationMethod transformationMethod0) {
            return this.c ? this.m(transformationMethod0) : this.j(transformationMethod0);
        }

        private InputFilter[] f(InputFilter[] arr_inputFilter) {
            for(int v = 0; v < arr_inputFilter.length; ++v) {
                if(arr_inputFilter[v] == this.b) {
                    return arr_inputFilter;
                }
            }
            InputFilter[] arr_inputFilter1 = new InputFilter[arr_inputFilter.length + 1];
            System.arraycopy(arr_inputFilter, 0, arr_inputFilter1, 0, arr_inputFilter.length);
            arr_inputFilter1[arr_inputFilter.length] = this.b;
            return arr_inputFilter1;
        }

        private SparseArray g(InputFilter[] arr_inputFilter) {
            SparseArray sparseArray0 = new SparseArray(1);
            for(int v = 0; v < arr_inputFilter.length; ++v) {
                InputFilter inputFilter0 = arr_inputFilter[v];
                if(inputFilter0 instanceof d) {
                    sparseArray0.put(v, inputFilter0);
                }
            }
            return sparseArray0;
        }

        private InputFilter[] h(InputFilter[] arr_inputFilter) {
            SparseArray sparseArray0 = this.g(arr_inputFilter);
            if(sparseArray0.size() == 0) {
                return arr_inputFilter;
            }
            InputFilter[] arr_inputFilter1 = new InputFilter[arr_inputFilter.length - sparseArray0.size()];
            int v1 = 0;
            for(int v = 0; v < arr_inputFilter.length; ++v) {
                if(sparseArray0.indexOfKey(v) < 0) {
                    arr_inputFilter1[v1] = arr_inputFilter[v];
                    ++v1;
                }
            }
            return arr_inputFilter1;
        }

        void i(boolean z) {
            this.c = z;
        }

        // 去混淆评级： 低(20)
        private TransformationMethod j(TransformationMethod transformationMethod0) {
            return transformationMethod0 instanceof h ? ((h)transformationMethod0).a() : transformationMethod0;
        }

        private void k() {
            InputFilter[] arr_inputFilter = this.a(this.a.getFilters());
            this.a.setFilters(arr_inputFilter);
        }

        void l() {
            TransformationMethod transformationMethod0 = this.e(this.a.getTransformationMethod());
            this.a.setTransformationMethod(transformationMethod0);
        }

        private TransformationMethod m(TransformationMethod transformationMethod0) {
            if(transformationMethod0 instanceof h) {
                return transformationMethod0;
            }
            return transformationMethod0 instanceof PasswordTransformationMethod ? transformationMethod0 : new h(transformationMethod0);
        }
    }

    static abstract class b {
        abstract InputFilter[] a(InputFilter[] arg1);

        public abstract boolean b();

        abstract void c(boolean arg1);

        abstract void d(boolean arg1);

        abstract TransformationMethod e(TransformationMethod arg1);
    }

    static class c extends b {
        private final a a;

        c(TextView textView0) {
            this.a = new a(textView0);
        }

        // 去混淆评级： 低(30)
        @Override  // Q.f$b
        InputFilter[] a(InputFilter[] arr_inputFilter) {
            return arr_inputFilter;
        }

        @Override  // Q.f$b
        public boolean b() {
            return this.a.b();
        }

        // 去混淆评级： 低(30)
        @Override  // Q.f$b
        void c(boolean z) {
        }

        @Override  // Q.f$b
        void d(boolean z) {
            this.a.i(z);
        }

        // 去混淆评级： 低(30)
        @Override  // Q.f$b
        TransformationMethod e(TransformationMethod transformationMethod0) {
            return transformationMethod0;
        }

        // 去混淆评级： 低(20)
        private boolean f() [...] // 潜在的解密器
    }

    private final b a;

    public f(TextView textView0, boolean z) {
        B.h.h(textView0, "textView cannot be null");
        if(!z) {
            this.a = new c(textView0);
            return;
        }
        this.a = new a(textView0);
    }

    public InputFilter[] a(InputFilter[] arr_inputFilter) {
        return this.a.a(arr_inputFilter);
    }

    public boolean b() {
        return this.a.b();
    }

    public void c(boolean z) {
        this.a.c(z);
    }

    public void d(boolean z) {
        this.a.d(z);
    }

    public TransformationMethod e(TransformationMethod transformationMethod0) {
        return this.a.e(transformationMethod0);
    }
}

