package com.eduardo.app.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TranslateDtoRequest {
    private String model;
    private String prompt;
}
