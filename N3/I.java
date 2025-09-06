package n3;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map.Entry;
import java.util.Map;
import m3.F;
import z3.g;
import z3.k;

final class i implements Externalizable {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    private Map f;
    public static final a g;
    private static final long serialVersionUID;

    static {
        i.g = new a(null);
    }

    public i(Map map0) {
        k.e(map0, "map");
        super();
        this.f = map0;
    }

    @Override
    public void readExternal(ObjectInput objectInput0) {
        k.e(objectInput0, "input");
        int v = objectInput0.readByte();
        if(v != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + v);
        }
        int v1 = objectInput0.readInt();
        if(v1 < 0) {
            throw new InvalidObjectException("Illegal size value: " + v1 + '.');
        }
        Map map0 = F.d(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            map0.put(objectInput0.readObject(), objectInput0.readObject());
        }
        this.f = F.b(map0);
    }

    private final Object readResolve() {
        return this.f;
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput0) {
        k.e(objectOutput0, "output");
        objectOutput0.writeByte(0);
        objectOutput0.writeInt(this.f.size());
        for(Object object0: this.f.entrySet()) {
            objectOutput0.writeObject(((Map.Entry)object0).getKey());
            objectOutput0.writeObject(((Map.Entry)object0).getValue());
        }
    }
}

