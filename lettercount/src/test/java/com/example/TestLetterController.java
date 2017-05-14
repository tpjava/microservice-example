package com.example;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by tonyperrin on 22/04/17.
 */
@WebMvcTest(LettercountApplication.class)
public class TestLetterController extends AbstractTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testLetterControllerReturnsCorrectLetterCount() throws Exception {
        String url = "/lettercount/one";

        this.mockMvc.perform(get(url))
                .andExpect(status().isOk()).andExpect(content().string("3"));
    }
}
