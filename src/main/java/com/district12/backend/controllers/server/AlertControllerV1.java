package com.district12.backend.controllers.server;

import com.district12.backend.entities.Alert;
import com.district12.backend.services.abstractions.AlertService;
import com.district12.backend.utils.SecurityUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/alerts")
@RequiredArgsConstructor
@Slf4j
public class AlertControllerV1 {

    private final AlertService alertService;

//    @GetMapping("/{alertId}")
//    public ResponseEntity<Alert> getAlertById(@PathVariable("alertId") Long alertId) {
//        Alert alertById = alertService.getAllAlertsByType(alertId);
//        return ResponseEntity.ok(alertById);
//    }

    @GetMapping("/type/{alertType}")
    public ResponseEntity<List<Alert>> getAlertByType(@PathVariable("alertType") String alertType) {
        List<Alert> alertsByType = alertService.getAllAlertsByType(alertType);
        return ResponseEntity.ok(alertsByType);
    }

    @GetMapping("/user")
    public ResponseEntity<List<Alert>> getAlertByUserId() {
        List<Alert> alertsByUserId = alertService.getAllAlertsByUserId(SecurityUtils.getOwnerID());
        return ResponseEntity.ok(alertsByUserId);
    }

    @GetMapping("/crop/{cropId}")
    public ResponseEntity<List<Alert>> getAlertByCropId(@PathVariable("cropId") Long cropId) {
        List<Alert> alertsByCropId = alertService.getAllAlertsByCropId(cropId);
        return ResponseEntity.ok(alertsByCropId);
    }

}
