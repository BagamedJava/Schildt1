package Chapter7;

public class Sup {
    // Демонстрация динамической диспетчеризации методов
    void who() {
        System.out.println("who() in  Sup");
    }
}

class Sub1 extends Sup {

    void who() {
        System.out.println("who() in Sub1");
    }
}

class Sub2 extends Sup {
    void who() {
        System.out.println("who() in Sub2");
    }
}

class DynDispDemo {
    public static void main(String[] args) {
        Sup superob = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRef;

        /*
        Далее в каждом из этих вызовов выбор версии метода who() осуществляется по типу объекта,
        на который указывает ссылка во время выполнения.
        На этапе выполнения программы версия переопрделенного метода выбирается в зависимости от типа объекта ссылки
         */

        supRef = superob;
        supRef.who();
        supRef = subOb1;
        supRef.who();
        supRef = subOb2;
        supRef.who();
    }
}