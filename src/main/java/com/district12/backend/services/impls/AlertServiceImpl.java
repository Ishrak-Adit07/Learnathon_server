package com.district12.backend.services.impls;

import com.district12.backend.dtos.response.CropResponse;
import com.district12.backend.entities.Alert;
import com.district12.backend.enums.AlertType;
import com.district12.backend.repositories.AlertRepository;
import com.district12.backend.services.abstractions.AlertService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlertServiceImpl implements AlertService {

    public final AlertRepository alertRepository;

    @Override
    public List<Alert> getAllAlertsByType(String alertType) {
        try {
            AlertType type = AlertType.valueOf(alertType.toUpperCase());  // Convert String to Enum (case-insensitive)
            return alertRepository.findAllByAlertType(type);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid alert type: " + alertType + ". Allowed values: DISEASE, TASK_REMINDER.");
        }
    }

}
