package com.aleks.generator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Exercise
{
  private double x;
  private double y;
  private double result;
  private Operation operand;

  @Override
  public String toString()
  {
    return x + " " + operand.getOperand() + " " + y + " = " + result;
  }
}
