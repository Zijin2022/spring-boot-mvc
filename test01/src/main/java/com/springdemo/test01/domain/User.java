package com.springdemo.test01.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    private int id;
    private String name;
    private String email;
}
