package de.julien.spring.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Julien Bernhart, julien.bernhart@hhu.de, 14.11.19
 */
@RestController
public class RestTest {

    @RequestMapping(value = "echo", produces = MediaType.APPLICATION_JSON_VALUE)
    public TestEntity test(@RequestParam(value="name", defaultValue="World") String name) {
        return new TestEntity("Hello ", name);
    }
}
