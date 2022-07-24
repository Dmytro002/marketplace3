package com.example.marketplace3.dto;

import java.util.List;

public class UserResponse {
    List<UserDTO> userDTOS;

    public UserResponse(List<UserDTO> userDTOS) {
        this.userDTOS = userDTOS;
    }

    public List<UserDTO> getUserDTOS() {
        return userDTOS;
    }

    public void setUserDTOS(List<UserDTO> userDTOS) {
        this.userDTOS = userDTOS;
    }
}
