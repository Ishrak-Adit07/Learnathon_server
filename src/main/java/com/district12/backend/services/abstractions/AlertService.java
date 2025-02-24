package com.district12.backend.services.abstractions;

import com.district12.backend.entities.Alert;
import com.district12.backend.enums.AlertType;

import java.util.List;

public interface AlertService {

    List<Alert> getAllAlertsByType(String alertType);

}
