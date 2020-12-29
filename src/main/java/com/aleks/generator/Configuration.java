package com.aleks.generator;

import com.aleks.generator.generators.MinusSecondDegreeExerciseGenerator;
import com.aleks.generator.generators.MultiplySecondDegreeExerciseGenerators;
import com.aleks.generator.generators.SummarySecondDegreeExerciseGenerator;

import java.util.List;

public class Configuration
{
  public static void main(String[] args)
  {
    Generator generator = new Generator(List.of(
            new SummarySecondDegreeExerciseGenerator(),
            new MultiplySecondDegreeExerciseGenerators(),
            new MinusSecondDegreeExerciseGenerator()));

    List<Exercise> list = generator.generate(15);
    list.forEach(System.out::println);
  }
}
