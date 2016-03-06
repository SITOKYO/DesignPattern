/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility;

/**
 *
 * @author kinopp
 */
public class Client {
    public static void main(String... args){
        Solver levelOneSolver = new LevelOneSolver("Ichiro");
        Solver levelTwoSolver = new LevelTwoSolver("Jiro");
        Solver levelThreeSolver = new LevelThreeSolver("Saburo");
        
        // チェーンの形成
        levelOneSolver.setNext(levelTwoSolver).setNext(levelThreeSolver);
        
        levelOneSolver.support(1);
        levelOneSolver.support(2);
        levelOneSolver.support(3);
        levelOneSolver.support(4);
    }
}
