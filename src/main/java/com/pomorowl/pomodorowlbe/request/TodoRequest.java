package com.pomorowl.pomodorowlbe.request;

import lombok.Data;
import lombok.Getter;

@Data
public class TodoRequest {
    Long todoId;
    String text;


}
