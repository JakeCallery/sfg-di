package com.jakecallery.com.sfgdi.controllers;

import com.jakecallery.com.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
