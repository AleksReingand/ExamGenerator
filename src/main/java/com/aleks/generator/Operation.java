package com.aleks.generator;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Operation
{
  PLUS("+"), MINUS("-"), MULTIPLY("*"), DIVIDE("/");

  private final String operand;

  public String getOperand()
  {
    return operand;
  }
}
