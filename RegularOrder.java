package ExamCellphoneOrder;

/**
 * @author Han-fen Hu
 * Date: 2018-05-04 May the force be with you
 * Program purpose: This The class simulates a regular order from a cell phone customer
 */

public class RegularOrder {
	// Fields
	private double planFee; // the cost of the plan
	private double optionalServiceFee; // the cost of the optional service
	
	/**
 	 * The constructor accepts the values for both fields
	 * @param pFee  The cost of the plan
	 * @param oFee The cost of the optional service
	 * @throws InvalidPlanFee When the fee of the plan is not greater than 0.
	 * @throws InvalidOptionalFee When the fee of the optional service is less than 0.
 */
	public RegularOrder(double pFee, double oFee) throws InvalidPlanFee, InvalidOptionalFee {
		if(pFee<=0)
			throw new InvalidPlanFee();
		this.planFee = pFee;
		
		if(oFee <0)
			throw new InvalidOptionalFee();
		this.optionalServiceFee = oFee;
	}
	
	/**
	 * No-arg constructor
	 */
	public RegularOrder(){}

	/**
	 * The method gets the value of the plan fee
	 * @return The cost of the plan
	 */
	public double getPlanFee() {
		return planFee;
	}
	
	/**
	 * The method sets the value of plan fee. 
	 * @param pFee The cost of the plan
	 * @throws InvalidPlanFee When the fee of the plan is not greater than 0.
	 */
	public void setPlanFee(double pFee) throws InvalidPlanFee{
		if(pFee<=0)
			throw new InvalidPlanFee();
		this.planFee = pFee;
	}

	/**
	 * The method gets the value of the fee for optional services
	 * @return The cost of the optional service
	 */
	public double getOptionalServiceFee() {
		return optionalServiceFee;
	}

	/**
	 * The method gets the fee of the optional services
	 * @param oFee The cost of the optional service
	 * @throws InvalidOptionalFee When the fee of the optional service is less than 0.
	 */
	public void setOptionalServiceFee(double oFee) throws InvalidOptionalFee{
		if(oFee <0)
			throw new InvalidOptionalFee();
		this.optionalServiceFee = oFee;
	}
	
	/**
	 * This method calculates the total monthly payment
	 * @return The monthly payment 
	 */
	public double getMonthlyCost(){
		return getPlanFee()+getOptionalServiceFee();
	}
	
	/**
	 * This method returns a string that shows the total monthly fee and the
	 * details of the fees.
	 */
	public String toString(){
		return "The monthly total cost is $"+getMonthlyCost()+", "
		       +"\nincluding the plan fee of $"+planFee
		       +"\nand the optional service fee of $"+optionalServiceFee+".";
	}
}
