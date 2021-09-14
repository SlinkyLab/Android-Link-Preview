package com.leocardz.link.preview.library;

public abstract class BaseDocumentGetter implements DocumentGetter {

    protected String url;

    public BaseDocumentGetter(String url) {
        this.url = url;
    }
}
