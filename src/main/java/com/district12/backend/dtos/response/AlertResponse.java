package com.district12.backend.dtos.response;

import com.district12.backend.enums.AlertType;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@AllArgsConstructor
public class AlertResponse {

    private Long id;
    private Long userId;
    private Long cropId;
    private String alertText;
    private AlertType alertType;
    private ZonedDateTime createdAt;
    private ZonedDateTime readAt;


}
