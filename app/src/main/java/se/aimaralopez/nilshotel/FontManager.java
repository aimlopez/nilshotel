package se.aimaralopez.nilshotel;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by alopez on 09/02/17.
 */

public class FontManager {



        public static final String ROOT = "fonts/",
                FONTAWESOME = ROOT + "fontawesomeWebfont.ttf";

         static Typeface getTypeface(Context context, String font) {
            return Typeface.createFromAsset(context.getAssets(), font);
        }


    public static void applyTypeFace(View v, Typeface typeface) {
        if (v instanceof ViewGroup) {
            ViewGroup vg = (ViewGroup) v;
            for (int i = 0; i < vg.getChildCount(); i++) {
                View child = vg.getChildAt(i);
                applyTypeFace(child, typeface);
            }
        } else if (v instanceof TextView) {
            ((TextView) v).setTypeface(typeface);
        }
    }

}
