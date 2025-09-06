package B0;

import co.median.android.n;
import com.google.android.gms.tasks.OnSuccessListener;
import y3.l;

public final class a0 implements OnSuccessListener {
    public final l a;

    public a0(l l0) {
        this.a = l0;
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object object0) {
        n.k(this.a, object0);
    }
}

