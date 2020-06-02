package com.iotpack.api.entity.access;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionsActionRepository extends CrudRepository<PermissionsActionsEntity, Long>,
        JpaSpecificationExecutor<PermissionsActionsEntity>,
        JpaRepository<PermissionsActionsEntity, Long> {
}
