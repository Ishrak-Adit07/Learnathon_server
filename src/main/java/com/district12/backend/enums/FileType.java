package com.district12.backend.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FileType {
    TEXT("SCOPE_TEXT"),
    IMAGE("SCOPE_IMAGE"),
    PDF("SCOPE_PDF");

    private final String value;
}
