package com.district12.backend.services.impls;

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
            AlertType type = AlertType.valueOf(alertType.toUpperCase());
            return alertRepository.findAllByAlertType(type);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid alert type: " + alertType);
        }
    }

    @Override
    public List<Alert> getAllAlertsByUserId(Long userId) {
        return alertRepository.findAllByUserId(userId);
    }

    @Override
    public List<Alert> getUnreadAlertsByUserId(Long userId) {
        return alertRepository.findUnreadByUserId(userId);
    }

    @Override
    public List<Alert> getAllAlertsByCropId(Long cropId) {
        return alertRepository.findAllByCropId(cropId);
    }

    public Alert getAlertById(Long alertId) {
        return alertRepository.findById(alertId).orElse(null);
    }

}
