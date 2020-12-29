package com.aleks.generator.generators;

import com.aleks.generator.Exercise;
import com.aleks.generator.Operation;

import java.util.Random;

public class MinusSecondDegreeExerciseGenerator implements ExerciseGenerators
{
  Random random = new Random();
  @Override
  public Exercise generate()
  {
    int x = random.nextInt(1000);
    int y = random.nextInt(x);

    return Exercise.builder()
            .x(x)
            .y(y)
            .operand(Operation.MINUS)
            .result(x - y)
            .build();
  }
}
