package org.owntracks.android.support;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;

import com.github.curioustechizen.ago.RelativeTimeTextView;

public class BindingConversions {
    private static final String EMPTY_STRING = "";
    @BindingConversion
    public static String convertDoubleToString(Double d) {
        return  d != null? d.toString() : EMPTY_STRING;

    }
    @BindingConversion
    public static Double convertStringToDouble(String d) {
        return d != null ? Double.parseDouble(d) : null;
    }
    @BindingConversion
    public static String convertStringToString(String s) {
        return  s != null ? s : EMPTY_STRING;
    }

    @BindingConversion
    public static String convertIntegerToString(Integer d) {
        return  d != null? d.toString() : EMPTY_STRING;
    }


    @BindingAdapter("rttv:reference_time")
    public static void setReferenceTime(RelativeTimeTextView view, long time) {
        view.setReferenceTime(time);
    }
}
