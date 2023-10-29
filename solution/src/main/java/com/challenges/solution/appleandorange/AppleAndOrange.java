package com.challenges.solution.appleandorange;

import com.challenges.solution.execution.Execution;
import com.google.common.annotations.VisibleForTesting;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AppleAndOrange implements Execution {

    private static final Logger logger = LoggerFactory.getLogger(AppleAndOrange.class);

    @Override
    @PostConstruct
    public void execute() {

        int appleTree = getRandomInt(1, 11);
        int leftWall = appleTree + getRandomInt(1, 11);
        int rightWall = leftWall + getRandomInt(1, 11);
        int orangeTree = rightWall + getRandomInt(1, 11);

        logger.info("Apple tree is at {}. Orange tree is at {}. House walls are at {} - {}", appleTree, orangeTree, leftWall, rightWall);

        int countApples = 0;
        int countOranges = 0;

        for (int i = 0; i < 10; i++) {
            int applePosition = getRandomInt(appleTree, rightWall +1);
            int orangePosition = getRandomInt(leftWall, orangeTree + 1);
            if (isFruitInTheHouse(appleTree, applePosition, leftWall, rightWall, Tree.APPLE)) {
                logger.info("Apple fruit felt at {} which in between {} and {}.", applePosition, leftWall, rightWall);
                countApples++;
            }
            if (isFruitInTheHouse(orangeTree, orangePosition, leftWall, rightWall, Tree.ORANGE)) {
                logger.info("Orange fruit felt at {} which in between {} and {}.", orangePosition, leftWall, rightWall);
                countOranges++;
            }
        }

        logger.info("{} apples felt inside the house", countApples);
        logger.info("{} oranges felt inside the house", countOranges);

    }

    private int getRandomInt(int origin, int bound) {
        return new Random().nextInt(origin, bound);
    }

    @VisibleForTesting
    private boolean isFruitInTheHouse(int treePosition, int fruitPosition, int leftWall, int rightWall, Tree tree) {

        ValueRange range = ValueRange.of(leftWall, rightWall);

        return range.isValidIntValue(fruitPosition);
    }

    public enum Tree {
        ORANGE, APPLE;
    }
}
