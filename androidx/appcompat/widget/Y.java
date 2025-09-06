package androidx.appcompat.widget;

import B.h;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

final class y {
    static abstract class a {
        static TextClassifier a(TextView textView0) {
            TextClassificationManager textClassificationManager0 = (TextClassificationManager)textView0.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager0 == null ? TextClassifier.NO_OP : textClassificationManager0.getTextClassifier();
        }
    }

    private TextView a;
    private TextClassifier b;

    y(TextView textView0) {
        this.a = (TextView)h.g(textView0);
    }

    public TextClassifier a() {
        return this.b == null ? a.a(this.a) : this.b;
    }

    public void b(TextClassifier textClassifier0) {
        this.b = textClassifier0;
    }
}

