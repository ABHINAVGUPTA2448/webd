class Student {
    private int rollNo;
    private String name;
    private double gpa;

    // Parameterized constructor
    public Student(int rollNo, String name, double gpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.gpa = gpa;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }

    public static void main(String[] args) {
        
        Student student = new Student(34, "Abhinav Gupta", 8.8);
      

        
        System.out.println("=== Student Information ===");
        student.displayInfo();
        
    }
}