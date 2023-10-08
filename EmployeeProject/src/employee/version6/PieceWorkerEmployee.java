package employee.version6;

public class PieceWorkerEmployee extends Employee {
    private float totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {
        super();
    }

    public PieceWorkerEmployee(int empID, String firstName, String lastName, MyDate empDateHired, MyDate empBirthDate,
                               float totalPiecesFinished, float ratePerPiece) {
        super(empID, firstName, lastName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public float getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(float totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    @Override
    public double computeSalary() {
        return totalPiecesFinished * ratePerPiece + (totalPiecesFinished / 100) * ratePerPiece * 10;
    }
}
