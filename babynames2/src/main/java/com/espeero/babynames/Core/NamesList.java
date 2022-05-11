package com.espeero.babynames.Core;

import com.espeero.babynames.Core.exceptions.MaxAllowedCountOfRequestedNamesExceededException;
import java.security.SecureRandom;
import java.util.*;

public class NamesList {

    private static final Set<String> names =
            new HashSet<>(
                    List.of(
                            "Mona",
                            "Amir",
                            "Sarah",
                            "Khashayar",
                            "Sarvenaz",
                            "Nima",
                            "Farzaneh",
                            "Mohammad",
                            "Afsaneh",
                            "Shahab",
                            "Fariba",
                            "Shayan",
                            "Raha",
                            "Nader",
                            "Sepideh",
                            "Ali",
                            "Mitra",
                            "Bahram",
                            "Arezoo",
                            "Pedram"
                    )
            );

    private static final int totalCountOfNamesAvailable = names.size();

    public static Set<String> getNames(int count) throws Exception {
        if(count > totalCountOfNamesAvailable)
            throw new MaxAllowedCountOfRequestedNamesExceededException(totalCountOfNamesAvailable);
        if(count < 1)
            throw new Exception("Value of parameter count cannot be less than 1");
        final SecureRandom randomIndexGenerator = new SecureRandom();
        final Set<String> randomNamesSelected = new HashSet<>();
        do {
            final int randomIndex = randomIndexGenerator.nextInt(totalCountOfNamesAvailable);
            final String randomName = names.toArray(new String[totalCountOfNamesAvailable])[randomIndex];
            randomNamesSelected.add(randomName);
        } while(randomNamesSelected.size() < count);
        return randomNamesSelected;
    }

}
