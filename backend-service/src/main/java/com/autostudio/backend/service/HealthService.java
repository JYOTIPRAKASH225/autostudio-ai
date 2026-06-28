package com.autostudio.backend.service;

import com.autostudio.backend.dto.HealthResponse;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public HealthResponse getHealth() {
        return new HealthResponse(
                "UP",
                "AutoStudio AI Backend",
                "v1"
        );
    }
}