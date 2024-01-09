package com.pabloesanabriaq.practicalunittesting.services.unit3;

import com.pabloesanabriaq.practicalunittesting.exceptions.InvalidStringException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StringReverseService {
    public String run(String s) throws InvalidStringException {
        if(s == null) throw new InvalidStringException(s);
        List<String> tempArray = new ArrayList<String>(s.length());
        for (int i = 0; i < s.length(); i++) {
            tempArray.add(s.substring(i, i+1));
        }
        StringBuilder reversedString = new StringBuilder(s.length());
        for (int i = tempArray.size() -1; i >= 0; i--) {
            reversedString.append(tempArray.get(i));
        }
        return reversedString.toString();
    }

}
