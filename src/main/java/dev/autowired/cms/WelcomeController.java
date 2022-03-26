package dev.autowired.cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class WelcomeController {

    private final BusinessClass businessClass;

    @GetMapping("/")
    public String welcome() {
        return "i am here! " + businessClass.addMe(1, 3);
    }
}
