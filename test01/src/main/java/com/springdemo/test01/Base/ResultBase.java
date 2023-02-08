package com.springdemo.test01.Base;

import com.springdemo.test01.Base.Result;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ResultBase<T> extends Result {
    public T ResultObj;
}
