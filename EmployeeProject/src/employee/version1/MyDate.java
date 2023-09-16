package employee.version1;


public class MyDate {

    private int year;
    private int month;
    private int day;

    // Default constructor
    public MyDate() {
        year = 0;
        month = 0;
        day = 0;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Method to display the date
    public void displayDate() {
        System.out.println(year + "-" + month + "-" + day);
    }

    public String displayDateToString() {
    return year + "-" + month + "-" + day;
}
}