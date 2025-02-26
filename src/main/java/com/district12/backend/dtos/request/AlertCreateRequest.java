package com.district12.backend.dtos.request;

import com.district12.backend.enums.AlertType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AlertCreateRequest {

    private Long userId;
    private Long cropId;
    private String alertText;
    private AlertType alertType;

}
