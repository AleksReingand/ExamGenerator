package com.aleks.generator.generators;

import com.aleks.generator.Exercise;
import com.aleks.generator.Operation;
import com.aleks.generator.assistances.StandardForTwoNumbersAssistance;

public class MultiplySecondDegreeExerciseGenerators implements ExerciseGenerators
{
  @Override
  public Exercise generate()
  {
    Exercise exercise = new StandardForTwoNumbersAssistance().assistance(0, 100);
    exercise.setOperand(Operation.MULTIPLY);
    exercise.setResult(exercise.getX() * exercise.getY());
    return exercise;
  }
}
