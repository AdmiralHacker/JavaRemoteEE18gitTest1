package patterns.structural.adapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
        testObjectAdapter();
    }

    private static void testObjectAdapter(){
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(socketAdapter,3);
        Volt v12= getVolt(socketAdapter,12);
        Volt v120=getVolt(socketAdapter,120);
        System.out.println("V3  volts using Object adapter"+v3.getVolt());
        System.out.println("V12 volts using Object adapter"+v12.getVolt());
        System.out.println("V120 volts using Object adapter"+v120.getVolt());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case 3:
                return socketAdapter.get3Volt();

            case 12:
                return socketAdapter.get12Volt();

            case 120:
                return socketAdapter.get120Volt();

            default:
                return socketAdapter.get120Volt();

        }
    }


}
