class Cpu{
    int price=100000;
    class Processor{
        int core =9;
        String manufacturer="Intel";
        static class Ram{
            int memory = 512;
            String manufacturerr ="corsair";
            
        }
    } 
}
public class Cpuu{
    public static void main(String[] args){
        Cpu x =new Cpu();
        Cpu.Processor y =x.new Processor();
        Cpu.Processor.Ram z =  new Cpu.Processor.Ram();

        System.out.println(" Details : Price : "+ x.price);
        System.out.println(" Core of Processor :"+y.core+"  Manufacturer : "+y.manufacturer);
        System.out.println("Memory of ram : "+z.memory+" Manufacturer of memory :"+z.manufacturerr);
    }
}