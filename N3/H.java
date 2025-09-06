package n3;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import m3.L;
import m3.o;
import z3.g;
import z3.k;

public final class h implements Externalizable {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    private Collection f;
    private final int g;
    public static final a h;
    private static final long serialVersionUID;

    static {
        h.h = new a(null);
    }

    public h(Collection collection0, int v) {
        k.e(collection0, "collection");
        super();
        this.f = collection0;
        this.g = v;
    }

    @Override
    public void readExternal(ObjectInput objectInput0) {
        Collection collection0;
        k.e(objectInput0, "input");
        int v = objectInput0.readByte();
        if((v & -2) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + v + '.');
        }
        int v1 = 0;
        int v2 = objectInput0.readInt();
        if(v2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + v2 + '.');
        }
        switch(v & 1) {
            case 0: {
                List list0 = o.d(v2);
                while(v1 < v2) {
                    list0.add(objectInput0.readObject());
                    ++v1;
                }
                collection0 = o.a(list0);
                break;
            }
            case 1: {
                Set set0 = L.c(v2);
                while(v1 < v2) {
                    set0.add(objectInput0.readObject());
                    ++v1;
                }
                collection0 = L.a(set0);
                break;
            }
            default: {
                throw new InvalidObjectException("Unsupported collection type tag: " + (v & 1) + '.');
            }
        }
        this.f = collection0;
    }

    private final Object readResolve() {
        return this.f;
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput0) {
        k.e(objectOutput0, "output");
        objectOutput0.writeByte(this.g);
        objectOutput0.writeInt(this.f.size());
        for(Object object0: this.f) {
            objectOutput0.writeObject(object0);
        }
    }
}

