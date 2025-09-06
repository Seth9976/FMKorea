package a2;

import com.google.android.gms.common.internal.Preconditions;

public abstract class k extends Exception {
    protected k() {
    }

    public k(String s) {
        Preconditions.checkNotEmpty(s, "Detail message must not be empty");
        super(s);
    }
}

