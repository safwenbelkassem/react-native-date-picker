package com.henninghall.date_picker.pickers;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.henninghall.date_picker.custompicker.NumberPickerView;


public class IosClone extends NumberPickerView implements Picker {

    public IosClone(Context context) {
        super(context);
    }

    public IosClone(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public IosClone(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setTextAlign(Paint.Align align) {

    }

    @Override
    public void setOnValueChangeListenerInScrolling(final Picker.OnValueChangeListenerInScrolling listener) {
        final Picker self = this;
        super.setOnValueChangeListenerInScrolling(new NumberPickerView.OnValueChangeListenerInScrolling() {
            @Override
            public void onValueChangeInScrolling(NumberPickerView picker, int oldVal, int newVal) {
                listener.onValueChangeInScrolling(self, oldVal, newVal);
            }
        });
    }

    @Override
    public void setOnValueChangedListener(final Picker.OnValueChangeListener listener) {
        super.setOnValueChangedListener(new NumberPickerView.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPickerView picker, int oldVal, int newVal) {
                listener.onValueChange();
            }
        });
    }

    @Override
    public void setShownCount(int count) {

    }

    @Override
    public View getView() {
        return this;
    }

    @Override
    public void setDividerHeight(int height) {

    }

    @Override
    public void setItemPaddingHorizontal(int padding) {

    }

    @Override
    public boolean isSpinning() {
        return super.isScrolling();
    }


}
