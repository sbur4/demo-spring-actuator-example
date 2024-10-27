package org.example.health;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class ExampleInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        HashMap<String, Object> details = new HashMap<>();
        details.put("example", "Hello, World!");
        builder.withDetail("info", details);
    }
}