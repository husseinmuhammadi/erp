package com.digiboy.erp.mapper;

import com.digiboy.erp.dto.UserDTO;
import com.digiboy.erp.to.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface UserMapper {

    UserDTO fromUser(User user);

    User toUser(UserDTO userDTO);
}
