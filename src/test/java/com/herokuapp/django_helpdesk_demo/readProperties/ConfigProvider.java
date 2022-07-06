package com.herokuapp.django_helpdesk_demo.readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {

    Config config = readConfig();

    static Config readConfig() {

        return ConfigFactory.load("application.conf");
    }

    String URL = readConfig().getString("url");
    Integer AGE = readConfig().getInt("age");
    String DEMO_USER_USERNAME = readConfig().getString("usersParams.demo_user.username");
    String DEMO_USER_PASSWORD = readConfig().getString("usersParams.demo_user.password");
    boolean DEMO_USER_IS_ADMIN = readConfig().getBoolean("usersParams.demo_user.isAdmin");



}
