public class Faculty extends Employee {
    String researchArea;
    String officeHours;

    public Faculty(String name, String id, double salary, String department, String jobTitle,
                   String researchArea, String officeHours) {
        super(name, id, salary, department, jobTitle);
        this.researchArea = researchArea;
        this.officeHours = officeHours;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }


    @Override
    public String toString() {
        return  "{" +
                "\nName = " + name +
                "\nID = " + id +
                "\nSalary = " + salary +
                "\nDepartment = " + department +
                "\nJob Title = " + jobTitle +
                "\nResearch Area = " + researchArea +
                "\nOffice Hours = " + officeHours +
                "\n}";
    }

}