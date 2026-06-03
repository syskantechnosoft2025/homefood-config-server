package com.homefood.config;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConfigServerApplicationTest {

    @Test
    void contextLoads() {
        assertThat(ConfigServerApplication.class).isNotNull();
    }
}
