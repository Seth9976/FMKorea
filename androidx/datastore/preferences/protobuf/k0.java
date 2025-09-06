package androidx.datastore.preferences.protobuf;

import java.util.List;

public class k0 extends RuntimeException {
    private final List f;
    private static final long serialVersionUID = 0x986022C4D65DB14DL;

    public k0(O o0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f = null;
    }

    public z a() {
        return new z(this.getMessage());
    }
}

