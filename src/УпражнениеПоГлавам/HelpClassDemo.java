package УпражнениеПоГлавам;

import java.io.IOException;

public class HelpClassDemo {
    void helpon(int what){
        switch (what){
            case '1':
                System.out.println("Инструкция if: ");
                System.out.println("if (условие) инструция;");
                System.out.println("else инструкция;");
                break;
            case '2':
                System.out.println("Инструкция for: ");
                System.out.println("for(инициализация;условие;итерация) инструкция;");
                break;
            case '3':
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) { ");
                System.out.println(" case константа: ");
                System.out.println(" последовательность инструкций");
                System.out.println("break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '4':
                System.out.println("Цикл while:\n");
                System.out.println("while(условие)инструкция");
                break;
            case '5':
                System.out.println("Цикл do-while:\n");
                System.out.println("do{");
                System.out.println(" инструкция;");
                System.out.println("} while(условие)");
                break;
            case '6':
                System.out.println("Инструкция break: \n");
                System.out.println("break; или break метка;");
                break;
            case '7':
                System.out.println("Инструкция continue:\n");
                System.out.println("continue; или continue метка;");
                break;
            case '8':
                System.out.println("Инструкция for-each:\n");
                System.out.println("for(тип итер_пер : коллекция) блок_инструкций");
        }
        System.out.println();
    }
    void showmenu(){
        System.out.println("Справка:");
        System.out.println(" 1. if");
        System.out.println(" 2. for");
        System.out.println(" 3. switch");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue");
        System.out.println(" 8. for-each\n");
        System.out.print("Выберите (q - выход) : ");
    }
    boolean isvalid(int ch){
        if (ch<'1'|ch>'8'&ch!='q') return false;
        else return true;
    }

}
class HelpDemo{
    public static void main(String[] args) throws IOException {
        HelpClassDemo hlpobj = new HelpClassDemo();
        char choice,ignore;

        for (;;){
            do {
                hlpobj.showmenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                }while (ignore != '\n');
            } while (!hlpobj.isvalid(choice));
            if (choice =='q') break;
            System.out.println("\n");
            hlpobj.helpon(choice);
        }
    }
}
