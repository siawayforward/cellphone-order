package ExamCellphoneOrder;

/**
 * This exception is thrown when the plan fee is incorrect.
 * @author Han-fen Hu
 * Date: 2018-05-04 May the force be with you
 *
 */
public class InvalidPlanFee extends Exception {
	public InvalidPlanFee(){
		super("Invalid plan fee. The plan should be greater than 0.");
	}

}
