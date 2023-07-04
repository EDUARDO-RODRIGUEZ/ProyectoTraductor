package com.eduardo.app.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Choice {

    private String text;
    private Long index;
    private Object logprobs;
    private String finish_reason;
}
