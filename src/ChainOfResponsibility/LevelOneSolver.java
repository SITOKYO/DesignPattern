/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility;

public class LevelOneSolver extends Solver{
    public LevelOneSolver(String solverName) {
        super(solverName);
    }

    @Override
    protected boolean resolve(int problemLevel) {
        return problemLevel <= 1;
    }
}
