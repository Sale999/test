package javakurs.calculator;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
//import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named //cdi
//@ManagedBean //jsf managed bean
//@RequestScoped
@SessionScoped
//@javax.faces.bean.RequestScoped
public class CalculatorBean implements Serializable {
	
	private static final Logger logger = LoggerFactory.getLogger(CalculatorBean.class);
	
	private double first;
	
	private double second;
	
	private double result;
	
	public CalculatorBean() {
		
		logger.info("CalculatorBean consturcted!");
		
	}

	public double getFirst() {
		return first;
	}

	public void setFirst(double first) {
		this.first = first;
	}

	public double getSecond() {
		return second;
	}

	public void setSecond(double second) {
		this.second = second;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public String add() {
		logger.info("Add method called.!");
		result = first + second;
		return "";
	}
	
	public String sub() {
		logger.info("Sub method called.!");
		result = first - second;
		return "";
	}
	
	public String mul() {
		logger.info("Multiply method called.!");
		result = first * second;
		return "";
	}
	
	public String divide() {
		logger.info("Divide method called.!");
		result = first / second;
		return "";
	}

}
