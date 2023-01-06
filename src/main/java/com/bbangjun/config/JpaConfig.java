package com.bbangjun.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing // JPA Auditing 활성화 (222p) 기존에는 Application.java에 있었음
public class JpaConfig {
}
