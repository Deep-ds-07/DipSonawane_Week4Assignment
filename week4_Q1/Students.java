package week4_Q1;
public class Students {
    private String name;
    private int rollNumber;

    public Students(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return String.format("| %-10d | %-18s |", rollNumber, name);
    }

	public void setName(String newName) {
		
	}

	public void setRollNumber(int newRollNumber) {
		
	}
}
