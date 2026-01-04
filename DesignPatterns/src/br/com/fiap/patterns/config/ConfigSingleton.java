package br.com.fiap.patterns.config;

import java.io.IOException;
import java.util.Properties;

public class ConfigSingleton {

    private static Properties prop;

    public ConfigSingleton() {
    }

    public static Properties getInstance() throws IOException {
        if (prop == null) {
            prop = new Properties();
            try {
                prop.load(ConfigSingleton.class.getResourceAsStream("/config.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return prop;
    }

}
