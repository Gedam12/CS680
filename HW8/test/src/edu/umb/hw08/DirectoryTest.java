package edu.umb.cs680.hw08;

import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.format.DateTimeFormatter;

public class DirectoryTest {
    public static String[] dirToStringArray(Link L){

        String LinkInfo[] = {
                Boolean.toString(L.isLink()), L.getName(), Integer.toString(L.getSize()), L.getTime(), L.getTarget().getName(), Integer.toString(L.getTargetSize()), Integer.toString(L.getTarget().getSize())};
        int i;

        for(i=0;i<LinkInfo.length;i++)
        {
            System.out.println(LinkInfo[i]);
        }
        return LinkInfo;
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
    Link y=new Link(home,"link:y",0,creationtime1,system);
    Link z=new Link(pictures,"link:z",0,creationtime1,filee);
    Link x=new Link(pictures,"link:x",0,creationtime1,filef);


    @Test
    public void verifyDirectoryEqualityLinky() {
        String[] expected={"true","link:y","0",time,"system","3","3"};
        assertArrayEquals(expected,dirToStringArray(y));
    }

    @Test
    public void verifyDirectoryEqualityLinkz() {
        String[] expected={"true","link:z","0",time,"file:e","1","1"};
        assertArrayEquals(expected,dirToStringArray(z));
    }

}
