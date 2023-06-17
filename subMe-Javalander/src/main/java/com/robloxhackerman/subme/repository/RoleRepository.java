package com.robloxhackerman.subme.repository;

import com.robloxhackerman.subme.entity.EnumRole;
import com.robloxhackerman.subme.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    public Optional<Role> findByName(EnumRole enumRole);
}
