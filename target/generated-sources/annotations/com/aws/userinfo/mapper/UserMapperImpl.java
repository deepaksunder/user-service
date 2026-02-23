package com.aws.userinfo.mapper;

import com.aws.userinfo.dto.UserDTO;
import com.aws.userinfo.entity.User;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-24T00:24:18+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.41.0.v20250213-1140, environment: Java 21.0.6 (Eclipse Adoptium)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User mapUserDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setAddress( userDTO.getAddress() );
        user.setCity( userDTO.getCity() );
        user.setUserId( userDTO.getUserId() );
        user.setUserName( userDTO.getUserName() );
        user.setUserPassword( userDTO.getUserPassword() );

        return user;
    }

    @Override
    public UserDTO mapUserToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setAddress( user.getAddress() );
        userDTO.setCity( user.getCity() );
        userDTO.setUserId( user.getUserId() );
        userDTO.setUserName( user.getUserName() );
        userDTO.setUserPassword( user.getUserPassword() );

        return userDTO;
    }
}
