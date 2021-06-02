public class Keyboard {
    private static KeyBoardType type;
    private static String lighting;
    private static int weight;

    public Keyboard(KeyBoardType keyBoardType, KeyBoardLighting keyBoardLighting){
        switch (keyBoardType){
            case SLIM:
                type=keyBoardType;
                weight = 400;
                break;
            case CLASSIC:
                type = keyBoardType;
                weight = 500;
                break;
        }
        lighting=keyBoardLighting.getName();
    }

    public static int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Клавиатура " + type.getName() +
                 "\nНаличие подсветки в клавиатуре - " + lighting +
                "\nВес клавиатуры равен "+ getWeight() + " грамм";
    }
}
