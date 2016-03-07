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
public class Client {
    public static void main(String[] args){
	
	/*
	  注意: 数字だけなので, 文字列になったら, エラーとなる.
	*/
	String source = "<%> 1 <%> 2 3 4 5 6 <%> 7 8 </%> 9 </%> 10 11 </%>";
	
	
	Context context = new Context(source);
	AbstractExpression expression = new NonterminalExpression();

	System.out.println( expression.Interpret(context) );
	System.out.println( expression.toString() );
    }
}
