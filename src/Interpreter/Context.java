/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

import java.util.StringTokenizer;

/**
 *
 * @author kinopp
 */
public class Context {
    private StringTokenizer tokens;
    private String currentToken;
    public Context(String source){
	tokens = new StringTokenizer(source);
	nextToken();
    }

    public String getToken(){
	return currentToken;
    }

    public void nextToken(){
	String token = null;
	if( !isEnd() ){
	    token = tokens.nextToken(); // 標準の .nextToken() を呼び出す
	}
	currentToken = token;
    }

    public boolean isEnd(){
	return !tokens.hasMoreElements();
    }
}
