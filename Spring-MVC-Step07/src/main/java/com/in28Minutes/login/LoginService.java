package com.in28Minutes.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return !user.isEmpty() && !password.isEmpty();
	}
}