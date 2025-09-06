package u1;

import android.database.Cursor;
import java.util.Map;

public final class z implements b {
    public final Map a;

    public z(Map map0) {
        this.a = map0;
    }

    @Override  // u1.M$b
    public final Object apply(Object object0) {
        return M.N0(this.a, ((Cursor)object0));
    }
}

