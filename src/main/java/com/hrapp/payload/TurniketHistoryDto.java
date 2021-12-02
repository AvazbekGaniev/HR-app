package com.hrapp.payload;

import com.hrapp.enums.TurniketType;
import lombok.Data;

import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

@Data
public class TurniketHistoryDto {
    @NotNull
    private String number;

    @NotNull
    @Enumerated
    private TurniketType type;
}
