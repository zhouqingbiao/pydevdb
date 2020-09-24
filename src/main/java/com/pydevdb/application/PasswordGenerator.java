package com.pydevdb.application;

import java.util.Random;

public class PasswordGenerator {

	public static String getPassword(Boolean shift, Integer passwordLength) {
		StringBuilder sb = new StringBuilder();
		for (char c = '0'; c <= '9'; ++c) {
			sb.append(c);
		}
		for (char c = 'a'; c <= 'z'; ++c) {
			sb.append(c);
		}
		for (char c = 'A'; c <= 'Z'; ++c) {
			sb.append(c);
		}

		if (shift) {
			// shift off
			sb.append("`-=[]\\;',./");
			// shift on
			sb.append("~!@#$%^&*()_+{}|:\"<>?");
		}

		StringBuilder password = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < passwordLength; i++) {
			password.append(sb.charAt(random.nextInt(sb.length())));
		}
		return password.toString();
	}
}