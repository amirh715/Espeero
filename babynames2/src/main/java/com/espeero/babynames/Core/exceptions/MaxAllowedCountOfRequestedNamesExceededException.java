package com.espeero.babynames.Core.exceptions;

public class MaxAllowedCountOfRequestedNamesExceededException extends IllegalArgumentException {

    public MaxAllowedCountOfRequestedNamesExceededException() {
        super("Value of parameter count cannot exceed max limit");
    }

    public MaxAllowedCountOfRequestedNamesExceededException(int maxAllowedLimit) {
        super("Value of parameter count cannot exceed " + maxAllowedLimit);
    }

    public MaxAllowedCountOfRequestedNamesExceededException(String message) {
        super(message);
    }

}
