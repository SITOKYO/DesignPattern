/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

/**
 *
 * @author kinopp
 */
public class TerminalExpression extends AbstractExpression{
    private String saveToken;
    
    public int Interpret(Context context){
	String token = context.getToken();
	saveToken = token;
	context.nextToken();
	return Integer.parseInt(token);
    }

    public String toString(){
	return saveToken;
    }
}
