package io.loli.upyun.auth;

import io.loli.util.string.MD5Util;

import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Date;

public class AuthInfo {

    public AuthInfo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getBase64EncodedStr() {
        String strToEncode = userName + ":" + password;
        String result = Base64.getEncoder().encodeToString(
                strToEncode.getBytes());
        return result;
    }

    public String getMd5EncodedStr(String method, String uri, long contentLength) {
        String strToEncoded = method + "&" + uri + new Date() + contentLength
                + this.getMd5EncodedPasswd();
        String encodedStr = null;

        try {
            encodedStr = MD5Util.hash(strToEncoded);
        } catch (NoSuchAlgorithmException e) {
            encodedStr = "";
        }
        return encodedStr;
    }

    private String getMd5EncodedPasswd() {
        String encodedStr = null;
        try {
            encodedStr = MD5Util.hash(this.password);
        } catch (NoSuchAlgorithmException e) {
            encodedStr = "";
        }
        return encodedStr;
    }

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
