package com.district12.backend.repositories;

import com.district12.backend.entities.Alert;
import com.district12.backend.enums.AlertType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Long>, JpaSpecificationExecutor<Alert> {

    @Query("SELECT a FROM Alert a WHERE a.user.id = :userId")
    List<Alert> findAllByUserId(@Param("userId") Long userId);

    @Query("SELECT a FROM Alert a WHERE a.crop.id = :cropId")
    List<Alert> findAllByCropId(@Param("cropId") Long cropId);

    @Query("SELECT a FROM Alert a WHERE a.alertType = :alertType")
    List<Alert> findAllByAlertType(@Param("alertType") AlertType alertType);
}
