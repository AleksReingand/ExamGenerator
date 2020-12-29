package com.aleks.generator.assistances;

import com.aleks.generator.Exercise;
import com.aleks.generator.Operation;
import com.aleks.generator.assistances.Assistance;

import java.util.Random;

public class StandardForTwoNumbersAssistance implements Assistance
{
  Random random = new Random();
  @Override
  public Exercise assistance(int min, int max)
  {
    double x = random.nextInt(max);
    double y = random.nextInt(max);

    return Exercise.builder()
            .x(x)
            .y(y)
            .build();
  }
}
