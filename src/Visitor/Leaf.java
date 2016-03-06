package Visitor;

public class Leaf extends Component{

    private String name;
    
    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        //System.out.println("Leafがvisitorを受け入れました");
        visitor.visit(this);
    }
}
