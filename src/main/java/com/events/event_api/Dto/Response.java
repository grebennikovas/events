package com.events.event_api.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response <T> {
    String meta = "";
    T data;
}
