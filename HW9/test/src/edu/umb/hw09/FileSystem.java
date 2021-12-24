package edu.umb.cs680.hw09;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FileSystemTest {


    @Test
    public void Roottest() {
        FileSystem fsystem = FileSystem.getInstance();
        ApfsDirectory root = fsystem.getRootDir();
        ApfsDirectory expected = root.getParent();
        ApfsDirectory actual = null;
        assertEquals(actual, (expected));
    }
    @Test
    public void fstest() {
        FileSystem fsystem2 = FileSystem.getInstance();


        assertEquals(fsystem2.hashCode(), (fsystem2.hashCode()));
    }
}
