package com.wh2soft.browwser.browser.view.ui;

/**
 * Created by wilmer on 17/10/16.
 */

public interface BrowserView {

    void enableURLInput();

    void disableURLInput();

    void closePage();

    void addTab();

    void removeTab();

    void goToTab(int tabNumber);

    void onError(String errorMsg);
}

