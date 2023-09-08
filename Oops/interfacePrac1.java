// example of simple interface related program. 
package Oops;

public class interfacePrac1 {
    public static void main(String args[]){
    // Intel
    Intel i = new Intel();
    i.processorName();
    
    // AMD
    AMD r = new AMD();
    r .processorName();
    
    // Apple
    Apple a = new Apple();
    a.processorName();

    // Samsung
    Samsung s = new Samsung();
    s.processorName();
    
    // Qualcomm
    Qualcomm q = new Qualcomm();
    q.processorName();
    
    // 
    Mediatek m = new Mediatek();
    m.processorName();
    
    // Google
    Google g = new Google();
    g.processorName();
    
    // UniSoc
    UniSoc u = new UniSoc();
    u.processorName();
    }
}

interface ChipCompany{
    void processorName();  // by default public and abstract so no implementation.
}
// inheriting classes
class Intel implements ChipCompany {
    public void processorName(){
        System.out.println("Intel i series processors");
    }
}
class AMD implements ChipCompany {
    public void processorName(){
        System.out.println("AMD Ryzen series processors");
    }
}
class Apple implements ChipCompany {
    public void processorName(){
        System.out.println("Apple Bionic A and M series processors");
    }
}
class Samsung implements ChipCompany {
    public void processorName(){
        System.out.println("Samsung Exynos series processors");
    }
}
class Qualcomm implements ChipCompany {
    public void processorName(){
        System.out.println("Qualcomm Snapdragon series processors");
    }
}
class Mediatek implements ChipCompany {
    public void processorName(){
        System.out.println("Mediatek Dimensity series processors");
    }
}
class Google implements ChipCompany {
    public void processorName(){
        System.out.println("Google Tensor G series processors");
    }
}
class UniSoc implements ChipCompany {
    public void processorName(){
        System.out.println("UniSoc T series processors");
    }
}

