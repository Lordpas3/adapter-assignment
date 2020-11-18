package com.hz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// "true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"
//            System.out.println(line);
//            System.out.println(correctAnswers[i]);

public class Adapter extends ConsoleReader {

    String line;

    @Override
    public String readLine() {
        try{
            line = (new BufferedReader(
                    new InputStreamReader(System.in))
            ).readLine();

            return line;
        }
        catch(IOException ex) {
            return "Gibberish input detected";
        }
    }

    String[] correctAnswers = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};

    public boolean check(){
        int check = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equals(line)) {
                check = check +1;
            }
        }
        if (check == 1) {
            return true;
        } else {
            return false;
        }
    }
}
