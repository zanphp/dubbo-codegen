package io.swagger.codegen.cmd;

import io.airlift.airline.Command;

/**
 * User: lanwen Date: 24.03.15 Time: 20:25
 */
@Command(name = "langs", description = "Shows available langs")
public class Langs implements Runnable {
    @Override
    public void run() {
        System.out.printf("Available languages: %s%n", "[php]");
    }
}
