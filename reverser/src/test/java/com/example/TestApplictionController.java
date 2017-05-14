package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by tonyperrin on 03/05/17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(ReverserApplication.class)
public class TestApplictionController {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void testControllerReturnsReversedString() throws Exception {
        this.mockMvc.perform(get("/reverse/word"))
                .andExpect(status().isOk()).andExpect(content().string("drow"));
    }
}
