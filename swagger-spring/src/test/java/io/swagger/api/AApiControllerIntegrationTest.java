package io.swagger.api;

import io.swagger.model.Result;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AApiControllerIntegrationTest {

    @Autowired
    private AApi api;

    @Test
    public void aBGetTest() throws Exception {
        String a = "a_example";
        String b = "b_example";
        ResponseEntity<Void> responseEntity = api.aBGet(a, b);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void aBOpGetTest() throws Exception {
        String a = "a_example";
        String b = "b_example";
        String op = "op_example";
        ResponseEntity<Result> responseEntity = api.aBOpGet(a, b, op);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void aGetTest() throws Exception {
        String a = "a_example";
        ResponseEntity<Void> responseEntity = api.aGet(a);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
