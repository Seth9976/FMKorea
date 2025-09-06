package h1;

import android.os.Bundle;
import com.facebook.e;
import com.facebook.internal.F;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class c {
    public static Bundle a(ShareLinkContent shareLinkContent0) {
        Bundle bundle0 = c.c(shareLinkContent0);
        F.d0(bundle0, "href", shareLinkContent0.a());
        F.c0(bundle0, "quote", shareLinkContent0.d());
        return bundle0;
    }

    public static Bundle b(ShareOpenGraphContent shareOpenGraphContent0) {
        Bundle bundle0 = c.c(shareOpenGraphContent0);
        F.c0(bundle0, "action_type", shareOpenGraphContent0.d().e());
        try {
            JSONObject jSONObject0 = b.e(b.f(shareOpenGraphContent0), false);
            if(jSONObject0 != null) {
                F.c0(bundle0, "action_properties", jSONObject0.toString());
                return bundle0;
            }
            return bundle0;
        }
        catch(JSONException jSONException0) {
            throw new e("Unable to serialize the ShareOpenGraphContent to JSON", jSONException0);
        }
    }

    public static Bundle c(ShareContent shareContent0) {
        Bundle bundle0 = new Bundle();
        ShareHashtag shareHashtag0 = shareContent0.b();
        if(shareHashtag0 != null) {
            F.c0(bundle0, "hashtag", shareHashtag0.a());
        }
        return bundle0;
    }
}

