package com.digiboy.erp.api;

import com.digiboy.erp.dto.User;

public interface UserService {
    User findByUsername(String username);
}
