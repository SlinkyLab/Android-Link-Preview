package com.leocardz.link.preview.library;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupDocumentGetter extends BaseDocumentGetter {

    public JsoupDocumentGetter(String url) {
        super(url);
    }

    @Override
    public Document getDocument() throws IOException {
        return Jsoup.connect(url).userAgent("Mozilla").get();
    }
}
