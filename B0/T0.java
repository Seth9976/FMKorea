package B0;

import C0.c;
import G3.h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import java.util.List;
import org.json.JSONObject;
import z3.k;

public final class t0 extends ArrayAdapter {
    private final boolean f;

    public t0(Context context0, List list0, boolean z) {
        k.e(context0, "context");
        k.e(list0, "items");
        super(context0, 0, list0);
        this.f = z;
    }

    @Override  // android.widget.ArrayAdapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        k.e(viewGroup0, "parent");
        if(view0 == null) {
            view0 = LayoutInflater.from(this.getContext()).inflate(0x7F0C008A, viewGroup0, false);  // layout:overflow_menu_item
        }
        JSONObject jSONObject0 = (JSONObject)this.getItem(v);
        TextView textView0 = (TextView)view0.findViewById(0x7F09016F);  // id:overFlowItemTextView
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F09016D);  // id:overFlowItemDrawable
        if(jSONObject0 != null) {
            String s = jSONObject0.optString("label");
            int v1 = this.getContext().getResources().getDimensionPixelSize(0x7F070055);  // dimen:action_menu_icon_size
            int v2 = a.getColor(this.getContext(), 0x7F06033B);  // color:titleTextColor
            textView0.setText(s);
            if(this.f) {
                String s1 = jSONObject0.optString("icon");
                k.b(s1);
                if(h.H(s1)) {
                    imageView0.setVisibility(4);
                }
                else {
                    Context context0 = this.getContext();
                    k.d(context0, "getContext(...)");
                    imageView0.setImageDrawable(new c(context0, s1, v1, v2).c());
                    imageView0.setVisibility(0);
                }
            }
            else {
                imageView0.setVisibility(8);
            }
        }
        k.b(view0);
        return view0;
    }
}

