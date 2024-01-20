package com.pomorowl.pomodorowlbe.request;

import lombok.Data;
import lombok.Getter;

@Data
public class TodoRequest {
    Long id;
    String text;
    Long userId;
}
