package com.wh2soft.browwser.browser.view.ui;

public interface WebPageView {

    void initWebpageContainer();

    void loadPage(String url);

    void saveToHistory(String url);

    void addToBookmarks(String url);

    void reload();

    void goBack();

    void goForward();

    void onErrorLoadingPage(int errorCode, String errorMsg);
}
