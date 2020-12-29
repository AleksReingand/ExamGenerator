package com.aleks.generator.generators;

import com.aleks.generator.Exercise;
import com.aleks.generator.Operation;
import com.aleks.generator.assistances.StandardForTwoNumbersAssistance;

public class SummarySecondDegreeExerciseGenerator implements ExerciseGenerators
{
  public Exercise generate()
  {
    Exercise exercise = new StandardForTwoNumbersAssistance().assistance(0, 100);
    exercise.setOperand(Operation.PLUS);
    exercise.setResult(exercise.getX() + exercise.getY());

    return exercise;
  }
}
