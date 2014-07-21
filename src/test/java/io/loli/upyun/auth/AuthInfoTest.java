package io.loli.upyun.auth;

import static org.junit.Assert.*;

import java.util.Base64;

import org.junit.Test;

public class AuthInfoTest {
    @Test
    public void testBase64() {
        String userName = "test";
        String password = "test";
        AuthInfo info = new AuthInfo(userName, password);
        String encodedStr = info.getBase64EncodedStr();

        String decodedStr = new String(Base64.getDecoder().decode(
                encodedStr.getBytes()));
        assertEquals(userName + ":" + password, decodedStr);
    }
}
