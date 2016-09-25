package studentRegistrationMain;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class Course {

    private String name;
    private ArrayList<Module> modules;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String name, ArrayList<Module> modules, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.modules = modules;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addModule(Module m) {
        modules.add(m);
    }
    
    public void removeModule(Module m) {
        modules.remove(m);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

}
