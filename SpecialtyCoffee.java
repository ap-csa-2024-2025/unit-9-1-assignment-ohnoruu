public class SpecialtyCoffee extends Coffee{
private String flavor; 

public SpecialtyCoffee(){
    super("small", false, 1, "latte");
    flavor = "Vanilla";
}

public SpecialtyCoffee(String size, String type, String flavor){
    super(size, false, 1, "latte");
    this.flavor = flavor;
}

public SpecialtyCoffee(String size, boolean isSkinny, int shots, String type, String flavor){
    super(size, isSkinny, shots, type);
    this.flavor = flavor;
}

public String toString(){
    String s = "";
    if (super.isSkinny)
    s += " skinny";
    return s + " " + super.shots + "-shot " + super.type + "with " + super.flavor;
}
}