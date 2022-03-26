package dev.autowired.cms;

import org.springframework.stereotype.Component;

@Component
public class BusinessClass {

    public Integer addMe(Integer o1, Integer o2) {
        return o1 + o2;
    }
}
