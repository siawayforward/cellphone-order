package ExamCellphoneOrder;
/**
 * This exception is thrown when the optional fee is incorrect.
 * @author Han-fen Hu
 * Date: 2018-05-04 May the force be with you
 *
 */
public class InvalidOptionalFee extends Exception {
	public InvalidOptionalFee(){
		super("The fee for the optional service should be greater than or equal to 0.");
	}

}
