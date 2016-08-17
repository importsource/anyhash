package com.importsource.anyhash;

import java.security.MessageDigest;

/**
 * MD5
 * 
 * @author Hezf
 */
public class MD5Encrypt {
	public MD5Encrypt() {
	}

	private final static String[] hexDigits = {

			"0", "1", "2", "3", "4", "5", "6", "7",

			"8", "9", "a", "b", "c", "d", "e", "f" };

	public static String byteArrayToString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();

		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
			// resultSb.append(byteToNumString(b[i]));
		}

		return resultSb.toString();

	}

	@SuppressWarnings("unused")
	private static String byteToNumString(final byte b) {
		int _b = b;

		if (_b < 0) {

			_b = 256 + _b;

		}

		return String.valueOf(_b);

	}

	private static String byteToHexString(byte b) {

		int n = b;

		if (n < 0) {

			n = 256 + n;

		}

		int d1 = n / 16;

		int d2 = n % 16;

		return hexDigits[d1] + hexDigits[d2];

	}

	public static String MD5Encode(String origin) {
		String resultString = null;
		try {
			resultString = new String(origin);
			MessageDigest md = MessageDigest.getInstance("MD5");
			resultString = byteArrayToString(md.digest(resultString.getBytes()));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return resultString;
	}

	public static void main(String[] args) {
		// MD5Encrypt md5encrypt = new MD5Encrypt();
		System.out.println(MD5Encode("123456"));
	}

}
