package L;

import androidx.datastore.preferences.protobuf.z;
import java.io.InputStream;
import z3.g;
import z3.k;

public abstract class d {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final f a(InputStream inputStream0) {
            k.e(inputStream0, "input");
            try {
                f f0 = f.O(inputStream0);
                k.d(f0, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return f0;
            }
            catch(z z0) {
                throw new J.a("Unable to parse preferences proto.", z0);
            }
        }
    }

    public static final a a;

    static {
        d.a = new a(null);
    }
}

