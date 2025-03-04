package com.district12.backend.entities;

import com.district12.backend.enums.CropAlertType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "crop_alerts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CropAlerts {

    @Id
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId
    @JoinColumn(name = "alert_id", referencedColumnName = "id", nullable = false)
    private Alert alert;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_crop_id", nullable = false)
    private UserCrops userCrop;

    @Enumerated(EnumType.STRING)
    @Column(name = "crop_alert_type", nullable = false)
    private CropAlertType cropAlertType;

}
