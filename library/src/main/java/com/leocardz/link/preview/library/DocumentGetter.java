package com.leocardz.link.preview.library;

import org.jsoup.nodes.Document;

import java.io.IOException;

public interface DocumentGetter {

    Document getDocument() throws IOException;
}

