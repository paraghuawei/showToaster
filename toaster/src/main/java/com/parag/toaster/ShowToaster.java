package com.parag.toaster;

import android.content.Context;
import android.widget.Toast;

public class ShowToaster {

    private Context context;

    public ShowToaster(Context context) {
        this.context = context;
    }

    public void showLongToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public void showShortToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
