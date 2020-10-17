package com.tony.dp.flyweight.netdisk;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/17 18:53
 * Description:
 * 工具类，计算内容的hash值
 */
public class HashUtil {
    public static String computeHashId(String key) {
        String cacheKey = null;
        try {
            final MessageDigest mDigest = MessageDigest.getInstance("MD5");
            mDigest.update(key.getBytes());
            cacheKey = byteToHexString(mDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return cacheKey;
    }

    private static String byteToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }
        return sb.toString();
    }
}
