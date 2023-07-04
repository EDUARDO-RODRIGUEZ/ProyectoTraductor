package com.eduardo.app.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usage {

    private Long prompt_tokens;
    private Long completion_tokens;
    private Long total_tokens;
}
