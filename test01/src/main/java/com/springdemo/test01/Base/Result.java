package com.springdemo.test01.Base;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Result {
    public String Status;
    public String Message;
}
