/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kinopp
 */
public class NonterminalExpression extends AbstractExpression{
    private int resultValue;
    private String startTagPlus = "<%>";
    private String endTagPlus = "</%>";
    private List<AbstractExpression> list = new ArrayList<AbstractExpression>();

    public int Interpret(Context context){
	AbstractExpression childExpressions;
	context.nextToken();
	String token = "";
	while(!context.isEnd()){
	    token = context.getToken();
	    if(startTagPlus.equals(token)){
		childExpressions = new NonterminalExpression();
	    }else if(endTagPlus.equals(token)){
		context.nextToken();
		break;
	    }else{
		childExpressions = new TerminalExpression();
	    }
	    resultValue += childExpressions.Interpret(context);
	    list.add(childExpressions);
	}
	return resultValue;
    }

    public String toString(){
	return "+" + list.toString();
    }
}
