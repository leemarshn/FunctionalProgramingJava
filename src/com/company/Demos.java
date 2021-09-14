package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Demos {
    public static void main(String[] args) throws IOException {








        /**
         * Troubleshoot this code
         * and return the average of the given stream
         * time:25sec
         */


//        var files = Path.of("src/files");
//        var sonnet = files.resolve("Sonnet.txt");
//        var	formerSonnet	=	Path.of("src/com/company/Sonnetl.txt");
//
//        Files.createDirectories(files);
//        Files.copy(formerSonnet, sonnet);
//        try(var reader = Files.newBufferedReader(sonnet)) {
//            String currentLine;
//            while ((currentLine = reader.readLine()) != null){
//                System.out.println(currentLine);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


       // System.out.print(Files.isRegularFile(Paths.get("src/files/Sonnet.txt")));


        var	list	=	new	ArrayList<String>();
        list.add("Smokey");
        list.add("Yogi");

        var	path	=	Path.of("/animals/bear.txt");
        try	(var	writer	=	Files.newBufferedWriter(path))	{
            for(var	line	:	list)	{
                writer.write(line);
                writer.newLine();
            }
        }


    }
}
