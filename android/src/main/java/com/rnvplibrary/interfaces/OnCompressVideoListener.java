package com.rnvplibrary.interfaces;

public interface OnCompressVideoListener {
    void onError(final String message);
    void onCompressStarted();
    void onSuccess(final String uri);
    void cancelAction();
}
