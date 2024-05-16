package com.example.project_user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.example.project_user.dto.request.UserCreationRequest;
import com.example.project_user.dto.request.UserUpdateRequest;
import com.example.project_user.dto.response.UserResponse;
import com.example.project_user.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
