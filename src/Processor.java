public class Processor {

    private static int weight;
    private static int frequency;
    private static int coreCount;
    private static String vendor;

    public Processor(ProcessorType type, CoreQuantity coreQuantity, CoreFrequency frequency ){
        vendor = type.getName();

        switch (coreQuantity){
            case TWO:{
                weight = 100;
                break;
            }
            case FOUR:{
                weight = 150;
                break;
            }
            case EIGHT:{
                weight = 200;
                break;
            }
        }
        coreCount= coreQuantity.getQuantity();
        Processor.frequency = frequency.getFrequency();
    }

    public static int getWeight(){
        return weight;
    }


    public String toString(){
        return "Процессор- "+ vendor +
                " с частотой "+frequency +"Ghz"+
                " с "+ coreCount+" ядрами."+
                "весом "+ getWeight()+" грамм. ";
    }

}
