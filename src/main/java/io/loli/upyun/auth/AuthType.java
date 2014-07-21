package io.loli.upyun.auth;

/**
 * 认证类型枚举<br>
 * BASIC为基本认证, 用户名密码使用Base64加密<br/>
 * SIGNATURE为签名认证, 将各种信息结合起来使用md5加密
 * 
 * @author choco (loli@linux.com)
 * @since 0.0.1
 */
public enum AuthType {
    BASIC, SIGNATURE;
}
