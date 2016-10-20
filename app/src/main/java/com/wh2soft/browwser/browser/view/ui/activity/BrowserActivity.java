package com.wh2soft.browwser.browser.view.ui.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

import com.wh2soft.browwser.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BrowserActivity extends AppCompatActivity {

    @BindView(R.id.input_url)
    EditText inputUrl;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tab_container)
    TabLayout tabContainer;
    @BindView(R.id.content_browser)
    ViewPager contentBrowser;
    @BindView(R.id.btn_actions)
    FloatingActionButton btnActions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @OnClick(R.id.btn_actions)
    public void onClick() {
        Snackbar.make(btnActions, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
