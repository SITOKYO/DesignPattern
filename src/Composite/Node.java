/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kinopp
 */
public class Node extends Composite{

    private String name;
    private List<Composite> composites = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }
    
    @Override
    public void add(Composite composite){
        composites.add(composite);
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printList() {
        System.out.println(this.getName());
        // 配下のNode及びLeafを全て表示
        for(Composite composite: composites){
            composite.printList();
        }
    }
}
