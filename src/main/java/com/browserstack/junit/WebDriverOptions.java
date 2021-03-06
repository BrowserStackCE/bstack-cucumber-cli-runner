package com.browserstack.junit;

import io.cucumber.junit.CucumberOptions;
import org.apiguardian.api.API;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
@API(status = API.Status.STABLE)
public @interface WebDriverOptions {

    int thread() default 1;

    boolean rerun() default false;

    CucumberOptions cucumberOptions();
}
