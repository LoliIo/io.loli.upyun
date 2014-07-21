package io.loli.upyun.http;

import io.loli.upyun.auth.AuthInfo;
import io.loli.upyun.auth.AuthType;

import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

public class HeaderBuilder {
    private static String DEFAULT_HEADER_NAME = "Authorization";

    public static Header[] getBasicHeader(AuthInfo info) {
        Header[] headers = new Header[0];
        String encodedStr = null;
        String authStr = null;
        encodedStr = info.getBase64EncodedStr();
        authStr = "Basic " + encodedStr;
        headers[0] = new BasicHeader(DEFAULT_HEADER_NAME, authStr);
        return headers;
    }

    public static Header[] getSignatureHeader(AuthInfo info, String type,
            String uri, String contentLength) {
        Header[] headers = null;

        if (type.equalsIgnoreCase("get") || type.equalsIgnoreCase("head")) {
            headers = new Header[2];
        } else {
            headers = new Header[3];
        }
        String encodedStr = null;
        String authStr = null;
        encodedStr = info.getBase64EncodedStr();
        authStr = "Basic " + encodedStr;
        headers[0] = new BasicHeader(DEFAULT_HEADER_NAME, authStr);
        return headers;
    }

}
