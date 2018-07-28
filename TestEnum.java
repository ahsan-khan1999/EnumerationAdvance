import java.util.EnumSet;
public class TestEnum {
    public static void main(String[] args) {

        for(Tuna tuna : Tuna.values())
        System.out.println(tuna.getCalibar()+tuna.getAge()+tuna.name());

            System.out.println("Atfter including the method of range");

    for(Tuna tuna: EnumSet.range(Tuna.muzumil,Tuna.haris)){

        System.out.println(""+tuna.name()+tuna.getCalibar()+tuna.getAge()+"ordinal"+tuna.ordinal());
    }
}}
