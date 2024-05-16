package com.example.project_user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.project_user.dto.request.RoleRequest;
import com.example.project_user.dto.response.RoleResponse;
import com.example.project_user.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
