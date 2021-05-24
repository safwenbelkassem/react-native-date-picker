package com.henninghall.date_picker.ui;

import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.henninghall.date_picker.R;
import com.henninghall.date_picker.State;
import com.henninghall.date_picker.props.LocaleProp;
import com.henninghall.date_picker.props.Prop;

import java.util.Locale;

class PickerWrapper{
    private final LinearLayout view;

    private static final String TAG = "PickerWrapper";
    PickerWrapper(View rootView,State state) {

            view = (LinearLayout) rootView.findViewById(R.id.pickerWrapper);


        view.setWillNotDraw(false);
    }

    void addPicker(View wheel) { view.addView(wheel); }

    void addPicker(View wheel, int index) { view.addView(wheel,index); }

    void removeAll() {
        view.removeAllViews();
    }
}
