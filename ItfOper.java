package pa.calc;

public interface ItfOper {
	public double oper(double op1, double op2);
        default double oper2(double op1,double op2){
           return op1%op2; 
       }
           
}
