package androidx.datastore.preferences.protobuf;

import java.io.IOException;

public class z extends IOException {
    public static class a extends z {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String s) {
            super(s);
        }
    }

    private O f;
    private static final long serialVersionUID = 0xE9924688C2F20054L;

    public z(String s) {
        super(s);
        this.f = null;
    }

    static z a() {
        return new z("Protocol message end-group tag did not match expected tag.");
    }

    static z b() {
        return new z("Protocol message contained an invalid tag (zero).");
    }

    static z c() {
        return new z("Protocol message had invalid UTF-8.");
    }

    static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static z e() {
        return new z("CodedInputStream encountered a malformed varint.");
    }

    static z f() {
        return new z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static z g() {
        return new z("Failed to parse the message.");
    }

    static z h() {
        return new z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public z i(O o0) {
        this.f = o0;
        return this;
    }

    static z j() {
        return new z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static z k() {
        return new z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

