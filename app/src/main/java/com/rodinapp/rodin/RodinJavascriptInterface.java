package com.rodinapp.rodin;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by serg on 1/5/2017.
 */

public class RodinJavascriptInterface {
    private boolean isOnMainPage = true;
    Context context;

    RodinJavascriptInterface(Context context) {
        this.context = context;
    }

    @JavascriptInterface
    public void navigateToMainPage() {
        //Toast.makeText(context, "navigateToMainPage()", Toast.LENGTH_SHORT).show();
        this.isOnMainPage = true;
    }

    @JavascriptInterface
    public void navigateFromMainPage() {
        //Toast.makeText(context, "navigateFromMainPage()", Toast.LENGTH_SHORT).show();
        this.isOnMainPage = false;
    }

    public boolean IsOnMainPage() {
        return this.isOnMainPage;
    }
}
