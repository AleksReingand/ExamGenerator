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
  private int x;
  private int y;
  private String result;
  private Operation operand;

}
