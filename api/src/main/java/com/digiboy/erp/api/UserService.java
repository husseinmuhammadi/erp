package com.digiboy.erp.api;

import com.digiboy.erp.dto.UserDTO;
import com.digiboy.erp.dto.UserDTO;

public interface UserService {
    UserDTO findByUsername(String username);
}
