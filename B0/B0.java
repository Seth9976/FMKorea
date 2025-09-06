package B0;

import co.median.android.n;
import com.google.android.gms.tasks.OnFailureListener;

public final class b0 implements OnFailureListener {
    public final n a;

    public b0(n n0) {
        this.a = n0;
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exception0) {
        n.l(this.a, exception0);
    }
}

