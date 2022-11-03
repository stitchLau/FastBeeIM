package com.fastbee.fastbeeim.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Message {
    private Integer from;
    private Integer to;
    private LocalDateTime date;
}
