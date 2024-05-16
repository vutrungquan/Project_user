package com.example.project_user.mapper;

import org.mapstruct.Mapper;

import com.example.project_user.dto.request.PermissionRequest;
import com.example.project_user.dto.response.PermissionResponse;
import com.example.project_user.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
