package d2;

import java.util.Arrays;
import java.util.List;

public class s extends t {
    private final List f;

    public s(List list0) {
        super("Dependency cycle detected: " + Arrays.toString(list0.toArray()));
        this.f = list0;
    }
}

