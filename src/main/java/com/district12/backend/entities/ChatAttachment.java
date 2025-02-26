package com.district12.backend.entities;

import com.district12.backend.enums.FileType;
import com.district12.backend.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Entity
@Table(name = "chat_attachment")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ChatAttachment {

    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chat_id", nullable = false)
    @ToString.Exclude
    private Chat chat;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String attachment;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private FileType type;
}
