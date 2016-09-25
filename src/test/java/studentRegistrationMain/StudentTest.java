package studentRegistrationMain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void addStudentTest() {
        Student s = new Student("Joe", "Bloggs", "13123456", "12/12/1995", 20);
        
        assertEquals("JoeBloggs20", s.getUsername());
    }
    
}
