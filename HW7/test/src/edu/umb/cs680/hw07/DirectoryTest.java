package edu.umb.cs680.hw07;

import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.format.DateTimeFormatter;

public class DirectoryTest {
    public static String[] dirToStringArray(Directory d){

        String dirInfo[] = {
                Boolean.toString(d.isFile()), d.getName(), Integer.toString(d.getSize()),d.getTime(),Integer.toString(d.countChildren()),Integer.toString(d.getTotalsize())};
        int i;

        for(i=0;i<dirInfo.length;i++)
        {
            System.out.println(dirInfo[i]);
        }
        return dirInfo;
    }
    LocalDateTime creationtime=LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:MM");
    String time=creationtime.format(formatter);

    LocalDateTime creationtime1=LocalDateTime.now();
    Directory root=new Directory(null,"Root",0,creationtime );


    LocalDateTime creationtime2=LocalDateTime.now();
    Directory home=new Directory(root,"home",0,creationtime1 );
    Directory system=new Directory(root,"system",0,creationtime1 );
    Directory pictures=new Directory(home,"pictures",0,creationtime1 );
    File filea=new File(home,"file:a",1,creationtime2 );
    File fileb=new File(system,"file:b",1,creationtime2 );
    File filec=new File(system,"file:c",1,creationtime2 );
    File filed=new File(system,"file:d",1,creationtime2 );
    File filee=new File(pictures,"file:e",1,creationtime2 );
    File filef=new File(pictures,"file:f",1,creationtime2 );
    
    @Test
    public void verifyDirectoryEqualitySystem() {
        String[] expected={"false","system","3",time,"3","3"};

        assertArrayEquals(expected,dirToStringArray(system));
    }
    @Test
    public void verifyDirectoryEqualityRoot() {
        String[] expected={"false","Root","4",time,"2","6"};

        assertArrayEquals(expected,dirToStringArray(root));
    }


    @Test
    public void verifyDirectoryEqualityHome() {
        String[] expected={"false","home","3",time,"2","3"};

        assertArrayEquals(expected,dirToStringArray(home));
    }

}
