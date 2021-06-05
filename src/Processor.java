public class Processor {

    private int weight;
    private final int frequency;
    private final int coreCount;
    private final String vendor;

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
        this.coreCount= coreQuantity.getQuantity();
        this.frequency = frequency.getFrequency();
    }

    public  int getWeight(){
        return weight;
    }


    public String toString(){
        return "Процессор- "+ vendor +
                " с частотой "+frequency +"Ghz"+
                " с "+ coreCount+" ядрами."+
                "весом "+ getWeight()+" грамм. ";
    }

}
