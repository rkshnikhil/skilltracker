package com.app.filetracker.cucumber.stepdefs;

import com.app.filetracker.SkilltrackerApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SkilltrackerApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
