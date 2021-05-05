package main;
import counstructor.MainInitializer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
         while(true)
        {
            MainInitializer initializer = new MainInitializer();
            initializer.init();
        }

    }
}
