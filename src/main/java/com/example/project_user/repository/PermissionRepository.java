package com.example.project_user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project_user.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {}
