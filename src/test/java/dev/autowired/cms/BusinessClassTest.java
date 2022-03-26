package dev.autowired.cms;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BusinessClassTest {

    @Test
    void contextLoads() {
        //given
        BusinessClass businessClass = new BusinessClass();

        //when
        Integer integer = businessClass.addMe(1, 3);

        //then
        then(integer).isEqualTo(4);
    }

}
