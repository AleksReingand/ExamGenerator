package com.aleks.generator;

import com.aleks.generator.generators.ExerciseGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator
{
  Random random = new Random();
  List<ExerciseGenerators> exerciseGenerators;

  public Generator(List<ExerciseGenerators> exerciseGenerators)
  {
    this.exerciseGenerators = exerciseGenerators;
  }

  public List<Exercise> generate (int amount)
  {
    List<Exercise> exercises = new ArrayList<Exercise>();
    for(int i = 0; i < amount; i++)
    {
      exercises.add(exerciseGenerators.get(random.nextInt(exerciseGenerators.size())).generate());
    }

    return exercises;
  }
}
