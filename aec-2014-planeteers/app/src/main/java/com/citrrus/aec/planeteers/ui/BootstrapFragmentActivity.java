package com.citrrus.aec.planeteers.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.citrrus.aec.planeteers.Injector;

import butterknife.Views;

/**
 * Base class for all Bootstrap Activities that need fragments.
 */
public class BootstrapFragmentActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Injector.inject(this);
    }

    @Override
    public void setContentView(int layoutResId) {
        super.setContentView(layoutResId);

        Views.inject(this);
    }

}
