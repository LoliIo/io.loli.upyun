package io.loli.upyun.auth;

/**
 * 认证异常类, 非运行时异常
 * 
 * @author choco (loli@linux.com)
 * @since 0.0.1
 * @see java.lang.Exception
 */
public class AuthException extends Exception {
    public static final String CONNECTION_TIME_OUT = "连接超时";
    public static final String PASSWORD_ERROR = "用户名或密码错误";
    private static final long serialVersionUID = 5825004888140872722L;

    public AuthException() {
        super();
    }

    public AuthException(String message) {
        super(message);
    }

    public AuthException(Throwable ex) {
        super(ex);
    }

    public AuthException(String message, Throwable cause) {
        super(message, cause);
    }
}
