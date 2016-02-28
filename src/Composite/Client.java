/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author kinopp
 */
public class Client {
    public static void main(String... args){
        //rootディレクトリ作成
        Node rootdir = new Node("rootdir");
        //tmpディレクトリ作成し、file1,file2を作成
        Node tmpdir = new Node("tmpdir");
        Leaf file1 = new Leaf("file1");
        Leaf file2 = new Leaf("file2");
        tmpdir.add(file1);
        tmpdir.add(file2);
        //rootディレクトリの直下にtmpディレクトリを置く
        rootdir.add(tmpdir);
        
        //usrディレクトリ作成し、file3,file4を作成
        Node usrdir = new Node("usrdir");
        Leaf file3 = new Leaf("file3");
        Leaf file4 = new Leaf("file4");
        usrdir.add(file3);
        usrdir.add(file4);
        //rootディレクトリの直下にusrディレクトリを置く
        rootdir.add(usrdir);
        
        //rootディレクトリの配下のNode,Leafを全て表示
        rootdir.printList();
    }
}
