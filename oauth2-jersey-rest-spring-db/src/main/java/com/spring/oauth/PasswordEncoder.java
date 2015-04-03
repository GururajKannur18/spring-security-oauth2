/**
 * 
 */
package com.spring.oauth;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new  BCryptPasswordEncoder(11);
		System.out.println(encoder.encode("password"));
		System.out.println(encoder.encode("password"));
		System.out.println(encoder.encode("password"));
		System.out.println(encoder.encode("password"));
	}
}
