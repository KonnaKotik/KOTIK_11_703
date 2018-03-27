package ru.itis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compiler {

    public  void analyse(String input) {

        char[] charArray = input.toCharArray();
        int current = 0;
        int state = 0;

        while (current < charArray.length) {
            switch (state) {
                case 0:
                    if (Character.isLetter(charArray[current])) {
                        state = 1;
                        current++;
                    } else throw new SyntaxException("Syntax broken");
                    break;
                case 1:
                    if (Character.isDigit(charArray[current])) {
                        current++;
                        break;
                    } else if (charArray[current] == ':') {
                        state = 2;
                        current++;
                    } else if (charArray[current] == '+' || charArray[current] == '-' || charArray[current] == '*') {
                        state = 0;
                        current++;
                    } else if (charArray[current] == ';') {
                        current++;
                        state = 0;
                    } else throw new SyntaxException("Syntax broken");
                    break;
                case 2:
                    if (charArray[current] == '=') {
                        state = 3;
                        current++;
                    } else throw new SyntaxException("Syntax broken");
                    break;
                case 3:
                    if (Character.isDigit(charArray[current])) {
                        current++;
                        break;
                    } else if (charArray[current] == ';') {
                        current++;
                        state = 0;
                    } else if (Character.isLetter(charArray[current])) {
                        current++;
                        state = 1;
                    } else throw new SyntaxException("Syntax broken");
                    break;
            }
        }
    }

    public  List<Variable> process(String input) throws InitializeException {
        Map<String, Integer> hashMap = new HashMap<>();
        ArrayList<Variable> arrayList = new ArrayList<>();
        String[] string = input.split(";");

        for (int i = 0; i < string.length; i++) {
            String[] str = string[i].split(":=");
            String name = str[0];
            String stringValue = str[1];
            int value = 0;
            if (Character.isDigit(stringValue.charAt(0))) {
                value = Integer.parseInt(stringValue);
            } else if (stringValue.indexOf("+") > 0) {
                String[] variable = stringValue.split("\\+");
                if (!hashMap.containsKey(variable[0]) || !hashMap.containsKey(variable[1]))
                    throw new InitializeException("Error in initialization of the variable");
                value = hashMap.get(variable[0]) + hashMap.get(variable[1]);
            } else if (stringValue.indexOf("-") > 0) {
                String[] variable = stringValue.split("-");
                if (!hashMap.containsKey(variable[0]) || !hashMap.containsKey(variable[1]))
                    throw new InitializeException("Error in initialization of the variable");
                value = hashMap.get(variable[0]) - hashMap.get(variable[1]);
            } else if (stringValue.indexOf("*") > 0) {
                String[] variable = stringValue.split("\\*");
                if (!hashMap.containsKey(variable[0]) || !hashMap.containsKey(variable[1]))
                    throw new InitializeException("Error in initialization of the variable");
                value = hashMap.get(variable[0]) * hashMap.get(variable[1]);
            } else if (Character.isLetter(stringValue.charAt(0))){
                value = hashMap.get(stringValue);
            }
            hashMap.put(name, value);
            Variable variable = new Variable(name, value);
            arrayList.add(variable);
        }
        return arrayList;
    }
}
