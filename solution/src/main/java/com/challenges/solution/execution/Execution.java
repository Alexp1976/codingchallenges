package com.challenges.solution.execution;

import com.challenges.solution.appleandorange.AppleAndOrange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Execution {

    static final Logger logger = LoggerFactory.getLogger(AppleAndOrange.class);

    public void execute();
}
