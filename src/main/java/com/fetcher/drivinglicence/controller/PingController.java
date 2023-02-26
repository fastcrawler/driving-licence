package com.fetcher.drivinglicence.controller;

import com.fetcher.drivinglicence.response.MessageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping(value = "/ping")
    public MessageResponse checkPing() {
        return MessageResponse.builder().message("PONG").status("success").build();
    }
}
